/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.oncokb_curation.client;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * LongFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LongFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EQUALS = "equals";
  @SerializedName(SERIALIZED_NAME_EQUALS)
  private Long equals;

  public static final String SERIALIZED_NAME_NOT_EQUALS = "notEquals";
  @SerializedName(SERIALIZED_NAME_NOT_EQUALS)
  private Long notEquals;

  public static final String SERIALIZED_NAME_SPECIFIED = "specified";
  @SerializedName(SERIALIZED_NAME_SPECIFIED)
  private Boolean specified;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private List<Long> in = null;

  public static final String SERIALIZED_NAME_NOT_IN = "notIn";
  @SerializedName(SERIALIZED_NAME_NOT_IN)
  private List<Long> notIn = null;

  public static final String SERIALIZED_NAME_GREATER_THAN = "greaterThan";
  @SerializedName(SERIALIZED_NAME_GREATER_THAN)
  private Long greaterThan;

  public static final String SERIALIZED_NAME_LESS_THAN = "lessThan";
  @SerializedName(SERIALIZED_NAME_LESS_THAN)
  private Long lessThan;

  public static final String SERIALIZED_NAME_GREATER_THAN_OR_EQUAL = "greaterThanOrEqual";
  @SerializedName(SERIALIZED_NAME_GREATER_THAN_OR_EQUAL)
  private Long greaterThanOrEqual;

  public static final String SERIALIZED_NAME_LESS_THAN_OR_EQUAL = "lessThanOrEqual";
  @SerializedName(SERIALIZED_NAME_LESS_THAN_OR_EQUAL)
  private Long lessThanOrEqual;

  public LongFilter() { 
  }

  public LongFilter equals(Long equals) {
    
    this.equals = equals;
    return this;
  }

   /**
   * Get equals
   * @return equals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getEquals() {
    return equals;
  }


  public void setEquals(Long equals) {
    this.equals = equals;
  }


  public LongFilter notEquals(Long notEquals) {
    
    this.notEquals = notEquals;
    return this;
  }

   /**
   * Get notEquals
   * @return notEquals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getNotEquals() {
    return notEquals;
  }


  public void setNotEquals(Long notEquals) {
    this.notEquals = notEquals;
  }


  public LongFilter specified(Boolean specified) {
    
    this.specified = specified;
    return this;
  }

   /**
   * Get specified
   * @return specified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSpecified() {
    return specified;
  }


  public void setSpecified(Boolean specified) {
    this.specified = specified;
  }


  public LongFilter in(List<Long> in) {
    
    this.in = in;
    return this;
  }

  public LongFilter addInItem(Long inItem) {
    if (this.in == null) {
      this.in = new ArrayList<Long>();
    }
    this.in.add(inItem);
    return this;
  }

   /**
   * Get in
   * @return in
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIn() {
    return in;
  }


  public void setIn(List<Long> in) {
    this.in = in;
  }


  public LongFilter notIn(List<Long> notIn) {
    
    this.notIn = notIn;
    return this;
  }

  public LongFilter addNotInItem(Long notInItem) {
    if (this.notIn == null) {
      this.notIn = new ArrayList<Long>();
    }
    this.notIn.add(notInItem);
    return this;
  }

   /**
   * Get notIn
   * @return notIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getNotIn() {
    return notIn;
  }


  public void setNotIn(List<Long> notIn) {
    this.notIn = notIn;
  }


  public LongFilter greaterThan(Long greaterThan) {
    
    this.greaterThan = greaterThan;
    return this;
  }

   /**
   * Get greaterThan
   * @return greaterThan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGreaterThan() {
    return greaterThan;
  }


  public void setGreaterThan(Long greaterThan) {
    this.greaterThan = greaterThan;
  }


  public LongFilter lessThan(Long lessThan) {
    
    this.lessThan = lessThan;
    return this;
  }

   /**
   * Get lessThan
   * @return lessThan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLessThan() {
    return lessThan;
  }


  public void setLessThan(Long lessThan) {
    this.lessThan = lessThan;
  }


  public LongFilter greaterThanOrEqual(Long greaterThanOrEqual) {
    
    this.greaterThanOrEqual = greaterThanOrEqual;
    return this;
  }

   /**
   * Get greaterThanOrEqual
   * @return greaterThanOrEqual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGreaterThanOrEqual() {
    return greaterThanOrEqual;
  }


  public void setGreaterThanOrEqual(Long greaterThanOrEqual) {
    this.greaterThanOrEqual = greaterThanOrEqual;
  }


  public LongFilter lessThanOrEqual(Long lessThanOrEqual) {
    
    this.lessThanOrEqual = lessThanOrEqual;
    return this;
  }

   /**
   * Get lessThanOrEqual
   * @return lessThanOrEqual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLessThanOrEqual() {
    return lessThanOrEqual;
  }


  public void setLessThanOrEqual(Long lessThanOrEqual) {
    this.lessThanOrEqual = lessThanOrEqual;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongFilter longFilter = (LongFilter) o;
    return Objects.equals(this.equals, longFilter.equals) &&
        Objects.equals(this.notEquals, longFilter.notEquals) &&
        Objects.equals(this.specified, longFilter.specified) &&
        Objects.equals(this.in, longFilter.in) &&
        Objects.equals(this.notIn, longFilter.notIn) &&
        Objects.equals(this.greaterThan, longFilter.greaterThan) &&
        Objects.equals(this.lessThan, longFilter.lessThan) &&
        Objects.equals(this.greaterThanOrEqual, longFilter.greaterThanOrEqual) &&
        Objects.equals(this.lessThanOrEqual, longFilter.lessThanOrEqual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equals, notEquals, specified, in, notIn, greaterThan, lessThan, greaterThanOrEqual, lessThanOrEqual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongFilter {\n");
    sb.append("    equals: ").append(toIndentedString(equals)).append("\n");
    sb.append("    notEquals: ").append(toIndentedString(notEquals)).append("\n");
    sb.append("    specified: ").append(toIndentedString(specified)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    notIn: ").append(toIndentedString(notIn)).append("\n");
    sb.append("    greaterThan: ").append(toIndentedString(greaterThan)).append("\n");
    sb.append("    lessThan: ").append(toIndentedString(lessThan)).append("\n");
    sb.append("    greaterThanOrEqual: ").append(toIndentedString(greaterThanOrEqual)).append("\n");
    sb.append("    lessThanOrEqual: ").append(toIndentedString(lessThanOrEqual)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
