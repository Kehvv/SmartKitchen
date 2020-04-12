package com.smartkitchen.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SmartKitchenServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting Smart Kitchen Server :)");
        Server server = ServerBuilder.forPort(50051)
                .addService(new CookerServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Shutting down...");
            server.shutdown();
            System.out.println("Successfully stopped smartKitchen :)");
        } ));

        server.awaitTermination();
    }

}
