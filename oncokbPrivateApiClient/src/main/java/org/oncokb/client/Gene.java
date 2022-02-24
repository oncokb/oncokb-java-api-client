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
import java.util.ArrayList;
import java.util.List;
import org.oncokb.client.Geneset;

/**
 * Gene
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Gene {
  public static final String SERIALIZED_NAME_ENTREZ_GENE_ID = "entrezGeneId";
  @SerializedName(SERIALIZED_NAME_ENTREZ_GENE_ID)
  private Integer entrezGeneId;

  public static final String SERIALIZED_NAME_GENE_ALIASES = "geneAliases";
  @SerializedName(SERIALIZED_NAME_GENE_ALIASES)
  private List<String> geneAliases = null;

  public static final String SERIALIZED_NAME_GENESETS = "genesets";
  @SerializedName(SERIALIZED_NAME_GENESETS)
  private List<Geneset> genesets = null;

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

  public static final String SERIALIZED_NAME_ONCOGENE = "oncogene";
  @SerializedName(SERIALIZED_NAME_ONCOGENE)
  private Boolean oncogene;

  public static final String SERIALIZED_NAME_TSG = "tsg";
  @SerializedName(SERIALIZED_NAME_TSG)
  private Boolean tsg;

  public Gene() { 
  }

  public Gene entrezGeneId(Integer entrezGeneId) {
    
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


  public Gene geneAliases(List<String> geneAliases) {
    
    this.geneAliases = geneAliases;
    return this;
  }

  public Gene addGeneAliasesItem(String geneAliasesItem) {
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


  public Gene genesets(List<Geneset> genesets) {
    
    this.genesets = genesets;
    return this;
  }

  public Gene addGenesetsItem(Geneset genesetsItem) {
    if (this.genesets == null) {
      this.genesets = new ArrayList<Geneset>();
    }
    this.genesets.add(genesetsItem);
    return this;
  }

   /**
   * Get genesets
   * @return genesets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Geneset> getGenesets() {
    return genesets;
  }


  public void setGenesets(List<Geneset> genesets) {
    this.genesets = genesets;
  }


  public Gene grch37Isoform(String grch37Isoform) {
    
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


  public Gene grch37RefSeq(String grch37RefSeq) {
    
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


  public Gene grch38Isoform(String grch38Isoform) {
    
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


  public Gene grch38RefSeq(String grch38RefSeq) {
    
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


  public Gene hugoSymbol(String hugoSymbol) {
    
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


  public Gene oncogene(Boolean oncogene) {
    
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


  public Gene tsg(Boolean tsg) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gene gene = (Gene) o;
    return Objects.equals(this.entrezGeneId, gene.entrezGeneId) &&
        Objects.equals(this.geneAliases, gene.geneAliases) &&
        Objects.equals(this.genesets, gene.genesets) &&
        Objects.equals(this.grch37Isoform, gene.grch37Isoform) &&
        Objects.equals(this.grch37RefSeq, gene.grch37RefSeq) &&
        Objects.equals(this.grch38Isoform, gene.grch38Isoform) &&
        Objects.equals(this.grch38RefSeq, gene.grch38RefSeq) &&
        Objects.equals(this.hugoSymbol, gene.hugoSymbol) &&
        Objects.equals(this.oncogene, gene.oncogene) &&
        Objects.equals(this.tsg, gene.tsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, geneAliases, genesets, grch37Isoform, grch37RefSeq, grch38Isoform, grch38RefSeq, hugoSymbol, oncogene, tsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gene {\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    geneAliases: ").append(toIndentedString(geneAliases)).append("\n");
    sb.append("    genesets: ").append(toIndentedString(genesets)).append("\n");
    sb.append("    grch37Isoform: ").append(toIndentedString(grch37Isoform)).append("\n");
    sb.append("    grch37RefSeq: ").append(toIndentedString(grch37RefSeq)).append("\n");
    sb.append("    grch38Isoform: ").append(toIndentedString(grch38Isoform)).append("\n");
    sb.append("    grch38RefSeq: ").append(toIndentedString(grch38RefSeq)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    oncogene: ").append(toIndentedString(oncogene)).append("\n");
    sb.append("    tsg: ").append(toIndentedString(tsg)).append("\n");
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

