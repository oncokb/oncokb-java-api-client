# GenesetsApi

All URIs are relative to *http://oncokb-core:8888/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genesetsGetUsingGET**](GenesetsApi.md#genesetsGetUsingGET) | **GET** /genesets | genesetsGet
[**genesetsUuidGetUsingGET**](GenesetsApi.md#genesetsUuidGetUsingGET) | **GET** /genesets/{uuid} | genesetsUuidGet


<a name="genesetsGetUsingGET"></a>
# **genesetsGetUsingGET**
> List&lt;Geneset&gt; genesetsGetUsingGET()

genesetsGet

Get list of currently curated genesets.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.GenesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    GenesetsApi apiInstance = new GenesetsApi(defaultClient);
    try {
      List<Geneset> result = apiInstance.genesetsGetUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenesetsApi#genesetsGetUsingGET");
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

[**List&lt;Geneset&gt;**](Geneset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="genesetsUuidGetUsingGET"></a>
# **genesetsUuidGetUsingGET**
> Geneset genesetsUuidGetUsingGET(uuid)

genesetsUuidGet

Find geneset by uuid

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.GenesetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://oncokb-core:8888/api/v1");

    GenesetsApi apiInstance = new GenesetsApi(defaultClient);
    String uuid = "uuid_example"; // String | Geneset UUID
    try {
      Geneset result = apiInstance.genesetsUuidGetUsingGET(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenesetsApi#genesetsUuidGetUsingGET");
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
 **uuid** | **String**| Geneset UUID |

### Return type

[**Geneset**](Geneset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

