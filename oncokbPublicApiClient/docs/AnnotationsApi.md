# AnnotationsApi

All URIs are relative to *https://www.oncokb.org/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annotateCopyNumberAlterationsGetUsingGET1**](AnnotationsApi.md#annotateCopyNumberAlterationsGetUsingGET1) | **GET** /annotate/copyNumberAlterations | annotateCopyNumberAlterationsGet
[**annotateCopyNumberAlterationsPostUsingPOST1**](AnnotationsApi.md#annotateCopyNumberAlterationsPostUsingPOST1) | **POST** /annotate/copyNumberAlterations | annotateCopyNumberAlterationsPost
[**annotateMutationsByGenomicChangeGetUsingGET1**](AnnotationsApi.md#annotateMutationsByGenomicChangeGetUsingGET1) | **GET** /annotate/mutations/byGenomicChange | annotateMutationsByGenomicChangeGet
[**annotateMutationsByGenomicChangePostUsingPOST1**](AnnotationsApi.md#annotateMutationsByGenomicChangePostUsingPOST1) | **POST** /annotate/mutations/byGenomicChange | annotateMutationsByGenomicChangePost
[**annotateMutationsByHGVSgGetUsingGET1**](AnnotationsApi.md#annotateMutationsByHGVSgGetUsingGET1) | **GET** /annotate/mutations/byHGVSg | annotateMutationsByHGVSgGet
[**annotateMutationsByHGVSgPostUsingPOST1**](AnnotationsApi.md#annotateMutationsByHGVSgPostUsingPOST1) | **POST** /annotate/mutations/byHGVSg | annotateMutationsByHGVSgPost
[**annotateMutationsByProteinChangeGetUsingGET1**](AnnotationsApi.md#annotateMutationsByProteinChangeGetUsingGET1) | **GET** /annotate/mutations/byProteinChange | annotateMutationsByProteinChangeGet
[**annotateMutationsByProteinChangePostUsingPOST1**](AnnotationsApi.md#annotateMutationsByProteinChangePostUsingPOST1) | **POST** /annotate/mutations/byProteinChange | annotateMutationsByProteinChangePost
[**annotateStructuralVariantsGetUsingGET1**](AnnotationsApi.md#annotateStructuralVariantsGetUsingGET1) | **GET** /annotate/structuralVariants | annotateStructuralVariantsGet
[**annotateStructuralVariantsPostUsingPOST1**](AnnotationsApi.md#annotateStructuralVariantsPostUsingPOST1) | **POST** /annotate/structuralVariants | annotateStructuralVariantsPost


<a name="annotateCopyNumberAlterationsGetUsingGET1"></a>
# **annotateCopyNumberAlterationsGetUsingGET1**
> IndicatorQueryResp annotateCopyNumberAlterationsGetUsingGET1(copyNameAlterationType, hugoSymbol, entrezGeneId, referenceGenome, tumorType, evidenceType)

annotateCopyNumberAlterationsGet

Annotate copy number alteration.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    String copyNameAlterationType = "AMPLIFICATION"; // String | Copy number alteration type
    String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation. Example: BRAF
    Integer entrezGeneId = 56; // Integer | The entrez gene ID. (Higher priority than hugoSymbol). Example: 673
    String referenceGenome = "GRCh37"; // String | Reference genome, either GRCh37 or GRCh38. The default is GRCh37
    String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
    String evidenceType = "evidenceType_example"; // String | Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use ',' as separator.
    try {
      IndicatorQueryResp result = apiInstance.annotateCopyNumberAlterationsGetUsingGET1(copyNameAlterationType, hugoSymbol, entrezGeneId, referenceGenome, tumorType, evidenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateCopyNumberAlterationsGetUsingGET1");
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
 **copyNameAlterationType** | **String**| Copy number alteration type | [enum: AMPLIFICATION, DELETION, GAIN, LOSS]
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. Example: BRAF | [optional]
 **entrezGeneId** | **Integer**| The entrez gene ID. (Higher priority than hugoSymbol). Example: 673 | [optional]
 **referenceGenome** | **String**| Reference genome, either GRCh37 or GRCh38. The default is GRCh37 | [optional] [default to GRCh37]
 **tumorType** | **String**| OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]
 **evidenceType** | **String**| Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use &#39;,&#39; as separator. | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateCopyNumberAlterationsPostUsingPOST1"></a>
# **annotateCopyNumberAlterationsPostUsingPOST1**
> List&lt;IndicatorQueryResp&gt; annotateCopyNumberAlterationsPostUsingPOST1(body)

annotateCopyNumberAlterationsPost

Annotate copy number alterations.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    List<AnnotateCopyNumberAlterationQuery> body = Arrays.asList(); // List<AnnotateCopyNumberAlterationQuery> | List of queries. Please see swagger.json for request body format.
    try {
      List<IndicatorQueryResp> result = apiInstance.annotateCopyNumberAlterationsPostUsingPOST1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateCopyNumberAlterationsPostUsingPOST1");
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
 **body** | [**List&lt;AnnotateCopyNumberAlterationQuery&gt;**](AnnotateCopyNumberAlterationQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateMutationsByGenomicChangeGetUsingGET1"></a>
# **annotateMutationsByGenomicChangeGetUsingGET1**
> IndicatorQueryResp annotateMutationsByGenomicChangeGetUsingGET1(genomicLocation, referenceGenome, tumorType, evidenceType)

annotateMutationsByGenomicChangeGet

Annotate mutation by genomic change.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    String genomicLocation = "genomicLocation_example"; // String | Genomic location. Example: 7,140453136,140453136,A,T
    String referenceGenome = "GRCh37"; // String | Reference genome, either GRCh37 or GRCh38. The default is GRCh37
    String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
    String evidenceType = "evidenceType_example"; // String | Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use ',' as separator.
    try {
      IndicatorQueryResp result = apiInstance.annotateMutationsByGenomicChangeGetUsingGET1(genomicLocation, referenceGenome, tumorType, evidenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateMutationsByGenomicChangeGetUsingGET1");
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
 **genomicLocation** | **String**| Genomic location. Example: 7,140453136,140453136,A,T |
 **referenceGenome** | **String**| Reference genome, either GRCh37 or GRCh38. The default is GRCh37 | [optional] [default to GRCh37]
 **tumorType** | **String**| OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]
 **evidenceType** | **String**| Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use &#39;,&#39; as separator. | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateMutationsByGenomicChangePostUsingPOST1"></a>
# **annotateMutationsByGenomicChangePostUsingPOST1**
> List&lt;IndicatorQueryResp&gt; annotateMutationsByGenomicChangePostUsingPOST1(body)

annotateMutationsByGenomicChangePost

Annotate mutations by genomic change.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    List<AnnotateMutationByGenomicChangeQuery> body = Arrays.asList(); // List<AnnotateMutationByGenomicChangeQuery> | List of queries. Please see swagger.json for request body format.
    try {
      List<IndicatorQueryResp> result = apiInstance.annotateMutationsByGenomicChangePostUsingPOST1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateMutationsByGenomicChangePostUsingPOST1");
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
 **body** | [**List&lt;AnnotateMutationByGenomicChangeQuery&gt;**](AnnotateMutationByGenomicChangeQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateMutationsByHGVSgGetUsingGET1"></a>
# **annotateMutationsByHGVSgGetUsingGET1**
> IndicatorQueryResp annotateMutationsByHGVSgGetUsingGET1(hgvsg, referenceGenome, tumorType, evidenceType)

annotateMutationsByHGVSgGet

Annotate mutation by HGVSg.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    String hgvsg = "hgvsg_example"; // String | HGVS genomic format. Example: 7:g.140453136A>T
    String referenceGenome = "GRCh37"; // String | Reference genome, either GRCh37 or GRCh38. The default is GRCh37
    String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
    String evidenceType = "evidenceType_example"; // String | Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use ',' as separator.
    try {
      IndicatorQueryResp result = apiInstance.annotateMutationsByHGVSgGetUsingGET1(hgvsg, referenceGenome, tumorType, evidenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateMutationsByHGVSgGetUsingGET1");
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
 **hgvsg** | **String**| HGVS genomic format. Example: 7:g.140453136A&gt;T |
 **referenceGenome** | **String**| Reference genome, either GRCh37 or GRCh38. The default is GRCh37 | [optional] [default to GRCh37]
 **tumorType** | **String**| OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]
 **evidenceType** | **String**| Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use &#39;,&#39; as separator. | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateMutationsByHGVSgPostUsingPOST1"></a>
# **annotateMutationsByHGVSgPostUsingPOST1**
> List&lt;IndicatorQueryResp&gt; annotateMutationsByHGVSgPostUsingPOST1(body)

annotateMutationsByHGVSgPost

Annotate mutations by genomic change.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    List<AnnotateMutationByHGVSgQuery> body = Arrays.asList(); // List<AnnotateMutationByHGVSgQuery> | List of queries. Please see swagger.json for request body format.
    try {
      List<IndicatorQueryResp> result = apiInstance.annotateMutationsByHGVSgPostUsingPOST1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateMutationsByHGVSgPostUsingPOST1");
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
 **body** | [**List&lt;AnnotateMutationByHGVSgQuery&gt;**](AnnotateMutationByHGVSgQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateMutationsByProteinChangeGetUsingGET1"></a>
# **annotateMutationsByProteinChangeGetUsingGET1**
> IndicatorQueryResp annotateMutationsByProteinChangeGetUsingGET1(hugoSymbol, entrezGeneId, alteration, referenceGenome, consequence, proteinStart, proteinEnd, tumorType, evidenceType)

annotateMutationsByProteinChangeGet

Annotate mutation by protein change.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    String hugoSymbol = "hugoSymbol_example"; // String | The gene symbol used in Human Genome Organisation. Example: BRAF
    Integer entrezGeneId = 56; // Integer | The entrez gene ID. (Higher priority than hugoSymbol). Example: 673
    String alteration = "alteration_example"; // String | Protein Change. Example: V600E
    String referenceGenome = "GRCh37"; // String | Reference genome, either GRCh37 or GRCh38. The default is GRCh37
    String consequence = "feature_truncation"; // String | Consequence. Exacmple: missense_variant
    Integer proteinStart = 56; // Integer | Protein Start. Example: 600
    Integer proteinEnd = 56; // Integer | Protein End. Example: 600
    String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
    String evidenceType = "evidenceType_example"; // String | Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use ',' as separator.
    try {
      IndicatorQueryResp result = apiInstance.annotateMutationsByProteinChangeGetUsingGET1(hugoSymbol, entrezGeneId, alteration, referenceGenome, consequence, proteinStart, proteinEnd, tumorType, evidenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateMutationsByProteinChangeGetUsingGET1");
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
 **hugoSymbol** | **String**| The gene symbol used in Human Genome Organisation. Example: BRAF | [optional]
 **entrezGeneId** | **Integer**| The entrez gene ID. (Higher priority than hugoSymbol). Example: 673 | [optional]
 **alteration** | **String**| Protein Change. Example: V600E | [optional]
 **referenceGenome** | **String**| Reference genome, either GRCh37 or GRCh38. The default is GRCh37 | [optional] [default to GRCh37]
 **consequence** | **String**| Consequence. Exacmple: missense_variant | [optional] [enum: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant, intron_variant]
 **proteinStart** | **Integer**| Protein Start. Example: 600 | [optional]
 **proteinEnd** | **Integer**| Protein End. Example: 600 | [optional]
 **tumorType** | **String**| OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]
 **evidenceType** | **String**| Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use &#39;,&#39; as separator. | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateMutationsByProteinChangePostUsingPOST1"></a>
# **annotateMutationsByProteinChangePostUsingPOST1**
> List&lt;IndicatorQueryResp&gt; annotateMutationsByProteinChangePostUsingPOST1(body)

annotateMutationsByProteinChangePost

Annotate mutations by protein change.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    List<AnnotateMutationByProteinChangeQuery> body = Arrays.asList(); // List<AnnotateMutationByProteinChangeQuery> | List of queries. Please see swagger.json for request body format.
    try {
      List<IndicatorQueryResp> result = apiInstance.annotateMutationsByProteinChangePostUsingPOST1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateMutationsByProteinChangePostUsingPOST1");
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
 **body** | [**List&lt;AnnotateMutationByProteinChangeQuery&gt;**](AnnotateMutationByProteinChangeQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateStructuralVariantsGetUsingGET1"></a>
# **annotateStructuralVariantsGetUsingGET1**
> IndicatorQueryResp annotateStructuralVariantsGetUsingGET1(structuralVariantType, isFunctionalFusion, hugoSymbolA, entrezGeneIdA, hugoSymbolB, entrezGeneIdB, referenceGenome, tumorType, evidenceType)

annotateStructuralVariantsGet

Annotate structural variant.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    String structuralVariantType = "DELETION"; // String | Structural variant type
    Boolean isFunctionalFusion = false; // Boolean | Whether is functional fusion
    String hugoSymbolA = "hugoSymbolA_example"; // String | The gene symbol A used in Human Genome Organisation. Example: ABL1
    Integer entrezGeneIdA = 56; // Integer | The entrez gene ID A. (Higher priority than hugoSymbolA) Example: 25
    String hugoSymbolB = "hugoSymbolB_example"; // String | The gene symbol B used in Human Genome Organisation.Example: BCR 
    Integer entrezGeneIdB = 56; // Integer | The entrez gene ID B. (Higher priority than hugoSymbolB) Example: 613
    String referenceGenome = "GRCh37"; // String | Reference genome, either GRCh37 or GRCh38. The default is GRCh37
    String tumorType = "tumorType_example"; // String | OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma
    String evidenceType = "evidenceType_example"; // String | Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use ',' as separator.
    try {
      IndicatorQueryResp result = apiInstance.annotateStructuralVariantsGetUsingGET1(structuralVariantType, isFunctionalFusion, hugoSymbolA, entrezGeneIdA, hugoSymbolB, entrezGeneIdB, referenceGenome, tumorType, evidenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateStructuralVariantsGetUsingGET1");
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
 **structuralVariantType** | **String**| Structural variant type | [enum: DELETION, TRANSLOCATION, DUPLICATION, INSERTION, INVERSION, FUSION, UNKNOWN]
 **isFunctionalFusion** | **Boolean**| Whether is functional fusion | [default to false]
 **hugoSymbolA** | **String**| The gene symbol A used in Human Genome Organisation. Example: ABL1 | [optional]
 **entrezGeneIdA** | **Integer**| The entrez gene ID A. (Higher priority than hugoSymbolA) Example: 25 | [optional]
 **hugoSymbolB** | **String**| The gene symbol B used in Human Genome Organisation.Example: BCR  | [optional]
 **entrezGeneIdB** | **Integer**| The entrez gene ID B. (Higher priority than hugoSymbolB) Example: 613 | [optional]
 **referenceGenome** | **String**| Reference genome, either GRCh37 or GRCh38. The default is GRCh37 | [optional] [default to GRCh37]
 **tumorType** | **String**| OncoTree(http://oncotree.info) tumor type name. The field supports OncoTree Code, OncoTree Name and OncoTree Main type. Example: Melanoma | [optional]
 **evidenceType** | **String**| Evidence type to compute. This could help to improve the performance if you only look for sub-content. Example: ONCOGENIC. All available evidence type are GENE_SUMMARY, MUTATION_SUMMARY, TUMOR_TYPE_SUMMARY, PROGNOSTIC_SUMMARY, DIAGNOSTIC_SUMMARY, ONCOGENIC, MUTATION_EFFECT, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE. For multiple evidence types query, use &#39;,&#39; as separator. | [optional]

### Return type

[**IndicatorQueryResp**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

<a name="annotateStructuralVariantsPostUsingPOST1"></a>
# **annotateStructuralVariantsPostUsingPOST1**
> List&lt;IndicatorQueryResp&gt; annotateStructuralVariantsPostUsingPOST1(body)

annotateStructuralVariantsPost

Annotate structural variants.

### Example
```java
// Import classes:
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.Configuration;
import org.oncokb.models.*;
import org.oncokb.client.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.oncokb.org/api/v1");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    List<AnnotateStructuralVariantQuery> body = Arrays.asList(); // List<AnnotateStructuralVariantQuery> | List of queries. Please see swagger.json for request body format.
    try {
      List<IndicatorQueryResp> result = apiInstance.annotateStructuralVariantsPostUsingPOST1(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#annotateStructuralVariantsPostUsingPOST1");
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
 **body** | [**List&lt;AnnotateStructuralVariantQuery&gt;**](AnnotateStructuralVariantQuery.md)| List of queries. Please see swagger.json for request body format. |

### Return type

[**List&lt;IndicatorQueryResp&gt;**](IndicatorQueryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error, error message will be given. |  -  |

