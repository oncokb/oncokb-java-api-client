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
 * IntegerFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntegerFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EQUALS = "equals";
  @SerializedName(SERIALIZED_NAME_EQUALS)
  private Integer equals;

  public static final String SERIALIZED_NAME_NOT_EQUALS = "notEquals";
  @SerializedName(SERIALIZED_NAME_NOT_EQUALS)
  private Integer notEquals;

  public static final String SERIALIZED_NAME_SPECIFIED = "specified";
  @SerializedName(SERIALIZED_NAME_SPECIFIED)
  private Boolean specified;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private List<Integer> in = null;

  public static final String SERIALIZED_NAME_NOT_IN = "notIn";
  @SerializedName(SERIALIZED_NAME_NOT_IN)
  private List<Integer> notIn = null;

  public static final String SERIALIZED_NAME_GREATER_THAN = "greaterThan";
  @SerializedName(SERIALIZED_NAME_GREATER_THAN)
  private Integer greaterThan;

  public static final String SERIALIZED_NAME_LESS_THAN = "lessThan";
  @SerializedName(SERIALIZED_NAME_LESS_THAN)
  private Integer lessThan;

  public static final String SERIALIZED_NAME_GREATER_THAN_OR_EQUAL = "greaterThanOrEqual";
  @SerializedName(SERIALIZED_NAME_GREATER_THAN_OR_EQUAL)
  private Integer greaterThanOrEqual;

  public static final String SERIALIZED_NAME_LESS_THAN_OR_EQUAL = "lessThanOrEqual";
  @SerializedName(SERIALIZED_NAME_LESS_THAN_OR_EQUAL)
  private Integer lessThanOrEqual;

  public IntegerFilter() { 
  }

  public IntegerFilter equals(Integer equals) {
    
    this.equals = equals;
    return this;
  }

   /**
   * Get equals
   * @return equals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEquals() {
    return equals;
  }


  public void setEquals(Integer equals) {
    this.equals = equals;
  }


  public IntegerFilter notEquals(Integer notEquals) {
    
    this.notEquals = notEquals;
    return this;
  }

   /**
   * Get notEquals
   * @return notEquals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNotEquals() {
    return notEquals;
  }


  public void setNotEquals(Integer notEquals) {
    this.notEquals = notEquals;
  }


  public IntegerFilter specified(Boolean specified) {
    
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


  public IntegerFilter in(List<Integer> in) {
    
    this.in = in;
    return this;
  }

  public IntegerFilter addInItem(Integer inItem) {
    if (this.in == null) {
      this.in = new ArrayList<Integer>();
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

  public List<Integer> getIn() {
    return in;
  }


  public void setIn(List<Integer> in) {
    this.in = in;
  }


  public IntegerFilter notIn(List<Integer> notIn) {
    
    this.notIn = notIn;
    return this;
  }

  public IntegerFilter addNotInItem(Integer notInItem) {
    if (this.notIn == null) {
      this.notIn = new ArrayList<Integer>();
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

  public List<Integer> getNotIn() {
    return notIn;
  }


  public void setNotIn(List<Integer> notIn) {
    this.notIn = notIn;
  }


  public IntegerFilter greaterThan(Integer greaterThan) {
    
    this.greaterThan = greaterThan;
    return this;
  }

   /**
   * Get greaterThan
   * @return greaterThan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGreaterThan() {
    return greaterThan;
  }


  public void setGreaterThan(Integer greaterThan) {
    this.greaterThan = greaterThan;
  }


  public IntegerFilter lessThan(Integer lessThan) {
    
    this.lessThan = lessThan;
    return this;
  }

   /**
   * Get lessThan
   * @return lessThan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLessThan() {
    return lessThan;
  }


  public void setLessThan(Integer lessThan) {
    this.lessThan = lessThan;
  }


  public IntegerFilter greaterThanOrEqual(Integer greaterThanOrEqual) {
    
    this.greaterThanOrEqual = greaterThanOrEqual;
    return this;
  }

   /**
   * Get greaterThanOrEqual
   * @return greaterThanOrEqual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGreaterThanOrEqual() {
    return greaterThanOrEqual;
  }


  public void setGreaterThanOrEqual(Integer greaterThanOrEqual) {
    this.greaterThanOrEqual = greaterThanOrEqual;
  }


  public IntegerFilter lessThanOrEqual(Integer lessThanOrEqual) {
    
    this.lessThanOrEqual = lessThanOrEqual;
    return this;
  }

   /**
   * Get lessThanOrEqual
   * @return lessThanOrEqual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLessThanOrEqual() {
    return lessThanOrEqual;
  }


  public void setLessThanOrEqual(Integer lessThanOrEqual) {
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
    IntegerFilter integerFilter = (IntegerFilter) o;
    return Objects.equals(this.equals, integerFilter.equals) &&
        Objects.equals(this.notEquals, integerFilter.notEquals) &&
        Objects.equals(this.specified, integerFilter.specified) &&
        Objects.equals(this.in, integerFilter.in) &&
        Objects.equals(this.notIn, integerFilter.notIn) &&
        Objects.equals(this.greaterThan, integerFilter.greaterThan) &&
        Objects.equals(this.lessThan, integerFilter.lessThan) &&
        Objects.equals(this.greaterThanOrEqual, integerFilter.greaterThanOrEqual) &&
        Objects.equals(this.lessThanOrEqual, integerFilter.lessThanOrEqual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equals, notEquals, specified, in, notIn, greaterThan, lessThan, greaterThanOrEqual, lessThanOrEqual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegerFilter {\n");
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
