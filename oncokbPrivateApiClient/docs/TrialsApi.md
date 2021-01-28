# TrialsApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trialsGetByCancerTypesUsingPOST**](TrialsApi.md#trialsGetByCancerTypesUsingPOST) | **POST** /trials/cancerTypes | Return a list of trials using cancer types
[**trialsMatchingGetUsingGET**](TrialsApi.md#trialsMatchingGetUsingGET) | **GET** /trials | Return a list of trials using OncoTree Code and/or treatment


<a name="trialsGetByCancerTypesUsingPOST"></a>
# **trialsGetByCancerTypesUsingPOST**
> Map&lt;String, List&gt; trialsGetByCancerTypesUsingPOST(body)

Return a list of trials using cancer types

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.TrialsApi;


TrialsApi apiInstance = new TrialsApi();
CancerTypesQuery body = new CancerTypesQuery(); // CancerTypesQuery | body
try {
    Map<String, List> result = apiInstance.trialsGetByCancerTypesUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrialsApi#trialsGetByCancerTypesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CancerTypesQuery**](CancerTypesQuery.md)| body |

### Return type

[**Map&lt;String, List&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="trialsMatchingGetUsingGET"></a>
# **trialsMatchingGetUsingGET**
> List&lt;Trial&gt; trialsMatchingGetUsingGET(oncoTreeCode, treatment)

Return a list of trials using OncoTree Code and/or treatment

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.TrialsApi;


TrialsApi apiInstance = new TrialsApi();
String oncoTreeCode = "oncoTreeCode_example"; // String | oncoTreeCode
String treatment = "treatment_example"; // String | treatment
try {
    List<Trial> result = apiInstance.trialsMatchingGetUsingGET(oncoTreeCode, treatment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrialsApi#trialsMatchingGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oncoTreeCode** | **String**| oncoTreeCode |
 **treatment** | **String**| treatment | [optional]

### Return type

[**List&lt;Trial&gt;**](Trial.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

