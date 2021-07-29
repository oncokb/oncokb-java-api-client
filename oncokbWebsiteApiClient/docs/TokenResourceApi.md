# TokenResourceApi

All URIs are relative to *//www.oncokb.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenUsingPOST1**](TokenResourceApi.md#createTokenUsingPOST1) | **POST** /api/tokens | createToken
[**deleteTokenUsingDELETE1**](TokenResourceApi.md#deleteTokenUsingDELETE1) | **DELETE** /api/tokens/{id} | deleteToken
[**getAllTokensUsingGET**](TokenResourceApi.md#getAllTokensUsingGET) | **GET** /api/tokens | getAllTokens
[**getTokenUsingGET**](TokenResourceApi.md#getTokenUsingGET) | **GET** /api/tokens/{id} | getToken
[**updateTokenUsingPUT**](TokenResourceApi.md#updateTokenUsingPUT) | **PUT** /api/tokens | updateToken

<a name="createTokenUsingPOST1"></a>
# **createTokenUsingPOST1**
> Token createTokenUsingPOST1(body)

createToken

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.TokenResourceApi;


TokenResourceApi apiInstance = new TokenResourceApi();
Token body = new Token(); // Token | token
try {
    Token result = apiInstance.createTokenUsingPOST1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenResourceApi#createTokenUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Token**](Token.md)| token |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTokenUsingDELETE1"></a>
# **deleteTokenUsingDELETE1**
> deleteTokenUsingDELETE1(id)

deleteToken

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.TokenResourceApi;


TokenResourceApi apiInstance = new TokenResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteTokenUsingDELETE1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenResourceApi#deleteTokenUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllTokensUsingGET"></a>
# **getAllTokensUsingGET**
> List&lt;Token&gt; getAllTokensUsingGET()

getAllTokens

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.TokenResourceApi;


TokenResourceApi apiInstance = new TokenResourceApi();
try {
    List<Token> result = apiInstance.getAllTokensUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenResourceApi#getAllTokensUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Token&gt;**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTokenUsingGET"></a>
# **getTokenUsingGET**
> Token getTokenUsingGET(id)

getToken

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.TokenResourceApi;


TokenResourceApi apiInstance = new TokenResourceApi();
Long id = 789L; // Long | id
try {
    Token result = apiInstance.getTokenUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenResourceApi#getTokenUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateTokenUsingPUT"></a>
# **updateTokenUsingPUT**
> Token updateTokenUsingPUT(body)

updateToken

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.TokenResourceApi;


TokenResourceApi apiInstance = new TokenResourceApi();
Token body = new Token(); // Token | token
try {
    Token result = apiInstance.updateTokenUsingPUT(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenResourceApi#updateTokenUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Token**](Token.md)| token |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

