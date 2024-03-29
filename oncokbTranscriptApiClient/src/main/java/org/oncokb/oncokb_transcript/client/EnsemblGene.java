/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.oncokb_transcript.client;

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
import org.oncokb.oncokb_transcript.client.Gene;
import org.oncokb.oncokb_transcript.client.Transcript;
import java.io.Serializable;

/**
 * EnsemblGene
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnsemblGene implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CANONICAL = "canonical";
  @SerializedName(SERIALIZED_NAME_CANONICAL)
  private Boolean canonical;

  public static final String SERIALIZED_NAME_CHROMOSOME = "chromosome";
  @SerializedName(SERIALIZED_NAME_CHROMOSOME)
  private String chromosome;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_ENSEMBL_GENE_ID = "ensemblGeneId";
  @SerializedName(SERIALIZED_NAME_ENSEMBL_GENE_ID)
  private String ensemblGeneId;

  public static final String SERIALIZED_NAME_GENE = "gene";
  @SerializedName(SERIALIZED_NAME_GENE)
  private Gene gene;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REFERENCE_GENOME = "referenceGenome";
  @SerializedName(SERIALIZED_NAME_REFERENCE_GENOME)
  private String referenceGenome;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_STRAND = "strand";
  @SerializedName(SERIALIZED_NAME_STRAND)
  private Integer strand;

  public static final String SERIALIZED_NAME_TRANSCRIPTS = "transcripts";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPTS)
  private Set<Transcript> transcripts = null;

  public EnsemblGene() { 
  }

  public EnsemblGene canonical(Boolean canonical) {
    
    this.canonical = canonical;
    return this;
  }

   /**
   * Get canonical
   * @return canonical
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanonical() {
    return canonical;
  }


  public void setCanonical(Boolean canonical) {
    this.canonical = canonical;
  }


  public EnsemblGene chromosome(String chromosome) {
    
    this.chromosome = chromosome;
    return this;
  }

   /**
   * Get chromosome
   * @return chromosome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getChromosome() {
    return chromosome;
  }


  public void setChromosome(String chromosome) {
    this.chromosome = chromosome;
  }


  public EnsemblGene end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public EnsemblGene ensemblGeneId(String ensemblGeneId) {
    
    this.ensemblGeneId = ensemblGeneId;
    return this;
  }

   /**
   * Get ensemblGeneId
   * @return ensemblGeneId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEnsemblGeneId() {
    return ensemblGeneId;
  }


  public void setEnsemblGeneId(String ensemblGeneId) {
    this.ensemblGeneId = ensemblGeneId;
  }


  public EnsemblGene gene(Gene gene) {
    
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


  public EnsemblGene id(Long id) {
    
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


  public EnsemblGene referenceGenome(String referenceGenome) {
    
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getReferenceGenome() {
    return referenceGenome;
  }


  public void setReferenceGenome(String referenceGenome) {
    this.referenceGenome = referenceGenome;
  }


  public EnsemblGene start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public EnsemblGene strand(Integer strand) {
    
    this.strand = strand;
    return this;
  }

   /**
   * Get strand
   * @return strand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStrand() {
    return strand;
  }


  public void setStrand(Integer strand) {
    this.strand = strand;
  }


  public EnsemblGene transcripts(Set<Transcript> transcripts) {
    
    this.transcripts = transcripts;
    return this;
  }

  public EnsemblGene addTranscriptsItem(Transcript transcriptsItem) {
    if (this.transcripts == null) {
      this.transcripts = new LinkedHashSet<Transcript>();
    }
    this.transcripts.add(transcriptsItem);
    return this;
  }

   /**
   * Get transcripts
   * @return transcripts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Transcript> getTranscripts() {
    return transcripts;
  }


  public void setTranscripts(Set<Transcript> transcripts) {
    this.transcripts = transcripts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnsemblGene ensemblGene = (EnsemblGene) o;
    return Objects.equals(this.canonical, ensemblGene.canonical) &&
        Objects.equals(this.chromosome, ensemblGene.chromosome) &&
        Objects.equals(this.end, ensemblGene.end) &&
        Objects.equals(this.ensemblGeneId, ensemblGene.ensemblGeneId) &&
        Objects.equals(this.gene, ensemblGene.gene) &&
        Objects.equals(this.id, ensemblGene.id) &&
        Objects.equals(this.referenceGenome, ensemblGene.referenceGenome) &&
        Objects.equals(this.start, ensemblGene.start) &&
        Objects.equals(this.strand, ensemblGene.strand) &&
        Objects.equals(this.transcripts, ensemblGene.transcripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonical, chromosome, end, ensemblGeneId, gene, id, referenceGenome, start, strand, transcripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnsemblGene {\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    ensemblGeneId: ").append(toIndentedString(ensemblGeneId)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
    sb.append("    transcripts: ").append(toIndentedString(transcripts)).append("\n");
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

