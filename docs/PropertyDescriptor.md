
# PropertyDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the property key | 
**displayName** | **String** | The display name of the property key, if different from the name |  [optional]
**description** | **String** | The description of what the property does |  [optional]
**allowableValues** | [**List&lt;PropertyAllowableValue&gt;**](PropertyAllowableValue.md) | A list of the allowable values for the property |  [optional]
**defaultValue** | **String** | The default value if a user-set value is not specified |  [optional]
**required** | **Boolean** | Whether or not  the property is required for the component |  [optional]
**sensitive** | **Boolean** | Whether or not  the value of the property is considered sensitive (e.g., passwords and keys) |  [optional]
**expressionLanguageScope** | [**ExpressionLanguageScopeEnum**](#ExpressionLanguageScopeEnum) | The scope of expression language supported by this property |  [optional]
**expressionLanguageScopeDescription** | **String** | The description of the expression language scope supported by this property |  [optional]
**typeProvidedByValue** | [**DefinedType**](DefinedType.md) | Indicates that this property is for selecting a controller service of the specified type |  [optional]
**validRegex** | **String** | A regular expression that can be used to validate the value of this property |  [optional]
**validator** | **String** | Name of the validator used for this property descriptor |  [optional]
**dynamic** | **Boolean** | Whether or not the descriptor is for a dynamically added property |  [optional]
**resourceDefinition** | [**PropertyResourceDefinition**](PropertyResourceDefinition.md) | Indicates that this property references external resources |  [optional]
**dependencies** | [**List&lt;PropertyDependency&gt;**](PropertyDependency.md) | The dependencies that this property has on other properties |  [optional]


<a name="ExpressionLanguageScopeEnum"></a>
## Enum: ExpressionLanguageScopeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
VARIABLE_REGISTRY | &quot;VARIABLE_REGISTRY&quot;
FLOWFILE_ATTRIBUTES | &quot;FLOWFILE_ATTRIBUTES&quot;



