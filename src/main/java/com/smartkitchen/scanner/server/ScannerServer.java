package com.smartkitchen.scanner.server;

import com.smartkitchen.Cooker.server.CookerServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ScannerServer {


    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting Smart Kitchen Scanner Server :)");
        Server server = ServerBuilder.forPort(50053)
                .addService(new ScannerServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Shutting down...");
            server.shutdown();
            System.out.println("Successfully stopped smartKitchen Scanner :)");
        } ));

        server.awaitTermination();
}
}
