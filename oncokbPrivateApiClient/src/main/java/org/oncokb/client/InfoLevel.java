/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * The version of the OpenAPI document: v1.2.2
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
 * InfoLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InfoLevel {
  public static final String SERIALIZED_NAME_COLOR_HEX = "colorHex";
  @SerializedName(SERIALIZED_NAME_COLOR_HEX)
  private String colorHex;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HTML_DESCRIPTION = "htmlDescription";
  @SerializedName(SERIALIZED_NAME_HTML_DESCRIPTION)
  private String htmlDescription;

  /**
   * Gets or Sets levelOfEvidence
   */
  @JsonAdapter(LevelOfEvidenceEnum.Adapter.class)
  public enum LevelOfEvidenceEnum {
    LEVEL_0("LEVEL_0"),
    
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_2A("LEVEL_2A"),
    
    LEVEL_2B("LEVEL_2B"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_R3("LEVEL_R3"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    NO("NO");

    private String value;

    LevelOfEvidenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelOfEvidenceEnum fromValue(String value) {
      for (LevelOfEvidenceEnum b : LevelOfEvidenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LevelOfEvidenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelOfEvidenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelOfEvidenceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LevelOfEvidenceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LEVEL_OF_EVIDENCE = "levelOfEvidence";
  @SerializedName(SERIALIZED_NAME_LEVEL_OF_EVIDENCE)
  private LevelOfEvidenceEnum levelOfEvidence;

  public InfoLevel() { 
  }

  public InfoLevel colorHex(String colorHex) {
    
    this.colorHex = colorHex;
    return this;
  }

   /**
   * Get colorHex
   * @return colorHex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColorHex() {
    return colorHex;
  }


  public void setColorHex(String colorHex) {
    this.colorHex = colorHex;
  }


  public InfoLevel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InfoLevel htmlDescription(String htmlDescription) {
    
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * Get htmlDescription
   * @return htmlDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHtmlDescription() {
    return htmlDescription;
  }


  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }


  public InfoLevel levelOfEvidence(LevelOfEvidenceEnum levelOfEvidence) {
    
    this.levelOfEvidence = levelOfEvidence;
    return this;
  }

   /**
   * Get levelOfEvidence
   * @return levelOfEvidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LevelOfEvidenceEnum getLevelOfEvidence() {
    return levelOfEvidence;
  }


  public void setLevelOfEvidence(LevelOfEvidenceEnum levelOfEvidence) {
    this.levelOfEvidence = levelOfEvidence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoLevel infoLevel = (InfoLevel) o;
    return Objects.equals(this.colorHex, infoLevel.colorHex) &&
        Objects.equals(this.description, infoLevel.description) &&
        Objects.equals(this.htmlDescription, infoLevel.htmlDescription) &&
        Objects.equals(this.levelOfEvidence, infoLevel.levelOfEvidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorHex, description, htmlDescription, levelOfEvidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoLevel {\n");
    sb.append("    colorHex: ").append(toIndentedString(colorHex)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    levelOfEvidence: ").append(toIndentedString(levelOfEvidence)).append("\n");
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

