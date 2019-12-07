// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/driving_behavior.proto

package org.sensoris.categories.drivingbehavior;

/**
 * <pre>
 * Driving behavior category.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory}
 */
public  final class DrivingBehaviorCategory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory)
    DrivingBehaviorCategoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DrivingBehaviorCategory.newBuilder() to construct.
  private DrivingBehaviorCategory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DrivingBehaviorCategory() {
    parkingStatus_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DrivingBehaviorCategory(
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
          case 10: {
            org.sensoris.types.base.CategoryEnvelope.Builder subBuilder = null;
            if (envelope_ != null) {
              subBuilder = envelope_.toBuilder();
            }
            envelope_ = input.readMessage(org.sensoris.types.base.CategoryEnvelope.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(envelope_);
              envelope_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              parkingStatus_ = new java.util.ArrayList<org.sensoris.categories.drivingbehavior.ParkingStatus>();
              mutable_bitField0_ |= 0x00000002;
            }
            parkingStatus_.add(
                input.readMessage(org.sensoris.categories.drivingbehavior.ParkingStatus.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        parkingStatus_ = java.util.Collections.unmodifiableList(parkingStatus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.categories.drivingbehavior.SensorisDrivingBehaviorCategory.internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.categories.drivingbehavior.SensorisDrivingBehaviorCategory.internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory.class, org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory.Builder.class);
  }

  private int bitField0_;
  public static final int ENVELOPE_FIELD_NUMBER = 1;
  private org.sensoris.types.base.CategoryEnvelope envelope_;
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public boolean hasEnvelope() {
    return envelope_ != null;
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
    return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
    return getEnvelope();
  }

  public static final int PARKING_STATUS_FIELD_NUMBER = 2;
  private java.util.List<org.sensoris.categories.drivingbehavior.ParkingStatus> parkingStatus_;
  /**
   * <pre>
   * Parking status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
   */
  public java.util.List<org.sensoris.categories.drivingbehavior.ParkingStatus> getParkingStatusList() {
    return parkingStatus_;
  }
  /**
   * <pre>
   * Parking status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
   */
  public java.util.List<? extends org.sensoris.categories.drivingbehavior.ParkingStatusOrBuilder> 
      getParkingStatusOrBuilderList() {
    return parkingStatus_;
  }
  /**
   * <pre>
   * Parking status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
   */
  public int getParkingStatusCount() {
    return parkingStatus_.size();
  }
  /**
   * <pre>
   * Parking status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
   */
  public org.sensoris.categories.drivingbehavior.ParkingStatus getParkingStatus(int index) {
    return parkingStatus_.get(index);
  }
  /**
   * <pre>
   * Parking status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
   */
  public org.sensoris.categories.drivingbehavior.ParkingStatusOrBuilder getParkingStatusOrBuilder(
      int index) {
    return parkingStatus_.get(index);
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
    if (envelope_ != null) {
      output.writeMessage(1, getEnvelope());
    }
    for (int i = 0; i < parkingStatus_.size(); i++) {
      output.writeMessage(2, parkingStatus_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (envelope_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvelope());
    }
    for (int i = 0; i < parkingStatus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, parkingStatus_.get(i));
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
    if (!(obj instanceof org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory)) {
      return super.equals(obj);
    }
    org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory other = (org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory) obj;

    boolean result = true;
    result = result && (hasEnvelope() == other.hasEnvelope());
    if (hasEnvelope()) {
      result = result && getEnvelope()
          .equals(other.getEnvelope());
    }
    result = result && getParkingStatusList()
        .equals(other.getParkingStatusList());
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
    if (hasEnvelope()) {
      hash = (37 * hash) + ENVELOPE_FIELD_NUMBER;
      hash = (53 * hash) + getEnvelope().hashCode();
    }
    if (getParkingStatusCount() > 0) {
      hash = (37 * hash) + PARKING_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getParkingStatusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parseFrom(
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
  public static Builder newBuilder(org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory prototype) {
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
   * Driving behavior category.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory)
      org.sensoris.categories.drivingbehavior.DrivingBehaviorCategoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.categories.drivingbehavior.SensorisDrivingBehaviorCategory.internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.categories.drivingbehavior.SensorisDrivingBehaviorCategory.internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory.class, org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory.Builder.class);
    }

    // Construct using org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory.newBuilder()
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
        getParkingStatusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (envelopeBuilder_ == null) {
        envelope_ = null;
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }
      if (parkingStatusBuilder_ == null) {
        parkingStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        parkingStatusBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.categories.drivingbehavior.SensorisDrivingBehaviorCategory.internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_descriptor;
    }

    @java.lang.Override
    public org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory getDefaultInstanceForType() {
      return org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory build() {
      org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory buildPartial() {
      org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory result = new org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (envelopeBuilder_ == null) {
        result.envelope_ = envelope_;
      } else {
        result.envelope_ = envelopeBuilder_.build();
      }
      if (parkingStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          parkingStatus_ = java.util.Collections.unmodifiableList(parkingStatus_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.parkingStatus_ = parkingStatus_;
      } else {
        result.parkingStatus_ = parkingStatusBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory) {
        return mergeFrom((org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory other) {
      if (other == org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory.getDefaultInstance()) return this;
      if (other.hasEnvelope()) {
        mergeEnvelope(other.getEnvelope());
      }
      if (parkingStatusBuilder_ == null) {
        if (!other.parkingStatus_.isEmpty()) {
          if (parkingStatus_.isEmpty()) {
            parkingStatus_ = other.parkingStatus_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParkingStatusIsMutable();
            parkingStatus_.addAll(other.parkingStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.parkingStatus_.isEmpty()) {
          if (parkingStatusBuilder_.isEmpty()) {
            parkingStatusBuilder_.dispose();
            parkingStatusBuilder_ = null;
            parkingStatus_ = other.parkingStatus_;
            bitField0_ = (bitField0_ & ~0x00000002);
            parkingStatusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParkingStatusFieldBuilder() : null;
          } else {
            parkingStatusBuilder_.addAllMessages(other.parkingStatus_);
          }
        }
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
      org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.sensoris.types.base.CategoryEnvelope envelope_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> envelopeBuilder_;
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public boolean hasEnvelope() {
      return envelopeBuilder_ != null || envelope_ != null;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
      if (envelopeBuilder_ == null) {
        return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      } else {
        return envelopeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        envelope_ = value;
        onChanged();
      } else {
        envelopeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(
        org.sensoris.types.base.CategoryEnvelope.Builder builderForValue) {
      if (envelopeBuilder_ == null) {
        envelope_ = builderForValue.build();
        onChanged();
      } else {
        envelopeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder mergeEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (envelope_ != null) {
          envelope_ =
            org.sensoris.types.base.CategoryEnvelope.newBuilder(envelope_).mergeFrom(value).buildPartial();
        } else {
          envelope_ = value;
        }
        onChanged();
      } else {
        envelopeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder clearEnvelope() {
      if (envelopeBuilder_ == null) {
        envelope_ = null;
        onChanged();
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelope.Builder getEnvelopeBuilder() {
      
      onChanged();
      return getEnvelopeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
      if (envelopeBuilder_ != null) {
        return envelopeBuilder_.getMessageOrBuilder();
      } else {
        return envelope_ == null ?
            org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> 
        getEnvelopeFieldBuilder() {
      if (envelopeBuilder_ == null) {
        envelopeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder>(
                getEnvelope(),
                getParentForChildren(),
                isClean());
        envelope_ = null;
      }
      return envelopeBuilder_;
    }

    private java.util.List<org.sensoris.categories.drivingbehavior.ParkingStatus> parkingStatus_ =
      java.util.Collections.emptyList();
    private void ensureParkingStatusIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        parkingStatus_ = new java.util.ArrayList<org.sensoris.categories.drivingbehavior.ParkingStatus>(parkingStatus_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.drivingbehavior.ParkingStatus, org.sensoris.categories.drivingbehavior.ParkingStatus.Builder, org.sensoris.categories.drivingbehavior.ParkingStatusOrBuilder> parkingStatusBuilder_;

    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public java.util.List<org.sensoris.categories.drivingbehavior.ParkingStatus> getParkingStatusList() {
      if (parkingStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parkingStatus_);
      } else {
        return parkingStatusBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public int getParkingStatusCount() {
      if (parkingStatusBuilder_ == null) {
        return parkingStatus_.size();
      } else {
        return parkingStatusBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public org.sensoris.categories.drivingbehavior.ParkingStatus getParkingStatus(int index) {
      if (parkingStatusBuilder_ == null) {
        return parkingStatus_.get(index);
      } else {
        return parkingStatusBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder setParkingStatus(
        int index, org.sensoris.categories.drivingbehavior.ParkingStatus value) {
      if (parkingStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParkingStatusIsMutable();
        parkingStatus_.set(index, value);
        onChanged();
      } else {
        parkingStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder setParkingStatus(
        int index, org.sensoris.categories.drivingbehavior.ParkingStatus.Builder builderForValue) {
      if (parkingStatusBuilder_ == null) {
        ensureParkingStatusIsMutable();
        parkingStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        parkingStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder addParkingStatus(org.sensoris.categories.drivingbehavior.ParkingStatus value) {
      if (parkingStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParkingStatusIsMutable();
        parkingStatus_.add(value);
        onChanged();
      } else {
        parkingStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder addParkingStatus(
        int index, org.sensoris.categories.drivingbehavior.ParkingStatus value) {
      if (parkingStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParkingStatusIsMutable();
        parkingStatus_.add(index, value);
        onChanged();
      } else {
        parkingStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder addParkingStatus(
        org.sensoris.categories.drivingbehavior.ParkingStatus.Builder builderForValue) {
      if (parkingStatusBuilder_ == null) {
        ensureParkingStatusIsMutable();
        parkingStatus_.add(builderForValue.build());
        onChanged();
      } else {
        parkingStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder addParkingStatus(
        int index, org.sensoris.categories.drivingbehavior.ParkingStatus.Builder builderForValue) {
      if (parkingStatusBuilder_ == null) {
        ensureParkingStatusIsMutable();
        parkingStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        parkingStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder addAllParkingStatus(
        java.lang.Iterable<? extends org.sensoris.categories.drivingbehavior.ParkingStatus> values) {
      if (parkingStatusBuilder_ == null) {
        ensureParkingStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parkingStatus_);
        onChanged();
      } else {
        parkingStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder clearParkingStatus() {
      if (parkingStatusBuilder_ == null) {
        parkingStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        parkingStatusBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public Builder removeParkingStatus(int index) {
      if (parkingStatusBuilder_ == null) {
        ensureParkingStatusIsMutable();
        parkingStatus_.remove(index);
        onChanged();
      } else {
        parkingStatusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public org.sensoris.categories.drivingbehavior.ParkingStatus.Builder getParkingStatusBuilder(
        int index) {
      return getParkingStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public org.sensoris.categories.drivingbehavior.ParkingStatusOrBuilder getParkingStatusOrBuilder(
        int index) {
      if (parkingStatusBuilder_ == null) {
        return parkingStatus_.get(index);  } else {
        return parkingStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public java.util.List<? extends org.sensoris.categories.drivingbehavior.ParkingStatusOrBuilder> 
         getParkingStatusOrBuilderList() {
      if (parkingStatusBuilder_ != null) {
        return parkingStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parkingStatus_);
      }
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public org.sensoris.categories.drivingbehavior.ParkingStatus.Builder addParkingStatusBuilder() {
      return getParkingStatusFieldBuilder().addBuilder(
          org.sensoris.categories.drivingbehavior.ParkingStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public org.sensoris.categories.drivingbehavior.ParkingStatus.Builder addParkingStatusBuilder(
        int index) {
      return getParkingStatusFieldBuilder().addBuilder(
          index, org.sensoris.categories.drivingbehavior.ParkingStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * Parking status.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.drivingbehavior.ParkingStatus parking_status = 2;</code>
     */
    public java.util.List<org.sensoris.categories.drivingbehavior.ParkingStatus.Builder> 
         getParkingStatusBuilderList() {
      return getParkingStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.drivingbehavior.ParkingStatus, org.sensoris.categories.drivingbehavior.ParkingStatus.Builder, org.sensoris.categories.drivingbehavior.ParkingStatusOrBuilder> 
        getParkingStatusFieldBuilder() {
      if (parkingStatusBuilder_ == null) {
        parkingStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.sensoris.categories.drivingbehavior.ParkingStatus, org.sensoris.categories.drivingbehavior.ParkingStatus.Builder, org.sensoris.categories.drivingbehavior.ParkingStatusOrBuilder>(
                parkingStatus_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        parkingStatus_ = null;
      }
      return parkingStatusBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory)
  private static final org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory();
  }

  public static org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DrivingBehaviorCategory>
      PARSER = new com.google.protobuf.AbstractParser<DrivingBehaviorCategory>() {
    @java.lang.Override
    public DrivingBehaviorCategory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DrivingBehaviorCategory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DrivingBehaviorCategory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DrivingBehaviorCategory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
