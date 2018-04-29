// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator.proto

package sr.grpc.gen;

/**
 * Protobuf type {@code calculator.ArithmeticOpArguments2}
 */
public  final class ArithmeticOpArguments2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.ArithmeticOpArguments2)
    ArithmeticOpArguments2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArithmeticOpArguments2.newBuilder() to construct.
  private ArithmeticOpArguments2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArithmeticOpArguments2() {
    arg1_ = 0;
    arg2_ = 0;
    arg3_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ArithmeticOpArguments2(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            arg1_ = input.readInt32();
            break;
          }
          case 16: {

            arg2_ = input.readInt32();
            break;
          }
          case 24: {

            arg3_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sr.grpc.gen.CalculatorProto.internal_static_calculator_ArithmeticOpArguments2_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sr.grpc.gen.CalculatorProto.internal_static_calculator_ArithmeticOpArguments2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sr.grpc.gen.ArithmeticOpArguments2.class, sr.grpc.gen.ArithmeticOpArguments2.Builder.class);
  }

  public static final int ARG1_FIELD_NUMBER = 1;
  private int arg1_;
  /**
   * <code>int32 arg1 = 1;</code>
   */
  public int getArg1() {
    return arg1_;
  }

  public static final int ARG2_FIELD_NUMBER = 2;
  private int arg2_;
  /**
   * <code>int32 arg2 = 2;</code>
   */
  public int getArg2() {
    return arg2_;
  }

  public static final int ARG3_FIELD_NUMBER = 3;
  private int arg3_;
  /**
   * <code>int32 arg3 = 3;</code>
   */
  public int getArg3() {
    return arg3_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (arg1_ != 0) {
      output.writeInt32(1, arg1_);
    }
    if (arg2_ != 0) {
      output.writeInt32(2, arg2_);
    }
    if (arg3_ != 0) {
      output.writeInt32(3, arg3_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (arg1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, arg1_);
    }
    if (arg2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, arg2_);
    }
    if (arg3_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, arg3_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sr.grpc.gen.ArithmeticOpArguments2)) {
      return super.equals(obj);
    }
    sr.grpc.gen.ArithmeticOpArguments2 other = (sr.grpc.gen.ArithmeticOpArguments2) obj;

    boolean result = true;
    result = result && (getArg1()
        == other.getArg1());
    result = result && (getArg2()
        == other.getArg2());
    result = result && (getArg3()
        == other.getArg3());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ARG1_FIELD_NUMBER;
    hash = (53 * hash) + getArg1();
    hash = (37 * hash) + ARG2_FIELD_NUMBER;
    hash = (53 * hash) + getArg2();
    hash = (37 * hash) + ARG3_FIELD_NUMBER;
    hash = (53 * hash) + getArg3();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.ArithmeticOpArguments2 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sr.grpc.gen.ArithmeticOpArguments2 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code calculator.ArithmeticOpArguments2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.ArithmeticOpArguments2)
      sr.grpc.gen.ArithmeticOpArguments2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_ArithmeticOpArguments2_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_ArithmeticOpArguments2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sr.grpc.gen.ArithmeticOpArguments2.class, sr.grpc.gen.ArithmeticOpArguments2.Builder.class);
    }

    // Construct using sr.grpc.gen.ArithmeticOpArguments2.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      arg1_ = 0;

      arg2_ = 0;

      arg3_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_ArithmeticOpArguments2_descriptor;
    }

    public sr.grpc.gen.ArithmeticOpArguments2 getDefaultInstanceForType() {
      return sr.grpc.gen.ArithmeticOpArguments2.getDefaultInstance();
    }

    public sr.grpc.gen.ArithmeticOpArguments2 build() {
      sr.grpc.gen.ArithmeticOpArguments2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sr.grpc.gen.ArithmeticOpArguments2 buildPartial() {
      sr.grpc.gen.ArithmeticOpArguments2 result = new sr.grpc.gen.ArithmeticOpArguments2(this);
      result.arg1_ = arg1_;
      result.arg2_ = arg2_;
      result.arg3_ = arg3_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sr.grpc.gen.ArithmeticOpArguments2) {
        return mergeFrom((sr.grpc.gen.ArithmeticOpArguments2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sr.grpc.gen.ArithmeticOpArguments2 other) {
      if (other == sr.grpc.gen.ArithmeticOpArguments2.getDefaultInstance()) return this;
      if (other.getArg1() != 0) {
        setArg1(other.getArg1());
      }
      if (other.getArg2() != 0) {
        setArg2(other.getArg2());
      }
      if (other.getArg3() != 0) {
        setArg3(other.getArg3());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sr.grpc.gen.ArithmeticOpArguments2 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sr.grpc.gen.ArithmeticOpArguments2) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int arg1_ ;
    /**
     * <code>int32 arg1 = 1;</code>
     */
    public int getArg1() {
      return arg1_;
    }
    /**
     * <code>int32 arg1 = 1;</code>
     */
    public Builder setArg1(int value) {
      
      arg1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 arg1 = 1;</code>
     */
    public Builder clearArg1() {
      
      arg1_ = 0;
      onChanged();
      return this;
    }

    private int arg2_ ;
    /**
     * <code>int32 arg2 = 2;</code>
     */
    public int getArg2() {
      return arg2_;
    }
    /**
     * <code>int32 arg2 = 2;</code>
     */
    public Builder setArg2(int value) {
      
      arg2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 arg2 = 2;</code>
     */
    public Builder clearArg2() {
      
      arg2_ = 0;
      onChanged();
      return this;
    }

    private int arg3_ ;
    /**
     * <code>int32 arg3 = 3;</code>
     */
    public int getArg3() {
      return arg3_;
    }
    /**
     * <code>int32 arg3 = 3;</code>
     */
    public Builder setArg3(int value) {
      
      arg3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 arg3 = 3;</code>
     */
    public Builder clearArg3() {
      
      arg3_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:calculator.ArithmeticOpArguments2)
  }

  // @@protoc_insertion_point(class_scope:calculator.ArithmeticOpArguments2)
  private static final sr.grpc.gen.ArithmeticOpArguments2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sr.grpc.gen.ArithmeticOpArguments2();
  }

  public static sr.grpc.gen.ArithmeticOpArguments2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArithmeticOpArguments2>
      PARSER = new com.google.protobuf.AbstractParser<ArithmeticOpArguments2>() {
    public ArithmeticOpArguments2 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ArithmeticOpArguments2(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ArithmeticOpArguments2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArithmeticOpArguments2> getParserForType() {
    return PARSER;
  }

  public sr.grpc.gen.ArithmeticOpArguments2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
