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
import java.util.ArrayList;
import java.util.List;

/**
 * RunStatusDetailsRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class RunStatusDetailsRequestEntity {
  @SerializedName("processorIds")
  private List<String> processorIds = null;

  public RunStatusDetailsRequestEntity processorIds(List<String> processorIds) {
    this.processorIds = processorIds;
    return this;
  }

  public RunStatusDetailsRequestEntity addProcessorIdsItem(String processorIdsItem) {
    if (this.processorIds == null) {
      this.processorIds = new ArrayList<String>();
    }
    this.processorIds.add(processorIdsItem);
    return this;
  }

   /**
   * The IDs of all processors whose run status details should be provided
   * @return processorIds
  **/
  @ApiModelProperty(value = "The IDs of all processors whose run status details should be provided")
  public List<String> getProcessorIds() {
    return processorIds;
  }

  public void setProcessorIds(List<String> processorIds) {
    this.processorIds = processorIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStatusDetailsRequestEntity runStatusDetailsRequestEntity = (RunStatusDetailsRequestEntity) o;
    return Objects.equals(this.processorIds, runStatusDetailsRequestEntity.processorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStatusDetailsRequestEntity {\n");
    
    sb.append("    processorIds: ").append(toIndentedString(processorIds)).append("\n");
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

