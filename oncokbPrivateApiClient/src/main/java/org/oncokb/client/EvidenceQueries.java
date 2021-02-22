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
import org.oncokb.client.Query;

/**
 * EvidenceQueries
 */

public class EvidenceQueries {
  @SerializedName("evidenceTypes")
  private String evidenceTypes = null;

  @SerializedName("highestLevelOnly")
  private Boolean highestLevelOnly = null;

  /**
   * Gets or Sets levels
   */
  @JsonAdapter(LevelsEnum.Adapter.class)
  public enum LevelsEnum {
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

    public static LevelsEnum fromValue(String text) {
      for (LevelsEnum b : LevelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LevelsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("levels")
  private List<LevelsEnum> levels = null;

  @SerializedName("queries")
  private List<Query> queries = null;

  public EvidenceQueries evidenceTypes(String evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
    return this;
  }

   /**
   * Get evidenceTypes
   * @return evidenceTypes
  **/
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
  @ApiModelProperty(value = "")
  public Boolean isHighestLevelOnly() {
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
  @ApiModelProperty(value = "")
  public List<Query> getQueries() {
    return queries;
  }

  public void setQueries(List<Query> queries) {
    this.queries = queries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

