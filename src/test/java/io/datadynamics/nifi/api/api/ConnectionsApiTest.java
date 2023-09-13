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
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for ConnectionsApi
 */
@Ignore
public class ConnectionsApiTest {

    private final ConnectionsApi api = new ConnectionsApi();

    
    /**
     * Deletes a connection
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteConnectionTest() throws Exception {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        ConnectionEntity response = api.deleteConnection(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Gets a connection
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getConnectionTest() throws Exception {
        String id = null;
        ConnectionEntity response = api.getConnection(id);

        // TODO: test validations
    }
    
    /**
     * Updates a connection
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateConnectionTest() throws Exception {
        String id = null;
        ConnectionEntity body = null;
        ConnectionEntity response = api.updateConnection(id, body);

        // TODO: test validations
    }
    
}