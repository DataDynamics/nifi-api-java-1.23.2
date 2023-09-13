/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.23.2
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.JmxMetricsResultsEntity;
import io.swagger.client.model.SystemDiagnosticsEntity;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemDiagnosticsApi {
    private ApiClient apiClient;

    public SystemDiagnosticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemDiagnosticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getJmxMetrics
     *
     * @param beanNameFilter          Regular Expression Pattern to be applied against the ObjectName (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getJmxMetricsCall(String beanNameFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/system-diagnostics/jmx-metrics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (beanNameFilter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("beanNameFilter", beanNameFilter));

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

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getJmxMetricsValidateBeforeCall(String beanNameFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getJmxMetricsCall(beanNameFilter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve available JMX metrics
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @param beanNameFilter Regular Expression Pattern to be applied against the ObjectName (optional)
     * @return JmxMetricsResultsEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JmxMetricsResultsEntity getJmxMetrics(String beanNameFilter) throws ApiException {
        ApiResponse<JmxMetricsResultsEntity> resp = getJmxMetricsWithHttpInfo(beanNameFilter);
        return resp.getData();
    }

    /**
     * Retrieve available JMX metrics
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @param beanNameFilter Regular Expression Pattern to be applied against the ObjectName (optional)
     * @return ApiResponse&lt;JmxMetricsResultsEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JmxMetricsResultsEntity> getJmxMetricsWithHttpInfo(String beanNameFilter) throws ApiException {
        com.squareup.okhttp.Call call = getJmxMetricsValidateBeforeCall(beanNameFilter, null, null);
        Type localVarReturnType = new TypeToken<JmxMetricsResultsEntity>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve available JMX metrics (asynchronously)
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @param beanNameFilter Regular Expression Pattern to be applied against the ObjectName (optional)
     * @param callback       The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJmxMetricsAsync(String beanNameFilter, final ApiCallback<JmxMetricsResultsEntity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJmxMetricsValidateBeforeCall(beanNameFilter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JmxMetricsResultsEntity>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getSystemDiagnostics
     *
     * @param nodewise                Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId           The id of the node where to get the status. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSystemDiagnosticsCall(Boolean nodewise, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/system-diagnostics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nodewise != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("nodewise", nodewise));
        if (clusterNodeId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("clusterNodeId", clusterNodeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSystemDiagnosticsValidateBeforeCall(Boolean nodewise, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getSystemDiagnosticsCall(nodewise, clusterNodeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the diagnostics for the system NiFi is running on
     *
     * @param nodewise      Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return SystemDiagnosticsEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemDiagnosticsEntity getSystemDiagnostics(Boolean nodewise, String clusterNodeId) throws ApiException {
        ApiResponse<SystemDiagnosticsEntity> resp = getSystemDiagnosticsWithHttpInfo(nodewise, clusterNodeId);
        return resp.getData();
    }

    /**
     * Gets the diagnostics for the system NiFi is running on
     *
     * @param nodewise      Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return ApiResponse&lt;SystemDiagnosticsEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemDiagnosticsEntity> getSystemDiagnosticsWithHttpInfo(Boolean nodewise, String clusterNodeId) throws ApiException {
        com.squareup.okhttp.Call call = getSystemDiagnosticsValidateBeforeCall(nodewise, clusterNodeId, null, null);
        Type localVarReturnType = new TypeToken<SystemDiagnosticsEntity>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the diagnostics for the system NiFi is running on (asynchronously)
     *
     * @param nodewise      Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSystemDiagnosticsAsync(Boolean nodewise, String clusterNodeId, final ApiCallback<SystemDiagnosticsEntity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSystemDiagnosticsValidateBeforeCall(nodewise, clusterNodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemDiagnosticsEntity>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
