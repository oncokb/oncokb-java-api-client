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
import org.oncokb.oncokb_curation.client.Drug;
import java.io.Serializable;

/**
 * DrugBrand
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DrugBrand implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets region
   */
  @JsonAdapter(RegionEnum.Adapter.class)
  public enum RegionEnum {
    US("US"),
    
    EU("EU");

    private String value;

    RegionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegionEnum fromValue(String value) {
      for (RegionEnum b : RegionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RegionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private RegionEnum region;

  public static final String SERIALIZED_NAME_DRUG = "drug";
  @SerializedName(SERIALIZED_NAME_DRUG)
  private Drug drug;

  public DrugBrand() { 
  }

  public DrugBrand id(Long id) {
    
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


  public DrugBrand name(String name) {
    
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


  public DrugBrand region(RegionEnum region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RegionEnum getRegion() {
    return region;
  }


  public void setRegion(RegionEnum region) {
    this.region = region;
  }


  public DrugBrand drug(Drug drug) {
    
    this.drug = drug;
    return this;
  }

   /**
   * Get drug
   * @return drug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Drug getDrug() {
    return drug;
  }


  public void setDrug(Drug drug) {
    this.drug = drug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugBrand drugBrand = (DrugBrand) o;
    return Objects.equals(this.id, drugBrand.id) &&
        Objects.equals(this.name, drugBrand.name) &&
        Objects.equals(this.region, drugBrand.region) &&
        Objects.equals(this.drug, drugBrand.drug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, region, drug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugBrand {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    drug: ").append(toIndentedString(drug)).append("\n");
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
