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
import org.oncokb.client.Article;
import org.oncokb.client.Gene;
import org.threeten.bp.OffsetDateTime;

/**
 * GeneEvidence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GeneEvidence {
  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<Article> articles = null;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_EVIDENCE_ID = "evidenceId";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_ID)
  private Integer evidenceId;

  /**
   * Gets or Sets evidenceType
   */
  @JsonAdapter(EvidenceTypeEnum.Adapter.class)
  public enum EvidenceTypeEnum {
    GENE_SUMMARY("GENE_SUMMARY"),
    
    MUTATION_SUMMARY("MUTATION_SUMMARY"),
    
    TUMOR_TYPE_SUMMARY("TUMOR_TYPE_SUMMARY"),
    
    GENE_TUMOR_TYPE_SUMMARY("GENE_TUMOR_TYPE_SUMMARY"),
    
    PROGNOSTIC_SUMMARY("PROGNOSTIC_SUMMARY"),
    
    DIAGNOSTIC_SUMMARY("DIAGNOSTIC_SUMMARY"),
    
    GENE_BACKGROUND("GENE_BACKGROUND"),
    
    ONCOGENIC("ONCOGENIC"),
    
    MUTATION_EFFECT("MUTATION_EFFECT"),
    
    VUS("VUS"),
    
    PROGNOSTIC_IMPLICATION("PROGNOSTIC_IMPLICATION"),
    
    DIAGNOSTIC_IMPLICATION("DIAGNOSTIC_IMPLICATION"),
    
    STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY("STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY"),
    
    STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE("STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE"),
    
    INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY("INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY"),
    
    INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE("INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE");

    private String value;

    EvidenceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EvidenceTypeEnum fromValue(String value) {
      for (EvidenceTypeEnum b : EvidenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EvidenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvidenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvidenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EvidenceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVIDENCE_TYPE = "evidenceType";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_TYPE)
  private EvidenceTypeEnum evidenceType;

  public static final String SERIALIZED_NAME_GENE = "gene";
  @SerializedName(SERIALIZED_NAME_GENE)
  private Gene gene;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_EDIT = "lastEdit";
  @SerializedName(SERIALIZED_NAME_LAST_EDIT)
  private OffsetDateTime lastEdit;

  public static final String SERIALIZED_NAME_SHORT_DESC = "shortDesc";
  @SerializedName(SERIALIZED_NAME_SHORT_DESC)
  private String shortDesc;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public GeneEvidence() { 
  }

  public GeneEvidence articles(List<Article> articles) {
    
    this.articles = articles;
    return this;
  }

  public GeneEvidence addArticlesItem(Article articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<Article>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * Get articles
   * @return articles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Article> getArticles() {
    return articles;
  }


  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }


  public GeneEvidence desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public GeneEvidence evidenceId(Integer evidenceId) {
    
    this.evidenceId = evidenceId;
    return this;
  }

   /**
   * Get evidenceId
   * @return evidenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getEvidenceId() {
    return evidenceId;
  }


  public void setEvidenceId(Integer evidenceId) {
    this.evidenceId = evidenceId;
  }


  public GeneEvidence evidenceType(EvidenceTypeEnum evidenceType) {
    
    this.evidenceType = evidenceType;
    return this;
  }

   /**
   * Get evidenceType
   * @return evidenceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EvidenceTypeEnum getEvidenceType() {
    return evidenceType;
  }


  public void setEvidenceType(EvidenceTypeEnum evidenceType) {
    this.evidenceType = evidenceType;
  }


  public GeneEvidence gene(Gene gene) {
    
    this.gene = gene;
    return this;
  }

   /**
   * Get gene
   * @return gene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Gene getGene() {
    return gene;
  }


  public void setGene(Gene gene) {
    this.gene = gene;
  }


  public GeneEvidence id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GeneEvidence lastEdit(OffsetDateTime lastEdit) {
    
    this.lastEdit = lastEdit;
    return this;
  }

   /**
   * Get lastEdit
   * @return lastEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastEdit() {
    return lastEdit;
  }


  public void setLastEdit(OffsetDateTime lastEdit) {
    this.lastEdit = lastEdit;
  }


  public GeneEvidence shortDesc(String shortDesc) {
    
    this.shortDesc = shortDesc;
    return this;
  }

   /**
   * Get shortDesc
   * @return shortDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShortDesc() {
    return shortDesc;
  }


  public void setShortDesc(String shortDesc) {
    this.shortDesc = shortDesc;
  }


  public GeneEvidence status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneEvidence geneEvidence = (GeneEvidence) o;
    return Objects.equals(this.articles, geneEvidence.articles) &&
        Objects.equals(this.desc, geneEvidence.desc) &&
        Objects.equals(this.evidenceId, geneEvidence.evidenceId) &&
        Objects.equals(this.evidenceType, geneEvidence.evidenceType) &&
        Objects.equals(this.gene, geneEvidence.gene) &&
        Objects.equals(this.id, geneEvidence.id) &&
        Objects.equals(this.lastEdit, geneEvidence.lastEdit) &&
        Objects.equals(this.shortDesc, geneEvidence.shortDesc) &&
        Objects.equals(this.status, geneEvidence.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, desc, evidenceId, evidenceType, gene, id, lastEdit, shortDesc, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneEvidence {\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    evidenceId: ").append(toIndentedString(evidenceId)).append("\n");
    sb.append("    evidenceType: ").append(toIndentedString(evidenceType)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastEdit: ").append(toIndentedString(lastEdit)).append("\n");
    sb.append("    shortDesc: ").append(toIndentedString(shortDesc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

