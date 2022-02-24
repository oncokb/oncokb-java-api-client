# InfoApi

All URIs are relative to *http://oncokb-core:8888/api/v1*

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
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    InfoApi apiInstance = new InfoApi(defaultClient);
    try {
      OncoKBInfo result = apiInstance.infoGetUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoGetUsingGET");
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
**200** | OK |  -  |

