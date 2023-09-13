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
 * NodeIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class NodeIdentifier {
    @SerializedName("id")
    private String id = null;

    @SerializedName("apiAddress")
    private String apiAddress = null;

    @SerializedName("apiPort")
    private Integer apiPort = null;

    @SerializedName("socketAddress")
    private String socketAddress = null;

    @SerializedName("socketPort")
    private Integer socketPort = null;

    @SerializedName("loadBalanceAddress")
    private String loadBalanceAddress = null;

    @SerializedName("loadBalancePort")
    private Integer loadBalancePort = null;

    @SerializedName("siteToSiteAddress")
    private String siteToSiteAddress = null;

    @SerializedName("siteToSitePort")
    private Integer siteToSitePort = null;

    @SerializedName("siteToSiteHttpApiPort")
    private Integer siteToSiteHttpApiPort = null;

    @SerializedName("siteToSiteSecure")
    private Boolean siteToSiteSecure = null;

    @SerializedName("nodeIdentities")
    private List<String> nodeIdentities = null;

    @SerializedName("fullDescription")
    private String fullDescription = null;

    public NodeIdentifier id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeIdentifier apiAddress(String apiAddress) {
        this.apiAddress = apiAddress;
        return this;
    }

    /**
     * Get apiAddress
     *
     * @return apiAddress
     **/
    @ApiModelProperty(value = "")
    public String getApiAddress() {
        return apiAddress;
    }

    public void setApiAddress(String apiAddress) {
        this.apiAddress = apiAddress;
    }

    public NodeIdentifier apiPort(Integer apiPort) {
        this.apiPort = apiPort;
        return this;
    }

    /**
     * Get apiPort
     *
     * @return apiPort
     **/
    @ApiModelProperty(value = "")
    public Integer getApiPort() {
        return apiPort;
    }

    public void setApiPort(Integer apiPort) {
        this.apiPort = apiPort;
    }

    public NodeIdentifier socketAddress(String socketAddress) {
        this.socketAddress = socketAddress;
        return this;
    }

    /**
     * Get socketAddress
     *
     * @return socketAddress
     **/
    @ApiModelProperty(value = "")
    public String getSocketAddress() {
        return socketAddress;
    }

    public void setSocketAddress(String socketAddress) {
        this.socketAddress = socketAddress;
    }

    public NodeIdentifier socketPort(Integer socketPort) {
        this.socketPort = socketPort;
        return this;
    }

    /**
     * Get socketPort
     *
     * @return socketPort
     **/
    @ApiModelProperty(value = "")
    public Integer getSocketPort() {
        return socketPort;
    }

    public void setSocketPort(Integer socketPort) {
        this.socketPort = socketPort;
    }

    public NodeIdentifier loadBalanceAddress(String loadBalanceAddress) {
        this.loadBalanceAddress = loadBalanceAddress;
        return this;
    }

    /**
     * Get loadBalanceAddress
     *
     * @return loadBalanceAddress
     **/
    @ApiModelProperty(value = "")
    public String getLoadBalanceAddress() {
        return loadBalanceAddress;
    }

    public void setLoadBalanceAddress(String loadBalanceAddress) {
        this.loadBalanceAddress = loadBalanceAddress;
    }

    public NodeIdentifier loadBalancePort(Integer loadBalancePort) {
        this.loadBalancePort = loadBalancePort;
        return this;
    }

    /**
     * Get loadBalancePort
     *
     * @return loadBalancePort
     **/
    @ApiModelProperty(value = "")
    public Integer getLoadBalancePort() {
        return loadBalancePort;
    }

    public void setLoadBalancePort(Integer loadBalancePort) {
        this.loadBalancePort = loadBalancePort;
    }

    public NodeIdentifier siteToSiteAddress(String siteToSiteAddress) {
        this.siteToSiteAddress = siteToSiteAddress;
        return this;
    }

    /**
     * Get siteToSiteAddress
     *
     * @return siteToSiteAddress
     **/
    @ApiModelProperty(value = "")
    public String getSiteToSiteAddress() {
        return siteToSiteAddress;
    }

    public void setSiteToSiteAddress(String siteToSiteAddress) {
        this.siteToSiteAddress = siteToSiteAddress;
    }

    public NodeIdentifier siteToSitePort(Integer siteToSitePort) {
        this.siteToSitePort = siteToSitePort;
        return this;
    }

    /**
     * Get siteToSitePort
     *
     * @return siteToSitePort
     **/
    @ApiModelProperty(value = "")
    public Integer getSiteToSitePort() {
        return siteToSitePort;
    }

    public void setSiteToSitePort(Integer siteToSitePort) {
        this.siteToSitePort = siteToSitePort;
    }

    public NodeIdentifier siteToSiteHttpApiPort(Integer siteToSiteHttpApiPort) {
        this.siteToSiteHttpApiPort = siteToSiteHttpApiPort;
        return this;
    }

    /**
     * Get siteToSiteHttpApiPort
     *
     * @return siteToSiteHttpApiPort
     **/
    @ApiModelProperty(value = "")
    public Integer getSiteToSiteHttpApiPort() {
        return siteToSiteHttpApiPort;
    }

    public void setSiteToSiteHttpApiPort(Integer siteToSiteHttpApiPort) {
        this.siteToSiteHttpApiPort = siteToSiteHttpApiPort;
    }

    public NodeIdentifier siteToSiteSecure(Boolean siteToSiteSecure) {
        this.siteToSiteSecure = siteToSiteSecure;
        return this;
    }

    /**
     * Get siteToSiteSecure
     *
     * @return siteToSiteSecure
     **/
    @ApiModelProperty(value = "")
    public Boolean isSiteToSiteSecure() {
        return siteToSiteSecure;
    }

    public void setSiteToSiteSecure(Boolean siteToSiteSecure) {
        this.siteToSiteSecure = siteToSiteSecure;
    }

    public NodeIdentifier nodeIdentities(List<String> nodeIdentities) {
        this.nodeIdentities = nodeIdentities;
        return this;
    }

    public NodeIdentifier addNodeIdentitiesItem(String nodeIdentitiesItem) {
        if (this.nodeIdentities == null) {
            this.nodeIdentities = new ArrayList<String>();
        }
        this.nodeIdentities.add(nodeIdentitiesItem);
        return this;
    }

    /**
     * Get nodeIdentities
     *
     * @return nodeIdentities
     **/
    @ApiModelProperty(value = "")
    public List<String> getNodeIdentities() {
        return nodeIdentities;
    }

    public void setNodeIdentities(List<String> nodeIdentities) {
        this.nodeIdentities = nodeIdentities;
    }

    public NodeIdentifier fullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
        return this;
    }

    /**
     * Get fullDescription
     *
     * @return fullDescription
     **/
    @ApiModelProperty(value = "")
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeIdentifier nodeIdentifier = (NodeIdentifier) o;
        return Objects.equals(this.id, nodeIdentifier.id) &&
                Objects.equals(this.apiAddress, nodeIdentifier.apiAddress) &&
                Objects.equals(this.apiPort, nodeIdentifier.apiPort) &&
                Objects.equals(this.socketAddress, nodeIdentifier.socketAddress) &&
                Objects.equals(this.socketPort, nodeIdentifier.socketPort) &&
                Objects.equals(this.loadBalanceAddress, nodeIdentifier.loadBalanceAddress) &&
                Objects.equals(this.loadBalancePort, nodeIdentifier.loadBalancePort) &&
                Objects.equals(this.siteToSiteAddress, nodeIdentifier.siteToSiteAddress) &&
                Objects.equals(this.siteToSitePort, nodeIdentifier.siteToSitePort) &&
                Objects.equals(this.siteToSiteHttpApiPort, nodeIdentifier.siteToSiteHttpApiPort) &&
                Objects.equals(this.siteToSiteSecure, nodeIdentifier.siteToSiteSecure) &&
                Objects.equals(this.nodeIdentities, nodeIdentifier.nodeIdentities) &&
                Objects.equals(this.fullDescription, nodeIdentifier.fullDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiAddress, apiPort, socketAddress, socketPort, loadBalanceAddress, loadBalancePort, siteToSiteAddress, siteToSitePort, siteToSiteHttpApiPort, siteToSiteSecure, nodeIdentities, fullDescription);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeIdentifier {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiAddress: ").append(toIndentedString(apiAddress)).append("\n");
        sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
        sb.append("    socketAddress: ").append(toIndentedString(socketAddress)).append("\n");
        sb.append("    socketPort: ").append(toIndentedString(socketPort)).append("\n");
        sb.append("    loadBalanceAddress: ").append(toIndentedString(loadBalanceAddress)).append("\n");
        sb.append("    loadBalancePort: ").append(toIndentedString(loadBalancePort)).append("\n");
        sb.append("    siteToSiteAddress: ").append(toIndentedString(siteToSiteAddress)).append("\n");
        sb.append("    siteToSitePort: ").append(toIndentedString(siteToSitePort)).append("\n");
        sb.append("    siteToSiteHttpApiPort: ").append(toIndentedString(siteToSiteHttpApiPort)).append("\n");
        sb.append("    siteToSiteSecure: ").append(toIndentedString(siteToSiteSecure)).append("\n");
        sb.append("    nodeIdentities: ").append(toIndentedString(nodeIdentities)).append("\n");
        sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
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

