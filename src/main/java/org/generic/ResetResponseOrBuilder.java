// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.generic;

public interface ResetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ResetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Success status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.Success status = 1;</code>
   * @return The status.
   */
  org.generic.Success getStatus();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
