// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/BadgeImage.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class ExternalBadgeProto extends Message {

  public static final String DEFAULT_LOCALIZEDTITLE = "";
  public static final String DEFAULT_LOCALIZEDDESCRIPTION = "";
  public static final List<ExternalBadgeImageProto> DEFAULT_BADGEIMAGE = Collections.emptyList();
  public static final String DEFAULT_SEARCHID = "";

  @ProtoField(tag = 1, type = STRING)
  public final String localizedTitle;

  @ProtoField(tag = 2, type = STRING)
  public final String localizedDescription;

  @ProtoField(tag = 3, label = REPEATED)
  public final List<ExternalBadgeImageProto> badgeImage;

  @ProtoField(tag = 4, type = STRING)
  public final String searchId;

  public ExternalBadgeProto(String localizedTitle, String localizedDescription, List<ExternalBadgeImageProto> badgeImage, String searchId) {
    this.localizedTitle = localizedTitle;
    this.localizedDescription = localizedDescription;
    this.badgeImage = immutableCopyOf(badgeImage);
    this.searchId = searchId;
  }

  private ExternalBadgeProto(Builder builder) {
    this(builder.localizedTitle, builder.localizedDescription, builder.badgeImage, builder.searchId);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ExternalBadgeProto)) return false;
    ExternalBadgeProto o = (ExternalBadgeProto) other;
    return equals(localizedTitle, o.localizedTitle)
        && equals(localizedDescription, o.localizedDescription)
        && equals(badgeImage, o.badgeImage)
        && equals(searchId, o.searchId);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = localizedTitle != null ? localizedTitle.hashCode() : 0;
      result = result * 37 + (localizedDescription != null ? localizedDescription.hashCode() : 0);
      result = result * 37 + (badgeImage != null ? badgeImage.hashCode() : 1);
      result = result * 37 + (searchId != null ? searchId.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ExternalBadgeProto> {

    public String localizedTitle;
    public String localizedDescription;
    public List<ExternalBadgeImageProto> badgeImage;
    public String searchId;

    public Builder() {
    }

    public Builder(ExternalBadgeProto message) {
      super(message);
      if (message == null) return;
      this.localizedTitle = message.localizedTitle;
      this.localizedDescription = message.localizedDescription;
      this.badgeImage = copyOf(message.badgeImage);
      this.searchId = message.searchId;
    }

    public Builder localizedTitle(String localizedTitle) {
      this.localizedTitle = localizedTitle;
      return this;
    }

    public Builder localizedDescription(String localizedDescription) {
      this.localizedDescription = localizedDescription;
      return this;
    }

    public Builder badgeImage(List<ExternalBadgeImageProto> badgeImage) {
      this.badgeImage = checkForNulls(badgeImage);
      return this;
    }

    public Builder searchId(String searchId) {
      this.searchId = searchId;
      return this;
    }

    @Override
    public ExternalBadgeProto build() {
      return new ExternalBadgeProto(this);
    }
  }
}
