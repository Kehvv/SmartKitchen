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

    @Override
    public StreamObserver<DistanceRequest> distance(StreamObserver<DistanceResponse> responseObserver) {
        StreamObserver<DistanceRequest> requestObserver = new StreamObserver<DistanceRequest>() {

            String response = "";
            double kM = 0.0;

            @Override
            public void onNext(DistanceRequest value) {
                //this method handles client sending a message
                kM = value.getKilometres();

            }

            @Override
            public void onError(Throwable t) {
                //this method handles client sending an *ERROR*
            }

            @Override
            public void onCompleted() {
                //this method handles when the client is finished and want to return a response

                if ( (kM < 2.0) && (kM > 0) )  {

                    response = "Owner is within " + kM + " Kilometres. Preheating Oven.";


                } else {
                    response = "Owner is within " + kM + " Kilometres. Out of Range.";
                }

                responseObserver.onNext(
                        new DistanceResponse().newBuilder()
                                .setResponse(response)
                                .build()
                );
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
}