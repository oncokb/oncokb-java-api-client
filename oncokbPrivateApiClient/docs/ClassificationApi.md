# ClassificationApi

All URIs are relative to *https://www.oncokb.org/api/v1*

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
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.ClassificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    ClassificationApi apiInstance = new ClassificationApi(defaultClient);
    try {
      List<String> result = apiInstance.classificationVariantsGetUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationApi#classificationVariantsGetUsingGET");
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

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

