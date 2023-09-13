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


package io.datadynamics.nifi.api.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.*;

/**
 * VersionedProcessGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class VersionedProcessGroup {
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

    @SerializedName("processGroups")
    private List<VersionedProcessGroup> processGroups = null;

    @SerializedName("remoteProcessGroups")
    private List<VersionedRemoteProcessGroup> remoteProcessGroups = null;

    @SerializedName("processors")
    private List<VersionedProcessor> processors = null;

    @SerializedName("inputPorts")
    private List<VersionedPort> inputPorts = null;

    @SerializedName("outputPorts")
    private List<VersionedPort> outputPorts = null;

    @SerializedName("connections")
    private List<VersionedConnection> connections = null;

    @SerializedName("labels")
    private List<VersionedLabel> labels = null;

    @SerializedName("funnels")
    private List<VersionedFunnel> funnels = null;

    @SerializedName("controllerServices")
    private List<VersionedControllerService> controllerServices = null;

    @SerializedName("versionedFlowCoordinates")
    private VersionedFlowCoordinates versionedFlowCoordinates = null;

    @SerializedName("variables")
    private Map<String, String> variables = null;

    @SerializedName("parameterContextName")
    private String parameterContextName = null;

    @SerializedName("defaultFlowFileExpiration")
    private String defaultFlowFileExpiration = null;

    @SerializedName("defaultBackPressureObjectThreshold")
    private Long defaultBackPressureObjectThreshold = null;

    @SerializedName("defaultBackPressureDataSizeThreshold")
    private String defaultBackPressureDataSizeThreshold = null;

    @SerializedName("logFileSuffix")
    private String logFileSuffix = null;
    @SerializedName("componentType")
    private ComponentTypeEnum componentType = null;
    @SerializedName("flowFileConcurrency")
    private String flowFileConcurrency = null;
    @SerializedName("flowFileOutboundPolicy")
    private String flowFileOutboundPolicy = null;
    @SerializedName("groupIdentifier")
    private String groupIdentifier = null;

    public VersionedProcessGroup identifier(String identifier) {
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

    public VersionedProcessGroup instanceIdentifier(String instanceIdentifier) {
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

    public VersionedProcessGroup name(String name) {
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

    public VersionedProcessGroup comments(String comments) {
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

    public VersionedProcessGroup position(Position position) {
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

    public VersionedProcessGroup processGroups(List<VersionedProcessGroup> processGroups) {
        this.processGroups = processGroups;
        return this;
    }

    public VersionedProcessGroup addProcessGroupsItem(VersionedProcessGroup processGroupsItem) {
        if (this.processGroups == null) {
            this.processGroups = new ArrayList<VersionedProcessGroup>();
        }
        this.processGroups.add(processGroupsItem);
        return this;
    }

    /**
     * The child Process Groups
     *
     * @return processGroups
     **/
    @ApiModelProperty(value = "The child Process Groups")
    public List<VersionedProcessGroup> getProcessGroups() {
        return processGroups;
    }

    public void setProcessGroups(List<VersionedProcessGroup> processGroups) {
        this.processGroups = processGroups;
    }

    public VersionedProcessGroup remoteProcessGroups(List<VersionedRemoteProcessGroup> remoteProcessGroups) {
        this.remoteProcessGroups = remoteProcessGroups;
        return this;
    }

    public VersionedProcessGroup addRemoteProcessGroupsItem(VersionedRemoteProcessGroup remoteProcessGroupsItem) {
        if (this.remoteProcessGroups == null) {
            this.remoteProcessGroups = new ArrayList<VersionedRemoteProcessGroup>();
        }
        this.remoteProcessGroups.add(remoteProcessGroupsItem);
        return this;
    }

    /**
     * The Remote Process Groups
     *
     * @return remoteProcessGroups
     **/
    @ApiModelProperty(value = "The Remote Process Groups")
    public List<VersionedRemoteProcessGroup> getRemoteProcessGroups() {
        return remoteProcessGroups;
    }

    public void setRemoteProcessGroups(List<VersionedRemoteProcessGroup> remoteProcessGroups) {
        this.remoteProcessGroups = remoteProcessGroups;
    }

    public VersionedProcessGroup processors(List<VersionedProcessor> processors) {
        this.processors = processors;
        return this;
    }

    public VersionedProcessGroup addProcessorsItem(VersionedProcessor processorsItem) {
        if (this.processors == null) {
            this.processors = new ArrayList<VersionedProcessor>();
        }
        this.processors.add(processorsItem);
        return this;
    }

    /**
     * The Processors
     *
     * @return processors
     **/
    @ApiModelProperty(value = "The Processors")
    public List<VersionedProcessor> getProcessors() {
        return processors;
    }

    public void setProcessors(List<VersionedProcessor> processors) {
        this.processors = processors;
    }

    public VersionedProcessGroup inputPorts(List<VersionedPort> inputPorts) {
        this.inputPorts = inputPorts;
        return this;
    }

    public VersionedProcessGroup addInputPortsItem(VersionedPort inputPortsItem) {
        if (this.inputPorts == null) {
            this.inputPorts = new ArrayList<VersionedPort>();
        }
        this.inputPorts.add(inputPortsItem);
        return this;
    }

    /**
     * The Input Ports
     *
     * @return inputPorts
     **/
    @ApiModelProperty(value = "The Input Ports")
    public List<VersionedPort> getInputPorts() {
        return inputPorts;
    }

    public void setInputPorts(List<VersionedPort> inputPorts) {
        this.inputPorts = inputPorts;
    }

    public VersionedProcessGroup outputPorts(List<VersionedPort> outputPorts) {
        this.outputPorts = outputPorts;
        return this;
    }

    public VersionedProcessGroup addOutputPortsItem(VersionedPort outputPortsItem) {
        if (this.outputPorts == null) {
            this.outputPorts = new ArrayList<VersionedPort>();
        }
        this.outputPorts.add(outputPortsItem);
        return this;
    }

    /**
     * The Output Ports
     *
     * @return outputPorts
     **/
    @ApiModelProperty(value = "The Output Ports")
    public List<VersionedPort> getOutputPorts() {
        return outputPorts;
    }

    public void setOutputPorts(List<VersionedPort> outputPorts) {
        this.outputPorts = outputPorts;
    }

    public VersionedProcessGroup connections(List<VersionedConnection> connections) {
        this.connections = connections;
        return this;
    }

    public VersionedProcessGroup addConnectionsItem(VersionedConnection connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<VersionedConnection>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    /**
     * The Connections
     *
     * @return connections
     **/
    @ApiModelProperty(value = "The Connections")
    public List<VersionedConnection> getConnections() {
        return connections;
    }

    public void setConnections(List<VersionedConnection> connections) {
        this.connections = connections;
    }

    public VersionedProcessGroup labels(List<VersionedLabel> labels) {
        this.labels = labels;
        return this;
    }

    public VersionedProcessGroup addLabelsItem(VersionedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<VersionedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * The Labels
     *
     * @return labels
     **/
    @ApiModelProperty(value = "The Labels")
    public List<VersionedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<VersionedLabel> labels) {
        this.labels = labels;
    }

    public VersionedProcessGroup funnels(List<VersionedFunnel> funnels) {
        this.funnels = funnels;
        return this;
    }

    public VersionedProcessGroup addFunnelsItem(VersionedFunnel funnelsItem) {
        if (this.funnels == null) {
            this.funnels = new ArrayList<VersionedFunnel>();
        }
        this.funnels.add(funnelsItem);
        return this;
    }

    /**
     * The Funnels
     *
     * @return funnels
     **/
    @ApiModelProperty(value = "The Funnels")
    public List<VersionedFunnel> getFunnels() {
        return funnels;
    }

    public void setFunnels(List<VersionedFunnel> funnels) {
        this.funnels = funnels;
    }

    public VersionedProcessGroup controllerServices(List<VersionedControllerService> controllerServices) {
        this.controllerServices = controllerServices;
        return this;
    }

    public VersionedProcessGroup addControllerServicesItem(VersionedControllerService controllerServicesItem) {
        if (this.controllerServices == null) {
            this.controllerServices = new ArrayList<VersionedControllerService>();
        }
        this.controllerServices.add(controllerServicesItem);
        return this;
    }

    /**
     * The Controller Services
     *
     * @return controllerServices
     **/
    @ApiModelProperty(value = "The Controller Services")
    public List<VersionedControllerService> getControllerServices() {
        return controllerServices;
    }

    public void setControllerServices(List<VersionedControllerService> controllerServices) {
        this.controllerServices = controllerServices;
    }

    public VersionedProcessGroup versionedFlowCoordinates(VersionedFlowCoordinates versionedFlowCoordinates) {
        this.versionedFlowCoordinates = versionedFlowCoordinates;
        return this;
    }

    /**
     * The coordinates where the remote flow is stored, or null if the Process Group is not directly under Version Control
     *
     * @return versionedFlowCoordinates
     **/
    @ApiModelProperty(value = "The coordinates where the remote flow is stored, or null if the Process Group is not directly under Version Control")
    public VersionedFlowCoordinates getVersionedFlowCoordinates() {
        return versionedFlowCoordinates;
    }

    public void setVersionedFlowCoordinates(VersionedFlowCoordinates versionedFlowCoordinates) {
        this.versionedFlowCoordinates = versionedFlowCoordinates;
    }

    public VersionedProcessGroup variables(Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    public VersionedProcessGroup putVariablesItem(String key, String variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<String, String>();
        }
        this.variables.put(key, variablesItem);
        return this;
    }

    /**
     * The Variables in the Variable Registry for this Process Group (not including any ancestor or descendant Process Groups)
     *
     * @return variables
     **/
    @ApiModelProperty(value = "The Variables in the Variable Registry for this Process Group (not including any ancestor or descendant Process Groups)")
    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    public VersionedProcessGroup parameterContextName(String parameterContextName) {
        this.parameterContextName = parameterContextName;
        return this;
    }

    /**
     * The name of the parameter context used by this process group
     *
     * @return parameterContextName
     **/
    @ApiModelProperty(value = "The name of the parameter context used by this process group")
    public String getParameterContextName() {
        return parameterContextName;
    }

    public void setParameterContextName(String parameterContextName) {
        this.parameterContextName = parameterContextName;
    }

    public VersionedProcessGroup defaultFlowFileExpiration(String defaultFlowFileExpiration) {
        this.defaultFlowFileExpiration = defaultFlowFileExpiration;
        return this;
    }

    /**
     * The default FlowFile Expiration for this Process Group.
     *
     * @return defaultFlowFileExpiration
     **/
    @ApiModelProperty(value = "The default FlowFile Expiration for this Process Group.")
    public String getDefaultFlowFileExpiration() {
        return defaultFlowFileExpiration;
    }

    public void setDefaultFlowFileExpiration(String defaultFlowFileExpiration) {
        this.defaultFlowFileExpiration = defaultFlowFileExpiration;
    }

    public VersionedProcessGroup defaultBackPressureObjectThreshold(Long defaultBackPressureObjectThreshold) {
        this.defaultBackPressureObjectThreshold = defaultBackPressureObjectThreshold;
        return this;
    }

    /**
     * Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied.
     *
     * @return defaultBackPressureObjectThreshold
     **/
    @ApiModelProperty(value = "Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied.")
    public Long getDefaultBackPressureObjectThreshold() {
        return defaultBackPressureObjectThreshold;
    }

    public void setDefaultBackPressureObjectThreshold(Long defaultBackPressureObjectThreshold) {
        this.defaultBackPressureObjectThreshold = defaultBackPressureObjectThreshold;
    }

    public VersionedProcessGroup defaultBackPressureDataSizeThreshold(String defaultBackPressureDataSizeThreshold) {
        this.defaultBackPressureDataSizeThreshold = defaultBackPressureDataSizeThreshold;
        return this;
    }

    /**
     * Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied.
     *
     * @return defaultBackPressureDataSizeThreshold
     **/
    @ApiModelProperty(value = "Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied.")
    public String getDefaultBackPressureDataSizeThreshold() {
        return defaultBackPressureDataSizeThreshold;
    }

    public void setDefaultBackPressureDataSizeThreshold(String defaultBackPressureDataSizeThreshold) {
        this.defaultBackPressureDataSizeThreshold = defaultBackPressureDataSizeThreshold;
    }

    public VersionedProcessGroup logFileSuffix(String logFileSuffix) {
        this.logFileSuffix = logFileSuffix;
        return this;
    }

    /**
     * The log file suffix for this Process Group for dedicated logging.
     *
     * @return logFileSuffix
     **/
    @ApiModelProperty(value = "The log file suffix for this Process Group for dedicated logging.")
    public String getLogFileSuffix() {
        return logFileSuffix;
    }

    public void setLogFileSuffix(String logFileSuffix) {
        this.logFileSuffix = logFileSuffix;
    }

    public VersionedProcessGroup componentType(ComponentTypeEnum componentType) {
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

    public VersionedProcessGroup flowFileConcurrency(String flowFileConcurrency) {
        this.flowFileConcurrency = flowFileConcurrency;
        return this;
    }

    /**
     * The configured FlowFile Concurrency for the Process Group
     *
     * @return flowFileConcurrency
     **/
    @ApiModelProperty(value = "The configured FlowFile Concurrency for the Process Group")
    public String getFlowFileConcurrency() {
        return flowFileConcurrency;
    }

    public void setFlowFileConcurrency(String flowFileConcurrency) {
        this.flowFileConcurrency = flowFileConcurrency;
    }

    public VersionedProcessGroup flowFileOutboundPolicy(String flowFileOutboundPolicy) {
        this.flowFileOutboundPolicy = flowFileOutboundPolicy;
        return this;
    }

    /**
     * The FlowFile Outbound Policy for the Process Group
     *
     * @return flowFileOutboundPolicy
     **/
    @ApiModelProperty(value = "The FlowFile Outbound Policy for the Process Group")
    public String getFlowFileOutboundPolicy() {
        return flowFileOutboundPolicy;
    }

    public void setFlowFileOutboundPolicy(String flowFileOutboundPolicy) {
        this.flowFileOutboundPolicy = flowFileOutboundPolicy;
    }

    public VersionedProcessGroup groupIdentifier(String groupIdentifier) {
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
        VersionedProcessGroup versionedProcessGroup = (VersionedProcessGroup) o;
        return Objects.equals(this.identifier, versionedProcessGroup.identifier) &&
                Objects.equals(this.instanceIdentifier, versionedProcessGroup.instanceIdentifier) &&
                Objects.equals(this.name, versionedProcessGroup.name) &&
                Objects.equals(this.comments, versionedProcessGroup.comments) &&
                Objects.equals(this.position, versionedProcessGroup.position) &&
                Objects.equals(this.processGroups, versionedProcessGroup.processGroups) &&
                Objects.equals(this.remoteProcessGroups, versionedProcessGroup.remoteProcessGroups) &&
                Objects.equals(this.processors, versionedProcessGroup.processors) &&
                Objects.equals(this.inputPorts, versionedProcessGroup.inputPorts) &&
                Objects.equals(this.outputPorts, versionedProcessGroup.outputPorts) &&
                Objects.equals(this.connections, versionedProcessGroup.connections) &&
                Objects.equals(this.labels, versionedProcessGroup.labels) &&
                Objects.equals(this.funnels, versionedProcessGroup.funnels) &&
                Objects.equals(this.controllerServices, versionedProcessGroup.controllerServices) &&
                Objects.equals(this.versionedFlowCoordinates, versionedProcessGroup.versionedFlowCoordinates) &&
                Objects.equals(this.variables, versionedProcessGroup.variables) &&
                Objects.equals(this.parameterContextName, versionedProcessGroup.parameterContextName) &&
                Objects.equals(this.defaultFlowFileExpiration, versionedProcessGroup.defaultFlowFileExpiration) &&
                Objects.equals(this.defaultBackPressureObjectThreshold, versionedProcessGroup.defaultBackPressureObjectThreshold) &&
                Objects.equals(this.defaultBackPressureDataSizeThreshold, versionedProcessGroup.defaultBackPressureDataSizeThreshold) &&
                Objects.equals(this.logFileSuffix, versionedProcessGroup.logFileSuffix) &&
                Objects.equals(this.componentType, versionedProcessGroup.componentType) &&
                Objects.equals(this.flowFileConcurrency, versionedProcessGroup.flowFileConcurrency) &&
                Objects.equals(this.flowFileOutboundPolicy, versionedProcessGroup.flowFileOutboundPolicy) &&
                Objects.equals(this.groupIdentifier, versionedProcessGroup.groupIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, instanceIdentifier, name, comments, position, processGroups, remoteProcessGroups, processors, inputPorts, outputPorts, connections, labels, funnels, controllerServices, versionedFlowCoordinates, variables, parameterContextName, defaultFlowFileExpiration, defaultBackPressureObjectThreshold, defaultBackPressureDataSizeThreshold, logFileSuffix, componentType, flowFileConcurrency, flowFileOutboundPolicy, groupIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionedProcessGroup {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    processGroups: ").append(toIndentedString(processGroups)).append("\n");
        sb.append("    remoteProcessGroups: ").append(toIndentedString(remoteProcessGroups)).append("\n");
        sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
        sb.append("    inputPorts: ").append(toIndentedString(inputPorts)).append("\n");
        sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    funnels: ").append(toIndentedString(funnels)).append("\n");
        sb.append("    controllerServices: ").append(toIndentedString(controllerServices)).append("\n");
        sb.append("    versionedFlowCoordinates: ").append(toIndentedString(versionedFlowCoordinates)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    parameterContextName: ").append(toIndentedString(parameterContextName)).append("\n");
        sb.append("    defaultFlowFileExpiration: ").append(toIndentedString(defaultFlowFileExpiration)).append("\n");
        sb.append("    defaultBackPressureObjectThreshold: ").append(toIndentedString(defaultBackPressureObjectThreshold)).append("\n");
        sb.append("    defaultBackPressureDataSizeThreshold: ").append(toIndentedString(defaultBackPressureDataSizeThreshold)).append("\n");
        sb.append("    logFileSuffix: ").append(toIndentedString(logFileSuffix)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    flowFileConcurrency: ").append(toIndentedString(flowFileConcurrency)).append("\n");
        sb.append("    flowFileOutboundPolicy: ").append(toIndentedString(flowFileOutboundPolicy)).append("\n");
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
