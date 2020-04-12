package com.proto.smartlist;

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
    comments = "Source: smartlist/smartlist.proto")
public final class SmartListServiceGrpc {

  private SmartListServiceGrpc() {}

  public static final String SERVICE_NAME = "smartlist.SmartListService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smartlist.CreateSmartListRequest,
      com.proto.smartlist.CreateSmartListResponse> getCreateSmartListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSmartList",
      requestType = com.proto.smartlist.CreateSmartListRequest.class,
      responseType = com.proto.smartlist.CreateSmartListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.smartlist.CreateSmartListRequest,
      com.proto.smartlist.CreateSmartListResponse> getCreateSmartListMethod() {
    io.grpc.MethodDescriptor<com.proto.smartlist.CreateSmartListRequest, com.proto.smartlist.CreateSmartListResponse> getCreateSmartListMethod;
    if ((getCreateSmartListMethod = SmartListServiceGrpc.getCreateSmartListMethod) == null) {
      synchronized (SmartListServiceGrpc.class) {
        if ((getCreateSmartListMethod = SmartListServiceGrpc.getCreateSmartListMethod) == null) {
          SmartListServiceGrpc.getCreateSmartListMethod = getCreateSmartListMethod =
              io.grpc.MethodDescriptor.<com.proto.smartlist.CreateSmartListRequest, com.proto.smartlist.CreateSmartListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSmartList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartlist.CreateSmartListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartlist.CreateSmartListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartListServiceMethodDescriptorSupplier("CreateSmartList"))
              .build();
        }
      }
    }
    return getCreateSmartListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.smartlist.ReadSmartListRequest,
      com.proto.smartlist.ReadSmartListResponse> getReadSmartListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadSmartList",
      requestType = com.proto.smartlist.ReadSmartListRequest.class,
      responseType = com.proto.smartlist.ReadSmartListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.smartlist.ReadSmartListRequest,
      com.proto.smartlist.ReadSmartListResponse> getReadSmartListMethod() {
    io.grpc.MethodDescriptor<com.proto.smartlist.ReadSmartListRequest, com.proto.smartlist.ReadSmartListResponse> getReadSmartListMethod;
    if ((getReadSmartListMethod = SmartListServiceGrpc.getReadSmartListMethod) == null) {
      synchronized (SmartListServiceGrpc.class) {
        if ((getReadSmartListMethod = SmartListServiceGrpc.getReadSmartListMethod) == null) {
          SmartListServiceGrpc.getReadSmartListMethod = getReadSmartListMethod =
              io.grpc.MethodDescriptor.<com.proto.smartlist.ReadSmartListRequest, com.proto.smartlist.ReadSmartListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadSmartList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartlist.ReadSmartListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartlist.ReadSmartListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartListServiceMethodDescriptorSupplier("ReadSmartList"))
              .build();
        }
      }
    }
    return getReadSmartListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartListServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartListServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartListServiceStub>() {
        @java.lang.Override
        public SmartListServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartListServiceStub(channel, callOptions);
        }
      };
    return SmartListServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartListServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartListServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartListServiceBlockingStub>() {
        @java.lang.Override
        public SmartListServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartListServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartListServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartListServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartListServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartListServiceFutureStub>() {
        @java.lang.Override
        public SmartListServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartListServiceFutureStub(channel, callOptions);
        }
      };
    return SmartListServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SmartListServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSmartList(com.proto.smartlist.CreateSmartListRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartlist.CreateSmartListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSmartListMethod(), responseObserver);
    }

    /**
     */
    public void readSmartList(com.proto.smartlist.ReadSmartListRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartlist.ReadSmartListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadSmartListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSmartListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.smartlist.CreateSmartListRequest,
                com.proto.smartlist.CreateSmartListResponse>(
                  this, METHODID_CREATE_SMART_LIST)))
          .addMethod(
            getReadSmartListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.smartlist.ReadSmartListRequest,
                com.proto.smartlist.ReadSmartListResponse>(
                  this, METHODID_READ_SMART_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class SmartListServiceStub extends io.grpc.stub.AbstractAsyncStub<SmartListServiceStub> {
    private SmartListServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartListServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartListServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSmartList(com.proto.smartlist.CreateSmartListRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartlist.CreateSmartListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSmartListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readSmartList(com.proto.smartlist.ReadSmartListRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartlist.ReadSmartListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadSmartListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartListServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmartListServiceBlockingStub> {
    private SmartListServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartListServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartListServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.smartlist.CreateSmartListResponse createSmartList(com.proto.smartlist.CreateSmartListRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSmartListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.smartlist.ReadSmartListResponse readSmartList(com.proto.smartlist.ReadSmartListRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadSmartListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartListServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SmartListServiceFutureStub> {
    private SmartListServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartListServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartListServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.smartlist.CreateSmartListResponse> createSmartList(
        com.proto.smartlist.CreateSmartListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSmartListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.smartlist.ReadSmartListResponse> readSmartList(
        com.proto.smartlist.ReadSmartListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadSmartListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SMART_LIST = 0;
  private static final int METHODID_READ_SMART_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartListServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartListServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SMART_LIST:
          serviceImpl.createSmartList((com.proto.smartlist.CreateSmartListRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.smartlist.CreateSmartListResponse>) responseObserver);
          break;
        case METHODID_READ_SMART_LIST:
          serviceImpl.readSmartList((com.proto.smartlist.ReadSmartListRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.smartlist.ReadSmartListResponse>) responseObserver);
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

  private static abstract class SmartListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartListServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smartlist.SmartlistOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartListService");
    }
  }

  private static final class SmartListServiceFileDescriptorSupplier
      extends SmartListServiceBaseDescriptorSupplier {
    SmartListServiceFileDescriptorSupplier() {}
  }

  private static final class SmartListServiceMethodDescriptorSupplier
      extends SmartListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartListServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartListServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartListServiceFileDescriptorSupplier())
              .addMethod(getCreateSmartListMethod())
              .addMethod(getReadSmartListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
