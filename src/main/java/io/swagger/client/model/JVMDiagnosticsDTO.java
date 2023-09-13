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
import io.swagger.client.model.JVMDiagnosticsSnapshotDTO;
import io.swagger.client.model.NodeJVMDiagnosticsSnapshotDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JVMDiagnosticsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class JVMDiagnosticsDTO {
  @SerializedName("clustered")
  private Boolean clustered = null;

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("aggregateSnapshot")
  private JVMDiagnosticsSnapshotDTO aggregateSnapshot = null;

  @SerializedName("nodeSnapshots")
  private List<NodeJVMDiagnosticsSnapshotDTO> nodeSnapshots = null;

  public JVMDiagnosticsDTO clustered(Boolean clustered) {
    this.clustered = clustered;
    return this;
  }

   /**
   * Whether or not the NiFi instance is clustered
   * @return clustered
  **/
  @ApiModelProperty(value = "Whether or not the NiFi instance is clustered")
  public Boolean isClustered() {
    return clustered;
  }

  public void setClustered(Boolean clustered) {
    this.clustered = clustered;
  }

  public JVMDiagnosticsDTO connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Whether or not the node is connected to the cluster
   * @return connected
  **/
  @ApiModelProperty(value = "Whether or not the node is connected to the cluster")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public JVMDiagnosticsDTO aggregateSnapshot(JVMDiagnosticsSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * Aggregate JVM diagnostic information about the entire cluster
   * @return aggregateSnapshot
  **/
  @ApiModelProperty(value = "Aggregate JVM diagnostic information about the entire cluster")
  public JVMDiagnosticsSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(JVMDiagnosticsSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public JVMDiagnosticsDTO nodeSnapshots(List<NodeJVMDiagnosticsSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public JVMDiagnosticsDTO addNodeSnapshotsItem(NodeJVMDiagnosticsSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodeJVMDiagnosticsSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * Node-wise breakdown of JVM diagnostic information
   * @return nodeSnapshots
  **/
  @ApiModelProperty(value = "Node-wise breakdown of JVM diagnostic information")
  public List<NodeJVMDiagnosticsSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodeJVMDiagnosticsSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JVMDiagnosticsDTO jvMDiagnosticsDTO = (JVMDiagnosticsDTO) o;
    return Objects.equals(this.clustered, jvMDiagnosticsDTO.clustered) &&
        Objects.equals(this.connected, jvMDiagnosticsDTO.connected) &&
        Objects.equals(this.aggregateSnapshot, jvMDiagnosticsDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, jvMDiagnosticsDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clustered, connected, aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVMDiagnosticsDTO {\n");
    
    sb.append("    clustered: ").append(toIndentedString(clustered)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    aggregateSnapshot: ").append(toIndentedString(aggregateSnapshot)).append("\n");
    sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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
