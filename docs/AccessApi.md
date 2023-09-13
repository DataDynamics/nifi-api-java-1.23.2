# AccessApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessToken**](AccessApi.md#createAccessToken) | **POST** /access/token | Creates a token for accessing the REST API via username/password
[**createAccessTokenFromTicket**](AccessApi.md#createAccessTokenFromTicket) | **POST** /access/kerberos | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
[**getAccessStatus**](AccessApi.md#getAccessStatus) | **GET** /access | Gets the status the client&#39;s access
[**getAccessTokenExpiration**](AccessApi.md#getAccessTokenExpiration) | **GET** /access/token/expiration | Get expiration for current Access Token
[**getLoginConfig**](AccessApi.md#getLoginConfig) | **GET** /access/config | Retrieves the access configuration for this NiFi
[**knoxCallback**](AccessApi.md#knoxCallback) | **GET** /access/knox/callback | Redirect/callback URI for processing the result of the Apache Knox login sequence.
[**knoxLogout**](AccessApi.md#knoxLogout) | **GET** /access/knox/logout | Performs a logout in the Apache Knox.
[**knoxRequest**](AccessApi.md#knoxRequest) | **GET** /access/knox/request | Initiates a request to authenticate through Apache Knox.
[**logOut**](AccessApi.md#logOut) | **DELETE** /access/logout | Performs a logout for other providers that have been issued a JWT.
[**logOutComplete**](AccessApi.md#logOutComplete) | **GET** /access/logout/complete | Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.


<a name="createAccessToken"></a>
# **createAccessToken**
> String createAccessToken(username, password)

Creates a token for accessing the REST API via username/password

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. It is stored in the browser as a cookie, but also returned inthe response body to be stored/used by third party client scripts.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    String result = apiInstance.createAccessToken(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  | [optional]
 **password** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="createAccessTokenFromTicket"></a>
# **createAccessTokenFromTicket**
> String createAccessTokenFromTicket()

Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;. It is also stored in the browser as a cookie.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createAccessTokenFromTicket();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessTokenFromTicket");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

<a name="getAccessStatus"></a>
# **getAccessStatus**
> AccessStatusEntity getAccessStatus()

Gets the status the client&#39;s access

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    AccessStatusEntity result = apiInstance.getAccessStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getAccessStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessStatusEntity**](AccessStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="getAccessTokenExpiration"></a>
# **getAccessTokenExpiration**
> AccessTokenExpirationEntity getAccessTokenExpiration()

Get expiration for current Access Token

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    AccessTokenExpirationEntity result = apiInstance.getAccessTokenExpiration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getAccessTokenExpiration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessTokenExpirationEntity**](AccessTokenExpirationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoginConfig"></a>
# **getLoginConfig**
> AccessConfigurationEntity getLoginConfig()

Retrieves the access configuration for this NiFi



### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    AccessConfigurationEntity result = apiInstance.getLoginConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getLoginConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessConfigurationEntity**](AccessConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="knoxCallback"></a>
# **knoxCallback**
> knoxCallback()

Redirect/callback URI for processing the result of the Apache Knox login sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="knoxLogout"></a>
# **knoxLogout**
> knoxLogout()

Performs a logout in the Apache Knox.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="knoxRequest"></a>
# **knoxRequest**
> knoxRequest()

Initiates a request to authenticate through Apache Knox.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.knoxRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#knoxRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="logOut"></a>
# **logOut**
> logOut()

Performs a logout for other providers that have been issued a JWT.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.logOut();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#logOut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="logOutComplete"></a>
# **logOutComplete**
> logOutComplete()

Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.api.ApiException;
//import io.datadynamics.nifi.api.api.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.logOutComplete();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#logOutComplete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

