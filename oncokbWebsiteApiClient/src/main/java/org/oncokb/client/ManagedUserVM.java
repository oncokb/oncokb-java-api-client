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
import java.util.ArrayList;
import java.util.List;
import org.oncokb.client.AdditionalInfoDTO;
import org.threeten.bp.OffsetDateTime;
/**
 * ManagedUserVM
 */


public class ManagedUserVM {
  @SerializedName("activated")
  private Boolean activated = null;

  @SerializedName("activationKey")
  private String activationKey = null;

  @SerializedName("additionalInfo")
  private AdditionalInfoDTO additionalInfo = null;

  @SerializedName("authorities")
  private List<String> authorities = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("emailVerified")
  private Boolean emailVerified = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  @SerializedName("jobTitle")
  private String jobTitle = null;

  @SerializedName("langKey")
  private String langKey = null;

  @SerializedName("lastModifiedBy")
  private String lastModifiedBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("lastName")
  private String lastName = null;

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

  @SerializedName("login")
  private String login = null;

  @SerializedName("notifyUserOnTrialCreation")
  private Boolean notifyUserOnTrialCreation = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("resetDate")
  private OffsetDateTime resetDate = null;

  @SerializedName("resetKey")
  private String resetKey = null;

  @SerializedName("tokenIsRenewable")
  private Boolean tokenIsRenewable = null;

  @SerializedName("tokenValidDays")
  private Integer tokenValidDays = null;

  public ManagedUserVM activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  @Schema(description = "")
  public Boolean isActivated() {
    return activated;
  }

  public void setActivated(Boolean activated) {
    this.activated = activated;
  }

  public ManagedUserVM activationKey(String activationKey) {
    this.activationKey = activationKey;
    return this;
  }

   /**
   * Get activationKey
   * @return activationKey
  **/
  @Schema(description = "")
  public String getActivationKey() {
    return activationKey;
  }

  public void setActivationKey(String activationKey) {
    this.activationKey = activationKey;
  }

