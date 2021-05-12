package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Notifications;
import io.swagger.client.model.NotificationsUnread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NotificationApi {
  /**
   * addNotificationsAllRead()
   * 
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @POST("notifications/all/read")
  Call<Void> addNotificationsAllRead(
        @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsBoardByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/board")
  Call<Void> getNotificationsBoardByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getNotificationsBoardByIdNotificationByField()
   * 
   * @param idNotification idNotification (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/board/{field}")
  Call<Void> getNotificationsBoardByIdNotificationByField(
            @retrofit2.http.Path("idNotification") String idNotification            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param display  true or false (optional)
   * @param entities  true or false (optional)
   * @param fields all or a comma-separated list of: data, date, idMemberCreator, type or unread (optional, default to all)
   * @param memberCreator  true or false (optional)
   * @param memberCreatorFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param board  true or false (optional)
   * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name)
   * @param list  true or false (optional)
   * @param card  true or false (optional)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to name)
   * @param organization  true or false (optional)
   * @param organizationFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to displayName)
   * @param member  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}")
  Call<Void> getNotificationsByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("display") String display                ,     @retrofit2.http.Query("entities") String entities                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("memberCreator") String memberCreator                ,     @retrofit2.http.Query("memberCreator_fields") String memberCreatorFields                ,     @retrofit2.http.Query("board") String board                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("list") String list                ,     @retrofit2.http.Query("card") String card                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("organization") String organization                ,     @retrofit2.http.Query("organization_fields") String organizationFields                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                
  );

  /**
   * getNotificationsByIdNotificationByField()
   * 
   * @param idNotification idNotification (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/{field}")
  Call<Void> getNotificationsByIdNotificationByField(
            @retrofit2.http.Path("idNotification") String idNotification            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsCardByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/card")
  Call<Void> getNotificationsCardByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getNotificationsCardByIdNotificationByField()
   * 
   * @param idNotification idNotification (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/card/{field}")
  Call<Void> getNotificationsCardByIdNotificationByField(
            @retrofit2.http.Path("idNotification") String idNotification            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsDisplayByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/display")
  Call<Void> getNotificationsDisplayByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsEntitiesByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/entities")
  Call<Void> getNotificationsEntitiesByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsListByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: closed, idBoard, name, pos or subscribed (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/list")
  Call<Void> getNotificationsListByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getNotificationsListByIdNotificationByField()
   * 
   * @param idNotification idNotification (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/list/{field}")
  Call<Void> getNotificationsListByIdNotificationByField(
            @retrofit2.http.Path("idNotification") String idNotification            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsMemberByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/member")
  Call<Void> getNotificationsMemberByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getNotificationsMemberByIdNotificationByField()
   * 
   * @param idNotification idNotification (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/member/{field}")
  Call<Void> getNotificationsMemberByIdNotificationByField(
            @retrofit2.http.Path("idNotification") String idNotification            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsMemberCreatorByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/memberCreator")
  Call<Void> getNotificationsMemberCreatorByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getNotificationsMemberCreatorByIdNotificationByField()
   * 
   * @param idNotification idNotification (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/memberCreator/{field}")
  Call<Void> getNotificationsMemberCreatorByIdNotificationByField(
            @retrofit2.http.Path("idNotification") String idNotification            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getNotificationsOrganizationByIdNotification()
   * 
   * @param idNotification idNotification (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/organization")
  Call<Void> getNotificationsOrganizationByIdNotification(
            @retrofit2.http.Path("idNotification") String idNotification            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getNotificationsOrganizationByIdNotificationByField()
   * 
   * @param idNotification idNotification (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("notifications/{idNotification}/organization/{field}")
  Call<Void> getNotificationsOrganizationByIdNotificationByField(
            @retrofit2.http.Path("idNotification") String idNotification            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * updateNotificationsByIdNotification()
   * 
   * @param body Attributes of &quot;Notifications&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idNotification idNotification (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("notifications/{idNotification}")
  Call<Void> updateNotificationsByIdNotification(
                    @retrofit2.http.Body Notifications body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idNotification") String idNotification            
  );

  /**
   * updateNotificationsUnreadByIdNotification()
   * 
   * @param body Attributes of &quot;Notifications Unread&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idNotification idNotification (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("notifications/{idNotification}/unread")
  Call<Void> updateNotificationsUnreadByIdNotification(
                    @retrofit2.http.Body NotificationsUnread body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idNotification") String idNotification            
  );

}
