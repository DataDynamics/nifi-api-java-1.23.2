
# VersionedProcessGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#39;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The component&#39;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**Position**](Position.md) | The component&#39;s position on the graph |  [optional]
**processGroups** | [**List&lt;VersionedProcessGroup&gt;**](VersionedProcessGroup.md) | The child Process Groups |  [optional]
**remoteProcessGroups** | [**List&lt;VersionedRemoteProcessGroup&gt;**](VersionedRemoteProcessGroup.md) | The Remote Process Groups |  [optional]
**processors** | [**List&lt;VersionedProcessor&gt;**](VersionedProcessor.md) | The Processors |  [optional]
**inputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The Input Ports |  [optional]
**outputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The Output Ports |  [optional]
**connections** | [**List&lt;VersionedConnection&gt;**](VersionedConnection.md) | The Connections |  [optional]
**labels** | [**List&lt;VersionedLabel&gt;**](VersionedLabel.md) | The Labels |  [optional]
**funnels** | [**List&lt;VersionedFunnel&gt;**](VersionedFunnel.md) | The Funnels |  [optional]
**controllerServices** | [**List&lt;VersionedControllerService&gt;**](VersionedControllerService.md) | The Controller Services |  [optional]
**versionedFlowCoordinates** | [**VersionedFlowCoordinates**](VersionedFlowCoordinates.md) | The coordinates where the remote flow is stored, or null if the Process Group is not directly under Version Control |  [optional]
**variables** | **Map&lt;String, String&gt;** | The Variables in the Variable Registry for this Process Group (not including any ancestor or descendant Process Groups) |  [optional]
**parameterContextName** | **String** | The name of the parameter context used by this process group |  [optional]
**defaultFlowFileExpiration** | **String** | The default FlowFile Expiration for this Process Group. |  [optional]
**defaultBackPressureObjectThreshold** | **Long** | Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied. |  [optional]
**defaultBackPressureDataSizeThreshold** | **String** | Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied. |  [optional]
**logFileSuffix** | **String** | The log file suffix for this Process Group for dedicated logging. |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**flowFileConcurrency** | **String** | The configured FlowFile Concurrency for the Process Group |  [optional]
**flowFileOutboundPolicy** | **String** | The FlowFile Outbound Policy for the Process Group |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]


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



