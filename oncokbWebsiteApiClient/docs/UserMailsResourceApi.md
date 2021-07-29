# UserMailsResourceApi

All URIs are relative to *//localhost:9095/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserMailsUsingDELETE**](UserMailsResourceApi.md#deleteUserMailsUsingDELETE) | **DELETE** /api/user-mails/{id} | deleteUserMails
[**getAllUserMailsUsingGET**](UserMailsResourceApi.md#getAllUserMailsUsingGET) | **GET** /api/user-mails | getAllUserMails
[**getUsersUserMailsUsingGET**](UserMailsResourceApi.md#getUsersUserMailsUsingGET) | **GET** /api/user-mails/users/{login} | getUsersUserMails

<a name="deleteUserMailsUsingDELETE"></a>
# **deleteUserMailsUsingDELETE**
> deleteUserMailsUsingDELETE(id)

deleteUserMails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserMailsResourceApi;


UserMailsResourceApi apiInstance = new UserMailsResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteUserMailsUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMailsResourceApi#deleteUserMailsUsingDELETE");
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

<a name="getAllUserMailsUsingGET"></a>
# **getAllUserMailsUsingGET**
> List&lt;UserMailsDTO&gt; getAllUserMailsUsingGET()

getAllUserMails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserMailsResourceApi;


UserMailsResourceApi apiInstance = new UserMailsResourceApi();
try {
    List<UserMailsDTO> result = apiInstance.getAllUserMailsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMailsResourceApi#getAllUserMailsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserMailsDTO&gt;**](UserMailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsersUserMailsUsingGET"></a>
# **getUsersUserMailsUsingGET**
> List&lt;UserMailsDTO&gt; getUsersUserMailsUsingGET(login)

getUsersUserMails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UserMailsResourceApi;


UserMailsResourceApi apiInstance = new UserMailsResourceApi();
String login = "login_example"; // String | login
try {
    List<UserMailsDTO> result = apiInstance.getUsersUserMailsUsingGET(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserMailsResourceApi#getUsersUserMailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**| login |

### Return type

[**List&lt;UserMailsDTO&gt;**](UserMailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

