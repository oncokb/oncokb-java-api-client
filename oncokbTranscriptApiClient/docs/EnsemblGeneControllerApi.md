# EnsemblGeneControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEnsemblGeneUsingPOST**](EnsemblGeneControllerApi.md#addEnsemblGeneUsingPOST) | **POST** /api/add-ensembl-gene | addEnsemblGene


<a name="addEnsemblGeneUsingPOST"></a>
# **addEnsemblGeneUsingPOST**
> EnsemblGene addEnsemblGeneUsingPOST(referenceGenome, entrezGeneId, ensemblGeneId, isCanonical)

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
    String referenceGenome = "GRCh37"; // String | referenceGenome
    Integer entrezGeneId = 56; // Integer | entrezGeneId
    String ensemblGeneId = "ensemblGeneId_example"; // String | ensemblGeneId
    Boolean isCanonical = true; // Boolean | isCanonical
    try {
      EnsemblGene result = apiInstance.addEnsemblGeneUsingPOST(referenceGenome, entrezGeneId, ensemblGeneId, isCanonical);
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
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **entrezGeneId** | **Integer**| entrezGeneId |
 **ensemblGeneId** | **String**| ensemblGeneId |
 **isCanonical** | **Boolean**| isCanonical |

### Return type

[**EnsemblGene**](EnsemblGene.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

