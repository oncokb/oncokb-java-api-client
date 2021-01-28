# InfoApi

All URIs are relative to *https://localhost:8080/oncokb-curate/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infoGetUsingGET1**](InfoApi.md#infoGetUsingGET1) | **GET** /info | infoGet


<a name="infoGetUsingGET1"></a>
# **infoGetUsingGET1**
> OncoKBInfo infoGetUsingGET1()

infoGet

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.InfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

InfoApi apiInstance = new InfoApi();
try {
    OncoKBInfo result = apiInstance.infoGetUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#infoGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OncoKBInfo**](OncoKBInfo.md)

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

