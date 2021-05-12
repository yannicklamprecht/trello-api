package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Labels;
import io.swagger.client.model.LabelsColor;
import io.swagger.client.model.LabelsName;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LabelApi
 */
public class LabelApiTest {

    private LabelApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LabelApi.class);
    }


    /**
     * addLabels()
     *
     * 
     */
    @Test
    public void addLabelsTest() {
        Labels body = null;
        String key = null;
        String token = null;
        // Void response = api.addLabels(body, key, token);

        // TODO: test validations
    }

    /**
     * deleteLabelsByIdLabel()
     *
     * 
     */
    @Test
    public void deleteLabelsByIdLabelTest() {
        String idLabel = null;
        String key = null;
        String token = null;
        // Void response = api.deleteLabelsByIdLabel(idLabel, key, token);

        // TODO: test validations
    }

    /**
     * getLabelsBoardByIdLabel()
     *
     * 
     */
    @Test
    public void getLabelsBoardByIdLabelTest() {
        String idLabel = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getLabelsBoardByIdLabel(idLabel, key, token, fields);

        // TODO: test validations
    }

    /**
     * getLabelsBoardByIdLabelByField()
     *
     * 
     */
    @Test
    public void getLabelsBoardByIdLabelByFieldTest() {
        String idLabel = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getLabelsBoardByIdLabelByField(idLabel, field, key, token);

        // TODO: test validations
    }

    /**
     * getLabelsByIdLabel()
     *
     * 
     */
    @Test
    public void getLabelsByIdLabelTest() {
        String idLabel = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getLabelsByIdLabel(idLabel, key, token, fields);

        // TODO: test validations
    }

    /**
     * updateLabelsByIdLabel()
     *
     * 
     */
    @Test
    public void updateLabelsByIdLabelTest() {
        Labels body = null;
        String key = null;
        String token = null;
        String idLabel = null;
        // Void response = api.updateLabelsByIdLabel(body, key, token, idLabel);

        // TODO: test validations
    }

    /**
     * updateLabelsColorByIdLabel()
     *
     * 
     */
    @Test
    public void updateLabelsColorByIdLabelTest() {
        LabelsColor body = null;
        String key = null;
        String token = null;
        String idLabel = null;
        // Void response = api.updateLabelsColorByIdLabel(body, key, token, idLabel);

        // TODO: test validations
    }

    /**
     * updateLabelsNameByIdLabel()
     *
     * 
     */
    @Test
    public void updateLabelsNameByIdLabelTest() {
        LabelsName body = null;
        String key = null;
        String token = null;
        String idLabel = null;
        // Void response = api.updateLabelsNameByIdLabel(body, key, token, idLabel);

        // TODO: test validations
    }
}
