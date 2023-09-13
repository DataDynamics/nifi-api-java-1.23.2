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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VersionedRemoteProcessGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class VersionedRemoteProcessGroup {
    @SerializedName("identifier")
    private String identifier = null;

    @SerializedName("instanceIdentifier")
    private String instanceIdentifier = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("comments")
    private String comments = null;

    @SerializedName("position")
    private Position position = null;

    @SerializedName("targetUri")
    private String targetUri = null;

    @SerializedName("targetUris")
    private String targetUris = null;

    @SerializedName("communicationsTimeout")
    private String communicationsTimeout = null;

    @SerializedName("yieldDuration")
    private String yieldDuration = null;
    @SerializedName("transportProtocol")
    private TransportProtocolEnum transportProtocol = null;
    @SerializedName("localNetworkInterface")
    private String localNetworkInterface = null;
    @SerializedName("proxyHost")
    private String proxyHost = null;
    @SerializedName("proxyPort")
    private Integer proxyPort = null;
    @SerializedName("proxyUser")
    private String proxyUser = null;
    @SerializedName("proxyPassword")
    private String proxyPassword = null;
    @SerializedName("inputPorts")
    private List<VersionedRemoteGroupPort> inputPorts = null;
    @SerializedName("outputPorts")
    private List<VersionedRemoteGroupPort> outputPorts = null;
    @SerializedName("componentType")
    private ComponentTypeEnum componentType = null;
    @SerializedName("groupIdentifier")
    private String groupIdentifier = null;

    public VersionedRemoteProcessGroup identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * The component&#39;s unique identifier
     *
     * @return identifier
     **/
    @ApiModelProperty(value = "The component's unique identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public VersionedRemoteProcessGroup instanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
        return this;
    }

    /**
     * The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component
     *
     * @return instanceIdentifier
     **/
    @ApiModelProperty(value = "The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component")
    public String getInstanceIdentifier() {
        return instanceIdentifier;
    }

    public void setInstanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
    }

    public VersionedRemoteProcessGroup name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The component&#39;s name
     *
     * @return name
     **/
    @ApiModelProperty(value = "The component's name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VersionedRemoteProcessGroup comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * The user-supplied comments for the component
     *
     * @return comments
     **/
    @ApiModelProperty(value = "The user-supplied comments for the component")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public VersionedRemoteProcessGroup position(Position position) {
        this.position = position;
        return this;
    }

    /**
     * The component&#39;s position on the graph
     *
     * @return position
     **/
    @ApiModelProperty(value = "The component's position on the graph")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public VersionedRemoteProcessGroup targetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }

    /**
     * [DEPRECATED] The target URI of the remote process group. If target uri is not set, but uris are set, then returns the first uri in the uris. If neither target uri nor uris are set, then returns null.
     *
     * @return targetUri
     **/
    @ApiModelProperty(value = "[DEPRECATED] The target URI of the remote process group. If target uri is not set, but uris are set, then returns the first uri in the uris. If neither target uri nor uris are set, then returns null.")
    public String getTargetUri() {
        return targetUri;
    }

    public void setTargetUri(String targetUri) {
        this.targetUri = targetUri;
    }

    public VersionedRemoteProcessGroup targetUris(String targetUris) {
        this.targetUris = targetUris;
        return this;
    }

    /**
     * The target URIs of the remote process group. If target uris is not set but target uri is set, then returns the single target uri. If neither target uris nor target uri is set, then returns null.
     *
     * @return targetUris
     **/
    @ApiModelProperty(value = "The target URIs of the remote process group. If target uris is not set but target uri is set, then returns the single target uri. If neither target uris nor target uri is set, then returns null.")
    public String getTargetUris() {
        return targetUris;
    }

    public void setTargetUris(String targetUris) {
        this.targetUris = targetUris;
    }

    public VersionedRemoteProcessGroup communicationsTimeout(String communicationsTimeout) {
        this.communicationsTimeout = communicationsTimeout;
        return this;
    }

    /**
     * The time period used for the timeout when communicating with the target.
     *
     * @return communicationsTimeout
     **/
    @ApiModelProperty(value = "The time period used for the timeout when communicating with the target.")
    public String getCommunicationsTimeout() {
        return communicationsTimeout;
    }

    public void setCommunicationsTimeout(String communicationsTimeout) {
        this.communicationsTimeout = communicationsTimeout;
    }

    public VersionedRemoteProcessGroup yieldDuration(String yieldDuration) {
        this.yieldDuration = yieldDuration;
        return this;
    }

    /**
     * When yielding, this amount of time must elapse before the remote process group is scheduled again.
     *
     * @return yieldDuration
     **/
    @ApiModelProperty(value = "When yielding, this amount of time must elapse before the remote process group is scheduled again.")
    public String getYieldDuration() {
        return yieldDuration;
    }

    public void setYieldDuration(String yieldDuration) {
        this.yieldDuration = yieldDuration;
    }

    public VersionedRemoteProcessGroup transportProtocol(TransportProtocolEnum transportProtocol) {
        this.transportProtocol = transportProtocol;
        return this;
    }

    /**
     * The Transport Protocol that is used for Site-to-Site communications
     *
     * @return transportProtocol
     **/
    @ApiModelProperty(value = "The Transport Protocol that is used for Site-to-Site communications")
    public TransportProtocolEnum getTransportProtocol() {
        return transportProtocol;
    }

    public void setTransportProtocol(TransportProtocolEnum transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    public VersionedRemoteProcessGroup localNetworkInterface(String localNetworkInterface) {
        this.localNetworkInterface = localNetworkInterface;
        return this;
    }

    /**
     * The local network interface to send/receive data. If not specified, any local address is used. If clustered, all nodes must have an interface with this identifier.
     *
     * @return localNetworkInterface
     **/
    @ApiModelProperty(value = "The local network interface to send/receive data. If not specified, any local address is used. If clustered, all nodes must have an interface with this identifier.")
    public String getLocalNetworkInterface() {
        return localNetworkInterface;
    }

    public void setLocalNetworkInterface(String localNetworkInterface) {
        this.localNetworkInterface = localNetworkInterface;
    }

    public VersionedRemoteProcessGroup proxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    /**
     * Get proxyHost
     *
     * @return proxyHost
     **/
    @ApiModelProperty(value = "")
    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public VersionedRemoteProcessGroup proxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }

    /**
     * Get proxyPort
     *
     * @return proxyPort
     **/
    @ApiModelProperty(value = "")
    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public VersionedRemoteProcessGroup proxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }

    /**
     * Get proxyUser
     *
     * @return proxyUser
     **/
    @ApiModelProperty(value = "")
    public String getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    public VersionedRemoteProcessGroup proxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
        return this;
    }

    /**
     * Get proxyPassword
     *
     * @return proxyPassword
     **/
    @ApiModelProperty(value = "")
    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public VersionedRemoteProcessGroup inputPorts(List<VersionedRemoteGroupPort> inputPorts) {
        this.inputPorts = inputPorts;
        return this;
    }

    public VersionedRemoteProcessGroup addInputPortsItem(VersionedRemoteGroupPort inputPortsItem) {
        if (this.inputPorts == null) {
            this.inputPorts = new ArrayList<VersionedRemoteGroupPort>();
        }
        this.inputPorts.add(inputPortsItem);
        return this;
    }

    /**
     * A Set of Input Ports that can be connected to, in order to send data to the remote NiFi instance
     *
     * @return inputPorts
     **/
    @ApiModelProperty(value = "A Set of Input Ports that can be connected to, in order to send data to the remote NiFi instance")
    public List<VersionedRemoteGroupPort> getInputPorts() {
        return inputPorts;
    }

    public void setInputPorts(List<VersionedRemoteGroupPort> inputPorts) {
        this.inputPorts = inputPorts;
    }

    public VersionedRemoteProcessGroup outputPorts(List<VersionedRemoteGroupPort> outputPorts) {
        this.outputPorts = outputPorts;
        return this;
    }

    public VersionedRemoteProcessGroup addOutputPortsItem(VersionedRemoteGroupPort outputPortsItem) {
        if (this.outputPorts == null) {
            this.outputPorts = new ArrayList<VersionedRemoteGroupPort>();
        }
        this.outputPorts.add(outputPortsItem);
        return this;
    }

    /**
     * A Set of Output Ports that can be connected to, in order to pull data from the remote NiFi instance
     *
     * @return outputPorts
     **/
    @ApiModelProperty(value = "A Set of Output Ports that can be connected to, in order to pull data from the remote NiFi instance")
    public List<VersionedRemoteGroupPort> getOutputPorts() {
        return outputPorts;
    }

    public void setOutputPorts(List<VersionedRemoteGroupPort> outputPorts) {
        this.outputPorts = outputPorts;
    }

    public VersionedRemoteProcessGroup componentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * Get componentType
     *
     * @return componentType
     **/
    @ApiModelProperty(value = "")
    public ComponentTypeEnum getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
    }

    public VersionedRemoteProcessGroup groupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
        return this;
    }

    /**
     * The ID of the Process Group that this component belongs to
     *
     * @return groupIdentifier
     **/
    @ApiModelProperty(value = "The ID of the Process Group that this component belongs to")
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionedRemoteProcessGroup versionedRemoteProcessGroup = (VersionedRemoteProcessGroup) o;
        return Objects.equals(this.identifier, versionedRemoteProcessGroup.identifier) &&
                Objects.equals(this.instanceIdentifier, versionedRemoteProcessGroup.instanceIdentifier) &&
                Objects.equals(this.name, versionedRemoteProcessGroup.name) &&
                Objects.equals(this.comments, versionedRemoteProcessGroup.comments) &&
                Objects.equals(this.position, versionedRemoteProcessGroup.position) &&
                Objects.equals(this.targetUri, versionedRemoteProcessGroup.targetUri) &&
                Objects.equals(this.targetUris, versionedRemoteProcessGroup.targetUris) &&
                Objects.equals(this.communicationsTimeout, versionedRemoteProcessGroup.communicationsTimeout) &&
                Objects.equals(this.yieldDuration, versionedRemoteProcessGroup.yieldDuration) &&
                Objects.equals(this.transportProtocol, versionedRemoteProcessGroup.transportProtocol) &&
                Objects.equals(this.localNetworkInterface, versionedRemoteProcessGroup.localNetworkInterface) &&
                Objects.equals(this.proxyHost, versionedRemoteProcessGroup.proxyHost) &&
                Objects.equals(this.proxyPort, versionedRemoteProcessGroup.proxyPort) &&
                Objects.equals(this.proxyUser, versionedRemoteProcessGroup.proxyUser) &&
                Objects.equals(this.proxyPassword, versionedRemoteProcessGroup.proxyPassword) &&
                Objects.equals(this.inputPorts, versionedRemoteProcessGroup.inputPorts) &&
                Objects.equals(this.outputPorts, versionedRemoteProcessGroup.outputPorts) &&
                Objects.equals(this.componentType, versionedRemoteProcessGroup.componentType) &&
                Objects.equals(this.groupIdentifier, versionedRemoteProcessGroup.groupIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, instanceIdentifier, name, comments, position, targetUri, targetUris, communicationsTimeout, yieldDuration, transportProtocol, localNetworkInterface, proxyHost, proxyPort, proxyUser, proxyPassword, inputPorts, outputPorts, componentType, groupIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionedRemoteProcessGroup {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    targetUri: ").append(toIndentedString(targetUri)).append("\n");
        sb.append("    targetUris: ").append(toIndentedString(targetUris)).append("\n");
        sb.append("    communicationsTimeout: ").append(toIndentedString(communicationsTimeout)).append("\n");
        sb.append("    yieldDuration: ").append(toIndentedString(yieldDuration)).append("\n");
        sb.append("    transportProtocol: ").append(toIndentedString(transportProtocol)).append("\n");
        sb.append("    localNetworkInterface: ").append(toIndentedString(localNetworkInterface)).append("\n");
        sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
        sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
        sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
        sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
        sb.append("    inputPorts: ").append(toIndentedString(inputPorts)).append("\n");
        sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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


    /**
     * The Transport Protocol that is used for Site-to-Site communications
     */
    @JsonAdapter(TransportProtocolEnum.Adapter.class)
    public enum TransportProtocolEnum {
        RAW("RAW"),

        HTTP("HTTP");

        private String value;

        TransportProtocolEnum(String value) {
            this.value = value;
        }

        public static TransportProtocolEnum fromValue(String text) {
            for (TransportProtocolEnum b : TransportProtocolEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<TransportProtocolEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TransportProtocolEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TransportProtocolEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TransportProtocolEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or Sets componentType
     */
    @JsonAdapter(ComponentTypeEnum.Adapter.class)
    public enum ComponentTypeEnum {
        CONNECTION("CONNECTION"),

        PROCESSOR("PROCESSOR"),

        PROCESS_GROUP("PROCESS_GROUP"),

        REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),

        INPUT_PORT("INPUT_PORT"),

        OUTPUT_PORT("OUTPUT_PORT"),

        REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),

        REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),

        FUNNEL("FUNNEL"),

        LABEL("LABEL"),

        CONTROLLER_SERVICE("CONTROLLER_SERVICE"),

        REPORTING_TASK("REPORTING_TASK"),

        PARAMETER_CONTEXT("PARAMETER_CONTEXT"),

        PARAMETER_PROVIDER("PARAMETER_PROVIDER"),

        TEMPLATE("TEMPLATE"),

        FLOW_REGISTRY_CLIENT("FLOW_REGISTRY_CLIENT");

        private String value;

        ComponentTypeEnum(String value) {
            this.value = value;
        }

        public static ComponentTypeEnum fromValue(String text) {
            for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ComponentTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

