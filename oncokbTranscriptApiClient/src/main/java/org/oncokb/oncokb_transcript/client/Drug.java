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
import org.oncokb.oncokb_transcript.client.DrugSynonym;
import java.io.Serializable;

/**
 * Drug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Drug implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SEMANTIC_TYPE = "semanticType";
  @SerializedName(SERIALIZED_NAME_SEMANTIC_TYPE)
  private String semanticType;

  public static final String SERIALIZED_NAME_SYNONYMS = "synonyms";
  @SerializedName(SERIALIZED_NAME_SYNONYMS)
  private Set<DrugSynonym> synonyms = null;

  public Drug() { 
  }

  public Drug code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Drug id(Long id) {
    
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


  public Drug name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Drug semanticType(String semanticType) {
    
    this.semanticType = semanticType;
    return this;
  }

   /**
   * Get semanticType
   * @return semanticType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSemanticType() {
    return semanticType;
  }


  public void setSemanticType(String semanticType) {
    this.semanticType = semanticType;
  }


  public Drug synonyms(Set<DrugSynonym> synonyms) {
    
    this.synonyms = synonyms;
    return this;
  }

  public Drug addSynonymsItem(DrugSynonym synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new LinkedHashSet<DrugSynonym>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Get synonyms
   * @return synonyms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<DrugSynonym> getSynonyms() {
    return synonyms;
  }


  public void setSynonyms(Set<DrugSynonym> synonyms) {
    this.synonyms = synonyms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drug drug = (Drug) o;
    return Objects.equals(this.code, drug.code) &&
        Objects.equals(this.id, drug.id) &&
        Objects.equals(this.name, drug.name) &&
        Objects.equals(this.semanticType, drug.semanticType) &&
        Objects.equals(this.synonyms, drug.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, id, name, semanticType, synonyms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    semanticType: ").append(toIndentedString(semanticType)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
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

