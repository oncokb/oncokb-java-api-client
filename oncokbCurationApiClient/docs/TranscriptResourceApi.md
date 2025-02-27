# TranscriptResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTranscript**](TranscriptResourceApi.md#createTranscript) | **POST** /api/transcripts | 
[**deleteTranscript**](TranscriptResourceApi.md#deleteTranscript) | **DELETE** /api/transcripts/{id} | 
[**getAllTranscripts**](TranscriptResourceApi.md#getAllTranscripts) | **GET** /api/transcripts | 
[**getTranscript**](TranscriptResourceApi.md#getTranscript) | **GET** /api/transcripts/{id} | 
[**partialUpdateTranscript**](TranscriptResourceApi.md#partialUpdateTranscript) | **PATCH** /api/transcripts/{id} | 
[**updateTranscript**](TranscriptResourceApi.md#updateTranscript) | **PUT** /api/transcripts/{id} | 


<a name="createTranscript"></a>
# **createTranscript**
> TranscriptDTO createTranscript(transcriptDTO)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptResourceApi apiInstance = new TranscriptResourceApi(defaultClient);
    TranscriptDTO transcriptDTO = new TranscriptDTO(); // TranscriptDTO | 
    try {
      TranscriptDTO result = apiInstance.createTranscript(transcriptDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptResourceApi#createTranscript");
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
 **transcriptDTO** | [**TranscriptDTO**](TranscriptDTO.md)|  |

### Return type

[**TranscriptDTO**](TranscriptDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteTranscript"></a>
# **deleteTranscript**
> deleteTranscript(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptResourceApi apiInstance = new TranscriptResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteTranscript(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptResourceApi#deleteTranscript");
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

<a name="getAllTranscripts"></a>
# **getAllTranscripts**
> List&lt;TranscriptDTO&gt; getAllTranscripts(pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptResourceApi apiInstance = new TranscriptResourceApi(defaultClient);
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<TranscriptDTO> result = apiInstance.getAllTranscripts(pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptResourceApi#getAllTranscripts");
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

[**List&lt;TranscriptDTO&gt;**](TranscriptDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getTranscript"></a>
# **getTranscript**
> TranscriptDTO getTranscript(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptResourceApi apiInstance = new TranscriptResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      TranscriptDTO result = apiInstance.getTranscript(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptResourceApi#getTranscript");
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

[**TranscriptDTO**](TranscriptDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateTranscript"></a>
# **partialUpdateTranscript**
> TranscriptDTO partialUpdateTranscript(id, transcriptDTO)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptResourceApi apiInstance = new TranscriptResourceApi(defaultClient);
    Long id = 56L; // Long | 
    TranscriptDTO transcriptDTO = new TranscriptDTO(); // TranscriptDTO | 
    try {
      TranscriptDTO result = apiInstance.partialUpdateTranscript(id, transcriptDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptResourceApi#partialUpdateTranscript");
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
 **transcriptDTO** | [**TranscriptDTO**](TranscriptDTO.md)|  |

### Return type

[**TranscriptDTO**](TranscriptDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateTranscript"></a>
# **updateTranscript**
> TranscriptDTO updateTranscript(id, transcriptDTO)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptResourceApi apiInstance = new TranscriptResourceApi(defaultClient);
    Long id = 56L; // Long | 
    TranscriptDTO transcriptDTO = new TranscriptDTO(); // TranscriptDTO | 
    try {
      TranscriptDTO result = apiInstance.updateTranscript(id, transcriptDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptResourceApi#updateTranscript");
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
 **transcriptDTO** | [**TranscriptDTO**](TranscriptDTO.md)|  |

### Return type

[**TranscriptDTO**](TranscriptDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

