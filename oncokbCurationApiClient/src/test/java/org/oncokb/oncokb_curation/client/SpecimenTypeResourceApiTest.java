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
import org.oncokb.oncokb_curation.client.SpecimenType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpecimenTypeResourceApi
 */
@Ignore
public class SpecimenTypeResourceApiTest {

    private final SpecimenTypeResourceApi api = new SpecimenTypeResourceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSpecimenTypeTest() throws ApiException {
        SpecimenType specimenType = null;
                SpecimenType response = api.createSpecimenType(specimenType);
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
    public void deleteSpecimenTypeTest() throws ApiException {
        Long id = null;
                api.deleteSpecimenType(id);
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
    public void getAllSpecimenTypesTest() throws ApiException {
                List<SpecimenType> response = api.getAllSpecimenTypes();
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
    public void getSpecimenTypeTest() throws ApiException {
        Long id = null;
                SpecimenType response = api.getSpecimenType(id);
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
    public void partialUpdateSpecimenTypeTest() throws ApiException {
        Long id = null;
        SpecimenType specimenType = null;
                SpecimenType response = api.partialUpdateSpecimenType(id, specimenType);
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
    public void updateSpecimenTypeTest() throws ApiException {
        Long id = null;
        SpecimenType specimenType = null;
                SpecimenType response = api.updateSpecimenType(id, specimenType);
        // TODO: test validations
    }
    
}