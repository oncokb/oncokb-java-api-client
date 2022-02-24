# CancerGenesApi

All URIs are relative to *http://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utilsAllActionableVariantsGetUsingGET**](CancerGenesApi.md#utilsAllActionableVariantsGetUsingGET) | **GET** /utils/allActionableVariants | utilsAllActionableVariantsGet
[**utilsAllActionableVariantsTxtGetUsingGET**](CancerGenesApi.md#utilsAllActionableVariantsTxtGetUsingGET) | **GET** /utils/allActionableVariants.txt | utilsAllActionableVariantsTxtGet
[**utilsAllAnnotatedVariantsGetUsingGET**](CancerGenesApi.md#utilsAllAnnotatedVariantsGetUsingGET) | **GET** /utils/allAnnotatedVariants | utilsAllAnnotatedVariantsGet
[**utilsAllAnnotatedVariantsTxtGetUsingGET**](CancerGenesApi.md#utilsAllAnnotatedVariantsTxtGetUsingGET) | **GET** /utils/allAnnotatedVariants.txt | utilsAllAnnotatedVariantsTxtGet
[**utilsAllCuratedGenesGetUsingGET**](CancerGenesApi.md#utilsAllCuratedGenesGetUsingGET) | **GET** /utils/allCuratedGenes | utilsAllCuratedGenesGet
[**utilsAllCuratedGenesTxtGetUsingGET**](CancerGenesApi.md#utilsAllCuratedGenesTxtGetUsingGET) | **GET** /utils/allCuratedGenes.txt | utilsAllCuratedGenesTxtGet
[**utilsCancerGeneListGetUsingGET**](CancerGenesApi.md#utilsCancerGeneListGetUsingGET) | **GET** /utils/cancerGeneList | utilsCancerGeneListGet
[**utilsCancerGeneListTxtGetUsingGET**](CancerGenesApi.md#utilsCancerGeneListTxtGetUsingGET) | **GET** /utils/cancerGeneList.txt | utilsCancerGeneListTxtGet


<a name="utilsAllActionableVariantsGetUsingGET"></a>
# **utilsAllActionableVariantsGetUsingGET**
> List&lt;ActionableGene&gt; utilsAllActionableVariantsGetUsingGET(version)

utilsAllActionableVariantsGet

Get All Actionable Variants.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      List<ActionableGene> result = apiInstance.utilsAllActionableVariantsGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllActionableVariantsGetUsingGET");
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
 **version** | **String**| The data version | [optional]

### Return type

[**List&lt;ActionableGene&gt;**](ActionableGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

<a name="utilsAllActionableVariantsTxtGetUsingGET"></a>
# **utilsAllActionableVariantsTxtGetUsingGET**
> String utilsAllActionableVariantsTxtGetUsingGET(version)

utilsAllActionableVariantsTxtGet

Get All Actionable Variants in text file.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      String result = apiInstance.utilsAllActionableVariantsTxtGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllActionableVariantsTxtGetUsingGET");
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
 **version** | **String**| The data version | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

<a name="utilsAllAnnotatedVariantsGetUsingGET"></a>
# **utilsAllAnnotatedVariantsGetUsingGET**
> List&lt;AnnotatedVariant&gt; utilsAllAnnotatedVariantsGetUsingGET(version)

utilsAllAnnotatedVariantsGet

Get All Annotated Variants.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      List<AnnotatedVariant> result = apiInstance.utilsAllAnnotatedVariantsGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllAnnotatedVariantsGetUsingGET");
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
 **version** | **String**| The data version | [optional]

### Return type

[**List&lt;AnnotatedVariant&gt;**](AnnotatedVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

<a name="utilsAllAnnotatedVariantsTxtGetUsingGET"></a>
# **utilsAllAnnotatedVariantsTxtGetUsingGET**
> String utilsAllAnnotatedVariantsTxtGetUsingGET(version)

utilsAllAnnotatedVariantsTxtGet

Get All Annotated Variants in text file.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      String result = apiInstance.utilsAllAnnotatedVariantsTxtGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllAnnotatedVariantsTxtGetUsingGET");
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
 **version** | **String**| The data version | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

<a name="utilsAllCuratedGenesGetUsingGET"></a>
# **utilsAllCuratedGenesGetUsingGET**
> List&lt;CuratedGene&gt; utilsAllCuratedGenesGetUsingGET(version, includeEvidence)

utilsAllCuratedGenesGet

Get list of genes OncoKB curated

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    Boolean includeEvidence = true; // Boolean | Include gene summary and background
    try {
      List<CuratedGene> result = apiInstance.utilsAllCuratedGenesGetUsingGET(version, includeEvidence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesGetUsingGET");
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
 **version** | **String**| The data version | [optional]
 **includeEvidence** | **Boolean**| Include gene summary and background | [optional] [default to true]

### Return type

[**List&lt;CuratedGene&gt;**](CuratedGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

<a name="utilsAllCuratedGenesTxtGetUsingGET"></a>
# **utilsAllCuratedGenesTxtGetUsingGET**
> String utilsAllCuratedGenesTxtGetUsingGET(version, includeEvidence)

utilsAllCuratedGenesTxtGet

Get list of genes OncoKB curated in text file.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    Boolean includeEvidence = true; // Boolean | Include gene summary and background
    try {
      String result = apiInstance.utilsAllCuratedGenesTxtGetUsingGET(version, includeEvidence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesTxtGetUsingGET");
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
 **version** | **String**| The data version | [optional]
 **includeEvidence** | **Boolean**| Include gene summary and background | [optional] [default to true]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

<a name="utilsCancerGeneListGetUsingGET"></a>
# **utilsCancerGeneListGetUsingGET**
> List&lt;CancerGene&gt; utilsCancerGeneListGetUsingGET(version)

utilsCancerGeneListGet

Get cancer gene list

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      List<CancerGene> result = apiInstance.utilsCancerGeneListGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListGetUsingGET");
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
 **version** | **String**| The data version | [optional]

### Return type

[**List&lt;CancerGene&gt;**](CancerGene.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

<a name="utilsCancerGeneListTxtGetUsingGET"></a>
# **utilsCancerGeneListTxtGetUsingGET**
> String utilsCancerGeneListTxtGetUsingGET(version)

utilsCancerGeneListTxtGet

Get cancer gene list in text file.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      String result = apiInstance.utilsCancerGeneListTxtGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListTxtGetUsingGET");
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
 **version** | **String**| The data version | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**503** | Service Unavailable |  -  |

