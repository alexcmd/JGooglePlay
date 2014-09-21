// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/App.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppSuggestionProto extends Message {

  @ProtoField(tag = 1)
  public final ExternalAssetProto assetInfo;

  public AppSuggestionProto(ExternalAssetProto assetInfo) {
    this.assetInfo = assetInfo;
  }

  private AppSuggestionProto(Builder builder) {
    this(builder.assetInfo);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AppSuggestionProto)) return false;
    return equals(assetInfo, ((AppSuggestionProto) other).assetInfo);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = assetInfo != null ? assetInfo.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<AppSuggestionProto> {

    public ExternalAssetProto assetInfo;

    public Builder() {
    }

    public Builder(AppSuggestionProto message) {
      super(message);
      if (message == null) return;
      this.assetInfo = message.assetInfo;
    }

    public Builder assetInfo(ExternalAssetProto assetInfo) {
      this.assetInfo = assetInfo;
      return this;
    }

    @Override
    public AppSuggestionProto build() {
      return new AppSuggestionProto(this);
    }
  }
}
