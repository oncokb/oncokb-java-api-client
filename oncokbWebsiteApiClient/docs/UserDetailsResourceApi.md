# UserDetailsResourceApi

All URIs are relative to *//www.oncokb.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserDetailsUsingPOST**](UserDetailsResourceApi.md#createUserDetailsUsingPOST) | **POST** /api/user-details | createUserDetails
[**deleteUserDetailsUsingDELETE**](UserDetailsResourceApi.md#deleteUserDetailsUsingDELETE) | **DELETE** /api/user-details/{id} | deleteUserDetails
[**getAllUserDetailsUsingGET**](UserDetailsResourceApi.md#getAllUserDetailsUsingGET) | **GET** /api/user-details | getAllUserDetails
[**getUserDetailsUsingGET**](UserDetailsResourceApi.md#getUserDetailsUsingGET) | **GET** /api/user-details/{id} | getUserDetails
[**updateUserDetailsUsingPUT**](UserDetailsResourceApi.md#updateUserDetailsUsingPUT) | **PUT** /api/user-details | updateUserDetails

<a name="createUserDetailsUsingPOST"></a>
# **createUserDetailsUsingPOST**
> UserDetailsDTO createUserDetailsUsingPOST(body)

createUserDetails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
UserDetailsDTO body = new UserDetailsDTO(); // UserDetailsDTO | userDetailsDTO
try {
    UserDetailsDTO result = apiInstance.createUserDetailsUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#createUserDetailsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDetailsDTO**](UserDetailsDTO.md)| userDetailsDTO |

### Return type

[**UserDetailsDTO**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserDetailsUsingDELETE"></a>
# **deleteUserDetailsUsingDELETE**
> deleteUserDetailsUsingDELETE(id)

deleteUserDetails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteUserDetailsUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#deleteUserDetailsUsingDELETE");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllUserDetailsUsingGET"></a>
# **getAllUserDetailsUsingGET**
> List&lt;UserDetailsDTO&gt; getAllUserDetailsUsingGET()

getAllUserDetails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
try {
    List<UserDetailsDTO> result = apiInstance.getAllUserDetailsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#getAllUserDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserDetailsDTO&gt;**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserDetailsUsingGET"></a>
# **getUserDetailsUsingGET**
> UserDetailsDTO getUserDetailsUsingGET(id)

getUserDetails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
Long id = 789L; // Long | id
try {
    UserDetailsDTO result = apiInstance.getUserDetailsUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#getUserDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**UserDetailsDTO**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUserDetailsUsingPUT"></a>
# **updateUserDetailsUsingPUT**
> UserDetailsDTO updateUserDetailsUsingPUT(body)

updateUserDetails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
UserDetailsDTO body = new UserDetailsDTO(); // UserDetailsDTO | userDetailsDTO
try {
    UserDetailsDTO result = apiInstance.updateUserDetailsUsingPUT(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#updateUserDetailsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDetailsDTO**](UserDetailsDTO.md)| userDetailsDTO |

### Return type

[**UserDetailsDTO**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

