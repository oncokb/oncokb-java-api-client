# FdaSubmissionTypeResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFdaSubmissionType**](FdaSubmissionTypeResourceApi.md#createFdaSubmissionType) | **POST** /api/fda-submission-types | 
[**deleteFdaSubmissionType**](FdaSubmissionTypeResourceApi.md#deleteFdaSubmissionType) | **DELETE** /api/fda-submission-types/{id} | 
[**getAllFdaSubmissionTypes**](FdaSubmissionTypeResourceApi.md#getAllFdaSubmissionTypes) | **GET** /api/fda-submission-types | 
[**getFdaSubmissionType**](FdaSubmissionTypeResourceApi.md#getFdaSubmissionType) | **GET** /api/fda-submission-types/{id} | 
[**partialUpdateFdaSubmissionType**](FdaSubmissionTypeResourceApi.md#partialUpdateFdaSubmissionType) | **PATCH** /api/fda-submission-types/{id} | 
[**updateFdaSubmissionType**](FdaSubmissionTypeResourceApi.md#updateFdaSubmissionType) | **PUT** /api/fda-submission-types/{id} | 


<a name="createFdaSubmissionType"></a>
# **createFdaSubmissionType**
> FdaSubmissionType createFdaSubmissionType(fdaSubmissionType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionTypeResourceApi apiInstance = new FdaSubmissionTypeResourceApi(defaultClient);
    FdaSubmissionType fdaSubmissionType = new FdaSubmissionType(); // FdaSubmissionType | 
    try {
      FdaSubmissionType result = apiInstance.createFdaSubmissionType(fdaSubmissionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionTypeResourceApi#createFdaSubmissionType");
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
 **fdaSubmissionType** | [**FdaSubmissionType**](FdaSubmissionType.md)|  |

### Return type

[**FdaSubmissionType**](FdaSubmissionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteFdaSubmissionType"></a>
# **deleteFdaSubmissionType**
> deleteFdaSubmissionType(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionTypeResourceApi apiInstance = new FdaSubmissionTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteFdaSubmissionType(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionTypeResourceApi#deleteFdaSubmissionType");
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

<a name="getAllFdaSubmissionTypes"></a>
# **getAllFdaSubmissionTypes**
> List&lt;FdaSubmissionType&gt; getAllFdaSubmissionTypes()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionTypeResourceApi apiInstance = new FdaSubmissionTypeResourceApi(defaultClient);
    try {
      List<FdaSubmissionType> result = apiInstance.getAllFdaSubmissionTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionTypeResourceApi#getAllFdaSubmissionTypes");
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

[**List&lt;FdaSubmissionType&gt;**](FdaSubmissionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getFdaSubmissionType"></a>
# **getFdaSubmissionType**
> FdaSubmissionType getFdaSubmissionType(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionTypeResourceApi apiInstance = new FdaSubmissionTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      FdaSubmissionType result = apiInstance.getFdaSubmissionType(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionTypeResourceApi#getFdaSubmissionType");
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

[**FdaSubmissionType**](FdaSubmissionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateFdaSubmissionType"></a>
# **partialUpdateFdaSubmissionType**
> FdaSubmissionType partialUpdateFdaSubmissionType(id, fdaSubmissionType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionTypeResourceApi apiInstance = new FdaSubmissionTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    FdaSubmissionType fdaSubmissionType = new FdaSubmissionType(); // FdaSubmissionType | 
    try {
      FdaSubmissionType result = apiInstance.partialUpdateFdaSubmissionType(id, fdaSubmissionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionTypeResourceApi#partialUpdateFdaSubmissionType");
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
 **fdaSubmissionType** | [**FdaSubmissionType**](FdaSubmissionType.md)|  |

### Return type

[**FdaSubmissionType**](FdaSubmissionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateFdaSubmissionType"></a>
# **updateFdaSubmissionType**
> FdaSubmissionType updateFdaSubmissionType(id, fdaSubmissionType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionTypeResourceApi apiInstance = new FdaSubmissionTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    FdaSubmissionType fdaSubmissionType = new FdaSubmissionType(); // FdaSubmissionType | 
    try {
      FdaSubmissionType result = apiInstance.updateFdaSubmissionType(id, fdaSubmissionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionTypeResourceApi#updateFdaSubmissionType");
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
 **fdaSubmissionType** | [**FdaSubmissionType**](FdaSubmissionType.md)|  |

### Return type

[**FdaSubmissionType**](FdaSubmissionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

