package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Lists;
import io.swagger.client.model.ListsCards;
import io.swagger.client.model.ListsClosed;
import io.swagger.client.model.ListsIdBoard;
import io.swagger.client.model.ListsMoveAllCards;
import io.swagger.client.model.ListsName;
import io.swagger.client.model.ListsPos;
import io.swagger.client.model.ListsSubscribed;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListApi
 */
public class ListApiTest {

    private ListApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ListApi.class);
    }


    /**
     * addLists()
     *
     * 
     */
    @Test
    public void addListsTest() {
        Lists body = null;
        String key = null;
        String token = null;
        // Void response = api.addLists(body, key, token);

        // TODO: test validations
    }

    /**
     * addListsArchiveAllCardsByIdList()
     *
     * 
     */
    @Test
    public void addListsArchiveAllCardsByIdListTest() {
        String idList = null;
        String key = null;
        String token = null;
        // Void response = api.addListsArchiveAllCardsByIdList(idList, key, token);

        // TODO: test validations
    }

    /**
     * addListsCardsByIdList()
     *
     * 
     */
    @Test
    public void addListsCardsByIdListTest() {
        ListsCards body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.addListsCardsByIdList(body, key, token, idList);

        // TODO: test validations
    }

    /**
     * addListsMoveAllCardsByIdList()
     *
     * 
     */
    @Test
    public void addListsMoveAllCardsByIdListTest() {
        ListsMoveAllCards body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.addListsMoveAllCardsByIdList(body, key, token, idList);

        // TODO: test validations
    }

    /**
     * getListsActionsByIdList()
     *
     * 
     */
    @Test
    public void getListsActionsByIdListTest() {
        String idList = null;
        String key = null;
        String token = null;
        String entities = null;
        String display = null;
        String filter = null;
        String fields = null;
        String limit = null;
        String format = null;
        String since = null;
        String before = null;
        String page = null;
        String idModels = null;
        String member = null;
        String memberFields = null;
        String memberCreator = null;
        String memberCreatorFields = null;
        // Void response = api.getListsActionsByIdList(idList, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields);

        // TODO: test validations
    }

    /**
     * getListsBoardByIdList()
     *
     * 
     */
    @Test
    public void getListsBoardByIdListTest() {
        String idList = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getListsBoardByIdList(idList, key, token, fields);

        // TODO: test validations
    }

    /**
     * getListsBoardByIdListByField()
     *
     * 
     */
    @Test
    public void getListsBoardByIdListByFieldTest() {
        String idList = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getListsBoardByIdListByField(idList, field, key, token);

        // TODO: test validations
    }

    /**
     * getListsByIdList()
     *
     * 
     */
    @Test
    public void getListsByIdListTest() {
        String idList = null;
        String key = null;
        String token = null;
        String cards = null;
        String cardFields = null;
        String board = null;
        String boardFields = null;
        String fields = null;
        // Void response = api.getListsByIdList(idList, key, token, cards, cardFields, board, boardFields, fields);

        // TODO: test validations
    }

    /**
     * getListsByIdListByField()
     *
     * 
     */
    @Test
    public void getListsByIdListByFieldTest() {
        String idList = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getListsByIdListByField(idList, field, key, token);

        // TODO: test validations
    }

    /**
     * getListsCardsByIdList()
     *
     * 
     */
    @Test
    public void getListsCardsByIdListTest() {
        String idList = null;
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
        // Void response = api.getListsCardsByIdList(idList, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields);

        // TODO: test validations
    }

    /**
     * getListsCardsByIdListByFilter()
     *
     * 
     */
    @Test
    public void getListsCardsByIdListByFilterTest() {
        String idList = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getListsCardsByIdListByFilter(idList, filter, key, token);

        // TODO: test validations
    }

    /**
     * updateListsByIdList()
     *
     * 
     */
    @Test
    public void updateListsByIdListTest() {
        Lists body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.updateListsByIdList(body, key, token, idList);

        // TODO: test validations
    }

    /**
     * updateListsClosedByIdList()
     *
     * 
     */
    @Test
    public void updateListsClosedByIdListTest() {
        ListsClosed body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.updateListsClosedByIdList(body, key, token, idList);

        // TODO: test validations
    }

    /**
     * updateListsIdBoardByIdList()
     *
     * 
     */
    @Test
    public void updateListsIdBoardByIdListTest() {
        ListsIdBoard body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.updateListsIdBoardByIdList(body, key, token, idList);

        // TODO: test validations
    }

    /**
     * updateListsNameByIdList()
     *
     * 
     */
    @Test
    public void updateListsNameByIdListTest() {
        ListsName body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.updateListsNameByIdList(body, key, token, idList);

        // TODO: test validations
    }

    /**
     * updateListsPosByIdList()
     *
     * 
     */
    @Test
    public void updateListsPosByIdListTest() {
        ListsPos body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.updateListsPosByIdList(body, key, token, idList);

        // TODO: test validations
    }

    /**
     * updateListsSubscribedByIdList()
     *
     * 
     */
    @Test
    public void updateListsSubscribedByIdListTest() {
        ListsSubscribed body = null;
        String key = null;
        String token = null;
        String idList = null;
        // Void response = api.updateListsSubscribedByIdList(body, key, token, idList);

        // TODO: test validations
    }
}
