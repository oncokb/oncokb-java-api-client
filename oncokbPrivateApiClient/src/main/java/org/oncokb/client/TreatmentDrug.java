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
import org.oncokb.client.TreatmentDrugId;

/**
 * TreatmentDrug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TreatmentDrug {
  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_TREATMENT_DRUG_ID = "treatmentDrugId";
  @SerializedName(SERIALIZED_NAME_TREATMENT_DRUG_ID)
  private TreatmentDrugId treatmentDrugId;

  public TreatmentDrug() { 
  }

  public TreatmentDrug priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public TreatmentDrug treatmentDrugId(TreatmentDrugId treatmentDrugId) {
    
    this.treatmentDrugId = treatmentDrugId;
    return this;
  }

   /**
   * Get treatmentDrugId
   * @return treatmentDrugId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TreatmentDrugId getTreatmentDrugId() {
    return treatmentDrugId;
  }


  public void setTreatmentDrugId(TreatmentDrugId treatmentDrugId) {
    this.treatmentDrugId = treatmentDrugId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreatmentDrug treatmentDrug = (TreatmentDrug) o;
    return Objects.equals(this.priority, treatmentDrug.priority) &&
        Objects.equals(this.treatmentDrugId, treatmentDrug.treatmentDrugId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, treatmentDrugId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreatmentDrug {\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    treatmentDrugId: ").append(toIndentedString(treatmentDrugId)).append("\n");
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

