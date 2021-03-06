// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/GooglePlus.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REPEATED;

public final class PlusOneData extends Message {

  public static final Boolean DEFAULT_SETBYUSER = false;
  public static final Long DEFAULT_TOTAL = 0L;
  public static final Long DEFAULT_CIRCLESTOTAL = 0L;
  public static final List<PlusPerson> DEFAULT_CIRCLESPEOPLE = Collections.emptyList();

  @ProtoField(tag = 1, type = BOOL)
  public final Boolean setByUser;

  @ProtoField(tag = 2, type = INT64)
  public final Long total;

  @ProtoField(tag = 3, type = INT64)
  public final Long circlesTotal;

  @ProtoField(tag = 4, label = REPEATED)
  public final List<PlusPerson> circlesPeople;

  public PlusOneData(Boolean setByUser, Long total, Long circlesTotal, List<PlusPerson> circlesPeople) {
    this.setByUser = setByUser;
    this.total = total;
    this.circlesTotal = circlesTotal;
    this.circlesPeople = immutableCopyOf(circlesPeople);
  }

  private PlusOneData(Builder builder) {
    this(builder.setByUser, builder.total, builder.circlesTotal, builder.circlesPeople);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PlusOneData)) return false;
    PlusOneData o = (PlusOneData) other;
    return equals(setByUser, o.setByUser)
        && equals(total, o.total)
        && equals(circlesTotal, o.circlesTotal)
        && equals(circlesPeople, o.circlesPeople);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = setByUser != null ? setByUser.hashCode() : 0;
      result = result * 37 + (total != null ? total.hashCode() : 0);
      result = result * 37 + (circlesTotal != null ? circlesTotal.hashCode() : 0);
      result = result * 37 + (circlesPeople != null ? circlesPeople.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PlusOneData> {

    public Boolean setByUser;
    public Long total;
    public Long circlesTotal;
    public List<PlusPerson> circlesPeople;

    public Builder() {
    }

    public Builder(PlusOneData message) {
      super(message);
      if (message == null) return;
      this.setByUser = message.setByUser;
      this.total = message.total;
      this.circlesTotal = message.circlesTotal;
      this.circlesPeople = copyOf(message.circlesPeople);
    }

    public Builder setByUser(Boolean setByUser) {
      this.setByUser = setByUser;
      return this;
    }

    public Builder total(Long total) {
      this.total = total;
      return this;
    }

    public Builder circlesTotal(Long circlesTotal) {
      this.circlesTotal = circlesTotal;
      return this;
    }

    public Builder circlesPeople(List<PlusPerson> circlesPeople) {
      this.circlesPeople = checkForNulls(circlesPeople);
      return this;
    }

    @Override
    public PlusOneData build() {
      return new PlusOneData(this);
    }
  }
}
