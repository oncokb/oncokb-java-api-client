# SequenceControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCanonicalSequenceUsingGET**](SequenceControllerApi.md#findCanonicalSequenceUsingGET) | **GET** /api/find-canonical-sequences | findCanonicalSequence
[**findCanonicalSequencesUsingPOST**](SequenceControllerApi.md#findCanonicalSequencesUsingPOST) | **POST** /api/find-canonical-sequences | findCanonicalSequences


<a name="findCanonicalSequenceUsingGET"></a>
# **findCanonicalSequenceUsingGET**
> Sequence findCanonicalSequenceUsingGET(referenceGenome, entrezGeneId, sequenceType)

findCanonicalSequence

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.SequenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    SequenceControllerApi apiInstance = new SequenceControllerApi(defaultClient);
    String referenceGenome = "GRCh37"; // String | referenceGenome
    Integer entrezGeneId = 56; // Integer | entrezGeneId
    String sequenceType = "CDNA"; // String | sequenceType
    try {
      Sequence result = apiInstance.findCanonicalSequenceUsingGET(referenceGenome, entrezGeneId, sequenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceControllerApi#findCanonicalSequenceUsingGET");
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
 **entrezGeneId** | **Integer**| entrezGeneId |
 **sequenceType** | **String**| sequenceType | [optional] [enum: CDNA, PROTEIN]

### Return type

[**Sequence**](Sequence.md)

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

<a name="findCanonicalSequencesUsingPOST"></a>
# **findCanonicalSequencesUsingPOST**
> List&lt;Sequence&gt; findCanonicalSequencesUsingPOST(referenceGenome, sequenceType, requestBody)

findCanonicalSequences

### Example
```java
// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.SequenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    SequenceControllerApi apiInstance = new SequenceControllerApi(defaultClient);
    String referenceGenome = "GRCh37"; // String | referenceGenome
    String sequenceType = "CDNA"; // String | sequenceType
    List<Integer> requestBody = Arrays.asList(); // List<Integer> | 
    try {
      List<Sequence> result = apiInstance.findCanonicalSequencesUsingPOST(referenceGenome, sequenceType, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceControllerApi#findCanonicalSequencesUsingPOST");
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
 **sequenceType** | **String**| sequenceType | [optional] [enum: CDNA, PROTEIN]
 **requestBody** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**List&lt;Sequence&gt;**](Sequence.md)

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

