
# ControllerServiceEntity

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
**parentGroupId** | **String** | The id of parent process group of this ControllerService. |  [optional]
**component** | [**ControllerServiceDTO**](ControllerServiceDTO.md) |  |  [optional]
**operatePermissions** | [**PermissionsDTO**](PermissionsDTO.md) | The permissions for this component operations. |  [optional]
**status** | [**ControllerServiceStatusDTO**](ControllerServiceStatusDTO.md) | The status for this ControllerService. |  [optional]



