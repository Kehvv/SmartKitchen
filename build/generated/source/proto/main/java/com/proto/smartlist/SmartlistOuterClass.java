// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartlist/smartlist.proto

package com.proto.smartlist;

public final class SmartlistOuterClass {
  private SmartlistOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartlist_Smartlist_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartlist_Smartlist_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartlist_CreateSmartListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartlist_CreateSmartListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartlist_CreateSmartListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartlist_CreateSmartListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartlist_ReadSmartListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartlist_ReadSmartListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartlist_ReadSmartListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartlist_ReadSmartListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031smartlist/smartlist.proto\022\tsmartlist\"E" +
      "\n\tSmartlist\022\n\n\002id\030\001 \001(\t\022\014\n\004item\030\002 \001(\t\022\r\n" +
      "\005price\030\003 \001(\001\022\017\n\007barcode\030\004 \001(\005\"A\n\026CreateS" +
      "martListRequest\022\'\n\tsmartlist\030\001 \001(\0132\024.sma" +
      "rtlist.Smartlist\"B\n\027CreateSmartListRespo" +
      "nse\022\'\n\tsmartlist\030\001 \001(\0132\024.smartlist.Smart" +
      "list\"\'\n\024ReadSmartListRequest\022\017\n\007item_id\030" +
      "\001 \001(\t\"@\n\025ReadSmartListResponse\022\'\n\tsmartl" +
      "ist\030\001 \001(\0132\024.smartlist.Smartlist2\304\001\n\020Smar" +
      "tListService\022Z\n\017CreateSmartList\022!.smartl" +
      "ist.CreateSmartListRequest\032\".smartlist.C" +
      "reateSmartListResponse\"\000\022T\n\rReadSmartLis" +
      "t\022\037.smartlist.ReadSmartListRequest\032 .sma" +
      "rtlist.ReadSmartListResponse\"\000B\027\n\023com.pr" +
      "oto.smartlistP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_smartlist_Smartlist_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartlist_Smartlist_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartlist_Smartlist_descriptor,
        new java.lang.String[] { "Id", "Item", "Price", "Barcode", });
    internal_static_smartlist_CreateSmartListRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartlist_CreateSmartListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartlist_CreateSmartListRequest_descriptor,
        new java.lang.String[] { "Smartlist", });
    internal_static_smartlist_CreateSmartListResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartlist_CreateSmartListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartlist_CreateSmartListResponse_descriptor,
        new java.lang.String[] { "Smartlist", });
    internal_static_smartlist_ReadSmartListRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartlist_ReadSmartListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartlist_ReadSmartListRequest_descriptor,
        new java.lang.String[] { "ItemId", });
    internal_static_smartlist_ReadSmartListResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartlist_ReadSmartListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartlist_ReadSmartListResponse_descriptor,
        new java.lang.String[] { "Smartlist", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}