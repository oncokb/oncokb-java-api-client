/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * The version of the OpenAPI document: v1.2.2
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.client;

import org.oncokb.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LevelsApi
 */
@Ignore
public class LevelsApiTest {

    private final LevelsApi api = new LevelsApi();

    
    /**
     * levelsGet
     *
     * Get all levels.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void levelsGetUsingGETTest() throws ApiException {
                Object response = api.levelsGetUsingGET();
        // TODO: test validations
    }
    
    /**
     * levelsResistanceGet
     *
     * Get all resistance levels.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void levelsResistanceGetUsingGETTest() throws ApiException {
                Object response = api.levelsResistanceGetUsingGET();
        // TODO: test validations
    }
    
    /**
     * levelsSensitiveGet
     *
     * Get all sensitive levels.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void levelsSensitiveGetUsingGETTest() throws ApiException {
                Object response = api.levelsSensitiveGetUsingGET();
        // TODO: test validations
    }
    
}
