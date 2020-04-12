package com.smartkitchen.Scale.client;

import com.proto.scale.ScaleConvertRequest;
import com.proto.scale.ScaleConvertResponse;
import com.proto.scale.ScaleServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ScaleClient {


    public static void main(String[] args) {
        System.out.println("Smart Kitchen scale client running!");
        ScaleClient main = new ScaleClient();
        main.run();
    }

    private void run(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055)
                .usePlaintext()
                .build();


        scaleCall(channel);


        System.out.println("Shutting down cooker...");
        channel.shutdown();

    }

    private void scaleCall(ManagedChannel channel){
        ScaleServiceGrpc.ScaleServiceBlockingStub stub = ScaleServiceGrpc.newBlockingStub(channel);

        ScaleConvertRequest request = ScaleConvertRequest.newBuilder()
                .setWeight(200.00)
                .build();

        ScaleConvertResponse response = stub.scaleConvert(request);

        System.out.println(request.getWeight() + "g converted to cups = " + response.getWeight());

        channel.shutdown();

    }
}
