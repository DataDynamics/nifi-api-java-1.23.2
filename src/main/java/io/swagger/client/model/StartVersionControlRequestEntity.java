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
import io.swagger.client.model.RevisionDTO;
import io.swagger.client.model.VersionedFlowDTO;
import java.io.IOException;

/**
 * StartVersionControlRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class StartVersionControlRequestEntity {
  @SerializedName("versionedFlow")
  private VersionedFlowDTO versionedFlow = null;

  @SerializedName("processGroupRevision")
  private RevisionDTO processGroupRevision = null;

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  public StartVersionControlRequestEntity versionedFlow(VersionedFlowDTO versionedFlow) {
    this.versionedFlow = versionedFlow;
    return this;
  }

   /**
   * The versioned flow
   * @return versionedFlow
  **/
  @ApiModelProperty(value = "The versioned flow")
  public VersionedFlowDTO getVersionedFlow() {
    return versionedFlow;
  }

  public void setVersionedFlow(VersionedFlowDTO versionedFlow) {
    this.versionedFlow = versionedFlow;
  }

  public StartVersionControlRequestEntity processGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * The Revision of the Process Group under Version Control
   * @return processGroupRevision
  **/
  @ApiModelProperty(value = "The Revision of the Process Group under Version Control")
  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }

  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }

  public StartVersionControlRequestEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean isDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartVersionControlRequestEntity startVersionControlRequestEntity = (StartVersionControlRequestEntity) o;
    return Objects.equals(this.versionedFlow, startVersionControlRequestEntity.versionedFlow) &&
        Objects.equals(this.processGroupRevision, startVersionControlRequestEntity.processGroupRevision) &&
        Objects.equals(this.disconnectedNodeAcknowledged, startVersionControlRequestEntity.disconnectedNodeAcknowledged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedFlow, processGroupRevision, disconnectedNodeAcknowledged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartVersionControlRequestEntity {\n");
    
    sb.append("    versionedFlow: ").append(toIndentedString(versionedFlow)).append("\n");
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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

