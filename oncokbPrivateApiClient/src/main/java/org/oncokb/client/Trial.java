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
import org.oncokb.client.Arms;

/**
 * Trial
 */

public class Trial {
  @SerializedName("arms")
  private List<Arms> arms = null;

  @SerializedName("briefTitle")
  private String briefTitle = null;

  @SerializedName("currentTrialStatus")
  private String currentTrialStatus = null;

  @SerializedName("isUSTrial")
  private Boolean isUSTrial = null;

  @SerializedName("nctId")
  private String nctId = null;

  @SerializedName("principalInvestigator")
  private String principalInvestigator = null;

  public Trial arms(List<Arms> arms) {
    this.arms = arms;
    return this;
  }

  public Trial addArmsItem(Arms armsItem) {
    if (this.arms == null) {
      this.arms = new ArrayList<Arms>();
    }
    this.arms.add(armsItem);
    return this;
  }

   /**
   * Get arms
   * @return arms
  **/
  @ApiModelProperty(value = "")
  public List<Arms> getArms() {
    return arms;
  }

  public void setArms(List<Arms> arms) {
    this.arms = arms;
  }

  public Trial briefTitle(String briefTitle) {
    this.briefTitle = briefTitle;
    return this;
  }

   /**
   * Get briefTitle
   * @return briefTitle
  **/
  @ApiModelProperty(value = "")
  public String getBriefTitle() {
    return briefTitle;
  }

  public void setBriefTitle(String briefTitle) {
    this.briefTitle = briefTitle;
  }

  public Trial currentTrialStatus(String currentTrialStatus) {
    this.currentTrialStatus = currentTrialStatus;
    return this;
  }

   /**
   * Get currentTrialStatus
   * @return currentTrialStatus
  **/
  @ApiModelProperty(value = "")
  public String getCurrentTrialStatus() {
    return currentTrialStatus;
  }

  public void setCurrentTrialStatus(String currentTrialStatus) {
    this.currentTrialStatus = currentTrialStatus;
  }

  public Trial isUSTrial(Boolean isUSTrial) {
    this.isUSTrial = isUSTrial;
    return this;
  }

   /**
   * Get isUSTrial
   * @return isUSTrial
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsUSTrial() {
    return isUSTrial;
  }

  public void setIsUSTrial(Boolean isUSTrial) {
    this.isUSTrial = isUSTrial;
  }

  public Trial nctId(String nctId) {
    this.nctId = nctId;
    return this;
  }

   /**
   * Get nctId
   * @return nctId
  **/
  @ApiModelProperty(value = "")
  public String getNctId() {
    return nctId;
  }

  public void setNctId(String nctId) {
    this.nctId = nctId;
  }

  public Trial principalInvestigator(String principalInvestigator) {
    this.principalInvestigator = principalInvestigator;
    return this;
  }

   /**
   * Get principalInvestigator
   * @return principalInvestigator
  **/
  @ApiModelProperty(value = "")
  public String getPrincipalInvestigator() {
    return principalInvestigator;
  }

  public void setPrincipalInvestigator(String principalInvestigator) {
    this.principalInvestigator = principalInvestigator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trial trial = (Trial) o;
    return Objects.equals(this.arms, trial.arms) &&
        Objects.equals(this.briefTitle, trial.briefTitle) &&
        Objects.equals(this.currentTrialStatus, trial.currentTrialStatus) &&
        Objects.equals(this.isUSTrial, trial.isUSTrial) &&
        Objects.equals(this.nctId, trial.nctId) &&
        Objects.equals(this.principalInvestigator, trial.principalInvestigator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arms, briefTitle, currentTrialStatus, isUSTrial, nctId, principalInvestigator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trial {\n");
    
    sb.append("    arms: ").append(toIndentedString(arms)).append("\n");
    sb.append("    briefTitle: ").append(toIndentedString(briefTitle)).append("\n");
    sb.append("    currentTrialStatus: ").append(toIndentedString(currentTrialStatus)).append("\n");
    sb.append("    isUSTrial: ").append(toIndentedString(isUSTrial)).append("\n");
    sb.append("    nctId: ").append(toIndentedString(nctId)).append("\n");
    sb.append("    principalInvestigator: ").append(toIndentedString(principalInvestigator)).append("\n");
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

