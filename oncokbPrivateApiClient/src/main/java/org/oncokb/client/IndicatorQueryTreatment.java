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
import org.oncokb.client.ArticleAbstract;
import org.oncokb.client.Drug;
import org.oncokb.client.TumorType;

/**
 * IndicatorQueryTreatment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndicatorQueryTreatment {
  public static final String SERIALIZED_NAME_ABSTRACTS = "abstracts";
  @SerializedName(SERIALIZED_NAME_ABSTRACTS)
  private List<ArticleAbstract> abstracts = null;

  public static final String SERIALIZED_NAME_ALTERATIONS = "alterations";
  @SerializedName(SERIALIZED_NAME_ALTERATIONS)
  private List<String> alterations = null;

  public static final String SERIALIZED_NAME_APPROVED_INDICATIONS = "approvedIndications";
  @SerializedName(SERIALIZED_NAME_APPROVED_INDICATIONS)
  private List<String> approvedIndications = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DRUGS = "drugs";
  @SerializedName(SERIALIZED_NAME_DRUGS)
  private List<Drug> drugs = null;

  /**
   * Gets or Sets fdaLevel
   */
  @JsonAdapter(FdaLevelEnum.Adapter.class)
  public enum FdaLevelEnum {
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    LEVEL_FDA1("LEVEL_Fda1"),
    
    LEVEL_FDA2("LEVEL_Fda2"),
    
    LEVEL_FDA3("LEVEL_Fda3"),
    
    NO("NO");

    private String value;

    FdaLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FdaLevelEnum fromValue(String value) {
      for (FdaLevelEnum b : FdaLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FdaLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FdaLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FdaLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FdaLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FDA_LEVEL = "fdaLevel";
  @SerializedName(SERIALIZED_NAME_FDA_LEVEL)
  private FdaLevelEnum fdaLevel;

  /**
   * Gets or Sets level
   */
  @JsonAdapter(LevelEnum.Adapter.class)
  public enum LevelEnum {
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    LEVEL_FDA1("LEVEL_Fda1"),
    
    LEVEL_FDA2("LEVEL_Fda2"),
    
    LEVEL_FDA3("LEVEL_Fda3"),
    
    NO("NO");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelEnum fromValue(String value) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private LevelEnum level;

  public static final String SERIALIZED_NAME_LEVEL_ASSOCIATED_CANCER_TYPE = "levelAssociatedCancerType";
  @SerializedName(SERIALIZED_NAME_LEVEL_ASSOCIATED_CANCER_TYPE)
  private TumorType levelAssociatedCancerType;

  public static final String SERIALIZED_NAME_LEVEL_EXCLUDED_CANCER_TYPES = "levelExcludedCancerTypes";
  @SerializedName(SERIALIZED_NAME_LEVEL_EXCLUDED_CANCER_TYPES)
  private List<TumorType> levelExcludedCancerTypes = null;

  public static final String SERIALIZED_NAME_PMIDS = "pmids";
  @SerializedName(SERIALIZED_NAME_PMIDS)
  private List<String> pmids = null;

  public IndicatorQueryTreatment() { 
  }

  public IndicatorQueryTreatment abstracts(List<ArticleAbstract> abstracts) {
    
    this.abstracts = abstracts;
    return this;
  }

  public IndicatorQueryTreatment addAbstractsItem(ArticleAbstract abstractsItem) {
    if (this.abstracts == null) {
      this.abstracts = new ArrayList<ArticleAbstract>();
    }
    this.abstracts.add(abstractsItem);
    return this;
  }

   /**
   * Get abstracts
   * @return abstracts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ArticleAbstract> getAbstracts() {
    return abstracts;
  }


  public void setAbstracts(List<ArticleAbstract> abstracts) {
    this.abstracts = abstracts;
  }


  public IndicatorQueryTreatment alterations(List<String> alterations) {
    
    this.alterations = alterations;
    return this;
  }

  public IndicatorQueryTreatment addAlterationsItem(String alterationsItem) {
    if (this.alterations == null) {
      this.alterations = new ArrayList<String>();
    }
    this.alterations.add(alterationsItem);
    return this;
  }

   /**
   * Get alterations
   * @return alterations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAlterations() {
    return alterations;
  }


  public void setAlterations(List<String> alterations) {
    this.alterations = alterations;
  }


  public IndicatorQueryTreatment approvedIndications(List<String> approvedIndications) {
    
    this.approvedIndications = approvedIndications;
    return this;
  }

  public IndicatorQueryTreatment addApprovedIndicationsItem(String approvedIndicationsItem) {
    if (this.approvedIndications == null) {
      this.approvedIndications = new ArrayList<String>();
    }
    this.approvedIndications.add(approvedIndicationsItem);
    return this;
  }

   /**
   * Get approvedIndications
   * @return approvedIndications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getApprovedIndications() {
    return approvedIndications;
  }


  public void setApprovedIndications(List<String> approvedIndications) {
    this.approvedIndications = approvedIndications;
  }


  public IndicatorQueryTreatment description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IndicatorQueryTreatment drugs(List<Drug> drugs) {
    
    this.drugs = drugs;
    return this;
  }

  public IndicatorQueryTreatment addDrugsItem(Drug drugsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Drug> getDrugs() {
    return drugs;
  }


  public void setDrugs(List<Drug> drugs) {
    this.drugs = drugs;
  }


  public IndicatorQueryTreatment fdaLevel(FdaLevelEnum fdaLevel) {
    
    this.fdaLevel = fdaLevel;
    return this;
  }

   /**
   * Get fdaLevel
   * @return fdaLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FdaLevelEnum getFdaLevel() {
    return fdaLevel;
  }


  public void setFdaLevel(FdaLevelEnum fdaLevel) {
    this.fdaLevel = fdaLevel;
  }


  public IndicatorQueryTreatment level(LevelEnum level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LevelEnum getLevel() {
    return level;
  }


  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  public IndicatorQueryTreatment levelAssociatedCancerType(TumorType levelAssociatedCancerType) {
    
    this.levelAssociatedCancerType = levelAssociatedCancerType;
    return this;
  }

   /**
   * Get levelAssociatedCancerType
   * @return levelAssociatedCancerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TumorType getLevelAssociatedCancerType() {
    return levelAssociatedCancerType;
  }


  public void setLevelAssociatedCancerType(TumorType levelAssociatedCancerType) {
    this.levelAssociatedCancerType = levelAssociatedCancerType;
  }


  public IndicatorQueryTreatment levelExcludedCancerTypes(List<TumorType> levelExcludedCancerTypes) {
    
    this.levelExcludedCancerTypes = levelExcludedCancerTypes;
    return this;
  }

  public IndicatorQueryTreatment addLevelExcludedCancerTypesItem(TumorType levelExcludedCancerTypesItem) {
    if (this.levelExcludedCancerTypes == null) {
      this.levelExcludedCancerTypes = new ArrayList<TumorType>();
    }
    this.levelExcludedCancerTypes.add(levelExcludedCancerTypesItem);
    return this;
  }

   /**
   * Get levelExcludedCancerTypes
   * @return levelExcludedCancerTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TumorType> getLevelExcludedCancerTypes() {
    return levelExcludedCancerTypes;
  }


  public void setLevelExcludedCancerTypes(List<TumorType> levelExcludedCancerTypes) {
    this.levelExcludedCancerTypes = levelExcludedCancerTypes;
  }


  public IndicatorQueryTreatment pmids(List<String> pmids) {
    
    this.pmids = pmids;
    return this;
  }

  public IndicatorQueryTreatment addPmidsItem(String pmidsItem) {
    if (this.pmids == null) {
      this.pmids = new ArrayList<String>();
    }
    this.pmids.add(pmidsItem);
    return this;
  }

   /**
   * Get pmids
   * @return pmids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPmids() {
    return pmids;
  }


  public void setPmids(List<String> pmids) {
    this.pmids = pmids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicatorQueryTreatment indicatorQueryTreatment = (IndicatorQueryTreatment) o;
    return Objects.equals(this.abstracts, indicatorQueryTreatment.abstracts) &&
        Objects.equals(this.alterations, indicatorQueryTreatment.alterations) &&
        Objects.equals(this.approvedIndications, indicatorQueryTreatment.approvedIndications) &&
        Objects.equals(this.description, indicatorQueryTreatment.description) &&
        Objects.equals(this.drugs, indicatorQueryTreatment.drugs) &&
        Objects.equals(this.fdaLevel, indicatorQueryTreatment.fdaLevel) &&
        Objects.equals(this.level, indicatorQueryTreatment.level) &&
        Objects.equals(this.levelAssociatedCancerType, indicatorQueryTreatment.levelAssociatedCancerType) &&
        Objects.equals(this.levelExcludedCancerTypes, indicatorQueryTreatment.levelExcludedCancerTypes) &&
        Objects.equals(this.pmids, indicatorQueryTreatment.pmids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstracts, alterations, approvedIndications, description, drugs, fdaLevel, level, levelAssociatedCancerType, levelExcludedCancerTypes, pmids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicatorQueryTreatment {\n");
    sb.append("    abstracts: ").append(toIndentedString(abstracts)).append("\n");
    sb.append("    alterations: ").append(toIndentedString(alterations)).append("\n");
    sb.append("    approvedIndications: ").append(toIndentedString(approvedIndications)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    drugs: ").append(toIndentedString(drugs)).append("\n");
    sb.append("    fdaLevel: ").append(toIndentedString(fdaLevel)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    levelAssociatedCancerType: ").append(toIndentedString(levelAssociatedCancerType)).append("\n");
    sb.append("    levelExcludedCancerTypes: ").append(toIndentedString(levelExcludedCancerTypes)).append("\n");
    sb.append("    pmids: ").append(toIndentedString(pmids)).append("\n");
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

