# TranscriptControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compareEnsemblTranscriptUsingPOST**](TranscriptControllerApi.md#compareEnsemblTranscriptUsingPOST) | **POST** /api/compare-ensembl-transcript | compareEnsemblTranscript
[**compareTranscriptUsingPOST**](TranscriptControllerApi.md#compareTranscriptUsingPOST) | **POST** /api/compare-transcript/{hugoSymbol} | compareTranscript
[**findGrch38VariantUsingGET**](TranscriptControllerApi.md#findGrch38VariantUsingGET) | **GET** /api/find-grch38-variant | findGrch38Variant
[**findTranscriptsByEnsemblIdsUsingPOST**](TranscriptControllerApi.md#findTranscriptsByEnsemblIdsUsingPOST) | **POST** /api/find-transcripts-by-ensembl-ids | findTranscriptsByEnsemblIds
[**getAlignmentsUsingPOST**](TranscriptControllerApi.md#getAlignmentsUsingPOST) | **POST** /api/get-alignments/{hugoSymbol} | getAlignments
[**getTranscriptUsingGET**](TranscriptControllerApi.md#getTranscriptUsingGET) | **GET** /api/get-sequence | getTranscript
[**getTranscriptUsingGET1**](TranscriptControllerApi.md#getTranscriptUsingGET1) | **GET** /api/get-transcript/{hugoSymbol} | getTranscript
[**matchTranscriptUsingPOST**](TranscriptControllerApi.md#matchTranscriptUsingPOST) | **POST** /api/match-transcript/{hugoSymbol} | matchTranscript
[**suggestVariantUsingGET**](TranscriptControllerApi.md#suggestVariantUsingGET) | **GET** /api/suggest-variant/{hugoSymbol} | suggestVariant
[**updateTranscriptUsageUsingPOST**](TranscriptControllerApi.md#updateTranscriptUsageUsingPOST) | **POST** /api/update-transcript-usage-source | updateTranscriptUsage

<a name="compareEnsemblTranscriptUsingPOST"></a>
# **compareEnsemblTranscriptUsingPOST**
> TranscriptComparisonResultVM compareEnsemblTranscriptUsingPOST(body)

compareEnsemblTranscript

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
TranscriptComparisonVM body = new TranscriptComparisonVM(); // TranscriptComparisonVM | 
try {
    TranscriptComparisonResultVM result = apiInstance.compareEnsemblTranscriptUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#compareEnsemblTranscriptUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TranscriptComparisonVM**](TranscriptComparisonVM.md)|  | [optional]

### Return type

[**TranscriptComparisonResultVM**](TranscriptComparisonResultVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="findGrch38VariantUsingGET"></a>
# **findGrch38VariantUsingGET**
> TranscriptSuggestionVM findGrch38VariantUsingGET(referenceAminoAcid, proteinPosition, grch37ProteinId, grch38ProteinId)

findGrch38Variant

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
String referenceAminoAcid = "referenceAminoAcid_example"; // String | referenceAminoAcid
Integer proteinPosition = 56; // Integer | proteinPosition
String grch37ProteinId = "grch37ProteinId_example"; // String | grch37ProteinId
String grch38ProteinId = "grch38ProteinId_example"; // String | grch38ProteinId
try {
    TranscriptSuggestionVM result = apiInstance.findGrch38VariantUsingGET(referenceAminoAcid, proteinPosition, grch37ProteinId, grch38ProteinId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#findGrch38VariantUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceAminoAcid** | **String**| referenceAminoAcid |
 **proteinPosition** | **Integer**| proteinPosition |
 **grch37ProteinId** | **String**| grch37ProteinId |
 **grch38ProteinId** | **String**| grch38ProteinId |

### Return type

[**TranscriptSuggestionVM**](TranscriptSuggestionVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="getAlignmentsUsingPOST"></a>
# **getAlignmentsUsingPOST**
> List&lt;EnrichedAlignmentResult&gt; getAlignmentsUsingPOST(hugoSymbol, body)

getAlignments

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
    List<EnrichedAlignmentResult> result = apiInstance.getAlignmentsUsingPOST(hugoSymbol, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#getAlignmentsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| hugoSymbol |
 **body** | [**MatchTranscriptVM**](MatchTranscriptVM.md)|  | [optional]

### Return type

[**List&lt;EnrichedAlignmentResult&gt;**](EnrichedAlignmentResult.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTranscriptUsingGET"></a>
# **getTranscriptUsingGET**
> String getTranscriptUsingGET(referenceGenome, transcript)

getTranscript

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
String transcript = "transcript_example"; // String | transcript
try {
    String result = apiInstance.getTranscriptUsingGET(referenceGenome, transcript);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#getTranscriptUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **transcript** | **String**| transcript |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTranscriptUsingGET1"></a>
# **getTranscriptUsingGET1**
> TranscriptResultVM getTranscriptUsingGET1(hugoSymbol)

getTranscript

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
try {
    TranscriptResultVM result = apiInstance.getTranscriptUsingGET1(hugoSymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#getTranscriptUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hugoSymbol** | **String**| hugoSymbol |

### Return type

[**TranscriptResultVM**](TranscriptResultVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="updateTranscriptUsageUsingPOST"></a>
# **updateTranscriptUsageUsingPOST**
> updateTranscriptUsageUsingPOST(usageSource, hugoSymbol, entrezGeneId, referenceGenome, ensemblTranscriptId)

updateTranscriptUsage

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
String usageSource = "usageSource_example"; // String | usageSource
String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
Integer entrezGeneId = 56; // Integer | entrezGeneId
String referenceGenome = "referenceGenome_example"; // String | referenceGenome
String ensemblTranscriptId = "ensemblTranscriptId_example"; // String | ensemblTranscriptId
try {
    apiInstance.updateTranscriptUsageUsingPOST(usageSource, hugoSymbol, entrezGeneId, referenceGenome, ensemblTranscriptId);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptControllerApi#updateTranscriptUsageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usageSource** | **String**| usageSource | [enum: ONCOKB]
 **hugoSymbol** | **String**| hugoSymbol |
 **entrezGeneId** | **Integer**| entrezGeneId |
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **ensemblTranscriptId** | **String**| ensemblTranscriptId |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

