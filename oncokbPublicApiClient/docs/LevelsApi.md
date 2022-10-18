# LevelsApi

All URIs are relative to *http://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**levelsDiagnosticGetUsingGET1**](LevelsApi.md#levelsDiagnosticGetUsingGET1) | **GET** /levels/diagnostic | levelsDiagnosticGet
[**levelsGetUsingGET1**](LevelsApi.md#levelsGetUsingGET1) | **GET** /levels | levelsGet
[**levelsPrognosticGetUsingGET1**](LevelsApi.md#levelsPrognosticGetUsingGET1) | **GET** /levels/prognostic | levelsPrognosticGet
[**levelsResistanceGetUsingGET1**](LevelsApi.md#levelsResistanceGetUsingGET1) | **GET** /levels/resistance | levelsResistanceGet
[**levelsSensitiveGetUsingGET1**](LevelsApi.md#levelsSensitiveGetUsingGET1) | **GET** /levels/sensitive | levelsSensitiveGet


<a name="levelsDiagnosticGetUsingGET1"></a>
# **levelsDiagnosticGetUsingGET1**
> Object levelsDiagnosticGetUsingGET1()

levelsDiagnosticGet

Get all diagnostic levels.

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
      Object result = apiInstance.levelsDiagnosticGetUsingGET1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsDiagnosticGetUsingGET1");
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

<a name="levelsGetUsingGET1"></a>
# **levelsGetUsingGET1**
> Object levelsGetUsingGET1()

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
      Object result = apiInstance.levelsGetUsingGET1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsGetUsingGET1");
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

<a name="levelsPrognosticGetUsingGET1"></a>
# **levelsPrognosticGetUsingGET1**
> Object levelsPrognosticGetUsingGET1()

levelsPrognosticGet

Get all prognostic levels.

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
      Object result = apiInstance.levelsPrognosticGetUsingGET1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsPrognosticGetUsingGET1");
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

<a name="levelsResistanceGetUsingGET1"></a>
# **levelsResistanceGetUsingGET1**
> Object levelsResistanceGetUsingGET1()

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
      Object result = apiInstance.levelsResistanceGetUsingGET1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsResistanceGetUsingGET1");
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

<a name="levelsSensitiveGetUsingGET1"></a>
# **levelsSensitiveGetUsingGET1**
> Object levelsSensitiveGetUsingGET1()

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
      Object result = apiInstance.levelsSensitiveGetUsingGET1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LevelsApi#levelsSensitiveGetUsingGET1");
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

