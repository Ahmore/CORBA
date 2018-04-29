package sr.grpc.exchanger;

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
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: exchanger.proto")
public final class StreamGrpc {

  private StreamGrpc() {}

  public static final String SERVICE_NAME = "exchanger.Stream";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sr.grpc.exchanger.Request,
      sr.grpc.exchanger.Response> METHOD_GET_CURRENCIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "exchanger.Stream", "GetCurrencies"),
          io.grpc.protobuf.ProtoUtils.marshaller(sr.grpc.exchanger.Request.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(sr.grpc.exchanger.Response.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamStub newStub(io.grpc.Channel channel) {
    return new StreamStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StreamBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static StreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StreamFutureStub(channel);
  }

  /**
   */
  public static abstract class StreamImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrencies(sr.grpc.exchanger.Request request,
        io.grpc.stub.StreamObserver<sr.grpc.exchanger.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CURRENCIES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_CURRENCIES,
            asyncServerStreamingCall(
              new MethodHandlers<
                sr.grpc.exchanger.Request,
                sr.grpc.exchanger.Response>(
                  this, METHODID_GET_CURRENCIES)))
          .build();
    }
  }

  /**
   */
  public static final class StreamStub extends io.grpc.stub.AbstractStub<StreamStub> {
    private StreamStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamStub(channel, callOptions);
    }

    /**
     */
    public void getCurrencies(sr.grpc.exchanger.Request request,
        io.grpc.stub.StreamObserver<sr.grpc.exchanger.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_CURRENCIES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StreamBlockingStub extends io.grpc.stub.AbstractStub<StreamBlockingStub> {
    private StreamBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<sr.grpc.exchanger.Response> getCurrencies(
        sr.grpc.exchanger.Request request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_CURRENCIES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamFutureStub extends io.grpc.stub.AbstractStub<StreamFutureStub> {
    private StreamFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_CURRENCIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENCIES:
          serviceImpl.getCurrencies((sr.grpc.exchanger.Request) request,
              (io.grpc.stub.StreamObserver<sr.grpc.exchanger.Response>) responseObserver);
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

  private static final class StreamDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sr.grpc.exchanger.ExchangerProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamDescriptorSupplier())
              .addMethod(METHOD_GET_CURRENCIES)
              .build();
        }
      }
    }
    return result;
  }
}
