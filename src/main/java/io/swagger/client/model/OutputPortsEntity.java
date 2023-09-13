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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OutputPortsEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class OutputPortsEntity {
    @SerializedName("outputPorts")
    private List<PortEntity> outputPorts = null;

    public OutputPortsEntity outputPorts(List<PortEntity> outputPorts) {
        this.outputPorts = outputPorts;
        return this;
    }

    public OutputPortsEntity addOutputPortsItem(PortEntity outputPortsItem) {
        if (this.outputPorts == null) {
            this.outputPorts = new ArrayList<PortEntity>();
        }
        this.outputPorts.add(outputPortsItem);
        return this;
    }

    /**
     * Get outputPorts
     *
     * @return outputPorts
     **/
    @ApiModelProperty(value = "")
    public List<PortEntity> getOutputPorts() {
        return outputPorts;
    }

    public void setOutputPorts(List<PortEntity> outputPorts) {
        this.outputPorts = outputPorts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputPortsEntity outputPortsEntity = (OutputPortsEntity) o;
        return Objects.equals(this.outputPorts, outputPortsEntity.outputPorts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputPorts);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputPortsEntity {\n");

        sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
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

