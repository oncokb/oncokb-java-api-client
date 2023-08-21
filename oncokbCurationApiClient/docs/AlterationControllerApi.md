# AlterationControllerApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annotateAlteration**](AlterationControllerApi.md#annotateAlteration) | **POST** /api/annotate-alteration | 


<a name="annotateAlteration"></a>
# **annotateAlteration**
> Alteration annotateAlteration(alteration)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationControllerApi apiInstance = new AlterationControllerApi(defaultClient);
    Alteration alteration = new Alteration(); // Alteration | 
    try {
      Alteration result = apiInstance.annotateAlteration(alteration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationControllerApi#annotateAlteration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alteration** | [**Alteration**](Alteration.md)|  |

### Return type

[**Alteration**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

