# SequenceControllerApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCanonicalSequence**](SequenceControllerApi.md#findCanonicalSequence) | **GET** /api/find-canonical-sequences | 
[**findCanonicalSequences**](SequenceControllerApi.md#findCanonicalSequences) | **POST** /api/find-canonical-sequences | 


<a name="findCanonicalSequence"></a>
# **findCanonicalSequence**
> Sequence findCanonicalSequence(referenceGenome, entrezGeneId, sequenceType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceControllerApi apiInstance = new SequenceControllerApi(defaultClient);
    String referenceGenome = "GRCh37"; // String | 
    Integer entrezGeneId = 56; // Integer | 
    String sequenceType = "PROTEIN"; // String | 
    try {
      Sequence result = apiInstance.findCanonicalSequence(referenceGenome, entrezGeneId, sequenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceControllerApi#findCanonicalSequence");
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
 **entrezGeneId** | **Integer**|  |
 **sequenceType** | **String**|  | [optional] [default to PROTEIN] [enum: PROTEIN, CDNA]

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

<a name="findCanonicalSequences"></a>
# **findCanonicalSequences**
> List&lt;Sequence&gt; findCanonicalSequences(referenceGenome, requestBody, sequenceType)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.SequenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    SequenceControllerApi apiInstance = new SequenceControllerApi(defaultClient);
    String referenceGenome = "GRCh37"; // String | 
    List<Integer> requestBody = Arrays.asList(); // List<Integer> | 
    String sequenceType = "PROTEIN"; // String | 
    try {
      List<Sequence> result = apiInstance.findCanonicalSequences(referenceGenome, requestBody, sequenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequenceControllerApi#findCanonicalSequences");
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
 **requestBody** | [**List&lt;Integer&gt;**](Integer.md)|  |
 **sequenceType** | **String**|  | [optional] [default to PROTEIN] [enum: PROTEIN, CDNA]

### Return type

[**List&lt;Sequence&gt;**](Sequence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

