# ClinicalTrialsGovConditionResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countClinicalTrialsGovConditions**](ClinicalTrialsGovConditionResourceApi.md#countClinicalTrialsGovConditions) | **GET** /api/clinical-trials-gov-conditions/count | 
[**createClinicalTrialsGovCondition**](ClinicalTrialsGovConditionResourceApi.md#createClinicalTrialsGovCondition) | **POST** /api/clinical-trials-gov-conditions | 
[**deleteClinicalTrialsGovCondition**](ClinicalTrialsGovConditionResourceApi.md#deleteClinicalTrialsGovCondition) | **DELETE** /api/clinical-trials-gov-conditions/{id} | 
[**getAllClinicalTrialsGovConditions**](ClinicalTrialsGovConditionResourceApi.md#getAllClinicalTrialsGovConditions) | **GET** /api/clinical-trials-gov-conditions | 
[**getClinicalTrialsGovCondition**](ClinicalTrialsGovConditionResourceApi.md#getClinicalTrialsGovCondition) | **GET** /api/clinical-trials-gov-conditions/{id} | 
[**partialUpdateClinicalTrialsGovCondition**](ClinicalTrialsGovConditionResourceApi.md#partialUpdateClinicalTrialsGovCondition) | **PATCH** /api/clinical-trials-gov-conditions/{id} | 
[**searchClinicalTrialsGovConditions**](ClinicalTrialsGovConditionResourceApi.md#searchClinicalTrialsGovConditions) | **GET** /api/_search/clinical-trials-gov-conditions | 
[**updateClinicalTrialsGovCondition**](ClinicalTrialsGovConditionResourceApi.md#updateClinicalTrialsGovCondition) | **PUT** /api/clinical-trials-gov-conditions/{id} | 


<a name="countClinicalTrialsGovConditions"></a>
# **countClinicalTrialsGovConditions**
> Long countClinicalTrialsGovConditions(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    ClinicalTrialsGovConditionCriteria criteria = new ClinicalTrialsGovConditionCriteria(); // ClinicalTrialsGovConditionCriteria | 
    try {
      Long result = apiInstance.countClinicalTrialsGovConditions(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#countClinicalTrialsGovConditions");
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
 **criteria** | [**ClinicalTrialsGovConditionCriteria**](.md)|  |

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

<a name="createClinicalTrialsGovCondition"></a>
# **createClinicalTrialsGovCondition**
> ClinicalTrialsGovCondition createClinicalTrialsGovCondition(clinicalTrialsGovCondition)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    ClinicalTrialsGovCondition clinicalTrialsGovCondition = new ClinicalTrialsGovCondition(); // ClinicalTrialsGovCondition | 
    try {
      ClinicalTrialsGovCondition result = apiInstance.createClinicalTrialsGovCondition(clinicalTrialsGovCondition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#createClinicalTrialsGovCondition");
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
 **clinicalTrialsGovCondition** | [**ClinicalTrialsGovCondition**](ClinicalTrialsGovCondition.md)|  |

### Return type

[**ClinicalTrialsGovCondition**](ClinicalTrialsGovCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteClinicalTrialsGovCondition"></a>
# **deleteClinicalTrialsGovCondition**
> deleteClinicalTrialsGovCondition(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteClinicalTrialsGovCondition(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#deleteClinicalTrialsGovCondition");
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

<a name="getAllClinicalTrialsGovConditions"></a>
# **getAllClinicalTrialsGovConditions**
> List&lt;ClinicalTrialsGovCondition&gt; getAllClinicalTrialsGovConditions(criteria, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    ClinicalTrialsGovConditionCriteria criteria = new ClinicalTrialsGovConditionCriteria(); // ClinicalTrialsGovConditionCriteria | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<ClinicalTrialsGovCondition> result = apiInstance.getAllClinicalTrialsGovConditions(criteria, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#getAllClinicalTrialsGovConditions");
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
 **criteria** | [**ClinicalTrialsGovConditionCriteria**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;ClinicalTrialsGovCondition&gt;**](ClinicalTrialsGovCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getClinicalTrialsGovCondition"></a>
# **getClinicalTrialsGovCondition**
> ClinicalTrialsGovCondition getClinicalTrialsGovCondition(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      ClinicalTrialsGovCondition result = apiInstance.getClinicalTrialsGovCondition(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#getClinicalTrialsGovCondition");
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

[**ClinicalTrialsGovCondition**](ClinicalTrialsGovCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateClinicalTrialsGovCondition"></a>
# **partialUpdateClinicalTrialsGovCondition**
> ClinicalTrialsGovCondition partialUpdateClinicalTrialsGovCondition(id, clinicalTrialsGovCondition)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    ClinicalTrialsGovCondition clinicalTrialsGovCondition = new ClinicalTrialsGovCondition(); // ClinicalTrialsGovCondition | 
    try {
      ClinicalTrialsGovCondition result = apiInstance.partialUpdateClinicalTrialsGovCondition(id, clinicalTrialsGovCondition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#partialUpdateClinicalTrialsGovCondition");
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
 **clinicalTrialsGovCondition** | [**ClinicalTrialsGovCondition**](ClinicalTrialsGovCondition.md)|  |

### Return type

[**ClinicalTrialsGovCondition**](ClinicalTrialsGovCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchClinicalTrialsGovConditions"></a>
# **searchClinicalTrialsGovConditions**
> List&lt;ClinicalTrialsGovCondition&gt; searchClinicalTrialsGovConditions(query, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    String query = "query_example"; // String | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<ClinicalTrialsGovCondition> result = apiInstance.searchClinicalTrialsGovConditions(query, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#searchClinicalTrialsGovConditions");
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

[**List&lt;ClinicalTrialsGovCondition&gt;**](ClinicalTrialsGovCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateClinicalTrialsGovCondition"></a>
# **updateClinicalTrialsGovCondition**
> ClinicalTrialsGovCondition updateClinicalTrialsGovCondition(id, clinicalTrialsGovCondition)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ClinicalTrialsGovConditionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ClinicalTrialsGovConditionResourceApi apiInstance = new ClinicalTrialsGovConditionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    ClinicalTrialsGovCondition clinicalTrialsGovCondition = new ClinicalTrialsGovCondition(); // ClinicalTrialsGovCondition | 
    try {
      ClinicalTrialsGovCondition result = apiInstance.updateClinicalTrialsGovCondition(id, clinicalTrialsGovCondition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClinicalTrialsGovConditionResourceApi#updateClinicalTrialsGovCondition");
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
 **clinicalTrialsGovCondition** | [**ClinicalTrialsGovCondition**](ClinicalTrialsGovCondition.md)|  |

### Return type

[**ClinicalTrialsGovCondition**](ClinicalTrialsGovCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

