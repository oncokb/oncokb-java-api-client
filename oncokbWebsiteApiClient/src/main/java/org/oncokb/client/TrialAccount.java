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
import org.oncokb.client.Activation;
import org.oncokb.client.LicenseAgreement;
/**
 * TrialAccount
 */


public class TrialAccount {
  @SerializedName("activation")
  private Activation activation = null;

  @SerializedName("licenseAgreement")
  private LicenseAgreement licenseAgreement = null;

  public TrialAccount activation(Activation activation) {
    this.activation = activation;
    return this;
  }

   /**
   * Get activation
   * @return activation
  **/
  @Schema(description = "")
  public Activation getActivation() {
    return activation;
  }

  public void setActivation(Activation activation) {
    this.activation = activation;
  }

  public TrialAccount licenseAgreement(LicenseAgreement licenseAgreement) {
    this.licenseAgreement = licenseAgreement;
    return this;
  }

   /**
   * Get licenseAgreement
   * @return licenseAgreement
  **/
  @Schema(description = "")
  public LicenseAgreement getLicenseAgreement() {
    return licenseAgreement;
  }

  public void setLicenseAgreement(LicenseAgreement licenseAgreement) {
    this.licenseAgreement = licenseAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialAccount trialAccount = (TrialAccount) o;
    return Objects.equals(this.activation, trialAccount.activation) &&
        Objects.equals(this.licenseAgreement, trialAccount.licenseAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activation, licenseAgreement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialAccount {\n");
    
    sb.append("    activation: ").append(toIndentedString(activation)).append("\n");
    sb.append("    licenseAgreement: ").append(toIndentedString(licenseAgreement)).append("\n");
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
