# UserUuidControllerApi

All URIs are relative to *//localhost:9095/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeUsingPOST**](UserUuidControllerApi.md#authorizeUsingPOST) | **POST** /api/authenticate | authorize

<a name="authorizeUsingPOST"></a>
# **authorizeUsingPOST**
> UUID authorizeUsingPOST(body)

authorize

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserUuidControllerApi;


UserUuidControllerApi apiInstance = new UserUuidControllerApi();
LoginVM body = new LoginVM(); // LoginVM | loginVM
try {
    UUID result = apiInstance.authorizeUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUuidControllerApi#authorizeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginVM**](LoginVM.md)| loginVM |

### Return type

[**UUID**](UUID.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

