# CancerGenesApi

All URIs are relative to *https://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utilsAllCuratedGenesGetUsingGET1**](CancerGenesApi.md#utilsAllCuratedGenesGetUsingGET1) | **GET** /utils/allCuratedGenes | utilsAllCuratedGenesGet
[**utilsAllCuratedGenesTxtGetUsingGET1**](CancerGenesApi.md#utilsAllCuratedGenesTxtGetUsingGET1) | **GET** /utils/allCuratedGenes.txt | utilsAllCuratedGenesTxtGet
[**utilsCancerGeneListGetUsingGET1**](CancerGenesApi.md#utilsCancerGeneListGetUsingGET1) | **GET** /utils/cancerGeneList | utilsCancerGeneListGet
[**utilsCancerGeneListTxtGetUsingGET1**](CancerGenesApi.md#utilsCancerGeneListTxtGetUsingGET1) | **GET** /utils/cancerGeneList.txt | utilsCancerGeneListTxtGet


<a name="utilsAllCuratedGenesGetUsingGET1"></a>
# **utilsAllCuratedGenesGetUsingGET1**
> List&lt;CuratedGene&gt; utilsAllCuratedGenesGetUsingGET1(version)

utilsAllCuratedGenesGet

Get list of genes OncoKB curated

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.CancerGenesApi;


CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    List<CuratedGene> result = apiInstance.utilsAllCuratedGenesGetUsingGET1(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;CuratedGene&gt;**](CuratedGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllCuratedGenesTxtGetUsingGET1"></a>
# **utilsAllCuratedGenesTxtGetUsingGET1**
> String utilsAllCuratedGenesTxtGetUsingGET1(version)

utilsAllCuratedGenesTxtGet

Get list of genes OncoKB curated in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.CancerGenesApi;


CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsAllCuratedGenesTxtGetUsingGET1(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesTxtGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="utilsCancerGeneListGetUsingGET1"></a>
# **utilsCancerGeneListGetUsingGET1**
> List&lt;CancerGene&gt; utilsCancerGeneListGetUsingGET1(version)

utilsCancerGeneListGet

Get cancer gene list

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.CancerGenesApi;


CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    List<CancerGene> result = apiInstance.utilsCancerGeneListGetUsingGET1(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;CancerGene&gt;**](CancerGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsCancerGeneListTxtGetUsingGET1"></a>
# **utilsCancerGeneListTxtGetUsingGET1**
> String utilsCancerGeneListTxtGetUsingGET1(version)

utilsCancerGeneListTxtGet

Get cancer gene list in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.CancerGenesApi;


CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsCancerGeneListTxtGetUsingGET1(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListTxtGetUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

