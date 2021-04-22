# DrugControllerApi

All URIs are relative to *http://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compareTranscriptUsingPOST**](DrugControllerApi.md#compareTranscriptUsingPOST) | **POST** /api/update-ncit | compareTranscript

<a name="compareTranscriptUsingPOST"></a>
# **compareTranscriptUsingPOST**
> compareTranscriptUsingPOST()

compareTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.DrugControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugControllerApi apiInstance = new DrugControllerApi();
try {
    apiInstance.compareTranscriptUsingPOST();
} catch (ApiException e) {
    System.err.println("Exception when calling DrugControllerApi#compareTranscriptUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

