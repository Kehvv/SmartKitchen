package com.proto.scale;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: scale/scale.proto")
public final class ScaleServiceGrpc {

  private ScaleServiceGrpc() {}

  public static final String SERVICE_NAME = "scale.ScaleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.scale.ScaleConvertRequest,
      com.proto.scale.ScaleConvertResponse> getScaleConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScaleConvert",
      requestType = com.proto.scale.ScaleConvertRequest.class,
      responseType = com.proto.scale.ScaleConvertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.scale.ScaleConvertRequest,
      com.proto.scale.ScaleConvertResponse> getScaleConvertMethod() {
    io.grpc.MethodDescriptor<com.proto.scale.ScaleConvertRequest, com.proto.scale.ScaleConvertResponse> getScaleConvertMethod;
    if ((getScaleConvertMethod = ScaleServiceGrpc.getScaleConvertMethod) == null) {
      synchronized (ScaleServiceGrpc.class) {
        if ((getScaleConvertMethod = ScaleServiceGrpc.getScaleConvertMethod) == null) {
          ScaleServiceGrpc.getScaleConvertMethod = getScaleConvertMethod =
              io.grpc.MethodDescriptor.<com.proto.scale.ScaleConvertRequest, com.proto.scale.ScaleConvertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScaleConvert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.scale.ScaleConvertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.scale.ScaleConvertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScaleServiceMethodDescriptorSupplier("ScaleConvert"))
              .build();
        }
      }
    }
    return getScaleConvertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScaleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScaleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScaleServiceStub>() {
        @java.lang.Override
        public ScaleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScaleServiceStub(channel, callOptions);
        }
      };
    return ScaleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScaleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScaleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScaleServiceBlockingStub>() {
        @java.lang.Override
        public ScaleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScaleServiceBlockingStub(channel, callOptions);
        }
      };
    return ScaleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScaleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScaleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScaleServiceFutureStub>() {
        @java.lang.Override
        public ScaleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScaleServiceFutureStub(channel, callOptions);
        }
      };
    return ScaleServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ScaleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void scaleConvert(com.proto.scale.ScaleConvertRequest request,
        io.grpc.stub.StreamObserver<com.proto.scale.ScaleConvertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScaleConvertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScaleConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.scale.ScaleConvertRequest,
                com.proto.scale.ScaleConvertResponse>(
                  this, METHODID_SCALE_CONVERT)))
          .build();
    }
  }

  /**
   */
  public static final class ScaleServiceStub extends io.grpc.stub.AbstractAsyncStub<ScaleServiceStub> {
    private ScaleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScaleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScaleServiceStub(channel, callOptions);
    }

    /**
     */
    public void scaleConvert(com.proto.scale.ScaleConvertRequest request,
        io.grpc.stub.StreamObserver<com.proto.scale.ScaleConvertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScaleConvertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScaleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScaleServiceBlockingStub> {
    private ScaleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScaleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScaleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.scale.ScaleConvertResponse scaleConvert(com.proto.scale.ScaleConvertRequest request) {
      return blockingUnaryCall(
          getChannel(), getScaleConvertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScaleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScaleServiceFutureStub> {
    private ScaleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScaleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScaleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.scale.ScaleConvertResponse> scaleConvert(
        com.proto.scale.ScaleConvertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScaleConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCALE_CONVERT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScaleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScaleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCALE_CONVERT:
          serviceImpl.scaleConvert((com.proto.scale.ScaleConvertRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.scale.ScaleConvertResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ScaleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScaleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.scale.Scale.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScaleService");
    }
  }

  private static final class ScaleServiceFileDescriptorSupplier
      extends ScaleServiceBaseDescriptorSupplier {
    ScaleServiceFileDescriptorSupplier() {}
  }

  private static final class ScaleServiceMethodDescriptorSupplier
      extends ScaleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScaleServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ScaleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScaleServiceFileDescriptorSupplier())
              .addMethod(getScaleConvertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
