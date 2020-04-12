package com.smartkitchen.scanner.server;

import com.proto.scanner.Scan;
import com.proto.scanner.ScannerRequest;
import com.proto.scanner.ScannerResponse;
import com.proto.scanner.ScannerServiceGrpc;
import com.proto.smartlist.CreateSmartListRequest;
import com.proto.smartlist.CreateSmartListResponse;
import com.proto.smartlist.SmartListServiceGrpc;
import com.proto.smartlist.Smartlist;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ScannerServiceImpl extends ScannerServiceGrpc.ScannerServiceImplBase {

    @Override
    public void scan(ScannerRequest request, StreamObserver<ScannerResponse> responseObserver) {
        Scan scan = request.getScan();
        int barcode = scan.getBarcode();
        String item = scan.getItem();

        String result = "Item " + item + " added to SmartList";

        Smartlist smartlist = Smartlist.newBuilder()
                .setItem(item)
                .setBarcode(3000)
                .setPrice(4.50)
                .build();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054)
                .usePlaintext()
                .build();

        SmartListServiceGrpc.SmartListServiceBlockingStub smartlistClient = SmartListServiceGrpc.newBlockingStub(channel);

        smartlistClient.createSmartList(CreateSmartListRequest.newBuilder()
                        .setSmartlist(smartlist)
                        .build());

        ScannerResponse response = ScannerResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
