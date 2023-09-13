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
 * CountersEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class CountersEntity {
    @SerializedName("counters")
    private CountersDTO counters = null;

    public CountersEntity counters(CountersDTO counters) {
        this.counters = counters;
        return this;
    }

    /**
     * Get counters
     *
     * @return counters
     **/
    @ApiModelProperty(value = "")
    public CountersDTO getCounters() {
        return counters;
    }

    public void setCounters(CountersDTO counters) {
        this.counters = counters;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountersEntity countersEntity = (CountersEntity) o;
        return Objects.equals(this.counters, countersEntity.counters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(counters);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountersEntity {\n");

        sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
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

