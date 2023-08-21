# ConsequenceResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConsequence**](ConsequenceResourceApi.md#createConsequence) | **POST** /api/consequences | 
[**deleteConsequence**](ConsequenceResourceApi.md#deleteConsequence) | **DELETE** /api/consequences/{id} | 
[**getAllConsequences**](ConsequenceResourceApi.md#getAllConsequences) | **GET** /api/consequences | 
[**getConsequence**](ConsequenceResourceApi.md#getConsequence) | **GET** /api/consequences/{id} | 
[**partialUpdateConsequence**](ConsequenceResourceApi.md#partialUpdateConsequence) | **PATCH** /api/consequences/{id} | 
[**updateConsequence**](ConsequenceResourceApi.md#updateConsequence) | **PUT** /api/consequences/{id} | 


<a name="createConsequence"></a>
# **createConsequence**
> Consequence createConsequence(consequence)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ConsequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ConsequenceResourceApi apiInstance = new ConsequenceResourceApi(defaultClient);
    Consequence consequence = new Consequence(); // Consequence | 
    try {
      Consequence result = apiInstance.createConsequence(consequence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsequenceResourceApi#createConsequence");
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
 **consequence** | [**Consequence**](Consequence.md)|  |

### Return type

[**Consequence**](Consequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteConsequence"></a>
# **deleteConsequence**
> deleteConsequence(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ConsequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ConsequenceResourceApi apiInstance = new ConsequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteConsequence(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsequenceResourceApi#deleteConsequence");
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

<a name="getAllConsequences"></a>
# **getAllConsequences**
> List&lt;Consequence&gt; getAllConsequences()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ConsequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ConsequenceResourceApi apiInstance = new ConsequenceResourceApi(defaultClient);
    try {
      List<Consequence> result = apiInstance.getAllConsequences();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsequenceResourceApi#getAllConsequences");
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

[**List&lt;Consequence&gt;**](Consequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getConsequence"></a>
# **getConsequence**
> Consequence getConsequence(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ConsequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ConsequenceResourceApi apiInstance = new ConsequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      Consequence result = apiInstance.getConsequence(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsequenceResourceApi#getConsequence");
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

[**Consequence**](Consequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateConsequence"></a>
# **partialUpdateConsequence**
> Consequence partialUpdateConsequence(id, consequence)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ConsequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ConsequenceResourceApi apiInstance = new ConsequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Consequence consequence = new Consequence(); // Consequence | 
    try {
      Consequence result = apiInstance.partialUpdateConsequence(id, consequence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsequenceResourceApi#partialUpdateConsequence");
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
 **consequence** | [**Consequence**](Consequence.md)|  |

### Return type

[**Consequence**](Consequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateConsequence"></a>
# **updateConsequence**
> Consequence updateConsequence(id, consequence)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.ConsequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    ConsequenceResourceApi apiInstance = new ConsequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Consequence consequence = new Consequence(); // Consequence | 
    try {
      Consequence result = apiInstance.updateConsequence(id, consequence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsequenceResourceApi#updateConsequence");
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
 **consequence** | [**Consequence**](Consequence.md)|  |

### Return type

[**Consequence**](Consequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

