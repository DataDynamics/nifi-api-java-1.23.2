# InputPortsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInputPort**](InputPortsApi.md#getInputPort) | **GET** /input-ports/{id} | Gets an input port
[**removeInputPort**](InputPortsApi.md#removeInputPort) | **DELETE** /input-ports/{id} | Deletes an input port
[**updateInputPort**](InputPortsApi.md#updateInputPort) | **PUT** /input-ports/{id} | Updates an input port
[**updateRunStatus**](InputPortsApi.md#updateRunStatus) | **PUT** /input-ports/{id}/run-status | Updates run status of an input-port


<a name="getInputPort"></a>
# **getInputPort**
> PortEntity getInputPort(id)

Gets an input port



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.InputPortsApi;


InputPortsApi apiInstance = new InputPortsApi();
String id = "id_example"; // String | The input port id.
try {
    PortEntity result = apiInstance.getInputPort(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#getInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeInputPort"></a>
# **removeInputPort**
> PortEntity removeInputPort(id, version, clientId, disconnectedNodeAcknowledged)

Deletes an input port



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.InputPortsApi;


InputPortsApi apiInstance = new InputPortsApi();
String id = "id_example"; // String | The input port id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    PortEntity result = apiInstance.removeInputPort(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#removeInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateInputPort"></a>
# **updateInputPort**
> PortEntity updateInputPort(id, body)

Updates an input port



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.InputPortsApi;


InputPortsApi apiInstance = new InputPortsApi();
String id = "id_example"; // String | The input port id.
PortEntity body = new PortEntity(); // PortEntity | The input port configuration details.
try {
    PortEntity result = apiInstance.updateInputPort(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#updateInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ProcessorEntity updateRunStatus(id, body)

Updates run status of an input-port



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.InputPortsApi;


InputPortsApi apiInstance = new InputPortsApi();
String id = "id_example"; // String | The port id.
PortRunStatusEntity body = new PortRunStatusEntity(); // PortRunStatusEntity | The port run status.
try {
    ProcessorEntity result = apiInstance.updateRunStatus(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The port id. |
 **body** | [**PortRunStatusEntity**](PortRunStatusEntity.md)| The port run status. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

