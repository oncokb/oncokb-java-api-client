# DrugResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countDrugs**](DrugResourceApi.md#countDrugs) | **GET** /api/drugs/count | 
[**createDrug**](DrugResourceApi.md#createDrug) | **POST** /api/drugs | 
[**deleteDrug**](DrugResourceApi.md#deleteDrug) | **DELETE** /api/drugs/{id} | 
[**getAllDrugs**](DrugResourceApi.md#getAllDrugs) | **GET** /api/drugs | 
[**getDrug**](DrugResourceApi.md#getDrug) | **GET** /api/drugs/{id} | 
[**partialUpdateDrug**](DrugResourceApi.md#partialUpdateDrug) | **PATCH** /api/drugs/{id} | 
[**searchDrugs**](DrugResourceApi.md#searchDrugs) | **GET** /api/_search/drugs | 
[**updateDrug**](DrugResourceApi.md#updateDrug) | **PUT** /api/drugs/{id} | 


<a name="countDrugs"></a>
# **countDrugs**
> Long countDrugs(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    DrugCriteria criteria = new DrugCriteria(); // DrugCriteria | 
    try {
      Long result = apiInstance.countDrugs(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#countDrugs");
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
 **criteria** | [**DrugCriteria**](.md)|  |

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

<a name="createDrug"></a>
# **createDrug**
> Drug createDrug(drug)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    Drug drug = new Drug(); // Drug | 
    try {
      Drug result = apiInstance.createDrug(drug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#createDrug");
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
 **drug** | [**Drug**](Drug.md)|  |

### Return type

[**Drug**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteDrug"></a>
# **deleteDrug**
> deleteDrug(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteDrug(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#deleteDrug");
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

<a name="getAllDrugs"></a>
# **getAllDrugs**
> List&lt;Drug&gt; getAllDrugs(criteria, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    DrugCriteria criteria = new DrugCriteria(); // DrugCriteria | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<Drug> result = apiInstance.getAllDrugs(criteria, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#getAllDrugs");
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
 **criteria** | [**DrugCriteria**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;Drug&gt;**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getDrug"></a>
# **getDrug**
> Drug getDrug(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      Drug result = apiInstance.getDrug(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#getDrug");
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

[**Drug**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateDrug"></a>
# **partialUpdateDrug**
> Drug partialUpdateDrug(id, drug)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Drug drug = new Drug(); // Drug | 
    try {
      Drug result = apiInstance.partialUpdateDrug(id, drug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#partialUpdateDrug");
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
 **drug** | [**Drug**](Drug.md)|  |

### Return type

[**Drug**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchDrugs"></a>
# **searchDrugs**
> List&lt;Drug&gt; searchDrugs(query, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    String query = "query_example"; // String | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<Drug> result = apiInstance.searchDrugs(query, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#searchDrugs");
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

[**List&lt;Drug&gt;**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateDrug"></a>
# **updateDrug**
> Drug updateDrug(id, drug)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugResourceApi apiInstance = new DrugResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Drug drug = new Drug(); // Drug | 
    try {
      Drug result = apiInstance.updateDrug(id, drug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugResourceApi#updateDrug");
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
 **drug** | [**Drug**](Drug.md)|  |

### Return type

[**Drug**](Drug.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

