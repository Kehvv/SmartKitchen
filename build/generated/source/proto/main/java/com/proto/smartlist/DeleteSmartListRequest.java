// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartlist/smartlist.proto

package com.proto.smartlist;

/**
 * Protobuf type {@code smartlist.DeleteSmartListRequest}
 */
public  final class DeleteSmartListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartlist.DeleteSmartListRequest)
    DeleteSmartListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteSmartListRequest.newBuilder() to construct.
  private DeleteSmartListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteSmartListRequest() {
    smartlistId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteSmartListRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteSmartListRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            smartlistId_ = s;
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
    return com.proto.smartlist.SmartlistOuterClass.internal_static_smartlist_DeleteSmartListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.smartlist.SmartlistOuterClass.internal_static_smartlist_DeleteSmartListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.smartlist.DeleteSmartListRequest.class, com.proto.smartlist.DeleteSmartListRequest.Builder.class);
  }

  public static final int SMARTLIST_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object smartlistId_;
  /**
   * <code>string smartlist_id = 1;</code>
   * @return The smartlistId.
   */
  public java.lang.String getSmartlistId() {
    java.lang.Object ref = smartlistId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      smartlistId_ = s;
      return s;
    }
  }
  /**
   * <code>string smartlist_id = 1;</code>
   * @return The bytes for smartlistId.
   */
  public com.google.protobuf.ByteString
      getSmartlistIdBytes() {
    java.lang.Object ref = smartlistId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      smartlistId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSmartlistIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, smartlistId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSmartlistIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, smartlistId_);
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
    if (!(obj instanceof com.proto.smartlist.DeleteSmartListRequest)) {
      return super.equals(obj);
    }
    com.proto.smartlist.DeleteSmartListRequest other = (com.proto.smartlist.DeleteSmartListRequest) obj;

    if (!getSmartlistId()
        .equals(other.getSmartlistId())) return false;
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
    hash = (37 * hash) + SMARTLIST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSmartlistId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.smartlist.DeleteSmartListRequest parseFrom(
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
  public static Builder newBuilder(com.proto.smartlist.DeleteSmartListRequest prototype) {
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
   * Protobuf type {@code smartlist.DeleteSmartListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartlist.DeleteSmartListRequest)
      com.proto.smartlist.DeleteSmartListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.smartlist.SmartlistOuterClass.internal_static_smartlist_DeleteSmartListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.smartlist.SmartlistOuterClass.internal_static_smartlist_DeleteSmartListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.smartlist.DeleteSmartListRequest.class, com.proto.smartlist.DeleteSmartListRequest.Builder.class);
    }

    // Construct using com.proto.smartlist.DeleteSmartListRequest.newBuilder()
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
      smartlistId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.smartlist.SmartlistOuterClass.internal_static_smartlist_DeleteSmartListRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.smartlist.DeleteSmartListRequest getDefaultInstanceForType() {
      return com.proto.smartlist.DeleteSmartListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.smartlist.DeleteSmartListRequest build() {
      com.proto.smartlist.DeleteSmartListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.smartlist.DeleteSmartListRequest buildPartial() {
      com.proto.smartlist.DeleteSmartListRequest result = new com.proto.smartlist.DeleteSmartListRequest(this);
      result.smartlistId_ = smartlistId_;
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
      if (other instanceof com.proto.smartlist.DeleteSmartListRequest) {
        return mergeFrom((com.proto.smartlist.DeleteSmartListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.smartlist.DeleteSmartListRequest other) {
      if (other == com.proto.smartlist.DeleteSmartListRequest.getDefaultInstance()) return this;
      if (!other.getSmartlistId().isEmpty()) {
        smartlistId_ = other.smartlistId_;
        onChanged();
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
      com.proto.smartlist.DeleteSmartListRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.smartlist.DeleteSmartListRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object smartlistId_ = "";
    /**
     * <code>string smartlist_id = 1;</code>
     * @return The smartlistId.
     */
    public java.lang.String getSmartlistId() {
      java.lang.Object ref = smartlistId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        smartlistId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string smartlist_id = 1;</code>
     * @return The bytes for smartlistId.
     */
    public com.google.protobuf.ByteString
        getSmartlistIdBytes() {
      java.lang.Object ref = smartlistId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        smartlistId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string smartlist_id = 1;</code>
     * @param value The smartlistId to set.
     * @return This builder for chaining.
     */
    public Builder setSmartlistId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      smartlistId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string smartlist_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSmartlistId() {
      
      smartlistId_ = getDefaultInstance().getSmartlistId();
      onChanged();
      return this;
    }
    /**
     * <code>string smartlist_id = 1;</code>
     * @param value The bytes for smartlistId to set.
     * @return This builder for chaining.
     */
    public Builder setSmartlistIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      smartlistId_ = value;
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


    // @@protoc_insertion_point(builder_scope:smartlist.DeleteSmartListRequest)
  }

  // @@protoc_insertion_point(class_scope:smartlist.DeleteSmartListRequest)
  private static final com.proto.smartlist.DeleteSmartListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.smartlist.DeleteSmartListRequest();
  }

  public static com.proto.smartlist.DeleteSmartListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteSmartListRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteSmartListRequest>() {
    @java.lang.Override
    public DeleteSmartListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteSmartListRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteSmartListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteSmartListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.smartlist.DeleteSmartListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

