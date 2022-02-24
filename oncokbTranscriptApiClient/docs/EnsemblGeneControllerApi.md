# EnsemblGeneControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEnsemblGeneUsingPOST**](EnsemblGeneControllerApi.md#addEnsemblGeneUsingPOST) | **POST** /api/add-ensembl-gene | addEnsemblGene


<a name="addEnsemblGeneUsingPOST"></a>
# **addEnsemblGeneUsingPOST**
> EnsemblGene addEnsemblGeneUsingPOST(addEnsemblGeneBody)

addEnsemblGene

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.EnsemblGeneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    EnsemblGeneControllerApi apiInstance = new EnsemblGeneControllerApi(defaultClient);
    AddEnsemblGeneBody addEnsemblGeneBody = new AddEnsemblGeneBody(); // AddEnsemblGeneBody | 
    try {
      EnsemblGene result = apiInstance.addEnsemblGeneUsingPOST(addEnsemblGeneBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneControllerApi#addEnsemblGeneUsingPOST");
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
 **addEnsemblGeneBody** | [**AddEnsemblGeneBody**](AddEnsemblGeneBody.md)|  | [optional]

### Return type

[**EnsemblGene**](EnsemblGene.md)

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

