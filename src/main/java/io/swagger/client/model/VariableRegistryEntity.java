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
import io.swagger.client.model.VariableRegistryDTO;
import java.io.IOException;

/**
 * VariableRegistryEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class VariableRegistryEntity {
  @SerializedName("processGroupRevision")
  private RevisionDTO processGroupRevision = null;

  @SerializedName("variableRegistry")
  private VariableRegistryDTO variableRegistry = null;

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  public VariableRegistryEntity processGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * The revision of the Process Group that the Variable Registry belongs to
   * @return processGroupRevision
  **/
  @ApiModelProperty(value = "The revision of the Process Group that the Variable Registry belongs to")
  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }

  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }

  public VariableRegistryEntity variableRegistry(VariableRegistryDTO variableRegistry) {
    this.variableRegistry = variableRegistry;
    return this;
  }

   /**
   * The Variable Registry.
   * @return variableRegistry
  **/
  @ApiModelProperty(value = "The Variable Registry.")
  public VariableRegistryDTO getVariableRegistry() {
    return variableRegistry;
  }

  public void setVariableRegistry(VariableRegistryDTO variableRegistry) {
    this.variableRegistry = variableRegistry;
  }

  public VariableRegistryEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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
    VariableRegistryEntity variableRegistryEntity = (VariableRegistryEntity) o;
    return Objects.equals(this.processGroupRevision, variableRegistryEntity.processGroupRevision) &&
        Objects.equals(this.variableRegistry, variableRegistryEntity.variableRegistry) &&
        Objects.equals(this.disconnectedNodeAcknowledged, variableRegistryEntity.disconnectedNodeAcknowledged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processGroupRevision, variableRegistry, disconnectedNodeAcknowledged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableRegistryEntity {\n");
    
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
    sb.append("    variableRegistry: ").append(toIndentedString(variableRegistry)).append("\n");
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

