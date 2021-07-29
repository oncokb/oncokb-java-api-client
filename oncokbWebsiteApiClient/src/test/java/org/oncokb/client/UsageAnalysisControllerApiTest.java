/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.0.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.oncokb.client;

import org.oncokb.ApiException;
import org.oncokb.client.UsageSummary;
import org.oncokb.client.UserOverviewUsage;
import org.oncokb.client.UserUsage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsageAnalysisControllerApi
 */
@Ignore
public class UsageAnalysisControllerApiTest {

    private final UsageAnalysisControllerApi api = new UsageAnalysisControllerApi();

    /**
     * resourceDetailGet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resourceDetailGetUsingGETTest() throws ApiException {
        String endpoint = null;
        UsageSummary response = api.resourceDetailGetUsingGET(endpoint);

        // TODO: test validations
    }
    /**
     * resourceUsageGet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resourceUsageGetUsingGETTest() throws ApiException {
        UsageSummary response = api.resourceUsageGetUsingGET();

        // TODO: test validations
    }
    /**
     * userOverviewUsageGet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userOverviewUsageGetUsingGETTest() throws ApiException {
        List<UserOverviewUsage> response = api.userOverviewUsageGetUsingGET();

        // TODO: test validations
    }
    /**
     * userUsageGet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userUsageGetUsingGETTest() throws ApiException {
        String userId = null;
        UserUsage response = api.userUsageGetUsingGET(userId);

        // TODO: test validations
    }
}
