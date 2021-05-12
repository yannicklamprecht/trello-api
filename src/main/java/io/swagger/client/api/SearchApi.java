package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApi {
  /**
   * getSearch()
   * 
   * @param query a string with a length from 1 to 16384 (required)
   * @param idOrganizations A comma-separated list of objectIds, 24-character hex strings (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idBoards A comma-separated list of objectIds, 24-character hex strings (optional, default to mine)
   * @param idCards A comma-separated list of objectIds, 24-character hex strings (optional)
   * @param modelTypes all or a comma-separated list of: actions, boards, cards, members or organizations (optional, default to all)
   * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name and idOrganization)
   * @param boardsLimit a number from 1 to 1000 (optional, default to 10)
   * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
   * @param cardsLimit a number from 1 to 1000 (optional, default to 10)
   * @param cardsPage a number from 0 to 100 (optional, default to 0)
   * @param cardBoard  true or false (optional)
   * @param cardList  true or false (optional)
   * @param cardMembers  true or false (optional)
   * @param cardStickers  true or false (optional)
   * @param cardAttachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @param organizationFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to name and displayName)
   * @param organizationsLimit a number from 1 to 1000 (optional, default to 10)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials, username and confirmed)
   * @param membersLimit a number from 1 to 1000 (optional, default to 10)
   * @param partial  true or false (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("search")
  Call<Void> getSearch(
        @retrofit2.http.Query("query") String query                ,     @retrofit2.http.Query("idOrganizations") String idOrganizations                ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("idBoards") String idBoards                ,     @retrofit2.http.Query("idCards") String idCards                ,     @retrofit2.http.Query("modelTypes") String modelTypes                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("boards_limit") String boardsLimit                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("cards_limit") String cardsLimit                ,     @retrofit2.http.Query("cards_page") String cardsPage                ,     @retrofit2.http.Query("card_board") String cardBoard                ,     @retrofit2.http.Query("card_list") String cardList                ,     @retrofit2.http.Query("card_members") String cardMembers                ,     @retrofit2.http.Query("card_stickers") String cardStickers                ,     @retrofit2.http.Query("card_attachments") String cardAttachments                ,     @retrofit2.http.Query("organization_fields") String organizationFields                ,     @retrofit2.http.Query("organizations_limit") String organizationsLimit                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("members_limit") String membersLimit                ,     @retrofit2.http.Query("partial") String partial                
  );

  /**
   * getSearchMembers()
   * 
   * @param query a string with a length from 1 to 16384 (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param limit a number from 1 to 20 (optional, default to 8)
   * @param idBoard An id, or null (optional)
   * @param idOrganization An id, or null (optional)
   * @param onlyOrgMembers A boolean (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("search/members")
  Call<Void> getSearchMembers(
        @retrofit2.http.Query("query") String query                ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("idBoard") String idBoard                ,     @retrofit2.http.Query("idOrganization") String idOrganization                ,     @retrofit2.http.Query("onlyOrgMembers") String onlyOrgMembers                
  );

}
