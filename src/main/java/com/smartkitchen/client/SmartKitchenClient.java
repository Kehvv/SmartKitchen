package com.smartkitchen.client;

import com.proto.cooker.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartKitchenClient {
    public static void main(String[] args) {
        System.out.println("Smart Kitchen client running!");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        System.out.println("Creating Stub");

        CookerServiceGrpc.CookerServiceBlockingStub cookerClient = CookerServiceGrpc.newBlockingStub(channel);
//        //UNARY
//        Cooker cooker = Cooker.newBuilder()
//                .setCookTime(20.00)
//                .setTemperature(180)
//                .setWeight(250.00)
//                .build();
//
//        CookerRequest cookerRequest = CookerRequest.newBuilder()
//                .setCooker(cooker)
//                .build();
//
//        CookerResponse cookerResponse = cookerClient.cooker(cookerRequest);
//
//        System.out.println(cookerResponse.getResult());


        DonePercentRequest donePercentRequest = DonePercentRequest.newBuilder()
                .setItem("Roast Chicken")
                .build();


        //streaming responses of cook percentage
        cookerClient.donePercent(donePercentRequest)
                .forEachRemaining(DonePercentResponse -> {
                    System.out.println(DonePercentResponse.getPercent());
                });

        System.out.println("Shutting down cooker...");
        channel.shutdown();

    }
}
