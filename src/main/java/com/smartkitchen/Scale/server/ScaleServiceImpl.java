package com.smartkitchen.Scale.server;

import com.proto.scale.ScaleConvertRequest;
import com.proto.scale.ScaleConvertResponse;
import com.proto.scale.ScaleServiceGrpc;
import io.grpc.stub.StreamObserver;

public class ScaleServiceImpl extends ScaleServiceGrpc.ScaleServiceImplBase {

    @Override
    public void scaleConvert(ScaleConvertRequest request, StreamObserver<ScaleConvertResponse> responseObserver) {
        ScaleConvertResponse scaleConvertResponse = ScaleConvertResponse.newBuilder()
                .setWeight(request.getWeight()*.0042)
                .build();

        responseObserver.onNext(scaleConvertResponse);

        responseObserver.onCompleted();
    }
}
