
# ConnectionStatisticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the connection |  [optional]
**statsLastRefreshed** | **String** | The timestamp of when the stats were last refreshed |  [optional]
**aggregateSnapshot** | [**ConnectionStatisticsSnapshotDTO**](ConnectionStatisticsSnapshotDTO.md) | The status snapshot that represents the aggregate stats of the cluster |  [optional]
**nodeSnapshots** | [**List&lt;NodeConnectionStatisticsSnapshotDTO&gt;**](NodeConnectionStatisticsSnapshotDTO.md) | A list of status snapshots for each node |  [optional]



