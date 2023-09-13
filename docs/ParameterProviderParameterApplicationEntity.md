
# ParameterProviderParameterApplicationEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the parameter provider. |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) | The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**parameterGroupConfigurations** | [**List&lt;ParameterGroupConfigurationEntity&gt;**](ParameterGroupConfigurationEntity.md) | Configuration for the fetched Parameter Groups |  [optional]



