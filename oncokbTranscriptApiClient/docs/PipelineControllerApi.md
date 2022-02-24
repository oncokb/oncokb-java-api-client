# PipelineControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateNcitUsingPOST**](PipelineControllerApi.md#updateNcitUsingPOST) | **POST** /api/pipeline/update-ncit | updateNcit
[**updatePortalGeneUsingPOST**](PipelineControllerApi.md#updatePortalGeneUsingPOST) | **POST** /api/pipeline/update-gene | updatePortalGene


<a name="updateNcitUsingPOST"></a>
# **updateNcitUsingPOST**
> updateNcitUsingPOST()

updateNcit

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.PipelineControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    PipelineControllerApi apiInstance = new PipelineControllerApi(defaultClient);
    try {
      apiInstance.updateNcitUsingPOST();
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineControllerApi#updateNcitUsingPOST");
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

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="updatePortalGeneUsingPOST"></a>
# **updatePortalGeneUsingPOST**
> updatePortalGeneUsingPOST()

updatePortalGene

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.PipelineControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    PipelineControllerApi apiInstance = new PipelineControllerApi(defaultClient);
    try {
      apiInstance.updatePortalGeneUsingPOST();
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineControllerApi#updatePortalGeneUsingPOST");
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

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

