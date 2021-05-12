package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BoardApi {
  /**
   * addBoards()
   * 
   * @param body Attributes of &quot;Boards&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("boards")
  Call<Void> addBoards(
                    @retrofit2.http.Body Boards body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addBoardsCalendarKeyGenerateByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @POST("boards/{idBoard}/calendarKey/generate")
  Call<Void> addBoardsCalendarKeyGenerateByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addBoardsChecklistsByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Checklists&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("boards/{idBoard}/checklists")
  Call<Void> addBoardsChecklistsByIdBoard(
                    @retrofit2.http.Body BoardsChecklists body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * addBoardsEmailKeyGenerateByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @POST("boards/{idBoard}/emailKey/generate")
  Call<Void> addBoardsEmailKeyGenerateByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addBoardsLabelsByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Labels&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("boards/{idBoard}/labels")
  Call<Void> addBoardsLabelsByIdBoard(
                    @retrofit2.http.Body BoardsLabels body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * addBoardsListsByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Lists&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("boards/{idBoard}/lists")
  Call<Void> addBoardsListsByIdBoard(
                    @retrofit2.http.Body BoardsLists body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * addBoardsMarkAsViewedByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @POST("boards/{idBoard}/markAsViewed")
  Call<Void> addBoardsMarkAsViewedByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addBoardsPowerUpsByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Power Ups&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("boards/{idBoard}/powerUps")
  Call<Void> addBoardsPowerUpsByIdBoard(
                    @retrofit2.http.Body BoardsPowerUps body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * deleteBoardsMembersByIdBoardByIdMember()
   * 
   * @param idBoard board_id (required)
   * @param idMember idMember (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("boards/{idBoard}/members/{idMember}")
  Call<Void> deleteBoardsMembersByIdBoardByIdMember(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteBoardsPowerUpsByIdBoardByPowerUp()
   * 
   * @param idBoard board_id (required)
   * @param powerUp powerUp (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("boards/{idBoard}/powerUps/{powerUp}")
  Call<Void> deleteBoardsPowerUpsByIdBoardByPowerUp(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("powerUp") String powerUp            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsActionsByIdBoard()
   * 
   * @param idBoard board_id (required)
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
  @GET("boards/{idBoard}/actions")
  Call<Void> getBoardsActionsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("entities") String entities                ,     @retrofit2.http.Query("display") String display                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("format") String format                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("page") String page                ,     @retrofit2.http.Query("idModels") String idModels                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("memberCreator") String memberCreator                ,     @retrofit2.http.Query("memberCreator_fields") String memberCreatorFields                
  );

  /**
   * getBoardsBoardStarsByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: mine or none (optional, default to mine)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/boardStars")
  Call<Void> getBoardsBoardStarsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                
  );

  /**
   * getBoardsByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param actionsEntities  true or false (optional)
   * @param actionsDisplay  true or false (optional)
   * @param actionsFormat One of: count, list or minimal (optional, default to list)
   * @param actionsSince A date, null or lastView (optional)
   * @param actionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param actionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param actionMember  true or false (optional)
   * @param actionMemberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param actionMemberCreator  true or false (optional)
   * @param actionMemberCreatorFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param cards One of: all, closed, none, open or visible (optional, default to none)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @param cardAttachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @param cardAttachmentFields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to all)
   * @param cardChecklists One of: all or none (optional, default to none)
   * @param cardStickers  true or false (optional)
   * @param boardStars One of: mine or none (optional, default to none)
   * @param labels One of: all or none (optional, default to none)
   * @param labelFields all or a comma-separated list of: color, idBoard, name or uses (optional, default to all)
   * @param labelsLimit a number from 0 to 1000 (optional, default to 50)
   * @param lists One of: all, closed, none or open (optional, default to none)
   * @param listFields all or a comma-separated list of: closed, idBoard, name, pos or subscribed (optional, default to all)
   * @param memberships all or a comma-separated list of: active, admin, deactivated, me or normal (optional, default to none)
   * @param membershipsMember  true or false (optional)
   * @param membershipsMemberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @param members One of: admins, all, none, normal or owners (optional, default to none)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, initials, fullName, username and confirmed)
   * @param membersInvited One of: admins, all, none, normal or owners (optional, default to none)
   * @param membersInvitedFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, initials, fullName and username)
   * @param checklists One of: all or none (optional, default to none)
   * @param checklistFields all or a comma-separated list of: idBoard, idCard, name or pos (optional, default to all)
   * @param organization  true or false (optional)
   * @param organizationFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to name and displayName)
   * @param organizationMemberships all or a comma-separated list of: active, admin, deactivated, me or normal (optional, default to none)
   * @param myPrefs  true or false (optional)
   * @param fields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name, desc, descData, closed, idOrganization, pinned, url, shortUrl, prefs and labelNames)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}")
  Call<Void> getBoardsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("actions_entities") String actionsEntities                ,     @retrofit2.http.Query("actions_display") String actionsDisplay                ,     @retrofit2.http.Query("actions_format") String actionsFormat                ,     @retrofit2.http.Query("actions_since") String actionsSince                ,     @retrofit2.http.Query("actions_limit") String actionsLimit                ,     @retrofit2.http.Query("action_fields") String actionFields                ,     @retrofit2.http.Query("action_member") String actionMember                ,     @retrofit2.http.Query("action_member_fields") String actionMemberFields                ,     @retrofit2.http.Query("action_memberCreator") String actionMemberCreator                ,     @retrofit2.http.Query("action_memberCreator_fields") String actionMemberCreatorFields                ,     @retrofit2.http.Query("cards") String cards                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("card_attachments") String cardAttachments                ,     @retrofit2.http.Query("card_attachment_fields") String cardAttachmentFields                ,     @retrofit2.http.Query("card_checklists") String cardChecklists                ,     @retrofit2.http.Query("card_stickers") String cardStickers                ,     @retrofit2.http.Query("boardStars") String boardStars                ,     @retrofit2.http.Query("labels") String labels                ,     @retrofit2.http.Query("label_fields") String labelFields                ,     @retrofit2.http.Query("labels_limit") String labelsLimit                ,     @retrofit2.http.Query("lists") String lists                ,     @retrofit2.http.Query("list_fields") String listFields                ,     @retrofit2.http.Query("memberships") String memberships                ,     @retrofit2.http.Query("memberships_member") String membershipsMember                ,     @retrofit2.http.Query("memberships_member_fields") String membershipsMemberFields                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("membersInvited") String membersInvited                ,     @retrofit2.http.Query("membersInvited_fields") String membersInvitedFields                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("checklist_fields") String checklistFields                ,     @retrofit2.http.Query("organization") String organization                ,     @retrofit2.http.Query("organization_fields") String organizationFields                ,     @retrofit2.http.Query("organization_memberships") String organizationMemberships                ,     @retrofit2.http.Query("myPrefs") String myPrefs                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsByIdBoardByField()
   * 
   * @param idBoard board_id (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/{field}")
  Call<Void> getBoardsByIdBoardByField(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsCardsByIdBoard()
   * 
   * @param idBoard board_id (required)
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
   * @param filter One of: all, closed, none, open or visible (optional, default to visible)
   * @param fields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/cards")
  Call<Void> getBoardsCardsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("stickers") String stickers                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsCardsByIdBoardByFilter()
   * 
   * @param idBoard board_id (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/cards/{filter}")
  Call<Void> getBoardsCardsByIdBoardByFilter(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsCardsByIdBoardByIdCard()
   * 
   * @param idBoard board_id (required)
   * @param idCard idCard (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param attachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @param attachmentFields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to all)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param actionsEntities  true or false (optional)
   * @param actionsDisplay  true or false (optional)
   * @param actionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param actionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param actionMemberCreatorFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param members  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, initials, fullName and username)
   * @param checkItemStates  true or false (optional)
   * @param checkItemStateFields all or a comma-separated list of: idCheckItem or state (optional, default to all)
   * @param labels  true or false (optional)
   * @param checklists One of: all or none (optional, default to none)
   * @param checklistFields all or a comma-separated list of: idBoard, idCard, name or pos (optional, default to all)
   * @param fields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/cards/{idCard}")
  Call<Void> getBoardsCardsByIdBoardByIdCard(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("actions_entities") String actionsEntities                ,     @retrofit2.http.Query("actions_display") String actionsDisplay                ,     @retrofit2.http.Query("actions_limit") String actionsLimit                ,     @retrofit2.http.Query("action_fields") String actionFields                ,     @retrofit2.http.Query("action_memberCreator_fields") String actionMemberCreatorFields                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checkItemState_fields") String checkItemStateFields                ,     @retrofit2.http.Query("labels") String labels                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("checklist_fields") String checklistFields                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsChecklistsByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param cards One of: all, closed, none, open or visible (optional, default to none)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @param checkItems One of: all or none (optional, default to all)
   * @param checkItemFields all or a comma-separated list of: name, nameData, pos, state or type (optional, default to name, nameData, pos and state)
   * @param filter One of: all or none (optional, default to all)
   * @param fields all or a comma-separated list of: idBoard, idCard, name or pos (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/checklists")
  Call<Void> getBoardsChecklistsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("cards") String cards                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("checkItems") String checkItems                ,     @retrofit2.http.Query("checkItem_fields") String checkItemFields                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsDeltasByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param tags A valid tag for subscribing (required)
   * @param ixLastUpdate a number from -1 to Infinity (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/deltas")
  Call<Void> getBoardsDeltasByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("tags") String tags                ,     @retrofit2.http.Query("ixLastUpdate") String ixLastUpdate                ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsLabelsByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: color, idBoard, name or uses (optional, default to all)
   * @param limit a number from 0 to 1000 (optional, default to 50)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/labels")
  Call<Void> getBoardsLabelsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("limit") String limit                
  );

  /**
   * getBoardsLabelsByIdBoardByIdLabel()
   * 
   * @param idBoard board_id (required)
   * @param idLabel idLabel (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: color, idBoard, name or uses (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/labels/{idLabel}")
  Call<Void> getBoardsLabelsByIdBoardByIdLabel(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("idLabel") String idLabel            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsListsByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param cards One of: all, closed, none, open or visible (optional, default to none)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @param filter One of: all, closed, none or open (optional, default to open)
   * @param fields all or a comma-separated list of: closed, idBoard, name, pos or subscribed (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/lists")
  Call<Void> getBoardsListsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("cards") String cards                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsListsByIdBoardByFilter()
   * 
   * @param idBoard board_id (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/lists/{filter}")
  Call<Void> getBoardsListsByIdBoardByFilter(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsMembersByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: admins, all, none, normal or owners (optional, default to all)
   * @param fields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @param activity true or false ; works for premium organizations only. (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/members")
  Call<Void> getBoardsMembersByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("activity") String activity                
  );

  /**
   * getBoardsMembersByIdBoardByFilter()
   * 
   * @param idBoard board_id (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/members/{filter}")
  Call<Void> getBoardsMembersByIdBoardByFilter(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsMembersCardsByIdBoardByIdMember()
   * 
   * @param idBoard board_id (required)
   * @param idMember idMember (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param attachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @param attachmentFields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to all)
   * @param members  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param checkItemStates  true or false (optional)
   * @param checklists One of: all or none (optional, default to none)
   * @param board  true or false (optional)
   * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name, desc, closed, idOrganization, pinned, url and prefs)
   * @param list  true or false (optional)
   * @param listFields all or a comma-separated list of: closed, idBoard, name, pos or subscribed (optional, default to all)
   * @param filter One of: all, closed, none, open or visible (optional, default to visible)
   * @param fields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/members/{idMember}/cards")
  Call<Void> getBoardsMembersCardsByIdBoardByIdMember(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("board") String board                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("list") String list                ,     @retrofit2.http.Query("list_fields") String listFields                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsMembersInvitedByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/membersInvited")
  Call<Void> getBoardsMembersInvitedByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsMembersInvitedByIdBoardByField()
   * 
   * @param idBoard board_id (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/membersInvited/{field}")
  Call<Void> getBoardsMembersInvitedByIdBoardByField(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsMembershipsByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter all or a comma-separated list of: active, admin, deactivated, me or normal (optional, default to all)
   * @param member  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/memberships")
  Call<Void> getBoardsMembershipsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                
  );

  /**
   * getBoardsMembershipsByIdBoardByIdMembership()
   * 
   * @param idBoard board_id (required)
   * @param idMembership idMembership (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param member  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/memberships/{idMembership}")
  Call<Void> getBoardsMembershipsByIdBoardByIdMembership(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("idMembership") String idMembership            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                
  );

  /**
   * getBoardsMyPrefsByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/myPrefs")
  Call<Void> getBoardsMyPrefsByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getBoardsOrganizationByIdBoard()
   * 
   * @param idBoard board_id (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/organization")
  Call<Void> getBoardsOrganizationByIdBoard(
            @retrofit2.http.Path("idBoard") String idBoard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getBoardsOrganizationByIdBoardByField()
   * 
   * @param idBoard board_id (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("boards/{idBoard}/organization/{field}")
  Call<Void> getBoardsOrganizationByIdBoardByField(
            @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * updateBoardsByIdBoard()
   * 
   * @param body Attributes of &quot;Boards&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}")
  Call<Void> updateBoardsByIdBoard(
                    @retrofit2.http.Body Boards body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsClosedByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Closed&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/closed")
  Call<Void> updateBoardsClosedByIdBoard(
                    @retrofit2.http.Body BoardsClosed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsDescByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Desc&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/desc")
  Call<Void> updateBoardsDescByIdBoard(
                    @retrofit2.http.Body BoardsDesc body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsIdOrganizationByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Id Organization&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/idOrganization")
  Call<Void> updateBoardsIdOrganizationByIdBoard(
                    @retrofit2.http.Body BoardsIdOrganization body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsLabelNamesBlueByIdBoard()
   * 
   * @param body Attributes of &quot;Label Names Blue&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/labelNames/blue")
  Call<Void> updateBoardsLabelNamesBlueByIdBoard(
                    @retrofit2.http.Body LabelNamesBlue body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsLabelNamesGreenByIdBoard()
   * 
   * @param body Attributes of &quot;Label Names Green&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/labelNames/green")
  Call<Void> updateBoardsLabelNamesGreenByIdBoard(
                    @retrofit2.http.Body LabelNamesGreen body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsLabelNamesOrangeByIdBoard()
   * 
   * @param body Attributes of &quot;Label Names Orange&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/labelNames/orange")
  Call<Void> updateBoardsLabelNamesOrangeByIdBoard(
                    @retrofit2.http.Body LabelNamesOrange body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsLabelNamesPurpleByIdBoard()
   * 
   * @param body Attributes of &quot;Label Names Purple&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/labelNames/purple")
  Call<Void> updateBoardsLabelNamesPurpleByIdBoard(
                    @retrofit2.http.Body LabelNamesPurple body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsLabelNamesRedByIdBoard()
   * 
   * @param body Attributes of &quot;Label Names Red&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/labelNames/red")
  Call<Void> updateBoardsLabelNamesRedByIdBoard(
                    @retrofit2.http.Body LabelNamesRed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsLabelNamesYellowByIdBoard()
   * 
   * @param body Attributes of &quot;Label Names Yellow&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/labelNames/yellow")
  Call<Void> updateBoardsLabelNamesYellowByIdBoard(
                    @retrofit2.http.Body LabelNamesYellow body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMembersByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Members&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/members")
  Call<Void> updateBoardsMembersByIdBoard(
                    @retrofit2.http.Body BoardsMembers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMembersByIdBoardByIdMember()
   * 
   * @param body Attributes of &quot;Boards Members&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @param idMember idMember (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/members/{idMember}")
  Call<Void> updateBoardsMembersByIdBoardByIdMember(
                    @retrofit2.http.Body BoardsMembers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateBoardsMembershipsByIdBoardByIdMembership()
   * 
   * @param body Attributes of &quot;Boards Memberships&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @param idMembership idMembership (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/memberships/{idMembership}")
  Call<Void> updateBoardsMembershipsByIdBoardByIdMembership(
                    @retrofit2.http.Body BoardsMemberships body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            ,         @retrofit2.http.Path("idMembership") String idMembership            
  );

  /**
   * updateBoardsMyPrefsEmailPositionByIdBoard()
   * 
   * @param body Attributes of &quot;My Prefs Email Position&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/myPrefs/emailPosition")
  Call<Void> updateBoardsMyPrefsEmailPositionByIdBoard(
                    @retrofit2.http.Body MyPrefsEmailPosition body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMyPrefsIdEmailListByIdBoard()
   * 
   * @param body Attributes of &quot;My Prefs Id Email List&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/myPrefs/idEmailList")
  Call<Void> updateBoardsMyPrefsIdEmailListByIdBoard(
                    @retrofit2.http.Body MyPrefsIdEmailList body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMyPrefsShowListGuideByIdBoard()
   * 
   * @param body Attributes of &quot;My Prefs Show List Guide&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/myPrefs/showListGuide")
  Call<Void> updateBoardsMyPrefsShowListGuideByIdBoard(
                    @retrofit2.http.Body MyPrefsShowListGuide body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMyPrefsShowSidebarActivityByIdBoard()
   * 
   * @param body Attributes of &quot;My Prefs Show Sidebar Activity&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/myPrefs/showSidebarActivity")
  Call<Void> updateBoardsMyPrefsShowSidebarActivityByIdBoard(
                    @retrofit2.http.Body MyPrefsShowSidebarActivity body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard()
   * 
   * @param body Attributes of &quot;My Prefs Show Sidebar Board Actions&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/myPrefs/showSidebarBoardActions")
  Call<Void> updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard(
                    @retrofit2.http.Body MyPrefsShowSidebarBoardActions body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMyPrefsShowSidebarByIdBoard()
   * 
   * @param body Attributes of &quot;My Prefs Show Sidebar&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/myPrefs/showSidebar")
  Call<Void> updateBoardsMyPrefsShowSidebarByIdBoard(
                    @retrofit2.http.Body MyPrefsShowSidebar body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsMyPrefsShowSidebarMembersByIdBoard()
   * 
   * @param body Attributes of &quot;My Prefs Show Sidebar Members&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/myPrefs/showSidebarMembers")
  Call<Void> updateBoardsMyPrefsShowSidebarMembersByIdBoard(
                    @retrofit2.http.Body MyPrefsShowSidebarMembers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsNameByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/name")
  Call<Void> updateBoardsNameByIdBoard(
                    @retrofit2.http.Body BoardsName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsBackgroundByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Background&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/background")
  Call<Void> updateBoardsPrefsBackgroundByIdBoard(
                    @retrofit2.http.Body PrefsBackground body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsCalendarFeedEnabledByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Calendar Feed Enabled&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/calendarFeedEnabled")
  Call<Void> updateBoardsPrefsCalendarFeedEnabledByIdBoard(
                    @retrofit2.http.Body PrefsCalendarFeedEnabled body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsCardAgingByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Card Aging&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/cardAging")
  Call<Void> updateBoardsPrefsCardAgingByIdBoard(
                    @retrofit2.http.Body PrefsCardAging body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsCardCoversByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Card Covers&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/cardCovers")
  Call<Void> updateBoardsPrefsCardCoversByIdBoard(
                    @retrofit2.http.Body PrefsCardCovers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsCommentsByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Comments&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/comments")
  Call<Void> updateBoardsPrefsCommentsByIdBoard(
                    @retrofit2.http.Body PrefsComments body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsInvitationsByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Invitations&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/invitations")
  Call<Void> updateBoardsPrefsInvitationsByIdBoard(
                    @retrofit2.http.Body PrefsInvitations body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsPermissionLevelByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Permission Level&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/permissionLevel")
  Call<Void> updateBoardsPrefsPermissionLevelByIdBoard(
                    @retrofit2.http.Body PrefsPermissionLevel body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsSelfJoinByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Self Join&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/selfJoin")
  Call<Void> updateBoardsPrefsSelfJoinByIdBoard(
                    @retrofit2.http.Body PrefsSelfJoin body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsPrefsVotingByIdBoard()
   * 
   * @param body Attributes of &quot;Prefs Voting&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/prefs/voting")
  Call<Void> updateBoardsPrefsVotingByIdBoard(
                    @retrofit2.http.Body PrefsVoting body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

  /**
   * updateBoardsSubscribedByIdBoard()
   * 
   * @param body Attributes of &quot;Boards Subscribed&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoard board_id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("boards/{idBoard}/subscribed")
  Call<Void> updateBoardsSubscribedByIdBoard(
                    @retrofit2.http.Body BoardsSubscribed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idBoard") String idBoard            
  );

}
