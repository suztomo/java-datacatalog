// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog;

public interface TagTemplateFieldOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.TagTemplateField)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the tag template field in URL format.
   * Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the tag template field in URL format.
   * Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The display name for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The display name for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.FieldType getType();
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.FieldTypeOrBuilder getTypeOrBuilder();
}