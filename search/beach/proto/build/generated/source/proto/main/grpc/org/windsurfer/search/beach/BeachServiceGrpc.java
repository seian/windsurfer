package org.windsurfer.search.beach;

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
    comments = "Source: beach.proto")
public class BeachServiceGrpc {

  private BeachServiceGrpc() {}

  public static final String SERVICE_NAME = "org.windsurfer.search.beach.BeachService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.windsurfer.search.beach.BeachRequest,
      org.windsurfer.search.beach.BeachResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.windsurfer.search.beach.BeachService", "Search"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.windsurfer.search.beach.BeachRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.windsurfer.search.beach.BeachResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BeachServiceStub newStub(io.grpc.Channel channel) {
    return new BeachServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BeachServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BeachServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BeachServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BeachServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BeachServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(org.windsurfer.search.beach.BeachRequest request,
        io.grpc.stub.StreamObserver<org.windsurfer.search.beach.BeachResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                org.windsurfer.search.beach.BeachRequest,
                org.windsurfer.search.beach.BeachResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class BeachServiceStub extends io.grpc.stub.AbstractStub<BeachServiceStub> {
    private BeachServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BeachServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BeachServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BeachServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(org.windsurfer.search.beach.BeachRequest request,
        io.grpc.stub.StreamObserver<org.windsurfer.search.beach.BeachResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BeachServiceBlockingStub extends io.grpc.stub.AbstractStub<BeachServiceBlockingStub> {
    private BeachServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BeachServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BeachServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BeachServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.windsurfer.search.beach.BeachResponse search(org.windsurfer.search.beach.BeachRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BeachServiceFutureStub extends io.grpc.stub.AbstractStub<BeachServiceFutureStub> {
    private BeachServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BeachServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BeachServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BeachServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.windsurfer.search.beach.BeachResponse> search(
        org.windsurfer.search.beach.BeachRequest request) {
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
    private final BeachServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(BeachServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((org.windsurfer.search.beach.BeachRequest) request,
              (io.grpc.stub.StreamObserver<org.windsurfer.search.beach.BeachResponse>) responseObserver);
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
