# GeneResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countGenes**](GeneResourceApi.md#countGenes) | **GET** /api/genes/count | 
[**createGene**](GeneResourceApi.md#createGene) | **POST** /api/genes | 
[**deleteGene**](GeneResourceApi.md#deleteGene) | **DELETE** /api/genes/{id} | 
[**getAllGenes**](GeneResourceApi.md#getAllGenes) | **GET** /api/genes | 
[**getGene**](GeneResourceApi.md#getGene) | **GET** /api/genes/{id} | 
[**partialUpdateGene**](GeneResourceApi.md#partialUpdateGene) | **PATCH** /api/genes/{id} | 
[**searchGenes**](GeneResourceApi.md#searchGenes) | **GET** /api/_search/genes | 
[**updateGene**](GeneResourceApi.md#updateGene) | **PUT** /api/genes/{id} | 


<a name="countGenes"></a>
# **countGenes**
> Long countGenes(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    GeneCriteria criteria = new GeneCriteria(); // GeneCriteria | 
    try {
      Long result = apiInstance.countGenes(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#countGenes");
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
 **criteria** | [**GeneCriteria**](.md)|  |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createGene"></a>
# **createGene**
> Gene createGene(gene)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    Gene gene = new Gene(); // Gene | 
    try {
      Gene result = apiInstance.createGene(gene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#createGene");
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
 **gene** | [**Gene**](Gene.md)|  |

### Return type

[**Gene**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteGene"></a>
# **deleteGene**
> deleteGene(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteGene(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#deleteGene");
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

<a name="getAllGenes"></a>
# **getAllGenes**
> List&lt;Gene&gt; getAllGenes(criteria, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    GeneCriteria criteria = new GeneCriteria(); // GeneCriteria | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<Gene> result = apiInstance.getAllGenes(criteria, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#getAllGenes");
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
 **criteria** | [**GeneCriteria**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;Gene&gt;**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getGene"></a>
# **getGene**
> Gene getGene(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      Gene result = apiInstance.getGene(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#getGene");
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

<a name="partialUpdateGene"></a>
# **partialUpdateGene**
> Gene partialUpdateGene(id, gene)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Gene gene = new Gene(); // Gene | 
    try {
      Gene result = apiInstance.partialUpdateGene(id, gene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#partialUpdateGene");
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
 **gene** | [**Gene**](Gene.md)|  |

### Return type

[**Gene**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchGenes"></a>
# **searchGenes**
> List&lt;Gene&gt; searchGenes(query, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    String query = "query_example"; // String | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<Gene> result = apiInstance.searchGenes(query, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#searchGenes");
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
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;Gene&gt;**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateGene"></a>
# **updateGene**
> Gene updateGene(id, gene)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GeneResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GeneResourceApi apiInstance = new GeneResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Gene gene = new Gene(); // Gene | 
    try {
      Gene result = apiInstance.updateGene(id, gene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneResourceApi#updateGene");
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
 **gene** | [**Gene**](Gene.md)|  |

### Return type

[**Gene**](Gene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

