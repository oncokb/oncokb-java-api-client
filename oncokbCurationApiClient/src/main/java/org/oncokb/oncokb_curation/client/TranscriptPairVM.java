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
import java.io.Serializable;

/**
 * TranscriptPairVM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranscriptPairVM implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public static final String SERIALIZED_NAME_TRANSCRIPT = "transcript";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPT)
  private String transcript;

  public TranscriptPairVM() { 
  }

  public TranscriptPairVM referenceGenome(ReferenceGenomeEnum referenceGenome) {
    
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


  public TranscriptPairVM transcript(String transcript) {
    
    this.transcript = transcript;
    return this;
  }

   /**
   * Get transcript
   * @return transcript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTranscript() {
    return transcript;
  }


  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptPairVM transcriptPairVM = (TranscriptPairVM) o;
    return Objects.equals(this.referenceGenome, transcriptPairVM.referenceGenome) &&
        Objects.equals(this.transcript, transcriptPairVM.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceGenome, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptPairVM {\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
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
