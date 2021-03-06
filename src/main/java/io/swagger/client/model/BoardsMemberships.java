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
 * BoardsMemberships
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-12T10:27:01.792+02:00[Europe/Berlin]")
public class BoardsMemberships {
  @SerializedName("member_fields")
  private String memberFields = null;

  @SerializedName("type")
  private String type = null;

  public BoardsMemberships memberFields(String memberFields) {
    this.memberFields = memberFields;
    return this;
  }

   /**
   * all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
   * @return memberFields
  **/
  @Schema(description = "all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username")
  public String getMemberFields() {
    return memberFields;
  }

  public void setMemberFields(String memberFields) {
    this.memberFields = memberFields;
  }

  public BoardsMemberships type(String type) {
    this.type = type;
    return this;
  }

   /**
   * One of: admin, normal or observer
   * @return type
  **/
  @Schema(description = "One of: admin, normal or observer")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardsMemberships boardsMemberships = (BoardsMemberships) o;
    return Objects.equals(this.memberFields, boardsMemberships.memberFields) &&
        Objects.equals(this.type, boardsMemberships.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberFields, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardsMemberships {\n");
    
    sb.append("    memberFields: ").append(toIndentedString(memberFields)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
