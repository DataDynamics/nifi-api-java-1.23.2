
# ScheduleComponentsEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the ProcessGroup |  [optional]
**state** | [**StateEnum**](#StateEnum) | The desired state of the descendant components |  [optional]
**components** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | Optional components to schedule. If not specified, all authorized descendant components will be used. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;



