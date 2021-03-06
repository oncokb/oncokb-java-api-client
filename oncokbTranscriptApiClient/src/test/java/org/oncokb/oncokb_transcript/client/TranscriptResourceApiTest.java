/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.oncokb.oncokb_transcript.client;

import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.client.Transcript;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TranscriptResourceApi
 */
@Ignore
public class TranscriptResourceApiTest {

    private final TranscriptResourceApi api = new TranscriptResourceApi();

    /**
     * createTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTranscriptUsingPOSTTest() throws ApiException {
        Transcript body = null;
        Transcript response = api.createTranscriptUsingPOST(body);

        // TODO: test validations
    }
    /**
     * deleteTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTranscriptUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteTranscriptUsingDELETE(id);

        // TODO: test validations
    }
    /**
     * getAllTranscripts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTranscriptsUsingGETTest() throws ApiException {
        List<Transcript> response = api.getAllTranscriptsUsingGET();

        // TODO: test validations
    }
    /**
     * getTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTranscriptUsingGET2Test() throws ApiException {
        Long id = null;
        Transcript response = api.getTranscriptUsingGET2(id);

        // TODO: test validations
    }
    /**
     * partialUpdateTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void partialUpdateTranscriptUsingPATCHTest() throws ApiException {
        Transcript body = null;
        Transcript response = api.partialUpdateTranscriptUsingPATCH(body);

        // TODO: test validations
    }
    /**
     * updateTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTranscriptUsingPUTTest() throws ApiException {
        Transcript body = null;
        Transcript response = api.updateTranscriptUsingPUT(body);

        // TODO: test validations
    }
}
