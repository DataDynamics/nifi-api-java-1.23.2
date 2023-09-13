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
import io.swagger.client.model.ParameterContextUpdateRequestDTO;
import io.swagger.client.model.RevisionDTO;
import java.io.IOException;

/**
 * ParameterContextUpdateRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ParameterContextUpdateRequestEntity {
  @SerializedName("parameterContextRevision")
  private RevisionDTO parameterContextRevision = null;

  @SerializedName("request")
  private ParameterContextUpdateRequestDTO request = null;

  public ParameterContextUpdateRequestEntity parameterContextRevision(RevisionDTO parameterContextRevision) {
    this.parameterContextRevision = parameterContextRevision;
    return this;
  }

   /**
   * The Revision of the Parameter Context
   * @return parameterContextRevision
  **/
  @ApiModelProperty(value = "The Revision of the Parameter Context")
  public RevisionDTO getParameterContextRevision() {
    return parameterContextRevision;
  }

  public void setParameterContextRevision(RevisionDTO parameterContextRevision) {
    this.parameterContextRevision = parameterContextRevision;
  }

  public ParameterContextUpdateRequestEntity request(ParameterContextUpdateRequestDTO request) {
    this.request = request;
    return this;
  }

   /**
   * The Update Request
   * @return request
  **/
  @ApiModelProperty(value = "The Update Request")
  public ParameterContextUpdateRequestDTO getRequest() {
    return request;
  }

  public void setRequest(ParameterContextUpdateRequestDTO request) {
    this.request = request;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterContextUpdateRequestEntity parameterContextUpdateRequestEntity = (ParameterContextUpdateRequestEntity) o;
    return Objects.equals(this.parameterContextRevision, parameterContextUpdateRequestEntity.parameterContextRevision) &&
        Objects.equals(this.request, parameterContextUpdateRequestEntity.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterContextRevision, request);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterContextUpdateRequestEntity {\n");
    
    sb.append("    parameterContextRevision: ").append(toIndentedString(parameterContextRevision)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

