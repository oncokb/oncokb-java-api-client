# PipelineControllerApi

All URIs are relative to *http://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateNcitUsingPOST**](PipelineControllerApi.md#updateNcitUsingPOST) | **POST** /api/pipeline/update-ncit | updateNcit
[**updatePortalGeneUsingPOST**](PipelineControllerApi.md#updatePortalGeneUsingPOST) | **POST** /api/pipeline/update-gene | updatePortalGene

<a name="updateNcitUsingPOST"></a>
# **updateNcitUsingPOST**
> updateNcitUsingPOST()

updateNcit

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.PipelineControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PipelineControllerApi apiInstance = new PipelineControllerApi();
try {
    apiInstance.updateNcitUsingPOST();
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineControllerApi#updateNcitUsingPOST");
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

<a name="updatePortalGeneUsingPOST"></a>
# **updatePortalGeneUsingPOST**
> updatePortalGeneUsingPOST()

updatePortalGene

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.PipelineControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PipelineControllerApi apiInstance = new PipelineControllerApi();
try {
    apiInstance.updatePortalGeneUsingPOST();
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineControllerApi#updatePortalGeneUsingPOST");
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

