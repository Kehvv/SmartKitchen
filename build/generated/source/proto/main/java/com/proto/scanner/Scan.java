// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scanner/scanner.proto

package com.proto.scanner;

/**
 * Protobuf type {@code scanner.Scan}
 */
public  final class Scan extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scanner.Scan)
    ScanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Scan.newBuilder() to construct.
  private Scan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Scan() {
    item_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Scan();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Scan(
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

            barcode_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            item_ = s;
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
    return com.proto.scanner.Scanner.internal_static_scanner_Scan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.scanner.Scanner.internal_static_scanner_Scan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.scanner.Scan.class, com.proto.scanner.Scan.Builder.class);
  }

  public static final int BARCODE_FIELD_NUMBER = 1;
  private int barcode_;
  /**
   * <code>int32 barcode = 1;</code>
   * @return The barcode.
   */
  public int getBarcode() {
    return barcode_;
  }

  public static final int ITEM_FIELD_NUMBER = 2;
  private volatile java.lang.Object item_;
  /**
   * <code>string item = 2;</code>
   * @return The item.
   */
  public java.lang.String getItem() {
    java.lang.Object ref = item_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      item_ = s;
      return s;
    }
  }
  /**
   * <code>string item = 2;</code>
   * @return The bytes for item.
   */
  public com.google.protobuf.ByteString
      getItemBytes() {
    java.lang.Object ref = item_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      item_ = b;
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
    if (barcode_ != 0) {
      output.writeInt32(1, barcode_);
    }
    if (!getItemBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, item_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (barcode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, barcode_);
    }
    if (!getItemBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, item_);
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
    if (!(obj instanceof com.proto.scanner.Scan)) {
      return super.equals(obj);
    }
    com.proto.scanner.Scan other = (com.proto.scanner.Scan) obj;

    if (getBarcode()
        != other.getBarcode()) return false;
    if (!getItem()
        .equals(other.getItem())) return false;
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
    hash = (37 * hash) + BARCODE_FIELD_NUMBER;
    hash = (53 * hash) + getBarcode();
    hash = (37 * hash) + ITEM_FIELD_NUMBER;
    hash = (53 * hash) + getItem().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.scanner.Scan parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.scanner.Scan parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.scanner.Scan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.scanner.Scan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.scanner.Scan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.scanner.Scan parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.scanner.Scan parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.scanner.Scan parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.scanner.Scan parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.scanner.Scan parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.scanner.Scan parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.scanner.Scan parseFrom(
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
  public static Builder newBuilder(com.proto.scanner.Scan prototype) {
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
   * Protobuf type {@code scanner.Scan}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scanner.Scan)
      com.proto.scanner.ScanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.scanner.Scanner.internal_static_scanner_Scan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.scanner.Scanner.internal_static_scanner_Scan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.scanner.Scan.class, com.proto.scanner.Scan.Builder.class);
    }

    // Construct using com.proto.scanner.Scan.newBuilder()
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
      barcode_ = 0;

      item_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.scanner.Scanner.internal_static_scanner_Scan_descriptor;
    }

    @java.lang.Override
    public com.proto.scanner.Scan getDefaultInstanceForType() {
      return com.proto.scanner.Scan.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.scanner.Scan build() {
      com.proto.scanner.Scan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.scanner.Scan buildPartial() {
      com.proto.scanner.Scan result = new com.proto.scanner.Scan(this);
      result.barcode_ = barcode_;
      result.item_ = item_;
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
      if (other instanceof com.proto.scanner.Scan) {
        return mergeFrom((com.proto.scanner.Scan)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.scanner.Scan other) {
      if (other == com.proto.scanner.Scan.getDefaultInstance()) return this;
      if (other.getBarcode() != 0) {
        setBarcode(other.getBarcode());
      }
      if (!other.getItem().isEmpty()) {
        item_ = other.item_;
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
      com.proto.scanner.Scan parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.scanner.Scan) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int barcode_ ;
    /**
     * <code>int32 barcode = 1;</code>
     * @return The barcode.
     */
    public int getBarcode() {
      return barcode_;
    }
    /**
     * <code>int32 barcode = 1;</code>
     * @param value The barcode to set.
     * @return This builder for chaining.
     */
    public Builder setBarcode(int value) {
      
      barcode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 barcode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBarcode() {
      
      barcode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object item_ = "";
    /**
     * <code>string item = 2;</code>
     * @return The item.
     */
    public java.lang.String getItem() {
      java.lang.Object ref = item_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        item_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string item = 2;</code>
     * @return The bytes for item.
     */
    public com.google.protobuf.ByteString
        getItemBytes() {
      java.lang.Object ref = item_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        item_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string item = 2;</code>
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      item_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string item = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      
      item_ = getDefaultInstance().getItem();
      onChanged();
      return this;
    }
    /**
     * <code>string item = 2;</code>
     * @param value The bytes for item to set.
     * @return This builder for chaining.
     */
    public Builder setItemBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      item_ = value;
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


    // @@protoc_insertion_point(builder_scope:scanner.Scan)
  }

  // @@protoc_insertion_point(class_scope:scanner.Scan)
  private static final com.proto.scanner.Scan DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.scanner.Scan();
  }

  public static com.proto.scanner.Scan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Scan>
      PARSER = new com.google.protobuf.AbstractParser<Scan>() {
    @java.lang.Override
    public Scan parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Scan(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Scan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Scan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.scanner.Scan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

