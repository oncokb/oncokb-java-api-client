# TranscriptControllerApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTranscript**](TranscriptControllerApi.md#addTranscript) | **POST** /api/add-transcript | 
[**compareTranscript**](TranscriptControllerApi.md#compareTranscript) | **POST** /api/compare-transcript/{hugoSymbol} | 
[**findTranscriptsByEnsemblIds**](TranscriptControllerApi.md#findTranscriptsByEnsemblIds) | **POST** /api/find-transcripts-by-ensembl-ids | 
[**matchTranscript**](TranscriptControllerApi.md#matchTranscript) | **POST** /api/match-transcript/{hugoSymbol} | 
[**suggestVariant**](TranscriptControllerApi.md#suggestVariant) | **GET** /api/suggest-variant/{hugoSymbol} | 


<a name="addTranscript"></a>
# **addTranscript**
> TranscriptDTO addTranscript(addTranscriptBody)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    AddTranscriptBody addTranscriptBody = new AddTranscriptBody(); // AddTranscriptBody | 
    try {
      TranscriptDTO result = apiInstance.addTranscript(addTranscriptBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#addTranscript");
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
 **addTranscriptBody** | [**AddTranscriptBody**](AddTranscriptBody.md)|  |

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

<a name="compareTranscript"></a>
# **compareTranscript**
> TranscriptComparisonResultVM compareTranscript(hugoSymbol, transcriptComparisonVM)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String hugoSymbol = "hugoSymbol_example"; // String | 
    TranscriptComparisonVM transcriptComparisonVM = new TranscriptComparisonVM(); // TranscriptComparisonVM | 
    try {
      TranscriptComparisonResultVM result = apiInstance.compareTranscript(hugoSymbol, transcriptComparisonVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#compareTranscript");
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
 **hugoSymbol** | **String**|  |
 **transcriptComparisonVM** | [**TranscriptComparisonVM**](TranscriptComparisonVM.md)|  |

### Return type

[**TranscriptComparisonResultVM**](TranscriptComparisonResultVM.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="findTranscriptsByEnsemblIds"></a>
# **findTranscriptsByEnsemblIds**
> List&lt;TranscriptDTO&gt; findTranscriptsByEnsemblIds(referenceGenome, requestBody)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String referenceGenome = "GRCh37"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      List<TranscriptDTO> result = apiInstance.findTranscriptsByEnsemblIds(referenceGenome, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#findTranscriptsByEnsemblIds");
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
 **referenceGenome** | **String**|  | [enum: GRCh37, GRCh38]
 **requestBody** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**List&lt;TranscriptDTO&gt;**](TranscriptDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="matchTranscript"></a>
# **matchTranscript**
> TranscriptMatchResultVM matchTranscript(hugoSymbol, matchTranscriptVM)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String hugoSymbol = "hugoSymbol_example"; // String | 
    MatchTranscriptVM matchTranscriptVM = new MatchTranscriptVM(); // MatchTranscriptVM | 
    try {
      TranscriptMatchResultVM result = apiInstance.matchTranscript(hugoSymbol, matchTranscriptVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#matchTranscript");
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
 **hugoSymbol** | **String**|  |
 **matchTranscriptVM** | [**MatchTranscriptVM**](MatchTranscriptVM.md)|  |

### Return type

[**TranscriptMatchResultVM**](TranscriptMatchResultVM.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="suggestVariant"></a>
# **suggestVariant**
> AllReferenceTranscriptSuggestionVM suggestVariant(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String hugoSymbol = "hugoSymbol_example"; // String | 
    Integer proteinPosition = 56; // Integer | 
    String curatedResidue = "curatedResidue_example"; // String | 
    String grch37Transcript = "grch37Transcript_example"; // String | 
    String grch38Transcript = "grch38Transcript_example"; // String | 
    try {
      AllReferenceTranscriptSuggestionVM result = apiInstance.suggestVariant(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#suggestVariant");
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
 **hugoSymbol** | **String**|  |
 **proteinPosition** | **Integer**|  |
 **curatedResidue** | **String**|  |
 **grch37Transcript** | **String**|  |
 **grch38Transcript** | **String**|  |

### Return type

[**AllReferenceTranscriptSuggestionVM**](AllReferenceTranscriptSuggestionVM.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

