package io.swagger.client.api;

import io.swagger.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchApi.class);
    }


    /**
     * getSearch()
     *
     * 
     */
    @Test
    public void getSearchTest() {
        String query = null;
        String idOrganizations = null;
        String key = null;
        String token = null;
        String idBoards = null;
        String idCards = null;
        String modelTypes = null;
        String boardFields = null;
        String boardsLimit = null;
        String cardFields = null;
        String cardsLimit = null;
        String cardsPage = null;
        String cardBoard = null;
        String cardList = null;
        String cardMembers = null;
        String cardStickers = null;
        String cardAttachments = null;
        String organizationFields = null;
        String organizationsLimit = null;
        String memberFields = null;
        String membersLimit = null;
        String partial = null;
        // Void response = api.getSearch(query, idOrganizations, key, token, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial);

        // TODO: test validations
    }

    /**
     * getSearchMembers()
     *
     * 
     */
    @Test
    public void getSearchMembersTest() {
        String query = null;
        String key = null;
        String token = null;
        String limit = null;
        String idBoard = null;
        String idOrganization = null;
        String onlyOrgMembers = null;
        // Void response = api.getSearchMembers(query, key, token, limit, idBoard, idOrganization, onlyOrgMembers);

        // TODO: test validations
    }
}
