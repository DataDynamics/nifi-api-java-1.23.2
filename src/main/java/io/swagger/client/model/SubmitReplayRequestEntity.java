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
 * SubmitReplayRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class SubmitReplayRequestEntity {
    @SerializedName("eventId")
    private Long eventId = null;

    @SerializedName("clusterNodeId")
    private String clusterNodeId = null;

    public SubmitReplayRequestEntity eventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * The event identifier
     *
     * @return eventId
     **/
    @ApiModelProperty(value = "The event identifier")
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public SubmitReplayRequestEntity clusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
        return this;
    }

    /**
     * The identifier of the node where to submit the replay request.
     *
     * @return clusterNodeId
     **/
    @ApiModelProperty(value = "The identifier of the node where to submit the replay request.")
    public String getClusterNodeId() {
        return clusterNodeId;
    }

    public void setClusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitReplayRequestEntity submitReplayRequestEntity = (SubmitReplayRequestEntity) o;
        return Objects.equals(this.eventId, submitReplayRequestEntity.eventId) &&
                Objects.equals(this.clusterNodeId, submitReplayRequestEntity.clusterNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, clusterNodeId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitReplayRequestEntity {\n");

        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
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

