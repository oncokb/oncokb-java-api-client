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
import org.oncokb.client.Implication;
import org.oncokb.client.IndicatorQueryTreatment;
import org.oncokb.client.MutationEffectResp;
import org.oncokb.client.Query;

/**
 * IndicatorQueryResp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndicatorQueryResp {
  public static final String SERIALIZED_NAME_ALLELE_EXIST = "alleleExist";
  @SerializedName(SERIALIZED_NAME_ALLELE_EXIST)
  private Boolean alleleExist;

  public static final String SERIALIZED_NAME_DATA_VERSION = "dataVersion";
  @SerializedName(SERIALIZED_NAME_DATA_VERSION)
  private String dataVersion;

  public static final String SERIALIZED_NAME_DIAGNOSTIC_IMPLICATIONS = "diagnosticImplications";
  @SerializedName(SERIALIZED_NAME_DIAGNOSTIC_IMPLICATIONS)
  private List<Implication> diagnosticImplications = null;

  public static final String SERIALIZED_NAME_DIAGNOSTIC_SUMMARY = "diagnosticSummary";
  @SerializedName(SERIALIZED_NAME_DIAGNOSTIC_SUMMARY)
  private String diagnosticSummary;

  public static final String SERIALIZED_NAME_GENE_EXIST = "geneExist";
  @SerializedName(SERIALIZED_NAME_GENE_EXIST)
  private Boolean geneExist;

  public static final String SERIALIZED_NAME_GENE_SUMMARY = "geneSummary";
  @SerializedName(SERIALIZED_NAME_GENE_SUMMARY)
  private String geneSummary;

  /**
   * Gets or Sets highestDiagnosticImplicationLevel
   */
  @JsonAdapter(HighestDiagnosticImplicationLevelEnum.Adapter.class)
  public enum HighestDiagnosticImplicationLevelEnum {
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

    HighestDiagnosticImplicationLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestDiagnosticImplicationLevelEnum fromValue(String value) {
      for (HighestDiagnosticImplicationLevelEnum b : HighestDiagnosticImplicationLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HighestDiagnosticImplicationLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestDiagnosticImplicationLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestDiagnosticImplicationLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HighestDiagnosticImplicationLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIGHEST_DIAGNOSTIC_IMPLICATION_LEVEL = "highestDiagnosticImplicationLevel";
  @SerializedName(SERIALIZED_NAME_HIGHEST_DIAGNOSTIC_IMPLICATION_LEVEL)
  private HighestDiagnosticImplicationLevelEnum highestDiagnosticImplicationLevel;

  /**
   * Gets or Sets highestFdaLevel
   */
  @JsonAdapter(HighestFdaLevelEnum.Adapter.class)
  public enum HighestFdaLevelEnum {
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

    HighestFdaLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestFdaLevelEnum fromValue(String value) {
      for (HighestFdaLevelEnum b : HighestFdaLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HighestFdaLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestFdaLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestFdaLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HighestFdaLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIGHEST_FDA_LEVEL = "highestFdaLevel";
  @SerializedName(SERIALIZED_NAME_HIGHEST_FDA_LEVEL)
  private HighestFdaLevelEnum highestFdaLevel;

  /**
   * Gets or Sets highestPrognosticImplicationLevel
   */
  @JsonAdapter(HighestPrognosticImplicationLevelEnum.Adapter.class)
  public enum HighestPrognosticImplicationLevelEnum {
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

    HighestPrognosticImplicationLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestPrognosticImplicationLevelEnum fromValue(String value) {
      for (HighestPrognosticImplicationLevelEnum b : HighestPrognosticImplicationLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HighestPrognosticImplicationLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestPrognosticImplicationLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestPrognosticImplicationLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HighestPrognosticImplicationLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIGHEST_PROGNOSTIC_IMPLICATION_LEVEL = "highestPrognosticImplicationLevel";
  @SerializedName(SERIALIZED_NAME_HIGHEST_PROGNOSTIC_IMPLICATION_LEVEL)
  private HighestPrognosticImplicationLevelEnum highestPrognosticImplicationLevel;

  /**
   * Gets or Sets highestResistanceLevel
   */
  @JsonAdapter(HighestResistanceLevelEnum.Adapter.class)
  public enum HighestResistanceLevelEnum {
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

    HighestResistanceLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestResistanceLevelEnum fromValue(String value) {
      for (HighestResistanceLevelEnum b : HighestResistanceLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HighestResistanceLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestResistanceLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestResistanceLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HighestResistanceLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIGHEST_RESISTANCE_LEVEL = "highestResistanceLevel";
  @SerializedName(SERIALIZED_NAME_HIGHEST_RESISTANCE_LEVEL)
  private HighestResistanceLevelEnum highestResistanceLevel;

  /**
   * Gets or Sets highestSensitiveLevel
   */
  @JsonAdapter(HighestSensitiveLevelEnum.Adapter.class)
  public enum HighestSensitiveLevelEnum {
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

    HighestSensitiveLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestSensitiveLevelEnum fromValue(String value) {
      for (HighestSensitiveLevelEnum b : HighestSensitiveLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HighestSensitiveLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestSensitiveLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestSensitiveLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HighestSensitiveLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIGHEST_SENSITIVE_LEVEL = "highestSensitiveLevel";
  @SerializedName(SERIALIZED_NAME_HIGHEST_SENSITIVE_LEVEL)
  private HighestSensitiveLevelEnum highestSensitiveLevel;

  public static final String SERIALIZED_NAME_HOTSPOT = "hotspot";
  @SerializedName(SERIALIZED_NAME_HOTSPOT)
  private Boolean hotspot;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private String lastUpdate;

  public static final String SERIALIZED_NAME_MUTATION_EFFECT = "mutationEffect";
  @SerializedName(SERIALIZED_NAME_MUTATION_EFFECT)
  private MutationEffectResp mutationEffect;

  public static final String SERIALIZED_NAME_ONCOGENIC = "oncogenic";
  @SerializedName(SERIALIZED_NAME_ONCOGENIC)
  private String oncogenic;

  /**
   * Gets or Sets otherSignificantResistanceLevels
   */
  @JsonAdapter(OtherSignificantResistanceLevelsEnum.Adapter.class)
  public enum OtherSignificantResistanceLevelsEnum {
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

    OtherSignificantResistanceLevelsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OtherSignificantResistanceLevelsEnum fromValue(String value) {
      for (OtherSignificantResistanceLevelsEnum b : OtherSignificantResistanceLevelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OtherSignificantResistanceLevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OtherSignificantResistanceLevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OtherSignificantResistanceLevelsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OtherSignificantResistanceLevelsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OTHER_SIGNIFICANT_RESISTANCE_LEVELS = "otherSignificantResistanceLevels";
  @SerializedName(SERIALIZED_NAME_OTHER_SIGNIFICANT_RESISTANCE_LEVELS)
  private List<OtherSignificantResistanceLevelsEnum> otherSignificantResistanceLevels = null;

  /**
   * Gets or Sets otherSignificantSensitiveLevels
   */
  @JsonAdapter(OtherSignificantSensitiveLevelsEnum.Adapter.class)
  public enum OtherSignificantSensitiveLevelsEnum {
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

    OtherSignificantSensitiveLevelsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OtherSignificantSensitiveLevelsEnum fromValue(String value) {
      for (OtherSignificantSensitiveLevelsEnum b : OtherSignificantSensitiveLevelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OtherSignificantSensitiveLevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OtherSignificantSensitiveLevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OtherSignificantSensitiveLevelsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OtherSignificantSensitiveLevelsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OTHER_SIGNIFICANT_SENSITIVE_LEVELS = "otherSignificantSensitiveLevels";
  @SerializedName(SERIALIZED_NAME_OTHER_SIGNIFICANT_SENSITIVE_LEVELS)
  private List<OtherSignificantSensitiveLevelsEnum> otherSignificantSensitiveLevels = null;

  public static final String SERIALIZED_NAME_PROGNOSTIC_IMPLICATIONS = "prognosticImplications";
  @SerializedName(SERIALIZED_NAME_PROGNOSTIC_IMPLICATIONS)
  private List<Implication> prognosticImplications = null;

  public static final String SERIALIZED_NAME_PROGNOSTIC_SUMMARY = "prognosticSummary";
  @SerializedName(SERIALIZED_NAME_PROGNOSTIC_SUMMARY)
  private String prognosticSummary;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Query query;

  public static final String SERIALIZED_NAME_TREATMENTS = "treatments";
  @SerializedName(SERIALIZED_NAME_TREATMENTS)
  private List<IndicatorQueryTreatment> treatments = null;

  public static final String SERIALIZED_NAME_TUMOR_TYPE_SUMMARY = "tumorTypeSummary";
  @SerializedName(SERIALIZED_NAME_TUMOR_TYPE_SUMMARY)
  private String tumorTypeSummary;

  public static final String SERIALIZED_NAME_VARIANT_EXIST = "variantExist";
  @SerializedName(SERIALIZED_NAME_VARIANT_EXIST)
  private Boolean variantExist;

  public static final String SERIALIZED_NAME_VARIANT_SUMMARY = "variantSummary";
  @SerializedName(SERIALIZED_NAME_VARIANT_SUMMARY)
  private String variantSummary;

  public static final String SERIALIZED_NAME_VUS = "vus";
  @SerializedName(SERIALIZED_NAME_VUS)
  private Boolean vus;

  public IndicatorQueryResp() { 
  }

  public IndicatorQueryResp alleleExist(Boolean alleleExist) {
    
    this.alleleExist = alleleExist;
    return this;
  }

   /**
   * Get alleleExist
   * @return alleleExist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAlleleExist() {
    return alleleExist;
  }


  public void setAlleleExist(Boolean alleleExist) {
    this.alleleExist = alleleExist;
  }


  public IndicatorQueryResp dataVersion(String dataVersion) {
    
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Get dataVersion
   * @return dataVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataVersion() {
    return dataVersion;
  }


  public void setDataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
  }


  public IndicatorQueryResp diagnosticImplications(List<Implication> diagnosticImplications) {
    
    this.diagnosticImplications = diagnosticImplications;
    return this;
  }

  public IndicatorQueryResp addDiagnosticImplicationsItem(Implication diagnosticImplicationsItem) {
    if (this.diagnosticImplications == null) {
      this.diagnosticImplications = new ArrayList<Implication>();
    }
    this.diagnosticImplications.add(diagnosticImplicationsItem);
    return this;
  }

   /**
   * Get diagnosticImplications
   * @return diagnosticImplications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Implication> getDiagnosticImplications() {
    return diagnosticImplications;
  }


  public void setDiagnosticImplications(List<Implication> diagnosticImplications) {
    this.diagnosticImplications = diagnosticImplications;
  }


  public IndicatorQueryResp diagnosticSummary(String diagnosticSummary) {
    
    this.diagnosticSummary = diagnosticSummary;
    return this;
  }

   /**
   * Get diagnosticSummary
   * @return diagnosticSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiagnosticSummary() {
    return diagnosticSummary;
  }


  public void setDiagnosticSummary(String diagnosticSummary) {
    this.diagnosticSummary = diagnosticSummary;
  }


  public IndicatorQueryResp geneExist(Boolean geneExist) {
    
    this.geneExist = geneExist;
    return this;
  }

   /**
   * Get geneExist
   * @return geneExist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGeneExist() {
    return geneExist;
  }


  public void setGeneExist(Boolean geneExist) {
    this.geneExist = geneExist;
  }


  public IndicatorQueryResp geneSummary(String geneSummary) {
    
    this.geneSummary = geneSummary;
    return this;
  }

   /**
   * Get geneSummary
   * @return geneSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeneSummary() {
    return geneSummary;
  }


  public void setGeneSummary(String geneSummary) {
    this.geneSummary = geneSummary;
  }


  public IndicatorQueryResp highestDiagnosticImplicationLevel(HighestDiagnosticImplicationLevelEnum highestDiagnosticImplicationLevel) {
    
    this.highestDiagnosticImplicationLevel = highestDiagnosticImplicationLevel;
    return this;
  }

   /**
   * Get highestDiagnosticImplicationLevel
   * @return highestDiagnosticImplicationLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HighestDiagnosticImplicationLevelEnum getHighestDiagnosticImplicationLevel() {
    return highestDiagnosticImplicationLevel;
  }


  public void setHighestDiagnosticImplicationLevel(HighestDiagnosticImplicationLevelEnum highestDiagnosticImplicationLevel) {
    this.highestDiagnosticImplicationLevel = highestDiagnosticImplicationLevel;
  }


  public IndicatorQueryResp highestFdaLevel(HighestFdaLevelEnum highestFdaLevel) {
    
    this.highestFdaLevel = highestFdaLevel;
    return this;
  }

   /**
   * Get highestFdaLevel
   * @return highestFdaLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HighestFdaLevelEnum getHighestFdaLevel() {
    return highestFdaLevel;
  }


  public void setHighestFdaLevel(HighestFdaLevelEnum highestFdaLevel) {
    this.highestFdaLevel = highestFdaLevel;
  }


  public IndicatorQueryResp highestPrognosticImplicationLevel(HighestPrognosticImplicationLevelEnum highestPrognosticImplicationLevel) {
    
    this.highestPrognosticImplicationLevel = highestPrognosticImplicationLevel;
    return this;
  }

   /**
   * Get highestPrognosticImplicationLevel
   * @return highestPrognosticImplicationLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HighestPrognosticImplicationLevelEnum getHighestPrognosticImplicationLevel() {
    return highestPrognosticImplicationLevel;
  }


  public void setHighestPrognosticImplicationLevel(HighestPrognosticImplicationLevelEnum highestPrognosticImplicationLevel) {
    this.highestPrognosticImplicationLevel = highestPrognosticImplicationLevel;
  }


  public IndicatorQueryResp highestResistanceLevel(HighestResistanceLevelEnum highestResistanceLevel) {
    
    this.highestResistanceLevel = highestResistanceLevel;
    return this;
  }

   /**
   * Get highestResistanceLevel
   * @return highestResistanceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HighestResistanceLevelEnum getHighestResistanceLevel() {
    return highestResistanceLevel;
  }


  public void setHighestResistanceLevel(HighestResistanceLevelEnum highestResistanceLevel) {
    this.highestResistanceLevel = highestResistanceLevel;
  }


  public IndicatorQueryResp highestSensitiveLevel(HighestSensitiveLevelEnum highestSensitiveLevel) {
    
    this.highestSensitiveLevel = highestSensitiveLevel;
    return this;
  }

   /**
   * Get highestSensitiveLevel
   * @return highestSensitiveLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HighestSensitiveLevelEnum getHighestSensitiveLevel() {
    return highestSensitiveLevel;
  }


  public void setHighestSensitiveLevel(HighestSensitiveLevelEnum highestSensitiveLevel) {
    this.highestSensitiveLevel = highestSensitiveLevel;
  }


  public IndicatorQueryResp hotspot(Boolean hotspot) {
    
    this.hotspot = hotspot;
    return this;
  }

   /**
   * Get hotspot
   * @return hotspot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHotspot() {
    return hotspot;
  }


  public void setHotspot(Boolean hotspot) {
    this.hotspot = hotspot;
  }


  public IndicatorQueryResp lastUpdate(String lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public IndicatorQueryResp mutationEffect(MutationEffectResp mutationEffect) {
    
    this.mutationEffect = mutationEffect;
    return this;
  }

   /**
   * Get mutationEffect
   * @return mutationEffect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MutationEffectResp getMutationEffect() {
    return mutationEffect;
  }


  public void setMutationEffect(MutationEffectResp mutationEffect) {
    this.mutationEffect = mutationEffect;
  }


  public IndicatorQueryResp oncogenic(String oncogenic) {
    
    this.oncogenic = oncogenic;
    return this;
  }

   /**
   * Get oncogenic
   * @return oncogenic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOncogenic() {
    return oncogenic;
  }


  public void setOncogenic(String oncogenic) {
    this.oncogenic = oncogenic;
  }


  public IndicatorQueryResp otherSignificantResistanceLevels(List<OtherSignificantResistanceLevelsEnum> otherSignificantResistanceLevels) {
    
    this.otherSignificantResistanceLevels = otherSignificantResistanceLevels;
    return this;
  }

  public IndicatorQueryResp addOtherSignificantResistanceLevelsItem(OtherSignificantResistanceLevelsEnum otherSignificantResistanceLevelsItem) {
    if (this.otherSignificantResistanceLevels == null) {
      this.otherSignificantResistanceLevels = new ArrayList<OtherSignificantResistanceLevelsEnum>();
    }
    this.otherSignificantResistanceLevels.add(otherSignificantResistanceLevelsItem);
    return this;
  }

   /**
   * Get otherSignificantResistanceLevels
   * @return otherSignificantResistanceLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherSignificantResistanceLevelsEnum> getOtherSignificantResistanceLevels() {
    return otherSignificantResistanceLevels;
  }


  public void setOtherSignificantResistanceLevels(List<OtherSignificantResistanceLevelsEnum> otherSignificantResistanceLevels) {
    this.otherSignificantResistanceLevels = otherSignificantResistanceLevels;
  }


  public IndicatorQueryResp otherSignificantSensitiveLevels(List<OtherSignificantSensitiveLevelsEnum> otherSignificantSensitiveLevels) {
    
    this.otherSignificantSensitiveLevels = otherSignificantSensitiveLevels;
    return this;
  }

  public IndicatorQueryResp addOtherSignificantSensitiveLevelsItem(OtherSignificantSensitiveLevelsEnum otherSignificantSensitiveLevelsItem) {
    if (this.otherSignificantSensitiveLevels == null) {
      this.otherSignificantSensitiveLevels = new ArrayList<OtherSignificantSensitiveLevelsEnum>();
    }
    this.otherSignificantSensitiveLevels.add(otherSignificantSensitiveLevelsItem);
    return this;
  }

   /**
   * Get otherSignificantSensitiveLevels
   * @return otherSignificantSensitiveLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OtherSignificantSensitiveLevelsEnum> getOtherSignificantSensitiveLevels() {
    return otherSignificantSensitiveLevels;
  }


  public void setOtherSignificantSensitiveLevels(List<OtherSignificantSensitiveLevelsEnum> otherSignificantSensitiveLevels) {
    this.otherSignificantSensitiveLevels = otherSignificantSensitiveLevels;
  }


  public IndicatorQueryResp prognosticImplications(List<Implication> prognosticImplications) {
    
    this.prognosticImplications = prognosticImplications;
    return this;
  }

  public IndicatorQueryResp addPrognosticImplicationsItem(Implication prognosticImplicationsItem) {
    if (this.prognosticImplications == null) {
      this.prognosticImplications = new ArrayList<Implication>();
    }
    this.prognosticImplications.add(prognosticImplicationsItem);
    return this;
  }

   /**
   * Get prognosticImplications
   * @return prognosticImplications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Implication> getPrognosticImplications() {
    return prognosticImplications;
  }


  public void setPrognosticImplications(List<Implication> prognosticImplications) {
    this.prognosticImplications = prognosticImplications;
  }


  public IndicatorQueryResp prognosticSummary(String prognosticSummary) {
    
    this.prognosticSummary = prognosticSummary;
    return this;
  }

   /**
   * Get prognosticSummary
   * @return prognosticSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrognosticSummary() {
    return prognosticSummary;
  }


  public void setPrognosticSummary(String prognosticSummary) {
    this.prognosticSummary = prognosticSummary;
  }


  public IndicatorQueryResp query(Query query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Query getQuery() {
    return query;
  }


  public void setQuery(Query query) {
    this.query = query;
  }


  public IndicatorQueryResp treatments(List<IndicatorQueryTreatment> treatments) {
    
    this.treatments = treatments;
    return this;
  }

  public IndicatorQueryResp addTreatmentsItem(IndicatorQueryTreatment treatmentsItem) {
    if (this.treatments == null) {
      this.treatments = new ArrayList<IndicatorQueryTreatment>();
    }
    this.treatments.add(treatmentsItem);
    return this;
  }

   /**
   * Get treatments
   * @return treatments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IndicatorQueryTreatment> getTreatments() {
    return treatments;
  }


  public void setTreatments(List<IndicatorQueryTreatment> treatments) {
    this.treatments = treatments;
  }


  public IndicatorQueryResp tumorTypeSummary(String tumorTypeSummary) {
    
    this.tumorTypeSummary = tumorTypeSummary;
    return this;
  }

   /**
   * Get tumorTypeSummary
   * @return tumorTypeSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTumorTypeSummary() {
    return tumorTypeSummary;
  }


  public void setTumorTypeSummary(String tumorTypeSummary) {
    this.tumorTypeSummary = tumorTypeSummary;
  }


  public IndicatorQueryResp variantExist(Boolean variantExist) {
    
    this.variantExist = variantExist;
    return this;
  }

   /**
   * Get variantExist
   * @return variantExist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVariantExist() {
    return variantExist;
  }


  public void setVariantExist(Boolean variantExist) {
    this.variantExist = variantExist;
  }


  public IndicatorQueryResp variantSummary(String variantSummary) {
    
    this.variantSummary = variantSummary;
    return this;
  }

   /**
   * Get variantSummary
   * @return variantSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariantSummary() {
    return variantSummary;
  }


  public void setVariantSummary(String variantSummary) {
    this.variantSummary = variantSummary;
  }


  public IndicatorQueryResp vus(Boolean vus) {
    
    this.vus = vus;
    return this;
  }

   /**
   * Get vus
   * @return vus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVus() {
    return vus;
  }


  public void setVus(Boolean vus) {
    this.vus = vus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicatorQueryResp indicatorQueryResp = (IndicatorQueryResp) o;
    return Objects.equals(this.alleleExist, indicatorQueryResp.alleleExist) &&
        Objects.equals(this.dataVersion, indicatorQueryResp.dataVersion) &&
        Objects.equals(this.diagnosticImplications, indicatorQueryResp.diagnosticImplications) &&
        Objects.equals(this.diagnosticSummary, indicatorQueryResp.diagnosticSummary) &&
        Objects.equals(this.geneExist, indicatorQueryResp.geneExist) &&
        Objects.equals(this.geneSummary, indicatorQueryResp.geneSummary) &&
        Objects.equals(this.highestDiagnosticImplicationLevel, indicatorQueryResp.highestDiagnosticImplicationLevel) &&
        Objects.equals(this.highestFdaLevel, indicatorQueryResp.highestFdaLevel) &&
        Objects.equals(this.highestPrognosticImplicationLevel, indicatorQueryResp.highestPrognosticImplicationLevel) &&
        Objects.equals(this.highestResistanceLevel, indicatorQueryResp.highestResistanceLevel) &&
        Objects.equals(this.highestSensitiveLevel, indicatorQueryResp.highestSensitiveLevel) &&
        Objects.equals(this.hotspot, indicatorQueryResp.hotspot) &&
        Objects.equals(this.lastUpdate, indicatorQueryResp.lastUpdate) &&
        Objects.equals(this.mutationEffect, indicatorQueryResp.mutationEffect) &&
        Objects.equals(this.oncogenic, indicatorQueryResp.oncogenic) &&
        Objects.equals(this.otherSignificantResistanceLevels, indicatorQueryResp.otherSignificantResistanceLevels) &&
        Objects.equals(this.otherSignificantSensitiveLevels, indicatorQueryResp.otherSignificantSensitiveLevels) &&
        Objects.equals(this.prognosticImplications, indicatorQueryResp.prognosticImplications) &&
        Objects.equals(this.prognosticSummary, indicatorQueryResp.prognosticSummary) &&
        Objects.equals(this.query, indicatorQueryResp.query) &&
        Objects.equals(this.treatments, indicatorQueryResp.treatments) &&
        Objects.equals(this.tumorTypeSummary, indicatorQueryResp.tumorTypeSummary) &&
        Objects.equals(this.variantExist, indicatorQueryResp.variantExist) &&
        Objects.equals(this.variantSummary, indicatorQueryResp.variantSummary) &&
        Objects.equals(this.vus, indicatorQueryResp.vus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alleleExist, dataVersion, diagnosticImplications, diagnosticSummary, geneExist, geneSummary, highestDiagnosticImplicationLevel, highestFdaLevel, highestPrognosticImplicationLevel, highestResistanceLevel, highestSensitiveLevel, hotspot, lastUpdate, mutationEffect, oncogenic, otherSignificantResistanceLevels, otherSignificantSensitiveLevels, prognosticImplications, prognosticSummary, query, treatments, tumorTypeSummary, variantExist, variantSummary, vus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicatorQueryResp {\n");
    sb.append("    alleleExist: ").append(toIndentedString(alleleExist)).append("\n");
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
    sb.append("    diagnosticImplications: ").append(toIndentedString(diagnosticImplications)).append("\n");
    sb.append("    diagnosticSummary: ").append(toIndentedString(diagnosticSummary)).append("\n");
    sb.append("    geneExist: ").append(toIndentedString(geneExist)).append("\n");
    sb.append("    geneSummary: ").append(toIndentedString(geneSummary)).append("\n");
    sb.append("    highestDiagnosticImplicationLevel: ").append(toIndentedString(highestDiagnosticImplicationLevel)).append("\n");
    sb.append("    highestFdaLevel: ").append(toIndentedString(highestFdaLevel)).append("\n");
    sb.append("    highestPrognosticImplicationLevel: ").append(toIndentedString(highestPrognosticImplicationLevel)).append("\n");
    sb.append("    highestResistanceLevel: ").append(toIndentedString(highestResistanceLevel)).append("\n");
    sb.append("    highestSensitiveLevel: ").append(toIndentedString(highestSensitiveLevel)).append("\n");
    sb.append("    hotspot: ").append(toIndentedString(hotspot)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    mutationEffect: ").append(toIndentedString(mutationEffect)).append("\n");
    sb.append("    oncogenic: ").append(toIndentedString(oncogenic)).append("\n");
    sb.append("    otherSignificantResistanceLevels: ").append(toIndentedString(otherSignificantResistanceLevels)).append("\n");
    sb.append("    otherSignificantSensitiveLevels: ").append(toIndentedString(otherSignificantSensitiveLevels)).append("\n");
    sb.append("    prognosticImplications: ").append(toIndentedString(prognosticImplications)).append("\n");
    sb.append("    prognosticSummary: ").append(toIndentedString(prognosticSummary)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    treatments: ").append(toIndentedString(treatments)).append("\n");
    sb.append("    tumorTypeSummary: ").append(toIndentedString(tumorTypeSummary)).append("\n");
    sb.append("    variantExist: ").append(toIndentedString(variantExist)).append("\n");
    sb.append("    variantSummary: ").append(toIndentedString(variantSummary)).append("\n");
    sb.append("    vus: ").append(toIndentedString(vus)).append("\n");
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

