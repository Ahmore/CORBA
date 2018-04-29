// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator.proto

package sr.grpc.gen;

/**
 * Protobuf type {@code calculator.Report}
 */
public  final class Report extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.Report)
    ReportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Report.newBuilder() to construct.
  private Report(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Report() {
    count_ = 0;
    processorTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Report(
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

            count_ = input.readInt32();
            break;
          }
          case 16: {

            processorTime_ = input.readInt64();
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
    return sr.grpc.gen.CalculatorProto.internal_static_calculator_Report_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sr.grpc.gen.CalculatorProto.internal_static_calculator_Report_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sr.grpc.gen.Report.class, sr.grpc.gen.Report.Builder.class);
  }

  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;
  /**
   * <code>int32 count = 1;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int PROCESSORTIME_FIELD_NUMBER = 2;
  private long processorTime_;
  /**
   * <code>int64 processorTime = 2;</code>
   */
  public long getProcessorTime() {
    return processorTime_;
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
    if (count_ != 0) {
      output.writeInt32(1, count_);
    }
    if (processorTime_ != 0L) {
      output.writeInt64(2, processorTime_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, count_);
    }
    if (processorTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, processorTime_);
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
    if (!(obj instanceof sr.grpc.gen.Report)) {
      return super.equals(obj);
    }
    sr.grpc.gen.Report other = (sr.grpc.gen.Report) obj;

    boolean result = true;
    result = result && (getCount()
        == other.getCount());
    result = result && (getProcessorTime()
        == other.getProcessorTime());
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
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + PROCESSORTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProcessorTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sr.grpc.gen.Report parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.Report parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.Report parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.Report parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.Report parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sr.grpc.gen.Report parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sr.grpc.gen.Report parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.Report parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sr.grpc.gen.Report parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.Report parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sr.grpc.gen.Report parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sr.grpc.gen.Report parseFrom(
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
  public static Builder newBuilder(sr.grpc.gen.Report prototype) {
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
   * Protobuf type {@code calculator.Report}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.Report)
      sr.grpc.gen.ReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_Report_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_Report_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sr.grpc.gen.Report.class, sr.grpc.gen.Report.Builder.class);
    }

    // Construct using sr.grpc.gen.Report.newBuilder()
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
      count_ = 0;

      processorTime_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sr.grpc.gen.CalculatorProto.internal_static_calculator_Report_descriptor;
    }

    public sr.grpc.gen.Report getDefaultInstanceForType() {
      return sr.grpc.gen.Report.getDefaultInstance();
    }

    public sr.grpc.gen.Report build() {
      sr.grpc.gen.Report result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sr.grpc.gen.Report buildPartial() {
      sr.grpc.gen.Report result = new sr.grpc.gen.Report(this);
      result.count_ = count_;
      result.processorTime_ = processorTime_;
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
      if (other instanceof sr.grpc.gen.Report) {
        return mergeFrom((sr.grpc.gen.Report)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sr.grpc.gen.Report other) {
      if (other == sr.grpc.gen.Report.getDefaultInstance()) return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.getProcessorTime() != 0L) {
        setProcessorTime(other.getProcessorTime());
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
      sr.grpc.gen.Report parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sr.grpc.gen.Report) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int count_ ;
    /**
     * <code>int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 1;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 1;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private long processorTime_ ;
    /**
     * <code>int64 processorTime = 2;</code>
     */
    public long getProcessorTime() {
      return processorTime_;
    }
    /**
     * <code>int64 processorTime = 2;</code>
     */
    public Builder setProcessorTime(long value) {
      
      processorTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 processorTime = 2;</code>
     */
    public Builder clearProcessorTime() {
      
      processorTime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:calculator.Report)
  }

  // @@protoc_insertion_point(class_scope:calculator.Report)
  private static final sr.grpc.gen.Report DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sr.grpc.gen.Report();
  }

  public static sr.grpc.gen.Report getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Report>
      PARSER = new com.google.protobuf.AbstractParser<Report>() {
    public Report parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Report(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Report> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Report> getParserForType() {
    return PARSER;
  }

  public sr.grpc.gen.Report getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
