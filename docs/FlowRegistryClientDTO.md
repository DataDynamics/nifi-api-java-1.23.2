
# FlowRegistryClientDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The registry identifier |  [optional]
**name** | **String** | The registry name |  [optional]
**description** | **String** | The registry description |  [optional]
**uri** | **String** |  |  [optional]
**type** | **String** | The type of the controller service. |  [optional]
**bundle** | [**BundleDTO**](BundleDTO.md) | The details of the artifact that bundled this processor type. |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the controller service. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the controller service properties. |  [optional]
**sensitiveDynamicPropertyNames** | **List&lt;String&gt;** | Set of sensitive dynamic property names |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether the reporting task supports sensitive dynamic properties. |  [optional]
**restricted** | **Boolean** | Whether the reporting task requires elevated privileges. |  [optional]
**deprecated** | **Boolean** | Whether the reporting task has been deprecated. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the Processor is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Processor is valid) |  [optional]
**annotationData** | **String** | The annotation data for the repoting task. This is how the custom UI relays configuration to the reporting task. |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the flow registry client has multiple versions available. |  [optional]


<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;



