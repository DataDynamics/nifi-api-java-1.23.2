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
 * RequiredPermissionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class RequiredPermissionDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("label")
  private String label = null;

  public RequiredPermissionDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The required sub-permission necessary for this restriction.
   * @return id
  **/
  @ApiModelProperty(value = "The required sub-permission necessary for this restriction.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RequiredPermissionDTO label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label for the required sub-permission necessary for this restriction.
   * @return label
  **/
  @ApiModelProperty(value = "The label for the required sub-permission necessary for this restriction.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiredPermissionDTO requiredPermissionDTO = (RequiredPermissionDTO) o;
    return Objects.equals(this.id, requiredPermissionDTO.id) &&
        Objects.equals(this.label, requiredPermissionDTO.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiredPermissionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

