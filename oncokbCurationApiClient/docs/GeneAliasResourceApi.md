# GeneAliasResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGeneAlias**](GeneAliasResourceApi.md#createGeneAlias) | **POST** /api/gene-aliases | 
[**deleteGeneAlias**](GeneAliasResourceApi.md#deleteGeneAlias) | **DELETE** /api/gene-aliases/{id} | 
[**getAllGeneAliases**](GeneAliasResourceApi.md#getAllGeneAliases) | **GET** /api/gene-aliases | 
[**getGeneAlias**](GeneAliasResourceApi.md#getGeneAlias) | **GET** /api/gene-aliases/{id} | 
[**partialUpdateGeneAlias**](GeneAliasResourceApi.md#partialUpdateGeneAlias) | **PATCH** /api/gene-aliases/{id} | 
[**updateGeneAlias**](GeneAliasResourceApi.md#updateGeneAlias) | **PUT** /api/gene-aliases/{id} | 


<a name="createGeneAlias"></a>
# **createGeneAlias**
> GeneAlias createGeneAlias(geneAlias)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneAliasResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneAliasResourceApi apiInstance = new GeneAliasResourceApi(defaultClient);
    GeneAlias geneAlias = new GeneAlias(); // GeneAlias | 
    try {
      GeneAlias result = apiInstance.createGeneAlias(geneAlias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneAliasResourceApi#createGeneAlias");
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
 **geneAlias** | [**GeneAlias**](GeneAlias.md)|  |

### Return type

[**GeneAlias**](GeneAlias.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteGeneAlias"></a>
# **deleteGeneAlias**
> deleteGeneAlias(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneAliasResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneAliasResourceApi apiInstance = new GeneAliasResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteGeneAlias(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneAliasResourceApi#deleteGeneAlias");
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

<a name="getAllGeneAliases"></a>
# **getAllGeneAliases**
> List&lt;GeneAlias&gt; getAllGeneAliases()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneAliasResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneAliasResourceApi apiInstance = new GeneAliasResourceApi(defaultClient);
    try {
      List<GeneAlias> result = apiInstance.getAllGeneAliases();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneAliasResourceApi#getAllGeneAliases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GeneAlias&gt;**](GeneAlias.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getGeneAlias"></a>
# **getGeneAlias**
> GeneAlias getGeneAlias(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneAliasResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneAliasResourceApi apiInstance = new GeneAliasResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      GeneAlias result = apiInstance.getGeneAlias(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneAliasResourceApi#getGeneAlias");
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

[**GeneAlias**](GeneAlias.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateGeneAlias"></a>
# **partialUpdateGeneAlias**
> GeneAlias partialUpdateGeneAlias(id, geneAlias)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneAliasResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneAliasResourceApi apiInstance = new GeneAliasResourceApi(defaultClient);
    Long id = 56L; // Long | 
    GeneAlias geneAlias = new GeneAlias(); // GeneAlias | 
    try {
      GeneAlias result = apiInstance.partialUpdateGeneAlias(id, geneAlias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneAliasResourceApi#partialUpdateGeneAlias");
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
 **geneAlias** | [**GeneAlias**](GeneAlias.md)|  |

### Return type

[**GeneAlias**](GeneAlias.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateGeneAlias"></a>
# **updateGeneAlias**
> GeneAlias updateGeneAlias(id, geneAlias)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneAliasResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneAliasResourceApi apiInstance = new GeneAliasResourceApi(defaultClient);
    Long id = 56L; // Long | 
    GeneAlias geneAlias = new GeneAlias(); // GeneAlias | 
    try {
      GeneAlias result = apiInstance.updateGeneAlias(id, geneAlias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneAliasResourceApi#updateGeneAlias");
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
 **geneAlias** | [**GeneAlias**](GeneAlias.md)|  |

### Return type

[**GeneAlias**](GeneAlias.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

