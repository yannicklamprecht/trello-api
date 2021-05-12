/*
 * Trello
 * This document describes the REST API of Trello as published by Trello.com.  - <a href='https://trello.com/docs/index.html' target='_blank'>Official Documentation</a>  - <a href='https://trello.com/docs/api' target='_blank'>The HTML pages that were scraped in order to generate this specification.</a>
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Organizations
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-12T10:27:01.792+02:00[Europe/Berlin]")
public class Organizations {
  @SerializedName("desc")
  private String desc = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prefs/associatedDomain")
  private String prefsassociatedDomain = null;

  @SerializedName("prefs/boardVisibilityRestrict/org")
  private String prefsboardVisibilityRestrictorg = null;

  @SerializedName("prefs/boardVisibilityRestrict/private")
  private String prefsboardVisibilityRestrictprivate = null;

  @SerializedName("prefs/boardVisibilityRestrict/public")
  private String prefsboardVisibilityRestrictpublic = null;

  @SerializedName("prefs/externalMembersDisabled")
  private String prefsexternalMembersDisabled = null;

  @SerializedName("prefs/googleAppsVersion")
  private String prefsgoogleAppsVersion = null;

  @SerializedName("prefs/orgInviteRestrict")
  private String prefsorgInviteRestrict = null;

  @SerializedName("prefs/permissionLevel")
  private String prefspermissionLevel = null;

  @SerializedName("website")
  private String website = null;

  public Organizations desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * a string with a length from 0 to 16384
   * @return desc
  **/
  @Schema(description = "a string with a length from 0 to 16384")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Organizations displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * A string with a length of at least 1.  Cannot begin or end with a space.
   * @return displayName
  **/
  @Schema(description = "A string with a length of at least 1.  Cannot begin or end with a space.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Organizations name(String name) {
    this.name = name;
    return this;
  }

   /**
   * a string with a length from 0 to 16384
   * @return name
  **/
  @Schema(description = "a string with a length from 0 to 16384")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organizations prefsassociatedDomain(String prefsassociatedDomain) {
    this.prefsassociatedDomain = prefsassociatedDomain;
    return this;
  }

   /**
   * The google apps domain to link this org to.
   * @return prefsassociatedDomain
  **/
  @Schema(description = "The google apps domain to link this org to.")
  public String getPrefsassociatedDomain() {
    return prefsassociatedDomain;
  }

  public void setPrefsassociatedDomain(String prefsassociatedDomain) {
    this.prefsassociatedDomain = prefsassociatedDomain;
  }

  public Organizations prefsboardVisibilityRestrictorg(String prefsboardVisibilityRestrictorg) {
    this.prefsboardVisibilityRestrictorg = prefsboardVisibilityRestrictorg;
    return this;
  }

   /**
   * One of: admin, none or org
   * @return prefsboardVisibilityRestrictorg
  **/
  @Schema(description = "One of: admin, none or org")
  public String getPrefsboardVisibilityRestrictorg() {
    return prefsboardVisibilityRestrictorg;
  }

  public void setPrefsboardVisibilityRestrictorg(String prefsboardVisibilityRestrictorg) {
    this.prefsboardVisibilityRestrictorg = prefsboardVisibilityRestrictorg;
  }

  public Organizations prefsboardVisibilityRestrictprivate(String prefsboardVisibilityRestrictprivate) {
    this.prefsboardVisibilityRestrictprivate = prefsboardVisibilityRestrictprivate;
    return this;
  }

   /**
   * One of: admin, none or org
   * @return prefsboardVisibilityRestrictprivate
  **/
  @Schema(description = "One of: admin, none or org")
  public String getPrefsboardVisibilityRestrictprivate() {
    return prefsboardVisibilityRestrictprivate;
  }

  public void setPrefsboardVisibilityRestrictprivate(String prefsboardVisibilityRestrictprivate) {
    this.prefsboardVisibilityRestrictprivate = prefsboardVisibilityRestrictprivate;
  }

  public Organizations prefsboardVisibilityRestrictpublic(String prefsboardVisibilityRestrictpublic) {
    this.prefsboardVisibilityRestrictpublic = prefsboardVisibilityRestrictpublic;
    return this;
  }

   /**
   * One of: admin, none or org
   * @return prefsboardVisibilityRestrictpublic
  **/
  @Schema(description = "One of: admin, none or org")
  public String getPrefsboardVisibilityRestrictpublic() {
    return prefsboardVisibilityRestrictpublic;
  }

  public void setPrefsboardVisibilityRestrictpublic(String prefsboardVisibilityRestrictpublic) {
    this.prefsboardVisibilityRestrictpublic = prefsboardVisibilityRestrictpublic;
  }

  public Organizations prefsexternalMembersDisabled(String prefsexternalMembersDisabled) {
    this.prefsexternalMembersDisabled = prefsexternalMembersDisabled;
    return this;
  }

   /**
   *  true or false
   * @return prefsexternalMembersDisabled
  **/
  @Schema(description = " true or false")
  public String getPrefsexternalMembersDisabled() {
    return prefsexternalMembersDisabled;
  }

  public void setPrefsexternalMembersDisabled(String prefsexternalMembersDisabled) {
    this.prefsexternalMembersDisabled = prefsexternalMembersDisabled;
  }

  public Organizations prefsgoogleAppsVersion(String prefsgoogleAppsVersion) {
    this.prefsgoogleAppsVersion = prefsgoogleAppsVersion;
    return this;
  }

   /**
   * a number from 1 to 2
   * @return prefsgoogleAppsVersion
  **/
  @Schema(description = "a number from 1 to 2")
  public String getPrefsgoogleAppsVersion() {
    return prefsgoogleAppsVersion;
  }

  public void setPrefsgoogleAppsVersion(String prefsgoogleAppsVersion) {
    this.prefsgoogleAppsVersion = prefsgoogleAppsVersion;
  }

  public Organizations prefsorgInviteRestrict(String prefsorgInviteRestrict) {
    this.prefsorgInviteRestrict = prefsorgInviteRestrict;
    return this;
  }

   /**
   * An email address with optional expansion tokens
   * @return prefsorgInviteRestrict
  **/
  @Schema(description = "An email address with optional expansion tokens")
  public String getPrefsorgInviteRestrict() {
    return prefsorgInviteRestrict;
  }

  public void setPrefsorgInviteRestrict(String prefsorgInviteRestrict) {
    this.prefsorgInviteRestrict = prefsorgInviteRestrict;
  }

  public Organizations prefspermissionLevel(String prefspermissionLevel) {
    this.prefspermissionLevel = prefspermissionLevel;
    return this;
  }

   /**
   * One of: private or public
   * @return prefspermissionLevel
  **/
  @Schema(description = "One of: private or public")
  public String getPrefspermissionLevel() {
    return prefspermissionLevel;
  }

  public void setPrefspermissionLevel(String prefspermissionLevel) {
    this.prefspermissionLevel = prefspermissionLevel;
  }

  public Organizations website(String website) {
    this.website = website;
    return this;
  }

   /**
   * A URL starting with http:// or https:// or null
   * @return website
  **/
  @Schema(description = "A URL starting with http:// or https:// or null")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organizations organizations = (Organizations) o;
    return Objects.equals(this.desc, organizations.desc) &&
        Objects.equals(this.displayName, organizations.displayName) &&
        Objects.equals(this.name, organizations.name) &&
        Objects.equals(this.prefsassociatedDomain, organizations.prefsassociatedDomain) &&
        Objects.equals(this.prefsboardVisibilityRestrictorg, organizations.prefsboardVisibilityRestrictorg) &&
        Objects.equals(this.prefsboardVisibilityRestrictprivate, organizations.prefsboardVisibilityRestrictprivate) &&
        Objects.equals(this.prefsboardVisibilityRestrictpublic, organizations.prefsboardVisibilityRestrictpublic) &&
        Objects.equals(this.prefsexternalMembersDisabled, organizations.prefsexternalMembersDisabled) &&
        Objects.equals(this.prefsgoogleAppsVersion, organizations.prefsgoogleAppsVersion) &&
        Objects.equals(this.prefsorgInviteRestrict, organizations.prefsorgInviteRestrict) &&
        Objects.equals(this.prefspermissionLevel, organizations.prefspermissionLevel) &&
        Objects.equals(this.website, organizations.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, displayName, name, prefsassociatedDomain, prefsboardVisibilityRestrictorg, prefsboardVisibilityRestrictprivate, prefsboardVisibilityRestrictpublic, prefsexternalMembersDisabled, prefsgoogleAppsVersion, prefsorgInviteRestrict, prefspermissionLevel, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organizations {\n");
    
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefsassociatedDomain: ").append(toIndentedString(prefsassociatedDomain)).append("\n");
    sb.append("    prefsboardVisibilityRestrictorg: ").append(toIndentedString(prefsboardVisibilityRestrictorg)).append("\n");
    sb.append("    prefsboardVisibilityRestrictprivate: ").append(toIndentedString(prefsboardVisibilityRestrictprivate)).append("\n");
    sb.append("    prefsboardVisibilityRestrictpublic: ").append(toIndentedString(prefsboardVisibilityRestrictpublic)).append("\n");
    sb.append("    prefsexternalMembersDisabled: ").append(toIndentedString(prefsexternalMembersDisabled)).append("\n");
    sb.append("    prefsgoogleAppsVersion: ").append(toIndentedString(prefsgoogleAppsVersion)).append("\n");
    sb.append("    prefsorgInviteRestrict: ").append(toIndentedString(prefsorgInviteRestrict)).append("\n");
    sb.append("    prefspermissionLevel: ").append(toIndentedString(prefspermissionLevel)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
