package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Members;
import io.swagger.client.model.MembersAvatar;
import io.swagger.client.model.MembersAvatarSource;
import io.swagger.client.model.MembersBio;
import io.swagger.client.model.MembersBoardBackgrounds;
import io.swagger.client.model.MembersBoardStars;
import io.swagger.client.model.MembersBoardStarsIdBoard;
import io.swagger.client.model.MembersBoardStarsPos;
import io.swagger.client.model.MembersCustomBoardBackgrounds;
import io.swagger.client.model.MembersCustomEmoji;
import io.swagger.client.model.MembersCustomStickers;
import io.swagger.client.model.MembersFullName;
import io.swagger.client.model.MembersInitials;
import io.swagger.client.model.MembersOneTimeMessagesDismissed;
import io.swagger.client.model.MembersSavedSearches;
import io.swagger.client.model.MembersSavedSearchesName;
import io.swagger.client.model.MembersSavedSearchesPos;
import io.swagger.client.model.MembersSavedSearchesQuery;
import io.swagger.client.model.MembersUsername;
import io.swagger.client.model.PrefsColorBlind;
import io.swagger.client.model.PrefsLocale;
import io.swagger.client.model.PrefsMinutesBetweenSummaries;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MemberApi
 */
public class MemberApiTest {

    private MemberApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MemberApi.class);
    }


    /**
     * addMembersAvatarByIdMember()
     *
     * 
     */
    @Test
    public void addMembersAvatarByIdMemberTest() {
        MembersAvatar body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersAvatarByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * addMembersBoardBackgroundsByIdMember()
     *
     * 
     */
    @Test
    public void addMembersBoardBackgroundsByIdMemberTest() {
        MembersBoardBackgrounds body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersBoardBackgroundsByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * addMembersBoardStarsByIdMember()
     *
     * 
     */
    @Test
    public void addMembersBoardStarsByIdMemberTest() {
        MembersBoardStars body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersBoardStarsByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * addMembersCustomBoardBackgroundsByIdMember()
     *
     * 
     */
    @Test
    public void addMembersCustomBoardBackgroundsByIdMemberTest() {
        MembersCustomBoardBackgrounds body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersCustomBoardBackgroundsByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * addMembersCustomEmojiByIdMember()
     *
     * 
     */
    @Test
    public void addMembersCustomEmojiByIdMemberTest() {
        MembersCustomEmoji body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersCustomEmojiByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * addMembersCustomStickersByIdMember()
     *
     * 
     */
    @Test
    public void addMembersCustomStickersByIdMemberTest() {
        MembersCustomStickers body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersCustomStickersByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * addMembersOneTimeMessagesDismissedByIdMember()
     *
     * 
     */
    @Test
    public void addMembersOneTimeMessagesDismissedByIdMemberTest() {
        MembersOneTimeMessagesDismissed body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersOneTimeMessagesDismissedByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * addMembersSavedSearchesByIdMember()
     *
     * 
     */
    @Test
    public void addMembersSavedSearchesByIdMemberTest() {
        MembersSavedSearches body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.addMembersSavedSearchesByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * deleteMembersBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * 
     */
    @Test
    public void deleteMembersBoardBackgroundsByIdMemberByIdBoardBackgroundTest() {
        String idMember = null;
        String idBoardBackground = null;
        String key = null;
        String token = null;
        // Void response = api.deleteMembersBoardBackgroundsByIdMemberByIdBoardBackground(idMember, idBoardBackground, key, token);

        // TODO: test validations
    }

    /**
     * deleteMembersBoardStarsByIdMemberByIdBoardStar()
     *
     * 
     */
    @Test
    public void deleteMembersBoardStarsByIdMemberByIdBoardStarTest() {
        String idMember = null;
        String idBoardStar = null;
        String key = null;
        String token = null;
        // Void response = api.deleteMembersBoardStarsByIdMemberByIdBoardStar(idMember, idBoardStar, key, token);

        // TODO: test validations
    }

    /**
     * deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * 
     */
    @Test
    public void deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackgroundTest() {
        String idMember = null;
        String idBoardBackground = null;
        String key = null;
        String token = null;
        // Void response = api.deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground(idMember, idBoardBackground, key, token);

        // TODO: test validations
    }

    /**
     * deleteMembersCustomStickersByIdMemberByIdCustomSticker()
     *
     * 
     */
    @Test
    public void deleteMembersCustomStickersByIdMemberByIdCustomStickerTest() {
        String idMember = null;
        String idCustomSticker = null;
        String key = null;
        String token = null;
        // Void response = api.deleteMembersCustomStickersByIdMemberByIdCustomSticker(idMember, idCustomSticker, key, token);

        // TODO: test validations
    }

    /**
     * deleteMembersSavedSearchesByIdMemberByIdSavedSearch()
     *
     * 
     */
    @Test
    public void deleteMembersSavedSearchesByIdMemberByIdSavedSearchTest() {
        String idMember = null;
        String idSavedSearch = null;
        String key = null;
        String token = null;
        // Void response = api.deleteMembersSavedSearchesByIdMemberByIdSavedSearch(idMember, idSavedSearch, key, token);

        // TODO: test validations
    }

    /**
     * getMembersActionsByIdMember()
     *
     * 
     */
    @Test
    public void getMembersActionsByIdMemberTest() {
        String idMember = null;
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
        // Void response = api.getMembersActionsByIdMember(idMember, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields);

        // TODO: test validations
    }

    /**
     * getMembersBoardBackgroundsByIdMember()
     *
     * 
     */
    @Test
    public void getMembersBoardBackgroundsByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String filter = null;
        // Void response = api.getMembersBoardBackgroundsByIdMember(idMember, key, token, filter);

        // TODO: test validations
    }

    /**
     * getMembersBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * 
     */
    @Test
    public void getMembersBoardBackgroundsByIdMemberByIdBoardBackgroundTest() {
        String idMember = null;
        String idBoardBackground = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getMembersBoardBackgroundsByIdMemberByIdBoardBackground(idMember, idBoardBackground, key, token, fields);

        // TODO: test validations
    }

    /**
     * getMembersBoardStarsByIdMember()
     *
     * 
     */
    @Test
    public void getMembersBoardStarsByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersBoardStarsByIdMember(idMember, key, token);

        // TODO: test validations
    }

    /**
     * getMembersBoardStarsByIdMemberByIdBoardStar()
     *
     * 
     */
    @Test
    public void getMembersBoardStarsByIdMemberByIdBoardStarTest() {
        String idMember = null;
        String idBoardStar = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersBoardStarsByIdMemberByIdBoardStar(idMember, idBoardStar, key, token);

        // TODO: test validations
    }

    /**
     * getMembersBoardsByIdMember()
     *
     * 
     */
    @Test
    public void getMembersBoardsByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String filter = null;
        String fields = null;
        String actions = null;
        String actionsEntities = null;
        String actionsLimit = null;
        String actionsFormat = null;
        String actionsSince = null;
        String actionFields = null;
        String memberships = null;
        String organization = null;
        String organizationFields = null;
        String lists = null;
        // Void response = api.getMembersBoardsByIdMember(idMember, key, token, filter, fields, actions, actionsEntities, actionsLimit, actionsFormat, actionsSince, actionFields, memberships, organization, organizationFields, lists);

        // TODO: test validations
    }

    /**
     * getMembersBoardsByIdMemberByFilter()
     *
     * 
     */
    @Test
    public void getMembersBoardsByIdMemberByFilterTest() {
        String idMember = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersBoardsByIdMemberByFilter(idMember, filter, key, token);

        // TODO: test validations
    }

    /**
     * getMembersBoardsInvitedByIdMember()
     *
     * 
     */
    @Test
    public void getMembersBoardsInvitedByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getMembersBoardsInvitedByIdMember(idMember, key, token, fields);

        // TODO: test validations
    }

    /**
     * getMembersBoardsInvitedByIdMemberByField()
     *
     * 
     */
    @Test
    public void getMembersBoardsInvitedByIdMemberByFieldTest() {
        String idMember = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersBoardsInvitedByIdMemberByField(idMember, field, key, token);

        // TODO: test validations
    }

    /**
     * getMembersByIdMember()
     *
     * If you specify &#x27;me&#x27; as the username, this call will respond as if you had supplied the username associated with the supplied token
     */
    @Test
    public void getMembersByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String actions = null;
        String actionsEntities = null;
        String actionsDisplay = null;
        String actionsLimit = null;
        String actionFields = null;
        String actionSince = null;
        String actionBefore = null;
        String cards = null;
        String cardFields = null;
        String cardMembers = null;
        String cardMemberFields = null;
        String cardAttachments = null;
        String cardAttachmentFields = null;
        String cardStickers = null;
        String boards = null;
        String boardFields = null;
        String boardActions = null;
        String boardActionsEntities = null;
        String boardActionsDisplay = null;
        String boardActionsFormat = null;
        String boardActionsSince = null;
        String boardActionsLimit = null;
        String boardActionFields = null;
        String boardLists = null;
        String boardMemberships = null;
        String boardOrganization = null;
        String boardOrganizationFields = null;
        String boardsInvited = null;
        String boardsInvitedFields = null;
        String boardStars = null;
        String savedSearches = null;
        String organizations = null;
        String organizationFields = null;
        String organizationPaidAccount = null;
        String organizationsInvited = null;
        String organizationsInvitedFields = null;
        String notifications = null;
        String notificationsEntities = null;
        String notificationsDisplay = null;
        String notificationsLimit = null;
        String notificationFields = null;
        String notificationMemberCreator = null;
        String notificationMemberCreatorFields = null;
        String notificationBefore = null;
        String notificationSince = null;
        String tokens = null;
        String paidAccount = null;
        String boardBackgrounds = null;
        String customBoardBackgrounds = null;
        String customStickers = null;
        String customEmoji = null;
        String fields = null;
        // Void response = api.getMembersByIdMember(idMember, key, token, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, actionSince, actionBefore, cards, cardFields, cardMembers, cardMemberFields, cardAttachments, cardAttachmentFields, cardStickers, boards, boardFields, boardActions, boardActionsEntities, boardActionsDisplay, boardActionsFormat, boardActionsSince, boardActionsLimit, boardActionFields, boardLists, boardMemberships, boardOrganization, boardOrganizationFields, boardsInvited, boardsInvitedFields, boardStars, savedSearches, organizations, organizationFields, organizationPaidAccount, organizationsInvited, organizationsInvitedFields, notifications, notificationsEntities, notificationsDisplay, notificationsLimit, notificationFields, notificationMemberCreator, notificationMemberCreatorFields, notificationBefore, notificationSince, tokens, paidAccount, boardBackgrounds, customBoardBackgrounds, customStickers, customEmoji, fields);

        // TODO: test validations
    }

    /**
     * getMembersByIdMemberByField()
     *
     * 
     */
    @Test
    public void getMembersByIdMemberByFieldTest() {
        String idMember = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersByIdMemberByField(idMember, field, key, token);

        // TODO: test validations
    }

    /**
     * getMembersCardsByIdMember()
     *
     * 
     */
    @Test
    public void getMembersCardsByIdMemberTest() {
        String idMember = null;
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
        // Void response = api.getMembersCardsByIdMember(idMember, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields);

        // TODO: test validations
    }

    /**
     * getMembersCardsByIdMemberByFilter()
     *
     * 
     */
    @Test
    public void getMembersCardsByIdMemberByFilterTest() {
        String idMember = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersCardsByIdMemberByFilter(idMember, filter, key, token);

        // TODO: test validations
    }

    /**
     * getMembersCustomBoardBackgroundsByIdMember()
     *
     * 
     */
    @Test
    public void getMembersCustomBoardBackgroundsByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String filter = null;
        // Void response = api.getMembersCustomBoardBackgroundsByIdMember(idMember, key, token, filter);

        // TODO: test validations
    }

    /**
     * getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * 
     */
    @Test
    public void getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackgroundTest() {
        String idMember = null;
        String idBoardBackground = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground(idMember, idBoardBackground, key, token, fields);

        // TODO: test validations
    }

    /**
     * getMembersCustomEmojiByIdMember()
     *
     * This gets the list of all of the user’s uploaded emoji
     */
    @Test
    public void getMembersCustomEmojiByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String filter = null;
        // Void response = api.getMembersCustomEmojiByIdMember(idMember, key, token, filter);

        // TODO: test validations
    }

    /**
     * getMembersCustomEmojiByIdMemberByIdCustomEmoji()
     *
     * 
     */
    @Test
    public void getMembersCustomEmojiByIdMemberByIdCustomEmojiTest() {
        String idMember = null;
        String idCustomEmoji = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getMembersCustomEmojiByIdMemberByIdCustomEmoji(idMember, idCustomEmoji, key, token, fields);

        // TODO: test validations
    }

    /**
     * getMembersCustomStickersByIdMember()
     *
     * This gets a list of all of the user’s uploaded stickers
     */
    @Test
    public void getMembersCustomStickersByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String filter = null;
        // Void response = api.getMembersCustomStickersByIdMember(idMember, key, token, filter);

        // TODO: test validations
    }

    /**
     * getMembersCustomStickersByIdMemberByIdCustomSticker()
     *
     * 
     */
    @Test
    public void getMembersCustomStickersByIdMemberByIdCustomStickerTest() {
        String idMember = null;
        String idCustomSticker = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getMembersCustomStickersByIdMemberByIdCustomSticker(idMember, idCustomSticker, key, token, fields);

        // TODO: test validations
    }

    /**
     * getMembersDeltasByIdMember()
     *
     * 
     */
    @Test
    public void getMembersDeltasByIdMemberTest() {
        String idMember = null;
        String tags = null;
        String ixLastUpdate = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersDeltasByIdMember(idMember, tags, ixLastUpdate, key, token);

        // TODO: test validations
    }

    /**
     * getMembersNotificationsByIdMember()
     *
     * You can only read the notifications for the member associated with the supplied token
     */
    @Test
    public void getMembersNotificationsByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String entities = null;
        String display = null;
        String filter = null;
        String readFilter = null;
        String fields = null;
        String limit = null;
        String page = null;
        String before = null;
        String since = null;
        String memberCreator = null;
        String memberCreatorFields = null;
        // Void response = api.getMembersNotificationsByIdMember(idMember, key, token, entities, display, filter, readFilter, fields, limit, page, before, since, memberCreator, memberCreatorFields);

        // TODO: test validations
    }

    /**
     * getMembersNotificationsByIdMemberByFilter()
     *
     * 
     */
    @Test
    public void getMembersNotificationsByIdMemberByFilterTest() {
        String idMember = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersNotificationsByIdMemberByFilter(idMember, filter, key, token);

        // TODO: test validations
    }

    /**
     * getMembersOrganizationsByIdMember()
     *
     * 
     */
    @Test
    public void getMembersOrganizationsByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String filter = null;
        String fields = null;
        String paidAccount = null;
        // Void response = api.getMembersOrganizationsByIdMember(idMember, key, token, filter, fields, paidAccount);

        // TODO: test validations
    }

    /**
     * getMembersOrganizationsByIdMemberByFilter()
     *
     * 
     */
    @Test
    public void getMembersOrganizationsByIdMemberByFilterTest() {
        String idMember = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersOrganizationsByIdMemberByFilter(idMember, filter, key, token);

        // TODO: test validations
    }

    /**
     * getMembersOrganizationsInvitedByIdMember()
     *
     * 
     */
    @Test
    public void getMembersOrganizationsInvitedByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getMembersOrganizationsInvitedByIdMember(idMember, key, token, fields);

        // TODO: test validations
    }

    /**
     * getMembersOrganizationsInvitedByIdMemberByField()
     *
     * 
     */
    @Test
    public void getMembersOrganizationsInvitedByIdMemberByFieldTest() {
        String idMember = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersOrganizationsInvitedByIdMemberByField(idMember, field, key, token);

        // TODO: test validations
    }

    /**
     * getMembersSavedSearchesByIdMember()
     *
     * 
     */
    @Test
    public void getMembersSavedSearchesByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersSavedSearchesByIdMember(idMember, key, token);

        // TODO: test validations
    }

    /**
     * getMembersSavedSearchesByIdMemberByIdSavedSearch()
     *
     * 
     */
    @Test
    public void getMembersSavedSearchesByIdMemberByIdSavedSearchTest() {
        String idMember = null;
        String idSavedSearch = null;
        String key = null;
        String token = null;
        // Void response = api.getMembersSavedSearchesByIdMemberByIdSavedSearch(idMember, idSavedSearch, key, token);

        // TODO: test validations
    }

    /**
     * getMembersTokensByIdMember()
     *
     * 
     */
    @Test
    public void getMembersTokensByIdMemberTest() {
        String idMember = null;
        String key = null;
        String token = null;
        String filter = null;
        // Void response = api.getMembersTokensByIdMember(idMember, key, token, filter);

        // TODO: test validations
    }

    /**
     * updateMembersAvatarSourceByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersAvatarSourceByIdMemberTest() {
        MembersAvatarSource body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersAvatarSourceByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersBioByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersBioByIdMemberTest() {
        MembersBio body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersBioByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * 
     */
    @Test
    public void updateMembersBoardBackgroundsByIdMemberByIdBoardBackgroundTest() {
        MembersBoardBackgrounds body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idBoardBackground = null;
        // Void response = api.updateMembersBoardBackgroundsByIdMemberByIdBoardBackground(body, key, token, idMember, idBoardBackground);

        // TODO: test validations
    }

    /**
     * updateMembersBoardStarsByIdMemberByIdBoardStar()
     *
     * 
     */
    @Test
    public void updateMembersBoardStarsByIdMemberByIdBoardStarTest() {
        MembersBoardStars body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idBoardStar = null;
        // Void response = api.updateMembersBoardStarsByIdMemberByIdBoardStar(body, key, token, idMember, idBoardStar);

        // TODO: test validations
    }

    /**
     * updateMembersBoardStarsIdBoardByIdMemberByIdBoardStar()
     *
     * 
     */
    @Test
    public void updateMembersBoardStarsIdBoardByIdMemberByIdBoardStarTest() {
        MembersBoardStarsIdBoard body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idBoardStar = null;
        // Void response = api.updateMembersBoardStarsIdBoardByIdMemberByIdBoardStar(body, key, token, idMember, idBoardStar);

        // TODO: test validations
    }

    /**
     * updateMembersBoardStarsPosByIdMemberByIdBoardStar()
     *
     * 
     */
    @Test
    public void updateMembersBoardStarsPosByIdMemberByIdBoardStarTest() {
        MembersBoardStarsPos body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idBoardStar = null;
        // Void response = api.updateMembersBoardStarsPosByIdMemberByIdBoardStar(body, key, token, idMember, idBoardStar);

        // TODO: test validations
    }

    /**
     * updateMembersByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersByIdMemberTest() {
        Members body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * 
     */
    @Test
    public void updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackgroundTest() {
        MembersCustomBoardBackgrounds body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idBoardBackground = null;
        // Void response = api.updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground(body, key, token, idMember, idBoardBackground);

        // TODO: test validations
    }

    /**
     * updateMembersFullNameByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersFullNameByIdMemberTest() {
        MembersFullName body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersFullNameByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersInitialsByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersInitialsByIdMemberTest() {
        MembersInitials body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersInitialsByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersPrefsColorBlindByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersPrefsColorBlindByIdMemberTest() {
        PrefsColorBlind body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersPrefsColorBlindByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersPrefsLocaleByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersPrefsLocaleByIdMemberTest() {
        PrefsLocale body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersPrefsLocaleByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersPrefsMinutesBetweenSummariesByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersPrefsMinutesBetweenSummariesByIdMemberTest() {
        PrefsMinutesBetweenSummaries body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersPrefsMinutesBetweenSummariesByIdMember(body, key, token, idMember);

        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesByIdMemberByIdSavedSearch()
     *
     * 
     */
    @Test
    public void updateMembersSavedSearchesByIdMemberByIdSavedSearchTest() {
        MembersSavedSearches body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idSavedSearch = null;
        // Void response = api.updateMembersSavedSearchesByIdMemberByIdSavedSearch(body, key, token, idMember, idSavedSearch);

        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesNameByIdMemberByIdSavedSearch()
     *
     * 
     */
    @Test
    public void updateMembersSavedSearchesNameByIdMemberByIdSavedSearchTest() {
        MembersSavedSearchesName body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idSavedSearch = null;
        // Void response = api.updateMembersSavedSearchesNameByIdMemberByIdSavedSearch(body, key, token, idMember, idSavedSearch);

        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesPosByIdMemberByIdSavedSearch()
     *
     * 
     */
    @Test
    public void updateMembersSavedSearchesPosByIdMemberByIdSavedSearchTest() {
        MembersSavedSearchesPos body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idSavedSearch = null;
        // Void response = api.updateMembersSavedSearchesPosByIdMemberByIdSavedSearch(body, key, token, idMember, idSavedSearch);

        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesQueryByIdMemberByIdSavedSearch()
     *
     * 
     */
    @Test
    public void updateMembersSavedSearchesQueryByIdMemberByIdSavedSearchTest() {
        MembersSavedSearchesQuery body = null;
        String key = null;
        String token = null;
        String idMember = null;
        String idSavedSearch = null;
        // Void response = api.updateMembersSavedSearchesQueryByIdMemberByIdSavedSearch(body, key, token, idMember, idSavedSearch);

        // TODO: test validations
    }

    /**
     * updateMembersUsernameByIdMember()
     *
     * 
     */
    @Test
    public void updateMembersUsernameByIdMemberTest() {
        MembersUsername body = null;
        String key = null;
        String token = null;
        String idMember = null;
        // Void response = api.updateMembersUsernameByIdMember(body, key, token, idMember);

        // TODO: test validations
    }
}
