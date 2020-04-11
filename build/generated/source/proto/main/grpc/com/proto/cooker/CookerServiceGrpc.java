package com.proto.cooker;

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
    comments = "Source: cooker/cooker.proto")
public final class CookerServiceGrpc {

  private CookerServiceGrpc() {}

  public static final String SERVICE_NAME = "cooker.CookerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.cooker.CookerRequest,
      com.proto.cooker.CookerResponse> getCookerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cooker",
      requestType = com.proto.cooker.CookerRequest.class,
      responseType = com.proto.cooker.CookerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.cooker.CookerRequest,
      com.proto.cooker.CookerResponse> getCookerMethod() {
    io.grpc.MethodDescriptor<com.proto.cooker.CookerRequest, com.proto.cooker.CookerResponse> getCookerMethod;
    if ((getCookerMethod = CookerServiceGrpc.getCookerMethod) == null) {
      synchronized (CookerServiceGrpc.class) {
        if ((getCookerMethod = CookerServiceGrpc.getCookerMethod) == null) {
          CookerServiceGrpc.getCookerMethod = getCookerMethod =
              io.grpc.MethodDescriptor.<com.proto.cooker.CookerRequest, com.proto.cooker.CookerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cooker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cooker.CookerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cooker.CookerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CookerServiceMethodDescriptorSupplier("Cooker"))
              .build();
        }
      }
    }
    return getCookerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CookerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CookerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CookerServiceStub>() {
        @java.lang.Override
        public CookerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CookerServiceStub(channel, callOptions);
        }
      };
    return CookerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CookerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CookerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CookerServiceBlockingStub>() {
        @java.lang.Override
        public CookerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CookerServiceBlockingStub(channel, callOptions);
        }
      };
    return CookerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CookerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CookerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CookerServiceFutureStub>() {
        @java.lang.Override
        public CookerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CookerServiceFutureStub(channel, callOptions);
        }
      };
    return CookerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CookerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary request - send required info and receive response
     * </pre>
     */
    public void cooker(com.proto.cooker.CookerRequest request,
        io.grpc.stub.StreamObserver<com.proto.cooker.CookerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCookerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCookerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.cooker.CookerRequest,
                com.proto.cooker.CookerResponse>(
                  this, METHODID_COOKER)))
          .build();
    }
  }

  /**
   */
  public static final class CookerServiceStub extends io.grpc.stub.AbstractAsyncStub<CookerServiceStub> {
    private CookerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CookerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CookerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary request - send required info and receive response
     * </pre>
     */
    public void cooker(com.proto.cooker.CookerRequest request,
        io.grpc.stub.StreamObserver<com.proto.cooker.CookerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCookerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CookerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CookerServiceBlockingStub> {
    private CookerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CookerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CookerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary request - send required info and receive response
     * </pre>
     */
    public com.proto.cooker.CookerResponse cooker(com.proto.cooker.CookerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCookerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CookerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CookerServiceFutureStub> {
    private CookerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CookerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CookerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary request - send required info and receive response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.cooker.CookerResponse> cooker(
        com.proto.cooker.CookerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCookerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COOKER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CookerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CookerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COOKER:
          serviceImpl.cooker((com.proto.cooker.CookerRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.cooker.CookerResponse>) responseObserver);
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

  private static abstract class CookerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CookerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.cooker.CookerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CookerService");
    }
  }

  private static final class CookerServiceFileDescriptorSupplier
      extends CookerServiceBaseDescriptorSupplier {
    CookerServiceFileDescriptorSupplier() {}
  }

  private static final class CookerServiceMethodDescriptorSupplier
      extends CookerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CookerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CookerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CookerServiceFileDescriptorSupplier())
              .addMethod(getCookerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
