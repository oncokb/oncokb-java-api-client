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

import org.oncokb.oncokb_transcript.client.Drug;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DrugControllerApi
 */
@Ignore
public class DrugControllerApiTest {

    private final DrugControllerApi api = new DrugControllerApi();

    /**
     * findDrugByCode
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findDrugByCodeUsingGETTest() throws Exception {
        String code = null;
        Drug response = api.findDrugByCodeUsingGET(code);

        // TODO: test validations
    }
    /**
     * findDrugs
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findDrugsUsingGETTest() throws Exception {
        String query = null;
        List<Drug> response = api.findDrugsUsingGET(query);

        // TODO: test validations
    }
}