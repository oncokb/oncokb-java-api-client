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

/**
 * OncoTree Cancer Type
 */
@ApiModel(description = "OncoTree Cancer Type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MainType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets tumorForm
   */
  @JsonAdapter(TumorFormEnum.Adapter.class)
  public enum TumorFormEnum {
    SOLID("SOLID"),
    
    LIQUID("LIQUID"),
    
    MIXED("MIXED");

    private String value;

    TumorFormEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TumorFormEnum fromValue(String value) {
      for (TumorFormEnum b : TumorFormEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TumorFormEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TumorFormEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TumorFormEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TumorFormEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TUMOR_FORM = "tumorForm";
  @SerializedName(SERIALIZED_NAME_TUMOR_FORM)
  private TumorFormEnum tumorForm;

  public MainType() { 
  }

  public MainType id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public MainType name(String name) {
    
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


  public MainType tumorForm(TumorFormEnum tumorForm) {
    
    this.tumorForm = tumorForm;
    return this;
  }

   /**
   * Get tumorForm
   * @return tumorForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TumorFormEnum getTumorForm() {
    return tumorForm;
  }


  public void setTumorForm(TumorFormEnum tumorForm) {
    this.tumorForm = tumorForm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainType mainType = (MainType) o;
    return Objects.equals(this.id, mainType.id) &&
        Objects.equals(this.name, mainType.name) &&
        Objects.equals(this.tumorForm, mainType.tumorForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tumorForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tumorForm: ").append(toIndentedString(tumorForm)).append("\n");
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

