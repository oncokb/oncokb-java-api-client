# SpecimenTypeResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpecimenType**](SpecimenTypeResourceApi.md#createSpecimenType) | **POST** /api/specimen-types | 
[**deleteSpecimenType**](SpecimenTypeResourceApi.md#deleteSpecimenType) | **DELETE** /api/specimen-types/{id} | 
[**getAllSpecimenTypes**](SpecimenTypeResourceApi.md#getAllSpecimenTypes) | **GET** /api/specimen-types | 
[**getSpecimenType**](SpecimenTypeResourceApi.md#getSpecimenType) | **GET** /api/specimen-types/{id} | 
[**partialUpdateSpecimenType**](SpecimenTypeResourceApi.md#partialUpdateSpecimenType) | **PATCH** /api/specimen-types/{id} | 
[**updateSpecimenType**](SpecimenTypeResourceApi.md#updateSpecimenType) | **PUT** /api/specimen-types/{id} | 


<a name="createSpecimenType"></a>
# **createSpecimenType**
> SpecimenType createSpecimenType(specimenType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SpecimenTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SpecimenTypeResourceApi apiInstance = new SpecimenTypeResourceApi(defaultClient);
    SpecimenType specimenType = new SpecimenType(); // SpecimenType | 
    try {
      SpecimenType result = apiInstance.createSpecimenType(specimenType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpecimenTypeResourceApi#createSpecimenType");
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
 **specimenType** | [**SpecimenType**](SpecimenType.md)|  |

### Return type

[**SpecimenType**](SpecimenType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteSpecimenType"></a>
# **deleteSpecimenType**
> deleteSpecimenType(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SpecimenTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SpecimenTypeResourceApi apiInstance = new SpecimenTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteSpecimenType(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpecimenTypeResourceApi#deleteSpecimenType");
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

<a name="getAllSpecimenTypes"></a>
# **getAllSpecimenTypes**
> List&lt;SpecimenType&gt; getAllSpecimenTypes()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SpecimenTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SpecimenTypeResourceApi apiInstance = new SpecimenTypeResourceApi(defaultClient);
    try {
      List<SpecimenType> result = apiInstance.getAllSpecimenTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpecimenTypeResourceApi#getAllSpecimenTypes");
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

[**List&lt;SpecimenType&gt;**](SpecimenType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getSpecimenType"></a>
# **getSpecimenType**
> SpecimenType getSpecimenType(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SpecimenTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SpecimenTypeResourceApi apiInstance = new SpecimenTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      SpecimenType result = apiInstance.getSpecimenType(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpecimenTypeResourceApi#getSpecimenType");
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

[**SpecimenType**](SpecimenType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateSpecimenType"></a>
# **partialUpdateSpecimenType**
> SpecimenType partialUpdateSpecimenType(id, specimenType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SpecimenTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SpecimenTypeResourceApi apiInstance = new SpecimenTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    SpecimenType specimenType = new SpecimenType(); // SpecimenType | 
    try {
      SpecimenType result = apiInstance.partialUpdateSpecimenType(id, specimenType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpecimenTypeResourceApi#partialUpdateSpecimenType");
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
 **specimenType** | [**SpecimenType**](SpecimenType.md)|  |

### Return type

[**SpecimenType**](SpecimenType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateSpecimenType"></a>
# **updateSpecimenType**
> SpecimenType updateSpecimenType(id, specimenType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SpecimenTypeResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SpecimenTypeResourceApi apiInstance = new SpecimenTypeResourceApi(defaultClient);
    Long id = 56L; // Long | 
    SpecimenType specimenType = new SpecimenType(); // SpecimenType | 
    try {
      SpecimenType result = apiInstance.updateSpecimenType(id, specimenType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpecimenTypeResourceApi#updateSpecimenType");
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
 **specimenType** | [**SpecimenType**](SpecimenType.md)|  |

### Return type

[**SpecimenType**](SpecimenType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

