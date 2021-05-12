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
 * ListsMoveAllCards
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-12T10:27:01.792+02:00[Europe/Berlin]")
public class ListsMoveAllCards {
  @SerializedName("idBoard")
  private String idBoard = null;

  public ListsMoveAllCards idBoard(String idBoard) {
    this.idBoard = idBoard;
    return this;
  }

   /**
   * id of the board that the cards should be moved to
   * @return idBoard
  **/
  @Schema(description = "id of the board that the cards should be moved to")
  public String getIdBoard() {
    return idBoard;
  }

  public void setIdBoard(String idBoard) {
    this.idBoard = idBoard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListsMoveAllCards listsMoveAllCards = (ListsMoveAllCards) o;
    return Objects.equals(this.idBoard, listsMoveAllCards.idBoard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idBoard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsMoveAllCards {\n");
    
    sb.append("    idBoard: ").append(toIndentedString(idBoard)).append("\n");
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