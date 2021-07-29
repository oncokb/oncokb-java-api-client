# MailsControllerApi

All URIs are relative to *//www.oncokb.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMailsFromUsingGET**](MailsControllerApi.md#getMailsFromUsingGET) | **GET** /api/mails/from | getMailsFrom
[**getMailsTypesUsingGET**](MailsControllerApi.md#getMailsTypesUsingGET) | **GET** /api/mails/types | getMailsTypes
[**sendFeedbackMailsUsingPOST**](MailsControllerApi.md#sendFeedbackMailsUsingPOST) | **POST** /api/mails/feedback | sendFeedbackMails
[**sendUserMailsUsingPOST**](MailsControllerApi.md#sendUserMailsUsingPOST) | **POST** /api/mails/users | sendUserMails

<a name="getMailsFromUsingGET"></a>
# **getMailsFromUsingGET**
> List&lt;String&gt; getMailsFromUsingGET()

getMailsFrom

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.MailsControllerApi;


MailsControllerApi apiInstance = new MailsControllerApi();
try {
    List<String> result = apiInstance.getMailsFromUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailsControllerApi#getMailsFromUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMailsTypesUsingGET"></a>
# **getMailsTypesUsingGET**
> List&lt;MailTypeInfo&gt; getMailsTypesUsingGET(licenseType)

getMailsTypes

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.MailsControllerApi;


MailsControllerApi apiInstance = new MailsControllerApi();
String licenseType = "licenseType_example"; // String | licenseType
try {
    List<MailTypeInfo> result = apiInstance.getMailsTypesUsingGET(licenseType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailsControllerApi#getMailsTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseType** | **String**| licenseType | [enum: ACADEMIC, COMMERCIAL, RESEARCH_IN_COMMERCIAL, HOSPITAL]

### Return type

[**List&lt;MailTypeInfo&gt;**](MailTypeInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sendFeedbackMailsUsingPOST"></a>
# **sendFeedbackMailsUsingPOST**
> sendFeedbackMailsUsingPOST(description, from, subject, userName)

sendFeedbackMails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.MailsControllerApi;


MailsControllerApi apiInstance = new MailsControllerApi();
String description = "description_example"; // String | description
String from = "from_example"; // String | from
String subject = "subject_example"; // String | subject
String userName = "userName_example"; // String | userName
try {
    apiInstance.sendFeedbackMailsUsingPOST(description, from, subject, userName);
} catch (ApiException e) {
    System.err.println("Exception when calling MailsControllerApi#sendFeedbackMailsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **String**| description |
 **from** | **String**| from |
 **subject** | **String**| subject |
 **userName** | **String**| userName |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendUserMailsUsingPOST"></a>
# **sendUserMailsUsingPOST**
> String sendUserMailsUsingPOST(by, from, mailType, to, cc)

sendUserMails

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.MailsControllerApi;


MailsControllerApi apiInstance = new MailsControllerApi();
String by = "by_example"; // String | by
String from = "from_example"; // String | from
String mailType = "mailType_example"; // String | mailType
String to = "to_example"; // String | to
String cc = "cc_example"; // String | cc
try {
    String result = apiInstance.sendUserMailsUsingPOST(by, from, mailType, to, cc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailsControllerApi#sendUserMailsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **by** | **String**| by |
 **from** | **String**| from |
 **mailType** | **String**| mailType | [enum: ACTIVATION, APPROVAL, CREATION, PASSWORD_RESET, LICENSE_REVIEW_COMMERCIAL, LICENSE_REVIEW_RESEARCH_COMMERCIAL, LICENSE_REVIEW_HOSPITAL, CLARIFY_ACADEMIC_FOR_PROFIT, CLARIFY_ACADEMIC_NON_INSTITUTE_EMAIL, VERIFY_EMAIL_BEFORE_ACCOUNT_EXPIRES, APPROVAL_MSK_IN_COMMERCIAL, TRIAL_ACCOUNT_IS_ABOUT_TO_EXPIRE, TRIAL_ACCOUNT_IS_ACTIVATED, ACTIVATE_FREE_TRIAL, TOKEN_HAS_BEEN_EXPOSED, TOKEN_HAS_BEEN_EXPOSED_USER, SEARCHING_RESPONSE_STRUCTURE_HAS_CHANGED, LIST_OF_UNAPPROVED_USERS, TEST]
 **to** | **String**| to |
 **cc** | **String**| cc | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

