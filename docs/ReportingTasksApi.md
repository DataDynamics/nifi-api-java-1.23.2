# ReportingTasksApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeConfiguration**](ReportingTasksApi.md#analyzeConfiguration) | **POST** /reporting-tasks/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
[**clearState**](ReportingTasksApi.md#clearState) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task
[**deleteVerificationRequest**](ReportingTasksApi.md#deleteVerificationRequest) | **DELETE** /reporting-tasks/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**getPropertyDescriptor**](ReportingTasksApi.md#getPropertyDescriptor) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor
[**getReportingTask**](ReportingTasksApi.md#getReportingTask) | **GET** /reporting-tasks/{id} | Gets a reporting task
[**getState**](ReportingTasksApi.md#getState) | **GET** /reporting-tasks/{id}/state | Gets the state for a reporting task
[**getVerificationRequest**](ReportingTasksApi.md#getVerificationRequest) | **GET** /reporting-tasks/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**removeReportingTask**](ReportingTasksApi.md#removeReportingTask) | **DELETE** /reporting-tasks/{id} | Deletes a reporting task
[**submitConfigVerificationRequest**](ReportingTasksApi.md#submitConfigVerificationRequest) | **POST** /reporting-tasks/{id}/config/verification-requests | Performs verification of the Reporting Task&#39;s configuration
[**updateReportingTask**](ReportingTasksApi.md#updateReportingTask) | **PUT** /reporting-tasks/{id} | Updates a reporting task
[**updateRunStatus**](ReportingTasksApi.md#updateRunStatus) | **PUT** /reporting-tasks/{id}/run-status | Updates run status of a reporting task


<a name="analyzeConfiguration"></a>
# **analyzeConfiguration**
> ConfigurationAnalysisEntity analyzeConfiguration(id, body)

Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
ConfigurationAnalysisEntity body = new ConfigurationAnalysisEntity(); // ConfigurationAnalysisEntity | The configuration analysis request.
try {
    ConfigurationAnalysisEntity result = apiInstance.analyzeConfiguration(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#analyzeConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The configuration analysis request. |

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

Clears the state for a reporting task



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateEntity result = apiInstance.clearState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#clearState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

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
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The ID of the Reporting Task
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.deleteVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#deleteVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Reporting Task |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName, sensitive)

Gets a reporting task property descriptor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
String propertyName = "propertyName_example"; // String | The property name.
Boolean sensitive = false; // Boolean | Property Descriptor requested sensitive status
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName, sensitive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **propertyName** | **String**| The property name. |
 **sensitive** | **Boolean**| Property Descriptor requested sensitive status | [optional] [default to false]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getReportingTask"></a>
# **getReportingTask**
> ReportingTaskEntity getReportingTask(id)

Gets a reporting task



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ReportingTaskEntity result = apiInstance.getReportingTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateEntity getState(id)

Gets the state for a reporting task



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateEntity result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

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
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The ID of the Reporting Task
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.getVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Reporting Task |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeReportingTask"></a>
# **removeReportingTask**
> ReportingTaskEntity removeReportingTask(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a reporting task



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ReportingTaskEntity result = apiInstance.removeReportingTask(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#removeReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="submitConfigVerificationRequest"></a>
# **submitConfigVerificationRequest**
> VerifyConfigRequestEntity submitConfigVerificationRequest(id, body)

Performs verification of the Reporting Task&#39;s configuration

This will initiate the process of verifying a given Reporting Task configuration. This may be a long-running task. As a result, this endpoint will immediately return a ReportingTaskConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /reporting-tasks/{taskId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /reporting-tasks/{serviceId}/verification-requests/{requestId}.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
VerifyConfigRequestEntity body = new VerifyConfigRequestEntity(); // VerifyConfigRequestEntity | The reporting task configuration verification request.
try {
    VerifyConfigRequestEntity result = apiInstance.submitConfigVerificationRequest(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#submitConfigVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The reporting task configuration verification request. |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReportingTask"></a>
# **updateReportingTask**
> ReportingTaskEntity updateReportingTask(id, body)

Updates a reporting task



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
try {
    ReportingTaskEntity result = apiInstance.updateReportingTask(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#updateReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ReportingTaskEntity updateRunStatus(id, body)

Updates run status of a reporting task



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
ReportingTaskRunStatusEntity body = new ReportingTaskRunStatusEntity(); // ReportingTaskRunStatusEntity | The reporting task run status.
try {
    ReportingTaskEntity result = apiInstance.updateRunStatus(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **body** | [**ReportingTaskRunStatusEntity**](ReportingTaskRunStatusEntity.md)| The reporting task run status. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

