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
 * ComponentDifferenceDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ComponentDifferenceDTO {
    @SerializedName("componentType")
    private String componentType = null;

    @SerializedName("componentId")
    private String componentId = null;

    @SerializedName("componentName")
    private String componentName = null;

    @SerializedName("processGroupId")
    private String processGroupId = null;

    @SerializedName("differences")
    private List<DifferenceDTO> differences = null;

    public ComponentDifferenceDTO componentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * The type of component
     *
     * @return componentType
     **/
    @ApiModelProperty(value = "The type of component")
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public ComponentDifferenceDTO componentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * The ID of the component
     *
     * @return componentId
     **/
    @ApiModelProperty(value = "The ID of the component")
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ComponentDifferenceDTO componentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * The name of the component
     *
     * @return componentName
     **/
    @ApiModelProperty(value = "The name of the component")
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ComponentDifferenceDTO processGroupId(String processGroupId) {
        this.processGroupId = processGroupId;
        return this;
    }

    /**
     * The ID of the Process Group that the component belongs to
     *
     * @return processGroupId
     **/
    @ApiModelProperty(value = "The ID of the Process Group that the component belongs to")
    public String getProcessGroupId() {
        return processGroupId;
    }

    public void setProcessGroupId(String processGroupId) {
        this.processGroupId = processGroupId;
    }

    public ComponentDifferenceDTO differences(List<DifferenceDTO> differences) {
        this.differences = differences;
        return this;
    }

    public ComponentDifferenceDTO addDifferencesItem(DifferenceDTO differencesItem) {
        if (this.differences == null) {
            this.differences = new ArrayList<DifferenceDTO>();
        }
        this.differences.add(differencesItem);
        return this;
    }

    /**
     * The differences in the component between the two flows
     *
     * @return differences
     **/
    @ApiModelProperty(value = "The differences in the component between the two flows")
    public List<DifferenceDTO> getDifferences() {
        return differences;
    }

    public void setDifferences(List<DifferenceDTO> differences) {
        this.differences = differences;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentDifferenceDTO componentDifferenceDTO = (ComponentDifferenceDTO) o;
        return Objects.equals(this.componentType, componentDifferenceDTO.componentType) &&
                Objects.equals(this.componentId, componentDifferenceDTO.componentId) &&
                Objects.equals(this.componentName, componentDifferenceDTO.componentName) &&
                Objects.equals(this.processGroupId, componentDifferenceDTO.processGroupId) &&
                Objects.equals(this.differences, componentDifferenceDTO.differences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentType, componentId, componentName, processGroupId, differences);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentDifferenceDTO {\n");

        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
        sb.append("    differences: ").append(toIndentedString(differences)).append("\n");
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

