# ClassificationApi

All URIs are relative to *https://localhost:8080/oncokb-curate/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**classificationVariantsGetUsingGET**](ClassificationApi.md#classificationVariantsGetUsingGET) | **GET** /classification/variants | classificationVariantsGet


<a name="classificationVariantsGetUsingGET"></a>
# **classificationVariantsGetUsingGET**
> List&lt;String&gt; classificationVariantsGetUsingGET()

classificationVariantsGet

Get All OncoKB Variant Classification.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.ClassificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ClassificationApi apiInstance = new ClassificationApi();
try {
    List<String> result = apiInstance.classificationVariantsGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationApi#classificationVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

