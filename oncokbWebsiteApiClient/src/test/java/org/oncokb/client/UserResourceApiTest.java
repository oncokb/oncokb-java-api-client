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
import org.oncokb.client.ManagedUserVM;
import org.oncokb.client.Token;
import org.oncokb.client.User;
import org.oncokb.client.UserDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserResourceApi
 */
@Ignore
public class UserResourceApiTest {

    private final UserResourceApi api = new UserResourceApi();

    /**
     * createUser
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserUsingPOSTTest() throws ApiException {
        ManagedUserVM body = null;
        User response = api.createUserUsingPOST(body);

        // TODO: test validations
    }
    /**
     * deleteUser
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserUsingDELETETest() throws ApiException {
        String login = null;
        api.deleteUserUsingDELETE(login);

        // TODO: test validations
    }
    /**
     * getAllRegisteredUsers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRegisteredUsersUsingGETTest() throws ApiException {
        Long offset = null;
        Integer page = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        Boolean paged = null;
        Integer size = null;
        List<String> sort = null;
        Boolean sortSorted = null;
        Boolean sortUnsorted = null;
        Boolean unpaged = null;
        List<UserDTO> response = api.getAllRegisteredUsersUsingGET(offset, page, pageNumber, pageSize, paged, size, sort, sortSorted, sortUnsorted, unpaged);

        // TODO: test validations
    }
    /**
     * getAllUsers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUsersUsingGETTest() throws ApiException {
        Long offset = null;
        Integer page = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        Boolean paged = null;
        Integer size = null;
        List<String> sort = null;
        Boolean sortSorted = null;
        Boolean sortUnsorted = null;
        Boolean unpaged = null;
        List<UserDTO> response = api.getAllUsersUsingGET(offset, page, pageNumber, pageSize, paged, size, sort, sortSorted, sortUnsorted, unpaged);

        // TODO: test validations
    }
    /**
     * getAuthorities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthoritiesUsingGETTest() throws ApiException {
        List<String> response = api.getAuthoritiesUsingGET();

        // TODO: test validations
    }
    /**
     * getUserTokens
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTokensUsingGETTest() throws ApiException {
        String login = null;
        List<Token> response = api.getUserTokensUsingGET(login);

        // TODO: test validations
    }
    /**
     * getUser
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserUsingGETTest() throws ApiException {
        String login = null;
        UserDTO response = api.getUserUsingGET(login);

        // TODO: test validations
    }
    /**
     * updateUser
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserUsingPUTTest() throws ApiException {
        UserDTO body = null;
        Boolean sendEmail = null;
        UserDTO response = api.updateUserUsingPUT(body, sendEmail);

        // TODO: test validations
    }
}
