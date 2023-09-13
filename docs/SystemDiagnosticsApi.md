# SystemDiagnosticsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJmxMetrics**](SystemDiagnosticsApi.md#getJmxMetrics) | **GET** /system-diagnostics/jmx-metrics | Retrieve available JMX metrics
[**getSystemDiagnostics**](SystemDiagnosticsApi.md#getSystemDiagnostics) | **GET** /system-diagnostics | Gets the diagnostics for the system NiFi is running on


<a name="getJmxMetrics"></a>
# **getJmxMetrics**
> JmxMetricsResultsEntity getJmxMetrics(beanNameFilter)

Retrieve available JMX metrics

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemDiagnosticsApi;


SystemDiagnosticsApi apiInstance = new SystemDiagnosticsApi();
String beanNameFilter = "beanNameFilter_example"; // String | Regular Expression Pattern to be applied against the ObjectName
try {
    JmxMetricsResultsEntity result = apiInstance.getJmxMetrics(beanNameFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemDiagnosticsApi#getJmxMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beanNameFilter** | **String**| Regular Expression Pattern to be applied against the ObjectName | [optional]

### Return type

[**JmxMetricsResultsEntity**](JmxMetricsResultsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSystemDiagnostics"></a>
# **getSystemDiagnostics**
> SystemDiagnosticsEntity getSystemDiagnostics(nodewise, clusterNodeId)

Gets the diagnostics for the system NiFi is running on



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemDiagnosticsApi;


SystemDiagnosticsApi apiInstance = new SystemDiagnosticsApi();
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    SystemDiagnosticsEntity result = apiInstance.getSystemDiagnostics(nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemDiagnosticsApi#getSystemDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**SystemDiagnosticsEntity**](SystemDiagnosticsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

