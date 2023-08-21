# SequenceResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSequence**](SequenceResourceApi.md#createSequence) | **POST** /api/sequences | 
[**deleteSequence**](SequenceResourceApi.md#deleteSequence) | **DELETE** /api/sequences/{id} | 
[**getAllSequences**](SequenceResourceApi.md#getAllSequences) | **GET** /api/sequences | 
[**getSequence**](SequenceResourceApi.md#getSequence) | **GET** /api/sequences/{id} | 
[**partialUpdateSequence**](SequenceResourceApi.md#partialUpdateSequence) | **PATCH** /api/sequences/{id} | 
[**updateSequence**](SequenceResourceApi.md#updateSequence) | **PUT** /api/sequences/{id} | 


<a name="createSequence"></a>
# **createSequence**
> Sequence createSequence(sequence)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceResourceApi apiInstance = new SequenceResourceApi(defaultClient);
    Sequence sequence = new Sequence(); // Sequence | 
    try {
      Sequence result = apiInstance.createSequence(sequence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceResourceApi#createSequence");
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
 **sequence** | [**Sequence**](Sequence.md)|  |

### Return type

[**Sequence**](Sequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteSequence"></a>
# **deleteSequence**
> deleteSequence(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceResourceApi apiInstance = new SequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteSequence(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceResourceApi#deleteSequence");
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

<a name="getAllSequences"></a>
# **getAllSequences**
> List&lt;Sequence&gt; getAllSequences(pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceResourceApi apiInstance = new SequenceResourceApi(defaultClient);
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<Sequence> result = apiInstance.getAllSequences(pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceResourceApi#getAllSequences");
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

### Return type

[**List&lt;Sequence&gt;**](Sequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getSequence"></a>
# **getSequence**
> Sequence getSequence(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceResourceApi apiInstance = new SequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      Sequence result = apiInstance.getSequence(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceResourceApi#getSequence");
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

[**Sequence**](Sequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateSequence"></a>
# **partialUpdateSequence**
> Sequence partialUpdateSequence(id, sequence)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceResourceApi apiInstance = new SequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Sequence sequence = new Sequence(); // Sequence | 
    try {
      Sequence result = apiInstance.partialUpdateSequence(id, sequence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceResourceApi#partialUpdateSequence");
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
 **sequence** | [**Sequence**](Sequence.md)|  |

### Return type

[**Sequence**](Sequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateSequence"></a>
# **updateSequence**
> Sequence updateSequence(id, sequence)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceResourceApi apiInstance = new SequenceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    Sequence sequence = new Sequence(); // Sequence | 
    try {
      Sequence result = apiInstance.updateSequence(id, sequence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceResourceApi#updateSequence");
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
 **sequence** | [**Sequence**](Sequence.md)|  |

### Return type

[**Sequence**](Sequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

