package io.swagger.client.api;//retrofit2

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CardApi {
  /**
   * addCards()
   * 
   * @param body Attributes of &quot;Cards&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards")
  Call<Void> addCards(
                    @retrofit2.http.Body Cards body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addCardsActionsCommentsByIdCard()
   * 
   * @param body Attributes of &quot;Actions Comments&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/actions/comments")
  Call<Void> addCardsActionsCommentsByIdCard(
                    @retrofit2.http.Body ActionsComments body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * addCardsAttachmentsByIdCard()
   * 
   * @param body Attributes of &quot;Cards Attachments&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/attachments")
  Call<Void> addCardsAttachmentsByIdCard(
                    @retrofit2.http.Body CardsAttachments body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * addCardsChecklistCheckItemByIdCardByIdChecklist()
   * 
   * @param body Attributes of &quot;Cards Checklist Check Item&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @param idChecklist idChecklist (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/checklist/{idChecklist}/checkItem")
  Call<Void> addCardsChecklistCheckItemByIdCardByIdChecklist(
                    @retrofit2.http.Body CardsChecklistCheckItem body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklist") String idChecklist            
  );

  /**
   * addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem()
   * 
   * @param idCard card id or shortlink (required)
   * @param idChecklist idChecklist (required)
   * @param idCheckItem idCheckItem (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @POST("cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/convertToCard")
  Call<Void> addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addCardsChecklistsByIdCard()
   * 
   * @param body Attributes of &quot;Cards Checklists&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/checklists")
  Call<Void> addCardsChecklistsByIdCard(
                    @retrofit2.http.Body CardsChecklists body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * addCardsIdLabelsByIdCard()
   * 
   * @param body Attributes of &quot;Cards Id Labels&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/idLabels")
  Call<Void> addCardsIdLabelsByIdCard(
                    @retrofit2.http.Body CardsIdLabels body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * addCardsIdMembersByIdCard()
   * 
   * @param body Attributes of &quot;Cards Id Members&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/idMembers")
  Call<Void> addCardsIdMembersByIdCard(
                    @retrofit2.http.Body CardsIdMembers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * addCardsLabelsByIdCard()
   * 
   * @param body Attributes of &quot;Cards Labels&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/labels")
  Call<Void> addCardsLabelsByIdCard(
                    @retrofit2.http.Body CardsLabels body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * addCardsMarkAssociatedNotificationsReadByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @POST("cards/{idCard}/markAssociatedNotificationsRead")
  Call<Void> addCardsMarkAssociatedNotificationsReadByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * addCardsMembersVotedByIdCard()
   * 
   * @param body Attributes of &quot;Cards Members Voted&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/membersVoted")
  Call<Void> addCardsMembersVotedByIdCard(
                    @retrofit2.http.Body CardsMembersVoted body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * addCardsStickersByIdCard()
   * 
   * @param body Attributes of &quot;Cards Stickers&quot; to be added. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("cards/{idCard}/stickers")
  Call<Void> addCardsStickersByIdCard(
                    @retrofit2.http.Body CardsStickers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * deleteCardsActionsCommentsByIdCardByIdAction()
   * This can only be done by the original author of the comment, or someone with higher permissions than the original author.
   * @param idCard card id or shortlink (required)
   * @param idAction idAction (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/actions/{idAction}/comments")
  Call<Void> deleteCardsActionsCommentsByIdCardByIdAction(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idAction") String idAction            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsAttachmentsByIdCardByIdAttachment()
   * 
   * @param idCard card id or shortlink (required)
   * @param idAttachment idAttachment (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/attachments/{idAttachment}")
  Call<Void> deleteCardsAttachmentsByIdCardByIdAttachment(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idAttachment") String idAttachment            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}")
  Call<Void> deleteCardsByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem()
   * 
   * @param idCard card id or shortlink (required)
   * @param idChecklist idChecklist (required)
   * @param idCheckItem idCheckItem (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}")
  Call<Void> deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsChecklistsByIdCardByIdChecklist()
   * 
   * @param idCard card id or shortlink (required)
   * @param idChecklist idChecklist (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/checklists/{idChecklist}")
  Call<Void> deleteCardsChecklistsByIdCardByIdChecklist(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklist") String idChecklist            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsIdLabelsByIdCardByIdLabel()
   * 
   * @param idCard card id or shortlink (required)
   * @param idLabel idLabel (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/idLabels/{idLabel}")
  Call<Void> deleteCardsIdLabelsByIdCardByIdLabel(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idLabel") String idLabel            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsIdMembersByIdCardByIdMember()
   * 
   * @param idCard card id or shortlink (required)
   * @param idMember idMember (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/idMembers/{idMember}")
  Call<Void> deleteCardsIdMembersByIdCardByIdMember(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsLabelsByIdCardByColor()
   * 
   * @param idCard card id or shortlink (required)
   * @param color color (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/labels/{color}")
  Call<Void> deleteCardsLabelsByIdCardByColor(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("color") String color            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsMembersVotedByIdCardByIdMember()
   * 
   * @param idCard card id or shortlink (required)
   * @param idMember idMember (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/membersVoted/{idMember}")
  Call<Void> deleteCardsMembersVotedByIdCardByIdMember(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idMember") String idMember            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * deleteCardsStickersByIdCardByIdSticker()
   * 
   * @param idCard card id or shortlink (required)
   * @param idSticker idSticker (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("cards/{idCard}/stickers/{idSticker}")
  Call<Void> deleteCardsStickersByIdCardByIdSticker(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idSticker") String idSticker            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getCardsActionsByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param entities  true or false (optional)
   * @param display  true or false (optional)
   * @param filter all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional, default to commentCard and updateCard:idList)
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
  @GET("cards/{idCard}/actions")
  Call<Void> getCardsActionsByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("entities") String entities                ,     @retrofit2.http.Query("display") String display                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("limit") String limit                ,     @retrofit2.http.Query("format") String format                ,     @retrofit2.http.Query("since") String since                ,     @retrofit2.http.Query("before") String before                ,     @retrofit2.http.Query("page") String page                ,     @retrofit2.http.Query("idModels") String idModels                ,     @retrofit2.http.Query("member") String member                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("memberCreator") String memberCreator                ,     @retrofit2.http.Query("memberCreator_fields") String memberCreatorFields                
  );

  /**
   * getCardsAttachmentsByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to all)
   * @param filter A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/attachments")
  Call<Void> getCardsAttachmentsByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                ,     @retrofit2.http.Query("filter") String filter                
  );

  /**
   * getCardsAttachmentsByIdCardByIdAttachment()
   * 
   * @param idCard card id or shortlink (required)
   * @param idAttachment idAttachment (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/attachments/{idAttachment}")
  Call<Void> getCardsAttachmentsByIdCardByIdAttachment(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idAttachment") String idAttachment            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsBoardByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/board")
  Call<Void> getCardsBoardByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsBoardByIdCardByField()
   * 
   * @param idCard card id or shortlink (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/board/{field}")
  Call<Void> getCardsBoardByIdCardByField(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getCardsByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param actions all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization (optional)
   * @param actionsEntities  true or false (optional)
   * @param actionsDisplay  true or false (optional)
   * @param actionsLimit a number from 0 to 1000 (optional, default to 50)
   * @param actionFields all or a comma-separated list of: data, date, idMemberCreator or type (optional, default to all)
   * @param actionMemberCreatorFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param attachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
   * @param attachmentFields all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url (optional, default to all)
   * @param members  true or false (optional)
   * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param membersVoted  true or false (optional)
   * @param memberVotedFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @param checkItemStates  true or false (optional)
   * @param checkItemStateFields all or a comma-separated list of: idCheckItem or state (optional, default to all)
   * @param checklists One of: all or none (optional, default to none)
   * @param checklistFields all or a comma-separated list of: idBoard, idCard, name or pos (optional, default to all)
   * @param board  true or false (optional)
   * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name, desc, descData, closed, idOrganization, pinned, url and prefs)
   * @param list  true or false (optional)
   * @param listFields all or a comma-separated list of: closed, idBoard, name, pos or subscribed (optional, default to all)
   * @param stickers  true or false (optional)
   * @param stickerFields all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex (optional, default to all)
   * @param fields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idBoard, idChecklists, idLabels, idList, idMembers, idShort, idAttachmentCover, manualCoverAttachment, labels, name, pos, shortUrl and url)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}")
  Call<Void> getCardsByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("actions") String actions                ,     @retrofit2.http.Query("actions_entities") String actionsEntities                ,     @retrofit2.http.Query("actions_display") String actionsDisplay                ,     @retrofit2.http.Query("actions_limit") String actionsLimit                ,     @retrofit2.http.Query("action_fields") String actionFields                ,     @retrofit2.http.Query("action_memberCreator_fields") String actionMemberCreatorFields                ,     @retrofit2.http.Query("attachments") String attachments                ,     @retrofit2.http.Query("attachment_fields") String attachmentFields                ,     @retrofit2.http.Query("members") String members                ,     @retrofit2.http.Query("member_fields") String memberFields                ,     @retrofit2.http.Query("membersVoted") String membersVoted                ,     @retrofit2.http.Query("memberVoted_fields") String memberVotedFields                ,     @retrofit2.http.Query("checkItemStates") String checkItemStates                ,     @retrofit2.http.Query("checkItemState_fields") String checkItemStateFields                ,     @retrofit2.http.Query("checklists") String checklists                ,     @retrofit2.http.Query("checklist_fields") String checklistFields                ,     @retrofit2.http.Query("board") String board                ,     @retrofit2.http.Query("board_fields") String boardFields                ,     @retrofit2.http.Query("list") String list                ,     @retrofit2.http.Query("list_fields") String listFields                ,     @retrofit2.http.Query("stickers") String stickers                ,     @retrofit2.http.Query("sticker_fields") String stickerFields                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsByIdCardByField()
   * 
   * @param idCard card id or shortlink (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/{field}")
  Call<Void> getCardsByIdCardByField(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getCardsCheckItemStatesByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: idCheckItem or state (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/checkItemStates")
  Call<Void> getCardsCheckItemStatesByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsChecklistsByIdCard()
   * 
   * @param idCard card id or shortlink (required)
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
  @GET("cards/{idCard}/checklists")
  Call<Void> getCardsChecklistsByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("cards") String cards                ,     @retrofit2.http.Query("card_fields") String cardFields                ,     @retrofit2.http.Query("checkItems") String checkItems                ,     @retrofit2.http.Query("checkItem_fields") String checkItemFields                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsListByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: closed, idBoard, name, pos or subscribed (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/list")
  Call<Void> getCardsListByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsListByIdCardByField()
   * 
   * @param idCard card id or shortlink (required)
   * @param field field (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/list/{field}")
  Call<Void> getCardsListByIdCardByField(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("field") String field            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                
  );

  /**
   * getCardsMembersByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/members")
  Call<Void> getCardsMembersByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsMembersVotedByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials and username)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/membersVoted")
  Call<Void> getCardsMembersVotedByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsStickersByIdCard()
   * 
   * @param idCard card id or shortlink (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/stickers")
  Call<Void> getCardsStickersByIdCard(
            @retrofit2.http.Path("idCard") String idCard            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * getCardsStickersByIdCardByIdSticker()
   * 
   * @param idCard card id or shortlink (required)
   * @param idSticker idSticker (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param fields all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex (optional, default to all)
   * @return Call&lt;Void&gt;
   */
  @GET("cards/{idCard}/stickers/{idSticker}")
  Call<Void> getCardsStickersByIdCardByIdSticker(
            @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idSticker") String idSticker            ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,     @retrofit2.http.Query("fields") String fields                
  );

  /**
   * updateCardsActionsCommentsByIdCardByIdAction()
   * This can only be done by the original author of the comment.
   * @param body Attributes of &quot;Cards Actions Comments&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @param idAction idAction (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/actions/{idAction}/comments")
  Call<Void> updateCardsActionsCommentsByIdCardByIdAction(
                    @retrofit2.http.Body CardsActionsComments body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idAction") String idAction            
  );

  /**
   * updateCardsByIdCard()
   * 
   * @param body Attributes of &quot;Cards&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}")
  Call<Void> updateCardsByIdCard(
                    @retrofit2.http.Body Cards body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem()
   * 
   * @param body Attributes of &quot;Cards Checklist Id Checklist Current Check Item&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @param idChecklistCurrent idChecklistCurrent (required)
   * @param idCheckItem idCheckItem (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/checklist/{idChecklistCurrent}/checkItem/{idCheckItem}")
  Call<Void> updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem(
                    @retrofit2.http.Body CardsChecklistIdChecklistCurrentCheckItem body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklistCurrent") String idChecklistCurrent            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            
  );

  /**
   * updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem()
   * 
   * @param body Attributes of &quot;Cards Checklist Check Item Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @param idChecklist idChecklist (required)
   * @param idCheckItem idCheckItem (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/name")
  Call<Void> updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem(
                    @retrofit2.http.Body CardsChecklistCheckItemName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            
  );

  /**
   * updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem()
   * 
   * @param body Attributes of &quot;Cards Checklist Check Item Pos&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @param idChecklist idChecklist (required)
   * @param idCheckItem idCheckItem (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/pos")
  Call<Void> updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem(
                    @retrofit2.http.Body CardsChecklistCheckItemPos body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            
  );

  /**
   * updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem()
   * 
   * @param body Attributes of &quot;Cards Checklist Check Item State&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @param idChecklist idChecklist (required)
   * @param idCheckItem idCheckItem (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/state")
  Call<Void> updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem(
                    @retrofit2.http.Body CardsChecklistCheckItemState body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idChecklist") String idChecklist            ,         @retrofit2.http.Path("idCheckItem") String idCheckItem            
  );

  /**
   * updateCardsClosedByIdCard()
   * 
   * @param body Attributes of &quot;Cards Closed&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/closed")
  Call<Void> updateCardsClosedByIdCard(
                    @retrofit2.http.Body CardsClosed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsDescByIdCard()
   * 
   * @param body Attributes of &quot;Cards Desc&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/desc")
  Call<Void> updateCardsDescByIdCard(
                    @retrofit2.http.Body CardsDesc body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsDueByIdCard()
   * 
   * @param body Attributes of &quot;Cards Due&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/due")
  Call<Void> updateCardsDueByIdCard(
                    @retrofit2.http.Body CardsDue body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsIdAttachmentCoverByIdCard()
   * 
   * @param body Attributes of &quot;Cards Id Attachment Cover&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/idAttachmentCover")
  Call<Void> updateCardsIdAttachmentCoverByIdCard(
                    @retrofit2.http.Body CardsIdAttachmentCover body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsIdBoardByIdCard()
   * 
   * @param body Attributes of &quot;Cards Id Board&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/idBoard")
  Call<Void> updateCardsIdBoardByIdCard(
                    @retrofit2.http.Body CardsIdBoard body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsIdListByIdCard()
   * 
   * @param body Attributes of &quot;Cards Id List&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/idList")
  Call<Void> updateCardsIdListByIdCard(
                    @retrofit2.http.Body CardsIdList body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsIdMembersByIdCard()
   * 
   * @param body Attributes of &quot;Cards Id Members&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/idMembers")
  Call<Void> updateCardsIdMembersByIdCard(
                    @retrofit2.http.Body CardsIdMembers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsLabelsByIdCard()
   * 
   * @param body Attributes of &quot;Cards Labels&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/labels")
  Call<Void> updateCardsLabelsByIdCard(
                    @retrofit2.http.Body CardsLabels body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsNameByIdCard()
   * 
   * @param body Attributes of &quot;Cards Name&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/name")
  Call<Void> updateCardsNameByIdCard(
                    @retrofit2.http.Body CardsName body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsPosByIdCard()
   * 
   * @param body Attributes of &quot;Cards Pos&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/pos")
  Call<Void> updateCardsPosByIdCard(
                    @retrofit2.http.Body CardsPos body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

  /**
   * updateCardsStickersByIdCardByIdSticker()
   * 
   * @param body Attributes of &quot;Cards Stickers&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @param idSticker idSticker (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/stickers/{idSticker}")
  Call<Void> updateCardsStickersByIdCardByIdSticker(
                    @retrofit2.http.Body CardsStickers body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            ,         @retrofit2.http.Path("idSticker") String idSticker            
  );

  /**
   * updateCardsSubscribedByIdCard()
   * 
   * @param body Attributes of &quot;Cards Subscribed&quot; to be updated. (required)
   * @param key &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; (required)
   * @param token &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; (required)
   * @param idCard card id or shortlink (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("cards/{idCard}/subscribed")
  Call<Void> updateCardsSubscribedByIdCard(
                    @retrofit2.http.Body CardsSubscribed body    ,     @retrofit2.http.Query("key") String key                ,     @retrofit2.http.Query("token") String token                ,         @retrofit2.http.Path("idCard") String idCard            
  );

}
