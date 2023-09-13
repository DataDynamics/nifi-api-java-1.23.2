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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PositionDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PortDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class PortDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("versionedComponentId")
  private String versionedComponentId = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  /**
   * The state of the port.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("RUNNING"),
    
    STOPPED("STOPPED"),
    
    DISABLED("DISABLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  /**
   * The type of port.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INPUT_PORT("INPUT_PORT"),
    
    OUTPUT_PORT("OUTPUT_PORT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("transmitting")
  private Boolean transmitting = null;

  @SerializedName("concurrentlySchedulableTaskCount")
  private Integer concurrentlySchedulableTaskCount = null;

  @SerializedName("userAccessControl")
  private List<String> userAccessControl = null;

  @SerializedName("groupAccessControl")
  private List<String> groupAccessControl = null;

  @SerializedName("allowRemoteAccess")
  private Boolean allowRemoteAccess = null;

  @SerializedName("validationErrors")
  private List<String> validationErrors = null;

  public PortDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PortDTO versionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @ApiModelProperty(value = "The ID of the corresponding component that is under version control")
  public String getVersionedComponentId() {
    return versionedComponentId;
  }

  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }

  public PortDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public PortDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public PortDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the port.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the port.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PortDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments for the port.
   * @return comments
  **/
  @ApiModelProperty(value = "The comments for the port.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public PortDTO state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the port.
   * @return state
  **/
  @ApiModelProperty(value = "The state of the port.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public PortDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of port.
   * @return type
  **/
  @ApiModelProperty(value = "The type of port.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PortDTO transmitting(Boolean transmitting) {
    this.transmitting = transmitting;
    return this;
  }

   /**
   * Whether the port has incoming or output connections to a remote NiFi. This is only applicable when the port is allowed to be accessed remotely.
   * @return transmitting
  **/
  @ApiModelProperty(value = "Whether the port has incoming or output connections to a remote NiFi. This is only applicable when the port is allowed to be accessed remotely.")
  public Boolean isTransmitting() {
    return transmitting;
  }

  public void setTransmitting(Boolean transmitting) {
    this.transmitting = transmitting;
  }

  public PortDTO concurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    return this;
  }

   /**
   * The number of tasks that should be concurrently scheduled for the port.
   * @return concurrentlySchedulableTaskCount
  **/
  @ApiModelProperty(value = "The number of tasks that should be concurrently scheduled for the port.")
  public Integer getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  public PortDTO userAccessControl(List<String> userAccessControl) {
    this.userAccessControl = userAccessControl;
    return this;
  }

  public PortDTO addUserAccessControlItem(String userAccessControlItem) {
    if (this.userAccessControl == null) {
      this.userAccessControl = new ArrayList<String>();
    }
    this.userAccessControl.add(userAccessControlItem);
    return this;
  }

   /**
   * The users that are allowed to access the port.
   * @return userAccessControl
  **/
  @ApiModelProperty(value = "The users that are allowed to access the port.")
  public List<String> getUserAccessControl() {
    return userAccessControl;
  }

  public void setUserAccessControl(List<String> userAccessControl) {
    this.userAccessControl = userAccessControl;
  }

  public PortDTO groupAccessControl(List<String> groupAccessControl) {
    this.groupAccessControl = groupAccessControl;
    return this;
  }

  public PortDTO addGroupAccessControlItem(String groupAccessControlItem) {
    if (this.groupAccessControl == null) {
      this.groupAccessControl = new ArrayList<String>();
    }
    this.groupAccessControl.add(groupAccessControlItem);
    return this;
  }

   /**
   * The user groups that are allowed to access the port.
   * @return groupAccessControl
  **/
  @ApiModelProperty(value = "The user groups that are allowed to access the port.")
  public List<String> getGroupAccessControl() {
    return groupAccessControl;
  }

  public void setGroupAccessControl(List<String> groupAccessControl) {
    this.groupAccessControl = groupAccessControl;
  }

  public PortDTO allowRemoteAccess(Boolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
    return this;
  }

   /**
   * Whether this port can be accessed remotely via Site-to-Site protocol.
   * @return allowRemoteAccess
  **/
  @ApiModelProperty(value = "Whether this port can be accessed remotely via Site-to-Site protocol.")
  public Boolean isAllowRemoteAccess() {
    return allowRemoteAccess;
  }

  public void setAllowRemoteAccess(Boolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
  }

  public PortDTO validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PortDTO addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Gets the validation errors from this port. These validation errors represent the problems with the port that must be resolved before it can be started.
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Gets the validation errors from this port. These validation errors represent the problems with the port that must be resolved before it can be started.")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortDTO portDTO = (PortDTO) o;
    return Objects.equals(this.id, portDTO.id) &&
        Objects.equals(this.versionedComponentId, portDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, portDTO.parentGroupId) &&
        Objects.equals(this.position, portDTO.position) &&
        Objects.equals(this.name, portDTO.name) &&
        Objects.equals(this.comments, portDTO.comments) &&
        Objects.equals(this.state, portDTO.state) &&
        Objects.equals(this.type, portDTO.type) &&
        Objects.equals(this.transmitting, portDTO.transmitting) &&
        Objects.equals(this.concurrentlySchedulableTaskCount, portDTO.concurrentlySchedulableTaskCount) &&
        Objects.equals(this.userAccessControl, portDTO.userAccessControl) &&
        Objects.equals(this.groupAccessControl, portDTO.groupAccessControl) &&
        Objects.equals(this.allowRemoteAccess, portDTO.allowRemoteAccess) &&
        Objects.equals(this.validationErrors, portDTO.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, name, comments, state, type, transmitting, concurrentlySchedulableTaskCount, userAccessControl, groupAccessControl, allowRemoteAccess, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    transmitting: ").append(toIndentedString(transmitting)).append("\n");
    sb.append("    concurrentlySchedulableTaskCount: ").append(toIndentedString(concurrentlySchedulableTaskCount)).append("\n");
    sb.append("    userAccessControl: ").append(toIndentedString(userAccessControl)).append("\n");
    sb.append("    groupAccessControl: ").append(toIndentedString(groupAccessControl)).append("\n");
    sb.append("    allowRemoteAccess: ").append(toIndentedString(allowRemoteAccess)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

