# SequenceControllerApi

All URIs are relative to *https://beta.transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCanonicalSequenceUsingGET**](SequenceControllerApi.md#findCanonicalSequenceUsingGET) | **GET** /api/find-canonical-sequence | findCanonicalSequence
[**findCanonicalSequencesUsingPOST**](SequenceControllerApi.md#findCanonicalSequencesUsingPOST) | **POST** /api/find-canonical-sequences | findCanonicalSequences

<a name="findCanonicalSequenceUsingGET"></a>
# **findCanonicalSequenceUsingGET**
> Sequence findCanonicalSequenceUsingGET(referenceGenome, entrezGeneId, sequenceType)

findCanonicalSequence

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceControllerApi apiInstance = new SequenceControllerApi();
String referenceGenome = "referenceGenome_example"; // String | referenceGenome
Integer entrezGeneId = 56; // Integer | entrezGeneId
String sequenceType = "sequenceType_example"; // String | sequenceType
try {
    Sequence result = apiInstance.findCanonicalSequenceUsingGET(referenceGenome, entrezGeneId, sequenceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceControllerApi#findCanonicalSequenceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **entrezGeneId** | **Integer**| entrezGeneId |
 **sequenceType** | **String**| sequenceType | [optional] [enum: CDNA, PROTEIN]

### Return type

[**Sequence**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findCanonicalSequencesUsingPOST"></a>
# **findCanonicalSequencesUsingPOST**
> List&lt;Sequence&gt; findCanonicalSequencesUsingPOST(referenceGenome, body, sequenceType)

findCanonicalSequences

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceControllerApi apiInstance = new SequenceControllerApi();
String referenceGenome = "referenceGenome_example"; // String | referenceGenome
List<Integer> body = Arrays.asList(56); // List<Integer> | 
String sequenceType = "sequenceType_example"; // String | sequenceType
try {
    List<Sequence> result = apiInstance.findCanonicalSequencesUsingPOST(referenceGenome, body, sequenceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceControllerApi#findCanonicalSequencesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **body** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **sequenceType** | **String**| sequenceType | [optional] [enum: CDNA, PROTEIN]

### Return type

[**List&lt;Sequence&gt;**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

