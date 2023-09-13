# SnippetsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnippet**](SnippetsApi.md#createSnippet) | **POST** /snippets | Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
[**deleteSnippet**](SnippetsApi.md#deleteSnippet) | **DELETE** /snippets/{id} | Deletes the components in a snippet and discards the snippet
[**updateSnippet**](SnippetsApi.md#updateSnippet) | **PUT** /snippets/{id} | Move&#39;s the components in this Snippet into a new Process Group and discards the snippet


<a name="createSnippet"></a>
# **createSnippet**
> SnippetEntity createSnippet(body)

Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.SnippetsApi;


SnippetsApi apiInstance = new SnippetsApi();
SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
try {
    SnippetEntity result = apiInstance.createSnippet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#createSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnippet"></a>
# **deleteSnippet**
> SnippetEntity deleteSnippet(id, disconnectedNodeAcknowledged)

Deletes the components in a snippet and discards the snippet



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.SnippetsApi;


SnippetsApi apiInstance = new SnippetsApi();
String id = "id_example"; // String | The snippet id.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    SnippetEntity result = apiInstance.deleteSnippet(id, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#deleteSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The snippet id. |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateSnippet"></a>
# **updateSnippet**
> SnippetEntity updateSnippet(id, body)

Move&#39;s the components in this Snippet into a new Process Group and discards the snippet



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.SnippetsApi;


SnippetsApi apiInstance = new SnippetsApi();
String id = "id_example"; // String | The snippet id.
SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
try {
    SnippetEntity result = apiInstance.updateSnippet(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#updateSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The snippet id. |
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

