
# UpdateControllerServiceReferenceRequestEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the Controller Service. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The new state of the references for the controller service. |  [optional]
**referencingComponentRevisions** | [**Map&lt;String, RevisionDTO&gt;**](RevisionDTO.md) | The revisions for all referencing components. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**uiOnly** | **Boolean** | Indicates whether or not the response should only include fields necessary for rendering the NiFi User Interface. As such, when this value is set to true, some fields may be returned as null values, and the selected fields may change at any time without notice. As a result, this value should not be set to true by any client other than the UI. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;



