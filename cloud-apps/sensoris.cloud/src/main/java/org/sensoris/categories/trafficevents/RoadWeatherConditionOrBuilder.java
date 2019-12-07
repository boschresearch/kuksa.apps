// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/traffic_events.proto

package org.sensoris.categories.trafficevents;

public interface RoadWeatherConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.trafficevents.RoadWeatherCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelope getEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 2;</code>
   */
  boolean hasDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 2;</code>
   */
  org.sensoris.types.base.EventDetectionStatus getDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 2;</code>
   */
  org.sensoris.types.base.EventDetectionStatusOrBuilder getDetectionStatusOrBuilder();

  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficevents.RoadWeatherCondition.TypeAndConfidence type_and_confidence = 3;</code>
   */
  boolean hasTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficevents.RoadWeatherCondition.TypeAndConfidence type_and_confidence = 3;</code>
   */
  org.sensoris.categories.trafficevents.RoadWeatherCondition.TypeAndConfidence getTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficevents.RoadWeatherCondition.TypeAndConfidence type_and_confidence = 3;</code>
   */
  org.sensoris.categories.trafficevents.RoadWeatherCondition.TypeAndConfidenceOrBuilder getTypeAndConfidenceOrBuilder();

  /**
   * <pre>
   * Depth of water or snow on road and accuracy.
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy depth_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  boolean hasDepthAndAccuracy();
  /**
   * <pre>
   * Depth of water or snow on road and accuracy.
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy depth_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getDepthAndAccuracy();
  /**
   * <pre>
   * Depth of water or snow on road and accuracy.
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy depth_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getDepthAndAccuracyOrBuilder();
}