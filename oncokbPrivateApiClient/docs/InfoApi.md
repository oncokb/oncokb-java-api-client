# InfoApi

All URIs are relative to *https://localhost:8080/oncokb-curate/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infoGetUsingGET**](InfoApi.md#infoGetUsingGET) | **GET** /info | infoGet


<a name="infoGetUsingGET"></a>
# **infoGetUsingGET**
> OncoKBInfo infoGetUsingGET()

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

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

InfoApi apiInstance = new InfoApi();
try {
    OncoKBInfo result = apiInstance.infoGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#infoGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OncoKBInfo**](OncoKBInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

