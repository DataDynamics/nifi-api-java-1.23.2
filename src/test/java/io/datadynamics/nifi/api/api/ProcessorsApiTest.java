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
import io.datadynamics.nifi.api.model.ProcessorEntity;
import io.datadynamics.nifi.api.model.ProcessorRunStatusEntity;
import io.datadynamics.nifi.api.model.ProcessorsRunStatusDetailsEntity;
import io.datadynamics.nifi.api.model.PropertyDescriptorEntity;
import io.datadynamics.nifi.api.model.RunStatusDetailsRequestEntity;
import io.datadynamics.nifi.api.model.VerifyConfigRequestEntity;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for ProcessorsApi
 */
@Ignore
public class ProcessorsApiTest {

    private final ProcessorsApi api = new ProcessorsApi();

    
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
     * Clears the state for a processor
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
     * Deletes a processor
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteProcessorTest() throws Exception {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        ProcessorEntity response = api.deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged);

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
     * Gets a processor
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProcessorTest() throws Exception {
        String id = null;
        ProcessorEntity response = api.getProcessor(id);

        // TODO: test validations
    }
    
    /**
     * Gets diagnostics information about a processor
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProcessorDiagnosticsTest() throws Exception {
        String id = null;
        ProcessorEntity response = api.getProcessorDiagnostics(id);

        // TODO: test validations
    }
    
    /**
     * Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProcessorRunStatusDetailsTest() throws Exception {
        RunStatusDetailsRequestEntity body = null;
        ProcessorsRunStatusDetailsEntity response = api.getProcessorRunStatusDetails(body);

        // TODO: test validations
    }
    
    /**
     * Gets the descriptor for a processor property
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
        String clientId = null;
        Boolean sensitive = null;
        PropertyDescriptorEntity response = api.getPropertyDescriptor(id, propertyName, clientId, sensitive);

        // TODO: test validations
    }
    
    /**
     * Gets the state for a processor
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
     * Performs verification of the Processor&#39;s configuration
     *
     * This will initiate the process of verifying a given Processor configuration. This may be a long-running task. As a result, this endpoint will immediately return a ProcessorConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /processors/{processorId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /processors/{processorId}/verification-requests/{requestId}.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitProcessorVerificationRequestTest() throws Exception {
        String id = null;
        VerifyConfigRequestEntity body = null;
        VerifyConfigRequestEntity response = api.submitProcessorVerificationRequest(id, body);

        // TODO: test validations
    }
    
    /**
     * Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void terminateProcessorTest() throws Exception {
        String id = null;
        ProcessorEntity response = api.terminateProcessor(id);

        // TODO: test validations
    }
    
    /**
     * Updates a processor
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateProcessorTest() throws Exception {
        String id = null;
        ProcessorEntity body = null;
        ProcessorEntity response = api.updateProcessor(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of a processor
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRunStatusTest() throws Exception {
        String id = null;
        ProcessorRunStatusEntity body = null;
        ProcessorEntity response = api.updateRunStatus(id, body);

        // TODO: test validations
    }
    
}