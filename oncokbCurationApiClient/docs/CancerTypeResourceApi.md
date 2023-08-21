# CancerTypeResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countCancerTypes**](CancerTypeResourceApi.md#countCancerTypes) | **GET** /api/cancer-types/count | 
[**createCancerType**](CancerTypeResourceApi.md#createCancerType) | **POST** /api/cancer-types | 
[**deleteCancerType**](CancerTypeResourceApi.md#deleteCancerType) | **DELETE** /api/cancer-types/{id} | 
[**getAllCancerTypes**](CancerTypeResourceApi.md#getAllCancerTypes) | **GET** /api/cancer-types | 
[**getCancerType**](CancerTypeResourceApi.md#getCancerType) | **GET** /api/cancer-types/{id} | 
[**partialUpdateCancerType**](CancerTypeResourceApi.md#partialUpdateCancerType) | **PATCH** /api/cancer-types/{id} | 
[**searchCancerTypes**](CancerTypeResourceApi.md#searchCancerTypes) | **GET** /api/_search/cancer-types | 
[**updateCancerType**](CancerTypeResourceApi.md#updateCancerType) | **PUT** /api/cancer-types/{id} | 


<a name="countCancerTypes"></a>
# **countCancerTypes**
> Long countCancerTypes(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    CancerTypeCriteria criteria = new CancerTypeCriteria(); // CancerTypeCriteria | 
    try {
      Long result = apiInstance.countCancerTypes(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#countCancerTypes");
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
 **criteria** | [**CancerTypeCriteria**](.md)|  |

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

<a name="createCancerType"></a>
# **createCancerType**
> CancerType createCancerType(cancerType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    CancerType cancerType = new CancerType(); // CancerType | 
    try {
      CancerType result = apiInstance.createCancerType(cancerType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#createCancerType");
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
 **cancerType** | [**CancerType**](CancerType.md)|  |

### Return type

[**CancerType**](CancerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteCancerType"></a>
# **deleteCancerType**
> deleteCancerType(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteCancerType(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#deleteCancerType");
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

<a name="getAllCancerTypes"></a>
# **getAllCancerTypes**
> List&lt;CancerType&gt; getAllCancerTypes(criteria, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    CancerTypeCriteria criteria = new CancerTypeCriteria(); // CancerTypeCriteria | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<CancerType> result = apiInstance.getAllCancerTypes(criteria, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#getAllCancerTypes");
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
 **criteria** | [**CancerTypeCriteria**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;CancerType&gt;**](CancerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCancerType"></a>
# **getCancerType**
> CancerType getCancerType(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      CancerType result = apiInstance.getCancerType(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#getCancerType");
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

[**CancerType**](CancerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateCancerType"></a>
# **partialUpdateCancerType**
> CancerType partialUpdateCancerType(id, cancerType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    CancerType cancerType = new CancerType(); // CancerType | 
    try {
      CancerType result = apiInstance.partialUpdateCancerType(id, cancerType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#partialUpdateCancerType");
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
 **cancerType** | [**CancerType**](CancerType.md)|  |

### Return type

[**CancerType**](CancerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchCancerTypes"></a>
# **searchCancerTypes**
> List&lt;CancerType&gt; searchCancerTypes(query, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    String query = "query_example"; // String | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<CancerType> result = apiInstance.searchCancerTypes(query, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#searchCancerTypes");
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

[**List&lt;CancerType&gt;**](CancerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCancerType"></a>
# **updateCancerType**
> CancerType updateCancerType(id, cancerType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CancerTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CancerTypeResourceApi apiInstance = new CancerTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    CancerType cancerType = new CancerType(); // CancerType | 
    try {
      CancerType result = apiInstance.updateCancerType(id, cancerType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerTypeResourceApi#updateCancerType");
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
 **cancerType** | [**CancerType**](CancerType.md)|  |

### Return type

[**CancerType**](CancerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

