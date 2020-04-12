package com.smartkitchen.Scale.server;

import com.smartkitchen.scanner.server.ScannerServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ScaleServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting Smart Kitchen Scale Server :)");
        Server server = ServerBuilder.forPort(50055)
                .addService(new ScaleServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Shutting down...");
            server.shutdown();
            System.out.println("Successfully stopped smartKitchen Scale :)");
        } ));

        server.awaitTermination();
    }

}
