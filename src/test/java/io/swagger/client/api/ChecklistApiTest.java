package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Checklists;
import io.swagger.client.model.ChecklistsCheckItems;
import io.swagger.client.model.ChecklistsIdCard;
import io.swagger.client.model.ChecklistsName;
import io.swagger.client.model.ChecklistsPos;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChecklistApi
 */
public class ChecklistApiTest {

    private ChecklistApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ChecklistApi.class);
    }


    /**
     * addChecklists()
     *
     * 
     */
    @Test
    public void addChecklistsTest() {
        Checklists body = null;
        String key = null;
        String token = null;
        // Void response = api.addChecklists(body, key, token);

        // TODO: test validations
    }

    /**
     * addChecklistsCheckItemsByIdChecklist()
     *
     * 
     */
    @Test
    public void addChecklistsCheckItemsByIdChecklistTest() {
        ChecklistsCheckItems body = null;
        String key = null;
        String token = null;
        String idChecklist = null;
        // Void response = api.addChecklistsCheckItemsByIdChecklist(body, key, token, idChecklist);

        // TODO: test validations
    }

    /**
     * deleteChecklistsByIdChecklist()
     *
     * 
     */
    @Test
    public void deleteChecklistsByIdChecklistTest() {
        String idChecklist = null;
        String key = null;
        String token = null;
        // Void response = api.deleteChecklistsByIdChecklist(idChecklist, key, token);

        // TODO: test validations
    }

    /**
     * deleteChecklistsCheckItemsByIdChecklistByIdCheckItem()
     *
     * 
     */
    @Test
    public void deleteChecklistsCheckItemsByIdChecklistByIdCheckItemTest() {
        String idChecklist = null;
        String idCheckItem = null;
        String key = null;
        String token = null;
        // Void response = api.deleteChecklistsCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem, key, token);

        // TODO: test validations
    }

    /**
     * getChecklistsBoardByIdChecklist()
     *
     * 
     */
    @Test
    public void getChecklistsBoardByIdChecklistTest() {
        String idChecklist = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getChecklistsBoardByIdChecklist(idChecklist, key, token, fields);

        // TODO: test validations
    }

    /**
     * getChecklistsBoardByIdChecklistByField()
     *
     * 
     */
    @Test
    public void getChecklistsBoardByIdChecklistByFieldTest() {
        String idChecklist = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getChecklistsBoardByIdChecklistByField(idChecklist, field, key, token);

        // TODO: test validations
    }

    /**
     * getChecklistsByIdChecklist()
     *
     * 
     */
    @Test
    public void getChecklistsByIdChecklistTest() {
        String idChecklist = null;
        String key = null;
        String token = null;
        String cards = null;
        String cardFields = null;
        String checkItems = null;
        String checkItemFields = null;
        String fields = null;
        // Void response = api.getChecklistsByIdChecklist(idChecklist, key, token, cards, cardFields, checkItems, checkItemFields, fields);

        // TODO: test validations
    }

    /**
     * getChecklistsByIdChecklistByField()
     *
     * 
     */
    @Test
    public void getChecklistsByIdChecklistByFieldTest() {
        String idChecklist = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getChecklistsByIdChecklistByField(idChecklist, field, key, token);

        // TODO: test validations
    }

    /**
     * getChecklistsCardsByIdChecklist()
     *
     * 
     */
    @Test
    public void getChecklistsCardsByIdChecklistTest() {
        String idChecklist = null;
        String key = null;
        String token = null;
        String actions = null;
        String attachments = null;
        String attachmentFields = null;
        String stickers = null;
        String members = null;
        String memberFields = null;
        String checkItemStates = null;
        String checklists = null;
        String limit = null;
        String since = null;
        String before = null;
        String filter = null;
        String fields = null;
        // Void response = api.getChecklistsCardsByIdChecklist(idChecklist, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields);

        // TODO: test validations
    }

    /**
     * getChecklistsCardsByIdChecklistByFilter()
     *
     * 
     */
    @Test
    public void getChecklistsCardsByIdChecklistByFilterTest() {
        String idChecklist = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getChecklistsCardsByIdChecklistByFilter(idChecklist, filter, key, token);

        // TODO: test validations
    }

    /**
     * getChecklistsCheckItemsByIdChecklist()
     *
     * 
     */
    @Test
    public void getChecklistsCheckItemsByIdChecklistTest() {
        String idChecklist = null;
        String key = null;
        String token = null;
        String filter = null;
        String fields = null;
        // Void response = api.getChecklistsCheckItemsByIdChecklist(idChecklist, key, token, filter, fields);

        // TODO: test validations
    }

    /**
     * getChecklistsCheckItemsByIdChecklistByIdCheckItem()
     *
     * 
     */
    @Test
    public void getChecklistsCheckItemsByIdChecklistByIdCheckItemTest() {
        String idChecklist = null;
        String idCheckItem = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getChecklistsCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem, key, token, fields);

        // TODO: test validations
    }

    /**
     * updateChecklistsByIdChecklist()
     *
     * 
     */
    @Test
    public void updateChecklistsByIdChecklistTest() {
        Checklists body = null;
        String key = null;
        String token = null;
        String idChecklist = null;
        // Void response = api.updateChecklistsByIdChecklist(body, key, token, idChecklist);

        // TODO: test validations
    }

    /**
     * updateChecklistsIdCardByIdChecklist()
     *
     * 
     */
    @Test
    public void updateChecklistsIdCardByIdChecklistTest() {
        ChecklistsIdCard body = null;
        String key = null;
        String token = null;
        String idChecklist = null;
        // Void response = api.updateChecklistsIdCardByIdChecklist(body, key, token, idChecklist);

        // TODO: test validations
    }

    /**
     * updateChecklistsNameByIdChecklist()
     *
     * 
     */
    @Test
    public void updateChecklistsNameByIdChecklistTest() {
        ChecklistsName body = null;
        String key = null;
        String token = null;
        String idChecklist = null;
        // Void response = api.updateChecklistsNameByIdChecklist(body, key, token, idChecklist);

        // TODO: test validations
    }

    /**
     * updateChecklistsPosByIdChecklist()
     *
     * 
     */
    @Test
    public void updateChecklistsPosByIdChecklistTest() {
        ChecklistsPos body = null;
        String key = null;
        String token = null;
        String idChecklist = null;
        // Void response = api.updateChecklistsPosByIdChecklist(body, key, token, idChecklist);

        // TODO: test validations
    }
}
