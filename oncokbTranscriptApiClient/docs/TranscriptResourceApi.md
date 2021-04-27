# TranscriptResourceApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTranscriptUsingPOST**](TranscriptResourceApi.md#createTranscriptUsingPOST) | **POST** /api/transcripts | createTranscript
[**deleteTranscriptUsingDELETE**](TranscriptResourceApi.md#deleteTranscriptUsingDELETE) | **DELETE** /api/transcripts/{id} | deleteTranscript
[**getAllTranscriptsUsingGET**](TranscriptResourceApi.md#getAllTranscriptsUsingGET) | **GET** /api/transcripts | getAllTranscripts
[**getTranscriptUsingGET2**](TranscriptResourceApi.md#getTranscriptUsingGET2) | **GET** /api/transcripts/{id} | getTranscript
[**partialUpdateTranscriptUsingPATCH**](TranscriptResourceApi.md#partialUpdateTranscriptUsingPATCH) | **PATCH** /api/transcripts/{id} | partialUpdateTranscript
[**updateTranscriptUsingPUT**](TranscriptResourceApi.md#updateTranscriptUsingPUT) | **PUT** /api/transcripts/{id} | updateTranscript

<a name="createTranscriptUsingPOST"></a>
# **createTranscriptUsingPOST**
> Transcript createTranscriptUsingPOST(body)

createTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptResourceApi apiInstance = new TranscriptResourceApi();
Transcript body = new Transcript(); // Transcript | 
try {
    Transcript result = apiInstance.createTranscriptUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptResourceApi#createTranscriptUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Transcript**](Transcript.md)|  | [optional]

### Return type

[**Transcript**](Transcript.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTranscriptUsingDELETE"></a>
# **deleteTranscriptUsingDELETE**
> deleteTranscriptUsingDELETE(id)

deleteTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptResourceApi apiInstance = new TranscriptResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteTranscriptUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptResourceApi#deleteTranscriptUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllTranscriptsUsingGET"></a>
# **getAllTranscriptsUsingGET**
> List&lt;Transcript&gt; getAllTranscriptsUsingGET()

getAllTranscripts

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptResourceApi apiInstance = new TranscriptResourceApi();
try {
    List<Transcript> result = apiInstance.getAllTranscriptsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptResourceApi#getAllTranscriptsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Transcript&gt;**](Transcript.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTranscriptUsingGET2"></a>
# **getTranscriptUsingGET2**
> Transcript getTranscriptUsingGET2(id)

getTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptResourceApi apiInstance = new TranscriptResourceApi();
Long id = 789L; // Long | id
try {
    Transcript result = apiInstance.getTranscriptUsingGET2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptResourceApi#getTranscriptUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Transcript**](Transcript.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="partialUpdateTranscriptUsingPATCH"></a>
# **partialUpdateTranscriptUsingPATCH**
> Transcript partialUpdateTranscriptUsingPATCH(id, body)

partialUpdateTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptResourceApi apiInstance = new TranscriptResourceApi();
Long id = 789L; // Long | id
Transcript body = new Transcript(); // Transcript | 
try {
    Transcript result = apiInstance.partialUpdateTranscriptUsingPATCH(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptResourceApi#partialUpdateTranscriptUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **body** | [**Transcript**](Transcript.md)|  | [optional]

### Return type

[**Transcript**](Transcript.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

<a name="updateTranscriptUsingPUT"></a>
# **updateTranscriptUsingPUT**
> Transcript updateTranscriptUsingPUT(id, body)

updateTranscript

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.TranscriptResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


TranscriptResourceApi apiInstance = new TranscriptResourceApi();
Long id = 789L; // Long | id
Transcript body = new Transcript(); // Transcript | 
try {
    Transcript result = apiInstance.updateTranscriptUsingPUT(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranscriptResourceApi#updateTranscriptUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **body** | [**Transcript**](Transcript.md)|  | [optional]

### Return type

[**Transcript**](Transcript.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

