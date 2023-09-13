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
 * DocumentedTypeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class DocumentedTypeDTO {
    @SerializedName("type")
    private String type = null;

    @SerializedName("bundle")
    private BundleDTO bundle = null;

    @SerializedName("controllerServiceApis")
    private List<ControllerServiceApiDTO> controllerServiceApis = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("restricted")
    private Boolean restricted = null;

    @SerializedName("usageRestriction")
    private String usageRestriction = null;

    @SerializedName("explicitRestrictions")
    private List<ExplicitRestrictionDTO> explicitRestrictions = null;

    @SerializedName("deprecationReason")
    private String deprecationReason = null;

    @SerializedName("tags")
    private List<String> tags = null;

    public DocumentedTypeDTO type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The fully qualified name of the type.
     *
     * @return type
     **/
    @ApiModelProperty(value = "The fully qualified name of the type.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DocumentedTypeDTO bundle(BundleDTO bundle) {
        this.bundle = bundle;
        return this;
    }

    /**
     * The details of the artifact that bundled this type.
     *
     * @return bundle
     **/
    @ApiModelProperty(value = "The details of the artifact that bundled this type.")
    public BundleDTO getBundle() {
        return bundle;
    }

    public void setBundle(BundleDTO bundle) {
        this.bundle = bundle;
    }

    public DocumentedTypeDTO controllerServiceApis(List<ControllerServiceApiDTO> controllerServiceApis) {
        this.controllerServiceApis = controllerServiceApis;
        return this;
    }

    public DocumentedTypeDTO addControllerServiceApisItem(ControllerServiceApiDTO controllerServiceApisItem) {
        if (this.controllerServiceApis == null) {
            this.controllerServiceApis = new ArrayList<ControllerServiceApiDTO>();
        }
        this.controllerServiceApis.add(controllerServiceApisItem);
        return this;
    }

    /**
     * If this type represents a ControllerService, this lists the APIs it implements.
     *
     * @return controllerServiceApis
     **/
    @ApiModelProperty(value = "If this type represents a ControllerService, this lists the APIs it implements.")
    public List<ControllerServiceApiDTO> getControllerServiceApis() {
        return controllerServiceApis;
    }

    public void setControllerServiceApis(List<ControllerServiceApiDTO> controllerServiceApis) {
        this.controllerServiceApis = controllerServiceApis;
    }

    public DocumentedTypeDTO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the type.
     *
     * @return description
     **/
    @ApiModelProperty(value = "The description of the type.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DocumentedTypeDTO restricted(Boolean restricted) {
        this.restricted = restricted;
        return this;
    }

    /**
     * Whether this type is restricted.
     *
     * @return restricted
     **/
    @ApiModelProperty(value = "Whether this type is restricted.")
    public Boolean isRestricted() {
        return restricted;
    }

    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public DocumentedTypeDTO usageRestriction(String usageRestriction) {
        this.usageRestriction = usageRestriction;
        return this;
    }

    /**
     * The optional description of why the usage of this component is restricted.
     *
     * @return usageRestriction
     **/
    @ApiModelProperty(value = "The optional description of why the usage of this component is restricted.")
    public String getUsageRestriction() {
        return usageRestriction;
    }

    public void setUsageRestriction(String usageRestriction) {
        this.usageRestriction = usageRestriction;
    }

    public DocumentedTypeDTO explicitRestrictions(List<ExplicitRestrictionDTO> explicitRestrictions) {
        this.explicitRestrictions = explicitRestrictions;
        return this;
    }

    public DocumentedTypeDTO addExplicitRestrictionsItem(ExplicitRestrictionDTO explicitRestrictionsItem) {
        if (this.explicitRestrictions == null) {
            this.explicitRestrictions = new ArrayList<ExplicitRestrictionDTO>();
        }
        this.explicitRestrictions.add(explicitRestrictionsItem);
        return this;
    }

    /**
     * An optional collection of explicit restrictions. If specified, these explicit restrictions will be enfored.
     *
     * @return explicitRestrictions
     **/
    @ApiModelProperty(value = "An optional collection of explicit restrictions. If specified, these explicit restrictions will be enfored.")
    public List<ExplicitRestrictionDTO> getExplicitRestrictions() {
        return explicitRestrictions;
    }

    public void setExplicitRestrictions(List<ExplicitRestrictionDTO> explicitRestrictions) {
        this.explicitRestrictions = explicitRestrictions;
    }

    public DocumentedTypeDTO deprecationReason(String deprecationReason) {
        this.deprecationReason = deprecationReason;
        return this;
    }

    /**
     * The description of why the usage of this component is restricted.
     *
     * @return deprecationReason
     **/
    @ApiModelProperty(value = "The description of why the usage of this component is restricted.")
    public String getDeprecationReason() {
        return deprecationReason;
    }

    public void setDeprecationReason(String deprecationReason) {
        this.deprecationReason = deprecationReason;
    }

    public DocumentedTypeDTO tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public DocumentedTypeDTO addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<String>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The tags associated with this type.
     *
     * @return tags
     **/
    @ApiModelProperty(value = "The tags associated with this type.")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocumentedTypeDTO documentedTypeDTO = (DocumentedTypeDTO) o;
        return Objects.equals(this.type, documentedTypeDTO.type) &&
                Objects.equals(this.bundle, documentedTypeDTO.bundle) &&
                Objects.equals(this.controllerServiceApis, documentedTypeDTO.controllerServiceApis) &&
                Objects.equals(this.description, documentedTypeDTO.description) &&
                Objects.equals(this.restricted, documentedTypeDTO.restricted) &&
                Objects.equals(this.usageRestriction, documentedTypeDTO.usageRestriction) &&
                Objects.equals(this.explicitRestrictions, documentedTypeDTO.explicitRestrictions) &&
                Objects.equals(this.deprecationReason, documentedTypeDTO.deprecationReason) &&
                Objects.equals(this.tags, documentedTypeDTO.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, bundle, controllerServiceApis, description, restricted, usageRestriction, explicitRestrictions, deprecationReason, tags);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentedTypeDTO {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
        sb.append("    controllerServiceApis: ").append(toIndentedString(controllerServiceApis)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
        sb.append("    usageRestriction: ").append(toIndentedString(usageRestriction)).append("\n");
        sb.append("    explicitRestrictions: ").append(toIndentedString(explicitRestrictions)).append("\n");
        sb.append("    deprecationReason: ").append(toIndentedString(deprecationReason)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

