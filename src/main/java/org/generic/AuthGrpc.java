package org.generic;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.1)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.generic.CreateUserRequest,
      org.generic.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = org.generic.CreateUserRequest.class,
      responseType = org.generic.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.generic.CreateUserRequest,
      org.generic.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<org.generic.CreateUserRequest, org.generic.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = AuthGrpc.getCreateUserMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getCreateUserMethod = AuthGrpc.getCreateUserMethod) == null) {
          AuthGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<org.generic.CreateUserRequest, org.generic.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.generic.ResetUsernameRequest,
      org.generic.ResetResponse> getResetUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetUsername",
      requestType = org.generic.ResetUsernameRequest.class,
      responseType = org.generic.ResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.generic.ResetUsernameRequest,
      org.generic.ResetResponse> getResetUsernameMethod() {
    io.grpc.MethodDescriptor<org.generic.ResetUsernameRequest, org.generic.ResetResponse> getResetUsernameMethod;
    if ((getResetUsernameMethod = AuthGrpc.getResetUsernameMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getResetUsernameMethod = AuthGrpc.getResetUsernameMethod) == null) {
          AuthGrpc.getResetUsernameMethod = getResetUsernameMethod =
              io.grpc.MethodDescriptor.<org.generic.ResetUsernameRequest, org.generic.ResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "resetUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.ResetUsernameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.ResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("resetUsername"))
              .build();
        }
      }
    }
    return getResetUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.generic.ResetPasswordRequest,
      org.generic.ResetResponse> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetPassword",
      requestType = org.generic.ResetPasswordRequest.class,
      responseType = org.generic.ResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.generic.ResetPasswordRequest,
      org.generic.ResetResponse> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<org.generic.ResetPasswordRequest, org.generic.ResetResponse> getResetPasswordMethod;
    if ((getResetPasswordMethod = AuthGrpc.getResetPasswordMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getResetPasswordMethod = AuthGrpc.getResetPasswordMethod) == null) {
          AuthGrpc.getResetPasswordMethod = getResetPasswordMethod =
              io.grpc.MethodDescriptor.<org.generic.ResetPasswordRequest, org.generic.ResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "resetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.ResetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.ResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("resetPassword"))
              .build();
        }
      }
    }
    return getResetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.generic.UserValidityCheckRequest,
      org.generic.AuthResponse> getAuthenticateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authenticateUser",
      requestType = org.generic.UserValidityCheckRequest.class,
      responseType = org.generic.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.generic.UserValidityCheckRequest,
      org.generic.AuthResponse> getAuthenticateUserMethod() {
    io.grpc.MethodDescriptor<org.generic.UserValidityCheckRequest, org.generic.AuthResponse> getAuthenticateUserMethod;
    if ((getAuthenticateUserMethod = AuthGrpc.getAuthenticateUserMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthenticateUserMethod = AuthGrpc.getAuthenticateUserMethod) == null) {
          AuthGrpc.getAuthenticateUserMethod = getAuthenticateUserMethod =
              io.grpc.MethodDescriptor.<org.generic.UserValidityCheckRequest, org.generic.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "authenticateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.UserValidityCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("authenticateUser"))
              .build();
        }
      }
    }
    return getAuthenticateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.generic.TokenIssueRequest,
      org.generic.TokenIssueResponse> getIssueTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "issueToken",
      requestType = org.generic.TokenIssueRequest.class,
      responseType = org.generic.TokenIssueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.generic.TokenIssueRequest,
      org.generic.TokenIssueResponse> getIssueTokenMethod() {
    io.grpc.MethodDescriptor<org.generic.TokenIssueRequest, org.generic.TokenIssueResponse> getIssueTokenMethod;
    if ((getIssueTokenMethod = AuthGrpc.getIssueTokenMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getIssueTokenMethod = AuthGrpc.getIssueTokenMethod) == null) {
          AuthGrpc.getIssueTokenMethod = getIssueTokenMethod =
              io.grpc.MethodDescriptor.<org.generic.TokenIssueRequest, org.generic.TokenIssueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "issueToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.TokenIssueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.TokenIssueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("issueToken"))
              .build();
        }
      }
    }
    return getIssueTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.generic.TokenRevokeRequest,
      org.generic.TokenRevokeResponse> getRevokeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "revokeToken",
      requestType = org.generic.TokenRevokeRequest.class,
      responseType = org.generic.TokenRevokeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.generic.TokenRevokeRequest,
      org.generic.TokenRevokeResponse> getRevokeTokenMethod() {
    io.grpc.MethodDescriptor<org.generic.TokenRevokeRequest, org.generic.TokenRevokeResponse> getRevokeTokenMethod;
    if ((getRevokeTokenMethod = AuthGrpc.getRevokeTokenMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRevokeTokenMethod = AuthGrpc.getRevokeTokenMethod) == null) {
          AuthGrpc.getRevokeTokenMethod = getRevokeTokenMethod =
              io.grpc.MethodDescriptor.<org.generic.TokenRevokeRequest, org.generic.TokenRevokeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "revokeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.TokenRevokeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.generic.TokenRevokeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("revokeToken"))
              .build();
        }
      }
    }
    return getRevokeTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthStub>() {
        @java.lang.Override
        public AuthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthStub(channel, callOptions);
        }
      };
    return AuthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub>() {
        @java.lang.Override
        public AuthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthBlockingStub(channel, callOptions);
        }
      };
    return AuthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub>() {
        @java.lang.Override
        public AuthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthFutureStub(channel, callOptions);
        }
      };
    return AuthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(org.generic.CreateUserRequest request,
        io.grpc.stub.StreamObserver<org.generic.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void resetUsername(org.generic.ResetUsernameRequest request,
        io.grpc.stub.StreamObserver<org.generic.ResetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetUsernameMethod(), responseObserver);
    }

    /**
     */
    public void resetPassword(org.generic.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<org.generic.ResetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    /**
     */
    public void authenticateUser(org.generic.UserValidityCheckRequest request,
        io.grpc.stub.StreamObserver<org.generic.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateUserMethod(), responseObserver);
    }

    /**
     */
    public void issueToken(org.generic.TokenIssueRequest request,
        io.grpc.stub.StreamObserver<org.generic.TokenIssueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueTokenMethod(), responseObserver);
    }

    /**
     */
    public void revokeToken(org.generic.TokenRevokeRequest request,
        io.grpc.stub.StreamObserver<org.generic.TokenRevokeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.generic.CreateUserRequest,
                org.generic.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getResetUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.generic.ResetUsernameRequest,
                org.generic.ResetResponse>(
                  this, METHODID_RESET_USERNAME)))
          .addMethod(
            getResetPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.generic.ResetPasswordRequest,
                org.generic.ResetResponse>(
                  this, METHODID_RESET_PASSWORD)))
          .addMethod(
            getAuthenticateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.generic.UserValidityCheckRequest,
                org.generic.AuthResponse>(
                  this, METHODID_AUTHENTICATE_USER)))
          .addMethod(
            getIssueTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.generic.TokenIssueRequest,
                org.generic.TokenIssueResponse>(
                  this, METHODID_ISSUE_TOKEN)))
          .addMethod(
            getRevokeTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.generic.TokenRevokeRequest,
                org.generic.TokenRevokeResponse>(
                  this, METHODID_REVOKE_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class AuthStub extends io.grpc.stub.AbstractAsyncStub<AuthStub> {
    private AuthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     */
    public void createUser(org.generic.CreateUserRequest request,
        io.grpc.stub.StreamObserver<org.generic.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetUsername(org.generic.ResetUsernameRequest request,
        io.grpc.stub.StreamObserver<org.generic.ResetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(org.generic.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<org.generic.ResetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authenticateUser(org.generic.UserValidityCheckRequest request,
        io.grpc.stub.StreamObserver<org.generic.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void issueToken(org.generic.TokenIssueRequest request,
        io.grpc.stub.StreamObserver<org.generic.TokenIssueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeToken(org.generic.TokenRevokeRequest request,
        io.grpc.stub.StreamObserver<org.generic.TokenRevokeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthBlockingStub> {
    private AuthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.generic.CreateUserResponse createUser(org.generic.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.generic.ResetResponse resetUsername(org.generic.ResetUsernameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.generic.ResetResponse resetPassword(org.generic.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.generic.AuthResponse authenticateUser(org.generic.UserValidityCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.generic.TokenIssueResponse issueToken(org.generic.TokenIssueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.generic.TokenRevokeResponse revokeToken(org.generic.TokenRevokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractFutureStub<AuthFutureStub> {
    private AuthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.generic.CreateUserResponse> createUser(
        org.generic.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.generic.ResetResponse> resetUsername(
        org.generic.ResetUsernameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.generic.ResetResponse> resetPassword(
        org.generic.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.generic.AuthResponse> authenticateUser(
        org.generic.UserValidityCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.generic.TokenIssueResponse> issueToken(
        org.generic.TokenIssueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.generic.TokenRevokeResponse> revokeToken(
        org.generic.TokenRevokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_RESET_USERNAME = 1;
  private static final int METHODID_RESET_PASSWORD = 2;
  private static final int METHODID_AUTHENTICATE_USER = 3;
  private static final int METHODID_ISSUE_TOKEN = 4;
  private static final int METHODID_REVOKE_TOKEN = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((org.generic.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<org.generic.CreateUserResponse>) responseObserver);
          break;
        case METHODID_RESET_USERNAME:
          serviceImpl.resetUsername((org.generic.ResetUsernameRequest) request,
              (io.grpc.stub.StreamObserver<org.generic.ResetResponse>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((org.generic.ResetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<org.generic.ResetResponse>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_USER:
          serviceImpl.authenticateUser((org.generic.UserValidityCheckRequest) request,
              (io.grpc.stub.StreamObserver<org.generic.AuthResponse>) responseObserver);
          break;
        case METHODID_ISSUE_TOKEN:
          serviceImpl.issueToken((org.generic.TokenIssueRequest) request,
              (io.grpc.stub.StreamObserver<org.generic.TokenIssueResponse>) responseObserver);
          break;
        case METHODID_REVOKE_TOKEN:
          serviceImpl.revokeToken((org.generic.TokenRevokeRequest) request,
              (io.grpc.stub.StreamObserver<org.generic.TokenRevokeResponse>) responseObserver);
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

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.generic.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getResetUsernameMethod())
              .addMethod(getResetPasswordMethod())
              .addMethod(getAuthenticateUserMethod())
              .addMethod(getIssueTokenMethod())
              .addMethod(getRevokeTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
