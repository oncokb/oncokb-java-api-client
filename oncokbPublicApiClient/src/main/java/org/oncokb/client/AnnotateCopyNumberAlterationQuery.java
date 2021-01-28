/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
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
import org.oncokb.client.QueryGene;

/**
 * AnnotateCopyNumberAlterationQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-27T19:08:12.791-05:00")
public class AnnotateCopyNumberAlterationQuery {
  /**
   * Gets or Sets copyNameAlterationType
   */
  @JsonAdapter(CopyNameAlterationTypeEnum.Adapter.class)
  public enum CopyNameAlterationTypeEnum {
    AMPLIFICATION("AMPLIFICATION"),
    
    DELETION("DELETION"),
    
    GAIN("GAIN"),
    
    LOSS("LOSS");

    private String value;

    CopyNameAlterationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CopyNameAlterationTypeEnum fromValue(String text) {
      for (CopyNameAlterationTypeEnum b : CopyNameAlterationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CopyNameAlterationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CopyNameAlterationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CopyNameAlterationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CopyNameAlterationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("copyNameAlterationType")
  private CopyNameAlterationTypeEnum copyNameAlterationType = null;

  /**
   * Gets or Sets evidenceTypes
   */
  @JsonAdapter(EvidenceTypesEnum.Adapter.class)
  public enum EvidenceTypesEnum {
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

    EvidenceTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EvidenceTypesEnum fromValue(String text) {
      for (EvidenceTypesEnum b : EvidenceTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EvidenceTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvidenceTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvidenceTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EvidenceTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("evidenceTypes")
  private List<EvidenceTypesEnum> evidenceTypes = null;

  @SerializedName("gene")
  private QueryGene gene = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets referenceGenome
   */
  @JsonAdapter(ReferenceGenomeEnum.Adapter.class)
  public enum ReferenceGenomeEnum {
    GRCH37("GRCh37"),
    
    GRCH38("GRCh38");

    private String value;

    ReferenceGenomeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferenceGenomeEnum fromValue(String text) {
      for (ReferenceGenomeEnum b : ReferenceGenomeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReferenceGenomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceGenomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceGenomeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReferenceGenomeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("referenceGenome")
  private ReferenceGenomeEnum referenceGenome = null;

  @SerializedName("tumorType")
  private String tumorType = null;

  public AnnotateCopyNumberAlterationQuery copyNameAlterationType(CopyNameAlterationTypeEnum copyNameAlterationType) {
    this.copyNameAlterationType = copyNameAlterationType;
    return this;
  }

   /**
   * Get copyNameAlterationType
   * @return copyNameAlterationType
  **/
  @ApiModelProperty(value = "")
  public CopyNameAlterationTypeEnum getCopyNameAlterationType() {
    return copyNameAlterationType;
  }

  public void setCopyNameAlterationType(CopyNameAlterationTypeEnum copyNameAlterationType) {
    this.copyNameAlterationType = copyNameAlterationType;
  }

  public AnnotateCopyNumberAlterationQuery evidenceTypes(List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
    return this;
  }

  public AnnotateCopyNumberAlterationQuery addEvidenceTypesItem(EvidenceTypesEnum evidenceTypesItem) {
    if (this.evidenceTypes == null) {
      this.evidenceTypes = new ArrayList<EvidenceTypesEnum>();
    }
    this.evidenceTypes.add(evidenceTypesItem);
    return this;
  }

   /**
   * Get evidenceTypes
   * @return evidenceTypes
  **/
  @ApiModelProperty(value = "")
  public List<EvidenceTypesEnum> getEvidenceTypes() {
    return evidenceTypes;
  }

  public void setEvidenceTypes(List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
  }

  public AnnotateCopyNumberAlterationQuery gene(QueryGene gene) {
    this.gene = gene;
    return this;
  }

   /**
   * Get gene
   * @return gene
  **/
  @ApiModelProperty(value = "")
  public QueryGene getGene() {
    return gene;
  }

  public void setGene(QueryGene gene) {
    this.gene = gene;
  }

  public AnnotateCopyNumberAlterationQuery id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AnnotateCopyNumberAlterationQuery referenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @ApiModelProperty(value = "")
  public ReferenceGenomeEnum getReferenceGenome() {
    return referenceGenome;
  }

  public void setReferenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
  }

  public AnnotateCopyNumberAlterationQuery tumorType(String tumorType) {
    this.tumorType = tumorType;
    return this;
  }

   /**
   * Get tumorType
   * @return tumorType
  **/
  @ApiModelProperty(value = "")
  public String getTumorType() {
    return tumorType;
  }

  public void setTumorType(String tumorType) {
    this.tumorType = tumorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotateCopyNumberAlterationQuery annotateCopyNumberAlterationQuery = (AnnotateCopyNumberAlterationQuery) o;
    return Objects.equals(this.copyNameAlterationType, annotateCopyNumberAlterationQuery.copyNameAlterationType) &&
        Objects.equals(this.evidenceTypes, annotateCopyNumberAlterationQuery.evidenceTypes) &&
        Objects.equals(this.gene, annotateCopyNumberAlterationQuery.gene) &&
        Objects.equals(this.id, annotateCopyNumberAlterationQuery.id) &&
        Objects.equals(this.referenceGenome, annotateCopyNumberAlterationQuery.referenceGenome) &&
        Objects.equals(this.tumorType, annotateCopyNumberAlterationQuery.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyNameAlterationType, evidenceTypes, gene, id, referenceGenome, tumorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateCopyNumberAlterationQuery {\n");
    
    sb.append("    copyNameAlterationType: ").append(toIndentedString(copyNameAlterationType)).append("\n");
    sb.append("    evidenceTypes: ").append(toIndentedString(evidenceTypes)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
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

