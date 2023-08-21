# FdaSubmissionResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countFdaSubmissions**](FdaSubmissionResourceApi.md#countFdaSubmissions) | **GET** /api/fda-submissions/count | 
[**createFdaSubmission**](FdaSubmissionResourceApi.md#createFdaSubmission) | **POST** /api/fda-submissions | 
[**deleteFdaSubmission**](FdaSubmissionResourceApi.md#deleteFdaSubmission) | **DELETE** /api/fda-submissions/{id} | 
[**findFdaSubmissionsByCompanionDiagnosticDevice**](FdaSubmissionResourceApi.md#findFdaSubmissionsByCompanionDiagnosticDevice) | **GET** /api/fda-submissions/companion-diagnostic-device/{id} | 
[**getAllFdaSubmissions**](FdaSubmissionResourceApi.md#getAllFdaSubmissions) | **GET** /api/fda-submissions | 
[**getFdaSubmission**](FdaSubmissionResourceApi.md#getFdaSubmission) | **GET** /api/fda-submissions/{id} | 
[**getFdaSubmissionByNumber**](FdaSubmissionResourceApi.md#getFdaSubmissionByNumber) | **GET** /api/fda-submissions/lookup | 
[**partialUpdateFdaSubmission**](FdaSubmissionResourceApi.md#partialUpdateFdaSubmission) | **PATCH** /api/fda-submissions/{id} | 
[**searchFdaSubmissions**](FdaSubmissionResourceApi.md#searchFdaSubmissions) | **GET** /api/_search/fda-submissions | 
[**updateFdaSubmission**](FdaSubmissionResourceApi.md#updateFdaSubmission) | **PUT** /api/fda-submissions/{id} | 


<a name="countFdaSubmissions"></a>
# **countFdaSubmissions**
> Long countFdaSubmissions(criteria)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    FdaSubmissionCriteria criteria = new FdaSubmissionCriteria(); // FdaSubmissionCriteria | 
    try {
      Long result = apiInstance.countFdaSubmissions(criteria);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#countFdaSubmissions");
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
 **criteria** | [**FdaSubmissionCriteria**](.md)|  |

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

<a name="createFdaSubmission"></a>
# **createFdaSubmission**
> FdaSubmission createFdaSubmission(fdaSubmission)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    FdaSubmission fdaSubmission = new FdaSubmission(); // FdaSubmission | 
    try {
      FdaSubmission result = apiInstance.createFdaSubmission(fdaSubmission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#createFdaSubmission");
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
 **fdaSubmission** | [**FdaSubmission**](FdaSubmission.md)|  |

### Return type

[**FdaSubmission**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteFdaSubmission"></a>
# **deleteFdaSubmission**
> deleteFdaSubmission(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteFdaSubmission(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#deleteFdaSubmission");
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

<a name="findFdaSubmissionsByCompanionDiagnosticDevice"></a>
# **findFdaSubmissionsByCompanionDiagnosticDevice**
> List&lt;FdaSubmission&gt; findFdaSubmissionsByCompanionDiagnosticDevice(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      List<FdaSubmission> result = apiInstance.findFdaSubmissionsByCompanionDiagnosticDevice(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#findFdaSubmissionsByCompanionDiagnosticDevice");
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

[**List&lt;FdaSubmission&gt;**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllFdaSubmissions"></a>
# **getAllFdaSubmissions**
> List&lt;FdaSubmission&gt; getAllFdaSubmissions(criteria, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    FdaSubmissionCriteria criteria = new FdaSubmissionCriteria(); // FdaSubmissionCriteria | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<FdaSubmission> result = apiInstance.getAllFdaSubmissions(criteria, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#getAllFdaSubmissions");
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
 **criteria** | [**FdaSubmissionCriteria**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;FdaSubmission&gt;**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getFdaSubmission"></a>
# **getFdaSubmission**
> FdaSubmission getFdaSubmission(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      FdaSubmission result = apiInstance.getFdaSubmission(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#getFdaSubmission");
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

[**FdaSubmission**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getFdaSubmissionByNumber"></a>
# **getFdaSubmissionByNumber**
> FdaSubmission getFdaSubmissionByNumber(number, supplementNumber)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    String number = "number_example"; // String | 
    String supplementNumber = "supplementNumber_example"; // String | 
    try {
      FdaSubmission result = apiInstance.getFdaSubmissionByNumber(number, supplementNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#getFdaSubmissionByNumber");
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
 **number** | **String**|  |
 **supplementNumber** | **String**|  | [optional]

### Return type

[**FdaSubmission**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateFdaSubmission"></a>
# **partialUpdateFdaSubmission**
> FdaSubmission partialUpdateFdaSubmission(id, fdaSubmission)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    FdaSubmission fdaSubmission = new FdaSubmission(); // FdaSubmission | 
    try {
      FdaSubmission result = apiInstance.partialUpdateFdaSubmission(id, fdaSubmission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#partialUpdateFdaSubmission");
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
 **fdaSubmission** | [**FdaSubmission**](FdaSubmission.md)|  |

### Return type

[**FdaSubmission**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="searchFdaSubmissions"></a>
# **searchFdaSubmissions**
> List&lt;FdaSubmission&gt; searchFdaSubmissions(query, pageable)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    String query = "query_example"; // String | 
    Pageable pageable = new Pageable(); // Pageable | 
    try {
      List<FdaSubmission> result = apiInstance.searchFdaSubmissions(query, pageable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#searchFdaSubmissions");
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
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**List&lt;FdaSubmission&gt;**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateFdaSubmission"></a>
# **updateFdaSubmission**
> FdaSubmission updateFdaSubmission(id, fdaSubmission)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.FdaSubmissionResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    FdaSubmissionResourceApi apiInstance = new FdaSubmissionResourceApi(defaultClient);
    Long id = 56L; // Long | 
    FdaSubmission fdaSubmission = new FdaSubmission(); // FdaSubmission | 
    try {
      FdaSubmission result = apiInstance.updateFdaSubmission(id, fdaSubmission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FdaSubmissionResourceApi#updateFdaSubmission");
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
 **fdaSubmission** | [**FdaSubmission**](FdaSubmission.md)|  |

### Return type

[**FdaSubmission**](FdaSubmission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

