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
import org.oncokb.oncokb_transcript.client.UserVM;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountResourceApi
 */
@Ignore
public class AccountResourceApiTest {

    private final AccountResourceApi api = new AccountResourceApi();

    /**
     * getAccount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountUsingGETTest() throws ApiException {
        UserVM response = api.getAccountUsingGET();

        // TODO: test validations
    }
}