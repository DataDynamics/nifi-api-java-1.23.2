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
 * JVMSystemDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class JVMSystemDiagnosticsSnapshotDTO {
    @SerializedName("flowFileRepositoryStorageUsage")
    private RepositoryUsageDTO flowFileRepositoryStorageUsage = null;

    @SerializedName("contentRepositoryStorageUsage")
    private List<RepositoryUsageDTO> contentRepositoryStorageUsage = null;

    @SerializedName("provenanceRepositoryStorageUsage")
    private List<RepositoryUsageDTO> provenanceRepositoryStorageUsage = null;

    @SerializedName("maxHeapBytes")
    private Long maxHeapBytes = null;

    @SerializedName("maxHeap")
    private String maxHeap = null;

    @SerializedName("garbageCollectionDiagnostics")
    private List<GarbageCollectionDiagnosticsDTO> garbageCollectionDiagnostics = null;

    @SerializedName("cpuCores")
    private Integer cpuCores = null;

    @SerializedName("cpuLoadAverage")
    private Double cpuLoadAverage = null;

    @SerializedName("physicalMemoryBytes")
    private Long physicalMemoryBytes = null;

    @SerializedName("physicalMemory")
    private String physicalMemory = null;

    @SerializedName("openFileDescriptors")
    private Long openFileDescriptors = null;

    @SerializedName("maxOpenFileDescriptors")
    private Long maxOpenFileDescriptors = null;

    public JVMSystemDiagnosticsSnapshotDTO flowFileRepositoryStorageUsage(RepositoryUsageDTO flowFileRepositoryStorageUsage) {
        this.flowFileRepositoryStorageUsage = flowFileRepositoryStorageUsage;
        return this;
    }

    /**
     * Information about the FlowFile Repository&#39;s usage
     *
     * @return flowFileRepositoryStorageUsage
     **/
    @ApiModelProperty(value = "Information about the FlowFile Repository's usage")
    public RepositoryUsageDTO getFlowFileRepositoryStorageUsage() {
        return flowFileRepositoryStorageUsage;
    }

    public void setFlowFileRepositoryStorageUsage(RepositoryUsageDTO flowFileRepositoryStorageUsage) {
        this.flowFileRepositoryStorageUsage = flowFileRepositoryStorageUsage;
    }

    public JVMSystemDiagnosticsSnapshotDTO contentRepositoryStorageUsage(List<RepositoryUsageDTO> contentRepositoryStorageUsage) {
        this.contentRepositoryStorageUsage = contentRepositoryStorageUsage;
        return this;
    }

    public JVMSystemDiagnosticsSnapshotDTO addContentRepositoryStorageUsageItem(RepositoryUsageDTO contentRepositoryStorageUsageItem) {
        if (this.contentRepositoryStorageUsage == null) {
            this.contentRepositoryStorageUsage = new ArrayList<RepositoryUsageDTO>();
        }
        this.contentRepositoryStorageUsage.add(contentRepositoryStorageUsageItem);
        return this;
    }

    /**
     * Information about the Content Repository&#39;s usage
     *
     * @return contentRepositoryStorageUsage
     **/
    @ApiModelProperty(value = "Information about the Content Repository's usage")
    public List<RepositoryUsageDTO> getContentRepositoryStorageUsage() {
        return contentRepositoryStorageUsage;
    }

    public void setContentRepositoryStorageUsage(List<RepositoryUsageDTO> contentRepositoryStorageUsage) {
        this.contentRepositoryStorageUsage = contentRepositoryStorageUsage;
    }

    public JVMSystemDiagnosticsSnapshotDTO provenanceRepositoryStorageUsage(List<RepositoryUsageDTO> provenanceRepositoryStorageUsage) {
        this.provenanceRepositoryStorageUsage = provenanceRepositoryStorageUsage;
        return this;
    }

    public JVMSystemDiagnosticsSnapshotDTO addProvenanceRepositoryStorageUsageItem(RepositoryUsageDTO provenanceRepositoryStorageUsageItem) {
        if (this.provenanceRepositoryStorageUsage == null) {
            this.provenanceRepositoryStorageUsage = new ArrayList<RepositoryUsageDTO>();
        }
        this.provenanceRepositoryStorageUsage.add(provenanceRepositoryStorageUsageItem);
        return this;
    }

    /**
     * Information about the Provenance Repository&#39;s usage
     *
     * @return provenanceRepositoryStorageUsage
     **/
    @ApiModelProperty(value = "Information about the Provenance Repository's usage")
    public List<RepositoryUsageDTO> getProvenanceRepositoryStorageUsage() {
        return provenanceRepositoryStorageUsage;
    }

    public void setProvenanceRepositoryStorageUsage(List<RepositoryUsageDTO> provenanceRepositoryStorageUsage) {
        this.provenanceRepositoryStorageUsage = provenanceRepositoryStorageUsage;
    }

    public JVMSystemDiagnosticsSnapshotDTO maxHeapBytes(Long maxHeapBytes) {
        this.maxHeapBytes = maxHeapBytes;
        return this;
    }

    /**
     * The maximum number of bytes that the JVM heap is configured to use for heap
     *
     * @return maxHeapBytes
     **/
    @ApiModelProperty(value = "The maximum number of bytes that the JVM heap is configured to use for heap")
    public Long getMaxHeapBytes() {
        return maxHeapBytes;
    }

    public void setMaxHeapBytes(Long maxHeapBytes) {
        this.maxHeapBytes = maxHeapBytes;
    }

    public JVMSystemDiagnosticsSnapshotDTO maxHeap(String maxHeap) {
        this.maxHeap = maxHeap;
        return this;
    }

    /**
     * The maximum number of bytes that the JVM heap is configured to use, as a human-readable value
     *
     * @return maxHeap
     **/
    @ApiModelProperty(value = "The maximum number of bytes that the JVM heap is configured to use, as a human-readable value")
    public String getMaxHeap() {
        return maxHeap;
    }

    public void setMaxHeap(String maxHeap) {
        this.maxHeap = maxHeap;
    }

    public JVMSystemDiagnosticsSnapshotDTO garbageCollectionDiagnostics(List<GarbageCollectionDiagnosticsDTO> garbageCollectionDiagnostics) {
        this.garbageCollectionDiagnostics = garbageCollectionDiagnostics;
        return this;
    }

    public JVMSystemDiagnosticsSnapshotDTO addGarbageCollectionDiagnosticsItem(GarbageCollectionDiagnosticsDTO garbageCollectionDiagnosticsItem) {
        if (this.garbageCollectionDiagnostics == null) {
            this.garbageCollectionDiagnostics = new ArrayList<GarbageCollectionDiagnosticsDTO>();
        }
        this.garbageCollectionDiagnostics.add(garbageCollectionDiagnosticsItem);
        return this;
    }

    /**
     * Diagnostic information about the JVM&#39;s garbage collections
     *
     * @return garbageCollectionDiagnostics
     **/
    @ApiModelProperty(value = "Diagnostic information about the JVM's garbage collections")
    public List<GarbageCollectionDiagnosticsDTO> getGarbageCollectionDiagnostics() {
        return garbageCollectionDiagnostics;
    }

    public void setGarbageCollectionDiagnostics(List<GarbageCollectionDiagnosticsDTO> garbageCollectionDiagnostics) {
        this.garbageCollectionDiagnostics = garbageCollectionDiagnostics;
    }

    public JVMSystemDiagnosticsSnapshotDTO cpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * The number of CPU Cores available on the system
     *
     * @return cpuCores
     **/
    @ApiModelProperty(value = "The number of CPU Cores available on the system")
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public JVMSystemDiagnosticsSnapshotDTO cpuLoadAverage(Double cpuLoadAverage) {
        this.cpuLoadAverage = cpuLoadAverage;
        return this;
    }

    /**
     * The 1-minute CPU Load Average
     *
     * @return cpuLoadAverage
     **/
    @ApiModelProperty(value = "The 1-minute CPU Load Average")
    public Double getCpuLoadAverage() {
        return cpuLoadAverage;
    }

    public void setCpuLoadAverage(Double cpuLoadAverage) {
        this.cpuLoadAverage = cpuLoadAverage;
    }

    public JVMSystemDiagnosticsSnapshotDTO physicalMemoryBytes(Long physicalMemoryBytes) {
        this.physicalMemoryBytes = physicalMemoryBytes;
        return this;
    }

    /**
     * The number of bytes of RAM available on the system
     *
     * @return physicalMemoryBytes
     **/
    @ApiModelProperty(value = "The number of bytes of RAM available on the system")
    public Long getPhysicalMemoryBytes() {
        return physicalMemoryBytes;
    }

    public void setPhysicalMemoryBytes(Long physicalMemoryBytes) {
        this.physicalMemoryBytes = physicalMemoryBytes;
    }

    public JVMSystemDiagnosticsSnapshotDTO physicalMemory(String physicalMemory) {
        this.physicalMemory = physicalMemory;
        return this;
    }

    /**
     * The number of bytes of RAM available on the system as a human-readable value
     *
     * @return physicalMemory
     **/
    @ApiModelProperty(value = "The number of bytes of RAM available on the system as a human-readable value")
    public String getPhysicalMemory() {
        return physicalMemory;
    }

    public void setPhysicalMemory(String physicalMemory) {
        this.physicalMemory = physicalMemory;
    }

    public JVMSystemDiagnosticsSnapshotDTO openFileDescriptors(Long openFileDescriptors) {
        this.openFileDescriptors = openFileDescriptors;
        return this;
    }

    /**
     * The number of files that are open by the NiFi process
     *
     * @return openFileDescriptors
     **/
    @ApiModelProperty(value = "The number of files that are open by the NiFi process")
    public Long getOpenFileDescriptors() {
        return openFileDescriptors;
    }

    public void setOpenFileDescriptors(Long openFileDescriptors) {
        this.openFileDescriptors = openFileDescriptors;
    }

    public JVMSystemDiagnosticsSnapshotDTO maxOpenFileDescriptors(Long maxOpenFileDescriptors) {
        this.maxOpenFileDescriptors = maxOpenFileDescriptors;
        return this;
    }

    /**
     * The maximum number of open file descriptors that are available to each process
     *
     * @return maxOpenFileDescriptors
     **/
    @ApiModelProperty(value = "The maximum number of open file descriptors that are available to each process")
    public Long getMaxOpenFileDescriptors() {
        return maxOpenFileDescriptors;
    }

    public void setMaxOpenFileDescriptors(Long maxOpenFileDescriptors) {
        this.maxOpenFileDescriptors = maxOpenFileDescriptors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JVMSystemDiagnosticsSnapshotDTO jvMSystemDiagnosticsSnapshotDTO = (JVMSystemDiagnosticsSnapshotDTO) o;
        return Objects.equals(this.flowFileRepositoryStorageUsage, jvMSystemDiagnosticsSnapshotDTO.flowFileRepositoryStorageUsage) &&
                Objects.equals(this.contentRepositoryStorageUsage, jvMSystemDiagnosticsSnapshotDTO.contentRepositoryStorageUsage) &&
                Objects.equals(this.provenanceRepositoryStorageUsage, jvMSystemDiagnosticsSnapshotDTO.provenanceRepositoryStorageUsage) &&
                Objects.equals(this.maxHeapBytes, jvMSystemDiagnosticsSnapshotDTO.maxHeapBytes) &&
                Objects.equals(this.maxHeap, jvMSystemDiagnosticsSnapshotDTO.maxHeap) &&
                Objects.equals(this.garbageCollectionDiagnostics, jvMSystemDiagnosticsSnapshotDTO.garbageCollectionDiagnostics) &&
                Objects.equals(this.cpuCores, jvMSystemDiagnosticsSnapshotDTO.cpuCores) &&
                Objects.equals(this.cpuLoadAverage, jvMSystemDiagnosticsSnapshotDTO.cpuLoadAverage) &&
                Objects.equals(this.physicalMemoryBytes, jvMSystemDiagnosticsSnapshotDTO.physicalMemoryBytes) &&
                Objects.equals(this.physicalMemory, jvMSystemDiagnosticsSnapshotDTO.physicalMemory) &&
                Objects.equals(this.openFileDescriptors, jvMSystemDiagnosticsSnapshotDTO.openFileDescriptors) &&
                Objects.equals(this.maxOpenFileDescriptors, jvMSystemDiagnosticsSnapshotDTO.maxOpenFileDescriptors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowFileRepositoryStorageUsage, contentRepositoryStorageUsage, provenanceRepositoryStorageUsage, maxHeapBytes, maxHeap, garbageCollectionDiagnostics, cpuCores, cpuLoadAverage, physicalMemoryBytes, physicalMemory, openFileDescriptors, maxOpenFileDescriptors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JVMSystemDiagnosticsSnapshotDTO {\n");

        sb.append("    flowFileRepositoryStorageUsage: ").append(toIndentedString(flowFileRepositoryStorageUsage)).append("\n");
        sb.append("    contentRepositoryStorageUsage: ").append(toIndentedString(contentRepositoryStorageUsage)).append("\n");
        sb.append("    provenanceRepositoryStorageUsage: ").append(toIndentedString(provenanceRepositoryStorageUsage)).append("\n");
        sb.append("    maxHeapBytes: ").append(toIndentedString(maxHeapBytes)).append("\n");
        sb.append("    maxHeap: ").append(toIndentedString(maxHeap)).append("\n");
        sb.append("    garbageCollectionDiagnostics: ").append(toIndentedString(garbageCollectionDiagnostics)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    cpuLoadAverage: ").append(toIndentedString(cpuLoadAverage)).append("\n");
        sb.append("    physicalMemoryBytes: ").append(toIndentedString(physicalMemoryBytes)).append("\n");
        sb.append("    physicalMemory: ").append(toIndentedString(physicalMemory)).append("\n");
        sb.append("    openFileDescriptors: ").append(toIndentedString(openFileDescriptors)).append("\n");
        sb.append("    maxOpenFileDescriptors: ").append(toIndentedString(maxOpenFileDescriptors)).append("\n");
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

