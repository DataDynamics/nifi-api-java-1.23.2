
# ControllerConfigurationEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) | The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) | The permissions for this component. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**component** | [**ControllerConfigurationDTO**](ControllerConfigurationDTO.md) | The controller configuration. |  [optional]



