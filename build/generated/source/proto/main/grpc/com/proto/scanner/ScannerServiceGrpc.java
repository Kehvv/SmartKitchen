package com.proto.scanner;

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
    comments = "Source: scanner/scanner.proto")
public final class ScannerServiceGrpc {

  private ScannerServiceGrpc() {}

  public static final String SERVICE_NAME = "scanner.ScannerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.scanner.ScannerRequest,
      com.proto.scanner.ScannerResponse> getScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Scan",
      requestType = com.proto.scanner.ScannerRequest.class,
      responseType = com.proto.scanner.ScannerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.scanner.ScannerRequest,
      com.proto.scanner.ScannerResponse> getScanMethod() {
    io.grpc.MethodDescriptor<com.proto.scanner.ScannerRequest, com.proto.scanner.ScannerResponse> getScanMethod;
    if ((getScanMethod = ScannerServiceGrpc.getScanMethod) == null) {
      synchronized (ScannerServiceGrpc.class) {
        if ((getScanMethod = ScannerServiceGrpc.getScanMethod) == null) {
          ScannerServiceGrpc.getScanMethod = getScanMethod =
              io.grpc.MethodDescriptor.<com.proto.scanner.ScannerRequest, com.proto.scanner.ScannerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Scan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.scanner.ScannerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.scanner.ScannerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScannerServiceMethodDescriptorSupplier("Scan"))
              .build();
        }
      }
    }
    return getScanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScannerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScannerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScannerServiceStub>() {
        @java.lang.Override
        public ScannerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScannerServiceStub(channel, callOptions);
        }
      };
    return ScannerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScannerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScannerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScannerServiceBlockingStub>() {
        @java.lang.Override
        public ScannerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScannerServiceBlockingStub(channel, callOptions);
        }
      };
    return ScannerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScannerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScannerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScannerServiceFutureStub>() {
        @java.lang.Override
        public ScannerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScannerServiceFutureStub(channel, callOptions);
        }
      };
    return ScannerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ScannerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void scan(com.proto.scanner.ScannerRequest request,
        io.grpc.stub.StreamObserver<com.proto.scanner.ScannerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScanMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.scanner.ScannerRequest,
                com.proto.scanner.ScannerResponse>(
                  this, METHODID_SCAN)))
          .build();
    }
  }

  /**
   */
  public static final class ScannerServiceStub extends io.grpc.stub.AbstractAsyncStub<ScannerServiceStub> {
    private ScannerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScannerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScannerServiceStub(channel, callOptions);
    }

    /**
     */
    public void scan(com.proto.scanner.ScannerRequest request,
        io.grpc.stub.StreamObserver<com.proto.scanner.ScannerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScannerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScannerServiceBlockingStub> {
    private ScannerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScannerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScannerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.scanner.ScannerResponse scan(com.proto.scanner.ScannerRequest request) {
      return blockingUnaryCall(
          getChannel(), getScanMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScannerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScannerServiceFutureStub> {
    private ScannerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScannerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScannerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.scanner.ScannerResponse> scan(
        com.proto.scanner.ScannerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScanMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCAN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScannerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScannerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCAN:
          serviceImpl.scan((com.proto.scanner.ScannerRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.scanner.ScannerResponse>) responseObserver);
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

  private static abstract class ScannerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScannerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.scanner.Scanner.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScannerService");
    }
  }

  private static final class ScannerServiceFileDescriptorSupplier
      extends ScannerServiceBaseDescriptorSupplier {
    ScannerServiceFileDescriptorSupplier() {}
  }

  private static final class ScannerServiceMethodDescriptorSupplier
      extends ScannerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScannerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScannerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScannerServiceFileDescriptorSupplier())
              .addMethod(getScanMethod())
              .build();
        }
      }
    }
    return result;
  }
}
