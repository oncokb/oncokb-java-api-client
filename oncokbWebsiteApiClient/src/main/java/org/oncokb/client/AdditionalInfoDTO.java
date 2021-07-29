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
import org.oncokb.client.TrialAccount;
import org.oncokb.client.UserCompany;
/**
 * AdditionalInfoDTO
 */


public class AdditionalInfoDTO {
  @SerializedName("trialAccount")
  private TrialAccount trialAccount = null;

  @SerializedName("userCompany")
  private UserCompany userCompany = null;

  public AdditionalInfoDTO trialAccount(TrialAccount trialAccount) {
    this.trialAccount = trialAccount;
    return this;
  }

   /**
   * Get trialAccount
   * @return trialAccount
  **/
  @Schema(description = "")
  public TrialAccount getTrialAccount() {
    return trialAccount;
  }

  public void setTrialAccount(TrialAccount trialAccount) {
    this.trialAccount = trialAccount;
  }

  public AdditionalInfoDTO userCompany(UserCompany userCompany) {
    this.userCompany = userCompany;
    return this;
  }

   /**
   * Get userCompany
   * @return userCompany
  **/
  @Schema(description = "")
  public UserCompany getUserCompany() {
    return userCompany;
  }

  public void setUserCompany(UserCompany userCompany) {
    this.userCompany = userCompany;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalInfoDTO additionalInfoDTO = (AdditionalInfoDTO) o;
    return Objects.equals(this.trialAccount, additionalInfoDTO.trialAccount) &&
        Objects.equals(this.userCompany, additionalInfoDTO.userCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialAccount, userCompany);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInfoDTO {\n");
    
    sb.append("    trialAccount: ").append(toIndentedString(trialAccount)).append("\n");
    sb.append("    userCompany: ").append(toIndentedString(userCompany)).append("\n");
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
