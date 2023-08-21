# DrugSynonymResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrugSynonym**](DrugSynonymResourceApi.md#createDrugSynonym) | **POST** /api/drug-synonyms | 
[**deleteDrugSynonym**](DrugSynonymResourceApi.md#deleteDrugSynonym) | **DELETE** /api/drug-synonyms/{id} | 
[**getAllDrugSynonyms**](DrugSynonymResourceApi.md#getAllDrugSynonyms) | **GET** /api/drug-synonyms | 
[**getDrugSynonym**](DrugSynonymResourceApi.md#getDrugSynonym) | **GET** /api/drug-synonyms/{id} | 
[**partialUpdateDrugSynonym**](DrugSynonymResourceApi.md#partialUpdateDrugSynonym) | **PATCH** /api/drug-synonyms/{id} | 
[**updateDrugSynonym**](DrugSynonymResourceApi.md#updateDrugSynonym) | **PUT** /api/drug-synonyms/{id} | 


<a name="createDrugSynonym"></a>
# **createDrugSynonym**
> DrugSynonym createDrugSynonym(drugSynonym)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugSynonymResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugSynonymResourceApi apiInstance = new DrugSynonymResourceApi(defaultClient);
    DrugSynonym drugSynonym = new DrugSynonym(); // DrugSynonym | 
    try {
      DrugSynonym result = apiInstance.createDrugSynonym(drugSynonym);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugSynonymResourceApi#createDrugSynonym");
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
 **drugSynonym** | [**DrugSynonym**](DrugSynonym.md)|  |

### Return type

[**DrugSynonym**](DrugSynonym.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteDrugSynonym"></a>
# **deleteDrugSynonym**
> deleteDrugSynonym(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugSynonymResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugSynonymResourceApi apiInstance = new DrugSynonymResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteDrugSynonym(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugSynonymResourceApi#deleteDrugSynonym");
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

<a name="getAllDrugSynonyms"></a>
# **getAllDrugSynonyms**
> List&lt;DrugSynonym&gt; getAllDrugSynonyms()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugSynonymResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugSynonymResourceApi apiInstance = new DrugSynonymResourceApi(defaultClient);
    try {
      List<DrugSynonym> result = apiInstance.getAllDrugSynonyms();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugSynonymResourceApi#getAllDrugSynonyms");
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

[**List&lt;DrugSynonym&gt;**](DrugSynonym.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getDrugSynonym"></a>
# **getDrugSynonym**
> DrugSynonym getDrugSynonym(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugSynonymResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugSynonymResourceApi apiInstance = new DrugSynonymResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      DrugSynonym result = apiInstance.getDrugSynonym(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugSynonymResourceApi#getDrugSynonym");
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

[**DrugSynonym**](DrugSynonym.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateDrugSynonym"></a>
# **partialUpdateDrugSynonym**
> DrugSynonym partialUpdateDrugSynonym(id, drugSynonym)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugSynonymResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugSynonymResourceApi apiInstance = new DrugSynonymResourceApi(defaultClient);
    Long id = 56L; // Long | 
    DrugSynonym drugSynonym = new DrugSynonym(); // DrugSynonym | 
    try {
      DrugSynonym result = apiInstance.partialUpdateDrugSynonym(id, drugSynonym);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugSynonymResourceApi#partialUpdateDrugSynonym");
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
 **drugSynonym** | [**DrugSynonym**](DrugSynonym.md)|  |

### Return type

[**DrugSynonym**](DrugSynonym.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateDrugSynonym"></a>
# **updateDrugSynonym**
> DrugSynonym updateDrugSynonym(id, drugSynonym)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugSynonymResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugSynonymResourceApi apiInstance = new DrugSynonymResourceApi(defaultClient);
    Long id = 56L; // Long | 
    DrugSynonym drugSynonym = new DrugSynonym(); // DrugSynonym | 
    try {
      DrugSynonym result = apiInstance.updateDrugSynonym(id, drugSynonym);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugSynonymResourceApi#updateDrugSynonym");
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
 **drugSynonym** | [**DrugSynonym**](DrugSynonym.md)|  |

### Return type

[**DrugSynonym**](DrugSynonym.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

