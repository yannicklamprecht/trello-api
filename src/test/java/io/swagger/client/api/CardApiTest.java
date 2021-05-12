package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ActionsComments;
import io.swagger.client.model.Cards;
import io.swagger.client.model.CardsActionsComments;
import io.swagger.client.model.CardsAttachments;
import io.swagger.client.model.CardsChecklistCheckItem;
import io.swagger.client.model.CardsChecklistCheckItemName;
import io.swagger.client.model.CardsChecklistCheckItemPos;
import io.swagger.client.model.CardsChecklistCheckItemState;
import io.swagger.client.model.CardsChecklistIdChecklistCurrentCheckItem;
import io.swagger.client.model.CardsChecklists;
import io.swagger.client.model.CardsClosed;
import io.swagger.client.model.CardsDesc;
import io.swagger.client.model.CardsDue;
import io.swagger.client.model.CardsIdAttachmentCover;
import io.swagger.client.model.CardsIdBoard;
import io.swagger.client.model.CardsIdLabels;
import io.swagger.client.model.CardsIdList;
import io.swagger.client.model.CardsIdMembers;
import io.swagger.client.model.CardsLabels;
import io.swagger.client.model.CardsMembersVoted;
import io.swagger.client.model.CardsName;
import io.swagger.client.model.CardsPos;
import io.swagger.client.model.CardsStickers;
import io.swagger.client.model.CardsSubscribed;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardApi
 */
public class CardApiTest {

