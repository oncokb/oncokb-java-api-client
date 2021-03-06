/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.oncokb.oncokb_transcript.client.Sequence;
import org.oncokb.oncokb_transcript.client.TranscriptUsage;
/**
 * Transcript
 */


public class Transcript {
  @SerializedName("description")
  private String description = null;

  @SerializedName("ensemblProteinId")
  private String ensemblProteinId = null;

  @SerializedName("ensemblTranscriptId")
  private String ensemblTranscriptId = null;

  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("id")
  private Long id = null;

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
        Object value = jsonReader.nextString();
        return ReferenceGenomeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("referenceGenome")
  private ReferenceGenomeEnum referenceGenome = null;

  @SerializedName("referenceSequenceId")
  private String referenceSequenceId = null;

  @SerializedName("sequences")
  private List<Sequence> sequences = null;

  @SerializedName("transcriptUsages")
  private List<TranscriptUsage> transcriptUsages = null;

  public Transcript description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transcript ensemblProteinId(String ensemblProteinId) {
    this.ensemblProteinId = ensemblProteinId;
    return this;
  }

   /**
   * Get ensemblProteinId
   * @return ensemblProteinId
  **/
  @Schema(description = "")
  public String getEnsemblProteinId() {
    return ensemblProteinId;
  }

  public void setEnsemblProteinId(String ensemblProteinId) {
    this.ensemblProteinId = ensemblProteinId;
  }

  public Transcript ensemblTranscriptId(String ensemblTranscriptId) {
    this.ensemblTranscriptId = ensemblTranscriptId;
    return this;
  }

   /**
   * Get ensemblTranscriptId
   * @return ensemblTranscriptId
  **/
  @Schema(description = "")
  public String getEnsemblTranscriptId() {
    return ensemblTranscriptId;
  }

  public void setEnsemblTranscriptId(String ensemblTranscriptId) {
    this.ensemblTranscriptId = ensemblTranscriptId;
  }

  public Transcript entrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
  @Schema(required = true, description = "")
  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public Transcript hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @Schema(required = true, description = "")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public Transcript id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Transcript referenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @Schema(required = true, description = "")
  public ReferenceGenomeEnum getReferenceGenome() {
    return referenceGenome;
  }

  public void setReferenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
  }

  public Transcript referenceSequenceId(String referenceSequenceId) {
    this.referenceSequenceId = referenceSequenceId;
    return this;
  }

   /**
   * Get referenceSequenceId
   * @return referenceSequenceId
  **/
  @Schema(description = "")
  public String getReferenceSequenceId() {
    return referenceSequenceId;
  }

  public void setReferenceSequenceId(String referenceSequenceId) {
    this.referenceSequenceId = referenceSequenceId;
  }

  public Transcript sequences(List<Sequence> sequences) {
    this.sequences = sequences;
    return this;
  }

  public Transcript addSequencesItem(Sequence sequencesItem) {
    if (this.sequences == null) {
      this.sequences = new ArrayList<Sequence>();
    }
    this.sequences.add(sequencesItem);
    return this;
  }

   /**
   * Get sequences
   * @return sequences
  **/
  @Schema(description = "")
  public List<Sequence> getSequences() {
    return sequences;
  }

  public void setSequences(List<Sequence> sequences) {
    this.sequences = sequences;
  }

  public Transcript transcriptUsages(List<TranscriptUsage> transcriptUsages) {
    this.transcriptUsages = transcriptUsages;
    return this;
  }

  public Transcript addTranscriptUsagesItem(TranscriptUsage transcriptUsagesItem) {
    if (this.transcriptUsages == null) {
      this.transcriptUsages = new ArrayList<TranscriptUsage>();
    }
    this.transcriptUsages.add(transcriptUsagesItem);
    return this;
  }

   /**
   * Get transcriptUsages
   * @return transcriptUsages
  **/
  @Schema(description = "")
  public List<TranscriptUsage> getTranscriptUsages() {
    return transcriptUsages;
  }

  public void setTranscriptUsages(List<TranscriptUsage> transcriptUsages) {
    this.transcriptUsages = transcriptUsages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transcript transcript = (Transcript) o;
    return Objects.equals(this.description, transcript.description) &&
        Objects.equals(this.ensemblProteinId, transcript.ensemblProteinId) &&
        Objects.equals(this.ensemblTranscriptId, transcript.ensemblTranscriptId) &&
        Objects.equals(this.entrezGeneId, transcript.entrezGeneId) &&
        Objects.equals(this.hugoSymbol, transcript.hugoSymbol) &&
        Objects.equals(this.id, transcript.id) &&
        Objects.equals(this.referenceGenome, transcript.referenceGenome) &&
        Objects.equals(this.referenceSequenceId, transcript.referenceSequenceId) &&
        Objects.equals(this.sequences, transcript.sequences) &&
        Objects.equals(this.transcriptUsages, transcript.transcriptUsages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, ensemblProteinId, ensemblTranscriptId, entrezGeneId, hugoSymbol, id, referenceGenome, referenceSequenceId, sequences, transcriptUsages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transcript {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ensemblProteinId: ").append(toIndentedString(ensemblProteinId)).append("\n");
    sb.append("    ensemblTranscriptId: ").append(toIndentedString(ensemblTranscriptId)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    referenceSequenceId: ").append(toIndentedString(referenceSequenceId)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    transcriptUsages: ").append(toIndentedString(transcriptUsages)).append("\n");
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
