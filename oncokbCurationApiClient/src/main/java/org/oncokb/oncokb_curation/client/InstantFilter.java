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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * InstantFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstantFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EQUALS = "equals";
  @SerializedName(SERIALIZED_NAME_EQUALS)
  private OffsetDateTime equals;

  public static final String SERIALIZED_NAME_NOT_EQUALS = "notEquals";
  @SerializedName(SERIALIZED_NAME_NOT_EQUALS)
  private OffsetDateTime notEquals;

  public static final String SERIALIZED_NAME_SPECIFIED = "specified";
  @SerializedName(SERIALIZED_NAME_SPECIFIED)
  private Boolean specified;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private List<OffsetDateTime> in = null;

  public static final String SERIALIZED_NAME_NOT_IN = "notIn";
  @SerializedName(SERIALIZED_NAME_NOT_IN)
  private List<OffsetDateTime> notIn = null;

  public static final String SERIALIZED_NAME_GREATER_THAN = "greaterThan";
  @SerializedName(SERIALIZED_NAME_GREATER_THAN)
  private OffsetDateTime greaterThan;

  public static final String SERIALIZED_NAME_LESS_THAN = "lessThan";
  @SerializedName(SERIALIZED_NAME_LESS_THAN)
  private OffsetDateTime lessThan;

  public static final String SERIALIZED_NAME_GREATER_THAN_OR_EQUAL = "greaterThanOrEqual";
  @SerializedName(SERIALIZED_NAME_GREATER_THAN_OR_EQUAL)
  private OffsetDateTime greaterThanOrEqual;

  public static final String SERIALIZED_NAME_LESS_THAN_OR_EQUAL = "lessThanOrEqual";
  @SerializedName(SERIALIZED_NAME_LESS_THAN_OR_EQUAL)
  private OffsetDateTime lessThanOrEqual;

  public InstantFilter() { 
  }

  public InstantFilter equals(OffsetDateTime equals) {
    
    this.equals = equals;
    return this;
  }

   /**
   * Get equals
   * @return equals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEquals() {
    return equals;
  }


  public void setEquals(OffsetDateTime equals) {
    this.equals = equals;
  }


  public InstantFilter notEquals(OffsetDateTime notEquals) {
    
    this.notEquals = notEquals;
    return this;
  }

   /**
   * Get notEquals
   * @return notEquals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNotEquals() {
    return notEquals;
  }


  public void setNotEquals(OffsetDateTime notEquals) {
    this.notEquals = notEquals;
  }


  public InstantFilter specified(Boolean specified) {
    
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


  public InstantFilter in(List<OffsetDateTime> in) {
    
    this.in = in;
    return this;
  }

  public InstantFilter addInItem(OffsetDateTime inItem) {
    if (this.in == null) {
      this.in = new ArrayList<OffsetDateTime>();
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

  public List<OffsetDateTime> getIn() {
    return in;
  }


  public void setIn(List<OffsetDateTime> in) {
    this.in = in;
  }


  public InstantFilter notIn(List<OffsetDateTime> notIn) {
    
    this.notIn = notIn;
    return this;
  }

  public InstantFilter addNotInItem(OffsetDateTime notInItem) {
    if (this.notIn == null) {
      this.notIn = new ArrayList<OffsetDateTime>();
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

  public List<OffsetDateTime> getNotIn() {
    return notIn;
  }


  public void setNotIn(List<OffsetDateTime> notIn) {
    this.notIn = notIn;
  }


  public InstantFilter greaterThan(OffsetDateTime greaterThan) {
    
    this.greaterThan = greaterThan;
    return this;
  }

   /**
   * Get greaterThan
   * @return greaterThan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getGreaterThan() {
    return greaterThan;
  }


  public void setGreaterThan(OffsetDateTime greaterThan) {
    this.greaterThan = greaterThan;
  }


  public InstantFilter lessThan(OffsetDateTime lessThan) {
    
    this.lessThan = lessThan;
    return this;
  }

   /**
   * Get lessThan
   * @return lessThan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLessThan() {
    return lessThan;
  }


  public void setLessThan(OffsetDateTime lessThan) {
    this.lessThan = lessThan;
  }


  public InstantFilter greaterThanOrEqual(OffsetDateTime greaterThanOrEqual) {
    
    this.greaterThanOrEqual = greaterThanOrEqual;
    return this;
  }

   /**
   * Get greaterThanOrEqual
   * @return greaterThanOrEqual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getGreaterThanOrEqual() {
    return greaterThanOrEqual;
  }


  public void setGreaterThanOrEqual(OffsetDateTime greaterThanOrEqual) {
    this.greaterThanOrEqual = greaterThanOrEqual;
  }


  public InstantFilter lessThanOrEqual(OffsetDateTime lessThanOrEqual) {
    
    this.lessThanOrEqual = lessThanOrEqual;
    return this;
  }

   /**
   * Get lessThanOrEqual
   * @return lessThanOrEqual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLessThanOrEqual() {
    return lessThanOrEqual;
  }


  public void setLessThanOrEqual(OffsetDateTime lessThanOrEqual) {
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
    InstantFilter instantFilter = (InstantFilter) o;
    return Objects.equals(this.equals, instantFilter.equals) &&
        Objects.equals(this.notEquals, instantFilter.notEquals) &&
        Objects.equals(this.specified, instantFilter.specified) &&
        Objects.equals(this.in, instantFilter.in) &&
        Objects.equals(this.notIn, instantFilter.notIn) &&
        Objects.equals(this.greaterThan, instantFilter.greaterThan) &&
        Objects.equals(this.lessThan, instantFilter.lessThan) &&
        Objects.equals(this.greaterThanOrEqual, instantFilter.greaterThanOrEqual) &&
        Objects.equals(this.lessThanOrEqual, instantFilter.lessThanOrEqual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equals, notEquals, specified, in, notIn, greaterThan, lessThan, greaterThanOrEqual, lessThanOrEqual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantFilter {\n");
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
