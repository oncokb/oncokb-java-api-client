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
 * VariantSearchQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VariantSearchQuery {
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

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public static final String SERIALIZED_NAME_VARIANT_TYPE = "variantType";
  @SerializedName(SERIALIZED_NAME_VARIANT_TYPE)
  private String variantType;

  public VariantSearchQuery() { 
  }

  public VariantSearchQuery consequence(String consequence) {
    
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


  public VariantSearchQuery entrezGeneId(Integer entrezGeneId) {
    
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


  public VariantSearchQuery hgvs(String hgvs) {
    
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


  public VariantSearchQuery hugoSymbol(String hugoSymbol) {
    
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


  public VariantSearchQuery proteinEnd(Integer proteinEnd) {
    
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


  public VariantSearchQuery proteinStart(Integer proteinStart) {
    
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


  public VariantSearchQuery referenceGenome(ReferenceGenomeEnum referenceGenome) {
    
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


  public VariantSearchQuery variant(String variant) {
    
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariant() {
    return variant;
  }


  public void setVariant(String variant) {
    this.variant = variant;
  }


  public VariantSearchQuery variantType(String variantType) {
    
    this.variantType = variantType;
    return this;
  }

   /**
   * Get variantType
   * @return variantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariantType() {
    return variantType;
  }


  public void setVariantType(String variantType) {
    this.variantType = variantType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantSearchQuery variantSearchQuery = (VariantSearchQuery) o;
    return Objects.equals(this.consequence, variantSearchQuery.consequence) &&
        Objects.equals(this.entrezGeneId, variantSearchQuery.entrezGeneId) &&
        Objects.equals(this.hgvs, variantSearchQuery.hgvs) &&
        Objects.equals(this.hugoSymbol, variantSearchQuery.hugoSymbol) &&
        Objects.equals(this.proteinEnd, variantSearchQuery.proteinEnd) &&
        Objects.equals(this.proteinStart, variantSearchQuery.proteinStart) &&
        Objects.equals(this.referenceGenome, variantSearchQuery.referenceGenome) &&
        Objects.equals(this.variant, variantSearchQuery.variant) &&
        Objects.equals(this.variantType, variantSearchQuery.variantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consequence, entrezGeneId, hgvs, hugoSymbol, proteinEnd, proteinStart, referenceGenome, variant, variantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSearchQuery {\n");
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    variantType: ").append(toIndentedString(variantType)).append("\n");
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

