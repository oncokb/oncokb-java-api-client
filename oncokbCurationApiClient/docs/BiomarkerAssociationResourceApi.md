# BiomarkerAssociationResourceApi

All URIs are relative to *http://beta.curation.oncokb.dev.aws.mskcc.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBiomarkerAssociation**](BiomarkerAssociationResourceApi.md#createBiomarkerAssociation) | **POST** /api/biomarker-associations | 
[**deleteBiomarkerAssociation**](BiomarkerAssociationResourceApi.md#deleteBiomarkerAssociation) | **DELETE** /api/biomarker-associations/{id} | 
[**getAllBiomarkerAssociations**](BiomarkerAssociationResourceApi.md#getAllBiomarkerAssociations) | **GET** /api/biomarker-associations | 
[**getBiomarkerAssociation**](BiomarkerAssociationResourceApi.md#getBiomarkerAssociation) | **GET** /api/biomarker-associations/{id} | 
[**getBiomarkerAssociationByCompanionDiagnosticDevice**](BiomarkerAssociationResourceApi.md#getBiomarkerAssociationByCompanionDiagnosticDevice) | **GET** /api/biomarker-associations/companion-diagnostic-device/{id} | 
[**partialUpdateBiomarkerAssociation**](BiomarkerAssociationResourceApi.md#partialUpdateBiomarkerAssociation) | **PATCH** /api/biomarker-associations/{id} | 
[**updateBiomarkerAssociation**](BiomarkerAssociationResourceApi.md#updateBiomarkerAssociation) | **PUT** /api/biomarker-associations/{id} | 


<a name="createBiomarkerAssociation"></a>
# **createBiomarkerAssociation**
> BiomarkerAssociation createBiomarkerAssociation(biomarkerAssociationDTO)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    BiomarkerAssociationResourceApi apiInstance = new BiomarkerAssociationResourceApi(defaultClient);
    BiomarkerAssociationDTO biomarkerAssociationDTO = new BiomarkerAssociationDTO(); // BiomarkerAssociationDTO | 
    try {
      BiomarkerAssociation result = apiInstance.createBiomarkerAssociation(biomarkerAssociationDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BiomarkerAssociationResourceApi#createBiomarkerAssociation");
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
 **biomarkerAssociationDTO** | [**BiomarkerAssociationDTO**](BiomarkerAssociationDTO.md)|  |

### Return type

[**BiomarkerAssociation**](BiomarkerAssociation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteBiomarkerAssociation"></a>
# **deleteBiomarkerAssociation**
> deleteBiomarkerAssociation(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    BiomarkerAssociationResourceApi apiInstance = new BiomarkerAssociationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.deleteBiomarkerAssociation(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BiomarkerAssociationResourceApi#deleteBiomarkerAssociation");
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

<a name="getAllBiomarkerAssociations"></a>
# **getAllBiomarkerAssociations**
> List&lt;BiomarkerAssociation&gt; getAllBiomarkerAssociations()



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    BiomarkerAssociationResourceApi apiInstance = new BiomarkerAssociationResourceApi(defaultClient);
    try {
      List<BiomarkerAssociation> result = apiInstance.getAllBiomarkerAssociations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BiomarkerAssociationResourceApi#getAllBiomarkerAssociations");
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

[**List&lt;BiomarkerAssociation&gt;**](BiomarkerAssociation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getBiomarkerAssociation"></a>
# **getBiomarkerAssociation**
> BiomarkerAssociation getBiomarkerAssociation(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    BiomarkerAssociationResourceApi apiInstance = new BiomarkerAssociationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      BiomarkerAssociation result = apiInstance.getBiomarkerAssociation(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BiomarkerAssociationResourceApi#getBiomarkerAssociation");
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

[**BiomarkerAssociation**](BiomarkerAssociation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getBiomarkerAssociationByCompanionDiagnosticDevice"></a>
# **getBiomarkerAssociationByCompanionDiagnosticDevice**
> List&lt;BiomarkerAssociation&gt; getBiomarkerAssociationByCompanionDiagnosticDevice(id)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    BiomarkerAssociationResourceApi apiInstance = new BiomarkerAssociationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      List<BiomarkerAssociation> result = apiInstance.getBiomarkerAssociationByCompanionDiagnosticDevice(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BiomarkerAssociationResourceApi#getBiomarkerAssociationByCompanionDiagnosticDevice");
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

[**List&lt;BiomarkerAssociation&gt;**](BiomarkerAssociation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="partialUpdateBiomarkerAssociation"></a>
# **partialUpdateBiomarkerAssociation**
> BiomarkerAssociation partialUpdateBiomarkerAssociation(id, biomarkerAssociation)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    BiomarkerAssociationResourceApi apiInstance = new BiomarkerAssociationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    BiomarkerAssociation biomarkerAssociation = new BiomarkerAssociation(); // BiomarkerAssociation | 
    try {
      BiomarkerAssociation result = apiInstance.partialUpdateBiomarkerAssociation(id, biomarkerAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BiomarkerAssociationResourceApi#partialUpdateBiomarkerAssociation");
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
 **biomarkerAssociation** | [**BiomarkerAssociation**](BiomarkerAssociation.md)|  |

### Return type

[**BiomarkerAssociation**](BiomarkerAssociation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateBiomarkerAssociation"></a>
# **updateBiomarkerAssociation**
> BiomarkerAssociation updateBiomarkerAssociation(id, biomarkerAssociation)



### Example
```java
// Import classes:
import org.oncokb.oncokb_curation.ApiClient;
import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.Configuration;
import org.oncokb.oncokb_curation.models.*;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://beta.curation.oncokb.dev.aws.mskcc.org");

    BiomarkerAssociationResourceApi apiInstance = new BiomarkerAssociationResourceApi(defaultClient);
    Long id = 56L; // Long | 
    BiomarkerAssociation biomarkerAssociation = new BiomarkerAssociation(); // BiomarkerAssociation | 
    try {
      BiomarkerAssociation result = apiInstance.updateBiomarkerAssociation(id, biomarkerAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BiomarkerAssociationResourceApi#updateBiomarkerAssociation");
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
 **biomarkerAssociation** | [**BiomarkerAssociation**](BiomarkerAssociation.md)|  |

### Return type

[**BiomarkerAssociation**](BiomarkerAssociation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

