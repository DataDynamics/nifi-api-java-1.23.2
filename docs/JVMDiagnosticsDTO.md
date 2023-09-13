
# JVMDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clustered** | **Boolean** | Whether or not the NiFi instance is clustered |  [optional]
**connected** | **Boolean** | Whether or not the node is connected to the cluster |  [optional]
**aggregateSnapshot** | [**JVMDiagnosticsSnapshotDTO**](JVMDiagnosticsSnapshotDTO.md) | Aggregate JVM diagnostic information about the entire cluster |  [optional]
**nodeSnapshots** | [**List&lt;NodeJVMDiagnosticsSnapshotDTO&gt;**](NodeJVMDiagnosticsSnapshotDTO.md) | Node-wise breakdown of JVM diagnostic information |  [optional]



