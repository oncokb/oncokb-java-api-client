# AccountResourceApi

All URIs are relative to *http://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountUsingGET**](AccountResourceApi.md#getAccountUsingGET) | **GET** /api/account | getAccount
[**isAuthenticatedUsingGET**](AccountResourceApi.md#isAuthenticatedUsingGET) | **GET** /api/authenticate | isAuthenticated

<a name="getAccountUsingGET"></a>
# **getAccountUsingGET**
> UserVM getAccountUsingGET()

getAccount

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.AccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountResourceApi apiInstance = new AccountResourceApi();
try {
    UserVM result = apiInstance.getAccountUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#getAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserVM**](UserVM.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="isAuthenticatedUsingGET"></a>
# **isAuthenticatedUsingGET**
> String isAuthenticatedUsingGET()

isAuthenticated

### Example
```java
// Import classes:
//import org.oncokb.oncokb_transcript.ApiClient;
//import org.oncokb.oncokb_transcript.ApiException;
//import org.oncokb.oncokb_transcript.Configuration;
//import org.oncokb.oncokb_transcript.auth.*;
//import org.oncokb.oncokb_transcript.client.AccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountResourceApi apiInstance = new AccountResourceApi();
try {
    String result = apiInstance.isAuthenticatedUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#isAuthenticatedUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

