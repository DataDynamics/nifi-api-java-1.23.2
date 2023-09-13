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

import io.swagger.client.model.PortEntity;
import io.swagger.client.model.PortRunStatusEntity;
import io.swagger.client.model.ProcessorEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InputPortsApi
 */
@Ignore
public class InputPortsApiTest {

    private final InputPortsApi api = new InputPortsApi();

    
    /**
     * Gets an input port
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInputPortTest() throws Exception {
        String id = null;
        PortEntity response = api.getInputPort(id);

        // TODO: test validations
    }
    
    /**
     * Deletes an input port
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeInputPortTest() throws Exception {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        PortEntity response = api.removeInputPort(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Updates an input port
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateInputPortTest() throws Exception {
        String id = null;
        PortEntity body = null;
        PortEntity response = api.updateInputPort(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of an input-port
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRunStatusTest() throws Exception {
        String id = null;
        PortRunStatusEntity body = null;
        ProcessorEntity response = api.updateRunStatus(id, body);

        // TODO: test validations
    }
    
}
