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
import org.oncokb.oncokb_transcript.client.AllReferenceTranscriptSuggestionVM;
import org.oncokb.oncokb_transcript.client.EnrichedAlignmentResult;
import org.oncokb.oncokb_transcript.client.MatchTranscriptVM;
import org.oncokb.oncokb_transcript.client.TranscriptComparisonResultVM;
import org.oncokb.oncokb_transcript.client.TranscriptComparisonVM;
import org.oncokb.oncokb_transcript.client.TranscriptMatchResultVM;
import org.oncokb.oncokb_transcript.client.TranscriptResultVM;
import org.oncokb.oncokb_transcript.client.TranscriptSuggestionVM;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TranscriptControllerApi
 */
@Ignore
public class TranscriptControllerApiTest {

    private final TranscriptControllerApi api = new TranscriptControllerApi();

    /**
     * compareEnsemblTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void compareEnsemblTranscriptUsingPOSTTest() throws ApiException {
        TranscriptComparisonVM body = null;
        TranscriptComparisonResultVM response = api.compareEnsemblTranscriptUsingPOST(body);

        // TODO: test validations
    }
    /**
     * compareTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void compareTranscriptUsingPOSTTest() throws ApiException {
        String hugoSymbol = null;
        TranscriptComparisonVM body = null;
        TranscriptComparisonResultVM response = api.compareTranscriptUsingPOST(hugoSymbol, body);

        // TODO: test validations
    }
    /**
     * findGrch38Variant
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findGrch38VariantUsingGETTest() throws ApiException {
        String referenceAminoAcid = null;
        Integer proteinPosition = null;
        String grch37ProteinId = null;
        String grch38ProteinId = null;
        TranscriptSuggestionVM response = api.findGrch38VariantUsingGET(referenceAminoAcid, proteinPosition, grch37ProteinId, grch38ProteinId);

        // TODO: test validations
    }
    /**
     * getAlignments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlignmentsUsingPOSTTest() throws ApiException {
        String hugoSymbol = null;
        MatchTranscriptVM body = null;
        List<EnrichedAlignmentResult> response = api.getAlignmentsUsingPOST(hugoSymbol, body);

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
    public void getTranscriptUsingGETTest() throws ApiException {
        String referenceGenome = null;
        String transcript = null;
        String response = api.getTranscriptUsingGET(referenceGenome, transcript);

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
    public void getTranscriptUsingGET1Test() throws ApiException {
        String hugoSymbol = null;
        TranscriptResultVM response = api.getTranscriptUsingGET1(hugoSymbol);

        // TODO: test validations
    }
    /**
     * matchTranscript
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matchTranscriptUsingPOSTTest() throws ApiException {
        String hugoSymbol = null;
        MatchTranscriptVM body = null;
        TranscriptMatchResultVM response = api.matchTranscriptUsingPOST(hugoSymbol, body);

        // TODO: test validations
    }
    /**
     * suggestVariant
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suggestVariantUsingGETTest() throws ApiException {
        String hugoSymbol = null;
        Integer proteinPosition = null;
        String curatedResidue = null;
        String grch37Transcript = null;
        String grch38Transcript = null;
        AllReferenceTranscriptSuggestionVM response = api.suggestVariantUsingGET(hugoSymbol, proteinPosition, curatedResidue, grch37Transcript, grch38Transcript);

        // TODO: test validations
    }
    /**
     * updateTranscriptUsage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTranscriptUsageUsingPOSTTest() throws ApiException {
        String usageSource = null;
        String hugoSymbol = null;
        Integer entrezGeneId = null;
        String referenceGenome = null;
        String ensemblTranscriptId = null;
        api.updateTranscriptUsageUsingPOST(usageSource, hugoSymbol, entrezGeneId, referenceGenome, ensemblTranscriptId);

        // TODO: test validations
    }
}
