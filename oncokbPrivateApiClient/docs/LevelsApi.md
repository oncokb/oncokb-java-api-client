# LevelsApi

All URIs are relative to *http://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**levelsGetUsingGET**](LevelsApi.md#levelsGetUsingGET) | **GET** /levels | levelsGet
[**levelsResistanceGetUsingGET**](LevelsApi.md#levelsResistanceGetUsingGET) | **GET** /levels/resistance | levelsResistanceGet
[**levelsSensitiveGetUsingGET**](LevelsApi.md#levelsSensitiveGetUsingGET) | **GET** /levels/sensitive | levelsSensitiveGet


<a name="levelsGetUsingGET"></a>
# **levelsGetUsingGET**
> Object levelsGetUsingGET()

levelsGet

Get all levels.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.LevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    LevelsApi apiInstance = new LevelsApi(defaultClient);
    try {
      Object result = apiInstance.levelsGetUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsGetUsingGET");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="levelsResistanceGetUsingGET"></a>
# **levelsResistanceGetUsingGET**
> Object levelsResistanceGetUsingGET()

levelsResistanceGet

Get all resistance levels.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.LevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    LevelsApi apiInstance = new LevelsApi(defaultClient);
    try {
      Object result = apiInstance.levelsResistanceGetUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsResistanceGetUsingGET");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="levelsSensitiveGetUsingGET"></a>
# **levelsSensitiveGetUsingGET**
> Object levelsSensitiveGetUsingGET()

levelsSensitiveGet

Get all sensitive levels.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.LevelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    LevelsApi apiInstance = new LevelsApi(defaultClient);
    try {
      Object result = apiInstance.levelsSensitiveGetUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsSensitiveGetUsingGET");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

