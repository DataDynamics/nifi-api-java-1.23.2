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


package io.datadynamics.nifi.api.api;

import io.datadynamics.nifi.api.model.ComponentStateEntity;
import io.datadynamics.nifi.api.model.ConfigurationAnalysisEntity;
import io.datadynamics.nifi.api.model.ParameterProviderApplyParametersRequestEntity;
import io.datadynamics.nifi.api.model.ParameterProviderEntity;
import io.datadynamics.nifi.api.model.ParameterProviderParameterApplicationEntity;
import io.datadynamics.nifi.api.model.ParameterProviderParameterFetchEntity;
import io.datadynamics.nifi.api.model.ParameterProviderReferencingComponentsEntity;
import io.datadynamics.nifi.api.model.PropertyDescriptorEntity;
import io.datadynamics.nifi.api.model.VerifyConfigRequestEntity;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for ParameterProvidersApi
 */
@Ignore
public class ParameterProvidersApiTest {

    private final ParameterProvidersApi api = new ParameterProvidersApi();

    
    /**
     * Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void analyzeConfigurationTest() throws Exception {
        String id = null;
        ConfigurationAnalysisEntity body = null;
        ConfigurationAnalysisEntity response = api.analyzeConfiguration(id, body);

        // TODO: test validations
    }
    
    /**
     * Clears the state for a parameter provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void clearStateTest() throws Exception {
        String id = null;
        ComponentStateEntity response = api.clearState(id);

        // TODO: test validations
    }
    
    /**
     * Deletes the Apply Parameters Request with the given ID
     *
     * Deletes the Apply Parameters Request with the given ID. After a request is created via a POST to /nifi-api/parameter-providers/apply-parameters-requests, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Apply process has completed. If the request is deleted before the request completes, then the Apply Parameters Request will finish the step that it is currently performing and then will cancel any subsequent steps.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteApplyParametersRequestTest() throws Exception {
        String providerId = null;
        String requestId = null;
        Boolean disconnectedNodeAcknowledged = null;
        ParameterProviderApplyParametersRequestEntity response = api.deleteApplyParametersRequest(providerId, requestId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Deletes the Verification Request with the given ID
     *
     * Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteVerificationRequestTest() throws Exception {
        String id = null;
        String requestId = null;
        VerifyConfigRequestEntity response = api.deleteVerificationRequest(id, requestId);

        // TODO: test validations
    }
    
    /**
     * Fetches and temporarily caches the parameters for a provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void fetchParametersTest() throws Exception {
        String id = null;
        ParameterProviderParameterFetchEntity body = null;
        ParameterProviderEntity response = api.fetchParameters(id, body);

        // TODO: test validations
    }
    
    /**
     * Gets a parameter provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getParameterProviderTest() throws Exception {
        String id = null;
        ParameterProviderEntity response = api.getParameterProvider(id);

        // TODO: test validations
    }
    
    /**
     * Returns the Apply Parameters Request with the given ID
     *
     * Returns the Apply Parameters Request with the given ID. Once an Apply Parameters Request has been created by performing a POST to /nifi-api/parameter-providers, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the state, such as percent complete, the current state of the request, and any failures. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getParameterProviderApplyParametersRequestTest() throws Exception {
        String providerId = null;
        String requestId = null;
        ParameterProviderApplyParametersRequestEntity response = api.getParameterProviderApplyParametersRequest(providerId, requestId);

        // TODO: test validations
    }
    
    /**
     * Gets all references to a parameter provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getParameterProviderReferencesTest() throws Exception {
        String id = null;
        ParameterProviderReferencingComponentsEntity response = api.getParameterProviderReferences(id);

        // TODO: test validations
    }
    
    /**
     * Gets a parameter provider property descriptor
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPropertyDescriptorTest() throws Exception {
        String id = null;
        String propertyName = null;
        PropertyDescriptorEntity response = api.getPropertyDescriptor(id, propertyName);

        // TODO: test validations
    }
    
    /**
     * Gets the state for a parameter provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStateTest() throws Exception {
        String id = null;
        ComponentStateEntity response = api.getState(id);

        // TODO: test validations
    }
    
    /**
     * Returns the Verification Request with the given ID
     *
     * Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVerificationRequestTest() throws Exception {
        String id = null;
        String requestId = null;
        VerifyConfigRequestEntity response = api.getVerificationRequest(id, requestId);

        // TODO: test validations
    }
    
    /**
     * Deletes a parameter provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeParameterProviderTest() throws Exception {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        ParameterProviderEntity response = api.removeParameterProvider(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Initiate a request to apply the fetched parameters of a Parameter Provider
     *
     * This will initiate the process of applying fetched parameters to all referencing Parameter Contexts. Changing the value of a Parameter may require that one or more components be stopped and restarted, so this action may take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterProviderApplyParametersRequestEntity, and the process of updating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/apply-parameters-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/apply-parameters-requests/{requestId}.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitApplyParametersTest() throws Exception {
        String providerId = null;
        ParameterProviderParameterApplicationEntity body = null;
        ParameterProviderApplyParametersRequestEntity response = api.submitApplyParameters(providerId, body);

        // TODO: test validations
    }
    
    /**
     * Performs verification of the Parameter Provider&#39;s configuration
     *
     * This will initiate the process of verifying a given Parameter Provider configuration. This may be a long-running task. As a result, this endpoint will immediately return a ParameterProviderConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/{serviceId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/{providerId}/verification-requests/{requestId}.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitConfigVerificationRequestTest() throws Exception {
        String id = null;
        VerifyConfigRequestEntity body = null;
        VerifyConfigRequestEntity response = api.submitConfigVerificationRequest(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a parameter provider
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateParameterProviderTest() throws Exception {
        String id = null;
        ParameterProviderEntity body = null;
        ParameterProviderEntity response = api.updateParameterProvider(id, body);

        // TODO: test validations
    }
    
}
