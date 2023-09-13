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
 * ProcessGroupEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProcessGroupEntity {
    @SerializedName("revision")
    private RevisionDTO revision = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("position")
    private PositionDTO position = null;

    @SerializedName("permissions")
    private PermissionsDTO permissions = null;

    @SerializedName("bulletins")
    private List<BulletinEntity> bulletins = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    @SerializedName("component")
    private ProcessGroupDTO component = null;

    @SerializedName("status")
    private ProcessGroupStatusDTO status = null;

    @SerializedName("versionedFlowSnapshot")
    private RegisteredFlowSnapshot versionedFlowSnapshot = null;

    @SerializedName("runningCount")
    private Integer runningCount = null;

    @SerializedName("stoppedCount")
    private Integer stoppedCount = null;

    @SerializedName("invalidCount")
    private Integer invalidCount = null;

    @SerializedName("disabledCount")
    private Integer disabledCount = null;

    @SerializedName("activeRemotePortCount")
    private Integer activeRemotePortCount = null;

    @SerializedName("inactiveRemotePortCount")
    private Integer inactiveRemotePortCount = null;
    @SerializedName("versionedFlowState")
    private VersionedFlowStateEnum versionedFlowState = null;
    @SerializedName("upToDateCount")
    private Integer upToDateCount = null;
    @SerializedName("locallyModifiedCount")
    private Integer locallyModifiedCount = null;
    @SerializedName("staleCount")
    private Integer staleCount = null;
    @SerializedName("locallyModifiedAndStaleCount")
    private Integer locallyModifiedAndStaleCount = null;
    @SerializedName("syncFailureCount")
    private Integer syncFailureCount = null;
    @SerializedName("localInputPortCount")
    private Integer localInputPortCount = null;
    @SerializedName("localOutputPortCount")
    private Integer localOutputPortCount = null;
    @SerializedName("publicInputPortCount")
    private Integer publicInputPortCount = null;
    @SerializedName("publicOutputPortCount")
    private Integer publicOutputPortCount = null;
    @SerializedName("parameterContext")
    private ParameterContextReferenceEntity parameterContext = null;
    @SerializedName("inputPortCount")
    private Integer inputPortCount = null;
    @SerializedName("outputPortCount")
    private Integer outputPortCount = null;

    public ProcessGroupEntity revision(RevisionDTO revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
     *
     * @return revision
     **/
    @ApiModelProperty(value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
    public RevisionDTO getRevision() {
        return revision;
    }

    public void setRevision(RevisionDTO revision) {
        this.revision = revision;
    }

    public ProcessGroupEntity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the component.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The id of the component.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessGroupEntity uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI for futures requests to the component.
     *
     * @return uri
     **/
    @ApiModelProperty(value = "The URI for futures requests to the component.")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ProcessGroupEntity position(PositionDTO position) {
        this.position = position;
        return this;
    }

    /**
     * The position of this component in the UI if applicable.
     *
     * @return position
     **/
    @ApiModelProperty(value = "The position of this component in the UI if applicable.")
    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public ProcessGroupEntity permissions(PermissionsDTO permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permissions for this component.
     *
     * @return permissions
     **/
    @ApiModelProperty(value = "The permissions for this component.")
    public PermissionsDTO getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsDTO permissions) {
        this.permissions = permissions;
    }

    public ProcessGroupEntity bulletins(List<BulletinEntity> bulletins) {
        this.bulletins = bulletins;
        return this;
    }

    public ProcessGroupEntity addBulletinsItem(BulletinEntity bulletinsItem) {
        if (this.bulletins == null) {
            this.bulletins = new ArrayList<BulletinEntity>();
        }
        this.bulletins.add(bulletinsItem);
        return this;
    }

    /**
     * The bulletins for this component.
     *
     * @return bulletins
     **/
    @ApiModelProperty(value = "The bulletins for this component.")
    public List<BulletinEntity> getBulletins() {
        return bulletins;
    }

    public void setBulletins(List<BulletinEntity> bulletins) {
        this.bulletins = bulletins;
    }

    public ProcessGroupEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
        return this;
    }

    /**
     * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
     *
     * @return disconnectedNodeAcknowledged
     **/
    @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
    public Boolean isDisconnectedNodeAcknowledged() {
        return disconnectedNodeAcknowledged;
    }

    public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    }

    public ProcessGroupEntity component(ProcessGroupDTO component) {
        this.component = component;
        return this;
    }

    /**
     * Get component
     *
     * @return component
     **/
    @ApiModelProperty(value = "")
    public ProcessGroupDTO getComponent() {
        return component;
    }

    public void setComponent(ProcessGroupDTO component) {
        this.component = component;
    }

    public ProcessGroupEntity status(ProcessGroupStatusDTO status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the process group.
     *
     * @return status
     **/
    @ApiModelProperty(value = "The status of the process group.")
    public ProcessGroupStatusDTO getStatus() {
        return status;
    }

    public void setStatus(ProcessGroupStatusDTO status) {
        this.status = status;
    }

    public ProcessGroupEntity versionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
        return this;
    }

    /**
     * Returns the Versioned Flow that describes the contents of the Versioned Flow to be imported
     *
     * @return versionedFlowSnapshot
     **/
    @ApiModelProperty(value = "Returns the Versioned Flow that describes the contents of the Versioned Flow to be imported")
    public RegisteredFlowSnapshot getVersionedFlowSnapshot() {
        return versionedFlowSnapshot;
    }

    public void setVersionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
    }

    public ProcessGroupEntity runningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * The number of running components in this process group.
     *
     * @return runningCount
     **/
    @ApiModelProperty(value = "The number of running components in this process group.")
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public ProcessGroupEntity stoppedCount(Integer stoppedCount) {
        this.stoppedCount = stoppedCount;
        return this;
    }

    /**
     * The number of stopped components in the process group.
     *
     * @return stoppedCount
     **/
    @ApiModelProperty(value = "The number of stopped components in the process group.")
    public Integer getStoppedCount() {
        return stoppedCount;
    }

    public void setStoppedCount(Integer stoppedCount) {
        this.stoppedCount = stoppedCount;
    }

    public ProcessGroupEntity invalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
        return this;
    }

    /**
     * The number of invalid components in the process group.
     *
     * @return invalidCount
     **/
    @ApiModelProperty(value = "The number of invalid components in the process group.")
    public Integer getInvalidCount() {
        return invalidCount;
    }

    public void setInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
    }

    public ProcessGroupEntity disabledCount(Integer disabledCount) {
        this.disabledCount = disabledCount;
        return this;
    }

    /**
     * The number of disabled components in the process group.
     *
     * @return disabledCount
     **/
    @ApiModelProperty(value = "The number of disabled components in the process group.")
    public Integer getDisabledCount() {
        return disabledCount;
    }

    public void setDisabledCount(Integer disabledCount) {
        this.disabledCount = disabledCount;
    }

    public ProcessGroupEntity activeRemotePortCount(Integer activeRemotePortCount) {
        this.activeRemotePortCount = activeRemotePortCount;
        return this;
    }

    /**
     * The number of active remote ports in the process group.
     *
     * @return activeRemotePortCount
     **/
    @ApiModelProperty(value = "The number of active remote ports in the process group.")
    public Integer getActiveRemotePortCount() {
        return activeRemotePortCount;
    }

    public void setActiveRemotePortCount(Integer activeRemotePortCount) {
        this.activeRemotePortCount = activeRemotePortCount;
    }

    public ProcessGroupEntity inactiveRemotePortCount(Integer inactiveRemotePortCount) {
        this.inactiveRemotePortCount = inactiveRemotePortCount;
        return this;
    }

    /**
     * The number of inactive remote ports in the process group.
     *
     * @return inactiveRemotePortCount
     **/
    @ApiModelProperty(value = "The number of inactive remote ports in the process group.")
    public Integer getInactiveRemotePortCount() {
        return inactiveRemotePortCount;
    }

    public void setInactiveRemotePortCount(Integer inactiveRemotePortCount) {
        this.inactiveRemotePortCount = inactiveRemotePortCount;
    }

    public ProcessGroupEntity versionedFlowState(VersionedFlowStateEnum versionedFlowState) {
        this.versionedFlowState = versionedFlowState;
        return this;
    }

    /**
     * The current state of the Process Group, as it relates to the Versioned Flow
     *
     * @return versionedFlowState
     **/
    @ApiModelProperty(value = "The current state of the Process Group, as it relates to the Versioned Flow")
    public VersionedFlowStateEnum getVersionedFlowState() {
        return versionedFlowState;
    }

    public void setVersionedFlowState(VersionedFlowStateEnum versionedFlowState) {
        this.versionedFlowState = versionedFlowState;
    }

    public ProcessGroupEntity upToDateCount(Integer upToDateCount) {
        this.upToDateCount = upToDateCount;
        return this;
    }

    /**
     * The number of up to date versioned process groups in the process group.
     *
     * @return upToDateCount
     **/
    @ApiModelProperty(value = "The number of up to date versioned process groups in the process group.")
    public Integer getUpToDateCount() {
        return upToDateCount;
    }

    public void setUpToDateCount(Integer upToDateCount) {
        this.upToDateCount = upToDateCount;
    }

    public ProcessGroupEntity locallyModifiedCount(Integer locallyModifiedCount) {
        this.locallyModifiedCount = locallyModifiedCount;
        return this;
    }

    /**
     * The number of locally modified versioned process groups in the process group.
     *
     * @return locallyModifiedCount
     **/
    @ApiModelProperty(value = "The number of locally modified versioned process groups in the process group.")
    public Integer getLocallyModifiedCount() {
        return locallyModifiedCount;
    }

    public void setLocallyModifiedCount(Integer locallyModifiedCount) {
        this.locallyModifiedCount = locallyModifiedCount;
    }

    public ProcessGroupEntity staleCount(Integer staleCount) {
        this.staleCount = staleCount;
        return this;
    }

    /**
     * The number of stale versioned process groups in the process group.
     *
     * @return staleCount
     **/
    @ApiModelProperty(value = "The number of stale versioned process groups in the process group.")
    public Integer getStaleCount() {
        return staleCount;
    }

    public void setStaleCount(Integer staleCount) {
        this.staleCount = staleCount;
    }

    public ProcessGroupEntity locallyModifiedAndStaleCount(Integer locallyModifiedAndStaleCount) {
        this.locallyModifiedAndStaleCount = locallyModifiedAndStaleCount;
        return this;
    }

    /**
     * The number of locally modified and stale versioned process groups in the process group.
     *
     * @return locallyModifiedAndStaleCount
     **/
    @ApiModelProperty(value = "The number of locally modified and stale versioned process groups in the process group.")
    public Integer getLocallyModifiedAndStaleCount() {
        return locallyModifiedAndStaleCount;
    }

    public void setLocallyModifiedAndStaleCount(Integer locallyModifiedAndStaleCount) {
        this.locallyModifiedAndStaleCount = locallyModifiedAndStaleCount;
    }

    public ProcessGroupEntity syncFailureCount(Integer syncFailureCount) {
        this.syncFailureCount = syncFailureCount;
        return this;
    }

    /**
     * The number of versioned process groups in the process group that are unable to sync to a registry.
     *
     * @return syncFailureCount
     **/
    @ApiModelProperty(value = "The number of versioned process groups in the process group that are unable to sync to a registry.")
    public Integer getSyncFailureCount() {
        return syncFailureCount;
    }

    public void setSyncFailureCount(Integer syncFailureCount) {
        this.syncFailureCount = syncFailureCount;
    }

    public ProcessGroupEntity localInputPortCount(Integer localInputPortCount) {
        this.localInputPortCount = localInputPortCount;
        return this;
    }

    /**
     * The number of local input ports in the process group.
     *
     * @return localInputPortCount
     **/
    @ApiModelProperty(value = "The number of local input ports in the process group.")
    public Integer getLocalInputPortCount() {
        return localInputPortCount;
    }

    public void setLocalInputPortCount(Integer localInputPortCount) {
        this.localInputPortCount = localInputPortCount;
    }

    public ProcessGroupEntity localOutputPortCount(Integer localOutputPortCount) {
        this.localOutputPortCount = localOutputPortCount;
        return this;
    }

    /**
     * The number of local output ports in the process group.
     *
     * @return localOutputPortCount
     **/
    @ApiModelProperty(value = "The number of local output ports in the process group.")
    public Integer getLocalOutputPortCount() {
        return localOutputPortCount;
    }

    public void setLocalOutputPortCount(Integer localOutputPortCount) {
        this.localOutputPortCount = localOutputPortCount;
    }

    public ProcessGroupEntity publicInputPortCount(Integer publicInputPortCount) {
        this.publicInputPortCount = publicInputPortCount;
        return this;
    }

    /**
     * The number of public input ports in the process group.
     *
     * @return publicInputPortCount
     **/
    @ApiModelProperty(value = "The number of public input ports in the process group.")
    public Integer getPublicInputPortCount() {
        return publicInputPortCount;
    }

    public void setPublicInputPortCount(Integer publicInputPortCount) {
        this.publicInputPortCount = publicInputPortCount;
    }

    public ProcessGroupEntity publicOutputPortCount(Integer publicOutputPortCount) {
        this.publicOutputPortCount = publicOutputPortCount;
        return this;
    }

    /**
     * The number of public output ports in the process group.
     *
     * @return publicOutputPortCount
     **/
    @ApiModelProperty(value = "The number of public output ports in the process group.")
    public Integer getPublicOutputPortCount() {
        return publicOutputPortCount;
    }

    public void setPublicOutputPortCount(Integer publicOutputPortCount) {
        this.publicOutputPortCount = publicOutputPortCount;
    }

    public ProcessGroupEntity parameterContext(ParameterContextReferenceEntity parameterContext) {
        this.parameterContext = parameterContext;
        return this;
    }

    /**
     * The Parameter Context, or null if no Parameter Context has been bound to the Process Group
     *
     * @return parameterContext
     **/
    @ApiModelProperty(value = "The Parameter Context, or null if no Parameter Context has been bound to the Process Group")
    public ParameterContextReferenceEntity getParameterContext() {
        return parameterContext;
    }

    public void setParameterContext(ParameterContextReferenceEntity parameterContext) {
        this.parameterContext = parameterContext;
    }

    public ProcessGroupEntity inputPortCount(Integer inputPortCount) {
        this.inputPortCount = inputPortCount;
        return this;
    }

    /**
     * The number of input ports in the process group.
     *
     * @return inputPortCount
     **/
    @ApiModelProperty(value = "The number of input ports in the process group.")
    public Integer getInputPortCount() {
        return inputPortCount;
    }

    public void setInputPortCount(Integer inputPortCount) {
        this.inputPortCount = inputPortCount;
    }

    public ProcessGroupEntity outputPortCount(Integer outputPortCount) {
        this.outputPortCount = outputPortCount;
        return this;
    }

    /**
     * The number of output ports in the process group.
     *
     * @return outputPortCount
     **/
    @ApiModelProperty(value = "The number of output ports in the process group.")
    public Integer getOutputPortCount() {
        return outputPortCount;
    }

    public void setOutputPortCount(Integer outputPortCount) {
        this.outputPortCount = outputPortCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessGroupEntity processGroupEntity = (ProcessGroupEntity) o;
        return Objects.equals(this.revision, processGroupEntity.revision) &&
                Objects.equals(this.id, processGroupEntity.id) &&
                Objects.equals(this.uri, processGroupEntity.uri) &&
                Objects.equals(this.position, processGroupEntity.position) &&
                Objects.equals(this.permissions, processGroupEntity.permissions) &&
                Objects.equals(this.bulletins, processGroupEntity.bulletins) &&
                Objects.equals(this.disconnectedNodeAcknowledged, processGroupEntity.disconnectedNodeAcknowledged) &&
                Objects.equals(this.component, processGroupEntity.component) &&
                Objects.equals(this.status, processGroupEntity.status) &&
                Objects.equals(this.versionedFlowSnapshot, processGroupEntity.versionedFlowSnapshot) &&
                Objects.equals(this.runningCount, processGroupEntity.runningCount) &&
                Objects.equals(this.stoppedCount, processGroupEntity.stoppedCount) &&
                Objects.equals(this.invalidCount, processGroupEntity.invalidCount) &&
                Objects.equals(this.disabledCount, processGroupEntity.disabledCount) &&
                Objects.equals(this.activeRemotePortCount, processGroupEntity.activeRemotePortCount) &&
                Objects.equals(this.inactiveRemotePortCount, processGroupEntity.inactiveRemotePortCount) &&
                Objects.equals(this.versionedFlowState, processGroupEntity.versionedFlowState) &&
                Objects.equals(this.upToDateCount, processGroupEntity.upToDateCount) &&
                Objects.equals(this.locallyModifiedCount, processGroupEntity.locallyModifiedCount) &&
                Objects.equals(this.staleCount, processGroupEntity.staleCount) &&
                Objects.equals(this.locallyModifiedAndStaleCount, processGroupEntity.locallyModifiedAndStaleCount) &&
                Objects.equals(this.syncFailureCount, processGroupEntity.syncFailureCount) &&
                Objects.equals(this.localInputPortCount, processGroupEntity.localInputPortCount) &&
                Objects.equals(this.localOutputPortCount, processGroupEntity.localOutputPortCount) &&
                Objects.equals(this.publicInputPortCount, processGroupEntity.publicInputPortCount) &&
                Objects.equals(this.publicOutputPortCount, processGroupEntity.publicOutputPortCount) &&
                Objects.equals(this.parameterContext, processGroupEntity.parameterContext) &&
                Objects.equals(this.inputPortCount, processGroupEntity.inputPortCount) &&
                Objects.equals(this.outputPortCount, processGroupEntity.outputPortCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(revision, id, uri, position, permissions, bulletins, disconnectedNodeAcknowledged, component, status, versionedFlowSnapshot, runningCount, stoppedCount, invalidCount, disabledCount, activeRemotePortCount, inactiveRemotePortCount, versionedFlowState, upToDateCount, locallyModifiedCount, staleCount, locallyModifiedAndStaleCount, syncFailureCount, localInputPortCount, localOutputPortCount, publicInputPortCount, publicOutputPortCount, parameterContext, inputPortCount, outputPortCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessGroupEntity {\n");

        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    versionedFlowSnapshot: ").append(toIndentedString(versionedFlowSnapshot)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    stoppedCount: ").append(toIndentedString(stoppedCount)).append("\n");
        sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
        sb.append("    disabledCount: ").append(toIndentedString(disabledCount)).append("\n");
        sb.append("    activeRemotePortCount: ").append(toIndentedString(activeRemotePortCount)).append("\n");
        sb.append("    inactiveRemotePortCount: ").append(toIndentedString(inactiveRemotePortCount)).append("\n");
        sb.append("    versionedFlowState: ").append(toIndentedString(versionedFlowState)).append("\n");
        sb.append("    upToDateCount: ").append(toIndentedString(upToDateCount)).append("\n");
        sb.append("    locallyModifiedCount: ").append(toIndentedString(locallyModifiedCount)).append("\n");
        sb.append("    staleCount: ").append(toIndentedString(staleCount)).append("\n");
        sb.append("    locallyModifiedAndStaleCount: ").append(toIndentedString(locallyModifiedAndStaleCount)).append("\n");
        sb.append("    syncFailureCount: ").append(toIndentedString(syncFailureCount)).append("\n");
        sb.append("    localInputPortCount: ").append(toIndentedString(localInputPortCount)).append("\n");
        sb.append("    localOutputPortCount: ").append(toIndentedString(localOutputPortCount)).append("\n");
        sb.append("    publicInputPortCount: ").append(toIndentedString(publicInputPortCount)).append("\n");
        sb.append("    publicOutputPortCount: ").append(toIndentedString(publicOutputPortCount)).append("\n");
        sb.append("    parameterContext: ").append(toIndentedString(parameterContext)).append("\n");
        sb.append("    inputPortCount: ").append(toIndentedString(inputPortCount)).append("\n");
        sb.append("    outputPortCount: ").append(toIndentedString(outputPortCount)).append("\n");
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
     * The current state of the Process Group, as it relates to the Versioned Flow
     */
    @JsonAdapter(VersionedFlowStateEnum.Adapter.class)
    public enum VersionedFlowStateEnum {
        LOCALLY_MODIFIED("LOCALLY_MODIFIED"),

        STALE("STALE"),

        LOCALLY_MODIFIED_AND_STALE("LOCALLY_MODIFIED_AND_STALE"),

        UP_TO_DATE("UP_TO_DATE"),

        SYNC_FAILURE("SYNC_FAILURE");

        private String value;

        VersionedFlowStateEnum(String value) {
            this.value = value;
        }

        public static VersionedFlowStateEnum fromValue(String text) {
            for (VersionedFlowStateEnum b : VersionedFlowStateEnum.values()) {
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

        public static class Adapter extends TypeAdapter<VersionedFlowStateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VersionedFlowStateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VersionedFlowStateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VersionedFlowStateEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

