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
import org.oncokb.client.CancerGene;
import org.oncokb.client.CuratedGene;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CancerGenesApi
 */
@Ignore
public class CancerGenesApiTest {

    private final CancerGenesApi api = new CancerGenesApi();

    
    /**
     * utilsAllCuratedGenesGet
     *
     * Get list of genes OncoKB curated
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void utilsAllCuratedGenesGetUsingGET1Test() throws ApiException {
        String version = null;
        List<CuratedGene> response = api.utilsAllCuratedGenesGetUsingGET1(version);

        // TODO: test validations
    }
    
    /**
     * utilsAllCuratedGenesTxtGet
     *
     * Get list of genes OncoKB curated in text file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void utilsAllCuratedGenesTxtGetUsingGET1Test() throws ApiException {
        String version = null;
        String response = api.utilsAllCuratedGenesTxtGetUsingGET1(version);

        // TODO: test validations
    }
    
    /**
     * utilsCancerGeneListGet
     *
     * Get cancer gene list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void utilsCancerGeneListGetUsingGET1Test() throws ApiException {
        String version = null;
        List<CancerGene> response = api.utilsCancerGeneListGetUsingGET1(version);

        // TODO: test validations
    }
    
    /**
     * utilsCancerGeneListTxtGet
     *
     * Get cancer gene list in text file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void utilsCancerGeneListTxtGetUsingGET1Test() throws ApiException {
        String version = null;
        String response = api.utilsCancerGeneListTxtGetUsingGET1(version);

        // TODO: test validations
    }
    
}
