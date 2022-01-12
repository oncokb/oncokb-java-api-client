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


import org.oncokb.client.Alteration;
import org.oncokb.client.Gene;
import org.oncokb.client.GeneEvidence;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GenesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GenesApi(ApiClient apiClient) {
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
     * Build call for genesEntrezGeneIdEvidencesGetUsingGET
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call genesEntrezGeneIdEvidencesGetUsingGETCall(Integer entrezGeneId, String evidenceTypes, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/genes/{entrezGeneId}/evidences"
            .replaceAll("\\{" + "entrezGeneId" + "\\}", localVarApiClient.escapeString(entrezGeneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (evidenceTypes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("evidenceTypes", evidenceTypes));
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
    private okhttp3.Call genesEntrezGeneIdEvidencesGetUsingGETValidateBeforeCall(Integer entrezGeneId, String evidenceTypes, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling genesEntrezGeneIdEvidencesGetUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = genesEntrezGeneIdEvidencesGetUsingGETCall(entrezGeneId, evidenceTypes, _callback);
        return localVarCall;

    }

    /**
     * genesEntrezGeneIdEvidencesGet
     * Get list of evidences for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @return List&lt;GeneEvidence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<GeneEvidence> genesEntrezGeneIdEvidencesGetUsingGET(Integer entrezGeneId, String evidenceTypes) throws ApiException {
        ApiResponse<List<GeneEvidence>> localVarResp = genesEntrezGeneIdEvidencesGetUsingGETWithHttpInfo(entrezGeneId, evidenceTypes);
        return localVarResp.getData();
    }

    /**
     * genesEntrezGeneIdEvidencesGet
     * Get list of evidences for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @return ApiResponse&lt;List&lt;GeneEvidence&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<GeneEvidence>> genesEntrezGeneIdEvidencesGetUsingGETWithHttpInfo(Integer entrezGeneId, String evidenceTypes) throws ApiException {
        okhttp3.Call localVarCall = genesEntrezGeneIdEvidencesGetUsingGETValidateBeforeCall(entrezGeneId, evidenceTypes, null);
        Type localVarReturnType = new TypeToken<List<GeneEvidence>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * genesEntrezGeneIdEvidencesGet (asynchronously)
     * Get list of evidences for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call genesEntrezGeneIdEvidencesGetUsingGETAsync(Integer entrezGeneId, String evidenceTypes, final ApiCallback<List<GeneEvidence>> _callback) throws ApiException {

        okhttp3.Call localVarCall = genesEntrezGeneIdEvidencesGetUsingGETValidateBeforeCall(entrezGeneId, evidenceTypes, _callback);
        Type localVarReturnType = new TypeToken<List<GeneEvidence>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for genesEntrezGeneIdGetUsingGET
     * @param entrezGeneId The entrez gene ID. (required)
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
    public okhttp3.Call genesEntrezGeneIdGetUsingGETCall(Integer entrezGeneId, String fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/genes/{entrezGeneId}"
            .replaceAll("\\{" + "entrezGeneId" + "\\}", localVarApiClient.escapeString(entrezGeneId.toString()));

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
    private okhttp3.Call genesEntrezGeneIdGetUsingGETValidateBeforeCall(Integer entrezGeneId, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling genesEntrezGeneIdGetUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = genesEntrezGeneIdGetUsingGETCall(entrezGeneId, fields, _callback);
        return localVarCall;

    }

    /**
     * genesEntrezGeneIdGet
     * Get specific gene information.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return Gene
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Gene genesEntrezGeneIdGetUsingGET(Integer entrezGeneId, String fields) throws ApiException {
        ApiResponse<Gene> localVarResp = genesEntrezGeneIdGetUsingGETWithHttpInfo(entrezGeneId, fields);
        return localVarResp.getData();
    }

    /**
     * genesEntrezGeneIdGet
     * Get specific gene information.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;Gene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Gene> genesEntrezGeneIdGetUsingGETWithHttpInfo(Integer entrezGeneId, String fields) throws ApiException {
        okhttp3.Call localVarCall = genesEntrezGeneIdGetUsingGETValidateBeforeCall(entrezGeneId, fields, null);
        Type localVarReturnType = new TypeToken<Gene>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * genesEntrezGeneIdGet (asynchronously)
     * Get specific gene information.
     * @param entrezGeneId The entrez gene ID. (required)
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
    public okhttp3.Call genesEntrezGeneIdGetUsingGETAsync(Integer entrezGeneId, String fields, final ApiCallback<Gene> _callback) throws ApiException {

        okhttp3.Call localVarCall = genesEntrezGeneIdGetUsingGETValidateBeforeCall(entrezGeneId, fields, _callback);
        Type localVarReturnType = new TypeToken<Gene>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for genesEntrezGeneIdVariantsGetUsingGET
     * @param entrezGeneId The entrez gene ID. (required)
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
    public okhttp3.Call genesEntrezGeneIdVariantsGetUsingGETCall(Integer entrezGeneId, String fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/genes/{entrezGeneId}/variants"
            .replaceAll("\\{" + "entrezGeneId" + "\\}", localVarApiClient.escapeString(entrezGeneId.toString()));

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
    private okhttp3.Call genesEntrezGeneIdVariantsGetUsingGETValidateBeforeCall(Integer entrezGeneId, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling genesEntrezGeneIdVariantsGetUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = genesEntrezGeneIdVariantsGetUsingGETCall(entrezGeneId, fields, _callback);
        return localVarCall;

    }

    /**
     * genesEntrezGeneIdVariantsGet
     * Get list of variants for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return List&lt;Alteration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Alteration> genesEntrezGeneIdVariantsGetUsingGET(Integer entrezGeneId, String fields) throws ApiException {
        ApiResponse<List<Alteration>> localVarResp = genesEntrezGeneIdVariantsGetUsingGETWithHttpInfo(entrezGeneId, fields);
        return localVarResp.getData();
    }

    /**
     * genesEntrezGeneIdVariantsGet
     * Get list of variants for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;Alteration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Alteration>> genesEntrezGeneIdVariantsGetUsingGETWithHttpInfo(Integer entrezGeneId, String fields) throws ApiException {
        okhttp3.Call localVarCall = genesEntrezGeneIdVariantsGetUsingGETValidateBeforeCall(entrezGeneId, fields, null);
        Type localVarReturnType = new TypeToken<List<Alteration>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * genesEntrezGeneIdVariantsGet (asynchronously)
     * Get list of variants for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
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
    public okhttp3.Call genesEntrezGeneIdVariantsGetUsingGETAsync(Integer entrezGeneId, String fields, final ApiCallback<List<Alteration>> _callback) throws ApiException {

        okhttp3.Call localVarCall = genesEntrezGeneIdVariantsGetUsingGETValidateBeforeCall(entrezGeneId, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Alteration>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for genesGetUsingGET
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
    public okhttp3.Call genesGetUsingGETCall(String fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/genes";

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
    private okhttp3.Call genesGetUsingGETValidateBeforeCall(String fields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = genesGetUsingGETCall(fields, _callback);
        return localVarCall;

    }

    /**
     * genesGet
     * Get list of currently curated genes.
     * @param fields The fields to be returned. (optional)
     * @return List&lt;Gene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Gene> genesGetUsingGET(String fields) throws ApiException {
        ApiResponse<List<Gene>> localVarResp = genesGetUsingGETWithHttpInfo(fields);
        return localVarResp.getData();
    }

    /**
     * genesGet
     * Get list of currently curated genes.
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;Gene&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Gene>> genesGetUsingGETWithHttpInfo(String fields) throws ApiException {
        okhttp3.Call localVarCall = genesGetUsingGETValidateBeforeCall(fields, null);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * genesGet (asynchronously)
     * Get list of currently curated genes.
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
    public okhttp3.Call genesGetUsingGETAsync(String fields, final ApiCallback<List<Gene>> _callback) throws ApiException {

        okhttp3.Call localVarCall = genesGetUsingGETValidateBeforeCall(fields, _callback);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for genesLookupGetUsingGET
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (Deprecated, use query instead) (optional)
     * @param entrezGeneId The entrez gene ID. (Deprecated, use query instead) (optional)
     * @param query The search query, it could be hugoSymbol or entrezGeneId. (optional)
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
    public okhttp3.Call genesLookupGetUsingGETCall(String hugoSymbol, Integer entrezGeneId, String query, String fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/genes/lookup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (hugoSymbol != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hugoSymbol", hugoSymbol));
        }

        if (entrezGeneId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("entrezGeneId", entrezGeneId));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
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
    private okhttp3.Call genesLookupGetUsingGETValidateBeforeCall(String hugoSymbol, Integer entrezGeneId, String query, String fields, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = genesLookupGetUsingGETCall(hugoSymbol, entrezGeneId, query, fields, _callback);
        return localVarCall;

    }

    /**
     * genesLookupGet
     * Search gene.
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (Deprecated, use query instead) (optional)
     * @param entrezGeneId The entrez gene ID. (Deprecated, use query instead) (optional)
     * @param query The search query, it could be hugoSymbol or entrezGeneId. (optional)
     * @param fields The fields to be returned. (optional)
     * @return List&lt;Gene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Gene> genesLookupGetUsingGET(String hugoSymbol, Integer entrezGeneId, String query, String fields) throws ApiException {
        ApiResponse<List<Gene>> localVarResp = genesLookupGetUsingGETWithHttpInfo(hugoSymbol, entrezGeneId, query, fields);
        return localVarResp.getData();
    }

    /**
     * genesLookupGet
     * Search gene.
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (Deprecated, use query instead) (optional)
     * @param entrezGeneId The entrez gene ID. (Deprecated, use query instead) (optional)
     * @param query The search query, it could be hugoSymbol or entrezGeneId. (optional)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;Gene&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Gene>> genesLookupGetUsingGETWithHttpInfo(String hugoSymbol, Integer entrezGeneId, String query, String fields) throws ApiException {
        okhttp3.Call localVarCall = genesLookupGetUsingGETValidateBeforeCall(hugoSymbol, entrezGeneId, query, fields, null);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * genesLookupGet (asynchronously)
     * Search gene.
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (Deprecated, use query instead) (optional)
     * @param entrezGeneId The entrez gene ID. (Deprecated, use query instead) (optional)
     * @param query The search query, it could be hugoSymbol or entrezGeneId. (optional)
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
    public okhttp3.Call genesLookupGetUsingGETAsync(String hugoSymbol, Integer entrezGeneId, String query, String fields, final ApiCallback<List<Gene>> _callback) throws ApiException {

        okhttp3.Call localVarCall = genesLookupGetUsingGETValidateBeforeCall(hugoSymbol, entrezGeneId, query, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
