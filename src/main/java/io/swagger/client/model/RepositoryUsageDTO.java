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
import java.io.IOException;

/**
 * RepositoryUsageDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class RepositoryUsageDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("fileStoreHash")
  private String fileStoreHash = null;

  @SerializedName("freeSpace")
  private String freeSpace = null;

  @SerializedName("totalSpace")
  private String totalSpace = null;

  @SerializedName("freeSpaceBytes")
  private Long freeSpaceBytes = null;

  @SerializedName("totalSpaceBytes")
  private Long totalSpaceBytes = null;

  @SerializedName("utilization")
  private String utilization = null;

  public RepositoryUsageDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the repository
   * @return name
  **/
  @ApiModelProperty(value = "The name of the repository")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RepositoryUsageDTO fileStoreHash(String fileStoreHash) {
    this.fileStoreHash = fileStoreHash;
    return this;
  }

   /**
   * A SHA-256 hash of the File Store name/path that is used to store the repository&#39;s data. This information is exposed as a hash in order to avoid exposing potentially sensitive information that is not generally relevant. What is typically relevant is whether or not multiple repositories on the same node are using the same File Store, as this indicates that the repositories are competing for the resources of the backing disk/storage mechanism.
   * @return fileStoreHash
  **/
  @ApiModelProperty(value = "A SHA-256 hash of the File Store name/path that is used to store the repository's data. This information is exposed as a hash in order to avoid exposing potentially sensitive information that is not generally relevant. What is typically relevant is whether or not multiple repositories on the same node are using the same File Store, as this indicates that the repositories are competing for the resources of the backing disk/storage mechanism.")
  public String getFileStoreHash() {
    return fileStoreHash;
  }

  public void setFileStoreHash(String fileStoreHash) {
    this.fileStoreHash = fileStoreHash;
  }

  public RepositoryUsageDTO freeSpace(String freeSpace) {
    this.freeSpace = freeSpace;
    return this;
  }

   /**
   * Amount of free space.
   * @return freeSpace
  **/
  @ApiModelProperty(value = "Amount of free space.")
  public String getFreeSpace() {
    return freeSpace;
  }

  public void setFreeSpace(String freeSpace) {
    this.freeSpace = freeSpace;
  }

  public RepositoryUsageDTO totalSpace(String totalSpace) {
    this.totalSpace = totalSpace;
    return this;
  }

   /**
   * Amount of total space.
   * @return totalSpace
  **/
  @ApiModelProperty(value = "Amount of total space.")
  public String getTotalSpace() {
    return totalSpace;
  }

  public void setTotalSpace(String totalSpace) {
    this.totalSpace = totalSpace;
  }

  public RepositoryUsageDTO freeSpaceBytes(Long freeSpaceBytes) {
    this.freeSpaceBytes = freeSpaceBytes;
    return this;
  }

   /**
   * The number of bytes of free space.
   * @return freeSpaceBytes
  **/
  @ApiModelProperty(value = "The number of bytes of free space.")
  public Long getFreeSpaceBytes() {
    return freeSpaceBytes;
  }

  public void setFreeSpaceBytes(Long freeSpaceBytes) {
    this.freeSpaceBytes = freeSpaceBytes;
  }

  public RepositoryUsageDTO totalSpaceBytes(Long totalSpaceBytes) {
    this.totalSpaceBytes = totalSpaceBytes;
    return this;
  }

   /**
   * The number of bytes of total space.
   * @return totalSpaceBytes
  **/
  @ApiModelProperty(value = "The number of bytes of total space.")
  public Long getTotalSpaceBytes() {
    return totalSpaceBytes;
  }

  public void setTotalSpaceBytes(Long totalSpaceBytes) {
    this.totalSpaceBytes = totalSpaceBytes;
  }

  public RepositoryUsageDTO utilization(String utilization) {
    this.utilization = utilization;
    return this;
  }

   /**
   * Utilization of this storage location.
   * @return utilization
  **/
  @ApiModelProperty(value = "Utilization of this storage location.")
  public String getUtilization() {
    return utilization;
  }

  public void setUtilization(String utilization) {
    this.utilization = utilization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryUsageDTO repositoryUsageDTO = (RepositoryUsageDTO) o;
    return Objects.equals(this.name, repositoryUsageDTO.name) &&
        Objects.equals(this.fileStoreHash, repositoryUsageDTO.fileStoreHash) &&
        Objects.equals(this.freeSpace, repositoryUsageDTO.freeSpace) &&
        Objects.equals(this.totalSpace, repositoryUsageDTO.totalSpace) &&
        Objects.equals(this.freeSpaceBytes, repositoryUsageDTO.freeSpaceBytes) &&
        Objects.equals(this.totalSpaceBytes, repositoryUsageDTO.totalSpaceBytes) &&
        Objects.equals(this.utilization, repositoryUsageDTO.utilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fileStoreHash, freeSpace, totalSpace, freeSpaceBytes, totalSpaceBytes, utilization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryUsageDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileStoreHash: ").append(toIndentedString(fileStoreHash)).append("\n");
    sb.append("    freeSpace: ").append(toIndentedString(freeSpace)).append("\n");
    sb.append("    totalSpace: ").append(toIndentedString(totalSpace)).append("\n");
    sb.append("    freeSpaceBytes: ").append(toIndentedString(freeSpaceBytes)).append("\n");
    sb.append("    totalSpaceBytes: ").append(toIndentedString(totalSpaceBytes)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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

