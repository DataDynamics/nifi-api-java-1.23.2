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
 * QueueSizeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class QueueSizeDTO {
    @SerializedName("byteCount")
    private Long byteCount = null;

    @SerializedName("objectCount")
    private Integer objectCount = null;

    public QueueSizeDTO byteCount(Long byteCount) {
        this.byteCount = byteCount;
        return this;
    }

    /**
     * The size of objects in a queue.
     *
     * @return byteCount
     **/
    @ApiModelProperty(value = "The size of objects in a queue.")
    public Long getByteCount() {
        return byteCount;
    }

    public void setByteCount(Long byteCount) {
        this.byteCount = byteCount;
    }

    public QueueSizeDTO objectCount(Integer objectCount) {
        this.objectCount = objectCount;
        return this;
    }

    /**
     * The count of objects in a queue.
     *
     * @return objectCount
     **/
    @ApiModelProperty(value = "The count of objects in a queue.")
    public Integer getObjectCount() {
        return objectCount;
    }

    public void setObjectCount(Integer objectCount) {
        this.objectCount = objectCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueueSizeDTO queueSizeDTO = (QueueSizeDTO) o;
        return Objects.equals(this.byteCount, queueSizeDTO.byteCount) &&
                Objects.equals(this.objectCount, queueSizeDTO.objectCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(byteCount, objectCount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueSizeDTO {\n");

        sb.append("    byteCount: ").append(toIndentedString(byteCount)).append("\n");
        sb.append("    objectCount: ").append(toIndentedString(objectCount)).append("\n");
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

