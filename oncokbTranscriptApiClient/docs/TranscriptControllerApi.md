# TranscriptControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTranscriptUsingPOST**](TranscriptControllerApi.md#addTranscriptUsingPOST) | **POST** /api/add-transcript | addTranscript
[**compareTranscriptUsingPOST**](TranscriptControllerApi.md#compareTranscriptUsingPOST) | **POST** /api/compare-transcript/{hugoSymbol} | compareTranscript
[**findTranscriptsByEnsemblIdsUsingPOST**](TranscriptControllerApi.md#findTranscriptsByEnsemblIdsUsingPOST) | **POST** /api/find-transcripts-by-ensembl-ids | findTranscriptsByEnsemblIds
[**matchTranscriptUsingPOST**](TranscriptControllerApi.md#matchTranscriptUsingPOST) | **POST** /api/match-transcript/{hugoSymbol} | matchTranscript
[**suggestVariantUsingGET**](TranscriptControllerApi.md#suggestVariantUsingGET) | **GET** /api/suggest-variant/{hugoSymbol} | suggestVariant


<a name="addTranscriptUsingPOST"></a>
# **addTranscriptUsingPOST**
> TranscriptDTO addTranscriptUsingPOST(entrezGeneId, referenceGenome, ensemblTranscriptId, isCanonical)

addTranscript

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    Integer entrezGeneId = 56; // Integer | entrezGeneId
    String referenceGenome = "GRCh37"; // String | referenceGenome
    String ensemblTranscriptId = "ensemblTranscriptId_example"; // String | ensemblTranscriptId
    Boolean isCanonical = true; // Boolean | isCanonical
    try {
      TranscriptDTO result = apiInstance.addTranscriptUsingPOST(entrezGeneId, referenceGenome, ensemblTranscriptId, isCanonical);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#addTranscriptUsingPOST");
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
 **entrezGeneId** | **Integer**| entrezGeneId |
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **ensemblTranscriptId** | **String**| ensemblTranscriptId |
 **isCanonical** | **Boolean**| isCanonical |

### Return type

[**TranscriptDTO**](TranscriptDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="compareTranscriptUsingPOST"></a>
# **compareTranscriptUsingPOST**
> TranscriptComparisonResultVM compareTranscriptUsingPOST(hugoSymbol, transcriptComparisonVM)

compareTranscript

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
    TranscriptComparisonVM transcriptComparisonVM = new TranscriptComparisonVM(); // TranscriptComparisonVM | 
    try {
      TranscriptComparisonResultVM result = apiInstance.compareTranscriptUsingPOST(hugoSymbol, transcriptComparisonVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#compareTranscriptUsingPOST");
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
 **hugoSymbol** | **String**| hugoSymbol |
 **transcriptComparisonVM** | [**TranscriptComparisonVM**](TranscriptComparisonVM.md)|  | [optional]

### Return type

[**TranscriptComparisonResultVM**](TranscriptComparisonResultVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="findTranscriptsByEnsemblIdsUsingPOST"></a>
# **findTranscriptsByEnsemblIdsUsingPOST**
> List&lt;TranscriptDTO&gt; findTranscriptsByEnsemblIdsUsingPOST(referenceGenome, requestBody)

findTranscriptsByEnsemblIds

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String referenceGenome = "GRCh37"; // String | referenceGenome
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      List<TranscriptDTO> result = apiInstance.findTranscriptsByEnsemblIdsUsingPOST(referenceGenome, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#findTranscriptsByEnsemblIdsUsingPOST");
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
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**List&lt;TranscriptDTO&gt;**](TranscriptDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="matchTranscriptUsingPOST"></a>
# **matchTranscriptUsingPOST**
> TranscriptMatchResultVM matchTranscriptUsingPOST(hugoSymbol, matchTranscriptVM)

matchTranscript

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
    MatchTranscriptVM matchTranscriptVM = new MatchTranscriptVM(); // MatchTranscriptVM | 
    try {
      TranscriptMatchResultVM result = apiInstance.matchTranscriptUsingPOST(hugoSymbol, matchTranscriptVM);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#matchTranscriptUsingPOST");
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
 **hugoSymbol** | **String**| hugoSymbol |
 **matchTranscriptVM** | [**MatchTranscriptVM**](MatchTranscriptVM.md)|  | [optional]

### Return type

[**TranscriptMatchResultVM**](TranscriptMatchResultVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="suggestVariantUsingGET"></a>
# **suggestVariantUsingGET**
> AllReferenceTranscriptSuggestionVM suggestVariantUsingGET(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript)

suggestVariant

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    TranscriptControllerApi apiInstance = new TranscriptControllerApi(defaultClient);
    String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
    Integer proteinPosition = 56; // Integer | proteinPosition
    String curatedResidue = "curatedResidue_example"; // String | curatedResidue
    String grch37Transcript = "grch37Transcript_example"; // String | grch37Transcript
    String grch38Transcript = "grch38Transcript_example"; // String | grch38Transcript
    try {
      AllReferenceTranscriptSuggestionVM result = apiInstance.suggestVariantUsingGET(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptControllerApi#suggestVariantUsingGET");
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
 **hugoSymbol** | **String**| hugoSymbol |
 **proteinPosition** | **Integer**| proteinPosition |
 **curatedResidue** | **String**| curatedResidue |
 **grch37Transcript** | **String**| grch37Transcript |
 **grch38Transcript** | **String**| grch38Transcript |

### Return type

[**AllReferenceTranscriptSuggestionVM**](AllReferenceTranscriptSuggestionVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

