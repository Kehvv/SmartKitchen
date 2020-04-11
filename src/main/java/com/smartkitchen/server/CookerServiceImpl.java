package com.smartkitchen.server;

import com.proto.cooker.*;
import io.grpc.stub.StreamObserver;

public class CookerServiceImpl extends CookerServiceGrpc.CookerServiceImplBase {
    @Override
    public void cooker(CookerRequest request, StreamObserver<CookerResponse> responseObserver) {

        //extract information from client

        Cooker cooker = request.getCooker();
        int temp = cooker.getTemperature();
        double time = cooker.getCookTime();
        double weight = cooker.getWeight();
        double newTime = time * (1 + (weight / 100));

        //create smart response

        String result = "Setting Smart Cooker to " + temp + " Degrees for " + newTime + " minutes (Based on weight. Original time = " + time + " minutes)";

        //send response

        CookerResponse response = CookerResponse.newBuilder()
                .setResult(result)
                .build();


        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }

    @Override
    public void donePercent(DonePercentRequest request, StreamObserver<DonePercentResponse> responseObserver) {
        String item = request.getItem();
        try {
            for (int i = 0; i <= 100; i++) {
                String percent = "Food item " + item + " is " + i + " percent cooked.";
                DonePercentResponse response = DonePercentResponse.newBuilder()
                        .setPercent(percent)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(300L);
            }

        }catch (InterruptedException e) {
            responseObserver.onCompleted();
        }
    }
}