// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.generic;

public final class Entity {
  private Entity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResetUsernameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResetUsernameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResetPasswordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResetPasswordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnauthenticatedUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnauthenticatedUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserValidityCheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserValidityCheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TokenIssueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TokenIssueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TokenIssueRequest_AuthenticatedUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TokenIssueRequest_AuthenticatedUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TokenRevokeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TokenRevokeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ErrorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ErrorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TokenIssueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TokenIssueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TokenRevokeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TokenRevokeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014entity.proto\"7\n\021CreateUserRequest\022\020\n\010u" +
      "sername\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"=\n\024Reset" +
      "UsernameRequest\022\020\n\010username\030\001 \001(\t\022\023\n\013new" +
      "Username\030\002 \001(\t\":\n\024ResetPasswordRequest\022\020" +
      "\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"@\n\032Un" +
      "authenticatedUserRequest\022\020\n\010username\030\001 \001" +
      "(\t\022\020\n\010password\030\002 \001(\t\"/\n\030UserValidityChec" +
      "kRequest\022\023\n\013accessToken\030\001 \001(\t\"\316\001\n\021TokenI" +
      "ssueRequest\0226\n\017unauthenticated\030\001 \001(\0132\033.U" +
      "nauthenticatedUserRequestH\000\022D\n\rauthentic" +
      "ated\030\002 \001(\0132+.TokenIssueRequest.Authentic" +
      "atedUserRequestH\000\0320\n\030AuthenticatedUserRe" +
      "quest\022\024\n\014refreshToken\030\001 \001(\tB\t\n\007request\"&" +
      "\n\022TokenRevokeRequest\022\020\n\010username\030\001 \001(\t\"7" +
      "\n\rErrorResponse\022\025\n\005error\030\001 \001(\0162\006.Error\022\017" +
      "\n\007message\030\002 \001(\t\"j\n\022CreateUserResponse\022\030\n" +
      "\006status\030\001 \001(\0162\010.Success\022\017\n\007message\030\002 \001(\t" +
      "\022\023\n\013accessToken\030\003 \001(\t\022\024\n\014refreshToken\030\004 " +
      "\001(\t\":\n\rResetResponse\022\030\n\006status\030\001 \001(\0162\010.S" +
      "uccess\022\017\n\007message\030\002 \001(\t\"c\n\014AuthResponse\022" +
      "\030\n\006status\030\001 \001(\0162\010.Success\022\017\n\007message\030\002 \001" +
      "(\t\022\030\n\013accessToken\030\003 \001(\tH\000\210\001\001B\016\n\014_accessT" +
      "oken\"\200\001\n\022TokenIssueResponse\022\030\n\006status\030\001 " +
      "\001(\0162\010.Success\022\017\n\007message\030\002 \001(\t\022\023\n\013access" +
      "Token\030\003 \001(\t\022\031\n\014refreshToken\030\004 \001(\tH\000\210\001\001B\017" +
      "\n\r_refreshToken\"@\n\023TokenRevokeResponse\022\030" +
      "\n\006status\030\001 \001(\0162\010.Success\022\017\n\007message\030\002 \001(" +
      "\t*\356\002\n\005Error\022\027\n\023USER_ALREADY_EXISTS\020\000\022\036\n\032" +
      "WRONG_USERNAME_OR_PASSWORD\020\001\022\024\n\020PASSWORD" +
      "_EXPIRED\020\002\022&\n\"PASSWORD_IDENTICAL_TO_PREV" +
      "IOUS_SET\020\003\022$\n RESET_REQUEST_BEFORE_BUFFE" +
      "R_TIME\020\004\022\030\n\024ACCESS_TOKEN_EXPIRED\020\005\022\030\n\024IN" +
      "VALID_ACCESS_TOKEN\020\006\022\031\n\025REFRESH_TOKEN_EX" +
      "PIRED\020\007\022\031\n\025INVALID_REFRESH_TOKEN\020\010\022&\n\"IN" +
      "VALID_REFRESH_TOKEN_ISSUE_POLICY\020\t\022\033\n\027TO" +
      "O_MANY_LOGIN_ATTEMPTS\020\n\022\031\n\025INTERNAL_SERV" +
      "ER_ERROR\020\013*\272\001\n\007Success\022\024\n\020NEW_USER_CREAT" +
      "ED\020\000\022!\n\035USERNAME_CHANGED_SUCCESSFULLY\020\001\022" +
      "\037\n\033PASSWORD_RESET_SUCCESSFULLY\020\002\022\026\n\022AUTH" +
      "ENTICATED_USER\020\003\022\035\n\031TOKEN_ISSUED_SUCCESS" +
      "FULLY\020\004\022\036\n\032TOKEN_REVOKED_SUCCESSFULLY\020\005B" +
      "\022\n\013org.genericP\001\240\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CreateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CreateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateUserRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_ResetUsernameRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResetUsernameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResetUsernameRequest_descriptor,
        new java.lang.String[] { "Username", "NewUsername", });
    internal_static_ResetPasswordRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ResetPasswordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResetPasswordRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_UnauthenticatedUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UnauthenticatedUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnauthenticatedUserRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_UserValidityCheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UserValidityCheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserValidityCheckRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_TokenIssueRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_TokenIssueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TokenIssueRequest_descriptor,
        new java.lang.String[] { "Unauthenticated", "Authenticated", "Request", });
    internal_static_TokenIssueRequest_AuthenticatedUserRequest_descriptor =
      internal_static_TokenIssueRequest_descriptor.getNestedTypes().get(0);
    internal_static_TokenIssueRequest_AuthenticatedUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TokenIssueRequest_AuthenticatedUserRequest_descriptor,
        new java.lang.String[] { "RefreshToken", });
    internal_static_TokenRevokeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_TokenRevokeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TokenRevokeRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_ErrorResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ErrorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ErrorResponse_descriptor,
        new java.lang.String[] { "Error", "Message", });
    internal_static_CreateUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_CreateUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateUserResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "AccessToken", "RefreshToken", });
    internal_static_ResetResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ResetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResetResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_AuthResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_AuthResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "AccessToken", "AccessToken", });
    internal_static_TokenIssueResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_TokenIssueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TokenIssueResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "AccessToken", "RefreshToken", "RefreshToken", });
    internal_static_TokenRevokeResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_TokenRevokeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TokenRevokeResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}