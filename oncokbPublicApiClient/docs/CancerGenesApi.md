# CancerGenesApi

All URIs are relative to *https://www.oncokb.org/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**utilsAllCuratedGenesGetUsingGET1**](CancerGenesApi.md#utilsAllCuratedGenesGetUsingGET1) | **GET** /utils/allCuratedGenes | utilsAllCuratedGenesGet |
| [**utilsAllCuratedGenesTxtGetUsingGET1**](CancerGenesApi.md#utilsAllCuratedGenesTxtGetUsingGET1) | **GET** /utils/allCuratedGenes.txt | utilsAllCuratedGenesTxtGet |
| [**utilsCancerGeneListGetUsingGET1**](CancerGenesApi.md#utilsCancerGeneListGetUsingGET1) | **GET** /utils/cancerGeneList | utilsCancerGeneListGet |
| [**utilsCancerGeneListTxtGetUsingGET1**](CancerGenesApi.md#utilsCancerGeneListTxtGetUsingGET1) | **GET** /utils/cancerGeneList.txt | utilsCancerGeneListTxtGet |


<a id="utilsAllCuratedGenesGetUsingGET1"></a>
# **utilsAllCuratedGenesGetUsingGET1**
> List&lt;CuratedGene&gt; utilsAllCuratedGenesGetUsingGET1(version, includeEvidence)

utilsAllCuratedGenesGet

Get list of genes OncoKB curated

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    Boolean includeEvidence = true; // Boolean | Include gene summary and background
    try {
      List<CuratedGene> result = apiInstance.utilsAllCuratedGenesGetUsingGET1(version, includeEvidence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesGetUsingGET1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The data version | [optional] |
| **includeEvidence** | **Boolean**| Include gene summary and background | [optional] [default to true] |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **503** | Service Unavailable |  -  |

<a id="utilsAllCuratedGenesTxtGetUsingGET1"></a>
# **utilsAllCuratedGenesTxtGetUsingGET1**
> String utilsAllCuratedGenesTxtGetUsingGET1(version, includeEvidence)

utilsAllCuratedGenesTxtGet

Get list of genes OncoKB curated in text file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    Boolean includeEvidence = true; // Boolean | Include gene summary and background
    try {
      String result = apiInstance.utilsAllCuratedGenesTxtGetUsingGET1(version, includeEvidence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesTxtGetUsingGET1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The data version | [optional] |
| **includeEvidence** | **Boolean**| Include gene summary and background | [optional] [default to true] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **503** | Service Unavailable |  -  |

<a id="utilsCancerGeneListGetUsingGET1"></a>
# **utilsCancerGeneListGetUsingGET1**
> List&lt;CancerGene&gt; utilsCancerGeneListGetUsingGET1(version)

utilsCancerGeneListGet

Get cancer gene list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      List<CancerGene> result = apiInstance.utilsCancerGeneListGetUsingGET1(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListGetUsingGET1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The data version | [optional] |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **503** | Service Unavailable |  -  |

<a id="utilsCancerGeneListTxtGetUsingGET1"></a>
# **utilsCancerGeneListTxtGetUsingGET1**
> String utilsCancerGeneListTxtGetUsingGET1(version)

utilsCancerGeneListTxtGet

Get cancer gene list in text file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CancerGenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    CancerGenesApi apiInstance = new CancerGenesApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      String result = apiInstance.utilsCancerGeneListTxtGetUsingGET1(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListTxtGetUsingGET1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The data version | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **503** | Service Unavailable |  -  |

