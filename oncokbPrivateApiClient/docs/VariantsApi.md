# VariantsApi

All URIs are relative to *https://www.oncokb.org/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utilsAllActionableVariantsGetUsingGET**](VariantsApi.md#utilsAllActionableVariantsGetUsingGET) | **GET** /utils/allActionableVariants | utilsAllActionableVariantsGet
[**utilsAllActionableVariantsTxtGetUsingGET**](VariantsApi.md#utilsAllActionableVariantsTxtGetUsingGET) | **GET** /utils/allActionableVariants.txt | utilsAllActionableVariantsTxtGet
[**utilsAllAnnotatedVariantsGetUsingGET**](VariantsApi.md#utilsAllAnnotatedVariantsGetUsingGET) | **GET** /utils/allAnnotatedVariants | utilsAllAnnotatedVariantsGet
[**utilsAllAnnotatedVariantsTxtGetUsingGET**](VariantsApi.md#utilsAllAnnotatedVariantsTxtGetUsingGET) | **GET** /utils/allAnnotatedVariants.txt | utilsAllAnnotatedVariantsTxtGet
[**variantsLookupGetUsingGET**](VariantsApi.md#variantsLookupGetUsingGET) | **GET** /variants/lookup | variantsLookupGet
[**variantsLookupPostUsingPOST**](VariantsApi.md#variantsLookupPostUsingPOST) | **POST** /variants/lookup | variantsLookupPost


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
import org.oncokb.client.VariantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    VariantsApi apiInstance = new VariantsApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      List<ActionableGene> result = apiInstance.utilsAllActionableVariantsGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsApi#utilsAllActionableVariantsGetUsingGET");
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
import org.oncokb.client.VariantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    VariantsApi apiInstance = new VariantsApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      String result = apiInstance.utilsAllActionableVariantsTxtGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsApi#utilsAllActionableVariantsTxtGetUsingGET");
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
import org.oncokb.client.VariantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    VariantsApi apiInstance = new VariantsApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      List<AnnotatedVariant> result = apiInstance.utilsAllAnnotatedVariantsGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsApi#utilsAllAnnotatedVariantsGetUsingGET");
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
import org.oncokb.client.VariantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    VariantsApi apiInstance = new VariantsApi(defaultClient);
    String version = "version_example"; // String | The data version
    try {
      String result = apiInstance.utilsAllAnnotatedVariantsTxtGetUsingGET(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsApi#utilsAllAnnotatedVariantsTxtGetUsingGET");
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

<a name="variantsLookupGetUsingGET"></a>
# **variantsLookupGetUsingGET**
> List&lt;Alteration&gt; variantsLookupGetUsingGET(entrezGeneId, hugoSymbol, variant, referenceGenome, fields)

variantsLookupGet

Search for matched variants.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.VariantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    VariantsApi apiInstance = new VariantsApi(defaultClient);
    Integer entrezGeneId = 56; // Integer | The entrez gene ID. entrezGeneId is prioritize than hugoSymbol if both parameters have been defined
    String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation.
    String variant = "variant_example"; // String | variant name.
    String referenceGenome = "GRCh37"; // String | Reference genome, either GRCh37 or GRCh38. The default is GRCh37
    String fields = "fields_example"; // String | The fields to be returned.
    try {
      List<Alteration> result = apiInstance.variantsLookupGetUsingGET(entrezGeneId, hugoSymbol, variant, referenceGenome, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsApi#variantsLookupGetUsingGET");
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
 **entrezGeneId** | **Integer**| The entrez gene ID. entrezGeneId is prioritize than hugoSymbol if both parameters have been defined | [optional]
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. | [optional]
 **variant** | **String**| variant name. | [optional]
 **referenceGenome** | **String**| Reference genome, either GRCh37 or GRCh38. The default is GRCh37 | [optional] [default to GRCh37]
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;Alteration&gt;**](Alteration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="variantsLookupPostUsingPOST"></a>
# **variantsLookupPostUsingPOST**
> List&lt;List&lt;Object&gt;&gt; variantsLookupPostUsingPOST(body, fields)

variantsLookupPost

Search for variants.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.VariantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    VariantsApi apiInstance = new VariantsApi(defaultClient);
    List<VariantSearchQuery> body = Arrays.asList(); // List<VariantSearchQuery> | List of queries.
    String fields = "fields_example"; // String | The fields to be returned.
    try {
      List<List<Object>> result = apiInstance.variantsLookupPostUsingPOST(body, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsApi#variantsLookupPostUsingPOST");
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
 **body** | [**List&lt;VariantSearchQuery&gt;**](VariantSearchQuery.md)| List of queries. |
 **fields** | **String**| The fields to be returned. | [optional]

### Return type

[**List&lt;List&lt;Object&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

