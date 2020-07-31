/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClassificationApi
 */
@Ignore
public class ClassificationApiTest {

    private final ClassificationApi api = new ClassificationApi();

    
    /**
     * classificationVariantsGet
     *
     * Get All OncoKB Variant Classification.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void classificationVariantsGetUsingGETTest() throws ApiException {
        List<String> response = api.classificationVariantsGetUsingGET();

        // TODO: test validations
    }
    
}
