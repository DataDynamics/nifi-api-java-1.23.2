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
 * ProcessorStatusSnapshotEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProcessorStatusSnapshotEntity {
    @SerializedName("id")
    private String id = null;

    @SerializedName("processorStatusSnapshot")
    private ProcessorStatusSnapshotDTO processorStatusSnapshot = null;

    @SerializedName("canRead")
    private Boolean canRead = null;

    public ProcessorStatusSnapshotEntity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the processor.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The id of the processor.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessorStatusSnapshotEntity processorStatusSnapshot(ProcessorStatusSnapshotDTO processorStatusSnapshot) {
        this.processorStatusSnapshot = processorStatusSnapshot;
        return this;
    }

    /**
     * Get processorStatusSnapshot
     *
     * @return processorStatusSnapshot
     **/
    @ApiModelProperty(value = "")
    public ProcessorStatusSnapshotDTO getProcessorStatusSnapshot() {
        return processorStatusSnapshot;
    }

    public void setProcessorStatusSnapshot(ProcessorStatusSnapshotDTO processorStatusSnapshot) {
        this.processorStatusSnapshot = processorStatusSnapshot;
    }

    public ProcessorStatusSnapshotEntity canRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }

    /**
     * Indicates whether the user can read a given resource.
     *
     * @return canRead
     **/
    @ApiModelProperty(value = "Indicates whether the user can read a given resource.")
    public Boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessorStatusSnapshotEntity processorStatusSnapshotEntity = (ProcessorStatusSnapshotEntity) o;
        return Objects.equals(this.id, processorStatusSnapshotEntity.id) &&
                Objects.equals(this.processorStatusSnapshot, processorStatusSnapshotEntity.processorStatusSnapshot) &&
                Objects.equals(this.canRead, processorStatusSnapshotEntity.canRead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processorStatusSnapshot, canRead);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessorStatusSnapshotEntity {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    processorStatusSnapshot: ").append(toIndentedString(processorStatusSnapshot)).append("\n");
        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
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

