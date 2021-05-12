package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Sessions;
import io.swagger.client.model.SessionsStatus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SessionApi
 */
public class SessionApiTest {

    private SessionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SessionApi.class);
    }


    /**
     * addSessions()
     *
     * 
     */
    @Test
    public void addSessionsTest() {
        Sessions body = null;
        String key = null;
        String token = null;
        // Void response = api.addSessions(body, key, token);

        // TODO: test validations
    }

    /**
     * getSessionsSocket()
     *
     * This is the route for WebSocket requests.  See the socket API reference for a description of WebSocket usage.
     */
    @Test
    public void getSessionsSocketTest() {
        String key = null;
        String token = null;
        // Void response = api.getSessionsSocket(key, token);

        // TODO: test validations
    }

    /**
     * updateSessionsByIdSession()
     *
     * 
     */
    @Test
    public void updateSessionsByIdSessionTest() {
        Sessions body = null;
        String key = null;
        String token = null;
        String idSession = null;
        // Void response = api.updateSessionsByIdSession(body, key, token, idSession);

        // TODO: test validations
    }

    /**
     * updateSessionsStatusByIdSession()
     *
     * 
     */
    @Test
    public void updateSessionsStatusByIdSessionTest() {
        SessionsStatus body = null;
        String key = null;
        String token = null;
        String idSession = null;
        // Void response = api.updateSessionsStatusByIdSession(body, key, token, idSession);

        // TODO: test validations
    }
}
