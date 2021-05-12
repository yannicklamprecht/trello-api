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
 * MembersSavedSearches
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-12T10:27:01.792+02:00[Europe/Berlin]")
public class MembersSavedSearches {
  @SerializedName("name")
  private String name = null;

  @SerializedName("pos")
  private String pos = null;

  @SerializedName("query")
  private String query = null;

  public MembersSavedSearches name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A non-empty string with at least one non-space character
   * @return name
  **/
  @Schema(description = "A non-empty string with at least one non-space character")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MembersSavedSearches pos(String pos) {
    this.pos = pos;
    return this;
  }

   /**
   * A position. top , bottom , or a positive number.
   * @return pos
  **/
  @Schema(description = "A position. top , bottom , or a positive number.")
  public String getPos() {
    return pos;
  }

  public void setPos(String pos) {
    this.pos = pos;
  }

  public MembersSavedSearches query(String query) {
    this.query = query;
    return this;
  }

   /**
   * a string with a length from 1 to 16384
   * @return query
  **/
  @Schema(description = "a string with a length from 1 to 16384")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembersSavedSearches membersSavedSearches = (MembersSavedSearches) o;
    return Objects.equals(this.name, membersSavedSearches.name) &&
        Objects.equals(this.pos, membersSavedSearches.pos) &&
        Objects.equals(this.query, membersSavedSearches.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembersSavedSearches {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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