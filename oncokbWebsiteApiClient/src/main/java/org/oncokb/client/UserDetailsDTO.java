/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.0.0
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.oncokb.client.AdditionalInfoDTO;
/**
 * UserDetailsDTO
 */


public class UserDetailsDTO {
  @SerializedName("additionalInfo")
  private AdditionalInfoDTO additionalInfo = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("jobTitle")
  private String jobTitle = null;

  /**
   * Gets or Sets licenseType
   */
  @JsonAdapter(LicenseTypeEnum.Adapter.class)
  public enum LicenseTypeEnum {
    ACADEMIC("ACADEMIC"),
    COMMERCIAL("COMMERCIAL"),
    RESEARCH_IN_COMMERCIAL("RESEARCH_IN_COMMERCIAL"),
    HOSPITAL("HOSPITAL");

    private String value;

    LicenseTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LicenseTypeEnum fromValue(String text) {
      for (LicenseTypeEnum b : LicenseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LicenseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LicenseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LicenseTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LicenseTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("licenseType")
  private LicenseTypeEnum licenseType = null;

  @SerializedName("userId")
  private Long userId = null;

  public UserDetailsDTO additionalInfo(AdditionalInfoDTO additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @Schema(description = "")
  public AdditionalInfoDTO getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(AdditionalInfoDTO additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public UserDetailsDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserDetailsDTO city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserDetailsDTO company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @Schema(description = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserDetailsDTO country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UserDetailsDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserDetailsDTO jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @Schema(description = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public UserDetailsDTO licenseType(LicenseTypeEnum licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @Schema(description = "")
  public LicenseTypeEnum getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(LicenseTypeEnum licenseType) {
    this.licenseType = licenseType;
  }

  public UserDetailsDTO userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetailsDTO userDetailsDTO = (UserDetailsDTO) o;
    return Objects.equals(this.additionalInfo, userDetailsDTO.additionalInfo) &&
        Objects.equals(this.address, userDetailsDTO.address) &&
        Objects.equals(this.city, userDetailsDTO.city) &&
        Objects.equals(this.company, userDetailsDTO.company) &&
        Objects.equals(this.country, userDetailsDTO.country) &&
        Objects.equals(this.id, userDetailsDTO.id) &&
        Objects.equals(this.jobTitle, userDetailsDTO.jobTitle) &&
        Objects.equals(this.licenseType, userDetailsDTO.licenseType) &&
        Objects.equals(this.userId, userDetailsDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, address, city, company, country, id, jobTitle, licenseType, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailsDTO {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
