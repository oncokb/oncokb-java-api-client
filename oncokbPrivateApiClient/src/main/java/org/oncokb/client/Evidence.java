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
import org.oncokb.client.Alteration;
import org.oncokb.client.Article;
import org.oncokb.client.Gene;
import org.oncokb.client.Treatment;
import org.oncokb.client.TumorType;
import org.threeten.bp.OffsetDateTime;

/**
 * Evidence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-27T19:08:14.306-05:00")
public class Evidence {
  @SerializedName("additionalInfo")
  private String additionalInfo = null;

  @SerializedName("alterations")
  private List<Alteration> alterations = null;

  @SerializedName("articles")
  private List<Article> articles = null;

  @SerializedName("cancerTypes")
  private List<TumorType> cancerTypes = null;

  @SerializedName("description")
  private String description = null;

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

    public static EvidenceTypeEnum fromValue(String text) {
      for (EvidenceTypeEnum b : EvidenceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EvidenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvidenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvidenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EvidenceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("evidenceType")
  private EvidenceTypeEnum evidenceType = null;

  @SerializedName("gene")
  private Gene gene = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("knownEffect")
  private String knownEffect = null;

  @SerializedName("lastEdit")
  private OffsetDateTime lastEdit = null;

  @SerializedName("lastReview")
  private OffsetDateTime lastReview = null;

  /**
   * Gets or Sets levelOfEvidence
   */
  @JsonAdapter(LevelOfEvidenceEnum.Adapter.class)
  public enum LevelOfEvidenceEnum {
    LEVEL_0("LEVEL_0"),
    
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_2A("LEVEL_2A"),
    
    LEVEL_2B("LEVEL_2B"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_R3("LEVEL_R3"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    NO("NO");

    private String value;

    LevelOfEvidenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelOfEvidenceEnum fromValue(String text) {
      for (LevelOfEvidenceEnum b : LevelOfEvidenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LevelOfEvidenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelOfEvidenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelOfEvidenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LevelOfEvidenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("levelOfEvidence")
  private LevelOfEvidenceEnum levelOfEvidence = null;

  /**
   * Gets or Sets liquidPropagationLevel
   */
  @JsonAdapter(LiquidPropagationLevelEnum.Adapter.class)
  public enum LiquidPropagationLevelEnum {
    LEVEL_0("LEVEL_0"),
    
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_2A("LEVEL_2A"),
    
    LEVEL_2B("LEVEL_2B"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_R3("LEVEL_R3"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    NO("NO");

    private String value;

    LiquidPropagationLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LiquidPropagationLevelEnum fromValue(String text) {
      for (LiquidPropagationLevelEnum b : LiquidPropagationLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LiquidPropagationLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LiquidPropagationLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LiquidPropagationLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LiquidPropagationLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("liquidPropagationLevel")
  private LiquidPropagationLevelEnum liquidPropagationLevel = null;

  @SerializedName("relevantCancerTypes")
  private List<TumorType> relevantCancerTypes = null;

  /**
   * Gets or Sets solidPropagationLevel
   */
  @JsonAdapter(SolidPropagationLevelEnum.Adapter.class)
  public enum SolidPropagationLevelEnum {
    LEVEL_0("LEVEL_0"),
    
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_2A("LEVEL_2A"),
    
    LEVEL_2B("LEVEL_2B"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_R3("LEVEL_R3"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    NO("NO");

    private String value;

    SolidPropagationLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SolidPropagationLevelEnum fromValue(String text) {
      for (SolidPropagationLevelEnum b : SolidPropagationLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SolidPropagationLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SolidPropagationLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SolidPropagationLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SolidPropagationLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("solidPropagationLevel")
  private SolidPropagationLevelEnum solidPropagationLevel = null;

  @SerializedName("treatments")
  private List<Treatment> treatments = null;

  @SerializedName("uuid")
  private String uuid = null;

  public Evidence additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public Evidence alterations(List<Alteration> alterations) {
    this.alterations = alterations;
    return this;
  }

  public Evidence addAlterationsItem(Alteration alterationsItem) {
    if (this.alterations == null) {
      this.alterations = new ArrayList<Alteration>();
    }
    this.alterations.add(alterationsItem);
    return this;
  }

   /**
   * Get alterations
   * @return alterations
  **/
  @ApiModelProperty(value = "")
  public List<Alteration> getAlterations() {
    return alterations;
  }

  public void setAlterations(List<Alteration> alterations) {
    this.alterations = alterations;
  }

  public Evidence articles(List<Article> articles) {
    this.articles = articles;
    return this;
  }

  public Evidence addArticlesItem(Article articlesItem) {
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
  @ApiModelProperty(value = "")
  public List<Article> getArticles() {
    return articles;
  }

  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }

  public Evidence cancerTypes(List<TumorType> cancerTypes) {
    this.cancerTypes = cancerTypes;
    return this;
  }

  public Evidence addCancerTypesItem(TumorType cancerTypesItem) {
    if (this.cancerTypes == null) {
      this.cancerTypes = new ArrayList<TumorType>();
    }
    this.cancerTypes.add(cancerTypesItem);
    return this;
  }

   /**
   * Get cancerTypes
   * @return cancerTypes
  **/
  @ApiModelProperty(value = "")
  public List<TumorType> getCancerTypes() {
    return cancerTypes;
  }

  public void setCancerTypes(List<TumorType> cancerTypes) {
    this.cancerTypes = cancerTypes;
  }

  public Evidence description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Evidence evidenceType(EvidenceTypeEnum evidenceType) {
    this.evidenceType = evidenceType;
    return this;
  }

   /**
   * Get evidenceType
   * @return evidenceType
  **/
  @ApiModelProperty(value = "")
  public EvidenceTypeEnum getEvidenceType() {
    return evidenceType;
  }

  public void setEvidenceType(EvidenceTypeEnum evidenceType) {
    this.evidenceType = evidenceType;
  }

  public Evidence gene(Gene gene) {
    this.gene = gene;
    return this;
  }

   /**
   * Get gene
   * @return gene
  **/
  @ApiModelProperty(value = "")
  public Gene getGene() {
    return gene;
  }

  public void setGene(Gene gene) {
    this.gene = gene;
  }

  public Evidence id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Evidence knownEffect(String knownEffect) {
    this.knownEffect = knownEffect;
    return this;
  }

   /**
   * Get knownEffect
   * @return knownEffect
  **/
  @ApiModelProperty(value = "")
  public String getKnownEffect() {
    return knownEffect;
  }

  public void setKnownEffect(String knownEffect) {
    this.knownEffect = knownEffect;
  }

  public Evidence lastEdit(OffsetDateTime lastEdit) {
    this.lastEdit = lastEdit;
    return this;
  }

   /**
   * Get lastEdit
   * @return lastEdit
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastEdit() {
    return lastEdit;
  }

  public void setLastEdit(OffsetDateTime lastEdit) {
    this.lastEdit = lastEdit;
  }

  public Evidence lastReview(OffsetDateTime lastReview) {
    this.lastReview = lastReview;
    return this;
  }

   /**
   * Get lastReview
   * @return lastReview
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastReview() {
    return lastReview;
  }

  public void setLastReview(OffsetDateTime lastReview) {
    this.lastReview = lastReview;
  }

  public Evidence levelOfEvidence(LevelOfEvidenceEnum levelOfEvidence) {
    this.levelOfEvidence = levelOfEvidence;
    return this;
  }

   /**
   * Get levelOfEvidence
   * @return levelOfEvidence
  **/
  @ApiModelProperty(value = "")
  public LevelOfEvidenceEnum getLevelOfEvidence() {
    return levelOfEvidence;
  }

  public void setLevelOfEvidence(LevelOfEvidenceEnum levelOfEvidence) {
    this.levelOfEvidence = levelOfEvidence;
  }

  public Evidence liquidPropagationLevel(LiquidPropagationLevelEnum liquidPropagationLevel) {
    this.liquidPropagationLevel = liquidPropagationLevel;
    return this;
  }

   /**
   * Get liquidPropagationLevel
   * @return liquidPropagationLevel
  **/
  @ApiModelProperty(value = "")
  public LiquidPropagationLevelEnum getLiquidPropagationLevel() {
    return liquidPropagationLevel;
  }

  public void setLiquidPropagationLevel(LiquidPropagationLevelEnum liquidPropagationLevel) {
    this.liquidPropagationLevel = liquidPropagationLevel;
  }

  public Evidence relevantCancerTypes(List<TumorType> relevantCancerTypes) {
    this.relevantCancerTypes = relevantCancerTypes;
    return this;
  }

  public Evidence addRelevantCancerTypesItem(TumorType relevantCancerTypesItem) {
    if (this.relevantCancerTypes == null) {
      this.relevantCancerTypes = new ArrayList<TumorType>();
    }
    this.relevantCancerTypes.add(relevantCancerTypesItem);
    return this;
  }

   /**
   * Get relevantCancerTypes
   * @return relevantCancerTypes
  **/
  @ApiModelProperty(value = "")
  public List<TumorType> getRelevantCancerTypes() {
    return relevantCancerTypes;
  }

  public void setRelevantCancerTypes(List<TumorType> relevantCancerTypes) {
    this.relevantCancerTypes = relevantCancerTypes;
  }

  public Evidence solidPropagationLevel(SolidPropagationLevelEnum solidPropagationLevel) {
    this.solidPropagationLevel = solidPropagationLevel;
    return this;
  }

   /**
   * Get solidPropagationLevel
   * @return solidPropagationLevel
  **/
  @ApiModelProperty(value = "")
  public SolidPropagationLevelEnum getSolidPropagationLevel() {
    return solidPropagationLevel;
  }

  public void setSolidPropagationLevel(SolidPropagationLevelEnum solidPropagationLevel) {
    this.solidPropagationLevel = solidPropagationLevel;
  }

  public Evidence treatments(List<Treatment> treatments) {
    this.treatments = treatments;
    return this;
  }

  public Evidence addTreatmentsItem(Treatment treatmentsItem) {
    if (this.treatments == null) {
      this.treatments = new ArrayList<Treatment>();
    }
    this.treatments.add(treatmentsItem);
    return this;
  }

   /**
   * Get treatments
   * @return treatments
  **/
  @ApiModelProperty(value = "")
  public List<Treatment> getTreatments() {
    return treatments;
  }

  public void setTreatments(List<Treatment> treatments) {
    this.treatments = treatments;
  }

  public Evidence uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evidence evidence = (Evidence) o;
    return Objects.equals(this.additionalInfo, evidence.additionalInfo) &&
        Objects.equals(this.alterations, evidence.alterations) &&
        Objects.equals(this.articles, evidence.articles) &&
        Objects.equals(this.cancerTypes, evidence.cancerTypes) &&
        Objects.equals(this.description, evidence.description) &&
        Objects.equals(this.evidenceType, evidence.evidenceType) &&
        Objects.equals(this.gene, evidence.gene) &&
        Objects.equals(this.id, evidence.id) &&
        Objects.equals(this.knownEffect, evidence.knownEffect) &&
        Objects.equals(this.lastEdit, evidence.lastEdit) &&
        Objects.equals(this.lastReview, evidence.lastReview) &&
        Objects.equals(this.levelOfEvidence, evidence.levelOfEvidence) &&
        Objects.equals(this.liquidPropagationLevel, evidence.liquidPropagationLevel) &&
        Objects.equals(this.relevantCancerTypes, evidence.relevantCancerTypes) &&
        Objects.equals(this.solidPropagationLevel, evidence.solidPropagationLevel) &&
        Objects.equals(this.treatments, evidence.treatments) &&
        Objects.equals(this.uuid, evidence.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, alterations, articles, cancerTypes, description, evidenceType, gene, id, knownEffect, lastEdit, lastReview, levelOfEvidence, liquidPropagationLevel, relevantCancerTypes, solidPropagationLevel, treatments, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evidence {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    alterations: ").append(toIndentedString(alterations)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    cancerTypes: ").append(toIndentedString(cancerTypes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    evidenceType: ").append(toIndentedString(evidenceType)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    knownEffect: ").append(toIndentedString(knownEffect)).append("\n");
    sb.append("    lastEdit: ").append(toIndentedString(lastEdit)).append("\n");
    sb.append("    lastReview: ").append(toIndentedString(lastReview)).append("\n");
    sb.append("    levelOfEvidence: ").append(toIndentedString(levelOfEvidence)).append("\n");
    sb.append("    liquidPropagationLevel: ").append(toIndentedString(liquidPropagationLevel)).append("\n");
    sb.append("    relevantCancerTypes: ").append(toIndentedString(relevantCancerTypes)).append("\n");
    sb.append("    solidPropagationLevel: ").append(toIndentedString(solidPropagationLevel)).append("\n");
    sb.append("    treatments: ").append(toIndentedString(treatments)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
