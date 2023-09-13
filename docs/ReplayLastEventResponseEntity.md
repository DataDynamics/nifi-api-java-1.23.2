
# ReplayLastEventResponseEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentId** | **String** | The UUID of the component whose last event should be replayed. |  [optional]
**nodes** | [**NodesEnum**](#NodesEnum) | Which nodes were requested to replay their last provenance event. |  [optional]
**aggregateSnapshot** | [**ReplayLastEventSnapshotDTO**](ReplayLastEventSnapshotDTO.md) | The aggregate result of all nodes&#39; responses |  [optional]
**nodeSnapshots** | [**List&lt;NodeReplayLastEventSnapshotDTO&gt;**](NodeReplayLastEventSnapshotDTO.md) | The node-wise results |  [optional]


<a name="NodesEnum"></a>
## Enum: NodesEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
PRIMARY | &quot;PRIMARY&quot;



