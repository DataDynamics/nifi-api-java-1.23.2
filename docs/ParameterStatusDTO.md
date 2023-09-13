
# ParameterStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter** | [**ParameterEntity**](ParameterEntity.md) | The name of the Parameter |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the status of the parameter, compared to the existing parameter context |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
CHANGED | &quot;CHANGED&quot;
REMOVED | &quot;REMOVED&quot;
MISSING_BUT_REFERENCED | &quot;MISSING_BUT_REFERENCED&quot;
UNCHANGED | &quot;UNCHANGED&quot;



