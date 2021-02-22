# AccountResourceApi

All URIs are relative to *https://transcript.oncokb.org:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountUsingGET**](AccountResourceApi.md#getAccountUsingGET) | **GET** /api/account | getAccount

<a name="getAccountUsingGET"></a>
# **getAccountUsingGET**
> UserVM getAccountUsingGET()

getAccount

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.AccountResourceApi;

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

