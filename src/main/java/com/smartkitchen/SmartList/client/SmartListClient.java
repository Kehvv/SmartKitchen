package com.smartkitchen.SmartList.client;

import com.proto.smartlist.CreateSmartListRequest;
import com.proto.smartlist.CreateSmartListResponse;
import com.proto.smartlist.SmartListServiceGrpc;
import com.proto.smartlist.Smartlist;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartListClient {
    public static void main(String[] args) {
        System.out.println("Smart Kitchen List client running!");
        SmartListClient main = new SmartListClient();
        main.run();
    }

    private void run(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        SmartListServiceGrpc.SmartListServiceBlockingStub smartlistClient = SmartListServiceGrpc.newBlockingStub(channel);

        Smartlist smartlist = Smartlist.newBuilder()
                .setItem("Milk")
                .setBarcode(1000)
                .setPrice(1.50)
                .build();


        CreateSmartListResponse createResponse = smartlistClient.createSmartList(
                CreateSmartListRequest.newBuilder()
                        .setSmartlist(smartlist)
                        .build()
        );

        System.out.println("Received Create Smart List Item Response:");
        System.out.println(createResponse.toString());
    }
}
