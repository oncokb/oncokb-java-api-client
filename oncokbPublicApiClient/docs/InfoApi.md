# InfoApi

All URIs are relative to *https://www.oncokb.org/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**infoGetUsingGET1**](InfoApi.md#infoGetUsingGET1) | **GET** /info | infoGet |


<a id="infoGetUsingGET1"></a>
# **infoGetUsingGET1**
> OncoKBInfo infoGetUsingGET1()

infoGet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    InfoApi apiInstance = new InfoApi(defaultClient);
    try {
      OncoKBInfo result = apiInstance.infoGetUsingGET1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoGetUsingGET1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OncoKBInfo**](OncoKBInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

