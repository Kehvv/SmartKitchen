package com.smartkitchen.SmartList.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SmartListServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting Smart Kitchen List Server :)");
        Server server = ServerBuilder.forPort(50052)
                .addService(new SmartListServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down...");
            server.shutdown();
            System.out.println("Successfully stopped smartKitchen List :)");
        }));

        server.awaitTermination();
    }

}