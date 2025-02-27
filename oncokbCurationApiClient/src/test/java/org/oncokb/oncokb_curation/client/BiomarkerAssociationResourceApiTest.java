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
import org.oncokb.oncokb_curation.client.BiomarkerAssociation;
import org.oncokb.oncokb_curation.client.BiomarkerAssociationDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BiomarkerAssociationResourceApi
 */
@Ignore
public class BiomarkerAssociationResourceApiTest {

    private final BiomarkerAssociationResourceApi api = new BiomarkerAssociationResourceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBiomarkerAssociationTest() throws ApiException {
        BiomarkerAssociationDTO biomarkerAssociationDTO = null;
                BiomarkerAssociation response = api.createBiomarkerAssociation(biomarkerAssociationDTO);
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
    public void deleteBiomarkerAssociationTest() throws ApiException {
        Long id = null;
                api.deleteBiomarkerAssociation(id);
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
    public void getAllBiomarkerAssociationsTest() throws ApiException {
                List<BiomarkerAssociation> response = api.getAllBiomarkerAssociations();
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
    public void getBiomarkerAssociationTest() throws ApiException {
        Long id = null;
                BiomarkerAssociation response = api.getBiomarkerAssociation(id);
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
    public void getBiomarkerAssociationByCompanionDiagnosticDeviceTest() throws ApiException {
        Long id = null;
                List<BiomarkerAssociation> response = api.getBiomarkerAssociationByCompanionDiagnosticDevice(id);
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
    public void partialUpdateBiomarkerAssociationTest() throws ApiException {
        Long id = null;
        BiomarkerAssociation biomarkerAssociation = null;
                BiomarkerAssociation response = api.partialUpdateBiomarkerAssociation(id, biomarkerAssociation);
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
    public void updateBiomarkerAssociationTest() throws ApiException {
        Long id = null;
        BiomarkerAssociation biomarkerAssociation = null;
                BiomarkerAssociation response = api.updateBiomarkerAssociation(id, biomarkerAssociation);
        // TODO: test validations
    }
    
}
