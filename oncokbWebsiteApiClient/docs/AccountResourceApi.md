# AccountResourceApi

All URIs are relative to *//localhost:9095/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAccountUsingGET**](AccountResourceApi.md#activateAccountUsingGET) | **GET** /api/activate | activateAccount
[**changePasswordUsingPOST**](AccountResourceApi.md#changePasswordUsingPOST) | **POST** /api/account/change-password | changePassword
[**createTokenUsingPOST**](AccountResourceApi.md#createTokenUsingPOST) | **POST** /api/account/tokens | createToken
[**deleteTokenUsingDELETE**](AccountResourceApi.md#deleteTokenUsingDELETE) | **DELETE** /api/account/tokens | deleteToken
[**finishPasswordResetUsingPOST**](AccountResourceApi.md#finishPasswordResetUsingPOST) | **POST** /api/account/reset-password/finish | finishPasswordReset
[**finishTrialAccountActivationUsingPOST**](AccountResourceApi.md#finishTrialAccountActivationUsingPOST) | **POST** /api/account/active-trial/finish | finishTrialAccountActivation
[**generateResetKeyUsingPOST**](AccountResourceApi.md#generateResetKeyUsingPOST) | **POST** /api/account/generate-reset-key | generateResetKey
[**getAccountUsingGET**](AccountResourceApi.md#getAccountUsingGET) | **GET** /api/account | getAccount
[**getTokensUsingGET**](AccountResourceApi.md#getTokensUsingGET) | **GET** /api/account/tokens | getTokens
[**getTrialAccountActivationInfoUsingGET**](AccountResourceApi.md#getTrialAccountActivationInfoUsingGET) | **GET** /api/account/active-trial/info | getTrialAccountActivationInfo
[**initiateTrialAccountActivationUsingPOST**](AccountResourceApi.md#initiateTrialAccountActivationUsingPOST) | **POST** /api/account/active-trial/init | initiateTrialAccountActivation
[**isAuthenticatedUsingGET**](AccountResourceApi.md#isAuthenticatedUsingGET) | **GET** /api/authenticate | isAuthenticated
[**registerAccountUsingPOST**](AccountResourceApi.md#registerAccountUsingPOST) | **POST** /api/register | registerAccount
[**requestPasswordResetUsingPOST**](AccountResourceApi.md#requestPasswordResetUsingPOST) | **POST** /api/account/reset-password/init | requestPasswordReset
[**resendVerificationUsingPOST**](AccountResourceApi.md#resendVerificationUsingPOST) | **POST** /api/account/resend-verification | resendVerification
[**saveAccountUsingPOST**](AccountResourceApi.md#saveAccountUsingPOST) | **POST** /api/account | saveAccount

<a name="activateAccountUsingGET"></a>
# **activateAccountUsingGET**
> Boolean activateAccountUsingGET(key)

activateAccount

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
String key = "key_example"; // String | key
try {
    Boolean result = apiInstance.activateAccountUsingGET(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#activateAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="changePasswordUsingPOST"></a>
# **changePasswordUsingPOST**
> changePasswordUsingPOST(body)

changePassword

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
PasswordChangeDTO body = new PasswordChangeDTO(); // PasswordChangeDTO | passwordChangeDto
try {
    apiInstance.changePasswordUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#changePasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordChangeDTO**](PasswordChangeDTO.md)| passwordChangeDto |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createTokenUsingPOST"></a>
# **createTokenUsingPOST**
> Token createTokenUsingPOST()

createToken

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
try {
    Token result = apiInstance.createTokenUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#createTokenUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteTokenUsingDELETE"></a>
# **deleteTokenUsingDELETE**
> deleteTokenUsingDELETE(body)

deleteToken

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
Token body = new Token(); // Token | token
try {
    apiInstance.deleteTokenUsingDELETE(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#deleteTokenUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Token**](Token.md)| token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="finishPasswordResetUsingPOST"></a>
# **finishPasswordResetUsingPOST**
> finishPasswordResetUsingPOST(body)

finishPasswordReset

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
KeyAndPasswordVM body = new KeyAndPasswordVM(); // KeyAndPasswordVM | keyAndPassword
try {
    apiInstance.finishPasswordResetUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#finishPasswordResetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeyAndPasswordVM**](KeyAndPasswordVM.md)| keyAndPassword |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="finishTrialAccountActivationUsingPOST"></a>
# **finishTrialAccountActivationUsingPOST**
> UserDTO finishTrialAccountActivationUsingPOST(body)

finishTrialAccountActivation

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
KeyAndTermsVM body = new KeyAndTermsVM(); // KeyAndTermsVM | keyAndTermsVM
try {
    UserDTO result = apiInstance.finishTrialAccountActivationUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#finishTrialAccountActivationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeyAndTermsVM**](KeyAndTermsVM.md)| keyAndTermsVM |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="generateResetKeyUsingPOST"></a>
# **generateResetKeyUsingPOST**
> UserDTO generateResetKeyUsingPOST(body)

generateResetKey

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
String body = "body_example"; // String | mail
try {
    UserDTO result = apiInstance.generateResetKeyUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#generateResetKeyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| mail |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAccountUsingGET"></a>
# **getAccountUsingGET**
> UserDTO getAccountUsingGET()

getAccount

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
try {
    UserDTO result = apiInstance.getAccountUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#getAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTokensUsingGET"></a>
# **getTokensUsingGET**
> List&lt;Token&gt; getTokensUsingGET()

getTokens

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
try {
    List<Token> result = apiInstance.getTokensUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#getTokensUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Token&gt;**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTrialAccountActivationInfoUsingGET"></a>
# **getTrialAccountActivationInfoUsingGET**
> UserDTO getTrialAccountActivationInfoUsingGET(key)

getTrialAccountActivationInfo

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
String key = "key_example"; // String | key
try {
    UserDTO result = apiInstance.getTrialAccountActivationInfoUsingGET(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#getTrialAccountActivationInfoUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="initiateTrialAccountActivationUsingPOST"></a>
# **initiateTrialAccountActivationUsingPOST**
> UserDTO initiateTrialAccountActivationUsingPOST(body)

initiateTrialAccountActivation

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
String body = "body_example"; // String | mail
try {
    UserDTO result = apiInstance.initiateTrialAccountActivationUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#initiateTrialAccountActivationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| mail |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="isAuthenticatedUsingGET"></a>
# **isAuthenticatedUsingGET**
> String isAuthenticatedUsingGET()

isAuthenticated

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="registerAccountUsingPOST"></a>
# **registerAccountUsingPOST**
> registerAccountUsingPOST(body)

registerAccount

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
ManagedUserVM body = new ManagedUserVM(); // ManagedUserVM | managedUserVM
try {
    apiInstance.registerAccountUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#registerAccountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagedUserVM**](ManagedUserVM.md)| managedUserVM |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="requestPasswordResetUsingPOST"></a>
# **requestPasswordResetUsingPOST**
> requestPasswordResetUsingPOST(body)

requestPasswordReset

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
String body = "body_example"; // String | mail
try {
    apiInstance.requestPasswordResetUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#requestPasswordResetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| mail |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resendVerificationUsingPOST"></a>
# **resendVerificationUsingPOST**
> resendVerificationUsingPOST(body)

resendVerification

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
LoginVM body = new LoginVM(); // LoginVM | loginVM
try {
    apiInstance.resendVerificationUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#resendVerificationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginVM**](LoginVM.md)| loginVM |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="saveAccountUsingPOST"></a>
# **saveAccountUsingPOST**
> saveAccountUsingPOST(body)

saveAccount

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.AccountResourceApi;


AccountResourceApi apiInstance = new AccountResourceApi();
UserDTO body = new UserDTO(); // UserDTO | userDTO
try {
    apiInstance.saveAccountUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#saveAccountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDTO**](UserDTO.md)| userDTO |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

