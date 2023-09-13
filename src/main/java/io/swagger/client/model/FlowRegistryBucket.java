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
 * FlowRegistryBucket
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class FlowRegistryBucket {
    @SerializedName("identifier")
    private String identifier = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("createdTimestamp")
    private Long createdTimestamp = null;

    @SerializedName("permissions")
    private FlowRegistryPermissions permissions = null;

    public FlowRegistryBucket identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     *
     * @return identifier
     **/
    @ApiModelProperty(value = "")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public FlowRegistryBucket name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowRegistryBucket description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlowRegistryBucket createdTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * Get createdTimestamp
     *
     * @return createdTimestamp
     **/
    @ApiModelProperty(value = "")
    public Long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public FlowRegistryBucket permissions(FlowRegistryPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     **/
    @ApiModelProperty(value = "")
    public FlowRegistryPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(FlowRegistryPermissions permissions) {
        this.permissions = permissions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowRegistryBucket flowRegistryBucket = (FlowRegistryBucket) o;
        return Objects.equals(this.identifier, flowRegistryBucket.identifier) &&
                Objects.equals(this.name, flowRegistryBucket.name) &&
                Objects.equals(this.description, flowRegistryBucket.description) &&
                Objects.equals(this.createdTimestamp, flowRegistryBucket.createdTimestamp) &&
                Objects.equals(this.permissions, flowRegistryBucket.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, name, description, createdTimestamp, permissions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowRegistryBucket {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

