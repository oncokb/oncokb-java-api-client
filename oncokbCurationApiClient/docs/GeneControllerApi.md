# GeneControllerApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findGeneBySymbol**](GeneControllerApi.md#findGeneBySymbol) | **GET** /api/find-genes | 
[**findGenesBySymbols**](GeneControllerApi.md#findGenesBySymbols) | **POST** /api/find-genes | 


<a name="findGeneBySymbol"></a>
# **findGeneBySymbol**
> Gene findGeneBySymbol(symbol)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneControllerApi apiInstance = new GeneControllerApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    try {
      Gene result = apiInstance.findGeneBySymbol(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneControllerApi#findGeneBySymbol");
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
 **symbol** | **String**|  |

### Return type

[**Gene**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="findGenesBySymbols"></a>
# **findGenesBySymbols**
> Set&lt;Gene&gt; findGenesBySymbols(requestBody)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneControllerApi apiInstance = new GeneControllerApi(defaultClient);
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      Set<Gene> result = apiInstance.findGenesBySymbols(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneControllerApi#findGenesBySymbols");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**Set&lt;Gene&gt;**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

