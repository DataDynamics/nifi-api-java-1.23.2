# ParameterContextsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createParameterContext**](ParameterContextsApi.md#createParameterContext) | **POST** /parameter-contexts | Create a Parameter Context
[**deleteParameterContext**](ParameterContextsApi.md#deleteParameterContext) | **DELETE** /parameter-contexts/{id} | Deletes the Parameter Context with the given ID
[**deleteUpdateRequest**](ParameterContextsApi.md#deleteUpdateRequest) | **DELETE** /parameter-contexts/{contextId}/update-requests/{requestId} | Deletes the Update Request with the given ID
[**deleteValidationRequest**](ParameterContextsApi.md#deleteValidationRequest) | **DELETE** /parameter-contexts/{contextId}/validation-requests/{id} | Deletes the Validation Request with the given ID
[**getParameterContext**](ParameterContextsApi.md#getParameterContext) | **GET** /parameter-contexts/{id} | Returns the Parameter Context with the given ID
[**getParameterContextUpdate**](ParameterContextsApi.md#getParameterContextUpdate) | **GET** /parameter-contexts/{contextId}/update-requests/{requestId} | Returns the Update Request with the given ID
[**getValidationRequest**](ParameterContextsApi.md#getValidationRequest) | **GET** /parameter-contexts/{contextId}/validation-requests/{id} | Returns the Validation Request with the given ID
[**submitParameterContextUpdate**](ParameterContextsApi.md#submitParameterContextUpdate) | **POST** /parameter-contexts/{contextId}/update-requests | Initiate the Update Request of a Parameter Context
[**submitValidationRequest**](ParameterContextsApi.md#submitValidationRequest) | **POST** /parameter-contexts/{contextId}/validation-requests | Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated
[**updateParameterContext**](ParameterContextsApi.md#updateParameterContext) | **PUT** /parameter-contexts/{id} | Modifies a Parameter Context


<a name="createParameterContext"></a>
# **createParameterContext**
> ParameterContextEntity createParameterContext(body)

Create a Parameter Context



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
ParameterContextEntity body = new ParameterContextEntity(); // ParameterContextEntity | The Parameter Context.
try {
    ParameterContextEntity result = apiInstance.createParameterContext(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#createParameterContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterContextEntity**](ParameterContextEntity.md)| The Parameter Context. |

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteParameterContext"></a>
# **deleteParameterContext**
> ParameterContextEntity deleteParameterContext(id, version, clientId, disconnectedNodeAcknowledged)

Deletes the Parameter Context with the given ID

Deletes the Parameter Context with the given ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String id = "id_example"; // String | The Parameter Context ID.
String version = "version_example"; // String | The version is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ParameterContextEntity result = apiInstance.deleteParameterContext(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#deleteParameterContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Parameter Context ID. |
 **version** | **String**| The version is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteUpdateRequest"></a>
# **deleteUpdateRequest**
> ParameterContextUpdateRequestEntity deleteUpdateRequest(contextId, requestId, disconnectedNodeAcknowledged)

Deletes the Update Request with the given ID

Deletes the Update Request with the given ID. After a request is created via a POST to /nifi-api/parameter-contexts/update-requests, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String contextId = "contextId_example"; // String | The ID of the ParameterContext
String requestId = "requestId_example"; // String | The ID of the Update Request
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ParameterContextUpdateRequestEntity result = apiInstance.deleteUpdateRequest(contextId, requestId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#deleteUpdateRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextId** | **String**| The ID of the ParameterContext |
 **requestId** | **String**| The ID of the Update Request |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterContextUpdateRequestEntity**](ParameterContextUpdateRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteValidationRequest"></a>
# **deleteValidationRequest**
> ParameterContextValidationRequestEntity deleteValidationRequest(contextId, id, disconnectedNodeAcknowledged)

Deletes the Validation Request with the given ID

Deletes the Validation Request with the given ID. After a request is created via a POST to /nifi-api/validation-contexts, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the validation process has completed. If the request is deleted before the request completes, then the Validation request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String contextId = "contextId_example"; // String | The ID of the Parameter Context
String id = "id_example"; // String | The ID of the Update Request
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ParameterContextValidationRequestEntity result = apiInstance.deleteValidationRequest(contextId, id, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#deleteValidationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextId** | **String**| The ID of the Parameter Context |
 **id** | **String**| The ID of the Update Request |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getParameterContext"></a>
# **getParameterContext**
> ParameterContextEntity getParameterContext(id, includeInheritedParameters)

Returns the Parameter Context with the given ID

Returns the Parameter Context with the given ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String id = "id_example"; // String | The ID of the Parameter Context
Boolean includeInheritedParameters = false; // Boolean | Whether or not to include inherited parameters from other parameter contexts, and therefore also overridden values.  If true, the result will be the 'effective' parameter context.
try {
    ParameterContextEntity result = apiInstance.getParameterContext(id, includeInheritedParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#getParameterContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Parameter Context |
 **includeInheritedParameters** | **Boolean**| Whether or not to include inherited parameters from other parameter contexts, and therefore also overridden values.  If true, the result will be the &#39;effective&#39; parameter context. | [optional] [default to false]

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getParameterContextUpdate"></a>
# **getParameterContextUpdate**
> ParameterContextUpdateRequestEntity getParameterContextUpdate(contextId, requestId)

Returns the Update Request with the given ID

Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /nifi-api/parameter-contexts, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String contextId = "contextId_example"; // String | The ID of the Parameter Context
String requestId = "requestId_example"; // String | The ID of the Update Request
try {
    ParameterContextUpdateRequestEntity result = apiInstance.getParameterContextUpdate(contextId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#getParameterContextUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextId** | **String**| The ID of the Parameter Context |
 **requestId** | **String**| The ID of the Update Request |

### Return type

[**ParameterContextUpdateRequestEntity**](ParameterContextUpdateRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getValidationRequest"></a>
# **getValidationRequest**
> ParameterContextValidationRequestEntity getValidationRequest(contextId, id)

Returns the Validation Request with the given ID

Returns the Validation Request with the given ID. Once a Validation Request has been created by performing a POST to /nifi-api/validation-contexts, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String contextId = "contextId_example"; // String | The ID of the Parameter Context
String id = "id_example"; // String | The ID of the Validation Request
try {
    ParameterContextValidationRequestEntity result = apiInstance.getValidationRequest(contextId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#getValidationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextId** | **String**| The ID of the Parameter Context |
 **id** | **String**| The ID of the Validation Request |

### Return type

[**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="submitParameterContextUpdate"></a>
# **submitParameterContextUpdate**
> ParameterContextUpdateRequestEntity submitParameterContextUpdate(contextId, body)

Initiate the Update Request of a Parameter Context

This will initiate the process of updating a Parameter Context. Changing the value of a Parameter may require that one or more components be stopped and restarted, so this action may take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterContextUpdateRequestEntity, and the process of updating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-contexts/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-contexts/update-requests/{requestId}.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String contextId = "contextId_example"; // String | 
ParameterContextEntity body = new ParameterContextEntity(); // ParameterContextEntity | The updated version of the parameter context.
try {
    ParameterContextUpdateRequestEntity result = apiInstance.submitParameterContextUpdate(contextId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#submitParameterContextUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextId** | **String**|  |
 **body** | [**ParameterContextEntity**](ParameterContextEntity.md)| The updated version of the parameter context. |

### Return type

[**ParameterContextUpdateRequestEntity**](ParameterContextUpdateRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitValidationRequest"></a>
# **submitValidationRequest**
> ParameterContextValidationRequestEntity submitValidationRequest(contextId, body)

Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated

This will initiate the process of validating all components whose Process Group is bound to the specified Parameter Context. Performing validation against an arbitrary number of components may be expect and take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterContextValidationRequestEntity, and the process of validating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-contexts/validation-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-contexts/validation-requests/{requestId}.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String contextId = "contextId_example"; // String | 
ParameterContextValidationRequestEntity body = new ParameterContextValidationRequestEntity(); // ParameterContextValidationRequestEntity | The validation request
try {
    ParameterContextValidationRequestEntity result = apiInstance.submitValidationRequest(contextId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#submitValidationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextId** | **String**|  |
 **body** | [**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)| The validation request |

### Return type

[**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateParameterContext"></a>
# **updateParameterContext**
> ParameterContextEntity updateParameterContext(id, body)

Modifies a Parameter Context

This endpoint will update a Parameter Context to match the provided entity. However, this request will fail if any component is running and is referencing a Parameter in the Parameter Context. Generally, this endpoint is not called directly. Instead, an update request should be submitted by making a POST to the /parameter-contexts/update-requests endpoint. That endpoint will, in turn, call this endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParameterContextsApi;


ParameterContextsApi apiInstance = new ParameterContextsApi();
String id = "id_example"; // String | 
ParameterContextEntity body = new ParameterContextEntity(); // ParameterContextEntity | The updated Parameter Context
try {
    ParameterContextEntity result = apiInstance.updateParameterContext(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterContextsApi#updateParameterContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**ParameterContextEntity**](ParameterContextEntity.md)| The updated Parameter Context |

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

