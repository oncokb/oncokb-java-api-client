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
import org.oncokb.client.Token;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenResourceApi
 */
@Ignore
public class TokenResourceApiTest {

    private final TokenResourceApi api = new TokenResourceApi();

    /**
     * createToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTokenUsingPOST1Test() throws ApiException {
        Token body = null;
        Token response = api.createTokenUsingPOST1(body);

        // TODO: test validations
    }
    /**
     * deleteToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTokenUsingDELETE1Test() throws ApiException {
        Long id = null;
        api.deleteTokenUsingDELETE1(id);

        // TODO: test validations
    }
    /**
     * getAllTokens
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTokensUsingGETTest() throws ApiException {
        List<Token> response = api.getAllTokensUsingGET();

        // TODO: test validations
    }
    /**
     * getToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenUsingGETTest() throws ApiException {
        Long id = null;
        Token response = api.getTokenUsingGET(id);

        // TODO: test validations
    }
    /**
     * updateToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTokenUsingPUTTest() throws ApiException {
        Token body = null;
        Token response = api.updateTokenUsingPUT(body);

        // TODO: test validations
    }
}
