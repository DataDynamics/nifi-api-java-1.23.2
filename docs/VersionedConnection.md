
# VersionedConnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#39;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The component&#39;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**Position**](Position.md) | The component&#39;s position on the graph |  [optional]
**source** | [**ConnectableComponent**](ConnectableComponent.md) | The source of the connection. |  [optional]
**destination** | [**ConnectableComponent**](ConnectableComponent.md) | The destination of the connection. |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**zIndex** | **Long** | The z index of the connection. |  [optional]
**selectedRelationships** | **List&lt;String&gt;** | The selected relationship that comprise the connection. |  [optional]
**backPressureObjectThreshold** | **Long** | The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**backPressureDataSizeThreshold** | **String** | The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**flowFileExpiration** | **String** | The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it. |  [optional]
**prioritizers** | **List&lt;String&gt;** | The comparators used to prioritize the queue. |  [optional]
**bends** | [**List&lt;Position&gt;**](Position.md) | The bend points on the connection. |  [optional]
**loadBalanceStrategy** | [**LoadBalanceStrategyEnum**](#LoadBalanceStrategyEnum) | The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified. |  [optional]
**partitioningAttribute** | **String** | The attribute to use for partitioning data as it is load balanced across the cluster. If the Load Balance Strategy is configured to use PARTITION_BY_ATTRIBUTE, the value returned by this method is the name of the FlowFile Attribute that will be used to determine which node in the cluster should receive a given FlowFile. If the Load Balance Strategy is unset or is set to any other value, the Partitioning Attribute has no effect. |  [optional]
**loadBalanceCompression** | [**LoadBalanceCompressionEnum**](#LoadBalanceCompressionEnum) | Whether or not compression should be used when transferring FlowFiles between nodes |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]


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


<a name="ComponentTypeEnum"></a>
## Enum: ComponentTypeEnum
Name | Value
---- | -----
CONNECTION | &quot;CONNECTION&quot;
PROCESSOR | &quot;PROCESSOR&quot;
PROCESS_GROUP | &quot;PROCESS_GROUP&quot;
REMOTE_PROCESS_GROUP | &quot;REMOTE_PROCESS_GROUP&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
LABEL | &quot;LABEL&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;
PARAMETER_CONTEXT | &quot;PARAMETER_CONTEXT&quot;
PARAMETER_PROVIDER | &quot;PARAMETER_PROVIDER&quot;
TEMPLATE | &quot;TEMPLATE&quot;
FLOW_REGISTRY_CLIENT | &quot;FLOW_REGISTRY_CLIENT&quot;



