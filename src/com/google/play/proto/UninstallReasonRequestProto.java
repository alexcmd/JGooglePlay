// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Uninstall.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class UninstallReasonRequestProto extends Message {

  public static final String DEFAULT_ASSETID = "";
  public static final Integer DEFAULT_REASON = 0;

  @ProtoField(tag = 1, type = STRING)
  public final String assetId;

  @ProtoField(tag = 2, type = INT32)
  public final Integer reason;

  public UninstallReasonRequestProto(String assetId, Integer reason) {
    this.assetId = assetId;
    this.reason = reason;
  }

  private UninstallReasonRequestProto(Builder builder) {
    this(builder.assetId, builder.reason);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UninstallReasonRequestProto)) return false;
    UninstallReasonRequestProto o = (UninstallReasonRequestProto) other;
    return equals(assetId, o.assetId)
        && equals(reason, o.reason);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = assetId != null ? assetId.hashCode() : 0;
      result = result * 37 + (reason != null ? reason.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<UninstallReasonRequestProto> {

    public String assetId;
    public Integer reason;

    public Builder() {
    }

    public Builder(UninstallReasonRequestProto message) {
      super(message);
      if (message == null) return;
      this.assetId = message.assetId;
      this.reason = message.reason;
    }

    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    public Builder reason(Integer reason) {
      this.reason = reason;
      return this;
    }

    @Override
    public UninstallReasonRequestProto build() {
      return new UninstallReasonRequestProto(this);
    }
  }
}
