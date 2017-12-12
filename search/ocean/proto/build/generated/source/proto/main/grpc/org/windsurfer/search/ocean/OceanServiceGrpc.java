package org.windsurfer.search.ocean;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.3)",
    comments = "Source: ocean.proto")
public class OceanServiceGrpc {

  private OceanServiceGrpc() {}

  public static final String SERVICE_NAME = "org.windsurfer.search.ocean.OceanService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.windsurfer.search.ocean.OceanRequest,
      org.windsurfer.search.ocean.OceanResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.windsurfer.search.ocean.OceanService", "Search"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.windsurfer.search.ocean.OceanRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.windsurfer.search.ocean.OceanResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OceanServiceStub newStub(io.grpc.Channel channel) {
    return new OceanServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OceanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OceanServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static OceanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OceanServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OceanServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(org.windsurfer.search.ocean.OceanRequest request,
        io.grpc.stub.StreamObserver<org.windsurfer.search.ocean.OceanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                org.windsurfer.search.ocean.OceanRequest,
                org.windsurfer.search.ocean.OceanResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class OceanServiceStub extends io.grpc.stub.AbstractStub<OceanServiceStub> {
    private OceanServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OceanServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OceanServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OceanServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(org.windsurfer.search.ocean.OceanRequest request,
        io.grpc.stub.StreamObserver<org.windsurfer.search.ocean.OceanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OceanServiceBlockingStub extends io.grpc.stub.AbstractStub<OceanServiceBlockingStub> {
    private OceanServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OceanServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OceanServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OceanServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.windsurfer.search.ocean.OceanResponse search(org.windsurfer.search.ocean.OceanRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OceanServiceFutureStub extends io.grpc.stub.AbstractStub<OceanServiceFutureStub> {
    private OceanServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OceanServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OceanServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OceanServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.windsurfer.search.ocean.OceanResponse> search(
        org.windsurfer.search.ocean.OceanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OceanServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(OceanServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((org.windsurfer.search.ocean.OceanRequest) request,
              (io.grpc.stub.StreamObserver<org.windsurfer.search.ocean.OceanResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_SEARCH);
  }

}
