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

import io.swagger.client.model.SnippetEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SnippetsApi
 */
@Ignore
public class SnippetsApiTest {

    private final SnippetsApi api = new SnippetsApi();

    
    /**
     * Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSnippetTest() throws Exception {
        SnippetEntity body = null;
        SnippetEntity response = api.createSnippet(body);

        // TODO: test validations
    }
    
    /**
     * Deletes the components in a snippet and discards the snippet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteSnippetTest() throws Exception {
        String id = null;
        Boolean disconnectedNodeAcknowledged = null;
        SnippetEntity response = api.deleteSnippet(id, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Move&#39;s the components in this Snippet into a new Process Group and discards the snippet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateSnippetTest() throws Exception {
        String id = null;
        SnippetEntity body = null;
        SnippetEntity response = api.updateSnippet(id, body);

        // TODO: test validations
    }
    
}
