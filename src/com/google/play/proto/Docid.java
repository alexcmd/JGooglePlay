// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/DocumentId.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class Docid extends Message {

  public static final String DEFAULT_BACKENDDOCID = "";
  public static final Integer DEFAULT_TYPE = 0;
  public static final Integer DEFAULT_BACKEND = 0;

  @ProtoField(tag = 1, type = STRING)
  public final String backendDocid;

  @ProtoField(tag = 2, type = INT32)
  public final Integer type;

  @ProtoField(tag = 3, type = INT32)
  public final Integer backend;

  public Docid(String backendDocid, Integer type, Integer backend) {
    this.backendDocid = backendDocid;
    this.type = type;
    this.backend = backend;
  }

  private Docid(Builder builder) {
    this(builder.backendDocid, builder.type, builder.backend);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Docid)) return false;
    Docid o = (Docid) other;
    return equals(backendDocid, o.backendDocid)
        && equals(type, o.type)
        && equals(backend, o.backend);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = backendDocid != null ? backendDocid.hashCode() : 0;
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (backend != null ? backend.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Docid> {

    public String backendDocid;
    public Integer type;
    public Integer backend;

    public Builder() {
    }

    public Builder(Docid message) {
      super(message);
      if (message == null) return;
      this.backendDocid = message.backendDocid;
      this.type = message.type;
      this.backend = message.backend;
    }

    public Builder backendDocid(String backendDocid) {
      this.backendDocid = backendDocid;
      return this;
    }

    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    public Builder backend(Integer backend) {
      this.backend = backend;
      return this;
    }

    @Override
    public Docid build() {
      return new Docid(this);
    }
  }
}