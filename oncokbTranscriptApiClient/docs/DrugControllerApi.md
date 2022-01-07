# DrugControllerApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findDrugByCodeUsingGET**](DrugControllerApi.md#findDrugByCodeUsingGET) | **GET** /api/drugs/search-by-code/{code} | findDrugByCode
[**findDrugsUsingGET**](DrugControllerApi.md#findDrugsUsingGET) | **GET** /api/drugs/search | findDrugs

<a name="findDrugByCodeUsingGET"></a>
# **findDrugByCodeUsingGET**
> Drug findDrugByCodeUsingGET(code)

findDrugByCode

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
String code = "code_example"; // String | code
try {
    Drug result = apiInstance.findDrugByCodeUsingGET(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugControllerApi#findDrugByCodeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| code |

### Return type

[**Drug**](Drug.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findDrugsUsingGET"></a>
# **findDrugsUsingGET**
> List&lt;Drug&gt; findDrugsUsingGET(query)

findDrugs

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
String query = "query_example"; // String | query
try {
    List<Drug> result = apiInstance.findDrugsUsingGET(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugControllerApi#findDrugsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query |

### Return type

[**List&lt;Drug&gt;**](Drug.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

