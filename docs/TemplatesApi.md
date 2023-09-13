# TemplatesApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportTemplate**](TemplatesApi.md#exportTemplate) | **GET** /templates/{id}/download | Exports a template
[**removeTemplate**](TemplatesApi.md#removeTemplate) | **DELETE** /templates/{id} | Deletes a template


<a name="exportTemplate"></a>
# **exportTemplate**
> String exportTemplate(id)

Exports a template



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.TemplatesApi;


TemplatesApi apiInstance = new TemplatesApi();
String id = "id_example"; // String | The template id.
try {
    String result = apiInstance.exportTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#exportTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The template id. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml

<a name="removeTemplate"></a>
# **removeTemplate**
> TemplateEntity removeTemplate(id, disconnectedNodeAcknowledged)

Deletes a template



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.TemplatesApi;


TemplatesApi apiInstance = new TemplatesApi();
String id = "id_example"; // String | The template id.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    TemplateEntity result = apiInstance.removeTemplate(id, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#removeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The template id. |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

