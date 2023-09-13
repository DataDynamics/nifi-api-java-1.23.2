
# ParameterContextUpdateEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameterContextRevision** | [**RevisionDTO**](RevisionDTO.md) | The Revision of the Parameter Context |  [optional]
**parameterContext** | [**ParameterContextDTO**](ParameterContextDTO.md) | The Parameter Context that is being operated on. This may not be populated until the request has successfully completed. |  [optional]
**referencingComponents** | [**List&lt;AffectedComponentEntity&gt;**](AffectedComponentEntity.md) | The components that are referenced by the update. |  [optional]



