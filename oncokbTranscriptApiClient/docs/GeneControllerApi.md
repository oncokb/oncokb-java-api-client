# GeneControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findGeneBySymbolUsingGET**](GeneControllerApi.md#findGeneBySymbolUsingGET) | **GET** /api/find-genes | findGeneBySymbol
[**findGenesBySymbolsUsingPOST**](GeneControllerApi.md#findGenesBySymbolsUsingPOST) | **POST** /api/find-genes | findGenesBySymbols


<a name="findGeneBySymbolUsingGET"></a>
# **findGeneBySymbolUsingGET**
> Gene findGeneBySymbolUsingGET(symbol)

findGeneBySymbol

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.GeneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    GeneControllerApi apiInstance = new GeneControllerApi(defaultClient);
    String symbol = "symbol_example"; // String | symbol
    try {
      Gene result = apiInstance.findGeneBySymbolUsingGET(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneControllerApi#findGeneBySymbolUsingGET");
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
 **symbol** | **String**| symbol |

### Return type

[**Gene**](Gene.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="findGenesBySymbolsUsingPOST"></a>
# **findGenesBySymbolsUsingPOST**
> Set&lt;Gene&gt; findGenesBySymbolsUsingPOST(requestBody)

findGenesBySymbols

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.GeneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    GeneControllerApi apiInstance = new GeneControllerApi(defaultClient);
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      Set<Gene> result = apiInstance.findGenesBySymbolsUsingPOST(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneControllerApi#findGenesBySymbolsUsingPOST");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Set&lt;Gene&gt;**](Gene.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

