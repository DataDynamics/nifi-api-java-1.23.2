
# JVMSystemDiagnosticsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flowFileRepositoryStorageUsage** | [**RepositoryUsageDTO**](RepositoryUsageDTO.md) | Information about the FlowFile Repository&#39;s usage |  [optional]
**contentRepositoryStorageUsage** | [**List&lt;RepositoryUsageDTO&gt;**](RepositoryUsageDTO.md) | Information about the Content Repository&#39;s usage |  [optional]
**provenanceRepositoryStorageUsage** | [**List&lt;RepositoryUsageDTO&gt;**](RepositoryUsageDTO.md) | Information about the Provenance Repository&#39;s usage |  [optional]
**maxHeapBytes** | **Long** | The maximum number of bytes that the JVM heap is configured to use for heap |  [optional]
**maxHeap** | **String** | The maximum number of bytes that the JVM heap is configured to use, as a human-readable value |  [optional]
**garbageCollectionDiagnostics** | [**List&lt;GarbageCollectionDiagnosticsDTO&gt;**](GarbageCollectionDiagnosticsDTO.md) | Diagnostic information about the JVM&#39;s garbage collections |  [optional]
**cpuCores** | **Integer** | The number of CPU Cores available on the system |  [optional]
**cpuLoadAverage** | **Double** | The 1-minute CPU Load Average |  [optional]
**physicalMemoryBytes** | **Long** | The number of bytes of RAM available on the system |  [optional]
**physicalMemory** | **String** | The number of bytes of RAM available on the system as a human-readable value |  [optional]
**openFileDescriptors** | **Long** | The number of files that are open by the NiFi process |  [optional]
**maxOpenFileDescriptors** | **Long** | The maximum number of open file descriptors that are available to each process |  [optional]



