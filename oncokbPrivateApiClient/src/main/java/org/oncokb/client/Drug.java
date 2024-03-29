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

/**
 * Drug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Drug {
  public static final String SERIALIZED_NAME_DRUG_NAME = "drugName";
  @SerializedName(SERIALIZED_NAME_DRUG_NAME)
  private String drugName;

  public static final String SERIALIZED_NAME_NCIT_CODE = "ncitCode";
  @SerializedName(SERIALIZED_NAME_NCIT_CODE)
  private String ncitCode;

  public Drug() { 
  }

  public Drug drugName(String drugName) {
    
    this.drugName = drugName;
    return this;
  }

   /**
   * Get drugName
   * @return drugName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDrugName() {
    return drugName;
  }


  public void setDrugName(String drugName) {
    this.drugName = drugName;
  }


  public Drug ncitCode(String ncitCode) {
    
    this.ncitCode = ncitCode;
    return this;
  }

   /**
   * Get ncitCode
   * @return ncitCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNcitCode() {
    return ncitCode;
  }


  public void setNcitCode(String ncitCode) {
    this.ncitCode = ncitCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drug drug = (Drug) o;
    return Objects.equals(this.drugName, drug.drugName) &&
        Objects.equals(this.ncitCode, drug.ncitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drugName, ncitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    sb.append("    drugName: ").append(toIndentedString(drugName)).append("\n");
    sb.append("    ncitCode: ").append(toIndentedString(ncitCode)).append("\n");
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

