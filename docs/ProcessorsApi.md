# ProcessorsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeConfiguration**](ProcessorsApi.md#analyzeConfiguration) | **POST** /processors/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
[**clearState**](ProcessorsApi.md#clearState) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
[**deleteProcessor**](ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id} | Deletes a processor
[**deleteVerificationRequest**](ProcessorsApi.md#deleteVerificationRequest) | **DELETE** /processors/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**getProcessor**](ProcessorsApi.md#getProcessor) | **GET** /processors/{id} | Gets a processor
[**getProcessorDiagnostics**](ProcessorsApi.md#getProcessorDiagnostics) | **GET** /processors/{id}/diagnostics | Gets diagnostics information about a processor
[**getProcessorRunStatusDetails**](ProcessorsApi.md#getProcessorRunStatusDetails) | **POST** /processors/run-status-details/queries | Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
[**getPropertyDescriptor**](ProcessorsApi.md#getPropertyDescriptor) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
[**getState**](ProcessorsApi.md#getState) | **GET** /processors/{id}/state | Gets the state for a processor
[**getVerificationRequest**](ProcessorsApi.md#getVerificationRequest) | **GET** /processors/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**submitProcessorVerificationRequest**](ProcessorsApi.md#submitProcessorVerificationRequest) | **POST** /processors/{id}/config/verification-requests | Performs verification of the Processor&#39;s configuration
[**terminateProcessor**](ProcessorsApi.md#terminateProcessor) | **DELETE** /processors/{id}/threads | Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
[**updateProcessor**](ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id} | Updates a processor
[**updateRunStatus**](ProcessorsApi.md#updateRunStatus) | **PUT** /processors/{id}/run-status | Updates run status of a processor


<a name="analyzeConfiguration"></a>
# **analyzeConfiguration**
> ConfigurationAnalysisEntity analyzeConfiguration(id, body)

Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
ConfigurationAnalysisEntity body = new ConfigurationAnalysisEntity(); // ConfigurationAnalysisEntity | The processor configuration analysis request.
try {
    ConfigurationAnalysisEntity result = apiInstance.analyzeConfiguration(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#analyzeConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The processor configuration analysis request. |

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearState"></a>
# **clearState**
> ComponentStateEntity clearState(id)

Clears the state for a processor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.clearState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#clearState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteProcessor"></a>
# **deleteProcessor**
> ProcessorEntity deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a processor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ProcessorEntity result = apiInstance.deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteVerificationRequest"></a>
# **deleteVerificationRequest**
> VerifyConfigRequestEntity deleteVerificationRequest(id, requestId)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The ID of the Processor
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.deleteVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Processor |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessor"></a>
# **getProcessor**
> ProcessorEntity getProcessor(id)

Gets a processor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.getProcessor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessorDiagnostics"></a>
# **getProcessorDiagnostics**
> ProcessorEntity getProcessorDiagnostics(id)

Gets diagnostics information about a processor

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.getProcessorDiagnostics(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessorDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getProcessorRunStatusDetails"></a>
# **getProcessorRunStatusDetails**
> ProcessorsRunStatusDetailsEntity getProcessorRunStatusDetails(body)

Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
RunStatusDetailsRequestEntity body = new RunStatusDetailsRequestEntity(); // RunStatusDetailsRequestEntity | The request for the processors that should be included in the results
try {
    ProcessorsRunStatusDetailsEntity result = apiInstance.getProcessorRunStatusDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessorRunStatusDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunStatusDetailsRequestEntity**](RunStatusDetailsRequestEntity.md)| The request for the processors that should be included in the results | [optional]

### Return type

[**ProcessorsRunStatusDetailsEntity**](ProcessorsRunStatusDetailsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName, clientId, sensitive)

Gets the descriptor for a processor property



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String propertyName = "propertyName_example"; // String | The property name.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean sensitive = false; // Boolean | Property Descriptor requested sensitive status
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName, clientId, sensitive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **propertyName** | **String**| The property name. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **sensitive** | **Boolean**| Property Descriptor requested sensitive status | [optional] [default to false]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateEntity getState(id)

Gets the state for a processor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getVerificationRequest"></a>
# **getVerificationRequest**
> VerifyConfigRequestEntity getVerificationRequest(id, requestId)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The ID of the Processor
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.getVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Processor |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="submitProcessorVerificationRequest"></a>
# **submitProcessorVerificationRequest**
> VerifyConfigRequestEntity submitProcessorVerificationRequest(id, body)

Performs verification of the Processor&#39;s configuration

This will initiate the process of verifying a given Processor configuration. This may be a long-running task. As a result, this endpoint will immediately return a ProcessorConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /processors/{processorId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /processors/{processorId}/verification-requests/{requestId}.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
VerifyConfigRequestEntity body = new VerifyConfigRequestEntity(); // VerifyConfigRequestEntity | The processor configuration verification request.
try {
    VerifyConfigRequestEntity result = apiInstance.submitProcessorVerificationRequest(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#submitProcessorVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The processor configuration verification request. |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="terminateProcessor"></a>
# **terminateProcessor**
> ProcessorEntity terminateProcessor(id)

Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.terminateProcessor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#terminateProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateProcessor"></a>
# **updateProcessor**
> ProcessorEntity updateProcessor(id, body)

Updates a processor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
try {
    ProcessorEntity result = apiInstance.updateProcessor(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#updateProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ProcessorEntity updateRunStatus(id, body)

Updates run status of a processor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
ProcessorRunStatusEntity body = new ProcessorRunStatusEntity(); // ProcessorRunStatusEntity | The processor run status.
try {
    ProcessorEntity result = apiInstance.updateRunStatus(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **body** | [**ProcessorRunStatusEntity**](ProcessorRunStatusEntity.md)| The processor run status. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

