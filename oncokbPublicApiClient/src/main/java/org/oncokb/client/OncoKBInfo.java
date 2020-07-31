/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.1.0
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
import org.oncokb.client.InfoLevel;
import org.oncokb.client.Version;

/**
 * OncoKBInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-31T16:43:04.888-04:00")
public class OncoKBInfo {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("dataVersion")
  private Version dataVersion = null;

  @SerializedName("levels")
  private List<InfoLevel> levels = null;

  @SerializedName("ncitVersion")
  private String ncitVersion = null;

  @SerializedName("oncoTreeVersion")
  private String oncoTreeVersion = null;

  @SerializedName("publicInstance")
  private Boolean publicInstance = null;

  public OncoKBInfo apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(value = "")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public OncoKBInfo dataVersion(Version dataVersion) {
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Get dataVersion
   * @return dataVersion
  **/
  @ApiModelProperty(value = "")
  public Version getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(Version dataVersion) {
    this.dataVersion = dataVersion;
  }

  public OncoKBInfo levels(List<InfoLevel> levels) {
    this.levels = levels;
    return this;
  }

  public OncoKBInfo addLevelsItem(InfoLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<InfoLevel>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  @ApiModelProperty(value = "")
  public List<InfoLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<InfoLevel> levels) {
    this.levels = levels;
  }

  public OncoKBInfo ncitVersion(String ncitVersion) {
    this.ncitVersion = ncitVersion;
    return this;
  }

   /**
   * Get ncitVersion
   * @return ncitVersion
  **/
  @ApiModelProperty(value = "")
  public String getNcitVersion() {
    return ncitVersion;
  }

  public void setNcitVersion(String ncitVersion) {
    this.ncitVersion = ncitVersion;
  }

  public OncoKBInfo oncoTreeVersion(String oncoTreeVersion) {
    this.oncoTreeVersion = oncoTreeVersion;
    return this;
  }

   /**
   * Get oncoTreeVersion
   * @return oncoTreeVersion
  **/
  @ApiModelProperty(value = "")
  public String getOncoTreeVersion() {
    return oncoTreeVersion;
  }

  public void setOncoTreeVersion(String oncoTreeVersion) {
    this.oncoTreeVersion = oncoTreeVersion;
  }

  public OncoKBInfo publicInstance(Boolean publicInstance) {
    this.publicInstance = publicInstance;
    return this;
  }

   /**
   * Get publicInstance
   * @return publicInstance
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublicInstance() {
    return publicInstance;
  }

  public void setPublicInstance(Boolean publicInstance) {
    this.publicInstance = publicInstance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OncoKBInfo oncoKBInfo = (OncoKBInfo) o;
    return Objects.equals(this.apiVersion, oncoKBInfo.apiVersion) &&
        Objects.equals(this.dataVersion, oncoKBInfo.dataVersion) &&
        Objects.equals(this.levels, oncoKBInfo.levels) &&
        Objects.equals(this.ncitVersion, oncoKBInfo.ncitVersion) &&
        Objects.equals(this.oncoTreeVersion, oncoKBInfo.oncoTreeVersion) &&
        Objects.equals(this.publicInstance, oncoKBInfo.publicInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, dataVersion, levels, ncitVersion, oncoTreeVersion, publicInstance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OncoKBInfo {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    ncitVersion: ").append(toIndentedString(ncitVersion)).append("\n");
    sb.append("    oncoTreeVersion: ").append(toIndentedString(oncoTreeVersion)).append("\n");
    sb.append("    publicInstance: ").append(toIndentedString(publicInstance)).append("\n");
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

