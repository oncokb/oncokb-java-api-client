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
import org.oncokb.oncokb_curation.client.FdaSubmission;
import org.oncokb.oncokb_curation.client.FdaSubmissionCriteria;
import org.oncokb.oncokb_curation.client.Pageable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FdaSubmissionResourceApi
 */
@Ignore
public class FdaSubmissionResourceApiTest {

    private final FdaSubmissionResourceApi api = new FdaSubmissionResourceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countFdaSubmissionsTest() throws ApiException {
        FdaSubmissionCriteria criteria = null;
                Long response = api.countFdaSubmissions(criteria);
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
    public void createFdaSubmissionTest() throws ApiException {
        FdaSubmission fdaSubmission = null;
                FdaSubmission response = api.createFdaSubmission(fdaSubmission);
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
    public void deleteFdaSubmissionTest() throws ApiException {
        Long id = null;
                api.deleteFdaSubmission(id);
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
    public void findFdaSubmissionsByCompanionDiagnosticDeviceTest() throws ApiException {
        Long id = null;
                List<FdaSubmission> response = api.findFdaSubmissionsByCompanionDiagnosticDevice(id);
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
    public void getAllFdaSubmissionsTest() throws ApiException {
        FdaSubmissionCriteria criteria = null;
        Pageable pageable = null;
                List<FdaSubmission> response = api.getAllFdaSubmissions(criteria, pageable);
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
    public void getFdaSubmissionTest() throws ApiException {
        Long id = null;
                FdaSubmission response = api.getFdaSubmission(id);
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
    public void getFdaSubmissionByNumberTest() throws ApiException {
        String number = null;
        String supplementNumber = null;
                FdaSubmission response = api.getFdaSubmissionByNumber(number, supplementNumber);
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
    public void partialUpdateFdaSubmissionTest() throws ApiException {
        Long id = null;
        FdaSubmission fdaSubmission = null;
                FdaSubmission response = api.partialUpdateFdaSubmission(id, fdaSubmission);
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
    public void searchFdaSubmissionsTest() throws ApiException {
        String query = null;
        Pageable pageable = null;
                List<FdaSubmission> response = api.searchFdaSubmissions(query, pageable);
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
    public void updateFdaSubmissionTest() throws ApiException {
        Long id = null;
        FdaSubmission fdaSubmission = null;
                FdaSubmission response = api.updateFdaSubmission(id, fdaSubmission);
        // TODO: test validations
    }
    
}