/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * OpenAPI spec version: v1.2.1
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.oncokb.client;

import org.oncokb.ApiException;
import org.oncokb.client.AnnotateCopyNumberAlterationQuery;
import org.oncokb.client.AnnotateMutationByGenomicChangeQuery;
import org.oncokb.client.AnnotateMutationByHGVSgQuery;
import org.oncokb.client.AnnotateMutationByProteinChangeQuery;
import org.oncokb.client.AnnotateStructuralVariantQuery;
import org.oncokb.client.IndicatorQueryResp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnotationsApi
 */
@Ignore
public class AnnotationsApiTest {

    private final AnnotationsApi api = new AnnotationsApi();

    
    /**
     * annotateCopyNumberAlterationsGet
     *
     * Annotate copy number alteration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateCopyNumberAlterationsGetUsingGETTest() throws ApiException {
        String copyNameAlterationType = null;
        String hugoSymbol = null;
        Integer entrezGeneId = null;
        String referenceGenome = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateCopyNumberAlterationsGetUsingGET(copyNameAlterationType, hugoSymbol, entrezGeneId, referenceGenome, tumorType, evidenceType);

        // TODO: test validations
    }
    
    /**
     * annotateCopyNumberAlterationsPost
     *
     * Annotate copy number alterations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateCopyNumberAlterationsPostUsingPOSTTest() throws ApiException {
        List<AnnotateCopyNumberAlterationQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateCopyNumberAlterationsPostUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * annotateMutationsByGenomicChangeGet
     *
     * Annotate mutation by genomic change.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateMutationsByGenomicChangeGetUsingGETTest() throws ApiException {
        String genomicLocation = null;
        String referenceGenome = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateMutationsByGenomicChangeGetUsingGET(genomicLocation, referenceGenome, tumorType, evidenceType);

        // TODO: test validations
    }
    
    /**
     * annotateMutationsByGenomicChangePost
     *
     * Annotate mutations by genomic change.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateMutationsByGenomicChangePostUsingPOSTTest() throws ApiException {
        List<AnnotateMutationByGenomicChangeQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateMutationsByGenomicChangePostUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * annotateMutationsByHGVSgGet
     *
     * Annotate mutation by HGVSg.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateMutationsByHGVSgGetUsingGETTest() throws ApiException {
        String hgvsg = null;
        String referenceGenome = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateMutationsByHGVSgGetUsingGET(hgvsg, referenceGenome, tumorType, evidenceType);

        // TODO: test validations
    }
    
    /**
     * annotateMutationsByHGVSgPost
     *
     * Annotate mutations by genomic change.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateMutationsByHGVSgPostUsingPOSTTest() throws ApiException {
        List<AnnotateMutationByHGVSgQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateMutationsByHGVSgPostUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * annotateMutationsByProteinChangeGet
     *
     * Annotate mutation by protein change.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateMutationsByProteinChangeGetUsingGETTest() throws ApiException {
        String hugoSymbol = null;
        Integer entrezGeneId = null;
        String alteration = null;
        String referenceGenome = null;
        String consequence = null;
        Integer proteinStart = null;
        Integer proteinEnd = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateMutationsByProteinChangeGetUsingGET(hugoSymbol, entrezGeneId, alteration, referenceGenome, consequence, proteinStart, proteinEnd, tumorType, evidenceType);

        // TODO: test validations
    }
    
    /**
     * annotateMutationsByProteinChangePost
     *
     * Annotate mutations by protein change.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateMutationsByProteinChangePostUsingPOSTTest() throws ApiException {
        List<AnnotateMutationByProteinChangeQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateMutationsByProteinChangePostUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * annotateStructuralVariantsGet
     *
     * Annotate structural variant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateStructuralVariantsGetUsingGETTest() throws ApiException {
        String structuralVariantType = null;
        Boolean isFunctionalFusion = null;
        String hugoSymbolA = null;
        Integer entrezGeneIdA = null;
        String hugoSymbolB = null;
        Integer entrezGeneIdB = null;
        String referenceGenome = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateStructuralVariantsGetUsingGET(structuralVariantType, isFunctionalFusion, hugoSymbolA, entrezGeneIdA, hugoSymbolB, entrezGeneIdB, referenceGenome, tumorType, evidenceType);

        // TODO: test validations
    }
    
    /**
     * annotateStructuralVariantsPost
     *
     * Annotate structural variants.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateStructuralVariantsPostUsingPOSTTest() throws ApiException {
        List<AnnotateStructuralVariantQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateStructuralVariantsPostUsingPOST(body);

        // TODO: test validations
    }
    
}
