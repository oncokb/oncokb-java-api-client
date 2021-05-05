# GeneControllerApi

All URIs are relative to *http://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findGeneBySymbolUsingGET**](GeneControllerApi.md#findGeneBySymbolUsingGET) | **GET** /api/find-gene/{symbol} | findGeneBySymbol

<a name="findGeneBySymbolUsingGET"></a>
# **findGeneBySymbolUsingGET**
> Gene findGeneBySymbolUsingGET(symbol)

findGeneBySymbol

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.GeneControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GeneControllerApi apiInstance = new GeneControllerApi();
String symbol = "symbol_example"; // String | symbol
try {
    Gene result = apiInstance.findGeneBySymbolUsingGET(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneControllerApi#findGeneBySymbolUsingGET");
    e.printStackTrace();
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

