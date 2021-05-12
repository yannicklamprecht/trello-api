package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.TokensWebhooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TokenApi {

  /**
   * addTokensWebhooksByToken()
   *
   * @param body Attributes of &quot;Tokens Webhooks&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token2 &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param token token (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
      "Content-Type:*/*"
  })
  @POST("tokens/{token}/webhooks")
  Call<Void> addTokensWebhooksByToken(
      @retrofit2.http.Body TokensWebhooks body, @retrofit2.http.Query("key") String key,
      @retrofit2.http.Query("token") String token2, @retrofit2.http.Path("token") String token
  );

  /**
   * deleteTokensByToken()
   *
   * @param token token (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("tokens/{token}")
  Call<Void> deleteTokensByToken(
      @retrofit2.http.Query("token") @retrofit2.http.Path("token") String token,
      @retrofit2.http.Query("key") String key
  );

  /**
   * deleteTokensWebhooksByTokenByIdWebhook()
   *
   * @param token token (required)
   * @param idWebhook idWebhook (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("tokens/{token}/webhooks/{idWebhook}")
  Call<Void> deleteTokensWebhooksByTokenByIdWebhook(
      @retrofit2.http.Path("token") @retrofit2.http.Query("token") String token,
      @retrofit2.http.Path("idWebhook") String idWebhook, @retrofit2.http.Query("key") String key
  );

  /**
   * getTokensByToken()
   *
   * @param token token (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: dateCreated, dateExpires, idMember, identifier
   * or permissions (optional, default to all)
   * @param webhooks true or false (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("tokens/{token}")
  Call<Void> getTokensByToken(
      @retrofit2.http.Path("token") @retrofit2.http.Query("token") String token,
      @retrofit2.http.Query("key") String key, @retrofit2.http.Query("fields") String fields,
      @retrofit2.http.Query("webhooks") String webhooks
  );

  /**
   * getTokensByTokenByField()
   *
   * @param token token (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("tokens/{token}/{field}")
  Call<Void> getTokensByTokenByField(
      @retrofit2.http.Path("token") @retrofit2.http.Query("token") String token,
      @retrofit2.http.Path("field") String field,
      @retrofit2.http.Query("key") String key
  );

  /**
   * getTokensMemberByToken()
   *
   * @param token token (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: avatarHash, avatarSource, bio, bioData,
   * confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations,
   * idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs,
   * premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username
   * (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("tokens/{token}/member")
  Call<Void> getTokensMemberByToken(
      @retrofit2.http.Path("token") @retrofit2.http.Query("token") String token,
      @retrofit2.http.Query("key") String key,
      @retrofit2.http.Query("fields") String fields
  );

  /**
   * getTokensMemberByTokenByField()
   *
   * @param token token (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("tokens/{token}/member/{field}")
  Call<Void> getTokensMemberByTokenByField(
      @retrofit2.http.Path("token") @retrofit2.http.Query("token") String token,
      @retrofit2.http.Path("field") String field,
      @retrofit2.http.Query("key") String key
  );

  /**
   * getTokensWebhooksByToken()
   *
   * @param token token (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("tokens/{token}/webhooks")
  Call<Void> getTokensWebhooksByToken(
      @retrofit2.http.Path("token") @retrofit2.http.Query("token") String token,
      @retrofit2.http.Query("key") String key
  );

  /**
   * getTokensWebhooksByTokenByIdWebhook()
   *
   * @param token token (required)
   * @param idWebhook idWebhook (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("tokens/{token}/webhooks/{idWebhook}")
  Call<Void> getTokensWebhooksByTokenByIdWebhook(
      @retrofit2.http.Path("token") @retrofit2.http.Query("token") String token,
      @retrofit2.http.Path("idWebhook") String idWebhook, @retrofit2.http.Query("key") String key
  );

  /**
   * updateTokensWebhooksByToken()
   *
   * @param body Attributes of &quot;Tokens Webhooks&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;
   * target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param token token (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
      "Content-Type:*/*"
  })
  @PUT("tokens/{token}/webhooks")
  Call<Void> updateTokensWebhooksByToken(
      @retrofit2.http.Body TokensWebhooks body, @retrofit2.http.Query("key") String key,
      @retrofit2.http.Query("token") @retrofit2.http.Path("token") String token
  );

}
