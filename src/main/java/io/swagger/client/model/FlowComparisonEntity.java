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
 * FlowComparisonEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class FlowComparisonEntity {
    @SerializedName("componentDifferences")
    private List<ComponentDifferenceDTO> componentDifferences = null;

    public FlowComparisonEntity componentDifferences(List<ComponentDifferenceDTO> componentDifferences) {
        this.componentDifferences = componentDifferences;
        return this;
    }

    public FlowComparisonEntity addComponentDifferencesItem(ComponentDifferenceDTO componentDifferencesItem) {
        if (this.componentDifferences == null) {
            this.componentDifferences = new ArrayList<ComponentDifferenceDTO>();
        }
        this.componentDifferences.add(componentDifferencesItem);
        return this;
    }

    /**
     * The list of differences for each component in the flow that is not the same between the two flows
     *
     * @return componentDifferences
     **/
    @ApiModelProperty(value = "The list of differences for each component in the flow that is not the same between the two flows")
    public List<ComponentDifferenceDTO> getComponentDifferences() {
        return componentDifferences;
    }

    public void setComponentDifferences(List<ComponentDifferenceDTO> componentDifferences) {
        this.componentDifferences = componentDifferences;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowComparisonEntity flowComparisonEntity = (FlowComparisonEntity) o;
        return Objects.equals(this.componentDifferences, flowComparisonEntity.componentDifferences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentDifferences);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowComparisonEntity {\n");

        sb.append("    componentDifferences: ").append(toIndentedString(componentDifferences)).append("\n");
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

