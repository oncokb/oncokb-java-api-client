# AlterationResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countAlterations**](AlterationResourceApi.md#countAlterations) | **GET** /api/alterations/count | 
[**createAlteration**](AlterationResourceApi.md#createAlteration) | **POST** /api/alterations | 
[**deleteAlteration**](AlterationResourceApi.md#deleteAlteration) | **DELETE** /api/alterations/{id} | 
[**findByGeneId**](AlterationResourceApi.md#findByGeneId) | **GET** /api/alterations/gene/{id} | 
[**getAllAlterations**](AlterationResourceApi.md#getAllAlterations) | **GET** /api/alterations | 
[**getAlteration**](AlterationResourceApi.md#getAlteration) | **GET** /api/alterations/{id} | 
[**partialUpdateAlteration**](AlterationResourceApi.md#partialUpdateAlteration) | **PATCH** /api/alterations/{id} | 
[**searchAlterations**](AlterationResourceApi.md#searchAlterations) | **GET** /api/_search/alterations | 
[**updateAlteration**](AlterationResourceApi.md#updateAlteration) | **PUT** /api/alterations/{id} | 


<a name="countAlterations"></a>
# **countAlterations**
> Long countAlterations(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    AlterationCriteria criteria = new AlterationCriteria(); // AlterationCriteria | 
    try {
      Long result = apiInstance.countAlterations(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#countAlterations");
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
 **criteria** | [**AlterationCriteria**](.md)|  |

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

<a name="createAlteration"></a>
# **createAlteration**
> Alteration createAlteration(alteration)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    Alteration alteration = new Alteration(); // Alteration | 
    try {
      Alteration result = apiInstance.createAlteration(alteration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#createAlteration");
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
 **alteration** | [**Alteration**](Alteration.md)|  |

### Return type

[**Alteration**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteAlteration"></a>
# **deleteAlteration**
> deleteAlteration(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteAlteration(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#deleteAlteration");
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

<a name="findByGeneId"></a>
# **findByGeneId**
> List&lt;Alteration&gt; findByGeneId(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      List<Alteration> result = apiInstance.findByGeneId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#findByGeneId");
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

[**List&lt;Alteration&gt;**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllAlterations"></a>
# **getAllAlterations**
> List&lt;Alteration&gt; getAllAlterations(criteria, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    AlterationCriteria criteria = new AlterationCriteria(); // AlterationCriteria | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<Alteration> result = apiInstance.getAllAlterations(criteria, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#getAllAlterations");
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
 **criteria** | [**AlterationCriteria**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;Alteration&gt;**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAlteration"></a>
# **getAlteration**
> Alteration getAlteration(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      Alteration result = apiInstance.getAlteration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#getAlteration");
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

[**Alteration**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateAlteration"></a>
# **partialUpdateAlteration**
> Alteration partialUpdateAlteration(id, alteration)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Alteration alteration = new Alteration(); // Alteration | 
    try {
      Alteration result = apiInstance.partialUpdateAlteration(id, alteration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#partialUpdateAlteration");
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
 **alteration** | [**Alteration**](Alteration.md)|  |

### Return type

[**Alteration**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchAlterations"></a>
# **searchAlterations**
> List&lt;Alteration&gt; searchAlterations(query, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    String query = "query_example"; // String | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<Alteration> result = apiInstance.searchAlterations(query, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#searchAlterations");
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

[**List&lt;Alteration&gt;**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateAlteration"></a>
# **updateAlteration**
> Alteration updateAlteration(id, alteration)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AlterationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AlterationResourceApi apiInstance = new AlterationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Alteration alteration = new Alteration(); // Alteration | 
    try {
      Alteration result = apiInstance.updateAlteration(id, alteration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlterationResourceApi#updateAlteration");
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
 **alteration** | [**Alteration**](Alteration.md)|  |

### Return type

[**Alteration**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

