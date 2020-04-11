// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cooker/cooker.proto

package com.proto.cooker;

/**
 * <pre>
 *Unary request
 * </pre>
 *
 * Protobuf type {@code cooker.Cooker}
 */
public  final class Cooker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cooker.Cooker)
    CookerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Cooker.newBuilder() to construct.
  private Cooker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cooker() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Cooker();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Cooker(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            temperature_ = input.readInt32();
            break;
          }
          case 17: {

            cookTime_ = input.readDouble();
            break;
          }
          case 25: {

            weight_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.proto.cooker.CookerOuterClass.internal_static_cooker_Cooker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.cooker.CookerOuterClass.internal_static_cooker_Cooker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.cooker.Cooker.class, com.proto.cooker.Cooker.Builder.class);
  }

  public static final int TEMPERATURE_FIELD_NUMBER = 1;
  private int temperature_;
  /**
   * <code>int32 temperature = 1;</code>
   * @return The temperature.
   */
  public int getTemperature() {
    return temperature_;
  }

  public static final int COOKTIME_FIELD_NUMBER = 2;
  private double cookTime_;
  /**
   * <code>double cookTime = 2;</code>
   * @return The cookTime.
   */
  public double getCookTime() {
    return cookTime_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 3;
  private double weight_;
  /**
   * <code>double weight = 3;</code>
   * @return The weight.
   */
  public double getWeight() {
    return weight_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (temperature_ != 0) {
      output.writeInt32(1, temperature_);
    }
    if (cookTime_ != 0D) {
      output.writeDouble(2, cookTime_);
    }
    if (weight_ != 0D) {
      output.writeDouble(3, weight_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (temperature_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, temperature_);
    }
    if (cookTime_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, cookTime_);
    }
    if (weight_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, weight_);
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
    if (!(obj instanceof com.proto.cooker.Cooker)) {
      return super.equals(obj);
    }
    com.proto.cooker.Cooker other = (com.proto.cooker.Cooker) obj;

    if (getTemperature()
        != other.getTemperature()) return false;
    if (java.lang.Double.doubleToLongBits(getCookTime())
        != java.lang.Double.doubleToLongBits(
            other.getCookTime())) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + getTemperature();
    hash = (37 * hash) + COOKTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCookTime()));
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.cooker.Cooker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.cooker.Cooker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.cooker.Cooker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.cooker.Cooker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.cooker.Cooker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.cooker.Cooker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.cooker.Cooker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.cooker.Cooker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.cooker.Cooker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.cooker.Cooker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.cooker.Cooker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.cooker.Cooker parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.cooker.Cooker prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   *Unary request
   * </pre>
   *
   * Protobuf type {@code cooker.Cooker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cooker.Cooker)
      com.proto.cooker.CookerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.cooker.CookerOuterClass.internal_static_cooker_Cooker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.cooker.CookerOuterClass.internal_static_cooker_Cooker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.cooker.Cooker.class, com.proto.cooker.Cooker.Builder.class);
    }

    // Construct using com.proto.cooker.Cooker.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      temperature_ = 0;

      cookTime_ = 0D;

      weight_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.cooker.CookerOuterClass.internal_static_cooker_Cooker_descriptor;
    }

    @java.lang.Override
    public com.proto.cooker.Cooker getDefaultInstanceForType() {
      return com.proto.cooker.Cooker.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.cooker.Cooker build() {
      com.proto.cooker.Cooker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.cooker.Cooker buildPartial() {
      com.proto.cooker.Cooker result = new com.proto.cooker.Cooker(this);
      result.temperature_ = temperature_;
      result.cookTime_ = cookTime_;
      result.weight_ = weight_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.cooker.Cooker) {
        return mergeFrom((com.proto.cooker.Cooker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.cooker.Cooker other) {
      if (other == com.proto.cooker.Cooker.getDefaultInstance()) return this;
      if (other.getTemperature() != 0) {
        setTemperature(other.getTemperature());
      }
      if (other.getCookTime() != 0D) {
        setCookTime(other.getCookTime());
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.cooker.Cooker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.cooker.Cooker) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int temperature_ ;
    /**
     * <code>int32 temperature = 1;</code>
     * @return The temperature.
     */
    public int getTemperature() {
      return temperature_;
    }
    /**
     * <code>int32 temperature = 1;</code>
     * @param value The temperature to set.
     * @return This builder for chaining.
     */
    public Builder setTemperature(int value) {
      
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 temperature = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemperature() {
      
      temperature_ = 0;
      onChanged();
      return this;
    }

    private double cookTime_ ;
    /**
     * <code>double cookTime = 2;</code>
     * @return The cookTime.
     */
    public double getCookTime() {
      return cookTime_;
    }
    /**
     * <code>double cookTime = 2;</code>
     * @param value The cookTime to set.
     * @return This builder for chaining.
     */
    public Builder setCookTime(double value) {
      
      cookTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double cookTime = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCookTime() {
      
      cookTime_ = 0D;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 3;</code>
     * @return The weight.
     */
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 3;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cooker.Cooker)
  }

  // @@protoc_insertion_point(class_scope:cooker.Cooker)
  private static final com.proto.cooker.Cooker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.cooker.Cooker();
  }

  public static com.proto.cooker.Cooker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cooker>
      PARSER = new com.google.protobuf.AbstractParser<Cooker>() {
    @java.lang.Override
    public Cooker parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Cooker(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Cooker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cooker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.cooker.Cooker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
