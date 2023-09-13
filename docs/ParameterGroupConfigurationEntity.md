
# ParameterGroupConfigurationEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupName** | **String** | The name of the external parameter group to which the provided parameter names apply. |  [optional]
**parameterContextName** | **String** | The name of the ParameterContext that receives the parameters in this group |  [optional]
**parameterSensitivities** | [**Map&lt;String, InnerEnum&gt;**](#Map&lt;String, InnerEnum&gt;) | All fetched parameter names that should be applied. |  [optional]
**_synchronized** | **Boolean** | True if this group should be synchronized to a ParameterContext, including creating one if it does not exist. |  [optional]


<a name="Map<String, InnerEnum>"></a>
## Enum: Map&lt;String, InnerEnum&gt;
Name | Value
---- | -----
SENSITIVE | &quot;SENSITIVE&quot;
NON_SENSITIVE | &quot;NON_SENSITIVE&quot;



