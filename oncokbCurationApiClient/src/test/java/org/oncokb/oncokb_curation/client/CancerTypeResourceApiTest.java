/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.oncokb_curation.client;

import org.oncokb.oncokb_curation.ApiException;
import org.oncokb.oncokb_curation.client.CancerType;
import org.oncokb.oncokb_curation.client.CancerTypeCriteria;
import org.oncokb.oncokb_curation.client.Pageable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CancerTypeResourceApi
 */
@Ignore
public class CancerTypeResourceApiTest {

    private final CancerTypeResourceApi api = new CancerTypeResourceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countCancerTypesTest() throws ApiException {
        CancerTypeCriteria criteria = null;
                Long response = api.countCancerTypes(criteria);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCancerTypeTest() throws ApiException {
        CancerType cancerType = null;
                CancerType response = api.createCancerType(cancerType);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCancerTypeTest() throws ApiException {
        Long id = null;
                api.deleteCancerType(id);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCancerTypesTest() throws ApiException {
        CancerTypeCriteria criteria = null;
        Pageable pageable = null;
                List<CancerType> response = api.getAllCancerTypes(criteria, pageable);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCancerTypeTest() throws ApiException {
        Long id = null;
                CancerType response = api.getCancerType(id);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void partialUpdateCancerTypeTest() throws ApiException {
        Long id = null;
        CancerType cancerType = null;
                CancerType response = api.partialUpdateCancerType(id, cancerType);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCancerTypesTest() throws ApiException {
        String query = null;
        Pageable pageable = null;
                List<CancerType> response = api.searchCancerTypes(query, pageable);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCancerTypeTest() throws ApiException {
        Long id = null;
        CancerType cancerType = null;
                CancerType response = api.updateCancerType(id, cancerType);
        // TODO: test validations
    }
    
}
