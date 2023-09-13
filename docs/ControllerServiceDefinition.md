
# ControllerServiceDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **String** | The group name of the bundle that provides the referenced type. |  [optional]
**artifact** | **String** | The artifact name of the bundle that provides the referenced type. |  [optional]
**version** | **String** | The version of the bundle that provides the referenced type. |  [optional]
**type** | **String** | The fully-qualified class type | 
**typeDescription** | **String** | The description of the type. |  [optional]
**buildInfo** | [**BuildInfo**](BuildInfo.md) | The build metadata for this component |  [optional]
**providedApiImplementations** | [**List&lt;DefinedType&gt;**](DefinedType.md) | If this type represents a provider for an interface, this lists the APIs it implements |  [optional]
**tags** | **List&lt;String&gt;** | The tags associated with this type |  [optional]
**seeAlso** | **List&lt;String&gt;** | The names of other component types that may be related |  [optional]
**deprecated** | **Boolean** | Whether or not the component has been deprecated |  [optional]
**deprecationReason** | **String** | If this component has been deprecated, this optional field can be used to provide an explanation |  [optional]
**deprecationAlternatives** | **List&lt;String&gt;** | If this component has been deprecated, this optional field provides alternatives to use |  [optional]
**restricted** | **Boolean** | Whether or not the component has a general restriction |  [optional]
**restrictedExplanation** | **String** | An optional description of the general restriction |  [optional]
**explicitRestrictions** | [**List&lt;Restriction&gt;**](Restriction.md) | Explicit restrictions that indicate a require permission to use the component |  [optional]
**stateful** | [**Stateful**](Stateful.md) | Indicates if the component stores state |  [optional]
**systemResourceConsiderations** | [**List&lt;SystemResourceConsideration&gt;**](SystemResourceConsideration.md) | The system resource considerations for the given component |  [optional]
**additionalDetails** | **Boolean** | Indicates if the component has additional details documentation |  [optional]
**propertyDescriptors** | [**Map&lt;String, PropertyDescriptor&gt;**](PropertyDescriptor.md) | Descriptions of configuration properties applicable to this component. |  [optional]
**supportsDynamicProperties** | **Boolean** | Whether or not this component makes use of dynamic (user-set) properties. |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether or not this component makes use of sensitive dynamic (user-set) properties. |  [optional]
**dynamicProperties** | [**List&lt;DynamicProperty&gt;**](DynamicProperty.md) | Describes the dynamic properties supported by this component |  [optional]



