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

import io.datadynamics.nifi.api.model.ConnectionEntity;
import io.datadynamics.nifi.api.model.ConnectionsEntity;
import io.datadynamics.nifi.api.model.ControllerServiceEntity;
import io.datadynamics.nifi.api.model.CopySnippetRequestEntity;
import io.datadynamics.nifi.api.model.CreateTemplateRequestEntity;
import io.datadynamics.nifi.api.model.DropRequestEntity;
import java.io.File;
import io.datadynamics.nifi.api.model.FlowComparisonEntity;
import io.datadynamics.nifi.api.model.FlowEntity;
import io.datadynamics.nifi.api.model.FunnelEntity;
import io.datadynamics.nifi.api.model.FunnelsEntity;
import io.datadynamics.nifi.api.model.InputPortsEntity;
import io.datadynamics.nifi.api.model.InstantiateTemplateRequestEntity;
import io.datadynamics.nifi.api.model.LabelEntity;
import io.datadynamics.nifi.api.model.LabelsEntity;
import io.datadynamics.nifi.api.model.OutputPortsEntity;
import io.datadynamics.nifi.api.model.PortEntity;
import io.datadynamics.nifi.api.model.ProcessGroupEntity;
import io.datadynamics.nifi.api.model.ProcessGroupImportEntity;
import io.datadynamics.nifi.api.model.ProcessGroupReplaceRequestEntity;
import io.datadynamics.nifi.api.model.ProcessGroupsEntity;
import io.datadynamics.nifi.api.model.ProcessorEntity;
import io.datadynamics.nifi.api.model.ProcessorsEntity;
import io.datadynamics.nifi.api.model.RemoteProcessGroupEntity;
import io.datadynamics.nifi.api.model.RemoteProcessGroupsEntity;
import io.datadynamics.nifi.api.model.TemplateEntity;
import io.datadynamics.nifi.api.model.VariableRegistryEntity;
import io.datadynamics.nifi.api.model.VariableRegistryUpdateRequestEntity;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for ProcessGroupsApi
 */
@Ignore
public class ProcessGroupsApiTest {

