package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.TokensWebhooks;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenApi
 */
public class TokenApiTest {

    private TokenApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TokenApi.class);
    }


    /**
     * addTokensWebhooksByToken()
     *
     * 
     */
    @Test
    public void addTokensWebhooksByTokenTest() {
        TokensWebhooks body = null;
        String key = null;
        String token2 = null;
        String token = null;
        // Void response = api.addTokensWebhooksByToken(body, key, token2, token);

        // TODO: test validations
    }

    /**
     * deleteTokensByToken()
     *
     * 
     */
    @Test
    public void deleteTokensByTokenTest() {
        String token = null;
        String key = null;
        // Void response = api.deleteTokensByToken(token, key, token);

        // TODO: test validations
    }

    /**
     * deleteTokensWebhooksByTokenByIdWebhook()
     *
     * 
     */
    @Test
    public void deleteTokensWebhooksByTokenByIdWebhookTest() {
        String token = null;
        String idWebhook = null;
        String key = null;
        // Void response = api.deleteTokensWebhooksByTokenByIdWebhook(token, idWebhook, key, token);

        // TODO: test validations
    }

    /**
     * getTokensByToken()
     *
     * 
     */
    @Test
    public void getTokensByTokenTest() {
        String token = null;
        String key = null;
        String fields = null;
        String webhooks = null;
        // Void response = api.getTokensByToken(token, key, token, fields, webhooks);

        // TODO: test validations
    }

    /**
     * getTokensByTokenByField()
     *
     * 
     */
    @Test
    public void getTokensByTokenByFieldTest() {
        String token = null;
        String field = null;
        String key = null;
        // Void response = api.getTokensByTokenByField(token, field, key, token);

        // TODO: test validations
    }

    /**
     * getTokensMemberByToken()
     *
     * 
     */
    @Test
    public void getTokensMemberByTokenTest() {
        String token = null;
        String key = null;
        String fields = null;
        // Void response = api.getTokensMemberByToken(token, key, token, fields);

        // TODO: test validations
    }

    /**
     * getTokensMemberByTokenByField()
     *
     * 
     */
    @Test
    public void getTokensMemberByTokenByFieldTest() {
        String token = null;
        String field = null;
        String key = null;
        // Void response = api.getTokensMemberByTokenByField(token, field, key, token);

        // TODO: test validations
    }

    /**
     * getTokensWebhooksByToken()
     *
     * 
     */
    @Test
    public void getTokensWebhooksByTokenTest() {
        String token = null;
        String key = null;
        // Void response = api.getTokensWebhooksByToken(token, key, token);

        // TODO: test validations
    }

    /**
     * getTokensWebhooksByTokenByIdWebhook()
     *
     * 
     */
    @Test
    public void getTokensWebhooksByTokenByIdWebhookTest() {
        String token = null;
        String idWebhook = null;
        String key = null;
        // Void response = api.getTokensWebhooksByTokenByIdWebhook(token, idWebhook, key, token);

        // TODO: test validations
    }

    /**
     * updateTokensWebhooksByToken()
     *
     * 
     */
    @Test
    public void updateTokensWebhooksByTokenTest() {
        TokensWebhooks body = null;
        String key = null;
        String token2 = null;
        String token = null;
        // Void response = api.updateTokensWebhooksByToken(body, key, token2, token);

        // TODO: test validations
    }
}
