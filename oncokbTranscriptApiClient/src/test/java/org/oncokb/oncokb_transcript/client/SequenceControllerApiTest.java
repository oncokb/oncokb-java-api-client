/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.oncokb_transcript.client;

import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.client.Sequence;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SequenceControllerApi
 */
@Ignore
public class SequenceControllerApiTest {

    private final SequenceControllerApi api = new SequenceControllerApi();

    
    /**
     * findCanonicalSequence
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCanonicalSequenceUsingGETTest() throws ApiException {
        String referenceGenome = null;
        Integer entrezGeneId = null;
        String sequenceType = null;
                Sequence response = api.findCanonicalSequenceUsingGET(referenceGenome, entrezGeneId, sequenceType);
        // TODO: test validations
    }
    
    /**
     * findCanonicalSequences
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCanonicalSequencesUsingPOSTTest() throws ApiException {
        String referenceGenome = null;
        String sequenceType = null;
        List<Integer> requestBody = null;
                List<Sequence> response = api.findCanonicalSequencesUsingPOST(referenceGenome, sequenceType, requestBody);
        // TODO: test validations
    }
    
}
