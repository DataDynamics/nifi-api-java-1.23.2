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

import io.swagger.client.model.TemplateEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Ignore
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    
    /**
     * Exports a template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void exportTemplateTest() throws Exception {
        String id = null;
        String response = api.exportTemplate(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a template
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeTemplateTest() throws Exception {
        String id = null;
        Boolean disconnectedNodeAcknowledged = null;
        TemplateEntity response = api.removeTemplate(id, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
}
