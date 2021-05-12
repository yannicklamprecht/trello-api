package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Sessions;
import io.swagger.client.model.SessionsStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SessionApi {
  /**
   * addSessions()
   * 
   * @param body Attributes of &quot;Sessions&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("sessions")
  Call<Void> addSessions(
                    @retrofit2.http.Body Sessions body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getSessionsSocket()
   * This is the route for WebSocket requests.  See the socket API reference for a description of WebSocket usage.
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("sessions/socket")
  Call<Void> getSessionsSocket(
        @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * updateSessionsByIdSession()
   * 
   * @param body Attributes of &quot;Sessions&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idSession idSession (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("sessions/{idSession}")
  Call<Void> updateSessionsByIdSession(
                    @retrofit2.http.Body Sessions body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idSession") String idSession            
  );

  /**
   * updateSessionsStatusByIdSession()
   * 
   * @param body Attributes of &quot;Sessions Status&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idSession idSession (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("sessions/{idSession}/status")
  Call<Void> updateSessionsStatusByIdSession(
                    @retrofit2.http.Body SessionsStatus body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idSession") String idSession            
  );

}
