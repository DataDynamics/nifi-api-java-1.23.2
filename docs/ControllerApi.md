# ControllerApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulletin**](ControllerApi.md#createBulletin) | **POST** /controller/bulletin | Creates a new bulletin
[**createControllerService**](ControllerApi.md#createControllerService) | **POST** /controller/controller-services | Creates a new controller service
[**createFlowRegistryClient**](ControllerApi.md#createFlowRegistryClient) | **POST** /controller/registry-clients | Creates a new flow registry client
[**createParameterProvider**](ControllerApi.md#createParameterProvider) | **POST** /controller/parameter-providers | Creates a new parameter provider
[**createReportingTask**](ControllerApi.md#createReportingTask) | **POST** /controller/reporting-tasks | Creates a new reporting task
[**deleteFlowRegistryClient**](ControllerApi.md#deleteFlowRegistryClient) | **DELETE** /controller/registry-clients/{id} | Deletes a flow registry client
[**deleteHistory**](ControllerApi.md#deleteHistory) | **DELETE** /controller/history | Purges history
[**deleteNode**](ControllerApi.md#deleteNode) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
[**getCluster**](ControllerApi.md#getCluster) | **GET** /controller/cluster | Gets the contents of the cluster
[**getControllerConfig**](ControllerApi.md#getControllerConfig) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
[**getFlowRegistryClient**](ControllerApi.md#getFlowRegistryClient) | **GET** /controller/registry-clients/{id} | Gets a flow registry client
[**getFlowRegistryClients**](ControllerApi.md#getFlowRegistryClients) | **GET** /controller/registry-clients | Gets the listing of available flow registry clients
[**getNode**](ControllerApi.md#getNode) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
[**getNodeStatusHistory**](ControllerApi.md#getNodeStatusHistory) | **GET** /controller/status/history | Gets status history for the node
[**getPropertyDescriptor**](ControllerApi.md#getPropertyDescriptor) | **GET** /controller/registry-clients/{id}/descriptors | Gets a flow registry client property descriptor
[**getRegistryClientTypes**](ControllerApi.md#getRegistryClientTypes) | **GET** /controller/registry-types | Retrieves the types of flow  that this NiFi supports
[**updateControllerConfig**](ControllerApi.md#updateControllerConfig) | **PUT** /controller/config | Retrieves the configuration for this NiFi
[**updateFlowRegistryClient**](ControllerApi.md#updateFlowRegistryClient) | **PUT** /controller/registry-clients/{id} | Updates a flow registry client
[**updateNode**](ControllerApi.md#updateNode) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster


<a name="createBulletin"></a>
# **createBulletin**
> BulletinEntity createBulletin(body)

Creates a new bulletin



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
BulletinEntity body = new BulletinEntity(); // BulletinEntity | The reporting task configuration details.
try {
    BulletinEntity result = apiInstance.createBulletin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createBulletin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulletinEntity**](BulletinEntity.md)| The reporting task configuration details. |

### Return type

[**BulletinEntity**](BulletinEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createControllerService"></a>
# **createControllerService**
> ControllerServiceEntity createControllerService(body)

Creates a new controller service



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
try {
    ControllerServiceEntity result = apiInstance.createControllerService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFlowRegistryClient"></a>
# **createFlowRegistryClient**
> FlowRegistryClientEntity createFlowRegistryClient(body)

Creates a new flow registry client



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
FlowRegistryClientEntity body = new FlowRegistryClientEntity(); // FlowRegistryClientEntity | The flow registry client configuration details.
try {
    FlowRegistryClientEntity result = apiInstance.createFlowRegistryClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createFlowRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)| The flow registry client configuration details. |

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createParameterProvider"></a>
# **createParameterProvider**
> ParameterProviderEntity createParameterProvider(body)

Creates a new parameter provider



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
ParameterProviderEntity body = new ParameterProviderEntity(); // ParameterProviderEntity | The parameter provider configuration details.
try {
    ParameterProviderEntity result = apiInstance.createParameterProvider(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createParameterProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterProviderEntity**](ParameterProviderEntity.md)| The parameter provider configuration details. |

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReportingTask"></a>
# **createReportingTask**
> ReportingTaskEntity createReportingTask(body)

Creates a new reporting task



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
try {
    ReportingTaskEntity result = apiInstance.createReportingTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#createReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFlowRegistryClient"></a>
# **deleteFlowRegistryClient**
> FlowRegistryClientEntity deleteFlowRegistryClient(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a flow registry client



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The flow registry client id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    FlowRegistryClientEntity result = apiInstance.deleteFlowRegistryClient(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteFlowRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The flow registry client id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteHistory"></a>
# **deleteHistory**
> HistoryEntity deleteHistory(endDate)

Purges history



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String endDate = "endDate_example"; // String | Purge actions before this date/time.
try {
    HistoryEntity result = apiInstance.deleteHistory(endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **String**| Purge actions before this date/time. |

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> NodeEntity deleteNode(id)

Removes a node from the cluster



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
try {
    NodeEntity result = apiInstance.deleteNode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getCluster"></a>
# **getCluster**
> ClusterEntity getCluster()

Gets the contents of the cluster

Returns the contents of the cluster including all nodes and their status.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
try {
    ClusterEntity result = apiInstance.getCluster();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getCluster");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterEntity**](ClusterEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getControllerConfig"></a>
# **getControllerConfig**
> ControllerConfigurationEntity getControllerConfig()

Retrieves the configuration for this NiFi Controller



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
try {
    ControllerConfigurationEntity result = apiInstance.getControllerConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getControllerConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getFlowRegistryClient"></a>
# **getFlowRegistryClient**
> FlowRegistryClientEntity getFlowRegistryClient(id)

Gets a flow registry client



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The flow registry client id.
try {
    FlowRegistryClientEntity result = apiInstance.getFlowRegistryClient(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getFlowRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The flow registry client id. |

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getFlowRegistryClients"></a>
# **getFlowRegistryClients**
> FlowRegistryClientsEntity getFlowRegistryClients()

Gets the listing of available flow registry clients



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
try {
    FlowRegistryClientsEntity result = apiInstance.getFlowRegistryClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getFlowRegistryClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientsEntity**](FlowRegistryClientsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> NodeEntity getNode(id)

Gets a node in the cluster



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
try {
    NodeEntity result = apiInstance.getNode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getNodeStatusHistory"></a>
# **getNodeStatusHistory**
> ComponentHistoryEntity getNodeStatusHistory()

Gets status history for the node

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
try {
    ComponentHistoryEntity result = apiInstance.getNodeStatusHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getNodeStatusHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ComponentHistoryEntity**](ComponentHistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName, sensitive)

Gets a flow registry client property descriptor



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The flow registry client id.
String propertyName = "propertyName_example"; // String | The property name.
Boolean sensitive = false; // Boolean | Property Descriptor requested sensitive status
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName, sensitive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The flow registry client id. |
 **propertyName** | **String**| The property name. |
 **sensitive** | **Boolean**| Property Descriptor requested sensitive status | [optional] [default to false]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getRegistryClientTypes"></a>
# **getRegistryClientTypes**
> FlowRegistryClientTypesEntity getRegistryClientTypes()

Retrieves the types of flow  that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
try {
    FlowRegistryClientTypesEntity result = apiInstance.getRegistryClientTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#getRegistryClientTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientTypesEntity**](FlowRegistryClientTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateControllerConfig"></a>
# **updateControllerConfig**
> ControllerConfigurationEntity updateControllerConfig(body)

Retrieves the configuration for this NiFi



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
ControllerConfigurationEntity body = new ControllerConfigurationEntity(); // ControllerConfigurationEntity | The controller configuration.
try {
    ControllerConfigurationEntity result = apiInstance.updateControllerConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateControllerConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)| The controller configuration. |

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFlowRegistryClient"></a>
# **updateFlowRegistryClient**
> FlowRegistryClientEntity updateFlowRegistryClient(id, body)

Updates a flow registry client



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The flow registry client id.
FlowRegistryClientEntity body = new FlowRegistryClientEntity(); // FlowRegistryClientEntity | The flow registry client configuration details.
try {
    FlowRegistryClientEntity result = apiInstance.updateFlowRegistryClient(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateFlowRegistryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The flow registry client id. |
 **body** | [**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)| The flow registry client configuration details. |

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNode"></a>
# **updateNode**
> NodeEntity updateNode(id, body)

Updates a node in the cluster



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.ControllerApi;


ControllerApi apiInstance = new ControllerApi();
String id = "id_example"; // String | The node id.
NodeEntity body = new NodeEntity(); // NodeEntity | The node configuration. The only configuration that will be honored at this endpoint is the status.
try {
    NodeEntity result = apiInstance.updateNode(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControllerApi#updateNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The node id. |
 **body** | [**NodeEntity**](NodeEntity.md)| The node configuration. The only configuration that will be honored at this endpoint is the status. |

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

