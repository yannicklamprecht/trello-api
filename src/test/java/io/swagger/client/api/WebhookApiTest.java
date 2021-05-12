package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Webhooks;
import io.swagger.client.model.WebhooksActive;
import io.swagger.client.model.WebhooksCallbackURL;
import io.swagger.client.model.WebhooksDescription;
import io.swagger.client.model.WebhooksIdModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookApi
 */
public class WebhookApiTest {

    private WebhookApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WebhookApi.class);
    }


    /**
     * addWebhooks()
     *
     * 
     */
    @Test
    public void addWebhooksTest() {
        Webhooks body = null;
        String key = null;
        String token = null;
        // Void response = api.addWebhooks(body, key, token);

        // TODO: test validations
    }

    /**
     * deleteWebhooksByIdWebhook()
     *
     * 
     */
    @Test
    public void deleteWebhooksByIdWebhookTest() {
        String idWebhook = null;
        String key = null;
        String token = null;
        // Void response = api.deleteWebhooksByIdWebhook(idWebhook, key, token);

        // TODO: test validations
    }

    /**
     * getWebhooksByIdWebhook()
     *
     * 
     */
    @Test
    public void getWebhooksByIdWebhookTest() {
        String idWebhook = null;
        String key = null;
        String token = null;
        // Void response = api.getWebhooksByIdWebhook(idWebhook, key, token);

        // TODO: test validations
    }

    /**
     * getWebhooksByIdWebhookByField()
     *
     * 
     */
    @Test
    public void getWebhooksByIdWebhookByFieldTest() {
        String idWebhook = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getWebhooksByIdWebhookByField(idWebhook, field, key, token);

        // TODO: test validations
    }

    /**
     * updateWebhooks()
     *
     * 
     */
    @Test
    public void updateWebhooksTest() {
        Webhooks body = null;
        String key = null;
        String token = null;
        // Void response = api.updateWebhooks(body, key, token);

        // TODO: test validations
    }

    /**
     * updateWebhooksActiveByIdWebhook()
     *
     * 
     */
    @Test
    public void updateWebhooksActiveByIdWebhookTest() {
        WebhooksActive body = null;
        String key = null;
        String token = null;
        String idWebhook = null;
        // Void response = api.updateWebhooksActiveByIdWebhook(body, key, token, idWebhook);

        // TODO: test validations
    }

    /**
     * updateWebhooksByIdWebhook()
     *
     * 
     */
    @Test
    public void updateWebhooksByIdWebhookTest() {
        Webhooks body = null;
        String key = null;
        String token = null;
        String idWebhook = null;
        // Void response = api.updateWebhooksByIdWebhook(body, key, token, idWebhook);

        // TODO: test validations
    }

    /**
     * updateWebhooksCallbackURLByIdWebhook()
     *
     * 
     */
    @Test
    public void updateWebhooksCallbackURLByIdWebhookTest() {
        WebhooksCallbackURL body = null;
        String key = null;
        String token = null;
        String idWebhook = null;
        // Void response = api.updateWebhooksCallbackURLByIdWebhook(body, key, token, idWebhook);

        // TODO: test validations
    }

    /**
     * updateWebhooksDescriptionByIdWebhook()
     *
     * 
     */
    @Test
    public void updateWebhooksDescriptionByIdWebhookTest() {
        WebhooksDescription body = null;
        String key = null;
        String token = null;
        String idWebhook = null;
        // Void response = api.updateWebhooksDescriptionByIdWebhook(body, key, token, idWebhook);

        // TODO: test validations
    }

    /**
     * updateWebhooksIdModelByIdWebhook()
     *
     * 
     */
    @Test
    public void updateWebhooksIdModelByIdWebhookTest() {
        WebhooksIdModel body = null;
        String key = null;
        String token = null;
        String idWebhook = null;
        // Void response = api.updateWebhooksIdModelByIdWebhook(body, key, token, idWebhook);

        // TODO: test validations
    }
}
