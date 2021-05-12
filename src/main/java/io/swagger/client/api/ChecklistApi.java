package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Checklists;
import io.swagger.client.model.ChecklistsCheckItems;
import io.swagger.client.model.ChecklistsIdCard;
import io.swagger.client.model.ChecklistsName;
import io.swagger.client.model.ChecklistsPos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ChecklistApi {
  /**
   * addChecklists()
   * 
   * @param body Attributes of &quot;Checklists&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("checklists")
  Call<Void> addChecklists(
                    @retrofit2.http.Body Checklists body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addChecklistsCheckItemsByIdChecklist()
   * 
   * @param body Attributes of &quot;Checklists Check Items&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idChecklist idChecklist (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("checklists/{idChecklist}/checkItems")
  Call<Void> addChecklistsCheckItemsByIdChecklist(
                    @retrofit2.http.Body ChecklistsCheckItems body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idChecklist") String idChecklist            
  );

  /**
   * deleteChecklistsByIdChecklist()
   * 
   * @param idChecklist idChecklist (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("checklists/{idChecklist}")
  Call<Void> deleteChecklistsByIdChecklist(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteChecklistsCheckItemsByIdChecklistByIdCheckItem()
   * 
   * @param idChecklist idChecklist (required)
   * @param idCheckItem idCheckItem (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("checklists/{idChecklist}/checkItems/{idCheckItem}")
  Call<Void> deleteChecklistsCheckItemsByIdChecklistByIdCheckItem(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getChecklistsBoardByIdChecklist()
   * 
   * @param idChecklist idChecklist (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("checklists/{idChecklist}/board")
  Call<Void> getChecklistsBoardByIdChecklist(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getChecklistsBoardByIdChecklistByField()
   * 
   * @param idChecklist idChecklist (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("checklists/{idChecklist}/board/{field}")
  Call<Void> getChecklistsBoardByIdChecklistByField(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getChecklistsByIdChecklist()
   * 
   * @param idChecklist idChecklist (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param cards One of: all, closed, none, open or visible (optional, default to none)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @param checkItems One of: all or none (optional, default to all)
   * @param checkItemFields all or a comma-separated list of: name, nameData, pos, state or type (optional, default to name, nameData, pos and state)
   * @param fields all or a comma-separated list of: idBoard, idCard, name or pos (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("checklists/{idChecklist}")
  Call<Void> getChecklistsByIdChecklist(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("cards") String cards                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("checkItems") String checkItems                ,     @retrofit2.http.Query("checkItem_fields") String checkItemFields                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getChecklistsByIdChecklistByField()
   * 
   * @param idChecklist idChecklist (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("checklists/{idChecklist}/{field}")
  Call<Void> getChecklistsByIdChecklistByField(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getChecklistsCardsByIdChecklist()
   * 
   * @param idChecklist idChecklist (required)
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
  @GET("checklists/{idChecklist}/cards")
  Call<Void> getChecklistsCardsByIdChecklist(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("stickers") String stickers                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getChecklistsCardsByIdChecklistByFilter()
   * 
   * @param idChecklist idChecklist (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("checklists/{idChecklist}/cards/{filter}")
  Call<Void> getChecklistsCardsByIdChecklistByFilter(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getChecklistsCheckItemsByIdChecklist()
   * 
   * @param idChecklist idChecklist (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: all or none (optional, default to all)
   * @param fields all or a comma-separated list of: name, nameData, pos, state or type (optional, default to name, nameData, pos and state)
   * @return Call&lt;Void&gt;
   */
  @GET("checklists/{idChecklist}/checkItems")
  Call<Void> getChecklistsCheckItemsByIdChecklist(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getChecklistsCheckItemsByIdChecklistByIdCheckItem()
   * 
   * @param idChecklist idChecklist (required)
   * @param idCheckItem idCheckItem (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: name, nameData, pos, state or type (optional, default to name, nameData, pos and state)
   * @return Call&lt;Void&gt;
   */
  @GET("checklists/{idChecklist}/checkItems/{idCheckItem}")
  Call<Void> getChecklistsCheckItemsByIdChecklistByIdCheckItem(
            @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * updateChecklistsByIdChecklist()
   * 
   * @param body Attributes of &quot;Checklists&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idChecklist idChecklist (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("checklists/{idChecklist}")
  Call<Void> updateChecklistsByIdChecklist(
                    @retrofit2.http.Body Checklists body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idChecklist") String idChecklist            
  );

  /**
   * updateChecklistsIdCardByIdChecklist()
   * 
   * @param body Attributes of &quot;Checklists Id Card&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idChecklist idChecklist (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("checklists/{idChecklist}/idCard")
  Call<Void> updateChecklistsIdCardByIdChecklist(
                    @retrofit2.http.Body ChecklistsIdCard body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idChecklist") String idChecklist            
  );

  /**
   * updateChecklistsNameByIdChecklist()
   * 
   * @param body Attributes of &quot;Checklists Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idChecklist idChecklist (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("checklists/{idChecklist}/name")
  Call<Void> updateChecklistsNameByIdChecklist(
                    @retrofit2.http.Body ChecklistsName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idChecklist") String idChecklist            
  );

  /**
   * updateChecklistsPosByIdChecklist()
   * 
   * @param body Attributes of &quot;Checklists Pos&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idChecklist idChecklist (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("checklists/{idChecklist}/pos")
  Call<Void> updateChecklistsPosByIdChecklist(
                    @retrofit2.http.Body ChecklistsPos body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idChecklist") String idChecklist            
  );

}
