# RemoteProcessGroupsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRemoteProcessGroup**](RemoteProcessGroupsApi.md#getRemoteProcessGroup) | **GET** /remote-process-groups/{id} | Gets a remote process group
[**getState**](RemoteProcessGroupsApi.md#getState) | **GET** /remote-process-groups/{id}/state | Gets the state for a RemoteProcessGroup
[**removeRemoteProcessGroup**](RemoteProcessGroupsApi.md#removeRemoteProcessGroup) | **DELETE** /remote-process-groups/{id} | Deletes a remote process group
[**updateRemoteProcessGroup**](RemoteProcessGroupsApi.md#updateRemoteProcessGroup) | **PUT** /remote-process-groups/{id} | Updates a remote process group
[**updateRemoteProcessGroupInputPort**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPort) | **PUT** /remote-process-groups/{id}/input-ports/{port-id} | Updates a remote port
[**updateRemoteProcessGroupInputPortRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPortRunStatus) | **PUT** /remote-process-groups/{id}/input-ports/{port-id}/run-status | Updates run status of a remote port
[**updateRemoteProcessGroupOutputPort**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPort) | **PUT** /remote-process-groups/{id}/output-ports/{port-id} | Updates a remote port
[**updateRemoteProcessGroupOutputPortRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPortRunStatus) | **PUT** /remote-process-groups/{id}/output-ports/{port-id}/run-status | Updates run status of a remote port
[**updateRemoteProcessGroupRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupRunStatus) | **PUT** /remote-process-groups/{id}/run-status | Updates run status of a remote process group
[**updateRemoteProcessGroupRunStatuses**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupRunStatuses) | **PUT** /remote-process-groups/process-group/{id}/run-status | Updates run status of all remote process groups in a process group (recursively)


<a name="getRemoteProcessGroup"></a>
# **getRemoteProcessGroup**
> RemoteProcessGroupEntity getRemoteProcessGroup(id)

Gets a remote process group



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
try {
    RemoteProcessGroupEntity result = apiInstance.getRemoteProcessGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#getRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateEntity getState(id)

Gets the state for a RemoteProcessGroup



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#getState");
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

<a name="removeRemoteProcessGroup"></a>
# **removeRemoteProcessGroup**
> RemoteProcessGroupEntity removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a remote process group



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    RemoteProcessGroupEntity result = apiInstance.removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#removeRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateRemoteProcessGroup"></a>
# **updateRemoteProcessGroup**
> RemoteProcessGroupEntity updateRemoteProcessGroup(id, body)

Updates a remote process group



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
RemoteProcessGroupEntity body = new RemoteProcessGroupEntity(); // RemoteProcessGroupEntity | The remote process group.
try {
    RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **body** | [**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)| The remote process group. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupInputPort"></a>
# **updateRemoteProcessGroupInputPort**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPort(id, portId, body)

Updates a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
RemoteProcessGroupPortEntity body = new RemoteProcessGroupPortEntity(); // RemoteProcessGroupPortEntity | The remote process group port.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupInputPort(id, portId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupInputPortRunStatus"></a>
# **updateRemoteProcessGroupInputPortRunStatus**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPortRunStatus(id, portId, body)

Updates run status of a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group port.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupInputPortRunStatus(id, portId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupInputPortRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupOutputPort"></a>
# **updateRemoteProcessGroupOutputPort**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPort(id, portId, body)

Updates a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
RemoteProcessGroupPortEntity body = new RemoteProcessGroupPortEntity(); // RemoteProcessGroupPortEntity | The remote process group port.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupOutputPort(id, portId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupOutputPortRunStatus"></a>
# **updateRemoteProcessGroupOutputPortRunStatus**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPortRunStatus(id, portId, body)

Updates run status of a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group port.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupOutputPortRunStatus(id, portId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupOutputPortRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupRunStatus"></a>
# **updateRemoteProcessGroupRunStatus**
> RemoteProcessGroupEntity updateRemoteProcessGroupRunStatus(id, body)

Updates run status of a remote process group



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group run status.
try {
    RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroupRunStatus(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group run status. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupRunStatuses"></a>
# **updateRemoteProcessGroupRunStatuses**
> RemoteProcessGroupEntity updateRemoteProcessGroupRunStatuses(id, body)

Updates run status of all remote process groups in a process group (recursively)



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The process group id.
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process groups run status.
try {
    RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroupRunStatuses(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupRunStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process groups run status. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

