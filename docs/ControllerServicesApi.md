# ControllerServicesApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeConfiguration**](ControllerServicesApi.md#analyzeConfiguration) | **POST** /controller-services/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
[**clearState**](ControllerServicesApi.md#clearState) | **POST** /controller-services/{id}/state/clear-requests | Clears the state for a controller service
[**deleteVerificationRequest**](ControllerServicesApi.md#deleteVerificationRequest) | **DELETE** /controller-services/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**getControllerService**](ControllerServicesApi.md#getControllerService) | **GET** /controller-services/{id} | Gets a controller service
[**getControllerServiceReferences**](ControllerServicesApi.md#getControllerServiceReferences) | **GET** /controller-services/{id}/references | Gets a controller service
[**getPropertyDescriptor**](ControllerServicesApi.md#getPropertyDescriptor) | **GET** /controller-services/{id}/descriptors | Gets a controller service property descriptor
[**getState**](ControllerServicesApi.md#getState) | **GET** /controller-services/{id}/state | Gets the state for a controller service
[**getVerificationRequest**](ControllerServicesApi.md#getVerificationRequest) | **GET** /controller-services/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**removeControllerService**](ControllerServicesApi.md#removeControllerService) | **DELETE** /controller-services/{id} | Deletes a controller service
[**submitConfigVerificationRequest**](ControllerServicesApi.md#submitConfigVerificationRequest) | **POST** /controller-services/{id}/config/verification-requests | Performs verification of the Controller Service&#39;s configuration
[**updateControllerService**](ControllerServicesApi.md#updateControllerService) | **PUT** /controller-services/{id} | Updates a controller service
[**updateControllerServiceReferences**](ControllerServicesApi.md#updateControllerServiceReferences) | **PUT** /controller-services/{id}/references | Updates a controller services references
[**updateRunStatus**](ControllerServicesApi.md#updateRunStatus) | **PUT** /controller-services/{id}/run-status | Updates run status of a controller service


<a name="analyzeConfiguration"></a>
# **analyzeConfiguration**
> ConfigurationAnalysisEntity analyzeConfiguration(id, body)

Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
ConfigurationAnalysisEntity body = new ConfigurationAnalysisEntity(); // ConfigurationAnalysisEntity | The configuration analysis request.
try {
    ConfigurationAnalysisEntity result = apiInstance.analyzeConfiguration(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#analyzeConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
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

Clears the state for a controller service



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
try {
    ComponentStateEntity result = apiInstance.clearState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#clearState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |

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
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The ID of the Controller Service
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.deleteVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#deleteVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Controller Service |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerService"></a>
# **getControllerService**
> ControllerServiceEntity getControllerService(id, uiOnly)

Gets a controller service

If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
Boolean uiOnly = false; // Boolean | 
try {
    ControllerServiceEntity result = apiInstance.getControllerService(id, uiOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#getControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
 **uiOnly** | **Boolean**|  | [optional] [default to false]

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerServiceReferences"></a>
# **getControllerServiceReferences**
> ControllerServiceReferencingComponentsEntity getControllerServiceReferences(id)

Gets a controller service



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
try {
    ControllerServiceReferencingComponentsEntity result = apiInstance.getControllerServiceReferences(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#getControllerServiceReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |

### Return type

[**ControllerServiceReferencingComponentsEntity**](ControllerServiceReferencingComponentsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName, sensitive)

Gets a controller service property descriptor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
String propertyName = "propertyName_example"; // String | The property name to return the descriptor for.
Boolean sensitive = false; // Boolean | Property Descriptor requested sensitive status
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName, sensitive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
 **propertyName** | **String**| The property name to return the descriptor for. |
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

Gets the state for a controller service



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
try {
    ComponentStateEntity result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |

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
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The ID of the Controller Service
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.getVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#getVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Controller Service |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeControllerService"></a>
# **removeControllerService**
> ControllerServiceEntity removeControllerService(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a controller service



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ControllerServiceEntity result = apiInstance.removeControllerService(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#removeControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="submitConfigVerificationRequest"></a>
# **submitConfigVerificationRequest**
> VerifyConfigRequestEntity submitConfigVerificationRequest(id, body)

Performs verification of the Controller Service&#39;s configuration

This will initiate the process of verifying a given Controller Service configuration. This may be a long-running task. As a result, this endpoint will immediately return a ControllerServiceConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /controller-services/{serviceId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /controller-services/{serviceId}/verification-requests/{requestId}.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
VerifyConfigRequestEntity body = new VerifyConfigRequestEntity(); // VerifyConfigRequestEntity | The controller service configuration verification request.
try {
    VerifyConfigRequestEntity result = apiInstance.submitConfigVerificationRequest(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#submitConfigVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The controller service configuration verification request. |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateControllerService"></a>
# **updateControllerService**
> ControllerServiceEntity updateControllerService(id, body)

Updates a controller service



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
try {
    ControllerServiceEntity result = apiInstance.updateControllerService(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#updateControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateControllerServiceReferences"></a>
# **updateControllerServiceReferences**
> ControllerServiceReferencingComponentsEntity updateControllerServiceReferences(id, body)

Updates a controller services references



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
UpdateControllerServiceReferenceRequestEntity body = new UpdateControllerServiceReferenceRequestEntity(); // UpdateControllerServiceReferenceRequestEntity | The controller service request update request.
try {
    ControllerServiceReferencingComponentsEntity result = apiInstance.updateControllerServiceReferences(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#updateControllerServiceReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
 **body** | [**UpdateControllerServiceReferenceRequestEntity**](UpdateControllerServiceReferenceRequestEntity.md)| The controller service request update request. |

### Return type

[**ControllerServiceReferencingComponentsEntity**](ControllerServiceReferencingComponentsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ControllerServiceEntity updateRunStatus(id, body)

Updates run status of a controller service



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerServicesApi;


ControllerServicesApi apiInstance = new ControllerServicesApi();
String id = "id_example"; // String | The controller service id.
ControllerServiceRunStatusEntity body = new ControllerServiceRunStatusEntity(); // ControllerServiceRunStatusEntity | The controller service run status.
try {
    ControllerServiceEntity result = apiInstance.updateRunStatus(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerServicesApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The controller service id. |
 **body** | [**ControllerServiceRunStatusEntity**](ControllerServiceRunStatusEntity.md)| The controller service run status. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

