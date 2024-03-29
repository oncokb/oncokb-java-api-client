/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
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
 * CancerGene
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CancerGene {
  public static final String SERIALIZED_NAME_ENTREZ_GENE_ID = "entrezGeneId";
  @SerializedName(SERIALIZED_NAME_ENTREZ_GENE_ID)
  private Integer entrezGeneId;

  public static final String SERIALIZED_NAME_FOUNDATION = "foundation";
  @SerializedName(SERIALIZED_NAME_FOUNDATION)
  private Boolean foundation;

  public static final String SERIALIZED_NAME_FOUNDATION_HEME = "foundationHeme";
  @SerializedName(SERIALIZED_NAME_FOUNDATION_HEME)
  private Boolean foundationHeme;

  public static final String SERIALIZED_NAME_GENE_ALIASES = "geneAliases";
  @SerializedName(SERIALIZED_NAME_GENE_ALIASES)
  private List<String> geneAliases = null;

  public static final String SERIALIZED_NAME_GRCH37_ISOFORM = "grch37Isoform";
  @SerializedName(SERIALIZED_NAME_GRCH37_ISOFORM)
  private String grch37Isoform;

  public static final String SERIALIZED_NAME_GRCH37_REF_SEQ = "grch37RefSeq";
  @SerializedName(SERIALIZED_NAME_GRCH37_REF_SEQ)
  private String grch37RefSeq;

  public static final String SERIALIZED_NAME_GRCH38_ISOFORM = "grch38Isoform";
  @SerializedName(SERIALIZED_NAME_GRCH38_ISOFORM)
  private String grch38Isoform;

  public static final String SERIALIZED_NAME_GRCH38_REF_SEQ = "grch38RefSeq";
  @SerializedName(SERIALIZED_NAME_GRCH38_REF_SEQ)
  private String grch38RefSeq;

  public static final String SERIALIZED_NAME_HUGO_SYMBOL = "hugoSymbol";
  @SerializedName(SERIALIZED_NAME_HUGO_SYMBOL)
  private String hugoSymbol;

  public static final String SERIALIZED_NAME_M_S_K_HEME = "mSKHeme";
  @SerializedName(SERIALIZED_NAME_M_S_K_HEME)
  private Boolean mSKHeme;

  public static final String SERIALIZED_NAME_M_S_K_IMPACT = "mSKImpact";
  @SerializedName(SERIALIZED_NAME_M_S_K_IMPACT)
  private Boolean mSKImpact;

  public static final String SERIALIZED_NAME_OCCURRENCE_COUNT = "occurrenceCount";
  @SerializedName(SERIALIZED_NAME_OCCURRENCE_COUNT)
  private Integer occurrenceCount;

  public static final String SERIALIZED_NAME_ONCOGENE = "oncogene";
  @SerializedName(SERIALIZED_NAME_ONCOGENE)
  private Boolean oncogene;

  public static final String SERIALIZED_NAME_ONCOKB_ANNOTATED = "oncokbAnnotated";
  @SerializedName(SERIALIZED_NAME_ONCOKB_ANNOTATED)
  private Boolean oncokbAnnotated;

  public static final String SERIALIZED_NAME_SANGER_C_G_C = "sangerCGC";
  @SerializedName(SERIALIZED_NAME_SANGER_C_G_C)
  private Boolean sangerCGC;

  public static final String SERIALIZED_NAME_TSG = "tsg";
  @SerializedName(SERIALIZED_NAME_TSG)
  private Boolean tsg;

  public static final String SERIALIZED_NAME_VOGELSTEIN = "vogelstein";
  @SerializedName(SERIALIZED_NAME_VOGELSTEIN)
  private Boolean vogelstein;

  public CancerGene() { 
  }

  public CancerGene entrezGeneId(Integer entrezGeneId) {
    
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }


  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }


  public CancerGene foundation(Boolean foundation) {
    
    this.foundation = foundation;
    return this;
  }

   /**
   * Get foundation
   * @return foundation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFoundation() {
    return foundation;
  }


  public void setFoundation(Boolean foundation) {
    this.foundation = foundation;
  }


  public CancerGene foundationHeme(Boolean foundationHeme) {
    
    this.foundationHeme = foundationHeme;
    return this;
  }

   /**
   * Get foundationHeme
   * @return foundationHeme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFoundationHeme() {
    return foundationHeme;
  }


  public void setFoundationHeme(Boolean foundationHeme) {
    this.foundationHeme = foundationHeme;
  }


  public CancerGene geneAliases(List<String> geneAliases) {
    
    this.geneAliases = geneAliases;
    return this;
  }

  public CancerGene addGeneAliasesItem(String geneAliasesItem) {
    if (this.geneAliases == null) {
      this.geneAliases = new ArrayList<String>();
    }
    this.geneAliases.add(geneAliasesItem);
    return this;
  }

   /**
   * Get geneAliases
   * @return geneAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGeneAliases() {
    return geneAliases;
  }


  public void setGeneAliases(List<String> geneAliases) {
    this.geneAliases = geneAliases;
  }


  public CancerGene grch37Isoform(String grch37Isoform) {
    
    this.grch37Isoform = grch37Isoform;
    return this;
  }

   /**
   * Get grch37Isoform
   * @return grch37Isoform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrch37Isoform() {
    return grch37Isoform;
  }


  public void setGrch37Isoform(String grch37Isoform) {
    this.grch37Isoform = grch37Isoform;
  }


  public CancerGene grch37RefSeq(String grch37RefSeq) {
    
    this.grch37RefSeq = grch37RefSeq;
    return this;
  }

   /**
   * Get grch37RefSeq
   * @return grch37RefSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrch37RefSeq() {
    return grch37RefSeq;
  }


  public void setGrch37RefSeq(String grch37RefSeq) {
    this.grch37RefSeq = grch37RefSeq;
  }


  public CancerGene grch38Isoform(String grch38Isoform) {
    
    this.grch38Isoform = grch38Isoform;
    return this;
  }

   /**
   * Get grch38Isoform
   * @return grch38Isoform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrch38Isoform() {
    return grch38Isoform;
  }


  public void setGrch38Isoform(String grch38Isoform) {
    this.grch38Isoform = grch38Isoform;
  }


  public CancerGene grch38RefSeq(String grch38RefSeq) {
    
    this.grch38RefSeq = grch38RefSeq;
    return this;
  }

   /**
   * Get grch38RefSeq
   * @return grch38RefSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrch38RefSeq() {
    return grch38RefSeq;
  }


  public void setGrch38RefSeq(String grch38RefSeq) {
    this.grch38RefSeq = grch38RefSeq;
  }


  public CancerGene hugoSymbol(String hugoSymbol) {
    
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHugoSymbol() {
    return hugoSymbol;
  }


  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }


  public CancerGene mSKHeme(Boolean mSKHeme) {
    
    this.mSKHeme = mSKHeme;
    return this;
  }

   /**
   * Get mSKHeme
   * @return mSKHeme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getmSKHeme() {
    return mSKHeme;
  }


  public void setmSKHeme(Boolean mSKHeme) {
    this.mSKHeme = mSKHeme;
  }


  public CancerGene mSKImpact(Boolean mSKImpact) {
    
    this.mSKImpact = mSKImpact;
    return this;
  }

   /**
   * Get mSKImpact
   * @return mSKImpact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getmSKImpact() {
    return mSKImpact;
  }


  public void setmSKImpact(Boolean mSKImpact) {
    this.mSKImpact = mSKImpact;
  }


  public CancerGene occurrenceCount(Integer occurrenceCount) {
    
    this.occurrenceCount = occurrenceCount;
    return this;
  }

   /**
   * Get occurrenceCount
   * @return occurrenceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOccurrenceCount() {
    return occurrenceCount;
  }


  public void setOccurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }


  public CancerGene oncogene(Boolean oncogene) {
    
    this.oncogene = oncogene;
    return this;
  }

   /**
   * Get oncogene
   * @return oncogene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOncogene() {
    return oncogene;
  }


  public void setOncogene(Boolean oncogene) {
    this.oncogene = oncogene;
  }


  public CancerGene oncokbAnnotated(Boolean oncokbAnnotated) {
    
    this.oncokbAnnotated = oncokbAnnotated;
    return this;
  }

   /**
   * Get oncokbAnnotated
   * @return oncokbAnnotated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOncokbAnnotated() {
    return oncokbAnnotated;
  }


  public void setOncokbAnnotated(Boolean oncokbAnnotated) {
    this.oncokbAnnotated = oncokbAnnotated;
  }


  public CancerGene sangerCGC(Boolean sangerCGC) {
    
    this.sangerCGC = sangerCGC;
    return this;
  }

   /**
   * Get sangerCGC
   * @return sangerCGC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSangerCGC() {
    return sangerCGC;
  }


  public void setSangerCGC(Boolean sangerCGC) {
    this.sangerCGC = sangerCGC;
  }


  public CancerGene tsg(Boolean tsg) {
    
    this.tsg = tsg;
    return this;
  }

   /**
   * Get tsg
   * @return tsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTsg() {
    return tsg;
  }


  public void setTsg(Boolean tsg) {
    this.tsg = tsg;
  }


  public CancerGene vogelstein(Boolean vogelstein) {
    
    this.vogelstein = vogelstein;
    return this;
  }

   /**
   * Get vogelstein
   * @return vogelstein
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVogelstein() {
    return vogelstein;
  }


  public void setVogelstein(Boolean vogelstein) {
    this.vogelstein = vogelstein;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancerGene cancerGene = (CancerGene) o;
    return Objects.equals(this.entrezGeneId, cancerGene.entrezGeneId) &&
        Objects.equals(this.foundation, cancerGene.foundation) &&
        Objects.equals(this.foundationHeme, cancerGene.foundationHeme) &&
        Objects.equals(this.geneAliases, cancerGene.geneAliases) &&
        Objects.equals(this.grch37Isoform, cancerGene.grch37Isoform) &&
        Objects.equals(this.grch37RefSeq, cancerGene.grch37RefSeq) &&
        Objects.equals(this.grch38Isoform, cancerGene.grch38Isoform) &&
        Objects.equals(this.grch38RefSeq, cancerGene.grch38RefSeq) &&
        Objects.equals(this.hugoSymbol, cancerGene.hugoSymbol) &&
        Objects.equals(this.mSKHeme, cancerGene.mSKHeme) &&
        Objects.equals(this.mSKImpact, cancerGene.mSKImpact) &&
        Objects.equals(this.occurrenceCount, cancerGene.occurrenceCount) &&
        Objects.equals(this.oncogene, cancerGene.oncogene) &&
        Objects.equals(this.oncokbAnnotated, cancerGene.oncokbAnnotated) &&
        Objects.equals(this.sangerCGC, cancerGene.sangerCGC) &&
        Objects.equals(this.tsg, cancerGene.tsg) &&
        Objects.equals(this.vogelstein, cancerGene.vogelstein);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, foundation, foundationHeme, geneAliases, grch37Isoform, grch37RefSeq, grch38Isoform, grch38RefSeq, hugoSymbol, mSKHeme, mSKImpact, occurrenceCount, oncogene, oncokbAnnotated, sangerCGC, tsg, vogelstein);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancerGene {\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    foundation: ").append(toIndentedString(foundation)).append("\n");
    sb.append("    foundationHeme: ").append(toIndentedString(foundationHeme)).append("\n");
    sb.append("    geneAliases: ").append(toIndentedString(geneAliases)).append("\n");
    sb.append("    grch37Isoform: ").append(toIndentedString(grch37Isoform)).append("\n");
    sb.append("    grch37RefSeq: ").append(toIndentedString(grch37RefSeq)).append("\n");
    sb.append("    grch38Isoform: ").append(toIndentedString(grch38Isoform)).append("\n");
    sb.append("    grch38RefSeq: ").append(toIndentedString(grch38RefSeq)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    mSKHeme: ").append(toIndentedString(mSKHeme)).append("\n");
    sb.append("    mSKImpact: ").append(toIndentedString(mSKImpact)).append("\n");
    sb.append("    occurrenceCount: ").append(toIndentedString(occurrenceCount)).append("\n");
    sb.append("    oncogene: ").append(toIndentedString(oncogene)).append("\n");
    sb.append("    oncokbAnnotated: ").append(toIndentedString(oncokbAnnotated)).append("\n");
    sb.append("    sangerCGC: ").append(toIndentedString(sangerCGC)).append("\n");
    sb.append("    tsg: ").append(toIndentedString(tsg)).append("\n");
    sb.append("    vogelstein: ").append(toIndentedString(vogelstein)).append("\n");
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

