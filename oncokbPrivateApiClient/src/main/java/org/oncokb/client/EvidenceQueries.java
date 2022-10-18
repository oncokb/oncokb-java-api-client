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
import java.util.ArrayList;
import java.util.List;
import org.oncokb.client.Query;

/**
 * EvidenceQueries
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EvidenceQueries {
  public static final String SERIALIZED_NAME_EVIDENCE_TYPES = "evidenceTypes";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_TYPES)
  private String evidenceTypes;

  public static final String SERIALIZED_NAME_HIGHEST_LEVEL_ONLY = "highestLevelOnly";
  @SerializedName(SERIALIZED_NAME_HIGHEST_LEVEL_ONLY)
  private Boolean highestLevelOnly;

  /**
   * Gets or Sets levels
   */
  @JsonAdapter(LevelsEnum.Adapter.class)
  public enum LevelsEnum {
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    LEVEL_FDA1("LEVEL_Fda1"),
    
    LEVEL_FDA2("LEVEL_Fda2"),
    
    LEVEL_FDA3("LEVEL_Fda3"),
    
    NO("NO");

    private String value;

    LevelsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelsEnum fromValue(String value) {
      for (LevelsEnum b : LevelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LevelsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LEVELS = "levels";
  @SerializedName(SERIALIZED_NAME_LEVELS)
  private List<LevelsEnum> levels = null;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<Query> queries = null;

  public EvidenceQueries() { 
  }

  public EvidenceQueries evidenceTypes(String evidenceTypes) {
    
    this.evidenceTypes = evidenceTypes;
    return this;
  }

   /**
   * Get evidenceTypes
   * @return evidenceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEvidenceTypes() {
    return evidenceTypes;
  }


  public void setEvidenceTypes(String evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
  }


  public EvidenceQueries highestLevelOnly(Boolean highestLevelOnly) {
    
    this.highestLevelOnly = highestLevelOnly;
    return this;
  }

   /**
   * Get highestLevelOnly
   * @return highestLevelOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHighestLevelOnly() {
    return highestLevelOnly;
  }


  public void setHighestLevelOnly(Boolean highestLevelOnly) {
    this.highestLevelOnly = highestLevelOnly;
  }


  public EvidenceQueries levels(List<LevelsEnum> levels) {
    
    this.levels = levels;
    return this;
  }

  public EvidenceQueries addLevelsItem(LevelsEnum levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<LevelsEnum>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LevelsEnum> getLevels() {
    return levels;
  }


  public void setLevels(List<LevelsEnum> levels) {
    this.levels = levels;
  }


  public EvidenceQueries queries(List<Query> queries) {
    
    this.queries = queries;
    return this;
  }

  public EvidenceQueries addQueriesItem(Query queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<Query>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Query> getQueries() {
    return queries;
  }


  public void setQueries(List<Query> queries) {
    this.queries = queries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvidenceQueries evidenceQueries = (EvidenceQueries) o;
    return Objects.equals(this.evidenceTypes, evidenceQueries.evidenceTypes) &&
        Objects.equals(this.highestLevelOnly, evidenceQueries.highestLevelOnly) &&
        Objects.equals(this.levels, evidenceQueries.levels) &&
        Objects.equals(this.queries, evidenceQueries.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceTypes, highestLevelOnly, levels, queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceQueries {\n");
    sb.append("    evidenceTypes: ").append(toIndentedString(evidenceTypes)).append("\n");
    sb.append("    highestLevelOnly: ").append(toIndentedString(highestLevelOnly)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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

