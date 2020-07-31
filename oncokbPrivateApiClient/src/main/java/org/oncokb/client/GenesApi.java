/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * OpenAPI spec version: v1.1.0
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


import org.oncokb.client.Alteration;
import org.oncokb.client.Gene;
import org.oncokb.client.GeneEvidence;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenesApi {
    private ApiClient apiClient;

    public GenesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GenesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for genesEntrezGeneIdEvidencesGetUsingGET
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call genesEntrezGeneIdEvidencesGetUsingGETCall(Integer entrezGeneId, String evidenceTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/genes/{entrezGeneId}/evidences"
            .replaceAll("\\{" + "entrezGeneId" + "\\}", apiClient.escapeString(entrezGeneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (evidenceTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("evidenceTypes", evidenceTypes));

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
    private com.squareup.okhttp.Call genesEntrezGeneIdEvidencesGetUsingGETValidateBeforeCall(Integer entrezGeneId, String evidenceTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling genesEntrezGeneIdEvidencesGetUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = genesEntrezGeneIdEvidencesGetUsingGETCall(entrezGeneId, evidenceTypes, progressListener, progressRequestListener);
        return call;

    }

    /**
     * genesEntrezGeneIdEvidencesGet
     * Get list of evidences for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @return List&lt;GeneEvidence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GeneEvidence> genesEntrezGeneIdEvidencesGetUsingGET(Integer entrezGeneId, String evidenceTypes) throws ApiException {
        ApiResponse<List<GeneEvidence>> resp = genesEntrezGeneIdEvidencesGetUsingGETWithHttpInfo(entrezGeneId, evidenceTypes);
        return resp.getData();
    }

    /**
     * genesEntrezGeneIdEvidencesGet
     * Get list of evidences for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @return ApiResponse&lt;List&lt;GeneEvidence&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GeneEvidence>> genesEntrezGeneIdEvidencesGetUsingGETWithHttpInfo(Integer entrezGeneId, String evidenceTypes) throws ApiException {
        com.squareup.okhttp.Call call = genesEntrezGeneIdEvidencesGetUsingGETValidateBeforeCall(entrezGeneId, evidenceTypes, null, null);
        Type localVarReturnType = new TypeToken<List<GeneEvidence>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * genesEntrezGeneIdEvidencesGet (asynchronously)
     * Get list of evidences for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param evidenceTypes Separate by comma. Evidence type includes GENE_SUMMARY, GENE_BACKGROUND (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call genesEntrezGeneIdEvidencesGetUsingGETAsync(Integer entrezGeneId, String evidenceTypes, final ApiCallback<List<GeneEvidence>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = genesEntrezGeneIdEvidencesGetUsingGETValidateBeforeCall(entrezGeneId, evidenceTypes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GeneEvidence>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for genesEntrezGeneIdGetUsingGET
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call genesEntrezGeneIdGetUsingGETCall(Integer entrezGeneId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/genes/{entrezGeneId}"
            .replaceAll("\\{" + "entrezGeneId" + "\\}", apiClient.escapeString(entrezGeneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

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
    private com.squareup.okhttp.Call genesEntrezGeneIdGetUsingGETValidateBeforeCall(Integer entrezGeneId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling genesEntrezGeneIdGetUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = genesEntrezGeneIdGetUsingGETCall(entrezGeneId, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * genesEntrezGeneIdGet
     * Get specific gene information.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return Gene
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Gene genesEntrezGeneIdGetUsingGET(Integer entrezGeneId, String fields) throws ApiException {
        ApiResponse<Gene> resp = genesEntrezGeneIdGetUsingGETWithHttpInfo(entrezGeneId, fields);
        return resp.getData();
    }

    /**
     * genesEntrezGeneIdGet
     * Get specific gene information.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;Gene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Gene> genesEntrezGeneIdGetUsingGETWithHttpInfo(Integer entrezGeneId, String fields) throws ApiException {
        com.squareup.okhttp.Call call = genesEntrezGeneIdGetUsingGETValidateBeforeCall(entrezGeneId, fields, null, null);
        Type localVarReturnType = new TypeToken<Gene>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * genesEntrezGeneIdGet (asynchronously)
     * Get specific gene information.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call genesEntrezGeneIdGetUsingGETAsync(Integer entrezGeneId, String fields, final ApiCallback<Gene> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = genesEntrezGeneIdGetUsingGETValidateBeforeCall(entrezGeneId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Gene>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for genesEntrezGeneIdVariantsGetUsingGET
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call genesEntrezGeneIdVariantsGetUsingGETCall(Integer entrezGeneId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/genes/{entrezGeneId}/variants"
            .replaceAll("\\{" + "entrezGeneId" + "\\}", apiClient.escapeString(entrezGeneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

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
    private com.squareup.okhttp.Call genesEntrezGeneIdVariantsGetUsingGETValidateBeforeCall(Integer entrezGeneId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling genesEntrezGeneIdVariantsGetUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = genesEntrezGeneIdVariantsGetUsingGETCall(entrezGeneId, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * genesEntrezGeneIdVariantsGet
     * Get list of variants for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return List&lt;Alteration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Alteration> genesEntrezGeneIdVariantsGetUsingGET(Integer entrezGeneId, String fields) throws ApiException {
        ApiResponse<List<Alteration>> resp = genesEntrezGeneIdVariantsGetUsingGETWithHttpInfo(entrezGeneId, fields);
        return resp.getData();
    }

    /**
     * genesEntrezGeneIdVariantsGet
     * Get list of variants for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;Alteration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Alteration>> genesEntrezGeneIdVariantsGetUsingGETWithHttpInfo(Integer entrezGeneId, String fields) throws ApiException {
        com.squareup.okhttp.Call call = genesEntrezGeneIdVariantsGetUsingGETValidateBeforeCall(entrezGeneId, fields, null, null);
        Type localVarReturnType = new TypeToken<List<Alteration>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * genesEntrezGeneIdVariantsGet (asynchronously)
     * Get list of variants for specific gene.
     * @param entrezGeneId The entrez gene ID. (required)
     * @param fields The fields to be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call genesEntrezGeneIdVariantsGetUsingGETAsync(Integer entrezGeneId, String fields, final ApiCallback<List<Alteration>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = genesEntrezGeneIdVariantsGetUsingGETValidateBeforeCall(entrezGeneId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Alteration>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for genesGetUsingGET
     * @param fields The fields to be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call genesGetUsingGETCall(String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/genes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

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
    private com.squareup.okhttp.Call genesGetUsingGETValidateBeforeCall(String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = genesGetUsingGETCall(fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * genesGet
     * Get list of currently curated genes.
     * @param fields The fields to be returned. (optional)
     * @return List&lt;Gene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Gene> genesGetUsingGET(String fields) throws ApiException {
        ApiResponse<List<Gene>> resp = genesGetUsingGETWithHttpInfo(fields);
        return resp.getData();
    }

    /**
     * genesGet
     * Get list of currently curated genes.
     * @param fields The fields to be returned. (optional)
     * @return ApiResponse&lt;List&lt;Gene&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Gene>> genesGetUsingGETWithHttpInfo(String fields) throws ApiException {
        com.squareup.okhttp.Call call = genesGetUsingGETValidateBeforeCall(fields, null, null);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * genesGet (asynchronously)
     * Get list of currently curated genes.
     * @param fields The fields to be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call genesGetUsingGETAsync(String fields, final ApiCallback<List<Gene>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = genesGetUsingGETValidateBeforeCall(fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for genesLookupGetUsingGET
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (Deprecated, use query instead) (optional)
     * @param entrezGeneId The entrez gene ID. (Deprecated, use query instead) (optional)
     * @param query The search query, it could be hugoSymbol or entrezGeneId. (optional)
     * @param fields The fields to be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call genesLookupGetUsingGETCall(String hugoSymbol, Integer entrezGeneId, String query, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/genes/lookup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (hugoSymbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hugoSymbol", hugoSymbol));
        if (entrezGeneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entrezGeneId", entrezGeneId));
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

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
    private com.squareup.okhttp.Call genesLookupGetUsingGETValidateBeforeCall(String hugoSymbol, Integer entrezGeneId, String query, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = genesLookupGetUsingGETCall(hugoSymbol, entrezGeneId, query, fields, progressListener, progressRequestListener);
        return call;

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
     */
    public List<Gene> genesLookupGetUsingGET(String hugoSymbol, Integer entrezGeneId, String query, String fields) throws ApiException {
        ApiResponse<List<Gene>> resp = genesLookupGetUsingGETWithHttpInfo(hugoSymbol, entrezGeneId, query, fields);
        return resp.getData();
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
     */
    public ApiResponse<List<Gene>> genesLookupGetUsingGETWithHttpInfo(String hugoSymbol, Integer entrezGeneId, String query, String fields) throws ApiException {
        com.squareup.okhttp.Call call = genesLookupGetUsingGETValidateBeforeCall(hugoSymbol, entrezGeneId, query, fields, null, null);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * genesLookupGet (asynchronously)
     * Search gene.
     * @param hugoSymbol The gene symbol used in Human Genome Organisation. (Deprecated, use query instead) (optional)
     * @param entrezGeneId The entrez gene ID. (Deprecated, use query instead) (optional)
     * @param query The search query, it could be hugoSymbol or entrezGeneId. (optional)
     * @param fields The fields to be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call genesLookupGetUsingGETAsync(String hugoSymbol, Integer entrezGeneId, String query, String fields, final ApiCallback<List<Gene>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = genesLookupGetUsingGETValidateBeforeCall(hugoSymbol, entrezGeneId, query, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Gene>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
