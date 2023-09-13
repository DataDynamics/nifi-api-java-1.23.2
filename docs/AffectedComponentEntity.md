
# AffectedComponentEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) | The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) | The permissions for this component. |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**component** | [**AffectedComponentDTO**](AffectedComponentDTO.md) |  |  [optional]
**processGroup** | [**ProcessGroupNameDTO**](ProcessGroupNameDTO.md) | The Process Group that the component belongs to |  [optional]
**referenceType** | [**ReferenceTypeEnum**](#ReferenceTypeEnum) | The type of component referenced |  [optional]


<a name="ReferenceTypeEnum"></a>
## Enum: ReferenceTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;



