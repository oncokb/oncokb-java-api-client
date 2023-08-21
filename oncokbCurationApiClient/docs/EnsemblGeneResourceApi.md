# EnsemblGeneResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEnsemblGene**](EnsemblGeneResourceApi.md#createEnsemblGene) | **POST** /api/ensembl-genes | 
[**deleteEnsemblGene**](EnsemblGeneResourceApi.md#deleteEnsemblGene) | **DELETE** /api/ensembl-genes/{id} | 
[**getAllEnsemblGenes**](EnsemblGeneResourceApi.md#getAllEnsemblGenes) | **GET** /api/ensembl-genes | 
[**getEnsemblGene**](EnsemblGeneResourceApi.md#getEnsemblGene) | **GET** /api/ensembl-genes/{id} | 
[**partialUpdateEnsemblGene**](EnsemblGeneResourceApi.md#partialUpdateEnsemblGene) | **PATCH** /api/ensembl-genes/{id} | 
[**updateEnsemblGene**](EnsemblGeneResourceApi.md#updateEnsemblGene) | **PUT** /api/ensembl-genes/{id} | 


<a name="createEnsemblGene"></a>
# **createEnsemblGene**
> EnsemblGene createEnsemblGene(ensemblGene)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.EnsemblGeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    EnsemblGeneResourceApi apiInstance = new EnsemblGeneResourceApi(defaultClient);
    EnsemblGene ensemblGene = new EnsemblGene(); // EnsemblGene | 
    try {
      EnsemblGene result = apiInstance.createEnsemblGene(ensemblGene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneResourceApi#createEnsemblGene");
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
 **ensemblGene** | [**EnsemblGene**](EnsemblGene.md)|  |

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

<a name="deleteEnsemblGene"></a>
# **deleteEnsemblGene**
> deleteEnsemblGene(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.EnsemblGeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    EnsemblGeneResourceApi apiInstance = new EnsemblGeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteEnsemblGene(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneResourceApi#deleteEnsemblGene");
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
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllEnsemblGenes"></a>
# **getAllEnsemblGenes**
> List&lt;EnsemblGene&gt; getAllEnsemblGenes(pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.EnsemblGeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    EnsemblGeneResourceApi apiInstance = new EnsemblGeneResourceApi(defaultClient);
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<EnsemblGene> result = apiInstance.getAllEnsemblGenes(pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneResourceApi#getAllEnsemblGenes");
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
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;EnsemblGene&gt;**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getEnsemblGene"></a>
# **getEnsemblGene**
> EnsemblGene getEnsemblGene(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.EnsemblGeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    EnsemblGeneResourceApi apiInstance = new EnsemblGeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      EnsemblGene result = apiInstance.getEnsemblGene(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneResourceApi#getEnsemblGene");
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
 **id** | **Long**|  |

### Return type

[**EnsemblGene**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateEnsemblGene"></a>
# **partialUpdateEnsemblGene**
> EnsemblGene partialUpdateEnsemblGene(id, ensemblGene)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.EnsemblGeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    EnsemblGeneResourceApi apiInstance = new EnsemblGeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    EnsemblGene ensemblGene = new EnsemblGene(); // EnsemblGene | 
    try {
      EnsemblGene result = apiInstance.partialUpdateEnsemblGene(id, ensemblGene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneResourceApi#partialUpdateEnsemblGene");
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
 **id** | **Long**|  |
 **ensemblGene** | [**EnsemblGene**](EnsemblGene.md)|  |

### Return type

[**EnsemblGene**](EnsemblGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateEnsemblGene"></a>
# **updateEnsemblGene**
> EnsemblGene updateEnsemblGene(id, ensemblGene)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.EnsemblGeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    EnsemblGeneResourceApi apiInstance = new EnsemblGeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    EnsemblGene ensemblGene = new EnsemblGene(); // EnsemblGene | 
    try {
      EnsemblGene result = apiInstance.updateEnsemblGene(id, ensemblGene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnsemblGeneResourceApi#updateEnsemblGene");
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
 **id** | **Long**|  |
 **ensemblGene** | [**EnsemblGene**](EnsemblGene.md)|  |

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

