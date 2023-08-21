# DrugControllerApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findDrugByCode**](DrugControllerApi.md#findDrugByCode) | **GET** /api/drugs/search-by-code/{code} | 
[**findDrugs**](DrugControllerApi.md#findDrugs) | **GET** /api/drugs/search | 


<a name="findDrugByCode"></a>
# **findDrugByCode**
> Drug findDrugByCode(code)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugControllerApi apiInstance = new DrugControllerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      Drug result = apiInstance.findDrugByCode(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugControllerApi#findDrugByCode");
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
 **code** | **String**|  |

### Return type

[**Drug**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="findDrugs"></a>
# **findDrugs**
> List&lt;Drug&gt; findDrugs(query)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugControllerApi apiInstance = new DrugControllerApi(defaultClient);
    String query = "query_example"; // String | 
    try {
      List<Drug> result = apiInstance.findDrugs(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugControllerApi#findDrugs");
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
 **query** | **String**|  |

### Return type

[**List&lt;Drug&gt;**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

