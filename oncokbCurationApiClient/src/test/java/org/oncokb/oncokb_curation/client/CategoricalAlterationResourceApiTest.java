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
import org.oncokb.oncokb_curation.client.CategoricalAlteration;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoricalAlterationResourceApi
 */
@Ignore
public class CategoricalAlterationResourceApiTest {

    private final CategoricalAlterationResourceApi api = new CategoricalAlterationResourceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCategoricalAlterationTest() throws ApiException {
        CategoricalAlteration categoricalAlteration = null;
                CategoricalAlteration response = api.createCategoricalAlteration(categoricalAlteration);
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
    public void deleteCategoricalAlterationTest() throws ApiException {
        Long id = null;
                api.deleteCategoricalAlteration(id);
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
    public void getAllCategoricalAlterationsTest() throws ApiException {
                List<CategoricalAlteration> response = api.getAllCategoricalAlterations();
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
    public void getCategoricalAlterationTest() throws ApiException {
        Long id = null;
                CategoricalAlteration response = api.getCategoricalAlteration(id);
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
    public void partialUpdateCategoricalAlterationTest() throws ApiException {
        Long id = null;
        CategoricalAlteration categoricalAlteration = null;
                CategoricalAlteration response = api.partialUpdateCategoricalAlteration(id, categoricalAlteration);
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
    public void updateCategoricalAlterationTest() throws ApiException {
        Long id = null;
        CategoricalAlteration categoricalAlteration = null;
                CategoricalAlteration response = api.updateCategoricalAlteration(id, categoricalAlteration);
        // TODO: test validations
    }
    
}