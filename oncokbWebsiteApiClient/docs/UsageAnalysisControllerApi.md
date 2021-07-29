# UsageAnalysisControllerApi

All URIs are relative to *//localhost:9095/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resourceDetailGetUsingGET**](UsageAnalysisControllerApi.md#resourceDetailGetUsingGET) | **GET** /api/usage/resources | resourceDetailGet
[**resourceUsageGetUsingGET**](UsageAnalysisControllerApi.md#resourceUsageGetUsingGET) | **GET** /api/usage/summary/resources | resourceUsageGet
[**userOverviewUsageGetUsingGET**](UsageAnalysisControllerApi.md#userOverviewUsageGetUsingGET) | **GET** /api/usage/summary/users | userOverviewUsageGet
[**userUsageGetUsingGET**](UsageAnalysisControllerApi.md#userUsageGetUsingGET) | **GET** /api/usage/users/{userId} | userUsageGet

<a name="resourceDetailGetUsingGET"></a>
# **resourceDetailGetUsingGET**
> UsageSummary resourceDetailGetUsingGET(endpoint)

resourceDetailGet

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UsageAnalysisControllerApi;


UsageAnalysisControllerApi apiInstance = new UsageAnalysisControllerApi();
String endpoint = "endpoint_example"; // String | endpoint
try {
    UsageSummary result = apiInstance.resourceDetailGetUsingGET(endpoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageAnalysisControllerApi#resourceDetailGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpoint** | **String**| endpoint |

### Return type

[**UsageSummary**](UsageSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resourceUsageGetUsingGET"></a>
# **resourceUsageGetUsingGET**
> UsageSummary resourceUsageGetUsingGET()

resourceUsageGet

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UsageAnalysisControllerApi;


UsageAnalysisControllerApi apiInstance = new UsageAnalysisControllerApi();
try {
    UsageSummary result = apiInstance.resourceUsageGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageAnalysisControllerApi#resourceUsageGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsageSummary**](UsageSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="userOverviewUsageGetUsingGET"></a>
# **userOverviewUsageGetUsingGET**
> List&lt;UserOverviewUsage&gt; userOverviewUsageGetUsingGET()

userOverviewUsageGet

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UsageAnalysisControllerApi;


UsageAnalysisControllerApi apiInstance = new UsageAnalysisControllerApi();
try {
    List<UserOverviewUsage> result = apiInstance.userOverviewUsageGetUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageAnalysisControllerApi#userOverviewUsageGetUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserOverviewUsage&gt;**](UserOverviewUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="userUsageGetUsingGET"></a>
# **userUsageGetUsingGET**
> UserUsage userUsageGetUsingGET(userId)

userUsageGet

### Example
```java
// Import classes:
//import org.oncokb.ApiException;
//import org.oncokb.client.UsageAnalysisControllerApi;


UsageAnalysisControllerApi apiInstance = new UsageAnalysisControllerApi();
String userId = "userId_example"; // String | userId
try {
    UserUsage result = apiInstance.userUsageGetUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageAnalysisControllerApi#userUsageGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**UserUsage**](UserUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

