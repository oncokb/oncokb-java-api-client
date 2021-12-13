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


import org.oncokb.oncokb_transcript.client.EnsemblGene;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnsemblGeneControllerApi {
    private ApiClient apiClient;

    public EnsemblGeneControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnsemblGeneControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addEnsemblGeneUsingPOST
     * @param referenceGenome referenceGenome (required)
     * @param entrezGeneId entrezGeneId (required)
     * @param ensemblGeneId ensemblGeneId (required)
     * @param isCanonical isCanonical (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addEnsemblGeneUsingPOSTCall(String referenceGenome, Integer entrezGeneId, String ensemblGeneId, Boolean isCanonical, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/add-ensembl-gene";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (referenceGenome != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("referenceGenome", referenceGenome));
        if (entrezGeneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entrezGeneId", entrezGeneId));
        if (ensemblGeneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ensemblGeneId", ensemblGeneId));
        if (isCanonical != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isCanonical", isCanonical));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addEnsemblGeneUsingPOSTValidateBeforeCall(String referenceGenome, Integer entrezGeneId, String ensemblGeneId, Boolean isCanonical, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'referenceGenome' is set
        if (referenceGenome == null) {
            throw new ApiException("Missing the required parameter 'referenceGenome' when calling addEnsemblGeneUsingPOST(Async)");
        }
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling addEnsemblGeneUsingPOST(Async)");
        }
        // verify the required parameter 'ensemblGeneId' is set
        if (ensemblGeneId == null) {
            throw new ApiException("Missing the required parameter 'ensemblGeneId' when calling addEnsemblGeneUsingPOST(Async)");
        }
        // verify the required parameter 'isCanonical' is set
        if (isCanonical == null) {
            throw new ApiException("Missing the required parameter 'isCanonical' when calling addEnsemblGeneUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = addEnsemblGeneUsingPOSTCall(referenceGenome, entrezGeneId, ensemblGeneId, isCanonical, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * addEnsemblGene
     * 
     * @param referenceGenome referenceGenome (required)
     * @param entrezGeneId entrezGeneId (required)
     * @param ensemblGeneId ensemblGeneId (required)
     * @param isCanonical isCanonical (required)
     * @return EnsemblGene
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnsemblGene addEnsemblGeneUsingPOST(String referenceGenome, Integer entrezGeneId, String ensemblGeneId, Boolean isCanonical) throws ApiException {
        ApiResponse<EnsemblGene> resp = addEnsemblGeneUsingPOSTWithHttpInfo(referenceGenome, entrezGeneId, ensemblGeneId, isCanonical);
        return resp.getData();
    }

    /**
     * addEnsemblGene
     * 
     * @param referenceGenome referenceGenome (required)
     * @param entrezGeneId entrezGeneId (required)
     * @param ensemblGeneId ensemblGeneId (required)
     * @param isCanonical isCanonical (required)
     * @return ApiResponse&lt;EnsemblGene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnsemblGene> addEnsemblGeneUsingPOSTWithHttpInfo(String referenceGenome, Integer entrezGeneId, String ensemblGeneId, Boolean isCanonical) throws ApiException {
        com.squareup.okhttp.Call call = addEnsemblGeneUsingPOSTValidateBeforeCall(referenceGenome, entrezGeneId, ensemblGeneId, isCanonical, null, null);
        Type localVarReturnType = new TypeToken<EnsemblGene>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * addEnsemblGene (asynchronously)
     * 
     * @param referenceGenome referenceGenome (required)
     * @param entrezGeneId entrezGeneId (required)
     * @param ensemblGeneId ensemblGeneId (required)
     * @param isCanonical isCanonical (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addEnsemblGeneUsingPOSTAsync(String referenceGenome, Integer entrezGeneId, String ensemblGeneId, Boolean isCanonical, final ApiCallback<EnsemblGene> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addEnsemblGeneUsingPOSTValidateBeforeCall(referenceGenome, entrezGeneId, ensemblGeneId, isCanonical, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnsemblGene>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
