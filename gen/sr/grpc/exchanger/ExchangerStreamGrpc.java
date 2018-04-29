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
public final class ExchangerStreamGrpc {

  private ExchangerStreamGrpc() {}

  public static final String SERVICE_NAME = "exchanger.ExchangerStream";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sr.grpc.exchanger.CurrenciesList,
      sr.grpc.exchanger.CurrenciesState> METHOD_GET_CURRENCIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "exchanger.ExchangerStream", "GetCurrencies"),
          io.grpc.protobuf.ProtoUtils.marshaller(sr.grpc.exchanger.CurrenciesList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(sr.grpc.exchanger.CurrenciesState.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExchangerStreamStub newStub(io.grpc.Channel channel) {
    return new ExchangerStreamStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExchangerStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExchangerStreamBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ExchangerStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExchangerStreamFutureStub(channel);
  }

  /**
   */
  public static abstract class ExchangerStreamImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrencies(sr.grpc.exchanger.CurrenciesList request,
        io.grpc.stub.StreamObserver<sr.grpc.exchanger.CurrenciesState> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CURRENCIES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_CURRENCIES,
            asyncServerStreamingCall(
              new MethodHandlers<
                sr.grpc.exchanger.CurrenciesList,
                sr.grpc.exchanger.CurrenciesState>(
                  this, METHODID_GET_CURRENCIES)))
          .build();
    }
  }

  /**
   */
  public static final class ExchangerStreamStub extends io.grpc.stub.AbstractStub<ExchangerStreamStub> {
    private ExchangerStreamStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExchangerStreamStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExchangerStreamStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExchangerStreamStub(channel, callOptions);
    }

    /**
     */
    public void getCurrencies(sr.grpc.exchanger.CurrenciesList request,
        io.grpc.stub.StreamObserver<sr.grpc.exchanger.CurrenciesState> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_CURRENCIES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExchangerStreamBlockingStub extends io.grpc.stub.AbstractStub<ExchangerStreamBlockingStub> {
    private ExchangerStreamBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExchangerStreamBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExchangerStreamBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExchangerStreamBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<sr.grpc.exchanger.CurrenciesState> getCurrencies(
        sr.grpc.exchanger.CurrenciesList request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_CURRENCIES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExchangerStreamFutureStub extends io.grpc.stub.AbstractStub<ExchangerStreamFutureStub> {
    private ExchangerStreamFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExchangerStreamFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExchangerStreamFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExchangerStreamFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_CURRENCIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExchangerStreamImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExchangerStreamImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENCIES:
          serviceImpl.getCurrencies((sr.grpc.exchanger.CurrenciesList) request,
              (io.grpc.stub.StreamObserver<sr.grpc.exchanger.CurrenciesState>) responseObserver);
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

  private static final class ExchangerStreamDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sr.grpc.exchanger.ExchangerProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExchangerStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExchangerStreamDescriptorSupplier())
              .addMethod(METHOD_GET_CURRENCIES)
              .build();
        }
      }
    }
    return result;
  }
}
