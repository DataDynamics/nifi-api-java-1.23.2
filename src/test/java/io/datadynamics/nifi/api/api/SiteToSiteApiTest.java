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

import io.datadynamics.nifi.api.model.ControllerEntity;
import io.datadynamics.nifi.api.model.PeersEntity;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for SiteToSiteApi
 */
@Ignore
public class SiteToSiteApiTest {

    private final SiteToSiteApi api = new SiteToSiteApi();

    
    /**
     * Returns the available Peers and its status of this NiFi
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPeersTest() throws Exception {
        PeersEntity response = api.getPeers();

        // TODO: test validations
    }
    
    /**
     * Returns the details about this NiFi necessary to communicate via site to site
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSiteToSiteDetailsTest() throws Exception {
        ControllerEntity response = api.getSiteToSiteDetails();

        // TODO: test validations
    }
    
}
