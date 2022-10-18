/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * The version of the OpenAPI document: v1.4.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.client;

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

/**
 * CancerTypesQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CancerTypesQuery {
  public static final String SERIALIZED_NAME_CANCER_TYPES = "cancerTypes";
  @SerializedName(SERIALIZED_NAME_CANCER_TYPES)
  private List<String> cancerTypes = null;

  public CancerTypesQuery() { 
  }

  public CancerTypesQuery cancerTypes(List<String> cancerTypes) {
    
    this.cancerTypes = cancerTypes;
    return this;
  }

  public CancerTypesQuery addCancerTypesItem(String cancerTypesItem) {
    if (this.cancerTypes == null) {
      this.cancerTypes = new ArrayList<String>();
    }
    this.cancerTypes.add(cancerTypesItem);
    return this;
  }

   /**
   * Get cancerTypes
   * @return cancerTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCancerTypes() {
    return cancerTypes;
  }


  public void setCancerTypes(List<String> cancerTypes) {
    this.cancerTypes = cancerTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancerTypesQuery cancerTypesQuery = (CancerTypesQuery) o;
    return Objects.equals(this.cancerTypes, cancerTypesQuery.cancerTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancerTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancerTypesQuery {\n");
    sb.append("    cancerTypes: ").append(toIndentedString(cancerTypes)).append("\n");
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

