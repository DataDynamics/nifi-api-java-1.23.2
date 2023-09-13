
# ConnectionDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection** | [**ConnectionDTO**](ConnectionDTO.md) | Details about the connection |  [optional]
**aggregateSnapshot** | [**ConnectionDiagnosticsSnapshotDTO**](ConnectionDiagnosticsSnapshotDTO.md) | Aggregate values for all nodes in the cluster, or for this instance if not clustered |  [optional]
**nodeSnapshots** | [**List&lt;ConnectionDiagnosticsSnapshotDTO&gt;**](ConnectionDiagnosticsSnapshotDTO.md) | A list of values for each node in the cluster, if clustered. |  [optional]



