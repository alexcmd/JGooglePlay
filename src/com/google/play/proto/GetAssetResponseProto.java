// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Download.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class GetAssetResponseProto extends Message {

  public static final List<FileMetadataProto> DEFAULT_ADDITIONALFILE = Collections.emptyList();

  @ProtoField(tag = 1)
  public final InstallAssetProto installAsset;

  @ProtoField(tag = 15, label = REPEATED)
  public final List<FileMetadataProto> additionalFile;

  public GetAssetResponseProto(InstallAssetProto installAsset, List<FileMetadataProto> additionalFile) {
    this.installAsset = installAsset;
    this.additionalFile = immutableCopyOf(additionalFile);
  }

  private GetAssetResponseProto(Builder builder) {
    this(builder.installAsset, builder.additionalFile);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetAssetResponseProto)) return false;
    GetAssetResponseProto o = (GetAssetResponseProto) other;
    return equals(installAsset, o.installAsset)
        && equals(additionalFile, o.additionalFile);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = installAsset != null ? installAsset.hashCode() : 0;
      result = result * 37 + (additionalFile != null ? additionalFile.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetAssetResponseProto> {

    public InstallAssetProto installAsset;
    public List<FileMetadataProto> additionalFile;

    public Builder() {
    }

    public Builder(GetAssetResponseProto message) {
      super(message);
      if (message == null) return;
      this.installAsset = message.installAsset;
      this.additionalFile = copyOf(message.additionalFile);
    }

    public Builder installAsset(InstallAssetProto installAsset) {
      this.installAsset = installAsset;
      return this;
    }

    public Builder additionalFile(List<FileMetadataProto> additionalFile) {
      this.additionalFile = checkForNulls(additionalFile);
      return this;
    }

    @Override
    public GetAssetResponseProto build() {
      return new GetAssetResponseProto(this);
    }
  }
}
