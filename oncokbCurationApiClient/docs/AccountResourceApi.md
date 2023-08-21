# AccountResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountResourceApi.md#getAccount) | **GET** /api/account | 
[**getFirebaseToken**](AccountResourceApi.md#getFirebaseToken) | **GET** /api/account/firebase-token | 
[**isAuthenticated**](AccountResourceApi.md#isAuthenticated) | **GET** /api/authenticate | 


<a name="getAccount"></a>
# **getAccount**
> UserDTO getAccount()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AccountResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AccountResourceApi apiInstance = new AccountResourceApi(defaultClient);
    try {
      UserDTO result = apiInstance.getAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountResourceApi#getAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getFirebaseToken"></a>
# **getFirebaseToken**
> String getFirebaseToken()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AccountResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AccountResourceApi apiInstance = new AccountResourceApi(defaultClient);
    try {
      String result = apiInstance.getFirebaseToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountResourceApi#getFirebaseToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="isAuthenticated"></a>
# **isAuthenticated**
> String isAuthenticated()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.AccountResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    AccountResourceApi apiInstance = new AccountResourceApi(defaultClient);
    try {
      String result = apiInstance.isAuthenticated();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountResourceApi#isAuthenticated");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

