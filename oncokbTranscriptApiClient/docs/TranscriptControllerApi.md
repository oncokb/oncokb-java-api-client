# TranscriptControllerApi

All URIs are relative to *https://beta.transcript.oncokb.org:443*

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
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptControllerApi apiInstance = new TranscriptControllerApi();
Integer entrezGeneId = 56; // Integer | entrezGeneId
String referenceGenome = "referenceGenome_example"; // String | referenceGenome
String ensemblTranscriptId = "ensemblTranscriptId_example"; // String | ensemblTranscriptId
Boolean isCanonical = true; // Boolean | isCanonical
try {
    TranscriptDTO result = apiInstance.addTranscriptUsingPOST(entrezGeneId, referenceGenome, ensemblTranscriptId, isCanonical);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#addTranscriptUsingPOST");
    e.printStackTrace();
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

<a name="compareTranscriptUsingPOST"></a>
# **compareTranscriptUsingPOST**
> TranscriptComparisonResultVM compareTranscriptUsingPOST(hugoSymbol, body)

compareTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptControllerApi apiInstance = new TranscriptControllerApi();
String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
TranscriptComparisonVM body = new TranscriptComparisonVM(); // TranscriptComparisonVM | 
try {
    TranscriptComparisonResultVM result = apiInstance.compareTranscriptUsingPOST(hugoSymbol, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#compareTranscriptUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| hugoSymbol |
 **body** | [**TranscriptComparisonVM**](TranscriptComparisonVM.md)|  | [optional]

### Return type

[**TranscriptComparisonResultVM**](TranscriptComparisonResultVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findTranscriptsByEnsemblIdsUsingPOST"></a>
# **findTranscriptsByEnsemblIdsUsingPOST**
> List&lt;TranscriptDTO&gt; findTranscriptsByEnsemblIdsUsingPOST(referenceGenome, body)

findTranscriptsByEnsemblIds

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptControllerApi apiInstance = new TranscriptControllerApi();
String referenceGenome = "referenceGenome_example"; // String | referenceGenome
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    List<TranscriptDTO> result = apiInstance.findTranscriptsByEnsemblIdsUsingPOST(referenceGenome, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#findTranscriptsByEnsemblIdsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**List&lt;TranscriptDTO&gt;**](TranscriptDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="matchTranscriptUsingPOST"></a>
# **matchTranscriptUsingPOST**
> TranscriptMatchResultVM matchTranscriptUsingPOST(hugoSymbol, body)

matchTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptControllerApi apiInstance = new TranscriptControllerApi();
String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
MatchTranscriptVM body = new MatchTranscriptVM(); // MatchTranscriptVM | 
try {
    TranscriptMatchResultVM result = apiInstance.matchTranscriptUsingPOST(hugoSymbol, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#matchTranscriptUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| hugoSymbol |
 **body** | [**MatchTranscriptVM**](MatchTranscriptVM.md)|  | [optional]

### Return type

[**TranscriptMatchResultVM**](TranscriptMatchResultVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="suggestVariantUsingGET"></a>
# **suggestVariantUsingGET**
> AllReferenceTranscriptSuggestionVM suggestVariantUsingGET(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript)

suggestVariant

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptControllerApi apiInstance = new TranscriptControllerApi();
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
    e.printStackTrace();
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

