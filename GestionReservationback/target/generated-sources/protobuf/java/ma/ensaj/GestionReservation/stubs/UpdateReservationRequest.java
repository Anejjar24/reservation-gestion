// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.ensaj.GestionReservation.stubs;

/**
 * Protobuf type {@code UpdateReservationRequest}
 */
public final class UpdateReservationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateReservationRequest)
    UpdateReservationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateReservationRequest.newBuilder() to construct.
  private UpdateReservationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateReservationRequest() {
    dateDebut_ = "";
    dateFin_ = "";
    preferences_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateReservationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ma.ensaj.GestionReservation.stubs.ReservationServiceOuterClass.internal_static_UpdateReservationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.ensaj.GestionReservation.stubs.ReservationServiceOuterClass.internal_static_UpdateReservationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.class, ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CLIENT_FIELD_NUMBER = 2;
  private ma.ensaj.GestionReservation.stubs.Client client_;
  /**
   * <code>.Client client = 2;</code>
   * @return Whether the client field is set.
   */
  @java.lang.Override
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.Client client = 2;</code>
   * @return The client.
   */
  @java.lang.Override
  public ma.ensaj.GestionReservation.stubs.Client getClient() {
    return client_ == null ? ma.ensaj.GestionReservation.stubs.Client.getDefaultInstance() : client_;
  }
  /**
   * <code>.Client client = 2;</code>
   */
  @java.lang.Override
  public ma.ensaj.GestionReservation.stubs.ClientOrBuilder getClientOrBuilder() {
    return getClient();
  }

  public static final int CHAMBRE_FIELD_NUMBER = 3;
  private ma.ensaj.GestionReservation.stubs.Chambre chambre_;
  /**
   * <code>.Chambre chambre = 3;</code>
   * @return Whether the chambre field is set.
   */
  @java.lang.Override
  public boolean hasChambre() {
    return chambre_ != null;
  }
  /**
   * <code>.Chambre chambre = 3;</code>
   * @return The chambre.
   */
  @java.lang.Override
  public ma.ensaj.GestionReservation.stubs.Chambre getChambre() {
    return chambre_ == null ? ma.ensaj.GestionReservation.stubs.Chambre.getDefaultInstance() : chambre_;
  }
  /**
   * <code>.Chambre chambre = 3;</code>
   */
  @java.lang.Override
  public ma.ensaj.GestionReservation.stubs.ChambreOrBuilder getChambreOrBuilder() {
    return getChambre();
  }

  public static final int DATEDEBUT_FIELD_NUMBER = 4;
  private volatile java.lang.Object dateDebut_;
  /**
   * <code>string dateDebut = 4;</code>
   * @return The dateDebut.
   */
  @java.lang.Override
  public java.lang.String getDateDebut() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateDebut_ = s;
      return s;
    }
  }
  /**
   * <code>string dateDebut = 4;</code>
   * @return The bytes for dateDebut.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateDebutBytes() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateDebut_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATEFIN_FIELD_NUMBER = 5;
  private volatile java.lang.Object dateFin_;
  /**
   * <code>string dateFin = 5;</code>
   * @return The dateFin.
   */
  @java.lang.Override
  public java.lang.String getDateFin() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateFin_ = s;
      return s;
    }
  }
  /**
   * <code>string dateFin = 5;</code>
   * @return The bytes for dateFin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateFinBytes() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateFin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREFERENCES_FIELD_NUMBER = 6;
  private volatile java.lang.Object preferences_;
  /**
   * <code>string preferences = 6;</code>
   * @return The preferences.
   */
  @java.lang.Override
  public java.lang.String getPreferences() {
    java.lang.Object ref = preferences_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preferences_ = s;
      return s;
    }
  }
  /**
   * <code>string preferences = 6;</code>
   * @return The bytes for preferences.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPreferencesBytes() {
    java.lang.Object ref = preferences_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preferences_ = b;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (client_ != null) {
      output.writeMessage(2, getClient());
    }
    if (chambre_ != null) {
      output.writeMessage(3, getChambre());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateDebut_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dateDebut_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateFin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, dateFin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(preferences_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, preferences_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClient());
    }
    if (chambre_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getChambre());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateDebut_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dateDebut_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateFin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, dateFin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(preferences_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, preferences_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ma.ensaj.GestionReservation.stubs.UpdateReservationRequest)) {
      return super.equals(obj);
    }
    ma.ensaj.GestionReservation.stubs.UpdateReservationRequest other = (ma.ensaj.GestionReservation.stubs.UpdateReservationRequest) obj;

    if (getId()
        != other.getId()) return false;
    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
    }
    if (hasChambre() != other.hasChambre()) return false;
    if (hasChambre()) {
      if (!getChambre()
          .equals(other.getChambre())) return false;
    }
    if (!getDateDebut()
        .equals(other.getDateDebut())) return false;
    if (!getDateFin()
        .equals(other.getDateFin())) return false;
    if (!getPreferences()
        .equals(other.getPreferences())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    if (hasChambre()) {
      hash = (37 * hash) + CHAMBRE_FIELD_NUMBER;
      hash = (53 * hash) + getChambre().hashCode();
    }
    hash = (37 * hash) + DATEDEBUT_FIELD_NUMBER;
    hash = (53 * hash) + getDateDebut().hashCode();
    hash = (37 * hash) + DATEFIN_FIELD_NUMBER;
    hash = (53 * hash) + getDateFin().hashCode();
    hash = (37 * hash) + PREFERENCES_FIELD_NUMBER;
    hash = (53 * hash) + getPreferences().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest parseFrom(
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
  public static Builder newBuilder(ma.ensaj.GestionReservation.stubs.UpdateReservationRequest prototype) {
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
   * Protobuf type {@code UpdateReservationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateReservationRequest)
      ma.ensaj.GestionReservation.stubs.UpdateReservationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.ensaj.GestionReservation.stubs.ReservationServiceOuterClass.internal_static_UpdateReservationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.ensaj.GestionReservation.stubs.ReservationServiceOuterClass.internal_static_UpdateReservationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.class, ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.Builder.class);
    }

    // Construct using ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      if (chambreBuilder_ == null) {
        chambre_ = null;
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }
      dateDebut_ = "";

      dateFin_ = "";

      preferences_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.ensaj.GestionReservation.stubs.ReservationServiceOuterClass.internal_static_UpdateReservationRequest_descriptor;
    }

    @java.lang.Override
    public ma.ensaj.GestionReservation.stubs.UpdateReservationRequest getDefaultInstanceForType() {
      return ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ma.ensaj.GestionReservation.stubs.UpdateReservationRequest build() {
      ma.ensaj.GestionReservation.stubs.UpdateReservationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.ensaj.GestionReservation.stubs.UpdateReservationRequest buildPartial() {
      ma.ensaj.GestionReservation.stubs.UpdateReservationRequest result = new ma.ensaj.GestionReservation.stubs.UpdateReservationRequest(this);
      result.id_ = id_;
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
      }
      if (chambreBuilder_ == null) {
        result.chambre_ = chambre_;
      } else {
        result.chambre_ = chambreBuilder_.build();
      }
      result.dateDebut_ = dateDebut_;
      result.dateFin_ = dateFin_;
      result.preferences_ = preferences_;
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
      if (other instanceof ma.ensaj.GestionReservation.stubs.UpdateReservationRequest) {
        return mergeFrom((ma.ensaj.GestionReservation.stubs.UpdateReservationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.ensaj.GestionReservation.stubs.UpdateReservationRequest other) {
      if (other == ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasClient()) {
        mergeClient(other.getClient());
      }
      if (other.hasChambre()) {
        mergeChambre(other.getChambre());
      }
      if (!other.getDateDebut().isEmpty()) {
        dateDebut_ = other.dateDebut_;
        onChanged();
      }
      if (!other.getDateFin().isEmpty()) {
        dateFin_ = other.dateFin_;
        onChanged();
      }
      if (!other.getPreferences().isEmpty()) {
        preferences_ = other.preferences_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getClientFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getChambreFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            case 34: {
              dateDebut_ = input.readStringRequireUtf8();

              break;
            } // case 34
            case 42: {
              dateFin_ = input.readStringRequireUtf8();

              break;
            } // case 42
            case 50: {
              preferences_ = input.readStringRequireUtf8();

              break;
            } // case 50
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private ma.ensaj.GestionReservation.stubs.Client client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.GestionReservation.stubs.Client, ma.ensaj.GestionReservation.stubs.Client.Builder, ma.ensaj.GestionReservation.stubs.ClientOrBuilder> clientBuilder_;
    /**
     * <code>.Client client = 2;</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.Client client = 2;</code>
     * @return The client.
     */
    public ma.ensaj.GestionReservation.stubs.Client getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? ma.ensaj.GestionReservation.stubs.Client.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.Client client = 2;</code>
     */
    public Builder setClient(ma.ensaj.GestionReservation.stubs.Client value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 2;</code>
     */
    public Builder setClient(
        ma.ensaj.GestionReservation.stubs.Client.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Client client = 2;</code>
     */
    public Builder mergeClient(ma.ensaj.GestionReservation.stubs.Client value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            ma.ensaj.GestionReservation.stubs.Client.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 2;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Client client = 2;</code>
     */
    public ma.ensaj.GestionReservation.stubs.Client.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.Client client = 2;</code>
     */
    public ma.ensaj.GestionReservation.stubs.ClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            ma.ensaj.GestionReservation.stubs.Client.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.Client client = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.GestionReservation.stubs.Client, ma.ensaj.GestionReservation.stubs.Client.Builder, ma.ensaj.GestionReservation.stubs.ClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ma.ensaj.GestionReservation.stubs.Client, ma.ensaj.GestionReservation.stubs.Client.Builder, ma.ensaj.GestionReservation.stubs.ClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
    }

    private ma.ensaj.GestionReservation.stubs.Chambre chambre_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.GestionReservation.stubs.Chambre, ma.ensaj.GestionReservation.stubs.Chambre.Builder, ma.ensaj.GestionReservation.stubs.ChambreOrBuilder> chambreBuilder_;
    /**
     * <code>.Chambre chambre = 3;</code>
     * @return Whether the chambre field is set.
     */
    public boolean hasChambre() {
      return chambreBuilder_ != null || chambre_ != null;
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     * @return The chambre.
     */
    public ma.ensaj.GestionReservation.stubs.Chambre getChambre() {
      if (chambreBuilder_ == null) {
        return chambre_ == null ? ma.ensaj.GestionReservation.stubs.Chambre.getDefaultInstance() : chambre_;
      } else {
        return chambreBuilder_.getMessage();
      }
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     */
    public Builder setChambre(ma.ensaj.GestionReservation.stubs.Chambre value) {
      if (chambreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chambre_ = value;
        onChanged();
      } else {
        chambreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     */
    public Builder setChambre(
        ma.ensaj.GestionReservation.stubs.Chambre.Builder builderForValue) {
      if (chambreBuilder_ == null) {
        chambre_ = builderForValue.build();
        onChanged();
      } else {
        chambreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     */
    public Builder mergeChambre(ma.ensaj.GestionReservation.stubs.Chambre value) {
      if (chambreBuilder_ == null) {
        if (chambre_ != null) {
          chambre_ =
            ma.ensaj.GestionReservation.stubs.Chambre.newBuilder(chambre_).mergeFrom(value).buildPartial();
        } else {
          chambre_ = value;
        }
        onChanged();
      } else {
        chambreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     */
    public Builder clearChambre() {
      if (chambreBuilder_ == null) {
        chambre_ = null;
        onChanged();
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     */
    public ma.ensaj.GestionReservation.stubs.Chambre.Builder getChambreBuilder() {
      
      onChanged();
      return getChambreFieldBuilder().getBuilder();
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     */
    public ma.ensaj.GestionReservation.stubs.ChambreOrBuilder getChambreOrBuilder() {
      if (chambreBuilder_ != null) {
        return chambreBuilder_.getMessageOrBuilder();
      } else {
        return chambre_ == null ?
            ma.ensaj.GestionReservation.stubs.Chambre.getDefaultInstance() : chambre_;
      }
    }
    /**
     * <code>.Chambre chambre = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.ensaj.GestionReservation.stubs.Chambre, ma.ensaj.GestionReservation.stubs.Chambre.Builder, ma.ensaj.GestionReservation.stubs.ChambreOrBuilder> 
        getChambreFieldBuilder() {
      if (chambreBuilder_ == null) {
        chambreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ma.ensaj.GestionReservation.stubs.Chambre, ma.ensaj.GestionReservation.stubs.Chambre.Builder, ma.ensaj.GestionReservation.stubs.ChambreOrBuilder>(
                getChambre(),
                getParentForChildren(),
                isClean());
        chambre_ = null;
      }
      return chambreBuilder_;
    }

    private java.lang.Object dateDebut_ = "";
    /**
     * <code>string dateDebut = 4;</code>
     * @return The dateDebut.
     */
    public java.lang.String getDateDebut() {
      java.lang.Object ref = dateDebut_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateDebut_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateDebut = 4;</code>
     * @return The bytes for dateDebut.
     */
    public com.google.protobuf.ByteString
        getDateDebutBytes() {
      java.lang.Object ref = dateDebut_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateDebut_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateDebut = 4;</code>
     * @param value The dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebut(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateDebut_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateDebut = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateDebut() {
      
      dateDebut_ = getDefaultInstance().getDateDebut();
      onChanged();
      return this;
    }
    /**
     * <code>string dateDebut = 4;</code>
     * @param value The bytes for dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebutBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateDebut_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dateFin_ = "";
    /**
     * <code>string dateFin = 5;</code>
     * @return The dateFin.
     */
    public java.lang.String getDateFin() {
      java.lang.Object ref = dateFin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateFin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateFin = 5;</code>
     * @return The bytes for dateFin.
     */
    public com.google.protobuf.ByteString
        getDateFinBytes() {
      java.lang.Object ref = dateFin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateFin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateFin = 5;</code>
     * @param value The dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateFin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateFin = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateFin() {
      
      dateFin_ = getDefaultInstance().getDateFin();
      onChanged();
      return this;
    }
    /**
     * <code>string dateFin = 5;</code>
     * @param value The bytes for dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateFin_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object preferences_ = "";
    /**
     * <code>string preferences = 6;</code>
     * @return The preferences.
     */
    public java.lang.String getPreferences() {
      java.lang.Object ref = preferences_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preferences_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string preferences = 6;</code>
     * @return The bytes for preferences.
     */
    public com.google.protobuf.ByteString
        getPreferencesBytes() {
      java.lang.Object ref = preferences_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preferences_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string preferences = 6;</code>
     * @param value The preferences to set.
     * @return This builder for chaining.
     */
    public Builder setPreferences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      preferences_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string preferences = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreferences() {
      
      preferences_ = getDefaultInstance().getPreferences();
      onChanged();
      return this;
    }
    /**
     * <code>string preferences = 6;</code>
     * @param value The bytes for preferences to set.
     * @return This builder for chaining.
     */
    public Builder setPreferencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      preferences_ = value;
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


    // @@protoc_insertion_point(builder_scope:UpdateReservationRequest)
  }

  // @@protoc_insertion_point(class_scope:UpdateReservationRequest)
  private static final ma.ensaj.GestionReservation.stubs.UpdateReservationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.ensaj.GestionReservation.stubs.UpdateReservationRequest();
  }

  public static ma.ensaj.GestionReservation.stubs.UpdateReservationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateReservationRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateReservationRequest>() {
    @java.lang.Override
    public UpdateReservationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateReservationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateReservationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.ensaj.GestionReservation.stubs.UpdateReservationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
