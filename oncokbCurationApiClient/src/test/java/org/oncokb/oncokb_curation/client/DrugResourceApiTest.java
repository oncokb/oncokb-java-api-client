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
import org.oncokb.oncokb_curation.client.Drug;
import org.oncokb.oncokb_curation.client.DrugCriteria;
import org.oncokb.oncokb_curation.client.Pageable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DrugResourceApi
 */
@Ignore
public class DrugResourceApiTest {

    private final DrugResourceApi api = new DrugResourceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countDrugsTest() throws ApiException {
        DrugCriteria criteria = null;
                Long response = api.countDrugs(criteria);
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
    public void createDrugTest() throws ApiException {
        Drug drug = null;
                Drug response = api.createDrug(drug);
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
    public void deleteDrugTest() throws ApiException {
        Long id = null;
                api.deleteDrug(id);
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
    public void getAllDrugsTest() throws ApiException {
        DrugCriteria criteria = null;
        Pageable pageable = null;
                List<Drug> response = api.getAllDrugs(criteria, pageable);
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
    public void getDrugTest() throws ApiException {
        Long id = null;
                Drug response = api.getDrug(id);
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
    public void partialUpdateDrugTest() throws ApiException {
        Long id = null;
        Drug drug = null;
                Drug response = api.partialUpdateDrug(id, drug);
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
    public void searchDrugsTest() throws ApiException {
        String query = null;
        Pageable pageable = null;
                List<Drug> response = api.searchDrugs(query, pageable);
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
    public void updateDrugTest() throws ApiException {
        Long id = null;
        Drug drug = null;
                Drug response = api.updateDrug(id, drug);
        // TODO: test validations
    }
    
}