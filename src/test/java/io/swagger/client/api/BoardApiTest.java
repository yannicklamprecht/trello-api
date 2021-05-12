package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Boards;
import io.swagger.client.model.BoardsChecklists;
import io.swagger.client.model.BoardsClosed;
import io.swagger.client.model.BoardsDesc;
import io.swagger.client.model.BoardsIdOrganization;
import io.swagger.client.model.BoardsLabels;
import io.swagger.client.model.BoardsLists;
import io.swagger.client.model.BoardsMembers;
import io.swagger.client.model.BoardsMemberships;
import io.swagger.client.model.BoardsName;
import io.swagger.client.model.BoardsPowerUps;
import io.swagger.client.model.BoardsSubscribed;
import io.swagger.client.model.LabelNamesBlue;
import io.swagger.client.model.LabelNamesGreen;
import io.swagger.client.model.LabelNamesOrange;
import io.swagger.client.model.LabelNamesPurple;
import io.swagger.client.model.LabelNamesRed;
import io.swagger.client.model.LabelNamesYellow;
import io.swagger.client.model.MyPrefsEmailPosition;
import io.swagger.client.model.MyPrefsIdEmailList;
import io.swagger.client.model.MyPrefsShowListGuide;
import io.swagger.client.model.MyPrefsShowSidebar;
import io.swagger.client.model.MyPrefsShowSidebarActivity;
import io.swagger.client.model.MyPrefsShowSidebarBoardActions;
import io.swagger.client.model.MyPrefsShowSidebarMembers;
import io.swagger.client.model.PrefsBackground;
import io.swagger.client.model.PrefsCalendarFeedEnabled;
import io.swagger.client.model.PrefsCardAging;
import io.swagger.client.model.PrefsCardCovers;
import io.swagger.client.model.PrefsComments;
import io.swagger.client.model.PrefsInvitations;
import io.swagger.client.model.PrefsPermissionLevel;
import io.swagger.client.model.PrefsSelfJoin;
import io.swagger.client.model.PrefsVoting;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BoardApi
 */
public class BoardApiTest {

