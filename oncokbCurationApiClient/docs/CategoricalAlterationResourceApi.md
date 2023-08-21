# CategoricalAlterationResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategoricalAlteration**](CategoricalAlterationResourceApi.md#createCategoricalAlteration) | **POST** /api/categorical-alterations | 
[**deleteCategoricalAlteration**](CategoricalAlterationResourceApi.md#deleteCategoricalAlteration) | **DELETE** /api/categorical-alterations/{id} | 
[**getAllCategoricalAlterations**](CategoricalAlterationResourceApi.md#getAllCategoricalAlterations) | **GET** /api/categorical-alterations | 
[**getCategoricalAlteration**](CategoricalAlterationResourceApi.md#getCategoricalAlteration) | **GET** /api/categorical-alterations/{id} | 
[**partialUpdateCategoricalAlteration**](CategoricalAlterationResourceApi.md#partialUpdateCategoricalAlteration) | **PATCH** /api/categorical-alterations/{id} | 
[**updateCategoricalAlteration**](CategoricalAlterationResourceApi.md#updateCategoricalAlteration) | **PUT** /api/categorical-alterations/{id} | 


<a name="createCategoricalAlteration"></a>
# **createCategoricalAlteration**
> CategoricalAlteration createCategoricalAlteration(categoricalAlteration)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CategoricalAlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CategoricalAlterationResourceApi apiInstance = new CategoricalAlterationResourceApi(defaultClient);
    CategoricalAlteration categoricalAlteration = new CategoricalAlteration(); // CategoricalAlteration | 
    try {
      CategoricalAlteration result = apiInstance.createCategoricalAlteration(categoricalAlteration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoricalAlterationResourceApi#createCategoricalAlteration");
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
 **categoricalAlteration** | [**CategoricalAlteration**](CategoricalAlteration.md)|  |

### Return type

[**CategoricalAlteration**](CategoricalAlteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteCategoricalAlteration"></a>
# **deleteCategoricalAlteration**
> deleteCategoricalAlteration(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CategoricalAlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CategoricalAlterationResourceApi apiInstance = new CategoricalAlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteCategoricalAlteration(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoricalAlterationResourceApi#deleteCategoricalAlteration");
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

<a name="getAllCategoricalAlterations"></a>
# **getAllCategoricalAlterations**
> List&lt;CategoricalAlteration&gt; getAllCategoricalAlterations()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CategoricalAlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CategoricalAlterationResourceApi apiInstance = new CategoricalAlterationResourceApi(defaultClient);
    try {
      List<CategoricalAlteration> result = apiInstance.getAllCategoricalAlterations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoricalAlterationResourceApi#getAllCategoricalAlterations");
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

[**List&lt;CategoricalAlteration&gt;**](CategoricalAlteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCategoricalAlteration"></a>
# **getCategoricalAlteration**
> CategoricalAlteration getCategoricalAlteration(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CategoricalAlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CategoricalAlterationResourceApi apiInstance = new CategoricalAlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      CategoricalAlteration result = apiInstance.getCategoricalAlteration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoricalAlterationResourceApi#getCategoricalAlteration");
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

[**CategoricalAlteration**](CategoricalAlteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateCategoricalAlteration"></a>
# **partialUpdateCategoricalAlteration**
> CategoricalAlteration partialUpdateCategoricalAlteration(id, categoricalAlteration)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CategoricalAlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CategoricalAlterationResourceApi apiInstance = new CategoricalAlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    CategoricalAlteration categoricalAlteration = new CategoricalAlteration(); // CategoricalAlteration | 
    try {
      CategoricalAlteration result = apiInstance.partialUpdateCategoricalAlteration(id, categoricalAlteration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoricalAlterationResourceApi#partialUpdateCategoricalAlteration");
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
 **categoricalAlteration** | [**CategoricalAlteration**](CategoricalAlteration.md)|  |

### Return type

[**CategoricalAlteration**](CategoricalAlteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCategoricalAlteration"></a>
# **updateCategoricalAlteration**
> CategoricalAlteration updateCategoricalAlteration(id, categoricalAlteration)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CategoricalAlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CategoricalAlterationResourceApi apiInstance = new CategoricalAlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    CategoricalAlteration categoricalAlteration = new CategoricalAlteration(); // CategoricalAlteration | 
    try {
      CategoricalAlteration result = apiInstance.updateCategoricalAlteration(id, categoricalAlteration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoricalAlterationResourceApi#updateCategoricalAlteration");
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
 **categoricalAlteration** | [**CategoricalAlteration**](CategoricalAlteration.md)|  |

### Return type

[**CategoricalAlteration**](CategoricalAlteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

