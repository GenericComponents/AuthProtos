// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.generic;

/**
 * Protobuf enum {@code Success}
 */
public enum Success
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NEW_USER_CREATED = 0;</code>
   */
  NEW_USER_CREATED(0),
  /**
   * <code>USERNAME_CHANGED_SUCCESSFULLY = 1;</code>
   */
  USERNAME_CHANGED_SUCCESSFULLY(1),
  /**
   * <code>PASSWORD_RESET_SUCCESSFULLY = 2;</code>
   */
  PASSWORD_RESET_SUCCESSFULLY(2),
  /**
   * <code>AUTHENTICATED_USER = 3;</code>
   */
  AUTHENTICATED_USER(3),
  /**
   * <code>TOKEN_ISSUED_SUCCESSFULLY = 4;</code>
   */
  TOKEN_ISSUED_SUCCESSFULLY(4),
  /**
   * <code>TOKEN_REVOKED_SUCCESSFULLY = 5;</code>
   */
  TOKEN_REVOKED_SUCCESSFULLY(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NEW_USER_CREATED = 0;</code>
   */
  public static final int NEW_USER_CREATED_VALUE = 0;
  /**
   * <code>USERNAME_CHANGED_SUCCESSFULLY = 1;</code>
   */
  public static final int USERNAME_CHANGED_SUCCESSFULLY_VALUE = 1;
  /**
   * <code>PASSWORD_RESET_SUCCESSFULLY = 2;</code>
   */
  public static final int PASSWORD_RESET_SUCCESSFULLY_VALUE = 2;
  /**
   * <code>AUTHENTICATED_USER = 3;</code>
   */
  public static final int AUTHENTICATED_USER_VALUE = 3;
  /**
   * <code>TOKEN_ISSUED_SUCCESSFULLY = 4;</code>
   */
  public static final int TOKEN_ISSUED_SUCCESSFULLY_VALUE = 4;
  /**
   * <code>TOKEN_REVOKED_SUCCESSFULLY = 5;</code>
   */
  public static final int TOKEN_REVOKED_SUCCESSFULLY_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Success valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Success forNumber(int value) {
    switch (value) {
      case 0: return NEW_USER_CREATED;
      case 1: return USERNAME_CHANGED_SUCCESSFULLY;
      case 2: return PASSWORD_RESET_SUCCESSFULLY;
      case 3: return AUTHENTICATED_USER;
      case 4: return TOKEN_ISSUED_SUCCESSFULLY;
      case 5: return TOKEN_REVOKED_SUCCESSFULLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Success>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Success> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Success>() {
          public Success findValueByNumber(int number) {
            return Success.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.generic.Entity.getDescriptor().getEnumTypes().get(1);
  }

  private static final Success[] VALUES = values();

  public static Success valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Success(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Success)
}

