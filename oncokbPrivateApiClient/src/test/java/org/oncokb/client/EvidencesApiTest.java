/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * The version of the OpenAPI document: v1.4.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.client;

import org.oncokb.ApiException;
import org.oncokb.client.Evidence;
import org.oncokb.client.EvidenceQueries;
import org.oncokb.client.EvidenceQueryRes;
import org.oncokb.client.ResponseEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EvidencesApi
 */
@Ignore
public class EvidencesApiTest {

    private final EvidencesApi api = new EvidencesApi();

    
    /**
     * evidencesLookupGet
     *
     * Search evidences. Multi-queries are supported.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evidencesLookupGetUsingGETTest() throws ApiException {
        Integer entrezGeneId = null;
        String hugoSymbol = null;
        String variant = null;
        String tumorType = null;
        String consequence = null;
        String proteinStart = null;
        String proteinEnd = null;
        Boolean highestLevelOnly = null;
        String levelOfEvidence = null;
        String evidenceTypes = null;
        String fields = null;
                List<Evidence> response = api.evidencesLookupGetUsingGET(entrezGeneId, hugoSymbol, variant, tumorType, consequence, proteinStart, proteinEnd, highestLevelOnly, levelOfEvidence, evidenceTypes, fields);
        // TODO: test validations
    }
    
    /**
     * evidencesLookupPost
     *
     * Search evidences.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evidencesLookupPostUsingPOSTTest() throws ApiException {
        EvidenceQueries body = null;
        String fields = null;
                List<EvidenceQueryRes> response = api.evidencesLookupPostUsingPOST(body, fields);
        // TODO: test validations
    }
    
    /**
     * evidencesUUIDGet
     *
     * Get specific evidence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evidencesUUIDGetUsingGETTest() throws ApiException {
        String uuid = null;
        String fields = null;
                Evidence response = api.evidencesUUIDGetUsingGET(uuid, fields);
        // TODO: test validations
    }
    
    /**
     * evidencesUUIDsGet
     *
     * Get specific evidences.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evidencesUUIDsGetUsingPOSTTest() throws ApiException {
        List<String> uuids = null;
        String fields = null;
                Evidence response = api.evidencesUUIDsGetUsingPOST(uuids, fields);
        // TODO: test validations
    }
    
}
