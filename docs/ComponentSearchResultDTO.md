
# ComponentSearchResultDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component that matched the search. |  [optional]
**groupId** | **String** | The group id of the component that matched the search. |  [optional]
**parentGroup** | [**SearchResultGroupDTO**](SearchResultGroupDTO.md) | The parent group of the component that matched the search. |  [optional]
**versionedGroup** | [**SearchResultGroupDTO**](SearchResultGroupDTO.md) | The nearest versioned ancestor group of the component that matched the search. |  [optional]
**name** | **String** | The name of the component that matched the search. |  [optional]
**matches** | **List&lt;String&gt;** | What matched the search from the component. |  [optional]



