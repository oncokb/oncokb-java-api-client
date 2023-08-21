# DrugBrandResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrugBrand**](DrugBrandResourceApi.md#createDrugBrand) | **POST** /api/drug-brands | 
[**deleteDrugBrand**](DrugBrandResourceApi.md#deleteDrugBrand) | **DELETE** /api/drug-brands/{id} | 
[**getAllDrugBrands**](DrugBrandResourceApi.md#getAllDrugBrands) | **GET** /api/drug-brands | 
[**getDrugBrand**](DrugBrandResourceApi.md#getDrugBrand) | **GET** /api/drug-brands/{id} | 
[**partialUpdateDrugBrand**](DrugBrandResourceApi.md#partialUpdateDrugBrand) | **PATCH** /api/drug-brands/{id} | 
[**updateDrugBrand**](DrugBrandResourceApi.md#updateDrugBrand) | **PUT** /api/drug-brands/{id} | 


<a name="createDrugBrand"></a>
# **createDrugBrand**
> DrugBrand createDrugBrand(drugBrand)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugBrandResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugBrandResourceApi apiInstance = new DrugBrandResourceApi(defaultClient);
    DrugBrand drugBrand = new DrugBrand(); // DrugBrand | 
    try {
      DrugBrand result = apiInstance.createDrugBrand(drugBrand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugBrandResourceApi#createDrugBrand");
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
 **drugBrand** | [**DrugBrand**](DrugBrand.md)|  |

### Return type

[**DrugBrand**](DrugBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteDrugBrand"></a>
# **deleteDrugBrand**
> deleteDrugBrand(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugBrandResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugBrandResourceApi apiInstance = new DrugBrandResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteDrugBrand(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugBrandResourceApi#deleteDrugBrand");
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

<a name="getAllDrugBrands"></a>
# **getAllDrugBrands**
> List&lt;DrugBrand&gt; getAllDrugBrands()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugBrandResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugBrandResourceApi apiInstance = new DrugBrandResourceApi(defaultClient);
    try {
      List<DrugBrand> result = apiInstance.getAllDrugBrands();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugBrandResourceApi#getAllDrugBrands");
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

[**List&lt;DrugBrand&gt;**](DrugBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getDrugBrand"></a>
# **getDrugBrand**
> DrugBrand getDrugBrand(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugBrandResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugBrandResourceApi apiInstance = new DrugBrandResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      DrugBrand result = apiInstance.getDrugBrand(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugBrandResourceApi#getDrugBrand");
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

[**DrugBrand**](DrugBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateDrugBrand"></a>
# **partialUpdateDrugBrand**
> DrugBrand partialUpdateDrugBrand(id, drugBrand)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugBrandResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugBrandResourceApi apiInstance = new DrugBrandResourceApi(defaultClient);
    Long id = 56L; // Long | 
    DrugBrand drugBrand = new DrugBrand(); // DrugBrand | 
    try {
      DrugBrand result = apiInstance.partialUpdateDrugBrand(id, drugBrand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugBrandResourceApi#partialUpdateDrugBrand");
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
 **drugBrand** | [**DrugBrand**](DrugBrand.md)|  |

### Return type

[**DrugBrand**](DrugBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateDrugBrand"></a>
# **updateDrugBrand**
> DrugBrand updateDrugBrand(id, drugBrand)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.DrugBrandResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    DrugBrandResourceApi apiInstance = new DrugBrandResourceApi(defaultClient);
    Long id = 56L; // Long | 
    DrugBrand drugBrand = new DrugBrand(); // DrugBrand | 
    try {
      DrugBrand result = apiInstance.updateDrugBrand(id, drugBrand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrugBrandResourceApi#updateDrugBrand");
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
 **drugBrand** | [**DrugBrand**](DrugBrand.md)|  |

### Return type

[**DrugBrand**](DrugBrand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

