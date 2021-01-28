/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.2.1
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


import org.oncokb.client.CancerGene;
import org.oncokb.client.CuratedGene;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CancerGenesApi {
    private ApiClient apiClient;

    public CancerGenesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CancerGenesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for utilsAllCuratedGenesGetUsingGET1
     * @param version version (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call utilsAllCuratedGenesGetUsingGET1Call(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/utils/allCuratedGenes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));

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
    private com.squareup.okhttp.Call utilsAllCuratedGenesGetUsingGET1ValidateBeforeCall(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = utilsAllCuratedGenesGetUsingGET1Call(version, progressListener, progressRequestListener);
        return call;

    }

    /**
     * utilsAllCuratedGenesGet
     * Get list of genes OncoKB curated
     * @param version version (optional)
     * @return List&lt;CuratedGene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CuratedGene> utilsAllCuratedGenesGetUsingGET1(String version) throws ApiException {
        ApiResponse<List<CuratedGene>> resp = utilsAllCuratedGenesGetUsingGET1WithHttpInfo(version);
        return resp.getData();
    }

    /**
     * utilsAllCuratedGenesGet
     * Get list of genes OncoKB curated
     * @param version version (optional)
     * @return ApiResponse&lt;List&lt;CuratedGene&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CuratedGene>> utilsAllCuratedGenesGetUsingGET1WithHttpInfo(String version) throws ApiException {
        com.squareup.okhttp.Call call = utilsAllCuratedGenesGetUsingGET1ValidateBeforeCall(version, null, null);
        Type localVarReturnType = new TypeToken<List<CuratedGene>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * utilsAllCuratedGenesGet (asynchronously)
     * Get list of genes OncoKB curated
     * @param version version (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call utilsAllCuratedGenesGetUsingGET1Async(String version, final ApiCallback<List<CuratedGene>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = utilsAllCuratedGenesGetUsingGET1ValidateBeforeCall(version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CuratedGene>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for utilsAllCuratedGenesTxtGetUsingGET1
     * @param version version (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call utilsAllCuratedGenesTxtGetUsingGET1Call(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/utils/allCuratedGenes.txt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
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
    private com.squareup.okhttp.Call utilsAllCuratedGenesTxtGetUsingGET1ValidateBeforeCall(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = utilsAllCuratedGenesTxtGetUsingGET1Call(version, progressListener, progressRequestListener);
        return call;

    }

    /**
     * utilsAllCuratedGenesTxtGet
     * Get list of genes OncoKB curated in text file.
     * @param version version (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String utilsAllCuratedGenesTxtGetUsingGET1(String version) throws ApiException {
        ApiResponse<String> resp = utilsAllCuratedGenesTxtGetUsingGET1WithHttpInfo(version);
        return resp.getData();
    }

    /**
     * utilsAllCuratedGenesTxtGet
     * Get list of genes OncoKB curated in text file.
     * @param version version (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> utilsAllCuratedGenesTxtGetUsingGET1WithHttpInfo(String version) throws ApiException {
        com.squareup.okhttp.Call call = utilsAllCuratedGenesTxtGetUsingGET1ValidateBeforeCall(version, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * utilsAllCuratedGenesTxtGet (asynchronously)
     * Get list of genes OncoKB curated in text file.
     * @param version version (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call utilsAllCuratedGenesTxtGetUsingGET1Async(String version, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = utilsAllCuratedGenesTxtGetUsingGET1ValidateBeforeCall(version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for utilsCancerGeneListGetUsingGET1
     * @param version version (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call utilsCancerGeneListGetUsingGET1Call(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/utils/cancerGeneList";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));

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
    private com.squareup.okhttp.Call utilsCancerGeneListGetUsingGET1ValidateBeforeCall(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = utilsCancerGeneListGetUsingGET1Call(version, progressListener, progressRequestListener);
        return call;

    }

    /**
     * utilsCancerGeneListGet
     * Get cancer gene list
     * @param version version (optional)
     * @return List&lt;CancerGene&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CancerGene> utilsCancerGeneListGetUsingGET1(String version) throws ApiException {
        ApiResponse<List<CancerGene>> resp = utilsCancerGeneListGetUsingGET1WithHttpInfo(version);
        return resp.getData();
    }

    /**
     * utilsCancerGeneListGet
     * Get cancer gene list
     * @param version version (optional)
     * @return ApiResponse&lt;List&lt;CancerGene&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CancerGene>> utilsCancerGeneListGetUsingGET1WithHttpInfo(String version) throws ApiException {
        com.squareup.okhttp.Call call = utilsCancerGeneListGetUsingGET1ValidateBeforeCall(version, null, null);
        Type localVarReturnType = new TypeToken<List<CancerGene>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * utilsCancerGeneListGet (asynchronously)
     * Get cancer gene list
     * @param version version (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call utilsCancerGeneListGetUsingGET1Async(String version, final ApiCallback<List<CancerGene>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = utilsCancerGeneListGetUsingGET1ValidateBeforeCall(version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CancerGene>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for utilsCancerGeneListTxtGetUsingGET1
     * @param version version (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call utilsCancerGeneListTxtGetUsingGET1Call(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/utils/cancerGeneList.txt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
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
    private com.squareup.okhttp.Call utilsCancerGeneListTxtGetUsingGET1ValidateBeforeCall(String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = utilsCancerGeneListTxtGetUsingGET1Call(version, progressListener, progressRequestListener);
        return call;

    }

    /**
     * utilsCancerGeneListTxtGet
     * Get cancer gene list in text file.
     * @param version version (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String utilsCancerGeneListTxtGetUsingGET1(String version) throws ApiException {
        ApiResponse<String> resp = utilsCancerGeneListTxtGetUsingGET1WithHttpInfo(version);
        return resp.getData();
    }

    /**
     * utilsCancerGeneListTxtGet
     * Get cancer gene list in text file.
     * @param version version (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> utilsCancerGeneListTxtGetUsingGET1WithHttpInfo(String version) throws ApiException {
        com.squareup.okhttp.Call call = utilsCancerGeneListTxtGetUsingGET1ValidateBeforeCall(version, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * utilsCancerGeneListTxtGet (asynchronously)
     * Get cancer gene list in text file.
     * @param version version (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call utilsCancerGeneListTxtGetUsingGET1Async(String version, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = utilsCancerGeneListTxtGetUsingGET1ValidateBeforeCall(version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
