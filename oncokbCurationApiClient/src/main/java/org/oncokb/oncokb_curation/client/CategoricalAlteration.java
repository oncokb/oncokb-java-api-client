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
 * CategoricalAlteration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CategoricalAlteration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONCOGENIC_MUTATIONS("ONCOGENIC_MUTATIONS"),
    
    GAIN_OF_FUNCTION_MUTATIONS("GAIN_OF_FUNCTION_MUTATIONS"),
    
    LOSS_OF_FUNCTION_MUTATIONS("LOSS_OF_FUNCTION_MUTATIONS"),
    
    SWITCH_OF_FUNCTION_MUTATIONS("SWITCH_OF_FUNCTION_MUTATIONS"),
    
    VUS("VUS"),
    
    TRUNCATING_MUTATIONS("TRUNCATING_MUTATIONS"),
    
    FUSIONS("FUSIONS"),
    
    AMPLIFICATION("AMPLIFICATION"),
    
    DELETION("DELETION"),
    
    PROMOTER("PROMOTER"),
    
    WILDTYPE("WILDTYPE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Gets or Sets alterationType
   */
  @JsonAdapter(AlterationTypeEnum.Adapter.class)
  public enum AlterationTypeEnum {
    MUTATION("MUTATION"),
    
    COPY_NUMBER_ALTERATION("COPY_NUMBER_ALTERATION"),
    
    STRUCTURAL_VARIANT("STRUCTURAL_VARIANT"),
    
    UNKNOWN("UNKNOWN"),
    
    NA("NA");

    private String value;

    AlterationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlterationTypeEnum fromValue(String value) {
      for (AlterationTypeEnum b : AlterationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlterationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlterationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlterationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlterationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALTERATION_TYPE = "alterationType";
  @SerializedName(SERIALIZED_NAME_ALTERATION_TYPE)
  private AlterationTypeEnum alterationType;

  public CategoricalAlteration() { 
  }

  public CategoricalAlteration id(Long id) {
    
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


  public CategoricalAlteration name(String name) {
    
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


  public CategoricalAlteration type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CategoricalAlteration alterationType(AlterationTypeEnum alterationType) {
    
    this.alterationType = alterationType;
    return this;
  }

   /**
   * Get alterationType
   * @return alterationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AlterationTypeEnum getAlterationType() {
    return alterationType;
  }


  public void setAlterationType(AlterationTypeEnum alterationType) {
    this.alterationType = alterationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoricalAlteration categoricalAlteration = (CategoricalAlteration) o;
    return Objects.equals(this.id, categoricalAlteration.id) &&
        Objects.equals(this.name, categoricalAlteration.name) &&
        Objects.equals(this.type, categoricalAlteration.type) &&
        Objects.equals(this.alterationType, categoricalAlteration.alterationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, alterationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoricalAlteration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alterationType: ").append(toIndentedString(alterationType)).append("\n");
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

