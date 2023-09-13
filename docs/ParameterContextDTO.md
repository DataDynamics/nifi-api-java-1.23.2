
# ParameterContextDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of the Parameter Context. |  [optional]
**description** | **String** | The Description of the Parameter Context. |  [optional]
**parameters** | [**List&lt;ParameterEntity&gt;**](ParameterEntity.md) | The Parameters for the Parameter Context |  [optional]
**boundProcessGroups** | [**List&lt;ProcessGroupEntity&gt;**](ProcessGroupEntity.md) | The Process Groups that are bound to this Parameter Context |  [optional]
**inheritedParameterContexts** | [**List&lt;ParameterContextReferenceEntity&gt;**](ParameterContextReferenceEntity.md) | A list of references of Parameter Contexts from which this one inherits parameters |  [optional]
**parameterProviderConfiguration** | [**ParameterProviderConfigurationEntity**](ParameterProviderConfigurationEntity.md) | Optional configuration for a Parameter Provider |  [optional]
**id** | **String** | The ID the Parameter Context. |  [optional]



