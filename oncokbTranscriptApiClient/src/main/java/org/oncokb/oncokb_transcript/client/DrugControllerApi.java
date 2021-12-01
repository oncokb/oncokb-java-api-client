/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.oncokb.oncokb_transcript.client;

import org.oncokb.oncokb_transcript.ApiCallback;
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.ApiResponse;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.Pair;
import org.oncokb.oncokb_transcript.ProgressRequestBody;
import org.oncokb.oncokb_transcript.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.oncokb.oncokb_transcript.client.Drug;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrugControllerApi {
    private ApiClient apiClient;

    public DrugControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DrugControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for findDrugByCodeUsingGET
     * @param code code (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findDrugByCodeUsingGETCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/drugs/search-by-code/{code}"
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findDrugByCodeUsingGETValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling findDrugByCodeUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = findDrugByCodeUsingGETCall(code, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * findDrugByCode
     * 
     * @param code code (required)
     * @return Drug
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Drug findDrugByCodeUsingGET(String code) throws ApiException {
        ApiResponse<Drug> resp = findDrugByCodeUsingGETWithHttpInfo(code);
        return resp.getData();
    }

    /**
     * findDrugByCode
     * 
     * @param code code (required)
     * @return ApiResponse&lt;Drug&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Drug> findDrugByCodeUsingGETWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = findDrugByCodeUsingGETValidateBeforeCall(code, null, null);
        Type localVarReturnType = new TypeToken<Drug>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * findDrugByCode (asynchronously)
     * 
     * @param code code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findDrugByCodeUsingGETAsync(String code, final ApiCallback<Drug> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findDrugByCodeUsingGETValidateBeforeCall(code, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Drug>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findDrugsUsingGET
     * @param query query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findDrugsUsingGETCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/drugs/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findDrugsUsingGETValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling findDrugsUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = findDrugsUsingGETCall(query, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * findDrugs
     * 
     * @param query query (required)
     * @return List&lt;Drug&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Drug> findDrugsUsingGET(String query) throws ApiException {
        ApiResponse<List<Drug>> resp = findDrugsUsingGETWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * findDrugs
     * 
     * @param query query (required)
     * @return ApiResponse&lt;List&lt;Drug&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Drug>> findDrugsUsingGETWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = findDrugsUsingGETValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * findDrugs (asynchronously)
     * 
     * @param query query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findDrugsUsingGETAsync(String query, final ApiCallback<List<Drug>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findDrugsUsingGETValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Drug>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}