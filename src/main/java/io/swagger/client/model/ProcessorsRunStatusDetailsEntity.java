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
import io.swagger.client.model.ProcessorRunStatusDetailsEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessorsRunStatusDetailsEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProcessorsRunStatusDetailsEntity {
  @SerializedName("runStatusDetails")
  private List<ProcessorRunStatusDetailsEntity> runStatusDetails = null;

  public ProcessorsRunStatusDetailsEntity runStatusDetails(List<ProcessorRunStatusDetailsEntity> runStatusDetails) {
    this.runStatusDetails = runStatusDetails;
    return this;
  }

  public ProcessorsRunStatusDetailsEntity addRunStatusDetailsItem(ProcessorRunStatusDetailsEntity runStatusDetailsItem) {
    if (this.runStatusDetails == null) {
      this.runStatusDetails = new ArrayList<ProcessorRunStatusDetailsEntity>();
    }
    this.runStatusDetails.add(runStatusDetailsItem);
    return this;
  }

   /**
   * Get runStatusDetails
   * @return runStatusDetails
  **/
  @ApiModelProperty(value = "")
  public List<ProcessorRunStatusDetailsEntity> getRunStatusDetails() {
    return runStatusDetails;
  }

  public void setRunStatusDetails(List<ProcessorRunStatusDetailsEntity> runStatusDetails) {
    this.runStatusDetails = runStatusDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorsRunStatusDetailsEntity processorsRunStatusDetailsEntity = (ProcessorsRunStatusDetailsEntity) o;
    return Objects.equals(this.runStatusDetails, processorsRunStatusDetailsEntity.runStatusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runStatusDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorsRunStatusDetailsEntity {\n");
    
    sb.append("    runStatusDetails: ").append(toIndentedString(runStatusDetails)).append("\n");
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

