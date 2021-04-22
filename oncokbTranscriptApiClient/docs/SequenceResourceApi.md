# SequenceResourceApi

All URIs are relative to *http://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSequenceUsingPOST**](SequenceResourceApi.md#createSequenceUsingPOST) | **POST** /api/sequences | createSequence
[**deleteSequenceUsingDELETE**](SequenceResourceApi.md#deleteSequenceUsingDELETE) | **DELETE** /api/sequences/{id} | deleteSequence
[**getAllSequencesUsingGET**](SequenceResourceApi.md#getAllSequencesUsingGET) | **GET** /api/sequences | getAllSequences
[**getAllSequencesUsingGET1**](SequenceResourceApi.md#getAllSequencesUsingGET1) | **GET** /api/sequences-by-usage-source | getAllSequences
[**getSequenceUsingGET**](SequenceResourceApi.md#getSequenceUsingGET) | **GET** /api/sequences/{id} | getSequence
[**partialUpdateSequenceUsingPATCH**](SequenceResourceApi.md#partialUpdateSequenceUsingPATCH) | **PATCH** /api/sequences/{id} | partialUpdateSequence
[**updateSequenceUsingPUT**](SequenceResourceApi.md#updateSequenceUsingPUT) | **PUT** /api/sequences/{id} | updateSequence

<a name="createSequenceUsingPOST"></a>
# **createSequenceUsingPOST**
> Sequence createSequenceUsingPOST(body)

createSequence

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceResourceApi apiInstance = new SequenceResourceApi();
Sequence body = new Sequence(); // Sequence | 
try {
    Sequence result = apiInstance.createSequenceUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceResourceApi#createSequenceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Sequence**](Sequence.md)|  | [optional]

### Return type

[**Sequence**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSequenceUsingDELETE"></a>
# **deleteSequenceUsingDELETE**
> deleteSequenceUsingDELETE(id)

deleteSequence

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceResourceApi apiInstance = new SequenceResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteSequenceUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceResourceApi#deleteSequenceUsingDELETE");
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

<a name="getAllSequencesUsingGET"></a>
# **getAllSequencesUsingGET**
> List&lt;Sequence&gt; getAllSequencesUsingGET()

getAllSequences

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceResourceApi apiInstance = new SequenceResourceApi();
try {
    List<Sequence> result = apiInstance.getAllSequencesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceResourceApi#getAllSequencesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Sequence&gt;**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllSequencesUsingGET1"></a>
# **getAllSequencesUsingGET1**
> List&lt;Sequence&gt; getAllSequencesUsingGET1(referenceGenome, usageSource, hugoSymbol)

getAllSequences

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceResourceApi apiInstance = new SequenceResourceApi();
String referenceGenome = "referenceGenome_example"; // String | referenceGenome
String usageSource = "usageSource_example"; // String | usageSource
String hugoSymbol = "hugoSymbol_example"; // String | hugoSymbol
try {
    List<Sequence> result = apiInstance.getAllSequencesUsingGET1(referenceGenome, usageSource, hugoSymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceResourceApi#getAllSequencesUsingGET1");
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

<a name="getSequenceUsingGET"></a>
# **getSequenceUsingGET**
> Sequence getSequenceUsingGET(id)

getSequence

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceResourceApi apiInstance = new SequenceResourceApi();
Long id = 789L; // Long | id
try {
    Sequence result = apiInstance.getSequenceUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceResourceApi#getSequenceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Sequence**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="partialUpdateSequenceUsingPATCH"></a>
# **partialUpdateSequenceUsingPATCH**
> Sequence partialUpdateSequenceUsingPATCH(id, body)

partialUpdateSequence

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceResourceApi apiInstance = new SequenceResourceApi();
Long id = 789L; // Long | id
Sequence body = new Sequence(); // Sequence | 
try {
    Sequence result = apiInstance.partialUpdateSequenceUsingPATCH(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceResourceApi#partialUpdateSequenceUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **body** | [**Sequence**](Sequence.md)|  | [optional]

### Return type

[**Sequence**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

<a name="updateSequenceUsingPUT"></a>
# **updateSequenceUsingPUT**
> Sequence updateSequenceUsingPUT(id, body)

updateSequence

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.SequenceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SequenceResourceApi apiInstance = new SequenceResourceApi();
Long id = 789L; // Long | id
Sequence body = new Sequence(); // Sequence | 
try {
    Sequence result = apiInstance.updateSequenceUsingPUT(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SequenceResourceApi#updateSequenceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **body** | [**Sequence**](Sequence.md)|  | [optional]

### Return type

[**Sequence**](Sequence.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