    private CardApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CardApi.class);
    }


    /**
     * addCards()
     *
     * 
     */
    @Test
    public void addCardsTest() {
        Cards body = null;
        String key = null;
        String token = null;
        // Void response = api.addCards(body, key, token);

        // TODO: test validations
    }

    /**
     * addCardsActionsCommentsByIdCard()
     *
     * 
     */
    @Test
    public void addCardsActionsCommentsByIdCardTest() {
        ActionsComments body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsActionsCommentsByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * addCardsAttachmentsByIdCard()
     *
     * 
     */
    @Test
    public void addCardsAttachmentsByIdCardTest() {
        CardsAttachments body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsAttachmentsByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * addCardsChecklistCheckItemByIdCardByIdChecklist()
     *
     * 
     */
    @Test
    public void addCardsChecklistCheckItemByIdCardByIdChecklistTest() {
        CardsChecklistCheckItem body = null;
        String key = null;
        String token = null;
        String idCard = null;
        String idChecklist = null;
        // Void response = api.addCardsChecklistCheckItemByIdCardByIdChecklist(body, key, token, idCard, idChecklist);

        // TODO: test validations
    }

    /**
     * addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem()
     *
     * 
     */
    @Test
    public void addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItemTest() {
        String idCard = null;
        String idChecklist = null;
        String idCheckItem = null;
        String key = null;
        String token = null;
        // Void response = api.addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem(idCard, idChecklist, idCheckItem, key, token);

        // TODO: test validations
    }

    /**
     * addCardsChecklistsByIdCard()
     *
     * 
     */
    @Test
    public void addCardsChecklistsByIdCardTest() {
        CardsChecklists body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsChecklistsByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * addCardsIdLabelsByIdCard()
     *
     * 
     */
    @Test
    public void addCardsIdLabelsByIdCardTest() {
        CardsIdLabels body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsIdLabelsByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * addCardsIdMembersByIdCard()
     *
     * 
     */
    @Test
    public void addCardsIdMembersByIdCardTest() {
        CardsIdMembers body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsIdMembersByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * addCardsLabelsByIdCard()
     *
     * 
     */
    @Test
    public void addCardsLabelsByIdCardTest() {
        CardsLabels body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsLabelsByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * addCardsMarkAssociatedNotificationsReadByIdCard()
     *
     * 
     */
    @Test
    public void addCardsMarkAssociatedNotificationsReadByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        // Void response = api.addCardsMarkAssociatedNotificationsReadByIdCard(idCard, key, token);

        // TODO: test validations
    }

    /**
     * addCardsMembersVotedByIdCard()
     *
     * 
     */
    @Test
    public void addCardsMembersVotedByIdCardTest() {
        CardsMembersVoted body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsMembersVotedByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * addCardsStickersByIdCard()
     *
     * 
     */
    @Test
    public void addCardsStickersByIdCardTest() {
        CardsStickers body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.addCardsStickersByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * deleteCardsActionsCommentsByIdCardByIdAction()
     *
     * This can only be done by the original author of the comment, or someone with higher permissions than the original author.
     */
    @Test
    public void deleteCardsActionsCommentsByIdCardByIdActionTest() {
        String idCard = null;
        String idAction = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsActionsCommentsByIdCardByIdAction(idCard, idAction, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsAttachmentsByIdCardByIdAttachment()
     *
     * 
     */
    @Test
    public void deleteCardsAttachmentsByIdCardByIdAttachmentTest() {
        String idCard = null;
        String idAttachment = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsAttachmentsByIdCardByIdAttachment(idCard, idAttachment, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsByIdCard()
     *
     * 
     */
    @Test
    public void deleteCardsByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsByIdCard(idCard, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem()
     *
     * 
     */
    @Test
    public void deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItemTest() {
        String idCard = null;
        String idChecklist = null;
        String idCheckItem = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem(idCard, idChecklist, idCheckItem, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsChecklistsByIdCardByIdChecklist()
     *
     * 
     */
    @Test
    public void deleteCardsChecklistsByIdCardByIdChecklistTest() {
        String idCard = null;
        String idChecklist = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsChecklistsByIdCardByIdChecklist(idCard, idChecklist, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsIdLabelsByIdCardByIdLabel()
     *
     * 
     */
    @Test
    public void deleteCardsIdLabelsByIdCardByIdLabelTest() {
        String idCard = null;
        String idLabel = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsIdLabelsByIdCardByIdLabel(idCard, idLabel, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsIdMembersByIdCardByIdMember()
     *
     * 
     */
    @Test
    public void deleteCardsIdMembersByIdCardByIdMemberTest() {
        String idCard = null;
        String idMember = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsIdMembersByIdCardByIdMember(idCard, idMember, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsLabelsByIdCardByColor()
     *
     * 
     */
    @Test
    public void deleteCardsLabelsByIdCardByColorTest() {
        String idCard = null;
        String color = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsLabelsByIdCardByColor(idCard, color, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsMembersVotedByIdCardByIdMember()
     *
     * 
     */
    @Test
    public void deleteCardsMembersVotedByIdCardByIdMemberTest() {
        String idCard = null;
        String idMember = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsMembersVotedByIdCardByIdMember(idCard, idMember, key, token);

        // TODO: test validations
    }

    /**
     * deleteCardsStickersByIdCardByIdSticker()
     *
     * 
     */
    @Test
    public void deleteCardsStickersByIdCardByIdStickerTest() {
        String idCard = null;
        String idSticker = null;
        String key = null;
        String token = null;
        // Void response = api.deleteCardsStickersByIdCardByIdSticker(idCard, idSticker, key, token);

        // TODO: test validations
    }

    /**
     * getCardsActionsByIdCard()
     *
     * 
     */
    @Test
    public void getCardsActionsByIdCardTest() {
        String idCard = null;
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
        // Void response = api.getCardsActionsByIdCard(idCard, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields);

        // TODO: test validations
    }

    /**
     * getCardsAttachmentsByIdCard()
     *
     * 
     */
    @Test
    public void getCardsAttachmentsByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String fields = null;
        String filter = null;
        // Void response = api.getCardsAttachmentsByIdCard(idCard, key, token, fields, filter);

        // TODO: test validations
    }

    /**
     * getCardsAttachmentsByIdCardByIdAttachment()
     *
     * 
     */
    @Test
    public void getCardsAttachmentsByIdCardByIdAttachmentTest() {
        String idCard = null;
        String idAttachment = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsAttachmentsByIdCardByIdAttachment(idCard, idAttachment, key, token, fields);

        // TODO: test validations
    }

    /**
     * getCardsBoardByIdCard()
     *
     * 
     */
    @Test
    public void getCardsBoardByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsBoardByIdCard(idCard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getCardsBoardByIdCardByField()
     *
     * 
     */
    @Test
    public void getCardsBoardByIdCardByFieldTest() {
        String idCard = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getCardsBoardByIdCardByField(idCard, field, key, token);

        // TODO: test validations
    }

    /**
     * getCardsByIdCard()
     *
     * 
     */
    @Test
    public void getCardsByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String actions = null;
        String actionsEntities = null;
        String actionsDisplay = null;
        String actionsLimit = null;
        String actionFields = null;
        String actionMemberCreatorFields = null;
        String attachments = null;
        String attachmentFields = null;
        String members = null;
        String memberFields = null;
        String membersVoted = null;
        String memberVotedFields = null;
        String checkItemStates = null;
        String checkItemStateFields = null;
        String checklists = null;
        String checklistFields = null;
        String board = null;
        String boardFields = null;
        String list = null;
        String listFields = null;
        String stickers = null;
        String stickerFields = null;
        String fields = null;
        // Void response = api.getCardsByIdCard(idCard, key, token, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, actionMemberCreatorFields, attachments, attachmentFields, members, memberFields, membersVoted, memberVotedFields, checkItemStates, checkItemStateFields, checklists, checklistFields, board, boardFields, list, listFields, stickers, stickerFields, fields);

        // TODO: test validations
    }

    /**
     * getCardsByIdCardByField()
     *
     * 
     */
    @Test
    public void getCardsByIdCardByFieldTest() {
        String idCard = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getCardsByIdCardByField(idCard, field, key, token);

        // TODO: test validations
    }

    /**
     * getCardsCheckItemStatesByIdCard()
     *
     * 
     */
    @Test
    public void getCardsCheckItemStatesByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsCheckItemStatesByIdCard(idCard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getCardsChecklistsByIdCard()
     *
     * 
     */
    @Test
    public void getCardsChecklistsByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String cards = null;
        String cardFields = null;
        String checkItems = null;
        String checkItemFields = null;
        String filter = null;
        String fields = null;
        // Void response = api.getCardsChecklistsByIdCard(idCard, key, token, cards, cardFields, checkItems, checkItemFields, filter, fields);

        // TODO: test validations
    }

    /**
     * getCardsListByIdCard()
     *
     * 
     */
    @Test
    public void getCardsListByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsListByIdCard(idCard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getCardsListByIdCardByField()
     *
     * 
     */
    @Test
    public void getCardsListByIdCardByFieldTest() {
        String idCard = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getCardsListByIdCardByField(idCard, field, key, token);

        // TODO: test validations
    }

    /**
     * getCardsMembersByIdCard()
     *
     * 
     */
    @Test
    public void getCardsMembersByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsMembersByIdCard(idCard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getCardsMembersVotedByIdCard()
     *
     * 
     */
    @Test
    public void getCardsMembersVotedByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsMembersVotedByIdCard(idCard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getCardsStickersByIdCard()
     *
     * 
     */
    @Test
    public void getCardsStickersByIdCardTest() {
        String idCard = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsStickersByIdCard(idCard, key, token, fields);

        // TODO: test validations
    }

    /**
     * getCardsStickersByIdCardByIdSticker()
     *
     * 
     */
    @Test
    public void getCardsStickersByIdCardByIdStickerTest() {
        String idCard = null;
        String idSticker = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getCardsStickersByIdCardByIdSticker(idCard, idSticker, key, token, fields);

        // TODO: test validations
    }

    /**
     * updateCardsActionsCommentsByIdCardByIdAction()
     *
     * This can only be done by the original author of the comment.
     */
    @Test
    public void updateCardsActionsCommentsByIdCardByIdActionTest() {
        CardsActionsComments body = null;
        String key = null;
        String token = null;
        String idCard = null;
        String idAction = null;
        // Void response = api.updateCardsActionsCommentsByIdCardByIdAction(body, key, token, idCard, idAction);

        // TODO: test validations
    }

    /**
     * updateCardsByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsByIdCardTest() {
        Cards body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem()
     *
     * 
     */
    @Test
    public void updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItemTest() {
        CardsChecklistIdChecklistCurrentCheckItem body = null;
        String key = null;
        String token = null;
        String idCard = null;
        String idChecklistCurrent = null;
        String idCheckItem = null;
        // Void response = api.updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem(body, key, token, idCard, idChecklistCurrent, idCheckItem);

        // TODO: test validations
    }

    /**
     * updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem()
     *
     * 
     */
    @Test
    public void updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItemTest() {
        CardsChecklistCheckItemName body = null;
        String key = null;
        String token = null;
        String idCard = null;
        String idChecklist = null;
        String idCheckItem = null;
        // Void response = api.updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem);

        // TODO: test validations
    }

    /**
     * updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem()
     *
     * 
     */
    @Test
    public void updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItemTest() {
        CardsChecklistCheckItemPos body = null;
        String key = null;
        String token = null;
        String idCard = null;
        String idChecklist = null;
        String idCheckItem = null;
        // Void response = api.updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem);

        // TODO: test validations
    }

    /**
     * updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem()
     *
     * 
     */
    @Test
    public void updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItemTest() {
        CardsChecklistCheckItemState body = null;
        String key = null;
        String token = null;
        String idCard = null;
        String idChecklist = null;
        String idCheckItem = null;
        // Void response = api.updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem);

        // TODO: test validations
    }

    /**
     * updateCardsClosedByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsClosedByIdCardTest() {
        CardsClosed body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsClosedByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsDescByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsDescByIdCardTest() {
        CardsDesc body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsDescByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsDueByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsDueByIdCardTest() {
        CardsDue body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsDueByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsIdAttachmentCoverByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsIdAttachmentCoverByIdCardTest() {
        CardsIdAttachmentCover body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsIdAttachmentCoverByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsIdBoardByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsIdBoardByIdCardTest() {
        CardsIdBoard body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsIdBoardByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsIdListByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsIdListByIdCardTest() {
        CardsIdList body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsIdListByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsIdMembersByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsIdMembersByIdCardTest() {
        CardsIdMembers body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsIdMembersByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsLabelsByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsLabelsByIdCardTest() {
        CardsLabels body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsLabelsByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsNameByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsNameByIdCardTest() {
        CardsName body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsNameByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsPosByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsPosByIdCardTest() {
        CardsPos body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsPosByIdCard(body, key, token, idCard);

        // TODO: test validations
    }

    /**
     * updateCardsStickersByIdCardByIdSticker()
     *
     * 
     */
    @Test
    public void updateCardsStickersByIdCardByIdStickerTest() {
        CardsStickers body = null;
        String key = null;
        String token = null;
        String idCard = null;
        String idSticker = null;
        // Void response = api.updateCardsStickersByIdCardByIdSticker(body, key, token, idCard, idSticker);

        // TODO: test validations
    }

    /**
     * updateCardsSubscribedByIdCard()
     *
     * 
     */
    @Test
    public void updateCardsSubscribedByIdCardTest() {
        CardsSubscribed body = null;
        String key = null;
        String token = null;
        String idCard = null;
        // Void response = api.updateCardsSubscribedByIdCard(body, key, token, idCard);

        // TODO: test validations
    }
}
