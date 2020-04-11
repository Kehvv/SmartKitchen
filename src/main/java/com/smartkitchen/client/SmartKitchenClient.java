package com.smartkitchen.client;

import com.proto.cooker.Cooker;
import com.proto.cooker.CookerRequest;
import com.proto.cooker.CookerResponse;
import com.proto.cooker.CookerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartKitchenClient {
    public static void main(String[] args) {
        System.out.println("Hello I am a smart kitchen client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        System.out.println("Creating Stub");

        CookerServiceGrpc.CookerServiceBlockingStub cookerClient = CookerServiceGrpc.newBlockingStub(channel);

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
}
