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
import io.swagger.client.model.BuildInfo;
import io.swagger.client.model.Bundle;
import io.swagger.client.model.SchedulingDefaults;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RuntimeManifest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class RuntimeManifest {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("agentType")
  private String agentType = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("buildInfo")
  private BuildInfo buildInfo = null;

  @SerializedName("bundles")
  private List<Bundle> bundles = null;

  @SerializedName("schedulingDefaults")
  private SchedulingDefaults schedulingDefaults = null;

  public RuntimeManifest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * A unique identifier for the manifest
   * @return identifier
  **/
  @ApiModelProperty(value = "A unique identifier for the manifest")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public RuntimeManifest agentType(String agentType) {
    this.agentType = agentType;
    return this;
  }

   /**
   * The type of the runtime binary, e.g., &#39;minifi-java&#39; or &#39;minifi-cpp&#39;
   * @return agentType
  **/
  @ApiModelProperty(value = "The type of the runtime binary, e.g., 'minifi-java' or 'minifi-cpp'")
  public String getAgentType() {
    return agentType;
  }

  public void setAgentType(String agentType) {
    this.agentType = agentType;
  }

  public RuntimeManifest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the runtime binary, e.g., &#39;1.0.1&#39;
   * @return version
  **/
  @ApiModelProperty(value = "The version of the runtime binary, e.g., '1.0.1'")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public RuntimeManifest buildInfo(BuildInfo buildInfo) {
    this.buildInfo = buildInfo;
    return this;
  }

   /**
   * Build summary for this runtime binary
   * @return buildInfo
  **/
  @ApiModelProperty(value = "Build summary for this runtime binary")
  public BuildInfo getBuildInfo() {
    return buildInfo;
  }

  public void setBuildInfo(BuildInfo buildInfo) {
    this.buildInfo = buildInfo;
  }

  public RuntimeManifest bundles(List<Bundle> bundles) {
    this.bundles = bundles;
    return this;
  }

  public RuntimeManifest addBundlesItem(Bundle bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<Bundle>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

   /**
   * All extension bundles included with this runtime
   * @return bundles
  **/
  @ApiModelProperty(value = "All extension bundles included with this runtime")
  public List<Bundle> getBundles() {
    return bundles;
  }

  public void setBundles(List<Bundle> bundles) {
    this.bundles = bundles;
  }

  public RuntimeManifest schedulingDefaults(SchedulingDefaults schedulingDefaults) {
    this.schedulingDefaults = schedulingDefaults;
    return this;
  }

   /**
   * Scheduling defaults for components defined in this manifest
   * @return schedulingDefaults
  **/
  @ApiModelProperty(value = "Scheduling defaults for components defined in this manifest")
  public SchedulingDefaults getSchedulingDefaults() {
    return schedulingDefaults;
  }

  public void setSchedulingDefaults(SchedulingDefaults schedulingDefaults) {
    this.schedulingDefaults = schedulingDefaults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeManifest runtimeManifest = (RuntimeManifest) o;
    return Objects.equals(this.identifier, runtimeManifest.identifier) &&
        Objects.equals(this.agentType, runtimeManifest.agentType) &&
        Objects.equals(this.version, runtimeManifest.version) &&
        Objects.equals(this.buildInfo, runtimeManifest.buildInfo) &&
        Objects.equals(this.bundles, runtimeManifest.bundles) &&
        Objects.equals(this.schedulingDefaults, runtimeManifest.schedulingDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, agentType, version, buildInfo, bundles, schedulingDefaults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeManifest {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    buildInfo: ").append(toIndentedString(buildInfo)).append("\n");
    sb.append("    bundles: ").append(toIndentedString(bundles)).append("\n");
    sb.append("    schedulingDefaults: ").append(toIndentedString(schedulingDefaults)).append("\n");
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

