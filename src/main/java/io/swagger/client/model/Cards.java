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
 * Cards
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-12T10:27:01.792+02:00[Europe/Berlin]")
public class Cards {
  @SerializedName("closed")
  private String closed = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("due")
  private String due = null;

  @SerializedName("fileSource")
  private String fileSource = null;

  @SerializedName("idAttachmentCover")
  private String idAttachmentCover = null;

  @SerializedName("idBoard")
  private String idBoard = null;

  @SerializedName("idCardSource")
  private String idCardSource = null;

  @SerializedName("idLabels")
  private String idLabels = null;

  @SerializedName("idList")
  private String idList = null;

  @SerializedName("idMembers")
  private String idMembers = null;

  @SerializedName("keepFromSource")
  private String keepFromSource = null;

  @SerializedName("labels")
  private String labels = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("pos")
  private String pos = null;

  @SerializedName("subscribed")
  private String subscribed = null;

  @SerializedName("urlSource")
  private String urlSource = null;

  public Cards closed(String closed) {
    this.closed = closed;
    return this;
  }

   /**
   *  true or false
   * @return closed
  **/
  @Schema(description = " true or false")
  public String getClosed() {
    return closed;
  }

  public void setClosed(String closed) {
    this.closed = closed;
  }

  public Cards desc(String desc) {
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

  public Cards due(String due) {
    this.due = due;
    return this;
  }

   /**
   * A date, or null
   * @return due
  **/
  @Schema(description = "A date, or null")
  public String getDue() {
    return due;
  }

  public void setDue(String due) {
    this.due = due;
  }

  public Cards fileSource(String fileSource) {
    this.fileSource = fileSource;
    return this;
  }

   /**
   * A file
   * @return fileSource
  **/
  @Schema(description = "A file")
  public String getFileSource() {
    return fileSource;
  }

  public void setFileSource(String fileSource) {
    this.fileSource = fileSource;
  }

  public Cards idAttachmentCover(String idAttachmentCover) {
    this.idAttachmentCover = idAttachmentCover;
    return this;
  }

   /**
   * Id of the image attachment of this card to use as its cover, or null for no cover
   * @return idAttachmentCover
  **/
  @Schema(description = "Id of the image attachment of this card to use as its cover, or null for no cover")
  public String getIdAttachmentCover() {
    return idAttachmentCover;
  }

  public void setIdAttachmentCover(String idAttachmentCover) {
    this.idAttachmentCover = idAttachmentCover;
  }

  public Cards idBoard(String idBoard) {
    this.idBoard = idBoard;
    return this;
  }

   /**
   * id of the board the card should be moved to
   * @return idBoard
  **/
  @Schema(description = "id of the board the card should be moved to")
  public String getIdBoard() {
    return idBoard;
  }

  public void setIdBoard(String idBoard) {
    this.idBoard = idBoard;
  }

  public Cards idCardSource(String idCardSource) {
    this.idCardSource = idCardSource;
    return this;
  }

   /**
   * The id of the card to copy into a new card.
   * @return idCardSource
  **/
  @Schema(description = "The id of the card to copy into a new card.")
  public String getIdCardSource() {
    return idCardSource;
  }

  public void setIdCardSource(String idCardSource) {
    this.idCardSource = idCardSource;
  }

  public Cards idLabels(String idLabels) {
    this.idLabels = idLabels;
    return this;
  }

   /**
   * A comma-separated list of objectIds, 24-character hex strings
   * @return idLabels
  **/
  @Schema(description = "A comma-separated list of objectIds, 24-character hex strings")
  public String getIdLabels() {
    return idLabels;
  }

  public void setIdLabels(String idLabels) {
    this.idLabels = idLabels;
  }

  public Cards idList(String idList) {
    this.idList = idList;
    return this;
  }

   /**
   * id of the list that the card should be added to
   * @return idList
  **/
  @Schema(description = "id of the list that the card should be added to")
  public String getIdList() {
    return idList;
  }

  public void setIdList(String idList) {
    this.idList = idList;
  }

  public Cards idMembers(String idMembers) {
    this.idMembers = idMembers;
    return this;
  }

   /**
   * A comma-separated list of objectIds, 24-character hex strings
   * @return idMembers
  **/
  @Schema(description = "A comma-separated list of objectIds, 24-character hex strings")
  public String getIdMembers() {
    return idMembers;
  }

  public void setIdMembers(String idMembers) {
    this.idMembers = idMembers;
  }

  public Cards keepFromSource(String keepFromSource) {
    this.keepFromSource = keepFromSource;
    return this;
  }

   /**
   * Properties of the card to copy over from the source.
   * @return keepFromSource
  **/
  @Schema(description = "Properties of the card to copy over from the source.")
  public String getKeepFromSource() {
    return keepFromSource;
  }

  public void setKeepFromSource(String keepFromSource) {
    this.keepFromSource = keepFromSource;
  }

  public Cards labels(String labels) {
    this.labels = labels;
    return this;
  }

   /**
   * all or a comma-separated list of: blue, green, orange, purple, red or yellow
   * @return labels
  **/
  @Schema(description = "all or a comma-separated list of: blue, green, orange, purple, red or yellow")
  public String getLabels() {
    return labels;
  }

  public void setLabels(String labels) {
    this.labels = labels;
  }

  public Cards name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the new card.  It isn&amp;#39;t required if the name is being copied from provided by a URL, file or card that is being copied.
   * @return name
  **/
  @Schema(description = "The name of the new card.  It isn&#39;t required if the name is being copied from provided by a URL, file or card that is being copied.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cards pos(String pos) {
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

  public Cards subscribed(String subscribed) {
    this.subscribed = subscribed;
    return this;
  }

   /**
   *  true or false
   * @return subscribed
  **/
  @Schema(description = " true or false")
  public String getSubscribed() {
    return subscribed;
  }

  public void setSubscribed(String subscribed) {
    this.subscribed = subscribed;
  }

  public Cards urlSource(String urlSource) {
    this.urlSource = urlSource;
    return this;
  }

   /**
   * A URL starting with http:// or https:// or null
   * @return urlSource
  **/
  @Schema(description = "A URL starting with http:// or https:// or null")
  public String getUrlSource() {
    return urlSource;
  }

  public void setUrlSource(String urlSource) {
    this.urlSource = urlSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cards cards = (Cards) o;
    return Objects.equals(this.closed, cards.closed) &&
        Objects.equals(this.desc, cards.desc) &&
        Objects.equals(this.due, cards.due) &&
        Objects.equals(this.fileSource, cards.fileSource) &&
        Objects.equals(this.idAttachmentCover, cards.idAttachmentCover) &&
        Objects.equals(this.idBoard, cards.idBoard) &&
        Objects.equals(this.idCardSource, cards.idCardSource) &&
        Objects.equals(this.idLabels, cards.idLabels) &&
        Objects.equals(this.idList, cards.idList) &&
        Objects.equals(this.idMembers, cards.idMembers) &&
        Objects.equals(this.keepFromSource, cards.keepFromSource) &&
        Objects.equals(this.labels, cards.labels) &&
        Objects.equals(this.name, cards.name) &&
        Objects.equals(this.pos, cards.pos) &&
        Objects.equals(this.subscribed, cards.subscribed) &&
        Objects.equals(this.urlSource, cards.urlSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closed, desc, due, fileSource, idAttachmentCover, idBoard, idCardSource, idLabels, idList, idMembers, keepFromSource, labels, name, pos, subscribed, urlSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cards {\n");
    
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    fileSource: ").append(toIndentedString(fileSource)).append("\n");
    sb.append("    idAttachmentCover: ").append(toIndentedString(idAttachmentCover)).append("\n");
    sb.append("    idBoard: ").append(toIndentedString(idBoard)).append("\n");
    sb.append("    idCardSource: ").append(toIndentedString(idCardSource)).append("\n");
    sb.append("    idLabels: ").append(toIndentedString(idLabels)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
    sb.append("    idMembers: ").append(toIndentedString(idMembers)).append("\n");
    sb.append("    keepFromSource: ").append(toIndentedString(keepFromSource)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    urlSource: ").append(toIndentedString(urlSource)).append("\n");
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