  public ManagedUserVM additionalInfo(AdditionalInfoDTO additionalInfo) {
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

  public ManagedUserVM authorities(List<String> authorities) {
    this.authorities = authorities;
    return this;
  }

  public ManagedUserVM addAuthoritiesItem(String authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<String>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @Schema(description = "")
  public List<String> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(List<String> authorities) {
    this.authorities = authorities;
  }

  public ManagedUserVM city(String city) {
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

  public ManagedUserVM company(String company) {
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

  public ManagedUserVM country(String country) {
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

  public ManagedUserVM createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ManagedUserVM createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ManagedUserVM email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ManagedUserVM emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Get emailVerified
   * @return emailVerified
  **/
  @Schema(description = "")
  public Boolean isEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public ManagedUserVM firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ManagedUserVM id(Long id) {
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

  public ManagedUserVM imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @Schema(description = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ManagedUserVM jobTitle(String jobTitle) {
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

  public ManagedUserVM langKey(String langKey) {
    this.langKey = langKey;
    return this;
  }

   /**
   * Get langKey
   * @return langKey
  **/
  @Schema(description = "")
  public String getLangKey() {
    return langKey;
  }

  public void setLangKey(String langKey) {
    this.langKey = langKey;
  }

  public ManagedUserVM lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @Schema(description = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ManagedUserVM lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public ManagedUserVM lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ManagedUserVM licenseType(LicenseTypeEnum licenseType) {
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

  public ManagedUserVM login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @Schema(description = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public ManagedUserVM notifyUserOnTrialCreation(Boolean notifyUserOnTrialCreation) {
    this.notifyUserOnTrialCreation = notifyUserOnTrialCreation;
    return this;
  }

   /**
   * Get notifyUserOnTrialCreation
   * @return notifyUserOnTrialCreation
  **/
  @Schema(description = "")
  public Boolean isNotifyUserOnTrialCreation() {
    return notifyUserOnTrialCreation;
  }

  public void setNotifyUserOnTrialCreation(Boolean notifyUserOnTrialCreation) {
    this.notifyUserOnTrialCreation = notifyUserOnTrialCreation;
  }

  public ManagedUserVM password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ManagedUserVM resetDate(OffsetDateTime resetDate) {
    this.resetDate = resetDate;
    return this;
  }

   /**
   * Get resetDate
   * @return resetDate
  **/
  @Schema(description = "")
  public OffsetDateTime getResetDate() {
    return resetDate;
  }

  public void setResetDate(OffsetDateTime resetDate) {
    this.resetDate = resetDate;
  }

  public ManagedUserVM resetKey(String resetKey) {
    this.resetKey = resetKey;
    return this;
  }

   /**
   * Get resetKey
   * @return resetKey
  **/
  @Schema(description = "")
  public String getResetKey() {
    return resetKey;
  }

  public void setResetKey(String resetKey) {
    this.resetKey = resetKey;
  }

  public ManagedUserVM tokenIsRenewable(Boolean tokenIsRenewable) {
    this.tokenIsRenewable = tokenIsRenewable;
    return this;
  }

   /**
   * Get tokenIsRenewable
   * @return tokenIsRenewable
  **/
  @Schema(description = "")
  public Boolean isTokenIsRenewable() {
    return tokenIsRenewable;
  }

  public void setTokenIsRenewable(Boolean tokenIsRenewable) {
    this.tokenIsRenewable = tokenIsRenewable;
  }

  public ManagedUserVM tokenValidDays(Integer tokenValidDays) {
    this.tokenValidDays = tokenValidDays;
    return this;
  }

   /**
   * Get tokenValidDays
   * @return tokenValidDays
  **/
  @Schema(description = "")
  public Integer getTokenValidDays() {
    return tokenValidDays;
  }

  public void setTokenValidDays(Integer tokenValidDays) {
    this.tokenValidDays = tokenValidDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedUserVM managedUserVM = (ManagedUserVM) o;
    return Objects.equals(this.activated, managedUserVM.activated) &&
        Objects.equals(this.activationKey, managedUserVM.activationKey) &&
        Objects.equals(this.additionalInfo, managedUserVM.additionalInfo) &&
        Objects.equals(this.authorities, managedUserVM.authorities) &&
        Objects.equals(this.city, managedUserVM.city) &&
        Objects.equals(this.company, managedUserVM.company) &&
        Objects.equals(this.country, managedUserVM.country) &&
        Objects.equals(this.createdBy, managedUserVM.createdBy) &&
        Objects.equals(this.createdDate, managedUserVM.createdDate) &&
        Objects.equals(this.email, managedUserVM.email) &&
        Objects.equals(this.emailVerified, managedUserVM.emailVerified) &&
        Objects.equals(this.firstName, managedUserVM.firstName) &&
        Objects.equals(this.id, managedUserVM.id) &&
        Objects.equals(this.imageUrl, managedUserVM.imageUrl) &&
        Objects.equals(this.jobTitle, managedUserVM.jobTitle) &&
        Objects.equals(this.langKey, managedUserVM.langKey) &&
        Objects.equals(this.lastModifiedBy, managedUserVM.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, managedUserVM.lastModifiedDate) &&
        Objects.equals(this.lastName, managedUserVM.lastName) &&
        Objects.equals(this.licenseType, managedUserVM.licenseType) &&
        Objects.equals(this.login, managedUserVM.login) &&
        Objects.equals(this.notifyUserOnTrialCreation, managedUserVM.notifyUserOnTrialCreation) &&
        Objects.equals(this.password, managedUserVM.password) &&
        Objects.equals(this.resetDate, managedUserVM.resetDate) &&
        Objects.equals(this.resetKey, managedUserVM.resetKey) &&
        Objects.equals(this.tokenIsRenewable, managedUserVM.tokenIsRenewable) &&
        Objects.equals(this.tokenValidDays, managedUserVM.tokenValidDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activated, activationKey, additionalInfo, authorities, city, company, country, createdBy, createdDate, email, emailVerified, firstName, id, imageUrl, jobTitle, langKey, lastModifiedBy, lastModifiedDate, lastName, licenseType, login, notifyUserOnTrialCreation, password, resetDate, resetKey, tokenIsRenewable, tokenValidDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedUserVM {\n");
    
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    activationKey: ").append(toIndentedString(activationKey)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    langKey: ").append(toIndentedString(langKey)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    notifyUserOnTrialCreation: ").append(toIndentedString(notifyUserOnTrialCreation)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resetDate: ").append(toIndentedString(resetDate)).append("\n");
    sb.append("    resetKey: ").append(toIndentedString(resetKey)).append("\n");
    sb.append("    tokenIsRenewable: ").append(toIndentedString(tokenIsRenewable)).append("\n");
    sb.append("    tokenValidDays: ").append(toIndentedString(tokenValidDays)).append("\n");
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
