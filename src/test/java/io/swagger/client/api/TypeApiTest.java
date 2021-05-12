package io.swagger.client.api;

import io.swagger.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TypeApi
 */
public class TypeApiTest {

    private TypeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TypeApi.class);
    }


    /**
     * getTypesById()
     *
     * 
     */
    @Test
    public void getTypesByIdTest() {
        String id = null;
        String key = null;
        String token = null;
        // Void response = api.getTypesById(id, key, token);

        // TODO: test validations
    }
}
