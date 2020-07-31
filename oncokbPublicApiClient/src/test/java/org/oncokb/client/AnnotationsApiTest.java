/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.1.0
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
    public void annotateCopyNumberAlterationsGetUsingGET1Test() throws ApiException {
        String copyNameAlterationType = null;
        String hugoSymbol = null;
        Integer entrezGeneId = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateCopyNumberAlterationsGetUsingGET1(copyNameAlterationType, hugoSymbol, entrezGeneId, tumorType, evidenceType);

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
    public void annotateCopyNumberAlterationsPostUsingPOST1Test() throws ApiException {
        List<AnnotateCopyNumberAlterationQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateCopyNumberAlterationsPostUsingPOST1(body);

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
    public void annotateMutationsByGenomicChangeGetUsingGET1Test() throws ApiException {
        String genomicLocation = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateMutationsByGenomicChangeGetUsingGET1(genomicLocation, tumorType, evidenceType);

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
    public void annotateMutationsByGenomicChangePostUsingPOST1Test() throws ApiException {
        List<AnnotateMutationByGenomicChangeQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateMutationsByGenomicChangePostUsingPOST1(body);

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
    public void annotateMutationsByHGVSgGetUsingGET1Test() throws ApiException {
        String hgvsg = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateMutationsByHGVSgGetUsingGET1(hgvsg, tumorType, evidenceType);

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
    public void annotateMutationsByHGVSgPostUsingPOST1Test() throws ApiException {
        List<AnnotateMutationByHGVSgQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateMutationsByHGVSgPostUsingPOST1(body);

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
    public void annotateMutationsByProteinChangeGetUsingGET1Test() throws ApiException {
        String hugoSymbol = null;
        Integer entrezGeneId = null;
        String alteration = null;
        String consequence = null;
        Integer proteinStart = null;
        Integer proteinEnd = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateMutationsByProteinChangeGetUsingGET1(hugoSymbol, entrezGeneId, alteration, consequence, proteinStart, proteinEnd, tumorType, evidenceType);

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
    public void annotateMutationsByProteinChangePostUsingPOST1Test() throws ApiException {
        List<AnnotateMutationByProteinChangeQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateMutationsByProteinChangePostUsingPOST1(body);

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
    public void annotateStructuralVariantsGetUsingGET1Test() throws ApiException {
        String structuralVariantType = null;
        Boolean isFunctionalFusion = null;
        String hugoSymbolA = null;
        Integer entrezGeneIdA = null;
        String hugoSymbolB = null;
        Integer entrezGeneIdB = null;
        String tumorType = null;
        String evidenceType = null;
        IndicatorQueryResp response = api.annotateStructuralVariantsGetUsingGET1(structuralVariantType, isFunctionalFusion, hugoSymbolA, entrezGeneIdA, hugoSymbolB, entrezGeneIdB, tumorType, evidenceType);

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
    public void annotateStructuralVariantsPostUsingPOST1Test() throws ApiException {
        List<AnnotateStructuralVariantQuery> body = null;
        List<IndicatorQueryResp> response = api.annotateStructuralVariantsPostUsingPOST1(body);

        // TODO: test validations
    }
    
}
