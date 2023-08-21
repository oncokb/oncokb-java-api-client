# AuthInfoResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthInfo**](AuthInfoResourceApi.md#getAuthInfo) | **GET** /api/auth-info | 


<a name="getAuthInfo"></a>
# **getAuthInfo**
> AuthInfoVM getAuthInfo()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AuthInfoResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AuthInfoResourceApi apiInstance = new AuthInfoResourceApi(defaultClient);
    try {
      AuthInfoVM result = apiInstance.getAuthInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthInfoResourceApi#getAuthInfo");
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

[**AuthInfoVM**](AuthInfoVM.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

