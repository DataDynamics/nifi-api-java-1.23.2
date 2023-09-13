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
import io.swagger.client.model.ProvenanceRequestDTO;
import io.swagger.client.model.ProvenanceResultsDTO;
import java.io.IOException;

/**
 * ProvenanceDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProvenanceDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("submissionTime")
  private String submissionTime = null;

  @SerializedName("expiration")
  private String expiration = null;

  @SerializedName("percentCompleted")
  private Integer percentCompleted = null;

  @SerializedName("finished")
  private Boolean finished = null;

  @SerializedName("request")
  private ProvenanceRequestDTO request = null;

  @SerializedName("results")
  private ProvenanceResultsDTO results = null;

  public ProvenanceDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the provenance query.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the provenance query.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProvenanceDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for this query. Used for obtaining/deleting the request at a later time
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for this query. Used for obtaining/deleting the request at a later time")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ProvenanceDTO submissionTime(String submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

   /**
   * The timestamp when the query was submitted.
   * @return submissionTime
  **/
  @ApiModelProperty(value = "The timestamp when the query was submitted.")
  public String getSubmissionTime() {
    return submissionTime;
  }

  public void setSubmissionTime(String submissionTime) {
    this.submissionTime = submissionTime;
  }

  public ProvenanceDTO expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * The timestamp when the query will expire.
   * @return expiration
  **/
  @ApiModelProperty(value = "The timestamp when the query will expire.")
  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public ProvenanceDTO percentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

   /**
   * The current percent complete.
   * @return percentCompleted
  **/
  @ApiModelProperty(value = "The current percent complete.")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }

  public ProvenanceDTO finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Whether the query has finished.
   * @return finished
  **/
  @ApiModelProperty(value = "Whether the query has finished.")
  public Boolean isFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public ProvenanceDTO request(ProvenanceRequestDTO request) {
    this.request = request;
    return this;
  }

   /**
   * The provenance request.
   * @return request
  **/
  @ApiModelProperty(value = "The provenance request.")
  public ProvenanceRequestDTO getRequest() {
    return request;
  }

  public void setRequest(ProvenanceRequestDTO request) {
    this.request = request;
  }

  public ProvenanceDTO results(ProvenanceResultsDTO results) {
    this.results = results;
    return this;
  }

   /**
   * The provenance results.
   * @return results
  **/
  @ApiModelProperty(value = "The provenance results.")
  public ProvenanceResultsDTO getResults() {
    return results;
  }

  public void setResults(ProvenanceResultsDTO results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceDTO provenanceDTO = (ProvenanceDTO) o;
    return Objects.equals(this.id, provenanceDTO.id) &&
        Objects.equals(this.uri, provenanceDTO.uri) &&
        Objects.equals(this.submissionTime, provenanceDTO.submissionTime) &&
        Objects.equals(this.expiration, provenanceDTO.expiration) &&
        Objects.equals(this.percentCompleted, provenanceDTO.percentCompleted) &&
        Objects.equals(this.finished, provenanceDTO.finished) &&
        Objects.equals(this.request, provenanceDTO.request) &&
        Objects.equals(this.results, provenanceDTO.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, submissionTime, expiration, percentCompleted, finished, request, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

