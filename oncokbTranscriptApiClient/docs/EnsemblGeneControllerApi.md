# EnsemblGeneControllerApi

All URIs are relative to *https://beta.transcript.oncokb.org:443*

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
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.EnsemblGeneControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnsemblGeneControllerApi apiInstance = new EnsemblGeneControllerApi();
String referenceGenome = "referenceGenome_example"; // String | referenceGenome
Integer entrezGeneId = 56; // Integer | entrezGeneId
String ensemblGeneId = "ensemblGeneId_example"; // String | ensemblGeneId
Boolean isCanonical = true; // Boolean | isCanonical
try {
    EnsemblGene result = apiInstance.addEnsemblGeneUsingPOST(referenceGenome, entrezGeneId, ensemblGeneId, isCanonical);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnsemblGeneControllerApi#addEnsemblGeneUsingPOST");
    e.printStackTrace();
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

