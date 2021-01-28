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
import org.oncokb.client.Gene;
import org.oncokb.client.VariantConsequence;

/**
 * Alteration
 */

public class Alteration {
  @SerializedName("alteration")
  private String alteration = null;

  @SerializedName("consequence")
  private VariantConsequence consequence = null;

  @SerializedName("gene")
  private Gene gene = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("proteinEnd")
  private Integer proteinEnd = null;

  @SerializedName("proteinStart")
  private Integer proteinStart = null;

  @SerializedName("refResidues")
  private String refResidues = null;

  /**
   * Gets or Sets referenceGenomes
   */
  @JsonAdapter(ReferenceGenomesEnum.Adapter.class)
  public enum ReferenceGenomesEnum {
    GRCH37("GRCh37"),
    
    GRCH38("GRCh38");

    private String value;

    ReferenceGenomesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferenceGenomesEnum fromValue(String text) {
      for (ReferenceGenomesEnum b : ReferenceGenomesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReferenceGenomesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceGenomesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceGenomesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReferenceGenomesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("referenceGenomes")
  private List<ReferenceGenomesEnum> referenceGenomes = null;

  @SerializedName("variantResidues")
  private String variantResidues = null;

  public Alteration alteration(String alteration) {
    this.alteration = alteration;
    return this;
  }

   /**
   * Get alteration
   * @return alteration
  **/
  @ApiModelProperty(value = "")
  public String getAlteration() {
    return alteration;
  }

  public void setAlteration(String alteration) {
    this.alteration = alteration;
  }

  public Alteration consequence(VariantConsequence consequence) {
    this.consequence = consequence;
    return this;
  }

   /**
   * Get consequence
   * @return consequence
  **/
  @ApiModelProperty(value = "")
  public VariantConsequence getConsequence() {
    return consequence;
  }

  public void setConsequence(VariantConsequence consequence) {
    this.consequence = consequence;
  }

  public Alteration gene(Gene gene) {
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

  public Alteration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Alteration proteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
    return this;
  }

   /**
   * Get proteinEnd
   * @return proteinEnd
  **/
  @ApiModelProperty(value = "")
  public Integer getProteinEnd() {
    return proteinEnd;
  }

  public void setProteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
  }

  public Alteration proteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
    return this;
  }

   /**
   * Get proteinStart
   * @return proteinStart
  **/
  @ApiModelProperty(value = "")
  public Integer getProteinStart() {
    return proteinStart;
  }

  public void setProteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
  }

  public Alteration refResidues(String refResidues) {
    this.refResidues = refResidues;
    return this;
  }

   /**
   * Get refResidues
   * @return refResidues
  **/
  @ApiModelProperty(value = "")
  public String getRefResidues() {
    return refResidues;
  }

  public void setRefResidues(String refResidues) {
    this.refResidues = refResidues;
  }

  public Alteration referenceGenomes(List<ReferenceGenomesEnum> referenceGenomes) {
    this.referenceGenomes = referenceGenomes;
    return this;
  }

  public Alteration addReferenceGenomesItem(ReferenceGenomesEnum referenceGenomesItem) {
    if (this.referenceGenomes == null) {
      this.referenceGenomes = new ArrayList<ReferenceGenomesEnum>();
    }
    this.referenceGenomes.add(referenceGenomesItem);
    return this;
  }

   /**
   * Get referenceGenomes
   * @return referenceGenomes
  **/
  @ApiModelProperty(value = "")
  public List<ReferenceGenomesEnum> getReferenceGenomes() {
    return referenceGenomes;
  }

  public void setReferenceGenomes(List<ReferenceGenomesEnum> referenceGenomes) {
    this.referenceGenomes = referenceGenomes;
  }

  public Alteration variantResidues(String variantResidues) {
    this.variantResidues = variantResidues;
    return this;
  }

   /**
   * Get variantResidues
   * @return variantResidues
  **/
  @ApiModelProperty(value = "")
  public String getVariantResidues() {
    return variantResidues;
  }

  public void setVariantResidues(String variantResidues) {
    this.variantResidues = variantResidues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alteration alteration = (Alteration) o;
    return Objects.equals(this.alteration, alteration.alteration) &&
        Objects.equals(this.consequence, alteration.consequence) &&
        Objects.equals(this.gene, alteration.gene) &&
        Objects.equals(this.name, alteration.name) &&
        Objects.equals(this.proteinEnd, alteration.proteinEnd) &&
        Objects.equals(this.proteinStart, alteration.proteinStart) &&
        Objects.equals(this.refResidues, alteration.refResidues) &&
        Objects.equals(this.referenceGenomes, alteration.referenceGenomes) &&
        Objects.equals(this.variantResidues, alteration.variantResidues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alteration, consequence, gene, name, proteinEnd, proteinStart, refResidues, referenceGenomes, variantResidues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alteration {\n");
    
    sb.append("    alteration: ").append(toIndentedString(alteration)).append("\n");
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    refResidues: ").append(toIndentedString(refResidues)).append("\n");
    sb.append("    referenceGenomes: ").append(toIndentedString(referenceGenomes)).append("\n");
    sb.append("    variantResidues: ").append(toIndentedString(variantResidues)).append("\n");
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

