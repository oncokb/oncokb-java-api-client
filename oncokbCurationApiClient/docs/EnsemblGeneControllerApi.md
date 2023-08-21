# EnsemblGeneControllerApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEnsemblGene**](EnsemblGeneControllerApi.md#addEnsemblGene) | **POST** /api/add-ensembl-gene | 


<a name="addEnsemblGene"></a>
# **addEnsemblGene**
> EnsemblGene addEnsemblGene(addEnsemblGeneBody)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.EnsemblGeneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    EnsemblGeneControllerApi apiInstance = new EnsemblGeneControllerApi(defaultClient);
    AddEnsemblGeneBody addEnsemblGeneBody = new AddEnsemblGeneBody(); // AddEnsemblGeneBody | 
    try {
      EnsemblGene result = apiInstance.addEnsemblGene(addEnsemblGeneBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneControllerApi#addEnsemblGene");
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
 **addEnsemblGeneBody** | [**AddEnsemblGeneBody**](AddEnsemblGeneBody.md)|  |

### Return type

[**EnsemblGene**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

