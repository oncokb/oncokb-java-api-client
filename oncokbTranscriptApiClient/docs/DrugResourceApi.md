# DrugResourceApi

All URIs are relative to *http://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrugUsingPOST**](DrugResourceApi.md#createDrugUsingPOST) | **POST** /api/drugs | createDrug
[**deleteDrugUsingDELETE**](DrugResourceApi.md#deleteDrugUsingDELETE) | **DELETE** /api/drugs/{id} | deleteDrug
[**findDrugByCodeUsingGET**](DrugResourceApi.md#findDrugByCodeUsingGET) | **GET** /api/drugs/search-by-code/{code} | findDrugByCode
[**findDrugsUsingGET**](DrugResourceApi.md#findDrugsUsingGET) | **GET** /api/drugs/search/{query} | findDrugs
[**getAllDrugsUsingGET**](DrugResourceApi.md#getAllDrugsUsingGET) | **GET** /api/drugs | getAllDrugs
[**getDrugUsingGET**](DrugResourceApi.md#getDrugUsingGET) | **GET** /api/drugs/{id} | getDrug
[**partialUpdateDrugUsingPATCH**](DrugResourceApi.md#partialUpdateDrugUsingPATCH) | **PATCH** /api/drugs/{id} | partialUpdateDrug
[**updateDrugUsingPUT**](DrugResourceApi.md#updateDrugUsingPUT) | **PUT** /api/drugs/{id} | updateDrug

<a name="createDrugUsingPOST"></a>
# **createDrugUsingPOST**
> Drug createDrugUsingPOST(body)

createDrug

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
Drug body = new Drug(); // Drug | 
try {
    Drug result = apiInstance.createDrugUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#createDrugUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Drug**](Drug.md)|  | [optional]

### Return type

[**Drug**](Drug.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDrugUsingDELETE"></a>
# **deleteDrugUsingDELETE**
> deleteDrugUsingDELETE(id)

deleteDrug

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteDrugUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#deleteDrugUsingDELETE");
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
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
String code = "code_example"; // String | code
try {
    Drug result = apiInstance.findDrugByCodeUsingGET(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#findDrugByCodeUsingGET");
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
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
String query = "query_example"; // String | query
try {
    List<Drug> result = apiInstance.findDrugsUsingGET(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#findDrugsUsingGET");
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

<a name="getAllDrugsUsingGET"></a>
# **getAllDrugsUsingGET**
> List&lt;Drug&gt; getAllDrugsUsingGET()

getAllDrugs

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
try {
    List<Drug> result = apiInstance.getAllDrugsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#getAllDrugsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Drug&gt;**](Drug.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDrugUsingGET"></a>
# **getDrugUsingGET**
> Drug getDrugUsingGET(id)

getDrug

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
Long id = 789L; // Long | id
try {
    Drug result = apiInstance.getDrugUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#getDrugUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Drug**](Drug.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="partialUpdateDrugUsingPATCH"></a>
# **partialUpdateDrugUsingPATCH**
> Drug partialUpdateDrugUsingPATCH(id, body)

partialUpdateDrug

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
Long id = 789L; // Long | id
Drug body = new Drug(); // Drug | 
try {
    Drug result = apiInstance.partialUpdateDrugUsingPATCH(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#partialUpdateDrugUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **body** | [**Drug**](Drug.md)|  | [optional]

### Return type

[**Drug**](Drug.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

<a name="updateDrugUsingPUT"></a>
# **updateDrugUsingPUT**
> Drug updateDrugUsingPUT(id, body)

updateDrug

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.DrugResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugResourceApi apiInstance = new DrugResourceApi();
Long id = 789L; // Long | id
Drug body = new Drug(); // Drug | 
try {
    Drug result = apiInstance.updateDrugUsingPUT(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugResourceApi#updateDrugUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **body** | [**Drug**](Drug.md)|  | [optional]

### Return type

[**Drug**](Drug.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

