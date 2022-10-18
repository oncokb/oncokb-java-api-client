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
 * SemVer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SemVer {
  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private Integer major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private Integer minor;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private Integer patch;

  public static final String SERIALIZED_NAME_STABLE = "stable";
  @SerializedName(SERIALIZED_NAME_STABLE)
  private Boolean stable;

  public static final String SERIALIZED_NAME_SUFFIX_TOKENS = "suffixTokens";
  @SerializedName(SERIALIZED_NAME_SUFFIX_TOKENS)
  private List<String> suffixTokens = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public SemVer() { 
  }

  public SemVer major(Integer major) {
    
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMajor() {
    return major;
  }


  public void setMajor(Integer major) {
    this.major = major;
  }


  public SemVer minor(Integer minor) {
    
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinor() {
    return minor;
  }


  public void setMinor(Integer minor) {
    this.minor = minor;
  }


  public SemVer patch(Integer patch) {
    
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPatch() {
    return patch;
  }


  public void setPatch(Integer patch) {
    this.patch = patch;
  }


  public SemVer stable(Boolean stable) {
    
    this.stable = stable;
    return this;
  }

   /**
   * Get stable
   * @return stable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStable() {
    return stable;
  }


  public void setStable(Boolean stable) {
    this.stable = stable;
  }


  public SemVer suffixTokens(List<String> suffixTokens) {
    
    this.suffixTokens = suffixTokens;
    return this;
  }

  public SemVer addSuffixTokensItem(String suffixTokensItem) {
    if (this.suffixTokens == null) {
      this.suffixTokens = new ArrayList<String>();
    }
    this.suffixTokens.add(suffixTokensItem);
    return this;
  }

   /**
   * Get suffixTokens
   * @return suffixTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSuffixTokens() {
    return suffixTokens;
  }


  public void setSuffixTokens(List<String> suffixTokens) {
    this.suffixTokens = suffixTokens;
  }


  public SemVer version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemVer semVer = (SemVer) o;
    return Objects.equals(this.major, semVer.major) &&
        Objects.equals(this.minor, semVer.minor) &&
        Objects.equals(this.patch, semVer.patch) &&
        Objects.equals(this.stable, semVer.stable) &&
        Objects.equals(this.suffixTokens, semVer.suffixTokens) &&
        Objects.equals(this.version, semVer.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, patch, stable, suffixTokens, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemVer {\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    stable: ").append(toIndentedString(stable)).append("\n");
    sb.append("    suffixTokens: ").append(toIndentedString(suffixTokens)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

