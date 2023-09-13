
# ProcessGroupReplaceRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The unique ID of this request. |  [optional]
**processGroupId** | **String** | The unique ID of the Process Group being updated |  [optional]
**uri** | **String** | The URI for future requests to this drop request. |  [optional]
**lastUpdated** | **String** | The last time this request was updated. |  [optional]
**complete** | **Boolean** | Whether or not this request has completed |  [optional]
**failureReason** | **String** | An explanation of why this request failed, or null if this request has not failed |  [optional]
**percentCompleted** | **Integer** | The percentage complete for the request, between 0 and 100 |  [optional]
**state** | **String** | The state of the request |  [optional]



