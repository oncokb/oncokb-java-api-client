# CompanionDiagnosticDeviceResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countCompanionDiagnosticDevices**](CompanionDiagnosticDeviceResourceApi.md#countCompanionDiagnosticDevices) | **GET** /api/companion-diagnostic-devices/count | 
[**createCompanionDiagnosticDevice**](CompanionDiagnosticDeviceResourceApi.md#createCompanionDiagnosticDevice) | **POST** /api/companion-diagnostic-devices | 
[**deleteCompanionDiagnosticDevice**](CompanionDiagnosticDeviceResourceApi.md#deleteCompanionDiagnosticDevice) | **DELETE** /api/companion-diagnostic-devices/{id} | 
[**getAllCompanionDiagnosticDevices**](CompanionDiagnosticDeviceResourceApi.md#getAllCompanionDiagnosticDevices) | **GET** /api/companion-diagnostic-devices | 
[**getCompanionDiagnosticDevice**](CompanionDiagnosticDeviceResourceApi.md#getCompanionDiagnosticDevice) | **GET** /api/companion-diagnostic-devices/{id} | 
[**partialUpdateCompanionDiagnosticDevice**](CompanionDiagnosticDeviceResourceApi.md#partialUpdateCompanionDiagnosticDevice) | **PATCH** /api/companion-diagnostic-devices/{id} | 
[**searchCompanionDiagnosticDevices**](CompanionDiagnosticDeviceResourceApi.md#searchCompanionDiagnosticDevices) | **GET** /api/_search/companion-diagnostic-devices | 
[**updateCompanionDiagnosticDevice**](CompanionDiagnosticDeviceResourceApi.md#updateCompanionDiagnosticDevice) | **PUT** /api/companion-diagnostic-devices/{id} | 


<a name="countCompanionDiagnosticDevices"></a>
# **countCompanionDiagnosticDevices**
> Long countCompanionDiagnosticDevices(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    CompanionDiagnosticDeviceCriteria criteria = new CompanionDiagnosticDeviceCriteria(); // CompanionDiagnosticDeviceCriteria | 
    try {
      Long result = apiInstance.countCompanionDiagnosticDevices(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#countCompanionDiagnosticDevices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**CompanionDiagnosticDeviceCriteria**](.md)|  |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createCompanionDiagnosticDevice"></a>
# **createCompanionDiagnosticDevice**
> CompanionDiagnosticDevice createCompanionDiagnosticDevice(companionDiagnosticDevice)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    CompanionDiagnosticDevice companionDiagnosticDevice = new CompanionDiagnosticDevice(); // CompanionDiagnosticDevice | 
    try {
      CompanionDiagnosticDevice result = apiInstance.createCompanionDiagnosticDevice(companionDiagnosticDevice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#createCompanionDiagnosticDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companionDiagnosticDevice** | [**CompanionDiagnosticDevice**](CompanionDiagnosticDevice.md)|  |

### Return type

[**CompanionDiagnosticDevice**](CompanionDiagnosticDevice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteCompanionDiagnosticDevice"></a>
# **deleteCompanionDiagnosticDevice**
> deleteCompanionDiagnosticDevice(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteCompanionDiagnosticDevice(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#deleteCompanionDiagnosticDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllCompanionDiagnosticDevices"></a>
# **getAllCompanionDiagnosticDevices**
> List&lt;CompanionDiagnosticDevice&gt; getAllCompanionDiagnosticDevices(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    CompanionDiagnosticDeviceCriteria criteria = new CompanionDiagnosticDeviceCriteria(); // CompanionDiagnosticDeviceCriteria | 
    try {
      List<CompanionDiagnosticDevice> result = apiInstance.getAllCompanionDiagnosticDevices(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#getAllCompanionDiagnosticDevices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**CompanionDiagnosticDeviceCriteria**](.md)|  |

### Return type

[**List&lt;CompanionDiagnosticDevice&gt;**](CompanionDiagnosticDevice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCompanionDiagnosticDevice"></a>
# **getCompanionDiagnosticDevice**
> CompanionDiagnosticDevice getCompanionDiagnosticDevice(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      CompanionDiagnosticDevice result = apiInstance.getCompanionDiagnosticDevice(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#getCompanionDiagnosticDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**CompanionDiagnosticDevice**](CompanionDiagnosticDevice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateCompanionDiagnosticDevice"></a>
# **partialUpdateCompanionDiagnosticDevice**
> CompanionDiagnosticDevice partialUpdateCompanionDiagnosticDevice(id, companionDiagnosticDevice)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    CompanionDiagnosticDevice companionDiagnosticDevice = new CompanionDiagnosticDevice(); // CompanionDiagnosticDevice | 
    try {
      CompanionDiagnosticDevice result = apiInstance.partialUpdateCompanionDiagnosticDevice(id, companionDiagnosticDevice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#partialUpdateCompanionDiagnosticDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **companionDiagnosticDevice** | [**CompanionDiagnosticDevice**](CompanionDiagnosticDevice.md)|  |

### Return type

[**CompanionDiagnosticDevice**](CompanionDiagnosticDevice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchCompanionDiagnosticDevices"></a>
# **searchCompanionDiagnosticDevices**
> List&lt;CompanionDiagnosticDevice&gt; searchCompanionDiagnosticDevices(query)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    String query = "query_example"; // String | 
    try {
      List<CompanionDiagnosticDevice> result = apiInstance.searchCompanionDiagnosticDevices(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#searchCompanionDiagnosticDevices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |

### Return type

[**List&lt;CompanionDiagnosticDevice&gt;**](CompanionDiagnosticDevice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateCompanionDiagnosticDevice"></a>
# **updateCompanionDiagnosticDevice**
> CompanionDiagnosticDevice updateCompanionDiagnosticDevice(id, companionDiagnosticDevice)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.CompanionDiagnosticDeviceResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    CompanionDiagnosticDeviceResourceApi apiInstance = new CompanionDiagnosticDeviceResourceApi(defaultClient);
    Long id = 56L; // Long | 
    CompanionDiagnosticDevice companionDiagnosticDevice = new CompanionDiagnosticDevice(); // CompanionDiagnosticDevice | 
    try {
      CompanionDiagnosticDevice result = apiInstance.updateCompanionDiagnosticDevice(id, companionDiagnosticDevice);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanionDiagnosticDeviceResourceApi#updateCompanionDiagnosticDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **companionDiagnosticDevice** | [**CompanionDiagnosticDevice**](CompanionDiagnosticDevice.md)|  |

### Return type

[**CompanionDiagnosticDevice**](CompanionDiagnosticDevice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

