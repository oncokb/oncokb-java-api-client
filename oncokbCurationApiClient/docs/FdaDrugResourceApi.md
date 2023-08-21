# FdaDrugResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFdaDrug**](FdaDrugResourceApi.md#createFdaDrug) | **POST** /api/fda-drugs | 
[**deleteFdaDrug**](FdaDrugResourceApi.md#deleteFdaDrug) | **DELETE** /api/fda-drugs/{id} | 
[**getAllFdaDrugs**](FdaDrugResourceApi.md#getAllFdaDrugs) | **GET** /api/fda-drugs | 
[**getFdaDrug**](FdaDrugResourceApi.md#getFdaDrug) | **GET** /api/fda-drugs/{id} | 
[**partialUpdateFdaDrug**](FdaDrugResourceApi.md#partialUpdateFdaDrug) | **PATCH** /api/fda-drugs/{id} | 
[**updateFdaDrug**](FdaDrugResourceApi.md#updateFdaDrug) | **PUT** /api/fda-drugs/{id} | 


<a name="createFdaDrug"></a>
# **createFdaDrug**
> FdaDrug createFdaDrug(fdaDrug)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaDrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaDrugResourceApi apiInstance = new FdaDrugResourceApi(defaultClient);
    FdaDrug fdaDrug = new FdaDrug(); // FdaDrug | 
    try {
      FdaDrug result = apiInstance.createFdaDrug(fdaDrug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaDrugResourceApi#createFdaDrug");
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
 **fdaDrug** | [**FdaDrug**](FdaDrug.md)|  |

### Return type

[**FdaDrug**](FdaDrug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteFdaDrug"></a>
# **deleteFdaDrug**
> deleteFdaDrug(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaDrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaDrugResourceApi apiInstance = new FdaDrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteFdaDrug(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaDrugResourceApi#deleteFdaDrug");
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

<a name="getAllFdaDrugs"></a>
# **getAllFdaDrugs**
> List&lt;FdaDrug&gt; getAllFdaDrugs(pageable, filter)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaDrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaDrugResourceApi apiInstance = new FdaDrugResourceApi(defaultClient);
    Pageable pageable = new Pageable(); // Pageable | 
    String filter = "filter_example"; // String | 
    try {
      List<FdaDrug> result = apiInstance.getAllFdaDrugs(pageable, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaDrugResourceApi#getAllFdaDrugs");
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
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;FdaDrug&gt;**](FdaDrug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getFdaDrug"></a>
# **getFdaDrug**
> FdaDrug getFdaDrug(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaDrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaDrugResourceApi apiInstance = new FdaDrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      FdaDrug result = apiInstance.getFdaDrug(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaDrugResourceApi#getFdaDrug");
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

[**FdaDrug**](FdaDrug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateFdaDrug"></a>
# **partialUpdateFdaDrug**
> FdaDrug partialUpdateFdaDrug(id, fdaDrug)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaDrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaDrugResourceApi apiInstance = new FdaDrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    FdaDrug fdaDrug = new FdaDrug(); // FdaDrug | 
    try {
      FdaDrug result = apiInstance.partialUpdateFdaDrug(id, fdaDrug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaDrugResourceApi#partialUpdateFdaDrug");
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
 **fdaDrug** | [**FdaDrug**](FdaDrug.md)|  |

### Return type

[**FdaDrug**](FdaDrug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateFdaDrug"></a>
# **updateFdaDrug**
> FdaDrug updateFdaDrug(id, fdaDrug)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaDrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaDrugResourceApi apiInstance = new FdaDrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    FdaDrug fdaDrug = new FdaDrug(); // FdaDrug | 
    try {
      FdaDrug result = apiInstance.updateFdaDrug(id, fdaDrug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaDrugResourceApi#updateFdaDrug");
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
 **fdaDrug** | [**FdaDrug**](FdaDrug.md)|  |

### Return type

[**FdaDrug**](FdaDrug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

