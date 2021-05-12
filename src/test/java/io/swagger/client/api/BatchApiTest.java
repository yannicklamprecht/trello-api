package io.swagger.client.api;

import io.swagger.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchApi
 */
public class BatchApiTest {

    private BatchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BatchApi.class);
    }


    /**
     * getBatch()
     *
     * 
     */
    @Test
    public void getBatchTest() {
        String urls = null;
        String key = null;
        String token = null;
        // Void response = api.getBatch(urls, key, token);

        // TODO: test validations
    }
}
