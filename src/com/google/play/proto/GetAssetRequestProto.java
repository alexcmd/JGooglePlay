// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Download.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class GetAssetRequestProto extends Message {

  public static final String DEFAULT_ASSETID = "";
  public static final String DEFAULT_DIRECTDOWNLOADKEY = "";

  @ProtoField(tag = 1, type = STRING)
  public final String assetId;

  @ProtoField(tag = 2, type = STRING)
  public final String directDownloadKey;

  public GetAssetRequestProto(String assetId, String directDownloadKey) {
    this.assetId = assetId;
    this.directDownloadKey = directDownloadKey;
  }

  private GetAssetRequestProto(Builder builder) {
    this(builder.assetId, builder.directDownloadKey);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetAssetRequestProto)) return false;
    GetAssetRequestProto o = (GetAssetRequestProto) other;
    return equals(assetId, o.assetId)
        && equals(directDownloadKey, o.directDownloadKey);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = assetId != null ? assetId.hashCode() : 0;
      result = result * 37 + (directDownloadKey != null ? directDownloadKey.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetAssetRequestProto> {

    public String assetId;
    public String directDownloadKey;

    public Builder() {
    }

    public Builder(GetAssetRequestProto message) {
      super(message);
      if (message == null) return;
      this.assetId = message.assetId;
      this.directDownloadKey = message.directDownloadKey;
    }

    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    public Builder directDownloadKey(String directDownloadKey) {
      this.directDownloadKey = directDownloadKey;
      return this;
    }

    @Override
    public GetAssetRequestProto build() {
      return new GetAssetRequestProto(this);
    }
  }
}
