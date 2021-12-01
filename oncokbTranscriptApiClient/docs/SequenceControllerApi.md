# SequenceControllerApi

All URIs are relative to *http://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findSequencesByUsageSourceUsingGET**](SequenceControllerApi.md#findSequencesByUsageSourceUsingGET) | **GET** /api/sequences-by-usage-source | findSequencesByUsageSource

<a name="findSequencesByUsageSourceUsingGET"></a>
# **findSequencesByUsageSourceUsingGET**
> List&lt;Sequence&gt; findSequencesByUsageSourceUsingGET(referenceGenome, usageSource, hugoSymbol)

findSequencesByUsageSource

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
String usageSource = "usageSource_example"; // String | usageSource
String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
try {
    List<Sequence> result = apiInstance.findSequencesByUsageSourceUsingGET(referenceGenome, usageSource, hugoSymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceControllerApi#findSequencesByUsageSourceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceGenome** | **String**| referenceGenome | [enum: GRCh37, GRCh38]
 **usageSource** | **String**| usageSource | [enum: ONCOKB]
 **hugoSymbol** | **String**| hugoSymbol | [optional]

### Return type

[**List&lt;Sequence&gt;**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

