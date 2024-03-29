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

/**
 * Query
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Query {
  public static final String SERIALIZED_NAME_ALTERATION = "alteration";
  @SerializedName(SERIALIZED_NAME_ALTERATION)
  private String alteration;

  public static final String SERIALIZED_NAME_ALTERATION_TYPE = "alterationType";
  @SerializedName(SERIALIZED_NAME_ALTERATION_TYPE)
  private String alterationType;

  public static final String SERIALIZED_NAME_CONSEQUENCE = "consequence";
  @SerializedName(SERIALIZED_NAME_CONSEQUENCE)
  private String consequence;

  public static final String SERIALIZED_NAME_ENTREZ_GENE_ID = "entrezGeneId";
  @SerializedName(SERIALIZED_NAME_ENTREZ_GENE_ID)
  private Integer entrezGeneId;

  public static final String SERIALIZED_NAME_HGVS = "hgvs";
  @SerializedName(SERIALIZED_NAME_HGVS)
  private String hgvs;

  public static final String SERIALIZED_NAME_HUGO_SYMBOL = "hugoSymbol";
  @SerializedName(SERIALIZED_NAME_HUGO_SYMBOL)
  private String hugoSymbol;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROTEIN_END = "proteinEnd";
  @SerializedName(SERIALIZED_NAME_PROTEIN_END)
  private Integer proteinEnd;

  public static final String SERIALIZED_NAME_PROTEIN_START = "proteinStart";
  @SerializedName(SERIALIZED_NAME_PROTEIN_START)
  private Integer proteinStart;

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

    public static ReferenceGenomeEnum fromValue(String value) {
      for (ReferenceGenomeEnum b : ReferenceGenomeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReferenceGenomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceGenomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceGenomeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReferenceGenomeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFERENCE_GENOME = "referenceGenome";
  @SerializedName(SERIALIZED_NAME_REFERENCE_GENOME)
  private ReferenceGenomeEnum referenceGenome;

  /**
   * Gets or Sets svType
   */
  @JsonAdapter(SvTypeEnum.Adapter.class)
  public enum SvTypeEnum {
    DELETION("DELETION"),
    
    TRANSLOCATION("TRANSLOCATION"),
    
    DUPLICATION("DUPLICATION"),
    
    INSERTION("INSERTION"),
    
    INVERSION("INVERSION"),
    
    FUSION("FUSION"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    SvTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SvTypeEnum fromValue(String value) {
      for (SvTypeEnum b : SvTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SvTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SvTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SvTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SvTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SV_TYPE = "svType";
  @SerializedName(SERIALIZED_NAME_SV_TYPE)
  private SvTypeEnum svType;

  public static final String SERIALIZED_NAME_TUMOR_TYPE = "tumorType";
  @SerializedName(SERIALIZED_NAME_TUMOR_TYPE)
  private String tumorType;

  public Query() { 
  }

  public Query alteration(String alteration) {
    
    this.alteration = alteration;
    return this;
  }

   /**
   * Get alteration
   * @return alteration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlteration() {
    return alteration;
  }


  public void setAlteration(String alteration) {
    this.alteration = alteration;
  }


  public Query alterationType(String alterationType) {
    
    this.alterationType = alterationType;
    return this;
  }

   /**
   * Get alterationType
   * @return alterationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlterationType() {
    return alterationType;
  }


  public void setAlterationType(String alterationType) {
    this.alterationType = alterationType;
  }


  public Query consequence(String consequence) {
    
    this.consequence = consequence;
    return this;
  }

   /**
   * Get consequence
   * @return consequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsequence() {
    return consequence;
  }


  public void setConsequence(String consequence) {
    this.consequence = consequence;
  }


  public Query entrezGeneId(Integer entrezGeneId) {
    
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


  public Query hgvs(String hgvs) {
    
    this.hgvs = hgvs;
    return this;
  }

   /**
   * Get hgvs
   * @return hgvs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHgvs() {
    return hgvs;
  }


  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }


  public Query hugoSymbol(String hugoSymbol) {
    
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


  public Query id(String id) {
    
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


  public Query proteinEnd(Integer proteinEnd) {
    
    this.proteinEnd = proteinEnd;
    return this;
  }

   /**
   * Get proteinEnd
   * @return proteinEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProteinEnd() {
    return proteinEnd;
  }


  public void setProteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
  }


  public Query proteinStart(Integer proteinStart) {
    
    this.proteinStart = proteinStart;
    return this;
  }

   /**
   * Get proteinStart
   * @return proteinStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProteinStart() {
    return proteinStart;
  }


  public void setProteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
  }


  public Query referenceGenome(ReferenceGenomeEnum referenceGenome) {
    
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReferenceGenomeEnum getReferenceGenome() {
    return referenceGenome;
  }


  public void setReferenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
  }


  public Query svType(SvTypeEnum svType) {
    
    this.svType = svType;
    return this;
  }

   /**
   * Get svType
   * @return svType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SvTypeEnum getSvType() {
    return svType;
  }


  public void setSvType(SvTypeEnum svType) {
    this.svType = svType;
  }


  public Query tumorType(String tumorType) {
    
    this.tumorType = tumorType;
    return this;
  }

   /**
   * Get tumorType
   * @return tumorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTumorType() {
    return tumorType;
  }


  public void setTumorType(String tumorType) {
    this.tumorType = tumorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.alteration, query.alteration) &&
        Objects.equals(this.alterationType, query.alterationType) &&
        Objects.equals(this.consequence, query.consequence) &&
        Objects.equals(this.entrezGeneId, query.entrezGeneId) &&
        Objects.equals(this.hgvs, query.hgvs) &&
        Objects.equals(this.hugoSymbol, query.hugoSymbol) &&
        Objects.equals(this.id, query.id) &&
        Objects.equals(this.proteinEnd, query.proteinEnd) &&
        Objects.equals(this.proteinStart, query.proteinStart) &&
        Objects.equals(this.referenceGenome, query.referenceGenome) &&
        Objects.equals(this.svType, query.svType) &&
        Objects.equals(this.tumorType, query.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alteration, alterationType, consequence, entrezGeneId, hgvs, hugoSymbol, id, proteinEnd, proteinStart, referenceGenome, svType, tumorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    alteration: ").append(toIndentedString(alteration)).append("\n");
    sb.append("    alterationType: ").append(toIndentedString(alterationType)).append("\n");
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    svType: ").append(toIndentedString(svType)).append("\n");
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
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

