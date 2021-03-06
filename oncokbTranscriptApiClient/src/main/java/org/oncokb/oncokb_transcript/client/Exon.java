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
/**
 * Exon
 */


public class Exon {
  @SerializedName("exonEnd")
  private Integer exonEnd = null;

  @SerializedName("exonId")
  private String exonId = null;

  @SerializedName("exonStart")
  private Integer exonStart = null;

  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("strand")
  private Integer strand = null;

  @SerializedName("version")
  private Integer version = null;

  public Exon exonEnd(Integer exonEnd) {
    this.exonEnd = exonEnd;
    return this;
  }

   /**
   * End position of exon
   * @return exonEnd
  **/
  @Schema(required = true, description = "End position of exon")
  public Integer getExonEnd() {
    return exonEnd;
  }

  public void setExonEnd(Integer exonEnd) {
    this.exonEnd = exonEnd;
  }

  public Exon exonId(String exonId) {
    this.exonId = exonId;
    return this;
  }

   /**
   * Exon id
   * @return exonId
  **/
  @Schema(required = true, description = "Exon id")
  public String getExonId() {
    return exonId;
  }

  public void setExonId(String exonId) {
    this.exonId = exonId;
  }

  public Exon exonStart(Integer exonStart) {
    this.exonStart = exonStart;
    return this;
  }

   /**
   * Start position of exon
   * @return exonStart
  **/
  @Schema(required = true, description = "Start position of exon")
  public Integer getExonStart() {
    return exonStart;
  }

  public void setExonStart(Integer exonStart) {
    this.exonStart = exonStart;
  }

  public Exon rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Number of exon in transcript
   * @return rank
  **/
  @Schema(required = true, description = "Number of exon in transcript")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public Exon strand(Integer strand) {
    this.strand = strand;
    return this;
  }

   /**
   * Strand exon is on, -1 for - and 1 for +
   * @return strand
  **/
  @Schema(required = true, description = "Strand exon is on, -1 for - and 1 for +")
  public Integer getStrand() {
    return strand;
  }

  public void setStrand(Integer strand) {
    this.strand = strand;
  }

  public Exon version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Exon version
   * @return version
  **/
  @Schema(required = true, description = "Exon version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exon exon = (Exon) o;
    return Objects.equals(this.exonEnd, exon.exonEnd) &&
        Objects.equals(this.exonId, exon.exonId) &&
        Objects.equals(this.exonStart, exon.exonStart) &&
        Objects.equals(this.rank, exon.rank) &&
        Objects.equals(this.strand, exon.strand) &&
        Objects.equals(this.version, exon.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exonEnd, exonId, exonStart, rank, strand, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exon {\n");
    
    sb.append("    exonEnd: ").append(toIndentedString(exonEnd)).append("\n");
    sb.append("    exonId: ").append(toIndentedString(exonId)).append("\n");
    sb.append("    exonStart: ").append(toIndentedString(exonStart)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
