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
import org.oncokb.oncokb_curation.client.IntegerFilter;
import org.oncokb.oncokb_curation.client.LongFilter;
import org.oncokb.oncokb_curation.client.StringFilter;
import org.oncokb.oncokb_curation.client.TumorFormFilter;
import java.io.Serializable;

/**
 * CancerTypeCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CancerTypeCriteria implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private LongFilter id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private StringFilter code;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private StringFilter color;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private IntegerFilter level;

  public static final String SERIALIZED_NAME_MAIN_TYPE = "mainType";
  @SerializedName(SERIALIZED_NAME_MAIN_TYPE)
  private StringFilter mainType;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private StringFilter subtype;

  public static final String SERIALIZED_NAME_TISSUE = "tissue";
  @SerializedName(SERIALIZED_NAME_TISSUE)
  private StringFilter tissue;

  public static final String SERIALIZED_NAME_TUMOR_FORM = "tumorForm";
  @SerializedName(SERIALIZED_NAME_TUMOR_FORM)
  private TumorFormFilter tumorForm;

  public static final String SERIALIZED_NAME_CHILDREN_ID = "childrenId";
  @SerializedName(SERIALIZED_NAME_CHILDREN_ID)
  private LongFilter childrenId;

  public static final String SERIALIZED_NAME_BIOMARKER_ASSOCIATION_ID = "biomarkerAssociationId";
  @SerializedName(SERIALIZED_NAME_BIOMARKER_ASSOCIATION_ID)
  private LongFilter biomarkerAssociationId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private LongFilter parentId;

  public static final String SERIALIZED_NAME_DISTINCT = "distinct";
  @SerializedName(SERIALIZED_NAME_DISTINCT)
  private Boolean distinct;

  public CancerTypeCriteria() { 
  }

  public CancerTypeCriteria id(LongFilter id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LongFilter getId() {
    return id;
  }


  public void setId(LongFilter id) {
    this.id = id;
  }


  public CancerTypeCriteria code(StringFilter code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringFilter getCode() {
    return code;
  }


  public void setCode(StringFilter code) {
    this.code = code;
  }


  public CancerTypeCriteria color(StringFilter color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringFilter getColor() {
    return color;
  }


  public void setColor(StringFilter color) {
    this.color = color;
  }


  public CancerTypeCriteria level(IntegerFilter level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntegerFilter getLevel() {
    return level;
  }


  public void setLevel(IntegerFilter level) {
    this.level = level;
  }


  public CancerTypeCriteria mainType(StringFilter mainType) {
    
    this.mainType = mainType;
    return this;
  }

   /**
   * Get mainType
   * @return mainType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringFilter getMainType() {
    return mainType;
  }


  public void setMainType(StringFilter mainType) {
    this.mainType = mainType;
  }


  public CancerTypeCriteria subtype(StringFilter subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringFilter getSubtype() {
    return subtype;
  }


  public void setSubtype(StringFilter subtype) {
    this.subtype = subtype;
  }


  public CancerTypeCriteria tissue(StringFilter tissue) {
    
    this.tissue = tissue;
    return this;
  }

   /**
   * Get tissue
   * @return tissue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringFilter getTissue() {
    return tissue;
  }


  public void setTissue(StringFilter tissue) {
    this.tissue = tissue;
  }


  public CancerTypeCriteria tumorForm(TumorFormFilter tumorForm) {
    
    this.tumorForm = tumorForm;
    return this;
  }

   /**
   * Get tumorForm
   * @return tumorForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TumorFormFilter getTumorForm() {
    return tumorForm;
  }


  public void setTumorForm(TumorFormFilter tumorForm) {
    this.tumorForm = tumorForm;
  }


  public CancerTypeCriteria childrenId(LongFilter childrenId) {
    
    this.childrenId = childrenId;
    return this;
  }

   /**
   * Get childrenId
   * @return childrenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LongFilter getChildrenId() {
    return childrenId;
  }


  public void setChildrenId(LongFilter childrenId) {
    this.childrenId = childrenId;
  }


  public CancerTypeCriteria biomarkerAssociationId(LongFilter biomarkerAssociationId) {
    
    this.biomarkerAssociationId = biomarkerAssociationId;
    return this;
  }

   /**
   * Get biomarkerAssociationId
   * @return biomarkerAssociationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LongFilter getBiomarkerAssociationId() {
    return biomarkerAssociationId;
  }


  public void setBiomarkerAssociationId(LongFilter biomarkerAssociationId) {
    this.biomarkerAssociationId = biomarkerAssociationId;
  }


  public CancerTypeCriteria parentId(LongFilter parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LongFilter getParentId() {
    return parentId;
  }


  public void setParentId(LongFilter parentId) {
    this.parentId = parentId;
  }


  public CancerTypeCriteria distinct(Boolean distinct) {
    
    this.distinct = distinct;
    return this;
  }

   /**
   * Get distinct
   * @return distinct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDistinct() {
    return distinct;
  }


  public void setDistinct(Boolean distinct) {
    this.distinct = distinct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancerTypeCriteria cancerTypeCriteria = (CancerTypeCriteria) o;
    return Objects.equals(this.id, cancerTypeCriteria.id) &&
        Objects.equals(this.code, cancerTypeCriteria.code) &&
        Objects.equals(this.color, cancerTypeCriteria.color) &&
        Objects.equals(this.level, cancerTypeCriteria.level) &&
        Objects.equals(this.mainType, cancerTypeCriteria.mainType) &&
        Objects.equals(this.subtype, cancerTypeCriteria.subtype) &&
        Objects.equals(this.tissue, cancerTypeCriteria.tissue) &&
        Objects.equals(this.tumorForm, cancerTypeCriteria.tumorForm) &&
        Objects.equals(this.childrenId, cancerTypeCriteria.childrenId) &&
        Objects.equals(this.biomarkerAssociationId, cancerTypeCriteria.biomarkerAssociationId) &&
        Objects.equals(this.parentId, cancerTypeCriteria.parentId) &&
        Objects.equals(this.distinct, cancerTypeCriteria.distinct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, color, level, mainType, subtype, tissue, tumorForm, childrenId, biomarkerAssociationId, parentId, distinct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancerTypeCriteria {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    mainType: ").append(toIndentedString(mainType)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    tissue: ").append(toIndentedString(tissue)).append("\n");
    sb.append("    tumorForm: ").append(toIndentedString(tumorForm)).append("\n");
    sb.append("    childrenId: ").append(toIndentedString(childrenId)).append("\n");
    sb.append("    biomarkerAssociationId: ").append(toIndentedString(biomarkerAssociationId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    distinct: ").append(toIndentedString(distinct)).append("\n");
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

