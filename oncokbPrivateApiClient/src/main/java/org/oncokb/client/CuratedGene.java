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

/**
 * CuratedGene
 */

public class CuratedGene {
  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("grch37Isoform")
  private String grch37Isoform = null;

  @SerializedName("grch37RefSeq")
  private String grch37RefSeq = null;

  @SerializedName("grch38Isoform")
  private String grch38Isoform = null;

  @SerializedName("grch38RefSeq")
  private String grch38RefSeq = null;

  @SerializedName("highestResistancLevel")
  private String highestResistancLevel = null;

  @SerializedName("highestResistanceLevel")
  private String highestResistanceLevel = null;

  @SerializedName("highestSensitiveLevel")
  private String highestSensitiveLevel = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("oncogene")
  private Boolean oncogene = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("tsg")
  private Boolean tsg = null;

  public CuratedGene entrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
  @ApiModelProperty(value = "")
  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public CuratedGene grch37Isoform(String grch37Isoform) {
    this.grch37Isoform = grch37Isoform;
    return this;
  }

   /**
   * Get grch37Isoform
   * @return grch37Isoform
  **/
  @ApiModelProperty(value = "")
  public String getGrch37Isoform() {
    return grch37Isoform;
  }

  public void setGrch37Isoform(String grch37Isoform) {
    this.grch37Isoform = grch37Isoform;
  }

  public CuratedGene grch37RefSeq(String grch37RefSeq) {
    this.grch37RefSeq = grch37RefSeq;
    return this;
  }

   /**
   * Get grch37RefSeq
   * @return grch37RefSeq
  **/
  @ApiModelProperty(value = "")
  public String getGrch37RefSeq() {
    return grch37RefSeq;
  }

  public void setGrch37RefSeq(String grch37RefSeq) {
    this.grch37RefSeq = grch37RefSeq;
  }

  public CuratedGene grch38Isoform(String grch38Isoform) {
    this.grch38Isoform = grch38Isoform;
    return this;
  }

   /**
   * Get grch38Isoform
   * @return grch38Isoform
  **/
  @ApiModelProperty(value = "")
  public String getGrch38Isoform() {
    return grch38Isoform;
  }

  public void setGrch38Isoform(String grch38Isoform) {
    this.grch38Isoform = grch38Isoform;
  }

  public CuratedGene grch38RefSeq(String grch38RefSeq) {
    this.grch38RefSeq = grch38RefSeq;
    return this;
  }

   /**
   * Get grch38RefSeq
   * @return grch38RefSeq
  **/
  @ApiModelProperty(value = "")
  public String getGrch38RefSeq() {
    return grch38RefSeq;
  }

  public void setGrch38RefSeq(String grch38RefSeq) {
    this.grch38RefSeq = grch38RefSeq;
  }

  public CuratedGene highestResistancLevel(String highestResistancLevel) {
    this.highestResistancLevel = highestResistancLevel;
    return this;
  }

   /**
   * Get highestResistancLevel
   * @return highestResistancLevel
  **/
  @ApiModelProperty(value = "")
  public String getHighestResistancLevel() {
    return highestResistancLevel;
  }

  public void setHighestResistancLevel(String highestResistancLevel) {
    this.highestResistancLevel = highestResistancLevel;
  }

  public CuratedGene highestResistanceLevel(String highestResistanceLevel) {
    this.highestResistanceLevel = highestResistanceLevel;
    return this;
  }

   /**
   * Get highestResistanceLevel
   * @return highestResistanceLevel
  **/
  @ApiModelProperty(value = "")
  public String getHighestResistanceLevel() {
    return highestResistanceLevel;
  }

  public void setHighestResistanceLevel(String highestResistanceLevel) {
    this.highestResistanceLevel = highestResistanceLevel;
  }

  public CuratedGene highestSensitiveLevel(String highestSensitiveLevel) {
    this.highestSensitiveLevel = highestSensitiveLevel;
    return this;
  }

   /**
   * Get highestSensitiveLevel
   * @return highestSensitiveLevel
  **/
  @ApiModelProperty(value = "")
  public String getHighestSensitiveLevel() {
    return highestSensitiveLevel;
  }

  public void setHighestSensitiveLevel(String highestSensitiveLevel) {
    this.highestSensitiveLevel = highestSensitiveLevel;
  }

  public CuratedGene hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public CuratedGene oncogene(Boolean oncogene) {
    this.oncogene = oncogene;
    return this;
  }

   /**
   * Get oncogene
   * @return oncogene
  **/
  @ApiModelProperty(value = "")
  public Boolean isOncogene() {
    return oncogene;
  }

  public void setOncogene(Boolean oncogene) {
    this.oncogene = oncogene;
  }

  public CuratedGene summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public CuratedGene tsg(Boolean tsg) {
    this.tsg = tsg;
    return this;
  }

   /**
   * Get tsg
   * @return tsg
  **/
  @ApiModelProperty(value = "")
  public Boolean isTsg() {
    return tsg;
  }

  public void setTsg(Boolean tsg) {
    this.tsg = tsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CuratedGene curatedGene = (CuratedGene) o;
    return Objects.equals(this.entrezGeneId, curatedGene.entrezGeneId) &&
        Objects.equals(this.grch37Isoform, curatedGene.grch37Isoform) &&
        Objects.equals(this.grch37RefSeq, curatedGene.grch37RefSeq) &&
        Objects.equals(this.grch38Isoform, curatedGene.grch38Isoform) &&
        Objects.equals(this.grch38RefSeq, curatedGene.grch38RefSeq) &&
        Objects.equals(this.highestResistancLevel, curatedGene.highestResistancLevel) &&
        Objects.equals(this.highestResistanceLevel, curatedGene.highestResistanceLevel) &&
        Objects.equals(this.highestSensitiveLevel, curatedGene.highestSensitiveLevel) &&
        Objects.equals(this.hugoSymbol, curatedGene.hugoSymbol) &&
        Objects.equals(this.oncogene, curatedGene.oncogene) &&
        Objects.equals(this.summary, curatedGene.summary) &&
        Objects.equals(this.tsg, curatedGene.tsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, grch37Isoform, grch37RefSeq, grch38Isoform, grch38RefSeq, highestResistancLevel, highestResistanceLevel, highestSensitiveLevel, hugoSymbol, oncogene, summary, tsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CuratedGene {\n");
    
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    grch37Isoform: ").append(toIndentedString(grch37Isoform)).append("\n");
    sb.append("    grch37RefSeq: ").append(toIndentedString(grch37RefSeq)).append("\n");
    sb.append("    grch38Isoform: ").append(toIndentedString(grch38Isoform)).append("\n");
    sb.append("    grch38RefSeq: ").append(toIndentedString(grch38RefSeq)).append("\n");
    sb.append("    highestResistancLevel: ").append(toIndentedString(highestResistancLevel)).append("\n");
    sb.append("    highestResistanceLevel: ").append(toIndentedString(highestResistanceLevel)).append("\n");
    sb.append("    highestSensitiveLevel: ").append(toIndentedString(highestSensitiveLevel)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    oncogene: ").append(toIndentedString(oncogene)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tsg: ").append(toIndentedString(tsg)).append("\n");
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

