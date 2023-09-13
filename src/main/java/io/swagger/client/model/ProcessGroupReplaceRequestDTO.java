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
 * ProcessGroupReplaceRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProcessGroupReplaceRequestDTO {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("processGroupId")
  private String processGroupId = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("lastUpdated")
  private String lastUpdated = null;

  @SerializedName("complete")
  private Boolean complete = null;

  @SerializedName("failureReason")
  private String failureReason = null;

  @SerializedName("percentCompleted")
  private Integer percentCompleted = null;

  @SerializedName("state")
  private String state = null;

  public ProcessGroupReplaceRequestDTO requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The unique ID of this request.
   * @return requestId
  **/
  @ApiModelProperty(value = "The unique ID of this request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ProcessGroupReplaceRequestDTO processGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
    return this;
  }

   /**
   * The unique ID of the Process Group being updated
   * @return processGroupId
  **/
  @ApiModelProperty(value = "The unique ID of the Process Group being updated")
  public String getProcessGroupId() {
    return processGroupId;
  }

  public void setProcessGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
  }

  public ProcessGroupReplaceRequestDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for future requests to this drop request.
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for future requests to this drop request.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ProcessGroupReplaceRequestDTO lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The last time this request was updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "The last time this request was updated.")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ProcessGroupReplaceRequestDTO complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Whether or not this request has completed
   * @return complete
  **/
  @ApiModelProperty(value = "Whether or not this request has completed")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public ProcessGroupReplaceRequestDTO failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * An explanation of why this request failed, or null if this request has not failed
   * @return failureReason
  **/
  @ApiModelProperty(value = "An explanation of why this request failed, or null if this request has not failed")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  public ProcessGroupReplaceRequestDTO percentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

   /**
   * The percentage complete for the request, between 0 and 100
   * @return percentCompleted
  **/
  @ApiModelProperty(value = "The percentage complete for the request, between 0 and 100")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }

  public ProcessGroupReplaceRequestDTO state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the request
   * @return state
  **/
  @ApiModelProperty(value = "The state of the request")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupReplaceRequestDTO processGroupReplaceRequestDTO = (ProcessGroupReplaceRequestDTO) o;
    return Objects.equals(this.requestId, processGroupReplaceRequestDTO.requestId) &&
        Objects.equals(this.processGroupId, processGroupReplaceRequestDTO.processGroupId) &&
        Objects.equals(this.uri, processGroupReplaceRequestDTO.uri) &&
        Objects.equals(this.lastUpdated, processGroupReplaceRequestDTO.lastUpdated) &&
        Objects.equals(this.complete, processGroupReplaceRequestDTO.complete) &&
        Objects.equals(this.failureReason, processGroupReplaceRequestDTO.failureReason) &&
        Objects.equals(this.percentCompleted, processGroupReplaceRequestDTO.percentCompleted) &&
        Objects.equals(this.state, processGroupReplaceRequestDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, processGroupId, uri, lastUpdated, complete, failureReason, percentCompleted, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupReplaceRequestDTO {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

