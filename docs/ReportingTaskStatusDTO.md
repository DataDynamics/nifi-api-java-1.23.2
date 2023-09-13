
# ReportingTaskStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runStatus** | [**RunStatusEnum**](#RunStatusEnum) | The run status of this ReportingTask |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid) |  [optional]
**activeThreadCount** | **Integer** | The number of active threads for the component. |  [optional]


<a name="RunStatusEnum"></a>
## Enum: RunStatusEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;


<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;



