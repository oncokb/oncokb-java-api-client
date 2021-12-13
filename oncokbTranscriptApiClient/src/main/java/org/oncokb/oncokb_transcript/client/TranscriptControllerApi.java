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


import org.oncokb.oncokb_transcript.client.AllReferenceTranscriptSuggestionVM;
import org.oncokb.oncokb_transcript.client.MatchTranscriptVM;
import org.oncokb.oncokb_transcript.client.TranscriptComparisonResultVM;
import org.oncokb.oncokb_transcript.client.TranscriptComparisonVM;
import org.oncokb.oncokb_transcript.client.TranscriptDTO;
import org.oncokb.oncokb_transcript.client.TranscriptMatchResultVM;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranscriptControllerApi {
    private ApiClient apiClient;

    public TranscriptControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TranscriptControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addTranscriptUsingPOST
     * @param entrezGeneId entrezGeneId (required)
     * @param referenceGenome referenceGenome (required)
     * @param ensemblTranscriptId ensemblTranscriptId (required)
     * @param isCanonical isCanonical (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addTranscriptUsingPOSTCall(Integer entrezGeneId, String referenceGenome, String ensemblTranscriptId, Boolean isCanonical, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/add-transcript";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (entrezGeneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entrezGeneId", entrezGeneId));
        if (referenceGenome != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("referenceGenome", referenceGenome));
        if (ensemblTranscriptId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ensemblTranscriptId", ensemblTranscriptId));
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
    private com.squareup.okhttp.Call addTranscriptUsingPOSTValidateBeforeCall(Integer entrezGeneId, String referenceGenome, String ensemblTranscriptId, Boolean isCanonical, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'entrezGeneId' is set
        if (entrezGeneId == null) {
            throw new ApiException("Missing the required parameter 'entrezGeneId' when calling addTranscriptUsingPOST(Async)");
        }
        // verify the required parameter 'referenceGenome' is set
        if (referenceGenome == null) {
            throw new ApiException("Missing the required parameter 'referenceGenome' when calling addTranscriptUsingPOST(Async)");
        }
        // verify the required parameter 'ensemblTranscriptId' is set
        if (ensemblTranscriptId == null) {
            throw new ApiException("Missing the required parameter 'ensemblTranscriptId' when calling addTranscriptUsingPOST(Async)");
        }
        // verify the required parameter 'isCanonical' is set
        if (isCanonical == null) {
            throw new ApiException("Missing the required parameter 'isCanonical' when calling addTranscriptUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = addTranscriptUsingPOSTCall(entrezGeneId, referenceGenome, ensemblTranscriptId, isCanonical, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * addTranscript
     * 
     * @param entrezGeneId entrezGeneId (required)
     * @param referenceGenome referenceGenome (required)
     * @param ensemblTranscriptId ensemblTranscriptId (required)
     * @param isCanonical isCanonical (required)
     * @return TranscriptDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TranscriptDTO addTranscriptUsingPOST(Integer entrezGeneId, String referenceGenome, String ensemblTranscriptId, Boolean isCanonical) throws ApiException {
        ApiResponse<TranscriptDTO> resp = addTranscriptUsingPOSTWithHttpInfo(entrezGeneId, referenceGenome, ensemblTranscriptId, isCanonical);
        return resp.getData();
    }

    /**
     * addTranscript
     * 
     * @param entrezGeneId entrezGeneId (required)
     * @param referenceGenome referenceGenome (required)
     * @param ensemblTranscriptId ensemblTranscriptId (required)
     * @param isCanonical isCanonical (required)
     * @return ApiResponse&lt;TranscriptDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TranscriptDTO> addTranscriptUsingPOSTWithHttpInfo(Integer entrezGeneId, String referenceGenome, String ensemblTranscriptId, Boolean isCanonical) throws ApiException {
        com.squareup.okhttp.Call call = addTranscriptUsingPOSTValidateBeforeCall(entrezGeneId, referenceGenome, ensemblTranscriptId, isCanonical, null, null);
        Type localVarReturnType = new TypeToken<TranscriptDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * addTranscript (asynchronously)
     * 
     * @param entrezGeneId entrezGeneId (required)
     * @param referenceGenome referenceGenome (required)
     * @param ensemblTranscriptId ensemblTranscriptId (required)
     * @param isCanonical isCanonical (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTranscriptUsingPOSTAsync(Integer entrezGeneId, String referenceGenome, String ensemblTranscriptId, Boolean isCanonical, final ApiCallback<TranscriptDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTranscriptUsingPOSTValidateBeforeCall(entrezGeneId, referenceGenome, ensemblTranscriptId, isCanonical, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TranscriptDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for compareTranscriptUsingPOST
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call compareTranscriptUsingPOSTCall(String hugoSymbol, TranscriptComparisonVM body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/compare-transcript/{hugoSymbol}"
            .replaceAll("\\{" + "hugoSymbol" + "\\}", apiClient.escapeString(hugoSymbol.toString()));

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call compareTranscriptUsingPOSTValidateBeforeCall(String hugoSymbol, TranscriptComparisonVM body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'hugoSymbol' is set
        if (hugoSymbol == null) {
            throw new ApiException("Missing the required parameter 'hugoSymbol' when calling compareTranscriptUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = compareTranscriptUsingPOSTCall(hugoSymbol, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * compareTranscript
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @return TranscriptComparisonResultVM
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TranscriptComparisonResultVM compareTranscriptUsingPOST(String hugoSymbol, TranscriptComparisonVM body) throws ApiException {
        ApiResponse<TranscriptComparisonResultVM> resp = compareTranscriptUsingPOSTWithHttpInfo(hugoSymbol, body);
        return resp.getData();
    }

    /**
     * compareTranscript
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @return ApiResponse&lt;TranscriptComparisonResultVM&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TranscriptComparisonResultVM> compareTranscriptUsingPOSTWithHttpInfo(String hugoSymbol, TranscriptComparisonVM body) throws ApiException {
        com.squareup.okhttp.Call call = compareTranscriptUsingPOSTValidateBeforeCall(hugoSymbol, body, null, null);
        Type localVarReturnType = new TypeToken<TranscriptComparisonResultVM>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * compareTranscript (asynchronously)
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call compareTranscriptUsingPOSTAsync(String hugoSymbol, TranscriptComparisonVM body, final ApiCallback<TranscriptComparisonResultVM> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = compareTranscriptUsingPOSTValidateBeforeCall(hugoSymbol, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TranscriptComparisonResultVM>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findTranscriptsByEnsemblIdsUsingPOST
     * @param referenceGenome referenceGenome (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findTranscriptsByEnsemblIdsUsingPOSTCall(String referenceGenome, List<String> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/find-transcripts-by-ensembl-ids";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (referenceGenome != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("referenceGenome", referenceGenome));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findTranscriptsByEnsemblIdsUsingPOSTValidateBeforeCall(String referenceGenome, List<String> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'referenceGenome' is set
        if (referenceGenome == null) {
            throw new ApiException("Missing the required parameter 'referenceGenome' when calling findTranscriptsByEnsemblIdsUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = findTranscriptsByEnsemblIdsUsingPOSTCall(referenceGenome, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * findTranscriptsByEnsemblIds
     * 
     * @param referenceGenome referenceGenome (required)
     * @param body  (optional)
     * @return List&lt;TranscriptDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TranscriptDTO> findTranscriptsByEnsemblIdsUsingPOST(String referenceGenome, List<String> body) throws ApiException {
        ApiResponse<List<TranscriptDTO>> resp = findTranscriptsByEnsemblIdsUsingPOSTWithHttpInfo(referenceGenome, body);
        return resp.getData();
    }

    /**
     * findTranscriptsByEnsemblIds
     * 
     * @param referenceGenome referenceGenome (required)
     * @param body  (optional)
     * @return ApiResponse&lt;List&lt;TranscriptDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TranscriptDTO>> findTranscriptsByEnsemblIdsUsingPOSTWithHttpInfo(String referenceGenome, List<String> body) throws ApiException {
        com.squareup.okhttp.Call call = findTranscriptsByEnsemblIdsUsingPOSTValidateBeforeCall(referenceGenome, body, null, null);
        Type localVarReturnType = new TypeToken<List<TranscriptDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * findTranscriptsByEnsemblIds (asynchronously)
     * 
     * @param referenceGenome referenceGenome (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findTranscriptsByEnsemblIdsUsingPOSTAsync(String referenceGenome, List<String> body, final ApiCallback<List<TranscriptDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findTranscriptsByEnsemblIdsUsingPOSTValidateBeforeCall(referenceGenome, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TranscriptDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for matchTranscriptUsingPOST
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call matchTranscriptUsingPOSTCall(String hugoSymbol, MatchTranscriptVM body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/match-transcript/{hugoSymbol}"
            .replaceAll("\\{" + "hugoSymbol" + "\\}", apiClient.escapeString(hugoSymbol.toString()));

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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call matchTranscriptUsingPOSTValidateBeforeCall(String hugoSymbol, MatchTranscriptVM body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'hugoSymbol' is set
        if (hugoSymbol == null) {
            throw new ApiException("Missing the required parameter 'hugoSymbol' when calling matchTranscriptUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = matchTranscriptUsingPOSTCall(hugoSymbol, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * matchTranscript
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @return TranscriptMatchResultVM
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TranscriptMatchResultVM matchTranscriptUsingPOST(String hugoSymbol, MatchTranscriptVM body) throws ApiException {
        ApiResponse<TranscriptMatchResultVM> resp = matchTranscriptUsingPOSTWithHttpInfo(hugoSymbol, body);
        return resp.getData();
    }

    /**
     * matchTranscript
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @return ApiResponse&lt;TranscriptMatchResultVM&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TranscriptMatchResultVM> matchTranscriptUsingPOSTWithHttpInfo(String hugoSymbol, MatchTranscriptVM body) throws ApiException {
        com.squareup.okhttp.Call call = matchTranscriptUsingPOSTValidateBeforeCall(hugoSymbol, body, null, null);
        Type localVarReturnType = new TypeToken<TranscriptMatchResultVM>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * matchTranscript (asynchronously)
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call matchTranscriptUsingPOSTAsync(String hugoSymbol, MatchTranscriptVM body, final ApiCallback<TranscriptMatchResultVM> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = matchTranscriptUsingPOSTValidateBeforeCall(hugoSymbol, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TranscriptMatchResultVM>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for suggestVariantUsingGET
     * @param hugoSymbol hugoSymbol (required)
     * @param proteinPosition proteinPosition (required)
     * @param curatedResidue curatedResidue (required)
     * @param grch37Transcript grch37Transcript (required)
     * @param grch38Transcript grch38Transcript (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call suggestVariantUsingGETCall(String hugoSymbol, Integer proteinPosition, String curatedResidue, String grch37Transcript, String grch38Transcript, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/suggest-variant/{hugoSymbol}"
            .replaceAll("\\{" + "hugoSymbol" + "\\}", apiClient.escapeString(hugoSymbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (proteinPosition != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("proteinPosition", proteinPosition));
        if (curatedResidue != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("curatedResidue", curatedResidue));
        if (grch37Transcript != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("grch37Transcript", grch37Transcript));
        if (grch38Transcript != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("grch38Transcript", grch38Transcript));

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
    private com.squareup.okhttp.Call suggestVariantUsingGETValidateBeforeCall(String hugoSymbol, Integer proteinPosition, String curatedResidue, String grch37Transcript, String grch38Transcript, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'hugoSymbol' is set
        if (hugoSymbol == null) {
            throw new ApiException("Missing the required parameter 'hugoSymbol' when calling suggestVariantUsingGET(Async)");
        }
        // verify the required parameter 'proteinPosition' is set
        if (proteinPosition == null) {
            throw new ApiException("Missing the required parameter 'proteinPosition' when calling suggestVariantUsingGET(Async)");
        }
        // verify the required parameter 'curatedResidue' is set
        if (curatedResidue == null) {
            throw new ApiException("Missing the required parameter 'curatedResidue' when calling suggestVariantUsingGET(Async)");
        }
        // verify the required parameter 'grch37Transcript' is set
        if (grch37Transcript == null) {
            throw new ApiException("Missing the required parameter 'grch37Transcript' when calling suggestVariantUsingGET(Async)");
        }
        // verify the required parameter 'grch38Transcript' is set
        if (grch38Transcript == null) {
            throw new ApiException("Missing the required parameter 'grch38Transcript' when calling suggestVariantUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = suggestVariantUsingGETCall(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * suggestVariant
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param proteinPosition proteinPosition (required)
     * @param curatedResidue curatedResidue (required)
     * @param grch37Transcript grch37Transcript (required)
     * @param grch38Transcript grch38Transcript (required)
     * @return AllReferenceTranscriptSuggestionVM
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AllReferenceTranscriptSuggestionVM suggestVariantUsingGET(String hugoSymbol, Integer proteinPosition, String curatedResidue, String grch37Transcript, String grch38Transcript) throws ApiException {
        ApiResponse<AllReferenceTranscriptSuggestionVM> resp = suggestVariantUsingGETWithHttpInfo(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript);
        return resp.getData();
    }

    /**
     * suggestVariant
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param proteinPosition proteinPosition (required)
     * @param curatedResidue curatedResidue (required)
     * @param grch37Transcript grch37Transcript (required)
     * @param grch38Transcript grch38Transcript (required)
     * @return ApiResponse&lt;AllReferenceTranscriptSuggestionVM&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AllReferenceTranscriptSuggestionVM> suggestVariantUsingGETWithHttpInfo(String hugoSymbol, Integer proteinPosition, String curatedResidue, String grch37Transcript, String grch38Transcript) throws ApiException {
        com.squareup.okhttp.Call call = suggestVariantUsingGETValidateBeforeCall(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript, null, null);
        Type localVarReturnType = new TypeToken<AllReferenceTranscriptSuggestionVM>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * suggestVariant (asynchronously)
     * 
     * @param hugoSymbol hugoSymbol (required)
     * @param proteinPosition proteinPosition (required)
     * @param curatedResidue curatedResidue (required)
     * @param grch37Transcript grch37Transcript (required)
     * @param grch38Transcript grch38Transcript (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call suggestVariantUsingGETAsync(String hugoSymbol, Integer proteinPosition, String curatedResidue, String grch37Transcript, String grch38Transcript, final ApiCallback<AllReferenceTranscriptSuggestionVM> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = suggestVariantUsingGETValidateBeforeCall(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AllReferenceTranscriptSuggestionVM>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
