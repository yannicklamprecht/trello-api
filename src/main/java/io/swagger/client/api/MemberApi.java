package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MemberApi {
  /**
   * addMembersAvatarByIdMember()
   * 
   * @param body Attributes of &quot;Members Avatar&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/avatar")
  Call<Void> addMembersAvatarByIdMember(
                    @retrofit2.http.Body MembersAvatar body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * addMembersBoardBackgroundsByIdMember()
   * 
   * @param body Attributes of &quot;Members Board Backgrounds&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/boardBackgrounds")
  Call<Void> addMembersBoardBackgroundsByIdMember(
                    @retrofit2.http.Body MembersBoardBackgrounds body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * addMembersBoardStarsByIdMember()
   * 
   * @param body Attributes of &quot;Members Board Stars&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/boardStars")
  Call<Void> addMembersBoardStarsByIdMember(
                    @retrofit2.http.Body MembersBoardStars body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * addMembersCustomBoardBackgroundsByIdMember()
   * 
   * @param body Attributes of &quot;Members Custom Board Backgrounds&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/customBoardBackgrounds")
  Call<Void> addMembersCustomBoardBackgroundsByIdMember(
                    @retrofit2.http.Body MembersCustomBoardBackgrounds body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * addMembersCustomEmojiByIdMember()
   * 
   * @param body Attributes of &quot;Members Custom Emoji&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/customEmoji")
  Call<Void> addMembersCustomEmojiByIdMember(
                    @retrofit2.http.Body MembersCustomEmoji body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * addMembersCustomStickersByIdMember()
   * 
   * @param body Attributes of &quot;Members Custom Stickers&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/customStickers")
  Call<Void> addMembersCustomStickersByIdMember(
                    @retrofit2.http.Body MembersCustomStickers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * addMembersOneTimeMessagesDismissedByIdMember()
   * 
   * @param body Attributes of &quot;Members One Time Messages Dismissed&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/oneTimeMessagesDismissed")
  Call<Void> addMembersOneTimeMessagesDismissedByIdMember(
                    @retrofit2.http.Body MembersOneTimeMessagesDismissed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * addMembersSavedSearchesByIdMember()
   * 
   * @param body Attributes of &quot;Members Saved Searches&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("members/{idMember}/savedSearches")
  Call<Void> addMembersSavedSearchesByIdMember(
                    @retrofit2.http.Body MembersSavedSearches body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * deleteMembersBoardBackgroundsByIdMemberByIdBoardBackground()
   * 
   * @param idMember idMember or username (required)
   * @param idBoardBackground idBoardBackground (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("members/{idMember}/boardBackgrounds/{idBoardBackground}")
  Call<Void> deleteMembersBoardBackgroundsByIdMemberByIdBoardBackground(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardBackground") String idBoardBackground            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteMembersBoardStarsByIdMemberByIdBoardStar()
   * 
   * @param idMember idMember or username (required)
   * @param idBoardStar idBoardStar (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("members/{idMember}/boardStars/{idBoardStar}")
  Call<Void> deleteMembersBoardStarsByIdMemberByIdBoardStar(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardStar") String idBoardStar            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
   * 
   * @param idMember idMember or username (required)
   * @param idBoardBackground idBoardBackground (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("members/{idMember}/customBoardBackgrounds/{idBoardBackground}")
  Call<Void> deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardBackground") String idBoardBackground            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteMembersCustomStickersByIdMemberByIdCustomSticker()
   * 
   * @param idMember idMember or username (required)
   * @param idCustomSticker idCustomSticker (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("members/{idMember}/customStickers/{idCustomSticker}")
  Call<Void> deleteMembersCustomStickersByIdMemberByIdCustomSticker(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idCustomSticker") String idCustomSticker            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteMembersSavedSearchesByIdMemberByIdSavedSearch()
   * 
   * @param idMember idMember or username (required)
   * @param idSavedSearch idSavedSearch (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("members/{idMember}/savedSearches/{idSavedSearch}")
  Call<Void> deleteMembersSavedSearchesByIdMemberByIdSavedSearch(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idSavedSearch") String idSavedSearch            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersActionsByIdMember()
   * 
   * @param idMember idMember or username (required)
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
  @GET("members/{idMember}/actions")
  Call<Void> getMembersActionsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("entities") String entities                ,     @retrofit2.http.Query("display") String display                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("format") String format                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("page") String page                ,     @retrofit2.http.Query("idModels") String idModels                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("memberCreator") String memberCreator                ,     @retrofit2.http.Query("memberCreator_fields") String memberCreatorFields                
  );

  /**
   * getMembersBoardBackgroundsByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: all, custom, default, none or premium (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/boardBackgrounds")
  Call<Void> getMembersBoardBackgroundsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                
  );

  /**
   * getMembersBoardBackgroundsByIdMemberByIdBoardBackground()
   * 
   * @param idMember idMember or username (required)
   * @param idBoardBackground idBoardBackground (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: brightness, fullSizeUrl, scaled or tile (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/boardBackgrounds/{idBoardBackground}")
  Call<Void> getMembersBoardBackgroundsByIdMemberByIdBoardBackground(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardBackground") String idBoardBackground            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersBoardStarsByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/boardStars")
  Call<Void> getMembersBoardStarsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersBoardStarsByIdMemberByIdBoardStar()
   * 
   * @param idMember idMember or username (required)
   * @param idBoardStar idBoardStar (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/boardStars/{idBoardStar}")
  Call<Void> getMembersBoardStarsByIdMemberByIdBoardStar(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardStar") String idBoardStar            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersBoardsByIdMember()
   * 
   * @param idMember idMember or username (required)
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
  @GET("members/{idMember}/boards")
  Call<Void> getMembersBoardsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("actions_entities") String actionsEntities                ,     @retrofit2.http.Query("actions_limit") String actionsLimit                ,     @retrofit2.http.Query("actions_format") String actionsFormat                ,     @retrofit2.http.Query("actions_since") String actionsSince                ,     @retrofit2.http.Query("action_fields") String actionFields                ,     @retrofit2.http.Query("memberships") String memberships                ,     @retrofit2.http.Query("organization") String organization                ,     @retrofit2.http.Query("organization_fields") String organizationFields                ,     @retrofit2.http.Query("lists") String lists                
  );

  /**
   * getMembersBoardsByIdMemberByFilter()
   * 
   * @param idMember idMember or username (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/boards/{filter}")
  Call<Void> getMembersBoardsByIdMemberByFilter(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersBoardsInvitedByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/boardsInvited")
  Call<Void> getMembersBoardsInvitedByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersBoardsInvitedByIdMemberByField()
   * 
   * @param idMember idMember or username (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/boardsInvited/{field}")
  Call<Void> getMembersBoardsInvitedByIdMemberByField(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersByIdMember()
   * If you specify &#x27;me&#x27; as the username, this call will respond as if you had supplied the username associated with the supplied token
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param actionsEntities  true or false (optional)
   * @param actionsDisplay  true or false (optional)
   * @param actionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param actionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param actionSince A date, null or lastView (optional)
   * @param actionBefore A date, or null (optional)
   * @param cards One of: all, closed, none, open or visible (optional, default to none)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @param cardMembers  true or false (optional)
   * @param cardMemberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param cardAttachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @param cardAttachmentFields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to url and previews)
   * @param cardStickers  true or false (optional)
   * @param boards all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned (optional)
   * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name, closed, idOrganization and pinned)
   * @param boardActions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param boardActionsEntities  true or false (optional)
   * @param boardActionsDisplay  true or false (optional)
   * @param boardActionsFormat One of: count, list or minimal (optional, default to list)
   * @param boardActionsSince A date, null or lastView (optional)
   * @param boardActionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param boardActionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param boardLists One of: all, closed, none or open (optional, default to none)
   * @param boardMemberships all or a comma-separated list of: active, admin, deactivated, me or normal (optional, default to none)
   * @param boardOrganization  true or false (optional)
   * @param boardOrganizationFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to name and displayName)
   * @param boardsInvited all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned (optional)
   * @param boardsInvitedFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name, closed, idOrganization and pinned)
   * @param boardStars  true or false (optional)
   * @param savedSearches  true or false (optional)
   * @param organizations One of: all, members, none or public (optional, default to none)
   * @param organizationFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to all)
   * @param organizationPaidAccount  true or false (optional)
   * @param organizationsInvited One of: all, members, none or public (optional, default to none)
   * @param organizationsInvitedFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to all)
   * @param notifications all or a comma-separated list of: addAdminToBoard, addAdminToOrganization, addedAttachmentToCard, addedMemberToCard, addedToBoard, addedToCard, addedToOrganization, cardDueSoon, changeCard, closeBoard, commentCard, createdCard, declinedInvitationToBoard, declinedInvitationToOrganization, invitedToBoard, invitedToOrganization, makeAdminOfBoard, makeAdminOfOrganization, memberJoinedTrello, mentionedOnCard, removedFromBoard, removedFromCard, removedFromOrganization, removedMemberFromCard, unconfirmedInvitedToBoard, unconfirmedInvitedToOrganization or updateCheckItemStateOnCard (optional)
   * @param notificationsEntities  true or false (optional)
   * @param notificationsDisplay  true or false (optional)
   * @param notificationsLimit a number from 1 to 1000 (optional, default to 50)
   * @param notificationFields all or a comma-separated list of: data, date, idMemberCreator, type or unread (optional, default to all)
   * @param notificationMemberCreator  true or false (optional)
   * @param notificationMemberCreatorFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param notificationBefore An id, or null (optional)
   * @param notificationSince An id, or null (optional)
   * @param tokens One of: all or none (optional, default to none)
   * @param paidAccount  true or false (optional)
   * @param boardBackgrounds One of: all, custom, default, none or premium (optional, default to none)
   * @param customBoardBackgrounds One of: all or none (optional, default to none)
   * @param customStickers One of: all or none (optional, default to none)
   * @param customEmoji One of: all or none (optional, default to none)
   * @param fields all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}")
  Call<Void> getMembersByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("actions_entities") String actionsEntities                ,     @retrofit2.http.Query("actions_display") String actionsDisplay                ,     @retrofit2.http.Query("actions_limit") String actionsLimit                ,     @retrofit2.http.Query("action_fields") String actionFields                ,     @retrofit2.http.Query("action_since") String actionSince                ,     @retrofit2.http.Query("action_before") String actionBefore                ,     @retrofit2.http.Query("cards") String cards                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("card_members") String cardMembers                ,     @retrofit2.http.Query("card_member_fields") String cardMemberFields                ,     @retrofit2.http.Query("card_attachments") String cardAttachments                ,     @retrofit2.http.Query("card_attachment_fields") String cardAttachmentFields                ,     @retrofit2.http.Query("card_stickers") String cardStickers                ,     @retrofit2.http.Query("boards") String boards                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("board_actions") String boardActions                ,     @retrofit2.http.Query("board_actions_entities") String boardActionsEntities                ,     @retrofit2.http.Query("board_actions_display") String boardActionsDisplay                ,     @retrofit2.http.Query("board_actions_format") String boardActionsFormat                ,     @retrofit2.http.Query("board_actions_since") String boardActionsSince                ,     @retrofit2.http.Query("board_actions_limit") String boardActionsLimit                ,     @retrofit2.http.Query("board_action_fields") String boardActionFields                ,     @retrofit2.http.Query("board_lists") String boardLists                ,     @retrofit2.http.Query("board_memberships") String boardMemberships                ,     @retrofit2.http.Query("board_organization") String boardOrganization                ,     @retrofit2.http.Query("board_organization_fields") String boardOrganizationFields                ,     @retrofit2.http.Query("boardsInvited") String boardsInvited                ,     @retrofit2.http.Query("boardsInvited_fields") String boardsInvitedFields                ,     @retrofit2.http.Query("boardStars") String boardStars                ,     @retrofit2.http.Query("savedSearches") String savedSearches                ,     @retrofit2.http.Query("organizations") String organizations                ,     @retrofit2.http.Query("organization_fields") String organizationFields                ,     @retrofit2.http.Query("organization_paid_account") String organizationPaidAccount                ,     @retrofit2.http.Query("organizationsInvited") String organizationsInvited                ,     @retrofit2.http.Query("organizationsInvited_fields") String organizationsInvitedFields                ,     @retrofit2.http.Query("notifications") String notifications                ,     @retrofit2.http.Query("notifications_entities") String notificationsEntities                ,     @retrofit2.http.Query("notifications_display") String notificationsDisplay                ,     @retrofit2.http.Query("notifications_limit") String notificationsLimit                ,     @retrofit2.http.Query("notification_fields") String notificationFields                ,     @retrofit2.http.Query("notification_memberCreator") String notificationMemberCreator                ,     @retrofit2.http.Query("notification_memberCreator_fields") String notificationMemberCreatorFields                ,     @retrofit2.http.Query("notification_before") String notificationBefore                ,     @retrofit2.http.Query("notification_since") String notificationSince                ,     @retrofit2.http.Query("tokens") String tokens                ,     @retrofit2.http.Query("paid_account") String paidAccount                ,     @retrofit2.http.Query("boardBackgrounds") String boardBackgrounds                ,     @retrofit2.http.Query("customBoardBackgrounds") String customBoardBackgrounds                ,     @retrofit2.http.Query("customStickers") String customStickers                ,     @retrofit2.http.Query("customEmoji") String customEmoji                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersByIdMemberByField()
   * 
   * @param idMember idMember or username (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/{field}")
  Call<Void> getMembersByIdMemberByField(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersCardsByIdMember()
   * 
   * @param idMember idMember or username (required)
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
  @GET("members/{idMember}/cards")
  Call<Void> getMembersCardsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("stickers") String stickers                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersCardsByIdMemberByFilter()
   * 
   * @param idMember idMember or username (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/cards/{filter}")
  Call<Void> getMembersCardsByIdMemberByFilter(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersCustomBoardBackgroundsByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: all or none (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/customBoardBackgrounds")
  Call<Void> getMembersCustomBoardBackgroundsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                
  );

  /**
   * getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
   * 
   * @param idMember idMember or username (required)
   * @param idBoardBackground idBoardBackground (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: brightness, fullSizeUrl, scaled or tile (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/customBoardBackgrounds/{idBoardBackground}")
  Call<Void> getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardBackground") String idBoardBackground            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersCustomEmojiByIdMember()
   * This gets the list of all of the user’s uploaded emoji
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: all or none (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/customEmoji")
  Call<Void> getMembersCustomEmojiByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                
  );

  /**
   * getMembersCustomEmojiByIdMemberByIdCustomEmoji()
   * 
   * @param idMember idMember or username (required)
   * @param idCustomEmoji idCustomEmoji (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: name or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/customEmoji/{idCustomEmoji}")
  Call<Void> getMembersCustomEmojiByIdMemberByIdCustomEmoji(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idCustomEmoji") String idCustomEmoji            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersCustomStickersByIdMember()
   * This gets a list of all of the user’s uploaded stickers
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: all or none (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/customStickers")
  Call<Void> getMembersCustomStickersByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                
  );

  /**
   * getMembersCustomStickersByIdMemberByIdCustomSticker()
   * 
   * @param idMember idMember or username (required)
   * @param idCustomSticker idCustomSticker (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: scaled or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/customStickers/{idCustomSticker}")
  Call<Void> getMembersCustomStickersByIdMemberByIdCustomSticker(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idCustomSticker") String idCustomSticker            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersDeltasByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param tags A valid tag for subscribing (required)
   * @param ixLastUpdate a number from -1 to Infinity (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/deltas")
  Call<Void> getMembersDeltasByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("tags") String tags                ,     @retrofit2.http.Query("ixLastUpdate") String ixLastUpdate                ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersNotificationsByIdMember()
   * You can only read the notifications for the member associated with the supplied token
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param entities  true or false (optional)
   * @param display  true or false (optional)
   * @param filter all or a comma-separated list of: addAdminToBoard, addAdminToOrganization, addedAttachmentToCard, addedMemberToCard, addedToBoard, addedToCard, addedToOrganization, cardDueSoon, changeCard, closeBoard, commentCard, createdCard, declinedInvitationToBoard, declinedInvitationToOrganization, invitedToBoard, invitedToOrganization, makeAdminOfBoard, makeAdminOfOrganization, memberJoinedTrello, mentionedOnCard, removedFromBoard, removedFromCard, removedFromOrganization, removedMemberFromCard, unconfirmedInvitedToBoard, unconfirmedInvitedToOrganization or updateCheckItemStateOnCard (optional, default to all)
   * @param readFilter One of: all, read or unread (optional, default to all)
   * @param fields all or a comma-separated list of: data, date, idMemberCreator, type or unread (optional, default to all)
   * @param limit a number from 1 to 1000 (optional, default to 50)
   * @param page a number from 0 to 100 (optional, default to 0)
   * @param before An id, or null (optional)
   * @param since An id, or null (optional)
   * @param memberCreator  true or false (optional)
   * @param memberCreatorFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/notifications")
  Call<Void> getMembersNotificationsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("entities") String entities                ,     @retrofit2.http.Query("display") String display                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("read_filter") String readFilter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("page") String page                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("memberCreator") String memberCreator                ,     @retrofit2.http.Query("memberCreator_fields") String memberCreatorFields                
  );

  /**
   * getMembersNotificationsByIdMemberByFilter()
   * 
   * @param idMember idMember or username (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/notifications/{filter}")
  Call<Void> getMembersNotificationsByIdMemberByFilter(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersOrganizationsByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: all, members, none or public (optional, default to all)
   * @param fields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to all)
   * @param paidAccount  true or false (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/organizations")
  Call<Void> getMembersOrganizationsByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("paid_account") String paidAccount                
  );

  /**
   * getMembersOrganizationsByIdMemberByFilter()
   * 
   * @param idMember idMember or username (required)
   * @param filter filter (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/organizations/{filter}")
  Call<Void> getMembersOrganizationsByIdMemberByFilter(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("filter") String filter            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersOrganizationsInvitedByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/organizationsInvited")
  Call<Void> getMembersOrganizationsInvitedByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getMembersOrganizationsInvitedByIdMemberByField()
   * 
   * @param idMember idMember or username (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/organizationsInvited/{field}")
  Call<Void> getMembersOrganizationsInvitedByIdMemberByField(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersSavedSearchesByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/savedSearches")
  Call<Void> getMembersSavedSearchesByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersSavedSearchesByIdMemberByIdSavedSearch()
   * 
   * @param idMember idMember or username (required)
   * @param idSavedSearch idSavedSearch (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/savedSearches/{idSavedSearch}")
  Call<Void> getMembersSavedSearchesByIdMemberByIdSavedSearch(
            @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idSavedSearch") String idSavedSearch            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getMembersTokensByIdMember()
   * 
   * @param idMember idMember or username (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param filter One of: all or none (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("members/{idMember}/tokens")
  Call<Void> getMembersTokensByIdMember(
            @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("filter") String filter                
  );

  /**
   * updateMembersAvatarSourceByIdMember()
   * 
   * @param body Attributes of &quot;Members Avatar Source&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/avatarSource")
  Call<Void> updateMembersAvatarSourceByIdMember(
                    @retrofit2.http.Body MembersAvatarSource body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersBioByIdMember()
   * 
   * @param body Attributes of &quot;Members Bio&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/bio")
  Call<Void> updateMembersBioByIdMember(
                    @retrofit2.http.Body MembersBio body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersBoardBackgroundsByIdMemberByIdBoardBackground()
   * 
   * @param body Attributes of &quot;Members Board Backgrounds&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idBoardBackground idBoardBackground (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/boardBackgrounds/{idBoardBackground}")
  Call<Void> updateMembersBoardBackgroundsByIdMemberByIdBoardBackground(
                    @retrofit2.http.Body MembersBoardBackgrounds body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardBackground") String idBoardBackground            
  );

  /**
   * updateMembersBoardStarsByIdMemberByIdBoardStar()
   * 
   * @param body Attributes of &quot;Members Board Stars&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idBoardStar idBoardStar (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/boardStars/{idBoardStar}")
  Call<Void> updateMembersBoardStarsByIdMemberByIdBoardStar(
                    @retrofit2.http.Body MembersBoardStars body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardStar") String idBoardStar            
  );

  /**
   * updateMembersBoardStarsIdBoardByIdMemberByIdBoardStar()
   * 
   * @param body Attributes of &quot;Members Board Stars Id Board&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idBoardStar idBoardStar (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/boardStars/{idBoardStar}/idBoard")
  Call<Void> updateMembersBoardStarsIdBoardByIdMemberByIdBoardStar(
                    @retrofit2.http.Body MembersBoardStarsIdBoard body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardStar") String idBoardStar            
  );

  /**
   * updateMembersBoardStarsPosByIdMemberByIdBoardStar()
   * 
   * @param body Attributes of &quot;Members Board Stars Pos&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idBoardStar idBoardStar (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/boardStars/{idBoardStar}/pos")
  Call<Void> updateMembersBoardStarsPosByIdMemberByIdBoardStar(
                    @retrofit2.http.Body MembersBoardStarsPos body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardStar") String idBoardStar            
  );

  /**
   * updateMembersByIdMember()
   * 
   * @param body Attributes of &quot;Members&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}")
  Call<Void> updateMembersByIdMember(
                    @retrofit2.http.Body Members body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
   * 
   * @param body Attributes of &quot;Members Custom Board Backgrounds&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idBoardBackground idBoardBackground (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/customBoardBackgrounds/{idBoardBackground}")
  Call<Void> updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground(
                    @retrofit2.http.Body MembersCustomBoardBackgrounds body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idBoardBackground") String idBoardBackground            
  );

  /**
   * updateMembersFullNameByIdMember()
   * 
   * @param body Attributes of &quot;Members Full Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/fullName")
  Call<Void> updateMembersFullNameByIdMember(
                    @retrofit2.http.Body MembersFullName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersInitialsByIdMember()
   * 
   * @param body Attributes of &quot;Members Initials&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/initials")
  Call<Void> updateMembersInitialsByIdMember(
                    @retrofit2.http.Body MembersInitials body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersPrefsColorBlindByIdMember()
   * 
   * @param body Attributes of &quot;Prefs Color Blind&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/prefs/colorBlind")
  Call<Void> updateMembersPrefsColorBlindByIdMember(
                    @retrofit2.http.Body PrefsColorBlind body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersPrefsLocaleByIdMember()
   * 
   * @param body Attributes of &quot;Prefs Locale&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/prefs/locale")
  Call<Void> updateMembersPrefsLocaleByIdMember(
                    @retrofit2.http.Body PrefsLocale body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersPrefsMinutesBetweenSummariesByIdMember()
   * 
   * @param body Attributes of &quot;Prefs Minutes Between Summaries&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/prefs/minutesBetweenSummaries")
  Call<Void> updateMembersPrefsMinutesBetweenSummariesByIdMember(
                    @retrofit2.http.Body PrefsMinutesBetweenSummaries body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

  /**
   * updateMembersSavedSearchesByIdMemberByIdSavedSearch()
   * 
   * @param body Attributes of &quot;Members Saved Searches&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idSavedSearch idSavedSearch (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/savedSearches/{idSavedSearch}")
  Call<Void> updateMembersSavedSearchesByIdMemberByIdSavedSearch(
                    @retrofit2.http.Body MembersSavedSearches body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idSavedSearch") String idSavedSearch            
  );

  /**
   * updateMembersSavedSearchesNameByIdMemberByIdSavedSearch()
   * 
   * @param body Attributes of &quot;Members Saved Searches Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idSavedSearch idSavedSearch (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/savedSearches/{idSavedSearch}/name")
  Call<Void> updateMembersSavedSearchesNameByIdMemberByIdSavedSearch(
                    @retrofit2.http.Body MembersSavedSearchesName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idSavedSearch") String idSavedSearch            
  );

  /**
   * updateMembersSavedSearchesPosByIdMemberByIdSavedSearch()
   * 
   * @param body Attributes of &quot;Members Saved Searches Pos&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idSavedSearch idSavedSearch (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/savedSearches/{idSavedSearch}/pos")
  Call<Void> updateMembersSavedSearchesPosByIdMemberByIdSavedSearch(
                    @retrofit2.http.Body MembersSavedSearchesPos body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idSavedSearch") String idSavedSearch            
  );

  /**
   * updateMembersSavedSearchesQueryByIdMemberByIdSavedSearch()
   * 
   * @param body Attributes of &quot;Members Saved Searches Query&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @param idSavedSearch idSavedSearch (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/savedSearches/{idSavedSearch}/query")
  Call<Void> updateMembersSavedSearchesQueryByIdMemberByIdSavedSearch(
                    @retrofit2.http.Body MembersSavedSearchesQuery body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            ,         @retrofit2.http.Path("idSavedSearch") String idSavedSearch            
  );

  /**
   * updateMembersUsernameByIdMember()
   * 
   * @param body Attributes of &quot;Members Username&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idMember idMember or username (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("members/{idMember}/username")
  Call<Void> updateMembersUsernameByIdMember(
                    @retrofit2.http.Body MembersUsername body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idMember") String idMember            
  );

}
