/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.oncokb_curation.client;

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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.oncokb.oncokb_curation.client.AlterationReferenceGenome;
import org.oncokb.oncokb_curation.client.BiomarkerAssociation;
import org.oncokb.oncokb_curation.client.Consequence;
import org.oncokb.oncokb_curation.client.Gene;
import java.io.Serializable;

/**
 * Alteration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Alteration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ALTERATION = "alteration";
  @SerializedName(SERIALIZED_NAME_ALTERATION)
  private String alteration;

  public static final String SERIALIZED_NAME_PROTEIN_START = "proteinStart";
  @SerializedName(SERIALIZED_NAME_PROTEIN_START)
  private Integer proteinStart;

  public static final String SERIALIZED_NAME_PROTEIN_END = "proteinEnd";
  @SerializedName(SERIALIZED_NAME_PROTEIN_END)
  private Integer proteinEnd;

  public static final String SERIALIZED_NAME_REF_RESIDUES = "refResidues";
  @SerializedName(SERIALIZED_NAME_REF_RESIDUES)
  private String refResidues;

  public static final String SERIALIZED_NAME_VARIANT_RESIDUES = "variantResidues";
  @SerializedName(SERIALIZED_NAME_VARIANT_RESIDUES)
  private String variantResidues;

  public static final String SERIALIZED_NAME_REFERENCE_GENOMES = "referenceGenomes";
  @SerializedName(SERIALIZED_NAME_REFERENCE_GENOMES)
  private Set<AlterationReferenceGenome> referenceGenomes = null;

  public static final String SERIALIZED_NAME_GENES = "genes";
  @SerializedName(SERIALIZED_NAME_GENES)
  private Set<Gene> genes = null;

  public static final String SERIALIZED_NAME_CONSEQUENCE = "consequence";
  @SerializedName(SERIALIZED_NAME_CONSEQUENCE)
  private Consequence consequence;

  public static final String SERIALIZED_NAME_BIOMARKER_ASSOCIATIONS = "biomarkerAssociations";
  @SerializedName(SERIALIZED_NAME_BIOMARKER_ASSOCIATIONS)
  private Set<BiomarkerAssociation> biomarkerAssociations = null;

  public Alteration() { 
  }

  public Alteration id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Alteration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Alteration alteration(String alteration) {
    
    this.alteration = alteration;
    return this;
  }

   /**
   * Get alteration
   * @return alteration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAlteration() {
    return alteration;
  }


  public void setAlteration(String alteration) {
    this.alteration = alteration;
  }


  public Alteration proteinStart(Integer proteinStart) {
    
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


  public Alteration proteinEnd(Integer proteinEnd) {
    
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


  public Alteration refResidues(String refResidues) {
    
    this.refResidues = refResidues;
    return this;
  }

   /**
   * Get refResidues
   * @return refResidues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefResidues() {
    return refResidues;
  }


  public void setRefResidues(String refResidues) {
    this.refResidues = refResidues;
  }


  public Alteration variantResidues(String variantResidues) {
    
    this.variantResidues = variantResidues;
    return this;
  }

   /**
   * Get variantResidues
   * @return variantResidues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariantResidues() {
    return variantResidues;
  }


  public void setVariantResidues(String variantResidues) {
    this.variantResidues = variantResidues;
  }


  public Alteration referenceGenomes(Set<AlterationReferenceGenome> referenceGenomes) {
    
    this.referenceGenomes = referenceGenomes;
    return this;
  }

  public Alteration addReferenceGenomesItem(AlterationReferenceGenome referenceGenomesItem) {
    if (this.referenceGenomes == null) {
      this.referenceGenomes = new LinkedHashSet<AlterationReferenceGenome>();
    }
    this.referenceGenomes.add(referenceGenomesItem);
    return this;
  }

   /**
   * Get referenceGenomes
   * @return referenceGenomes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<AlterationReferenceGenome> getReferenceGenomes() {
    return referenceGenomes;
  }


  public void setReferenceGenomes(Set<AlterationReferenceGenome> referenceGenomes) {
    this.referenceGenomes = referenceGenomes;
  }


  public Alteration genes(Set<Gene> genes) {
    
    this.genes = genes;
    return this;
  }

  public Alteration addGenesItem(Gene genesItem) {
    if (this.genes == null) {
      this.genes = new LinkedHashSet<Gene>();
    }
    this.genes.add(genesItem);
    return this;
  }

   /**
   * Get genes
   * @return genes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Gene> getGenes() {
    return genes;
  }


  public void setGenes(Set<Gene> genes) {
    this.genes = genes;
  }


  public Alteration consequence(Consequence consequence) {
    
    this.consequence = consequence;
    return this;
  }

   /**
   * Get consequence
   * @return consequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Consequence getConsequence() {
    return consequence;
  }


  public void setConsequence(Consequence consequence) {
    this.consequence = consequence;
  }


  public Alteration biomarkerAssociations(Set<BiomarkerAssociation> biomarkerAssociations) {
    
    this.biomarkerAssociations = biomarkerAssociations;
    return this;
  }

  public Alteration addBiomarkerAssociationsItem(BiomarkerAssociation biomarkerAssociationsItem) {
    if (this.biomarkerAssociations == null) {
      this.biomarkerAssociations = new LinkedHashSet<BiomarkerAssociation>();
    }
    this.biomarkerAssociations.add(biomarkerAssociationsItem);
    return this;
  }

   /**
   * Get biomarkerAssociations
   * @return biomarkerAssociations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<BiomarkerAssociation> getBiomarkerAssociations() {
    return biomarkerAssociations;
  }


  public void setBiomarkerAssociations(Set<BiomarkerAssociation> biomarkerAssociations) {
    this.biomarkerAssociations = biomarkerAssociations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alteration alteration = (Alteration) o;
    return Objects.equals(this.id, alteration.id) &&
        Objects.equals(this.name, alteration.name) &&
        Objects.equals(this.alteration, alteration.alteration) &&
        Objects.equals(this.proteinStart, alteration.proteinStart) &&
        Objects.equals(this.proteinEnd, alteration.proteinEnd) &&
        Objects.equals(this.refResidues, alteration.refResidues) &&
        Objects.equals(this.variantResidues, alteration.variantResidues) &&
        Objects.equals(this.referenceGenomes, alteration.referenceGenomes) &&
        Objects.equals(this.genes, alteration.genes) &&
        Objects.equals(this.consequence, alteration.consequence) &&
        Objects.equals(this.biomarkerAssociations, alteration.biomarkerAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, alteration, proteinStart, proteinEnd, refResidues, variantResidues, referenceGenomes, genes, consequence, biomarkerAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alteration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alteration: ").append(toIndentedString(alteration)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    refResidues: ").append(toIndentedString(refResidues)).append("\n");
    sb.append("    variantResidues: ").append(toIndentedString(variantResidues)).append("\n");
    sb.append("    referenceGenomes: ").append(toIndentedString(referenceGenomes)).append("\n");
    sb.append("    genes: ").append(toIndentedString(genes)).append("\n");
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    biomarkerAssociations: ").append(toIndentedString(biomarkerAssociations)).append("\n");
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
