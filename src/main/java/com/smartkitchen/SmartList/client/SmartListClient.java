package com.smartkitchen.SmartList.client;

import com.proto.smartlist.*;
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

        String smartlistId = createResponse.getSmartlist().getId();

        System.out.println("Item Found: Reading Smart Item...");

         ReadSmartListResponse readSmartListResponse = smartlistClient.readSmartList(ReadSmartListRequest.newBuilder()
                .setItemId(smartlistId)
                .build());

         System.out.println(readSmartListResponse.toString());

//         ERROR HANDLING - Trigger notfound errror

//        System.out.println("Attempting to read id which does not exist:");
//        ReadSmartListResponse readSmartListResponseNotFound = smartlistClient.readSmartList(ReadSmartListRequest.newBuilder()
//                .setItemId("5e936b9f53f24235dc75e2e6")
//                .build());

    }
}
