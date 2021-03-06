// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Reviews.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REPEATED;

public final class GetReviewsResponse extends Message {

  public static final List<Review> DEFAULT_REVIEW = Collections.emptyList();
  public static final Long DEFAULT_MATCHINGCOUNT = 0L;

  @ProtoField(tag = 1, label = REPEATED)
  public final List<Review> review;

  @ProtoField(tag = 2, type = INT64)
  public final Long matchingCount;

  public GetReviewsResponse(List<Review> review, Long matchingCount) {
    this.review = immutableCopyOf(review);
    this.matchingCount = matchingCount;
  }

  private GetReviewsResponse(Builder builder) {
    this(builder.review, builder.matchingCount);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetReviewsResponse)) return false;
    GetReviewsResponse o = (GetReviewsResponse) other;
    return equals(review, o.review)
        && equals(matchingCount, o.matchingCount);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = review != null ? review.hashCode() : 1;
      result = result * 37 + (matchingCount != null ? matchingCount.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<GetReviewsResponse> {

    public List<Review> review;
    public Long matchingCount;

    public Builder() {
    }

    public Builder(GetReviewsResponse message) {
      super(message);
      if (message == null) return;
      this.review = copyOf(message.review);
      this.matchingCount = message.matchingCount;
    }

    public Builder review(List<Review> review) {
      this.review = checkForNulls(review);
      return this;
    }

    public Builder matchingCount(Long matchingCount) {
      this.matchingCount = matchingCount;
      return this;
    }

    @Override
    public GetReviewsResponse build() {
      return new GetReviewsResponse(this);
    }
  }
}
