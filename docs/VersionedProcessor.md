
# VersionedProcessor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#39;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The component&#39;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**Position**](Position.md) | The component&#39;s position on the graph |  [optional]
**type** | **String** | The type of the extension component |  [optional]
**bundle** | [**Bundle**](Bundle.md) | Information about the bundle from which the component came |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties for the component. Properties whose value is not set will only contain the property name. |  [optional]
**propertyDescriptors** | [**Map&lt;String, VersionedPropertyDescriptor&gt;**](VersionedPropertyDescriptor.md) | The property descriptors for the component. |  [optional]
**style** | **Map&lt;String, String&gt;** | Stylistic data for rendering in a UI |  [optional]
**annotationData** | **String** | The annotation data for the processor used to relay configuration between a custom UI and the procesosr. |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | Indicates whether the processor should be scheduled to run in event or timer driven mode. |  [optional]
**executionNode** | **String** | Indicates the node where the process will execute. |  [optional]
**penaltyDuration** | **String** | The amout of time that is used when the process penalizes a flowfile. |  [optional]
**yieldDuration** | **String** | The amount of time that must elapse before this processor is scheduled again after yielding. |  [optional]
**bulletinLevel** | **String** | The level at which the processor will report bulletins. |  [optional]
**runDurationMillis** | **Long** | The run duration for the processor in milliseconds. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#39;t allow parallol processing then any positive input will be ignored. |  [optional]
**autoTerminatedRelationships** | **List&lt;String&gt;** | The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#39;isAutoTerminate&#39; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. |  [optional]
**scheduledState** | [**ScheduledStateEnum**](#ScheduledStateEnum) | The scheduled state of the component |  [optional]
**retryCount** | **Integer** | Overall number of retries. |  [optional]
**retriedRelationships** | **List&lt;String&gt;** | All the relationships should be retried. |  [optional]
**backoffMechanism** | [**BackoffMechanismEnum**](#BackoffMechanismEnum) | Determines whether the FlowFile should be penalized or the processor should be yielded between retries. |  [optional]
**maxBackoffPeriod** | **String** | Maximum amount of time to be waited during a retry period. |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]


<a name="ScheduledStateEnum"></a>
## Enum: ScheduledStateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
RUNNING | &quot;RUNNING&quot;


<a name="BackoffMechanismEnum"></a>
## Enum: BackoffMechanismEnum
Name | Value
---- | -----
PENALIZE_FLOWFILE | &quot;PENALIZE_FLOWFILE&quot;
YIELD_PROCESSOR | &quot;YIELD_PROCESSOR&quot;


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



