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
 * BoardsMembers
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-12T10:27:01.792+02:00[Europe/Berlin]")
public class BoardsMembers {
  @SerializedName("email")
  private String email = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("type")
  private String type = null;

  public BoardsMembers email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An email address
   * @return email
  **/
  @Schema(description = "An email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BoardsMembers fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * A string with a length of at least 1.  Cannot begin or end with a space.
   * @return fullName
  **/
  @Schema(description = "A string with a length of at least 1.  Cannot begin or end with a space.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public BoardsMembers type(String type) {
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
    BoardsMembers boardsMembers = (BoardsMembers) o;
    return Objects.equals(this.email, boardsMembers.email) &&
        Objects.equals(this.fullName, boardsMembers.fullName) &&
        Objects.equals(this.type, boardsMembers.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fullName, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardsMembers {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
