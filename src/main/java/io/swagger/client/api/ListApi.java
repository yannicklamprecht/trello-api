package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Lists;
import io.swagger.client.model.ListsCards;
import io.swagger.client.model.ListsClosed;
import io.swagger.client.model.ListsIdBoard;
import io.swagger.client.model.ListsMoveAllCards;
import io.swagger.client.model.ListsName;
import io.swagger.client.model.ListsPos;
import io.swagger.client.model.ListsSubscribed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ListApi {
  /**
   * addLists()
   * 
   * @param body Attributes of &quot;Lists&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("lists")
  Call<Void> addLists(
                    @retrofit2.http.Body Lists body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addListsArchiveAllCardsByIdList()
   * 
   * @param idList idList (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @POST("lists/{idList}/archiveAllCards")
  Call<Void> addListsArchiveAllCardsByIdList(
            @retrofit2.http.Path("idList") String idList            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addListsCardsByIdList()
   * 
   * @param body Attributes of &quot;Lists Cards&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("lists/{idList}/cards")
  Call<Void> addListsCardsByIdList(
                    @retrofit2.http.Body ListsCards body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

  /**
   * addListsMoveAllCardsByIdList()
   * 
   * @param body Attributes of &quot;Lists Move All Cards&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("lists/{idList}/moveAllCards")
  Call<Void> addListsMoveAllCardsByIdList(
                    @retrofit2.http.Body ListsMoveAllCards body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

  /**
   * getListsActionsByIdList()
   * 
   * @param idList idList (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param entities  true or false (optional)
   * @param display  true or false (optional)
   * @param filter all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional, default to all)
   * @param fields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param limit a number from 0 to 1000 (optional, default to 50)
   * @param format One of: count, list or minimal (optional, default to list)
   * @param since A date, null or lastView (optional)
   * @param before A date, or null (optional)
   * @param page Page * limit must be less than 1000 (optional, default to 0)
   * @param idModels Only return actions related to these model ids (optional)
   * @param member  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param memberCreator  true or false (optional)
   * @param memberCreatorFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @return Call&lt;Void&gt;
   */
  @GET("lists/{idList}/actions")
  Call<Void> getListsActionsByIdList(
            @retrofit2.http.Path("idList") String idList            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("entities") String entities                ,     @retrofit2.http.Query("display") String display                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("format") String format                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("page") String page                ,     @retrofit2.http.Query("idModels") String idModels                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("memberCreator") String memberCreator                ,     @retrofit2.http.Query("memberCreator_fields") String memberCreatorFields                
  );

  /**
   * getListsBoardByIdList()
   * 
   * @param idList idList (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("lists/{idList}/board")
  Call<Void> getListsBoardByIdList(
            @retrofit2.http.Path("idList") String idList            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getListsBoardByIdListByField()
   * 
   * @param idList idList (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("lists/{idList}/board/{field}")
  Call<Void> getListsBoardByIdListByField(
            @retrofit2.http.Path("idList") String idList            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getListsByIdList()
   * 
   * @param idList idList (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param cards One of: all, closed, none or open (optional, default to none)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @param board  true or false (optional)
   * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name, desc, descData, closed, idOrganization, pinned, url and prefs)
   * @param fields all or a comma-separated list of: closed, idBoard, name, pos or subscribed (optional, default to name, closed, idBoard and pos)
   * @return Call&lt;Void&gt;
   */
  @GET("lists/{idList}")
  Call<Void> getListsByIdList(
            @retrofit2.http.Path("idList") String idList            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("cards") String cards                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("board") String board                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getListsByIdListByField()
   * 
   * @param idList idList (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("lists/{idList}/{field}")
  Call<Void> getListsByIdListByField(
            @retrofit2.http.Path("idList") String idList            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getListsCardsByIdList()
   * 
   * @param idList idList (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param attachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @param attachmentFields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to all)
   * @param stickers  true or false (optional)
   * @param members  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param checkItemStates  true or false (optional)
   * @param checklists One of: all or none (optional, default to none)
   * @param limit a number from 1 to 1000 (optional)
   * @param since A date, or null (optional)
   * @param before A date, or null (optional)
   * @param filter One of: all, closed, none or open (optional, default to open)
   * @param fields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("lists/{idList}/cards")
  Call<Void> getListsCardsByIdList(
            @retrofit2.http.Path("idList") String idList            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("stickers") String stickers                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getListsCardsByIdListByFilter()
   * 
   * @param idList idList (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("lists/{idList}/cards/{filter}")
  Call<Void> getListsCardsByIdListByFilter(
            @retrofit2.http.Path("idList") String idList            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * updateListsByIdList()
   * 
   * @param body Attributes of &quot;Lists&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("lists/{idList}")
  Call<Void> updateListsByIdList(
                    @retrofit2.http.Body Lists body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

  /**
   * updateListsClosedByIdList()
   * 
   * @param body Attributes of &quot;Lists Closed&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("lists/{idList}/closed")
  Call<Void> updateListsClosedByIdList(
                    @retrofit2.http.Body ListsClosed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

  /**
   * updateListsIdBoardByIdList()
   * 
   * @param body Attributes of &quot;Lists Id Board&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("lists/{idList}/idBoard")
  Call<Void> updateListsIdBoardByIdList(
                    @retrofit2.http.Body ListsIdBoard body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

  /**
   * updateListsNameByIdList()
   * 
   * @param body Attributes of &quot;Lists Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("lists/{idList}/name")
  Call<Void> updateListsNameByIdList(
                    @retrofit2.http.Body ListsName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

  /**
   * updateListsPosByIdList()
   * 
   * @param body Attributes of &quot;Lists Pos&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("lists/{idList}/pos")
  Call<Void> updateListsPosByIdList(
                    @retrofit2.http.Body ListsPos body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

  /**
   * updateListsSubscribedByIdList()
   * 
   * @param body Attributes of &quot;Lists Subscribed&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idList idList (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("lists/{idList}/subscribed")
  Call<Void> updateListsSubscribedByIdList(
                    @retrofit2.http.Body ListsSubscribed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idList") String idList            
  );

}
