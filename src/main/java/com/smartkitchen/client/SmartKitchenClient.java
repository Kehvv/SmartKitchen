package com.smartkitchen.client;

import com.proto.cooker.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class SmartKitchenClient {

    public static void main(String[] args) {
        System.out.println("Smart Kitchen client running!");
        SmartKitchenClient main = new SmartKitchenClient();
        main.run();
    }

    private void run(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

//        cookerCall(channel);
//       donePercentCall(channel);
//       distanceCall(channel);
 //       steakTimeCall(channel);
        smartListCall(channel);


        System.out.println("Shutting down cooker...");
        channel.shutdown();

    }

    private void cookerCall(ManagedChannel channel){

        CookerServiceGrpc.CookerServiceBlockingStub cookerClient = CookerServiceGrpc.newBlockingStub(channel);
        //UNARY
        Cooker cooker = Cooker.newBuilder()
                .setCookTime(20.00)
                .setTemperature(180)
                .setWeight(250.00)
                .build();

        CookerRequest cookerRequest = CookerRequest.newBuilder()
                .setCooker(cooker)
                .build();

        CookerResponse cookerResponse = cookerClient.cooker(cookerRequest);

        System.out.println(cookerResponse.getResult());
    }

    private void donePercentCall(ManagedChannel channel){
        CookerServiceGrpc.CookerServiceBlockingStub cookerClient = CookerServiceGrpc.newBlockingStub(channel);
        //SERVER STREAM
        DonePercentRequest donePercentRequest = DonePercentRequest.newBuilder()
                .setItem("Roast Chicken")
                .build();


        //streaming responses of cook percentage
        cookerClient.donePercent(donePercentRequest)
                .forEachRemaining(DonePercentResponse -> {
                    System.out.println(DonePercentResponse.getPercent());
                });


    }

    private void distanceCall(ManagedChannel channel){

        //CLIENT STREAM
        CookerServiceGrpc.CookerServiceStub asyncClient = CookerServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
       StreamObserver<DistanceRequest> requestObserver = asyncClient.distance(new StreamObserver<DistanceResponse>() {
            @Override
            public void onNext(DistanceResponse value) {
                //response from server
                System.out.println("Received response from SmartKitchen Server.");
                System.out.println(value.getResponse());

            }
            @Override
            public void onError(Throwable t) {
                //error from server
            }
            @Override
            public void onCompleted() {
                //server is finished sending
                System.out.println("SmartKitchen server has finished data transfer");

                latch.countDown();
            }
        });

       for (int i = 10; i >=1; i--){
           System.out.println("Sending distance of " + i + " Kilometres.");
           requestObserver.onNext(DistanceRequest.newBuilder()
                   .setKilometres(i)
                   .build());
       }
       //client finished sending data
        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private void steakTimeCall(ManagedChannel channel){
        CookerServiceGrpc.CookerServiceStub asyncClient = CookerServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<SteakTimeRequest> requestObserver = asyncClient.steakTime(new StreamObserver<SteakTimeResponse>() {
            @Override
            public void onNext(SteakTimeResponse value) {
                System.out.println("Response from server: " +value.getResponse());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
                latch.countDown();
            }
        });

        Arrays.asList("rare", "medium", "rare", "well done").forEach(
               doneness -> requestObserver.onNext(SteakTimeRequest.newBuilder()
                .setDoneness(doneness)
                .build())
        );

        requestObserver.onCompleted();
        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
