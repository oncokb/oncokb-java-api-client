/*
 * OncoKB APIs for Premium Users
 * These endpoints are designed for premium users. Please contact OncoKB team(contact@oncokb.org) if you want to be upgraded.
 *
 * OpenAPI spec version: v1.0.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
    private ApiClient apiClient;

    public DrugsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DrugsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for drugsGetUsingGET
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call drugsGetUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/drugs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call drugsGetUsingGETValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = drugsGetUsingGETCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all curated drugs.
     * 
     * @return List&lt;Drug&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Drug> drugsGetUsingGET() throws ApiException {
        ApiResponse<List<Drug>> resp = drugsGetUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get all curated drugs.
     * 
     * @return ApiResponse&lt;List&lt;Drug&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Drug>> drugsGetUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = drugsGetUsingGETValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all curated drugs. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call drugsGetUsingGETAsync(final ApiCallback<List<Drug>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = drugsGetUsingGETValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for drugsLookupGetUsingGET
     * @param exactMatch Exactly Match (required)
     * @param name Drug Name (optional)
     * @param ncitCode NCI Thesaurus Code (optional)
     * @param synonym Drug Synonyms (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call drugsLookupGetUsingGETCall(Boolean exactMatch, String name, String ncitCode, String synonym, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/drugs/lookup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (ncitCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ncitCode", ncitCode));
        if (synonym != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("synonym", synonym));
        if (exactMatch != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exactMatch", exactMatch));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call drugsLookupGetUsingGETValidateBeforeCall(Boolean exactMatch, String name, String ncitCode, String synonym, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'exactMatch' is set
        if (exactMatch == null) {
            throw new ApiException("Missing the required parameter 'exactMatch' when calling drugsLookupGetUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = drugsLookupGetUsingGETCall(exactMatch, name, ncitCode, synonym, progressListener, progressRequestListener);
        return call;

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
     */
    public List<Drug> drugsLookupGetUsingGET(Boolean exactMatch, String name, String ncitCode, String synonym) throws ApiException {
        ApiResponse<List<Drug>> resp = drugsLookupGetUsingGETWithHttpInfo(exactMatch, name, ncitCode, synonym);
        return resp.getData();
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
     */
    public ApiResponse<List<Drug>> drugsLookupGetUsingGETWithHttpInfo(Boolean exactMatch, String name, String ncitCode, String synonym) throws ApiException {
        com.squareup.okhttp.Call call = drugsLookupGetUsingGETValidateBeforeCall(exactMatch, name, ncitCode, synonym, null, null);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search drugs. (asynchronously)
     * 
     * @param exactMatch Exactly Match (required)
     * @param name Drug Name (optional)
     * @param ncitCode NCI Thesaurus Code (optional)
     * @param synonym Drug Synonyms (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call drugsLookupGetUsingGETAsync(Boolean exactMatch, String name, String ncitCode, String synonym, final ApiCallback<List<Drug>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = drugsLookupGetUsingGETValidateBeforeCall(exactMatch, name, ncitCode, synonym, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}