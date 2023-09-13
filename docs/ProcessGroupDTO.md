
# ProcessGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**name** | **String** | The name of the process group. |  [optional]
**comments** | **String** | The comments for the process group. |  [optional]
**variables** | **Map&lt;String, String&gt;** | The variables that are configured for the Process Group. Note that this map contains only those variables that are defined on this Process Group and not any variables that are defined in the parent Process Group, etc. I.e., this Map will not contain all variables that are accessible by components in this Process Group by rather only the variables that are defined for this Process Group itself. |  [optional]
**versionControlInformation** | [**VersionControlInformationDTO**](VersionControlInformationDTO.md) | The Version Control information that indicates which Flow Registry, and where in the Flow Registry, this Process Group is tracking to; or null if this Process Group is not under version control |  [optional]
**parameterContext** | [**ParameterContextReferenceEntity**](ParameterContextReferenceEntity.md) | The Parameter Context that this Process Group is bound to. |  [optional]
**flowfileConcurrency** | [**FlowfileConcurrencyEnum**](#FlowfileConcurrencyEnum) | The FlowFile Concurrency for this Process Group. |  [optional]
**flowfileOutboundPolicy** | [**FlowfileOutboundPolicyEnum**](#FlowfileOutboundPolicyEnum) | The Outbound Policy that is used for determining how FlowFiles should be transferred out of the Process Group. |  [optional]
**defaultFlowFileExpiration** | **String** | The default FlowFile Expiration for this Process Group. |  [optional]
**defaultBackPressureObjectThreshold** | **Long** | Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied. |  [optional]
**defaultBackPressureDataSizeThreshold** | **String** | Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied. |  [optional]
**logFileSuffix** | **String** | The log file suffix for this Process Group for dedicated logging. |  [optional]
**runningCount** | **Integer** | The number of running components in this process group. |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the process group. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the process group. |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the process group. |  [optional]
**activeRemotePortCount** | **Integer** | The number of active remote ports in the process group. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports in the process group. |  [optional]
**upToDateCount** | **Integer** | The number of up to date versioned process groups in the process group. |  [optional]
**locallyModifiedCount** | **Integer** | The number of locally modified versioned process groups in the process group. |  [optional]
**staleCount** | **Integer** | The number of stale versioned process groups in the process group. |  [optional]
**locallyModifiedAndStaleCount** | **Integer** | The number of locally modified and stale versioned process groups in the process group. |  [optional]
**syncFailureCount** | **Integer** | The number of versioned process groups in the process group that are unable to sync to a registry. |  [optional]
**localInputPortCount** | **Integer** | The number of local input ports in the process group. |  [optional]
**localOutputPortCount** | **Integer** | The number of local output ports in the process group. |  [optional]
**publicInputPortCount** | **Integer** | The number of public input ports in the process group. |  [optional]
**publicOutputPortCount** | **Integer** | The number of public output ports in the process group. |  [optional]
**contents** | [**FlowSnippetDTO**](FlowSnippetDTO.md) | The contents of this process group. |  [optional]
**inputPortCount** | **Integer** | The number of input ports in the process group. |  [optional]
**outputPortCount** | **Integer** | The number of output ports in the process group. |  [optional]


<a name="FlowfileConcurrencyEnum"></a>
## Enum: FlowfileConcurrencyEnum
Name | Value
---- | -----
UNBOUNDED | &quot;UNBOUNDED&quot;
SINGLE_FLOWFILE_PER_NODE | &quot;SINGLE_FLOWFILE_PER_NODE&quot;
SINGLE_BATCH_PER_NODE | &quot;SINGLE_BATCH_PER_NODE&quot;


<a name="FlowfileOutboundPolicyEnum"></a>
## Enum: FlowfileOutboundPolicyEnum
Name | Value
---- | -----
STREAM_WHEN_AVAILABLE | &quot;STREAM_WHEN_AVAILABLE&quot;
BATCH_OUTPUT | &quot;BATCH_OUTPUT&quot;



