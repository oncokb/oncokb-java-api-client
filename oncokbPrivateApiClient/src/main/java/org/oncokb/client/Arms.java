/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * OpenAPI spec version: v1.2.1
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
import org.oncokb.client.Drug;

/**
 * Arms
 */

public class Arms {
  @SerializedName("armDescription")
  private String armDescription = null;

  @SerializedName("drugs")
  private List<Drug> drugs = null;

  public Arms armDescription(String armDescription) {
    this.armDescription = armDescription;
    return this;
  }

   /**
   * Get armDescription
   * @return armDescription
  **/
  @ApiModelProperty(value = "")
  public String getArmDescription() {
    return armDescription;
  }

  public void setArmDescription(String armDescription) {
    this.armDescription = armDescription;
  }

  public Arms drugs(List<Drug> drugs) {
    this.drugs = drugs;
    return this;
  }

  public Arms addDrugsItem(Drug drugsItem) {
    if (this.drugs == null) {
      this.drugs = new ArrayList<Drug>();
    }
    this.drugs.add(drugsItem);
    return this;
  }

   /**
   * Get drugs
   * @return drugs
  **/
  @ApiModelProperty(value = "")
  public List<Drug> getDrugs() {
    return drugs;
  }

  public void setDrugs(List<Drug> drugs) {
    this.drugs = drugs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Arms arms = (Arms) o;
    return Objects.equals(this.armDescription, arms.armDescription) &&
        Objects.equals(this.drugs, arms.drugs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(armDescription, drugs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Arms {\n");
    
    sb.append("    armDescription: ").append(toIndentedString(armDescription)).append("\n");
    sb.append("    drugs: ").append(toIndentedString(drugs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

