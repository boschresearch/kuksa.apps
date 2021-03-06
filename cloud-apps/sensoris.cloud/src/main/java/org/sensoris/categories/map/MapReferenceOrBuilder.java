// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/map.proto

package org.sensoris.categories.map;

public interface MapReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.map.MapReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Location reference of the map object.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference location_reference = 2;</code>
   */
  boolean hasLocationReference();
  /**
   * <pre>
   * Location reference of the map object.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference location_reference = 2;</code>
   */
  org.sensoris.types.spatial.MapLocationReference getLocationReference();
  /**
   * <pre>
   * Location reference of the map object.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference location_reference = 2;</code>
   */
  org.sensoris.types.spatial.MapLocationReferenceOrBuilder getLocationReferenceOrBuilder();
}
