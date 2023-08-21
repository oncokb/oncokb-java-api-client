# GenomeFragmentResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGenomeFragment**](GenomeFragmentResourceApi.md#createGenomeFragment) | **POST** /api/genome-fragments | 
[**deleteGenomeFragment**](GenomeFragmentResourceApi.md#deleteGenomeFragment) | **DELETE** /api/genome-fragments/{id} | 
[**getAllGenomeFragments**](GenomeFragmentResourceApi.md#getAllGenomeFragments) | **GET** /api/genome-fragments | 
[**getGenomeFragment**](GenomeFragmentResourceApi.md#getGenomeFragment) | **GET** /api/genome-fragments/{id} | 
[**partialUpdateGenomeFragment**](GenomeFragmentResourceApi.md#partialUpdateGenomeFragment) | **PATCH** /api/genome-fragments/{id} | 
[**updateGenomeFragment**](GenomeFragmentResourceApi.md#updateGenomeFragment) | **PUT** /api/genome-fragments/{id} | 


<a name="createGenomeFragment"></a>
# **createGenomeFragment**
> GenomeFragment createGenomeFragment(genomeFragment)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GenomeFragmentResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GenomeFragmentResourceApi apiInstance = new GenomeFragmentResourceApi(defaultClient);
    GenomeFragment genomeFragment = new GenomeFragment(); // GenomeFragment | 
    try {
      GenomeFragment result = apiInstance.createGenomeFragment(genomeFragment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenomeFragmentResourceApi#createGenomeFragment");
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
 **genomeFragment** | [**GenomeFragment**](GenomeFragment.md)|  |

### Return type

[**GenomeFragment**](GenomeFragment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteGenomeFragment"></a>
# **deleteGenomeFragment**
> deleteGenomeFragment(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GenomeFragmentResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GenomeFragmentResourceApi apiInstance = new GenomeFragmentResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteGenomeFragment(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenomeFragmentResourceApi#deleteGenomeFragment");
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

<a name="getAllGenomeFragments"></a>
# **getAllGenomeFragments**
> List&lt;GenomeFragment&gt; getAllGenomeFragments(pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GenomeFragmentResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GenomeFragmentResourceApi apiInstance = new GenomeFragmentResourceApi(defaultClient);
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<GenomeFragment> result = apiInstance.getAllGenomeFragments(pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenomeFragmentResourceApi#getAllGenomeFragments");
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

[**List&lt;GenomeFragment&gt;**](GenomeFragment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getGenomeFragment"></a>
# **getGenomeFragment**
> GenomeFragment getGenomeFragment(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GenomeFragmentResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GenomeFragmentResourceApi apiInstance = new GenomeFragmentResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      GenomeFragment result = apiInstance.getGenomeFragment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenomeFragmentResourceApi#getGenomeFragment");
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

[**GenomeFragment**](GenomeFragment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateGenomeFragment"></a>
# **partialUpdateGenomeFragment**
> GenomeFragment partialUpdateGenomeFragment(id, genomeFragment)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GenomeFragmentResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GenomeFragmentResourceApi apiInstance = new GenomeFragmentResourceApi(defaultClient);
    Long id = 56L; // Long | 
    GenomeFragment genomeFragment = new GenomeFragment(); // GenomeFragment | 
    try {
      GenomeFragment result = apiInstance.partialUpdateGenomeFragment(id, genomeFragment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenomeFragmentResourceApi#partialUpdateGenomeFragment");
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
 **genomeFragment** | [**GenomeFragment**](GenomeFragment.md)|  |

### Return type

[**GenomeFragment**](GenomeFragment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateGenomeFragment"></a>
# **updateGenomeFragment**
> GenomeFragment updateGenomeFragment(id, genomeFragment)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.GenomeFragmentResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    GenomeFragmentResourceApi apiInstance = new GenomeFragmentResourceApi(defaultClient);
    Long id = 56L; // Long | 
    GenomeFragment genomeFragment = new GenomeFragment(); // GenomeFragment | 
    try {
      GenomeFragment result = apiInstance.updateGenomeFragment(id, genomeFragment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenomeFragmentResourceApi#updateGenomeFragment");
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
 **genomeFragment** | [**GenomeFragment**](GenomeFragment.md)|  |

### Return type

[**GenomeFragment**](GenomeFragment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

