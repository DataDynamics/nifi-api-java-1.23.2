/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.23.2
 * Contact: dev@nifi.apache.org
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RelationshipDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class RelationshipDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("autoTerminate")
  private Boolean autoTerminate = null;

  @SerializedName("retry")
  private Boolean retry = null;

  public RelationshipDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The relationship name.
   * @return name
  **/
  @ApiModelProperty(value = "The relationship name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelationshipDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The relationship description.
   * @return description
  **/
  @ApiModelProperty(value = "The relationship description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RelationshipDTO autoTerminate(Boolean autoTerminate) {
    this.autoTerminate = autoTerminate;
    return this;
  }

   /**
   * Whether or not flowfiles sent to this relationship should auto terminate.
   * @return autoTerminate
  **/
  @ApiModelProperty(value = "Whether or not flowfiles sent to this relationship should auto terminate.")
  public Boolean isAutoTerminate() {
    return autoTerminate;
  }

  public void setAutoTerminate(Boolean autoTerminate) {
    this.autoTerminate = autoTerminate;
  }

  public RelationshipDTO retry(Boolean retry) {
    this.retry = retry;
    return this;
  }

   /**
   * Whether or not flowfiles sent to this relationship should retry.
   * @return retry
  **/
  @ApiModelProperty(value = "Whether or not flowfiles sent to this relationship should retry.")
  public Boolean isRetry() {
    return retry;
  }

  public void setRetry(Boolean retry) {
    this.retry = retry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipDTO relationshipDTO = (RelationshipDTO) o;
    return Objects.equals(this.name, relationshipDTO.name) &&
        Objects.equals(this.description, relationshipDTO.description) &&
        Objects.equals(this.autoTerminate, relationshipDTO.autoTerminate) &&
        Objects.equals(this.retry, relationshipDTO.retry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, autoTerminate, retry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    autoTerminate: ").append(toIndentedString(autoTerminate)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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

