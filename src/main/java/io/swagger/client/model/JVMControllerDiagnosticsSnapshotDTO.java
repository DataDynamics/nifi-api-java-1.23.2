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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * JVMControllerDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class JVMControllerDiagnosticsSnapshotDTO {
    @SerializedName("primaryNode")
    private Boolean primaryNode = null;

    @SerializedName("clusterCoordinator")
    private Boolean clusterCoordinator = null;

    @SerializedName("maxTimerDrivenThreads")
    private Integer maxTimerDrivenThreads = null;

    @SerializedName("maxEventDrivenThreads")
    private Integer maxEventDrivenThreads = null;

    public JVMControllerDiagnosticsSnapshotDTO primaryNode(Boolean primaryNode) {
        this.primaryNode = primaryNode;
        return this;
    }

    /**
     * Whether or not this node is primary node
     *
     * @return primaryNode
     **/
    @ApiModelProperty(value = "Whether or not this node is primary node")
    public Boolean isPrimaryNode() {
        return primaryNode;
    }

    public void setPrimaryNode(Boolean primaryNode) {
        this.primaryNode = primaryNode;
    }

    public JVMControllerDiagnosticsSnapshotDTO clusterCoordinator(Boolean clusterCoordinator) {
        this.clusterCoordinator = clusterCoordinator;
        return this;
    }

    /**
     * Whether or not this node is cluster coordinator
     *
     * @return clusterCoordinator
     **/
    @ApiModelProperty(value = "Whether or not this node is cluster coordinator")
    public Boolean isClusterCoordinator() {
        return clusterCoordinator;
    }

    public void setClusterCoordinator(Boolean clusterCoordinator) {
        this.clusterCoordinator = clusterCoordinator;
    }

    public JVMControllerDiagnosticsSnapshotDTO maxTimerDrivenThreads(Integer maxTimerDrivenThreads) {
        this.maxTimerDrivenThreads = maxTimerDrivenThreads;
        return this;
    }

    /**
     * The maximum number of timer-driven threads
     *
     * @return maxTimerDrivenThreads
     **/
    @ApiModelProperty(value = "The maximum number of timer-driven threads")
    public Integer getMaxTimerDrivenThreads() {
        return maxTimerDrivenThreads;
    }

    public void setMaxTimerDrivenThreads(Integer maxTimerDrivenThreads) {
        this.maxTimerDrivenThreads = maxTimerDrivenThreads;
    }

    public JVMControllerDiagnosticsSnapshotDTO maxEventDrivenThreads(Integer maxEventDrivenThreads) {
        this.maxEventDrivenThreads = maxEventDrivenThreads;
        return this;
    }

    /**
     * The maximum number of event-driven threads
     *
     * @return maxEventDrivenThreads
     **/
    @ApiModelProperty(value = "The maximum number of event-driven threads")
    public Integer getMaxEventDrivenThreads() {
        return maxEventDrivenThreads;
    }

    public void setMaxEventDrivenThreads(Integer maxEventDrivenThreads) {
        this.maxEventDrivenThreads = maxEventDrivenThreads;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JVMControllerDiagnosticsSnapshotDTO jvMControllerDiagnosticsSnapshotDTO = (JVMControllerDiagnosticsSnapshotDTO) o;
        return Objects.equals(this.primaryNode, jvMControllerDiagnosticsSnapshotDTO.primaryNode) &&
                Objects.equals(this.clusterCoordinator, jvMControllerDiagnosticsSnapshotDTO.clusterCoordinator) &&
                Objects.equals(this.maxTimerDrivenThreads, jvMControllerDiagnosticsSnapshotDTO.maxTimerDrivenThreads) &&
                Objects.equals(this.maxEventDrivenThreads, jvMControllerDiagnosticsSnapshotDTO.maxEventDrivenThreads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryNode, clusterCoordinator, maxTimerDrivenThreads, maxEventDrivenThreads);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JVMControllerDiagnosticsSnapshotDTO {\n");

        sb.append("    primaryNode: ").append(toIndentedString(primaryNode)).append("\n");
        sb.append("    clusterCoordinator: ").append(toIndentedString(clusterCoordinator)).append("\n");
        sb.append("    maxTimerDrivenThreads: ").append(toIndentedString(maxTimerDrivenThreads)).append("\n");
        sb.append("    maxEventDrivenThreads: ").append(toIndentedString(maxEventDrivenThreads)).append("\n");
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

