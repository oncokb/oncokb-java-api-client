# LevelsApi

All URIs are relative to *https://localhost:8080/oncokb-curate/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**levelsGetUsingGET1**](LevelsApi.md#levelsGetUsingGET1) | **GET** /levels | levelsGet
[**levelsResistanceGetUsingGET1**](LevelsApi.md#levelsResistanceGetUsingGET1) | **GET** /levels/resistance | levelsResistanceGet
[**levelsSensitiveGetUsingGET1**](LevelsApi.md#levelsSensitiveGetUsingGET1) | **GET** /levels/sensitive | levelsSensitiveGet


<a name="levelsGetUsingGET1"></a>
# **levelsGetUsingGET1**
> Object levelsGetUsingGET1()

levelsGet

Get all levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.LevelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="levelsResistanceGetUsingGET1"></a>
# **levelsResistanceGetUsingGET1**
> Object levelsResistanceGetUsingGET1()

levelsResistanceGet

Get all resistance levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.LevelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsResistanceGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsResistanceGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="levelsSensitiveGetUsingGET1"></a>
# **levelsSensitiveGetUsingGET1**
> Object levelsSensitiveGetUsingGET1()

levelsSensitiveGet

Get all sensitive levels.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.LevelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

LevelsApi apiInstance = new LevelsApi();
try {
    Object result = apiInstance.levelsSensitiveGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelsApi#levelsSensitiveGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

