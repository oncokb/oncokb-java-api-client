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


import org.oncokb.client.Drug;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrugsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DrugsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DrugsApi(ApiClient apiClient) {
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
     * Build call for drugsGetUsingGET
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call drugsGetUsingGETCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/drugs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call drugsGetUsingGETValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = drugsGetUsingGETCall(_callback);
        return localVarCall;

    }

    /**
     * Get all curated drugs.
     * 
     * @return List&lt;Drug&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Drug> drugsGetUsingGET() throws ApiException {
        ApiResponse<List<Drug>> localVarResp = drugsGetUsingGETWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get all curated drugs.
     * 
     * @return ApiResponse&lt;List&lt;Drug&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Drug>> drugsGetUsingGETWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = drugsGetUsingGETValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all curated drugs. (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call drugsGetUsingGETAsync(final ApiCallback<List<Drug>> _callback) throws ApiException {

        okhttp3.Call localVarCall = drugsGetUsingGETValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for drugsLookupGetUsingGET
     * @param exactMatch Exactly Match (required)
     * @param name Drug Name (optional)
     * @param ncitCode NCI Thesaurus Code (optional)
     * @param synonym Drug Synonyms (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call drugsLookupGetUsingGETCall(Boolean exactMatch, String name, String ncitCode, String synonym, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/drugs/lookup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (ncitCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ncitCode", ncitCode));
        }

        if (synonym != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("synonym", synonym));
        }

        if (exactMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("exactMatch", exactMatch));
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
    private okhttp3.Call drugsLookupGetUsingGETValidateBeforeCall(Boolean exactMatch, String name, String ncitCode, String synonym, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'exactMatch' is set
        if (exactMatch == null) {
            throw new ApiException("Missing the required parameter 'exactMatch' when calling drugsLookupGetUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = drugsLookupGetUsingGETCall(exactMatch, name, ncitCode, synonym, _callback);
        return localVarCall;

    }

    /**
     * Search drugs.
     * 
     * @param exactMatch Exactly Match (required)
     * @param name Drug Name (optional)
     * @param ncitCode NCI Thesaurus Code (optional)
     * @param synonym Drug Synonyms (optional)
     * @return List&lt;Drug&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Drug> drugsLookupGetUsingGET(Boolean exactMatch, String name, String ncitCode, String synonym) throws ApiException {
        ApiResponse<List<Drug>> localVarResp = drugsLookupGetUsingGETWithHttpInfo(exactMatch, name, ncitCode, synonym);
        return localVarResp.getData();
    }

    /**
     * Search drugs.
     * 
     * @param exactMatch Exactly Match (required)
     * @param name Drug Name (optional)
     * @param ncitCode NCI Thesaurus Code (optional)
     * @param synonym Drug Synonyms (optional)
     * @return ApiResponse&lt;List&lt;Drug&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Drug>> drugsLookupGetUsingGETWithHttpInfo(Boolean exactMatch, String name, String ncitCode, String synonym) throws ApiException {
        okhttp3.Call localVarCall = drugsLookupGetUsingGETValidateBeforeCall(exactMatch, name, ncitCode, synonym, null);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search drugs. (asynchronously)
     * 
     * @param exactMatch Exactly Match (required)
     * @param name Drug Name (optional)
     * @param ncitCode NCI Thesaurus Code (optional)
     * @param synonym Drug Synonyms (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call drugsLookupGetUsingGETAsync(Boolean exactMatch, String name, String ncitCode, String synonym, final ApiCallback<List<Drug>> _callback) throws ApiException {

        okhttp3.Call localVarCall = drugsLookupGetUsingGETValidateBeforeCall(exactMatch, name, ncitCode, synonym, _callback);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
