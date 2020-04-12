package com.smartkitchen.scanner.client;

import com.proto.scanner.Scan;
import com.proto.scanner.ScannerRequest;
import com.proto.scanner.ScannerResponse;
import com.proto.scanner.ScannerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ScannerClient {

    public static void main(String[] args) {
        System.out.println("Smart Kitchen scanner client running!");
        ScannerClient main = new ScannerClient();
        main.run();
    }

    private void run(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
                .usePlaintext()
                .build();

        scannerCall(channel);


        System.out.println("Shutting down scanner...");
        channel.shutdown();

    }

    private void scannerCall(ManagedChannel channel){

        ScannerServiceGrpc.ScannerServiceBlockingStub scannerClient = ScannerServiceGrpc.newBlockingStub(channel);

        Scan scan = Scan.newBuilder()
                .setBarcode(2000)
                .setItem("Bread")
                .build();

        ScannerRequest scannerRequest = ScannerRequest.newBuilder()
                .setScan(scan)
                .build();

        ScannerResponse scannerResponse = scannerClient.scan(scannerRequest);

        System.out.println(scannerResponse.getResult());
    }


}