    private BoardApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BoardApi.class);
    }


    /**
     * addBoards()
     *
     * 
     */
    @Test
    public void addBoardsTest() {
        Boards body = null;
        String key = null;
        String token = null;
        // Void response = api.addBoards(body, key, token);

        // TODO: test validations
    }

    /**
     * addBoardsCalendarKeyGenerateByIdBoard()
     *
     * 
     */
    @Test
    public void addBoardsCalendarKeyGenerateByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        // Void response = api.addBoardsCalendarKeyGenerateByIdBoard(idBoard, key, token);

        // TODO: test validations
    }

    /**
     * addBoardsChecklistsByIdBoard()
     *
     * 
     */
    @Test
    public void addBoardsChecklistsByIdBoardTest() {
        BoardsChecklists body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.addBoardsChecklistsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * addBoardsEmailKeyGenerateByIdBoard()
     *
     * 
     */
    @Test
    public void addBoardsEmailKeyGenerateByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        // Void response = api.addBoardsEmailKeyGenerateByIdBoard(idBoard, key, token);

        // TODO: test validations
    }

    /**
     * addBoardsLabelsByIdBoard()
     *
     * 
     */
    @Test
    public void addBoardsLabelsByIdBoardTest() {
        BoardsLabels body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.addBoardsLabelsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * addBoardsListsByIdBoard()
     *
     * 
     */
    @Test
    public void addBoardsListsByIdBoardTest() {
        BoardsLists body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.addBoardsListsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * addBoardsMarkAsViewedByIdBoard()
     *
     * 
     */
    @Test
    public void addBoardsMarkAsViewedByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        // Void response = api.addBoardsMarkAsViewedByIdBoard(idBoard, key, token);

        // TODO: test validations
    }

    /**
     * addBoardsPowerUpsByIdBoard()
     *
     * 
     */
    @Test
    public void addBoardsPowerUpsByIdBoardTest() {
        BoardsPowerUps body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.addBoardsPowerUpsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * deleteBoardsMembersByIdBoardByIdMember()
     *
     * 
     */
    @Test
    public void deleteBoardsMembersByIdBoardByIdMemberTest() {
        String idBoard = null;
        String idMember = null;
        String key = null;
        String token = null;
        // Void response = api.deleteBoardsMembersByIdBoardByIdMember(idBoard, idMember, key, token);

        // TODO: test validations
    }

    /**
     * deleteBoardsPowerUpsByIdBoardByPowerUp()
     *
     * 
     */
    @Test
    public void deleteBoardsPowerUpsByIdBoardByPowerUpTest() {
        String idBoard = null;
        String powerUp = null;
        String key = null;
        String token = null;
        // Void response = api.deleteBoardsPowerUpsByIdBoardByPowerUp(idBoard, powerUp, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsActionsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsActionsByIdBoardTest() {
        String idBoard = null;
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
        // Void response = api.getBoardsActionsByIdBoard(idBoard, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields);

        // TODO: test validations
    }

    /**
     * getBoardsBoardStarsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsBoardStarsByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String filter = null;
        // Void response = api.getBoardsBoardStarsByIdBoard(idBoard, key, token, filter);

        // TODO: test validations
    }

    /**
     * getBoardsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String actions = null;
        String actionsEntities = null;
        String actionsDisplay = null;
        String actionsFormat = null;
        String actionsSince = null;
        String actionsLimit = null;
        String actionFields = null;
        String actionMember = null;
        String actionMemberFields = null;
        String actionMemberCreator = null;
        String actionMemberCreatorFields = null;
        String cards = null;
        String cardFields = null;
        String cardAttachments = null;
        String cardAttachmentFields = null;
        String cardChecklists = null;
        String cardStickers = null;
        String boardStars = null;
        String labels = null;
        String labelFields = null;
        String labelsLimit = null;
        String lists = null;
        String listFields = null;
        String memberships = null;
        String membershipsMember = null;
        String membershipsMemberFields = null;
        String members = null;
        String memberFields = null;
        String membersInvited = null;
        String membersInvitedFields = null;
        String checklists = null;
        String checklistFields = null;
        String organization = null;
        String organizationFields = null;
        String organizationMemberships = null;
        String myPrefs = null;
        String fields = null;
        // Void response = api.getBoardsByIdBoard(idBoard, key, token, actions, actionsEntities, actionsDisplay, actionsFormat, actionsSince, actionsLimit, actionFields, actionMember, actionMemberFields, actionMemberCreator, actionMemberCreatorFields, cards, cardFields, cardAttachments, cardAttachmentFields, cardChecklists, cardStickers, boardStars, labels, labelFields, labelsLimit, lists, listFields, memberships, membershipsMember, membershipsMemberFields, members, memberFields, membersInvited, membersInvitedFields, checklists, checklistFields, organization, organizationFields, organizationMemberships, myPrefs, fields);

        // TODO: test validations
    }

    /**
     * getBoardsByIdBoardByField()
     *
     * 
     */
    @Test
    public void getBoardsByIdBoardByFieldTest() {
        String idBoard = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsByIdBoardByField(idBoard, field, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsCardsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsCardsByIdBoardTest() {
        String idBoard = null;
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
        // Void response = api.getBoardsCardsByIdBoard(idBoard, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields);

        // TODO: test validations
    }

    /**
     * getBoardsCardsByIdBoardByFilter()
     *
     * 
     */
    @Test
    public void getBoardsCardsByIdBoardByFilterTest() {
        String idBoard = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsCardsByIdBoardByFilter(idBoard, filter, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsCardsByIdBoardByIdCard()
     *
     * 
     */
    @Test
    public void getBoardsCardsByIdBoardByIdCardTest() {
        String idBoard = null;
        String idCard = null;
        String key = null;
        String token = null;
        String attachments = null;
        String attachmentFields = null;
        String actions = null;
        String actionsEntities = null;
        String actionsDisplay = null;
        String actionsLimit = null;
        String actionFields = null;
        String actionMemberCreatorFields = null;
        String members = null;
        String memberFields = null;
        String checkItemStates = null;
        String checkItemStateFields = null;
        String labels = null;
        String checklists = null;
        String checklistFields = null;
        String fields = null;
        // Void response = api.getBoardsCardsByIdBoardByIdCard(idBoard, idCard, key, token, attachments, attachmentFields, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, actionMemberCreatorFields, members, memberFields, checkItemStates, checkItemStateFields, labels, checklists, checklistFields, fields);

        // TODO: test validations
    }

    /**
     * getBoardsChecklistsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsChecklistsByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String cards = null;
        String cardFields = null;
        String checkItems = null;
        String checkItemFields = null;
        String filter = null;
        String fields = null;
        // Void response = api.getBoardsChecklistsByIdBoard(idBoard, key, token, cards, cardFields, checkItems, checkItemFields, filter, fields);

        // TODO: test validations
    }

    /**
     * getBoardsDeltasByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsDeltasByIdBoardTest() {
        String idBoard = null;
        String tags = null;
        String ixLastUpdate = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsDeltasByIdBoard(idBoard, tags, ixLastUpdate, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsLabelsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsLabelsByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String fields = null;
        String limit = null;
        // Void response = api.getBoardsLabelsByIdBoard(idBoard, key, token, fields, limit);

        // TODO: test validations
    }

    /**
     * getBoardsLabelsByIdBoardByIdLabel()
     *
     * 
     */
    @Test
    public void getBoardsLabelsByIdBoardByIdLabelTest() {
        String idBoard = null;
        String idLabel = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getBoardsLabelsByIdBoardByIdLabel(idBoard, idLabel, key, token, fields);

        // TODO: test validations
    }

    /**
     * getBoardsListsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsListsByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String cards = null;
        String cardFields = null;
        String filter = null;
        String fields = null;
        // Void response = api.getBoardsListsByIdBoard(idBoard, key, token, cards, cardFields, filter, fields);

        // TODO: test validations
    }

    /**
     * getBoardsListsByIdBoardByFilter()
     *
     * 
     */
    @Test
    public void getBoardsListsByIdBoardByFilterTest() {
        String idBoard = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsListsByIdBoardByFilter(idBoard, filter, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsMembersByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsMembersByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String filter = null;
        String fields = null;
        String activity = null;
        // Void response = api.getBoardsMembersByIdBoard(idBoard, key, token, filter, fields, activity);

        // TODO: test validations
    }

    /**
     * getBoardsMembersByIdBoardByFilter()
     *
     * 
     */
    @Test
    public void getBoardsMembersByIdBoardByFilterTest() {
        String idBoard = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsMembersByIdBoardByFilter(idBoard, filter, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsMembersCardsByIdBoardByIdMember()
     *
     * 
     */
    @Test
    public void getBoardsMembersCardsByIdBoardByIdMemberTest() {
        String idBoard = null;
        String idMember = null;
        String key = null;
        String token = null;
        String actions = null;
        String attachments = null;
        String attachmentFields = null;
        String members = null;
        String memberFields = null;
        String checkItemStates = null;
        String checklists = null;
        String board = null;
        String boardFields = null;
        String list = null;
        String listFields = null;
        String filter = null;
        String fields = null;
        // Void response = api.getBoardsMembersCardsByIdBoardByIdMember(idBoard, idMember, key, token, actions, attachments, attachmentFields, members, memberFields, checkItemStates, checklists, board, boardFields, list, listFields, filter, fields);

        // TODO: test validations
    }

    /**
     * getBoardsMembersInvitedByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsMembersInvitedByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getBoardsMembersInvitedByIdBoard(idBoard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getBoardsMembersInvitedByIdBoardByField()
     *
     * 
     */
    @Test
    public void getBoardsMembersInvitedByIdBoardByFieldTest() {
        String idBoard = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsMembersInvitedByIdBoardByField(idBoard, field, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsMembershipsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsMembershipsByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String filter = null;
        String member = null;
        String memberFields = null;
        // Void response = api.getBoardsMembershipsByIdBoard(idBoard, key, token, filter, member, memberFields);

        // TODO: test validations
    }

    /**
     * getBoardsMembershipsByIdBoardByIdMembership()
     *
     * 
     */
    @Test
    public void getBoardsMembershipsByIdBoardByIdMembershipTest() {
        String idBoard = null;
        String idMembership = null;
        String key = null;
        String token = null;
        String member = null;
        String memberFields = null;
        // Void response = api.getBoardsMembershipsByIdBoardByIdMembership(idBoard, idMembership, key, token, member, memberFields);

        // TODO: test validations
    }

    /**
     * getBoardsMyPrefsByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsMyPrefsByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsMyPrefsByIdBoard(idBoard, key, token);

        // TODO: test validations
    }

    /**
     * getBoardsOrganizationByIdBoard()
     *
     * 
     */
    @Test
    public void getBoardsOrganizationByIdBoardTest() {
        String idBoard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getBoardsOrganizationByIdBoard(idBoard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getBoardsOrganizationByIdBoardByField()
     *
     * 
     */
    @Test
    public void getBoardsOrganizationByIdBoardByFieldTest() {
        String idBoard = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getBoardsOrganizationByIdBoardByField(idBoard, field, key, token);

        // TODO: test validations
    }

    /**
     * updateBoardsByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsByIdBoardTest() {
        Boards body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsClosedByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsClosedByIdBoardTest() {
        BoardsClosed body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsClosedByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsDescByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsDescByIdBoardTest() {
        BoardsDesc body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsDescByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsIdOrganizationByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsIdOrganizationByIdBoardTest() {
        BoardsIdOrganization body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsIdOrganizationByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsLabelNamesBlueByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsLabelNamesBlueByIdBoardTest() {
        LabelNamesBlue body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsLabelNamesBlueByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsLabelNamesGreenByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsLabelNamesGreenByIdBoardTest() {
        LabelNamesGreen body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsLabelNamesGreenByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsLabelNamesOrangeByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsLabelNamesOrangeByIdBoardTest() {
        LabelNamesOrange body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsLabelNamesOrangeByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsLabelNamesPurpleByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsLabelNamesPurpleByIdBoardTest() {
        LabelNamesPurple body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsLabelNamesPurpleByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsLabelNamesRedByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsLabelNamesRedByIdBoardTest() {
        LabelNamesRed body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsLabelNamesRedByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsLabelNamesYellowByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsLabelNamesYellowByIdBoardTest() {
        LabelNamesYellow body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsLabelNamesYellowByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMembersByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMembersByIdBoardTest() {
        BoardsMembers body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMembersByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMembersByIdBoardByIdMember()
     *
     * 
     */
    @Test
    public void updateBoardsMembersByIdBoardByIdMemberTest() {
        BoardsMembers body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        String idMember = null;
        // Void response = api.updateBoardsMembersByIdBoardByIdMember(body, key, token, idBoard, idMember);

        // TODO: test validations
    }

    /**
     * updateBoardsMembershipsByIdBoardByIdMembership()
     *
     * 
     */
    @Test
    public void updateBoardsMembershipsByIdBoardByIdMembershipTest() {
        BoardsMemberships body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        String idMembership = null;
        // Void response = api.updateBoardsMembershipsByIdBoardByIdMembership(body, key, token, idBoard, idMembership);

        // TODO: test validations
    }

    /**
     * updateBoardsMyPrefsEmailPositionByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMyPrefsEmailPositionByIdBoardTest() {
        MyPrefsEmailPosition body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMyPrefsEmailPositionByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMyPrefsIdEmailListByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMyPrefsIdEmailListByIdBoardTest() {
        MyPrefsIdEmailList body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMyPrefsIdEmailListByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMyPrefsShowListGuideByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMyPrefsShowListGuideByIdBoardTest() {
        MyPrefsShowListGuide body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMyPrefsShowListGuideByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMyPrefsShowSidebarActivityByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMyPrefsShowSidebarActivityByIdBoardTest() {
        MyPrefsShowSidebarActivity body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMyPrefsShowSidebarActivityByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMyPrefsShowSidebarBoardActionsByIdBoardTest() {
        MyPrefsShowSidebarBoardActions body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMyPrefsShowSidebarByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMyPrefsShowSidebarByIdBoardTest() {
        MyPrefsShowSidebar body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMyPrefsShowSidebarByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsMyPrefsShowSidebarMembersByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsMyPrefsShowSidebarMembersByIdBoardTest() {
        MyPrefsShowSidebarMembers body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsMyPrefsShowSidebarMembersByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsNameByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsNameByIdBoardTest() {
        BoardsName body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsNameByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsBackgroundByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsBackgroundByIdBoardTest() {
        PrefsBackground body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsBackgroundByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsCalendarFeedEnabledByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsCalendarFeedEnabledByIdBoardTest() {
        PrefsCalendarFeedEnabled body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsCalendarFeedEnabledByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsCardAgingByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsCardAgingByIdBoardTest() {
        PrefsCardAging body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsCardAgingByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsCardCoversByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsCardCoversByIdBoardTest() {
        PrefsCardCovers body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsCardCoversByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsCommentsByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsCommentsByIdBoardTest() {
        PrefsComments body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsCommentsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsInvitationsByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsInvitationsByIdBoardTest() {
        PrefsInvitations body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsInvitationsByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsPermissionLevelByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsPermissionLevelByIdBoardTest() {
        PrefsPermissionLevel body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsPermissionLevelByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsSelfJoinByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsSelfJoinByIdBoardTest() {
        PrefsSelfJoin body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsSelfJoinByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsPrefsVotingByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsPrefsVotingByIdBoardTest() {
        PrefsVoting body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsPrefsVotingByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }

    /**
     * updateBoardsSubscribedByIdBoard()
     *
     * 
     */
    @Test
    public void updateBoardsSubscribedByIdBoardTest() {
        BoardsSubscribed body = null;
        String key = null;
        String token = null;
        String idBoard = null;
        // Void response = api.updateBoardsSubscribedByIdBoard(body, key, token, idBoard);

        // TODO: test validations
    }
}
