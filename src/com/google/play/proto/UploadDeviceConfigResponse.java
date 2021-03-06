// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/UploadDeviceConfig.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class UploadDeviceConfigResponse extends Message {

  public static final String DEFAULT_UPLOADDEVICECONFIGTOKEN = "";

  @ProtoField(tag = 1, type = STRING)
  public final String uploadDeviceConfigToken;

  public UploadDeviceConfigResponse(String uploadDeviceConfigToken) {
    this.uploadDeviceConfigToken = uploadDeviceConfigToken;
  }

  private UploadDeviceConfigResponse(Builder builder) {
    this(builder.uploadDeviceConfigToken);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UploadDeviceConfigResponse)) return false;
    return equals(uploadDeviceConfigToken, ((UploadDeviceConfigResponse) other).uploadDeviceConfigToken);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = uploadDeviceConfigToken != null ? uploadDeviceConfigToken.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<UploadDeviceConfigResponse> {

    public String uploadDeviceConfigToken;

    public Builder() {
    }

    public Builder(UploadDeviceConfigResponse message) {
      super(message);
      if (message == null) return;
      this.uploadDeviceConfigToken = message.uploadDeviceConfigToken;
    }

    public Builder uploadDeviceConfigToken(String uploadDeviceConfigToken) {
      this.uploadDeviceConfigToken = uploadDeviceConfigToken;
      return this;
    }

    @Override
    public UploadDeviceConfigResponse build() {
      return new UploadDeviceConfigResponse(this);
    }
  }
}
