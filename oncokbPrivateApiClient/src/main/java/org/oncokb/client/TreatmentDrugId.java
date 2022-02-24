/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * The version of the OpenAPI document: v1.2.2
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
import org.oncokb.client.Drug;

/**
 * TreatmentDrugId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TreatmentDrugId {
  public static final String SERIALIZED_NAME_DRUG = "drug";
  @SerializedName(SERIALIZED_NAME_DRUG)
  private Drug drug;

  public TreatmentDrugId() { 
  }

  public TreatmentDrugId drug(Drug drug) {
    
    this.drug = drug;
    return this;
  }

   /**
   * Get drug
   * @return drug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Drug getDrug() {
    return drug;
  }


  public void setDrug(Drug drug) {
    this.drug = drug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreatmentDrugId treatmentDrugId = (TreatmentDrugId) o;
    return Objects.equals(this.drug, treatmentDrugId.drug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreatmentDrugId {\n");
    sb.append("    drug: ").append(toIndentedString(drug)).append("\n");
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

