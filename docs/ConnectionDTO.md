
# ConnectionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**source** | [**ConnectableDTO**](ConnectableDTO.md) | The source of the connection. |  [optional]
**destination** | [**ConnectableDTO**](ConnectableDTO.md) | The destination of the connection. |  [optional]
**name** | **String** | The name of the connection. |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**getzIndex** | **Long** | The z index of the connection. |  [optional]
**selectedRelationships** | **List&lt;String&gt;** | The selected relationship that comprise the connection. |  [optional]
**availableRelationships** | **List&lt;String&gt;** | The relationships that the source of the connection currently supports. |  [optional]
**backPressureObjectThreshold** | **Long** | The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**backPressureDataSizeThreshold** | **String** | The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**flowFileExpiration** | **String** | The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it. |  [optional]
**prioritizers** | **List&lt;String&gt;** | The comparators used to prioritize the queue. |  [optional]
**bends** | [**List&lt;PositionDTO&gt;**](PositionDTO.md) | The bend points on the connection. |  [optional]
**loadBalanceStrategy** | [**LoadBalanceStrategyEnum**](#LoadBalanceStrategyEnum) | How to load balance the data in this Connection across the nodes in the cluster. |  [optional]
**loadBalancePartitionAttribute** | **String** | The FlowFile Attribute to use for determining which node a FlowFile will go to if the Load Balancing Strategy is set to PARTITION_BY_ATTRIBUTE |  [optional]
**loadBalanceCompression** | [**LoadBalanceCompressionEnum**](#LoadBalanceCompressionEnum) | Whether or not data should be compressed when being transferred between nodes in the cluster. |  [optional]
**loadBalanceStatus** | [**LoadBalanceStatusEnum**](#LoadBalanceStatusEnum) | The current status of the Connection&#39;s Load Balancing Activities. Status can indicate that Load Balancing is not configured for the connection, that Load Balancing is configured but inactive (not currently transferring data to another node), or that Load Balancing is configured and actively transferring data to another node. |  [optional]


<a name="LoadBalanceStrategyEnum"></a>
## Enum: LoadBalanceStrategyEnum
Name | Value
---- | -----
DO_NOT_LOAD_BALANCE | &quot;DO_NOT_LOAD_BALANCE&quot;
PARTITION_BY_ATTRIBUTE | &quot;PARTITION_BY_ATTRIBUTE&quot;
ROUND_ROBIN | &quot;ROUND_ROBIN&quot;
SINGLE_NODE | &quot;SINGLE_NODE&quot;


<a name="LoadBalanceCompressionEnum"></a>
## Enum: LoadBalanceCompressionEnum
Name | Value
---- | -----
DO_NOT_COMPRESS | &quot;DO_NOT_COMPRESS&quot;
COMPRESS_ATTRIBUTES_ONLY | &quot;COMPRESS_ATTRIBUTES_ONLY&quot;
COMPRESS_ATTRIBUTES_AND_CONTENT | &quot;COMPRESS_ATTRIBUTES_AND_CONTENT&quot;


<a name="LoadBalanceStatusEnum"></a>
## Enum: LoadBalanceStatusEnum
Name | Value
---- | -----
NOT_CONFIGURED | &quot;LOAD_BALANCE_NOT_CONFIGURED&quot;
INACTIVE | &quot;LOAD_BALANCE_INACTIVE&quot;
ACTIVE | &quot;LOAD_BALANCE_ACTIVE&quot;