    private final ProcessGroupsApi api = new ProcessGroupsApi();

    
    /**
     * Copies a snippet and discards it.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void copySnippetTest() throws Exception {
        String id = null;
        CopySnippetRequestEntity body = null;
        FlowEntity response = api.copySnippet(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a connection
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createConnectionTest() throws Exception {
        String id = null;
        ConnectionEntity body = null;
        ConnectionEntity response = api.createConnection(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a new controller service
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createControllerServiceTest() throws Exception {
        String id = null;
        ControllerServiceEntity body = null;
        ControllerServiceEntity response = api.createControllerService(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a request to drop all flowfiles of all connection queues in this process group.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createEmptyAllConnectionsRequestTest() throws Exception {
        String id = null;
        DropRequestEntity response = api.createEmptyAllConnectionsRequest(id);

        // TODO: test validations
    }
    
    /**
     * Creates a funnel
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createFunnelTest() throws Exception {
        String id = null;
        FunnelEntity body = null;
        FunnelEntity response = api.createFunnel(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates an input port
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createInputPortTest() throws Exception {
        String id = null;
        PortEntity body = null;
        PortEntity response = api.createInputPort(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a label
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createLabelTest() throws Exception {
        String id = null;
        LabelEntity body = null;
        LabelEntity response = api.createLabel(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates an output port
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOutputPortTest() throws Exception {
        String id = null;
        PortEntity body = null;
        PortEntity response = api.createOutputPort(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createProcessGroupTest() throws Exception {
        String id = null;
        ProcessGroupEntity body = null;
        String parameterContextHandlingStrategy = null;
        ProcessGroupEntity response = api.createProcessGroup(id, body, parameterContextHandlingStrategy);

        // TODO: test validations
    }
    
    /**
     * Creates a new processor
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createProcessorTest() throws Exception {
        String id = null;
        ProcessorEntity body = null;
        ProcessorEntity response = api.createProcessor(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a new process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createRemoteProcessGroupTest() throws Exception {
        String id = null;
        RemoteProcessGroupEntity body = null;
        RemoteProcessGroupEntity response = api.createRemoteProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Creates a template and discards the specified snippet.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTemplateTest() throws Exception {
        String id = null;
        CreateTemplateRequestEntity body = null;
        TemplateEntity response = api.createTemplate(id, body);

        // TODO: test validations
    }
    
    /**
     * Deletes the Replace Request with the given ID
     *
     * Deletes the Replace Request with the given ID. After a request is created via a POST to /process-groups/{id}/replace-requests, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Replace process has completed. If the request is deleted before the request completes, then the Replace request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteReplaceProcessGroupRequestTest() throws Exception {
        String id = null;
        Boolean disconnectedNodeAcknowledged = null;
        ProcessGroupReplaceRequestEntity response = api.deleteReplaceProcessGroupRequest(id, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Deletes an update request for a process group&#39;s variable registry. If the request is not yet complete, it will automatically be cancelled.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteVariableRegistryUpdateRequestTest() throws Exception {
        String groupId = null;
        String updateId = null;
        Boolean disconnectedNodeAcknowledged = null;
        VariableRegistryUpdateRequestEntity response = api.deleteVariableRegistryUpdateRequest(groupId, updateId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Gets a process group for download
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void exportProcessGroupTest() throws Exception {
        String id = null;
        Boolean includeReferencedServices = null;
        String response = api.exportProcessGroup(id, includeReferencedServices);

        // TODO: test validations
    }
    
    /**
     * Gets all connections
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getConnectionsTest() throws Exception {
        String id = null;
        ConnectionsEntity response = api.getConnections(id);

        // TODO: test validations
    }
    
    /**
     * Gets the current status of a drop all flowfiles request.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDropAllFlowfilesRequestTest() throws Exception {
        String id = null;
        String dropRequestId = null;
        DropRequestEntity response = api.getDropAllFlowfilesRequest(id, dropRequestId);

        // TODO: test validations
    }
    
    /**
     * Gets all funnels
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFunnelsTest() throws Exception {
        String id = null;
        FunnelsEntity response = api.getFunnels(id);

        // TODO: test validations
    }
    
    /**
     * Gets all input ports
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInputPortsTest() throws Exception {
        String id = null;
        InputPortsEntity response = api.getInputPorts(id);

        // TODO: test validations
    }
    
    /**
     * Gets all labels
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLabelsTest() throws Exception {
        String id = null;
        LabelsEntity response = api.getLabels(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLocalModificationsTest() throws Exception {
        String id = null;
        FlowComparisonEntity response = api.getLocalModifications(id);

        // TODO: test validations
    }
    
    /**
     * Gets all output ports
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOutputPortsTest() throws Exception {
        String id = null;
        OutputPortsEntity response = api.getOutputPorts(id);

        // TODO: test validations
    }
    
    /**
     * Gets a process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupTest() throws Exception {
        String id = null;
        ProcessGroupEntity response = api.getProcessGroup(id);

        // TODO: test validations
    }
    
    /**
     * Gets all process groups
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupsTest() throws Exception {
        String id = null;
        ProcessGroupsEntity response = api.getProcessGroups(id);

        // TODO: test validations
    }
    
    /**
     * Gets all processors
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProcessorsTest() throws Exception {
        String id = null;
        Boolean includeDescendantGroups = null;
        ProcessorsEntity response = api.getProcessors(id, includeDescendantGroups);

        // TODO: test validations
    }
    
    /**
     * Gets all remote process groups
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupsTest() throws Exception {
        String id = null;
        RemoteProcessGroupsEntity response = api.getRemoteProcessGroups(id);

        // TODO: test validations
    }
    
    /**
     * Returns the Replace Request with the given ID
     *
     * Returns the Replace Request with the given ID. Once a Replace Request has been created by performing a POST to /process-groups/{id}/replace-requests, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReplaceProcessGroupRequestTest() throws Exception {
        String id = null;
        ProcessGroupReplaceRequestEntity response = api.getReplaceProcessGroupRequest(id);

        // TODO: test validations
    }
    
    /**
     * Gets a process group&#39;s variable registry
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVariableRegistryTest() throws Exception {
        String id = null;
        Boolean includeAncestorGroups = null;
        VariableRegistryEntity response = api.getVariableRegistry(id, includeAncestorGroups);

        // TODO: test validations
    }
    
    /**
     * Gets a process group&#39;s variable registry
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVariableRegistryUpdateRequestTest() throws Exception {
        String groupId = null;
        String updateId = null;
        VariableRegistryUpdateRequestEntity response = api.getVariableRegistryUpdateRequest(groupId, updateId);

        // TODO: test validations
    }
    
    /**
     * Imports a specified process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void importProcessGroupTest() throws Exception {
        String id = null;
        ProcessGroupEntity response = api.importProcessGroup(id);

        // TODO: test validations
    }
    
    /**
     * Imports a template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void importTemplateTest() throws Exception {
        String id = null;
        TemplateEntity response = api.importTemplate(id);

        // TODO: test validations
    }
    
    /**
     * Initiate the Replace Request of a Process Group with the given ID
     *
     * This will initiate the action of replacing a process group with the given process group. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a ProcessGroupReplaceRequestEntity, and the process of replacing the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /process-groups/replace-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /process-groups/replace-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void initiateReplaceProcessGroupTest() throws Exception {
        String id = null;
        ProcessGroupImportEntity body = null;
        ProcessGroupReplaceRequestEntity response = api.initiateReplaceProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Instantiates a template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void instantiateTemplateTest() throws Exception {
        String id = null;
        InstantiateTemplateRequestEntity body = null;
        FlowEntity response = api.instantiateTemplate(id, body);

        // TODO: test validations
    }
    
    /**
     * Cancels and/or removes a request to drop all flowfiles.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeDropRequestTest() throws Exception {
        String id = null;
        String dropRequestId = null;
        DropRequestEntity response = api.removeDropRequest(id, dropRequestId);

        // TODO: test validations
    }
    
    /**
     * Deletes a process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeProcessGroupTest() throws Exception {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        ProcessGroupEntity response = api.removeProcessGroup(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Replace Process Group contents with the given ID with the specified Process Group contents
     *
     * This endpoint is used for replication within a cluster, when replacing a flow with a new flow. It expects that the flow beingreplaced is not under version control and that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void replaceProcessGroupTest() throws Exception {
        String id = null;
        ProcessGroupImportEntity body = null;
        ProcessGroupImportEntity response = api.replaceProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Submits a request to update a process group&#39;s variable registry
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitUpdateVariableRegistryRequestTest() throws Exception {
        String id = null;
        VariableRegistryEntity body = null;
        VariableRegistryUpdateRequestEntity response = api.submitUpdateVariableRegistryRequest(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateProcessGroupTest() throws Exception {
        String id = null;
        ProcessGroupEntity body = null;
        ProcessGroupEntity response = api.updateProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates the contents of a Process Group&#39;s variable Registry
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateVariableRegistryTest() throws Exception {
        String id = null;
        VariableRegistryEntity body = null;
        VariableRegistryEntity response = api.updateVariableRegistry(id, body);

        // TODO: test validations
    }
    
    /**
     * Uploads a versioned flow definition and creates a process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadProcessGroupTest() throws Exception {
        String id = null;
        String body = null;
        Double body2 = null;
        Double body3 = null;
        String body4 = null;
        Boolean body5 = null;
        ProcessGroupEntity response = api.uploadProcessGroup(id, body, body2, body3, body4, body5);

        // TODO: test validations
    }
    
    /**
     * Uploads a template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadTemplateTest() throws Exception {
        String id = null;
        File template = null;
        Boolean body = null;
        TemplateEntity response = api.uploadTemplate(id, template, body);

        // TODO: test validations
    }
    
}