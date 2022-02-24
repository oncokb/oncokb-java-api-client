/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * The version of the OpenAPI document: v1.2.2
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.client;

import org.oncokb.ApiCallback;
import org.oncokb.ApiClient;
import org.oncokb.ApiException;
import org.oncokb.ApiResponse;
import org.oncokb.Configuration;
import org.oncokb.Pair;
import org.oncokb.ProgressRequestBody;
import org.oncokb.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.oncokb.client.Evidence;
import org.oncokb.client.EvidenceQueries;
import org.oncokb.client.EvidenceQueryRes;
import org.oncokb.client.ResponseEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvidencesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EvidencesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EvidencesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for evidencesLookupGetUsingGET
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param variant Variant name. (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param consequence Consequence. Possible value: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant (optional)
     * @param proteinStart Protein Start. (optional)
     * @param proteinEnd Protein End. (optional)
     * @param highestLevelOnly Only show highest level evidences (optional, default to false)
     * @param levelOfEvidence Separate by comma. LEVEL_1, LEVEL_2A, LEVEL_2B, LEVEL_3A, LEVEL_3B, LEVEL_4, LEVEL_R1, LEVEL_R2, LEVEL_R3 (optional)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND, MUTATION_SUMMARY, ONCOGENIC, MUTATION_EFFECT, VUS, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, TUMOR_TYPE_SUMMARY, DIAGNOSTIC_SUMMARY, PROGNOSTIC_SUMMARY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE (optional)
     * @param fields The fields to be returned. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesLookupGetUsingGETCall(Integer entrezGeneId, String hugoSymbol, String variant, String tumorType, String consequence, String proteinStart, String proteinEnd, Boolean highestLevelOnly, String levelOfEvidence, String evidenceTypes, String fields, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/evidences/lookup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (entrezGeneId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("entrezGeneId", entrezGeneId));
        }

        if (hugoSymbol != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hugoSymbol", hugoSymbol));
        }

        if (variant != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("variant", variant));
        }

        if (tumorType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tumorType", tumorType));
        }

        if (consequence != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("consequence", consequence));
        }

        if (proteinStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("proteinStart", proteinStart));
        }

        if (proteinEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("proteinEnd", proteinEnd));
        }

        if (highestLevelOnly != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("highestLevelOnly", highestLevelOnly));
        }

        if (levelOfEvidence != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("levelOfEvidence", levelOfEvidence));
        }

        if (evidenceTypes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("evidenceTypes", evidenceTypes));
        }

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call evidencesLookupGetUsingGETValidateBeforeCall(Integer entrezGeneId, String hugoSymbol, String variant, String tumorType, String consequence, String proteinStart, String proteinEnd, Boolean highestLevelOnly, String levelOfEvidence, String evidenceTypes, String fields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = evidencesLookupGetUsingGETCall(entrezGeneId, hugoSymbol, variant, tumorType, consequence, proteinStart, proteinEnd, highestLevelOnly, levelOfEvidence, evidenceTypes, fields, _callback);
        return localVarCall;

    }

    /**
     * evidencesLookupGet
     * Search evidences. Multi-queries are supported.
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param variant Variant name. (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param consequence Consequence. Possible value: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant (optional)
     * @param proteinStart Protein Start. (optional)
     * @param proteinEnd Protein End. (optional)
     * @param highestLevelOnly Only show highest level evidences (optional, default to false)
     * @param levelOfEvidence Separate by comma. LEVEL_1, LEVEL_2A, LEVEL_2B, LEVEL_3A, LEVEL_3B, LEVEL_4, LEVEL_R1, LEVEL_R2, LEVEL_R3 (optional)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND, MUTATION_SUMMARY, ONCOGENIC, MUTATION_EFFECT, VUS, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, TUMOR_TYPE_SUMMARY, DIAGNOSTIC_SUMMARY, PROGNOSTIC_SUMMARY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE (optional)
     * @param fields The fields to be returned. (optional)
     * @return List&lt;Evidence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Evidence> evidencesLookupGetUsingGET(Integer entrezGeneId, String hugoSymbol, String variant, String tumorType, String consequence, String proteinStart, String proteinEnd, Boolean highestLevelOnly, String levelOfEvidence, String evidenceTypes, String fields) throws ApiException {
        ApiResponse<List<Evidence>> localVarResp = evidencesLookupGetUsingGETWithHttpInfo(entrezGeneId, hugoSymbol, variant, tumorType, consequence, proteinStart, proteinEnd, highestLevelOnly, levelOfEvidence, evidenceTypes, fields);
        return localVarResp.getData();
    }

    /**
     * evidencesLookupGet
     * Search evidences. Multi-queries are supported.
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param variant Variant name. (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param consequence Consequence. Possible value: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant (optional)
     * @param proteinStart Protein Start. (optional)
     * @param proteinEnd Protein End. (optional)
     * @param highestLevelOnly Only show highest level evidences (optional, default to false)
     * @param levelOfEvidence Separate by comma. LEVEL_1, LEVEL_2A, LEVEL_2B, LEVEL_3A, LEVEL_3B, LEVEL_4, LEVEL_R1, LEVEL_R2, LEVEL_R3 (optional)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND, MUTATION_SUMMARY, ONCOGENIC, MUTATION_EFFECT, VUS, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, TUMOR_TYPE_SUMMARY, DIAGNOSTIC_SUMMARY, PROGNOSTIC_SUMMARY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE (optional)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;Evidence&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Evidence>> evidencesLookupGetUsingGETWithHttpInfo(Integer entrezGeneId, String hugoSymbol, String variant, String tumorType, String consequence, String proteinStart, String proteinEnd, Boolean highestLevelOnly, String levelOfEvidence, String evidenceTypes, String fields) throws ApiException {
        okhttp3.Call localVarCall = evidencesLookupGetUsingGETValidateBeforeCall(entrezGeneId, hugoSymbol, variant, tumorType, consequence, proteinStart, proteinEnd, highestLevelOnly, levelOfEvidence, evidenceTypes, fields, null);
        Type localVarReturnType = new TypeToken<List<Evidence>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * evidencesLookupGet (asynchronously)
     * Search evidences. Multi-queries are supported.
     * @param entrezGeneId The entrez gene ID. (optional)
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (optional)
     * @param variant Variant name. (optional)
     * @param tumorType Tumor type name. OncoTree code is supported. (optional)
     * @param consequence Consequence. Possible value: feature_truncation, frameshift_variant, inframe_deletion, inframe_insertion, start_lost, missense_variant, splice_region_variant, stop_gained, synonymous_variant (optional)
     * @param proteinStart Protein Start. (optional)
     * @param proteinEnd Protein End. (optional)
     * @param highestLevelOnly Only show highest level evidences (optional, default to false)
     * @param levelOfEvidence Separate by comma. LEVEL_1, LEVEL_2A, LEVEL_2B, LEVEL_3A, LEVEL_3B, LEVEL_4, LEVEL_R1, LEVEL_R2, LEVEL_R3 (optional)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND, MUTATION_SUMMARY, ONCOGENIC, MUTATION_EFFECT, VUS, PROGNOSTIC_IMPLICATION, DIAGNOSTIC_IMPLICATION, TUMOR_TYPE_SUMMARY, DIAGNOSTIC_SUMMARY, PROGNOSTIC_SUMMARY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY, STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY, INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE (optional)
     * @param fields The fields to be returned. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesLookupGetUsingGETAsync(Integer entrezGeneId, String hugoSymbol, String variant, String tumorType, String consequence, String proteinStart, String proteinEnd, Boolean highestLevelOnly, String levelOfEvidence, String evidenceTypes, String fields, final ApiCallback<List<Evidence>> _callback) throws ApiException {

        okhttp3.Call localVarCall = evidencesLookupGetUsingGETValidateBeforeCall(entrezGeneId, hugoSymbol, variant, tumorType, consequence, proteinStart, proteinEnd, highestLevelOnly, levelOfEvidence, evidenceTypes, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Evidence>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for evidencesLookupPostUsingPOST
     * @param body List of queries. Please see swagger.json for request body format. Please use JSON string. (required)
     * @param fields The fields to be returned. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesLookupPostUsingPOSTCall(EvidenceQueries body, String fields, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/evidences/lookup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call evidencesLookupPostUsingPOSTValidateBeforeCall(EvidenceQueries body, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling evidencesLookupPostUsingPOST(Async)");
        }
        

        okhttp3.Call localVarCall = evidencesLookupPostUsingPOSTCall(body, fields, _callback);
        return localVarCall;

    }

    /**
     * evidencesLookupPost
     * Search evidences.
     * @param body List of queries. Please see swagger.json for request body format. Please use JSON string. (required)
     * @param fields The fields to be returned. (optional)
     * @return List&lt;EvidenceQueryRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<EvidenceQueryRes> evidencesLookupPostUsingPOST(EvidenceQueries body, String fields) throws ApiException {
        ApiResponse<List<EvidenceQueryRes>> localVarResp = evidencesLookupPostUsingPOSTWithHttpInfo(body, fields);
        return localVarResp.getData();
    }

    /**
     * evidencesLookupPost
     * Search evidences.
     * @param body List of queries. Please see swagger.json for request body format. Please use JSON string. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;EvidenceQueryRes&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<EvidenceQueryRes>> evidencesLookupPostUsingPOSTWithHttpInfo(EvidenceQueries body, String fields) throws ApiException {
        okhttp3.Call localVarCall = evidencesLookupPostUsingPOSTValidateBeforeCall(body, fields, null);
        Type localVarReturnType = new TypeToken<List<EvidenceQueryRes>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * evidencesLookupPost (asynchronously)
     * Search evidences.
     * @param body List of queries. Please see swagger.json for request body format. Please use JSON string. (required)
     * @param fields The fields to be returned. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesLookupPostUsingPOSTAsync(EvidenceQueries body, String fields, final ApiCallback<List<EvidenceQueryRes>> _callback) throws ApiException {

        okhttp3.Call localVarCall = evidencesLookupPostUsingPOSTValidateBeforeCall(body, fields, _callback);
        Type localVarReturnType = new TypeToken<List<EvidenceQueryRes>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for evidencesUUIDGetUsingGET
     * @param uuid Unique identifier. (required)
     * @param fields The fields to be returned. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesUUIDGetUsingGETCall(String uuid, String fields, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/evidences/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call evidencesUUIDGetUsingGETValidateBeforeCall(String uuid, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling evidencesUUIDGetUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = evidencesUUIDGetUsingGETCall(uuid, fields, _callback);
        return localVarCall;

    }

    /**
     * evidencesUUIDGet
     * Get specific evidence.
     * @param uuid Unique identifier. (required)
     * @param fields The fields to be returned. (optional)
     * @return Evidence
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public Evidence evidencesUUIDGetUsingGET(String uuid, String fields) throws ApiException {
        ApiResponse<Evidence> localVarResp = evidencesUUIDGetUsingGETWithHttpInfo(uuid, fields);
        return localVarResp.getData();
    }

    /**
     * evidencesUUIDGet
     * Get specific evidence.
     * @param uuid Unique identifier. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;Evidence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Evidence> evidencesUUIDGetUsingGETWithHttpInfo(String uuid, String fields) throws ApiException {
        okhttp3.Call localVarCall = evidencesUUIDGetUsingGETValidateBeforeCall(uuid, fields, null);
        Type localVarReturnType = new TypeToken<Evidence>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * evidencesUUIDGet (asynchronously)
     * Get specific evidence.
     * @param uuid Unique identifier. (required)
     * @param fields The fields to be returned. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesUUIDGetUsingGETAsync(String uuid, String fields, final ApiCallback<Evidence> _callback) throws ApiException {

        okhttp3.Call localVarCall = evidencesUUIDGetUsingGETValidateBeforeCall(uuid, fields, _callback);
        Type localVarReturnType = new TypeToken<Evidence>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for evidencesUUIDsGetUsingPOST
     * @param uuids Unique identifier list. (required)
     * @param fields The fields to be returned. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesUUIDsGetUsingPOSTCall(List<String> uuids, String fields, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = uuids;

        // create path and map variables
        String localVarPath = "/evidences";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call evidencesUUIDsGetUsingPOSTValidateBeforeCall(List<String> uuids, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuids' is set
        if (uuids == null) {
            throw new ApiException("Missing the required parameter 'uuids' when calling evidencesUUIDsGetUsingPOST(Async)");
        }
        

        okhttp3.Call localVarCall = evidencesUUIDsGetUsingPOSTCall(uuids, fields, _callback);
        return localVarCall;

    }

    /**
     * evidencesUUIDsGet
     * Get specific evidences.
     * @param uuids Unique identifier list. (required)
     * @param fields The fields to be returned. (optional)
     * @return Evidence
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public Evidence evidencesUUIDsGetUsingPOST(List<String> uuids, String fields) throws ApiException {
        ApiResponse<Evidence> localVarResp = evidencesUUIDsGetUsingPOSTWithHttpInfo(uuids, fields);
        return localVarResp.getData();
    }

    /**
     * evidencesUUIDsGet
     * Get specific evidences.
     * @param uuids Unique identifier list. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;Evidence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Evidence> evidencesUUIDsGetUsingPOSTWithHttpInfo(List<String> uuids, String fields) throws ApiException {
        okhttp3.Call localVarCall = evidencesUUIDsGetUsingPOSTValidateBeforeCall(uuids, fields, null);
        Type localVarReturnType = new TypeToken<Evidence>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * evidencesUUIDsGet (asynchronously)
     * Get specific evidences.
     * @param uuids Unique identifier list. (required)
     * @param fields The fields to be returned. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error, error message will be given. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call evidencesUUIDsGetUsingPOSTAsync(List<String> uuids, String fields, final ApiCallback<Evidence> _callback) throws ApiException {

        okhttp3.Call localVarCall = evidencesUUIDsGetUsingPOSTValidateBeforeCall(uuids, fields, _callback);
        Type localVarReturnType = new TypeToken<Evidence>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
