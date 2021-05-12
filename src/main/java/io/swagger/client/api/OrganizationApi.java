package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Organizations;
import io.swagger.client.model.OrganizationsDesc;
import io.swagger.client.model.OrganizationsDisplayName;
import io.swagger.client.model.OrganizationsLogo;
import io.swagger.client.model.OrganizationsMembers;
import io.swagger.client.model.OrganizationsMembersDeactivated;
import io.swagger.client.model.OrganizationsMemberships;
import io.swagger.client.model.OrganizationsName;
import io.swagger.client.model.OrganizationsWebsite;
import io.swagger.client.model.PrefsAssociatedDomain;
import io.swagger.client.model.PrefsBoardVisibilityRestrict;
import io.swagger.client.model.PrefsExternalMembersDisabled;
import io.swagger.client.model.PrefsGoogleAppsVersion;
import io.swagger.client.model.PrefsOrgInviteRestrict;
import io.swagger.client.model.PrefsPermissionLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrganizationApi {
  /**
   * addOrganizations()
   * 
   * @param body Attributes of &quot;Organizations&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("organizations")
  Call<Void> addOrganizations(
                    @retrofit2.http.Body Organizations body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addOrganizationsLogoByIdOrg()
   * 
   * @param body Attributes of &quot;Organizations Logo&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("organizations/{idOrg}/logo")
  Call<Void> addOrganizationsLogoByIdOrg(
                    @retrofit2.http.Body OrganizationsLogo body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * deleteOrganizationsByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("organizations/{idOrg}")
  Call<Void> deleteOrganizationsByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteOrganizationsLogoByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("organizations/{idOrg}/logo")
  Call<Void> deleteOrganizationsLogoByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteOrganizationsMembersAllByIdOrgByIdMember()
   * 
   * @param idOrg idOrg or name (required)
   * @param idMember idMember (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("organizations/{idOrg}/members/{idMember}/all")
  Call<Void> deleteOrganizationsMembersAllByIdOrgByIdMember(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteOrganizationsMembersByIdOrgByIdMember()
   * 
   * @param idOrg idOrg or name (required)
   * @param idMember idMember (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("organizations/{idOrg}/members/{idMember}")
  Call<Void> deleteOrganizationsMembersByIdOrgByIdMember(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteOrganizationsPrefsAssociatedDomainByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("organizations/{idOrg}/prefs/associatedDomain")
  Call<Void> deleteOrganizationsPrefsAssociatedDomainByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteOrganizationsPrefsOrgInviteRestrictByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param value An email address with optional expansion tokens (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("organizations/{idOrg}/prefs/orgInviteRestrict")
  Call<Void> deleteOrganizationsPrefsOrgInviteRestrictByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("value") String value                ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getOrganizationsActionsByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
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
  @GET("organizations/{idOrg}/actions")
  Call<Void> getOrganizationsActionsByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("entities") String entities                ,     @retrofit2.http.Query("display") String display                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("format") String format                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("page") String page                ,     @retrofit2.http.Query("idModels") String idModels                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("memberCreator") String memberCreator                ,     @retrofit2.http.Query("memberCreator_fields") String memberCreatorFields                
  );

  /**
   * getOrganizationsBoardsByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned (optional, default to all)
   * @param fields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to all)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param actionsEntities  true or false (optional)
   * @param actionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param actionsFormat One of: count, list or minimal (optional, default to list)
   * @param actionsSince A date, null or lastView (optional)
   * @param actionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param memberships all or a comma-separated list of: active, admin, deactivated, me or normal (optional, default to none)
   * @param organization  true or false (optional)
   * @param organizationFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to name and displayName)
   * @param lists One of: all, closed, none or open (optional, default to none)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/boards")
  Call<Void> getOrganizationsBoardsByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("actions_entities") String actionsEntities                ,     @retrofit2.http.Query("actions_limit") String actionsLimit                ,     @retrofit2.http.Query("actions_format") String actionsFormat                ,     @retrofit2.http.Query("actions_since") String actionsSince                ,     @retrofit2.http.Query("action_fields") String actionFields                ,     @retrofit2.http.Query("memberships") String memberships                ,     @retrofit2.http.Query("organization") String organization                ,     @retrofit2.http.Query("organization_fields") String organizationFields                ,     @retrofit2.http.Query("lists") String lists                
  );

  /**
   * getOrganizationsBoardsByIdOrgByFilter()
   * 
   * @param idOrg idOrg or name (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/boards/{filter}")
  Call<Void> getOrganizationsBoardsByIdOrgByFilter(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getOrganizationsByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param actionsEntities  true or false (optional)
   * @param actionsDisplay  true or false (optional)
   * @param actionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param actionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param memberships all or a comma-separated list of: active, admin, deactivated, me or normal (optional, default to none)
   * @param membershipsMember  true or false (optional)
   * @param membershipsMemberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @param members One of: admins, all, none, normal or owners (optional, default to none)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials, username and confirmed)
   * @param memberActivity true or false ; works for premium organizations only. (optional)
   * @param membersInvited One of: admins, all, none, normal or owners (optional, default to none)
   * @param membersInvitedFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, initials, fullName and username)
   * @param boards all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned (optional, default to none)
   * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to all)
   * @param boardActions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param boardActionsEntities  true or false (optional)
   * @param boardActionsDisplay  true or false (optional)
   * @param boardActionsFormat One of: count, list or minimal (optional, default to list)
   * @param boardActionsSince A date, null or lastView (optional)
   * @param boardActionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param boardActionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param boardLists One of: all, closed, none or open (optional, default to none)
   * @param paidAccount  true or false (optional)
   * @param fields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to name, displayName, desc, descData, url, website, logoHash, products and powerUps)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}")
  Call<Void> getOrganizationsByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("actions_entities") String actionsEntities                ,     @retrofit2.http.Query("actions_display") String actionsDisplay                ,     @retrofit2.http.Query("actions_limit") String actionsLimit                ,     @retrofit2.http.Query("action_fields") String actionFields                ,     @retrofit2.http.Query("memberships") String memberships                ,     @retrofit2.http.Query("memberships_member") String membershipsMember                ,     @retrofit2.http.Query("memberships_member_fields") String membershipsMemberFields                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("member_activity") String memberActivity                ,     @retrofit2.http.Query("membersInvited") String membersInvited                ,     @retrofit2.http.Query("membersInvited_fields") String membersInvitedFields                ,     @retrofit2.http.Query("boards") String boards                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("board_actions") String boardActions                ,     @retrofit2.http.Query("board_actions_entities") String boardActionsEntities                ,     @retrofit2.http.Query("board_actions_display") String boardActionsDisplay                ,     @retrofit2.http.Query("board_actions_format") String boardActionsFormat                ,     @retrofit2.http.Query("board_actions_since") String boardActionsSince                ,     @retrofit2.http.Query("board_actions_limit") String boardActionsLimit                ,     @retrofit2.http.Query("board_action_fields") String boardActionFields                ,     @retrofit2.http.Query("board_lists") String boardLists                ,     @retrofit2.http.Query("paid_account") String paidAccount                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getOrganizationsByIdOrgByField()
   * 
   * @param idOrg idOrg or name (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/{field}")
  Call<Void> getOrganizationsByIdOrgByField(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getOrganizationsDeltasByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param tags A valid tag for subscribing (required)
   * @param ixLastUpdate a number from -1 to Infinity (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/deltas")
  Call<Void> getOrganizationsDeltasByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("tags") String tags                ,     @retrofit2.http.Query("ixLastUpdate") String ixLastUpdate                ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getOrganizationsMembersByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: admins, all, none, normal or owners (optional, default to all)
   * @param fields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @param activity true or false ; works for premium organizations only. (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/members")
  Call<Void> getOrganizationsMembersByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("activity") String activity                
  );

  /**
   * getOrganizationsMembersByIdOrgByFilter()
   * 
   * @param idOrg idOrg or name (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/members/{filter}")
  Call<Void> getOrganizationsMembersByIdOrgByFilter(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getOrganizationsMembersCardsByIdOrgByIdMember()
   * 
   * @param idOrg idOrg or name (required)
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
  @GET("organizations/{idOrg}/members/{idMember}/cards")
  Call<Void> getOrganizationsMembersCardsByIdOrgByIdMember(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("board") String board                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("list") String list                ,     @retrofit2.http.Query("list_fields") String listFields                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getOrganizationsMembersInvitedByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/membersInvited")
  Call<Void> getOrganizationsMembersInvitedByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getOrganizationsMembersInvitedByIdOrgByField()
   * 
   * @param idOrg idOrg or name (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/membersInvited/{field}")
  Call<Void> getOrganizationsMembersInvitedByIdOrgByField(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getOrganizationsMembershipsByIdOrg()
   * 
   * @param idOrg idOrg or name (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter all or a comma-separated list of: active, admin, deactivated, me or normal (optional, default to all)
   * @param member  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/memberships")
  Call<Void> getOrganizationsMembershipsByIdOrg(
            @retrofit2.http.Path("idOrg") String idOrg            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                
  );

  /**
   * getOrganizationsMembershipsByIdOrgByIdMembership()
   * 
   * @param idOrg idOrg or name (required)
   * @param idMembership idMembership (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param member  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to fullName and username)
   * @return Call&lt;Void&gt;
   */
  @GET("organizations/{idOrg}/memberships/{idMembership}")
  Call<Void> getOrganizationsMembershipsByIdOrgByIdMembership(
            @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("idMembership") String idMembership            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                
  );

  /**
   * updateOrganizationsByIdOrg()
   * 
   * @param body Attributes of &quot;Organizations&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}")
  Call<Void> updateOrganizationsByIdOrg(
                    @retrofit2.http.Body Organizations body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsDescByIdOrg()
   * 
   * @param body Attributes of &quot;Organizations Desc&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/desc")
  Call<Void> updateOrganizationsDescByIdOrg(
                    @retrofit2.http.Body OrganizationsDesc body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsDisplayNameByIdOrg()
   * 
   * @param body Attributes of &quot;Organizations Display Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/displayName")
  Call<Void> updateOrganizationsDisplayNameByIdOrg(
                    @retrofit2.http.Body OrganizationsDisplayName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsMembersByIdOrg()
   * 
   * @param body Attributes of &quot;Organizations Members&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/members")
  Call<Void> updateOrganizationsMembersByIdOrg(
                    @retrofit2.http.Body OrganizationsMembers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsMembersByIdOrgByIdMember()
   * 
   * @param body Attributes of &quot;Organizations Members&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @param idMember idMember (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/members/{idMember}")
  Call<Void> updateOrganizationsMembersByIdOrgByIdMember(
                    @retrofit2.http.Body OrganizationsMembers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateOrganizationsMembersDeactivatedByIdOrgByIdMember()
   * 
   * @param body Attributes of &quot;Organizations Members Deactivated&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @param idMember idMember (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/members/{idMember}/deactivated")
  Call<Void> updateOrganizationsMembersDeactivatedByIdOrgByIdMember(
                    @retrofit2.http.Body OrganizationsMembersDeactivated body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateOrganizationsMembershipsByIdOrgByIdMembership()
   * 
   * @param body Attributes of &quot;Organizations Memberships&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @param idMembership idMembership (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/memberships/{idMembership}")
  Call<Void> updateOrganizationsMembershipsByIdOrgByIdMembership(
                    @retrofit2.http.Body OrganizationsMemberships body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            ,         @retrofit2.http.Path("idMembership") String idMembership            
  );

  /**
   * updateOrganizationsNameByIdOrg()
   * 
   * @param body Attributes of &quot;Organizations Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/name")
  Call<Void> updateOrganizationsNameByIdOrg(
                    @retrofit2.http.Body OrganizationsName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsAssociatedDomainByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs Associated Domain&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/associatedDomain")
  Call<Void> updateOrganizationsPrefsAssociatedDomainByIdOrg(
                    @retrofit2.http.Body PrefsAssociatedDomain body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsBoardVisibilityRestrictOrgByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs Board Visibility Restrict&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/boardVisibilityRestrict/org")
  Call<Void> updateOrganizationsPrefsBoardVisibilityRestrictOrgByIdOrg(
                    @retrofit2.http.Body PrefsBoardVisibilityRestrict body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsBoardVisibilityRestrictPrivateByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs Board Visibility Restrict&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/boardVisibilityRestrict/private")
  Call<Void> updateOrganizationsPrefsBoardVisibilityRestrictPrivateByIdOrg(
                    @retrofit2.http.Body PrefsBoardVisibilityRestrict body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsBoardVisibilityRestrictPublicByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs Board Visibility Restrict&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/boardVisibilityRestrict/public")
  Call<Void> updateOrganizationsPrefsBoardVisibilityRestrictPublicByIdOrg(
                    @retrofit2.http.Body PrefsBoardVisibilityRestrict body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsExternalMembersDisabledByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs External Members Disabled&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/externalMembersDisabled")
  Call<Void> updateOrganizationsPrefsExternalMembersDisabledByIdOrg(
                    @retrofit2.http.Body PrefsExternalMembersDisabled body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsGoogleAppsVersionByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs Google Apps Version&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/googleAppsVersion")
  Call<Void> updateOrganizationsPrefsGoogleAppsVersionByIdOrg(
                    @retrofit2.http.Body PrefsGoogleAppsVersion body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsOrgInviteRestrictByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs Org Invite Restrict&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/orgInviteRestrict")
  Call<Void> updateOrganizationsPrefsOrgInviteRestrictByIdOrg(
                    @retrofit2.http.Body PrefsOrgInviteRestrict body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsPrefsPermissionLevelByIdOrg()
   * 
   * @param body Attributes of &quot;Prefs Permission Level&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/prefs/permissionLevel")
  Call<Void> updateOrganizationsPrefsPermissionLevelByIdOrg(
                    @retrofit2.http.Body PrefsPermissionLevel body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

  /**
   * updateOrganizationsWebsiteByIdOrg()
   * 
   * @param body Attributes of &quot;Organizations Website&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idOrg idOrg or name (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("organizations/{idOrg}/website")
  Call<Void> updateOrganizationsWebsiteByIdOrg(
                    @retrofit2.http.Body OrganizationsWebsite body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idOrg") String idOrg            
  );

}
