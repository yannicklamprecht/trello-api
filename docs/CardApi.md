# CardApi

All URIs are relative to *https://trello.com/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCards**](CardApi.md#addCards) | **POST** cards | addCards()
[**addCardsActionsCommentsByIdCard**](CardApi.md#addCardsActionsCommentsByIdCard) | **POST** cards/{idCard}/actions/comments | addCardsActionsCommentsByIdCard()
[**addCardsAttachmentsByIdCard**](CardApi.md#addCardsAttachmentsByIdCard) | **POST** cards/{idCard}/attachments | addCardsAttachmentsByIdCard()
[**addCardsChecklistCheckItemByIdCardByIdChecklist**](CardApi.md#addCardsChecklistCheckItemByIdCardByIdChecklist) | **POST** cards/{idCard}/checklist/{idChecklist}/checkItem | addCardsChecklistCheckItemByIdCardByIdChecklist()
[**addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem**](CardApi.md#addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem) | **POST** cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/convertToCard | addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem()
[**addCardsChecklistsByIdCard**](CardApi.md#addCardsChecklistsByIdCard) | **POST** cards/{idCard}/checklists | addCardsChecklistsByIdCard()
[**addCardsIdLabelsByIdCard**](CardApi.md#addCardsIdLabelsByIdCard) | **POST** cards/{idCard}/idLabels | addCardsIdLabelsByIdCard()
[**addCardsIdMembersByIdCard**](CardApi.md#addCardsIdMembersByIdCard) | **POST** cards/{idCard}/idMembers | addCardsIdMembersByIdCard()
[**addCardsLabelsByIdCard**](CardApi.md#addCardsLabelsByIdCard) | **POST** cards/{idCard}/labels | addCardsLabelsByIdCard()
[**addCardsMarkAssociatedNotificationsReadByIdCard**](CardApi.md#addCardsMarkAssociatedNotificationsReadByIdCard) | **POST** cards/{idCard}/markAssociatedNotificationsRead | addCardsMarkAssociatedNotificationsReadByIdCard()
[**addCardsMembersVotedByIdCard**](CardApi.md#addCardsMembersVotedByIdCard) | **POST** cards/{idCard}/membersVoted | addCardsMembersVotedByIdCard()
[**addCardsStickersByIdCard**](CardApi.md#addCardsStickersByIdCard) | **POST** cards/{idCard}/stickers | addCardsStickersByIdCard()
[**deleteCardsActionsCommentsByIdCardByIdAction**](CardApi.md#deleteCardsActionsCommentsByIdCardByIdAction) | **DELETE** cards/{idCard}/actions/{idAction}/comments | deleteCardsActionsCommentsByIdCardByIdAction()
[**deleteCardsAttachmentsByIdCardByIdAttachment**](CardApi.md#deleteCardsAttachmentsByIdCardByIdAttachment) | **DELETE** cards/{idCard}/attachments/{idAttachment} | deleteCardsAttachmentsByIdCardByIdAttachment()
[**deleteCardsByIdCard**](CardApi.md#deleteCardsByIdCard) | **DELETE** cards/{idCard} | deleteCardsByIdCard()
[**deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem**](CardApi.md#deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem) | **DELETE** cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem} | deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem()
[**deleteCardsChecklistsByIdCardByIdChecklist**](CardApi.md#deleteCardsChecklistsByIdCardByIdChecklist) | **DELETE** cards/{idCard}/checklists/{idChecklist} | deleteCardsChecklistsByIdCardByIdChecklist()
[**deleteCardsIdLabelsByIdCardByIdLabel**](CardApi.md#deleteCardsIdLabelsByIdCardByIdLabel) | **DELETE** cards/{idCard}/idLabels/{idLabel} | deleteCardsIdLabelsByIdCardByIdLabel()
[**deleteCardsIdMembersByIdCardByIdMember**](CardApi.md#deleteCardsIdMembersByIdCardByIdMember) | **DELETE** cards/{idCard}/idMembers/{idMember} | deleteCardsIdMembersByIdCardByIdMember()
[**deleteCardsLabelsByIdCardByColor**](CardApi.md#deleteCardsLabelsByIdCardByColor) | **DELETE** cards/{idCard}/labels/{color} | deleteCardsLabelsByIdCardByColor()
[**deleteCardsMembersVotedByIdCardByIdMember**](CardApi.md#deleteCardsMembersVotedByIdCardByIdMember) | **DELETE** cards/{idCard}/membersVoted/{idMember} | deleteCardsMembersVotedByIdCardByIdMember()
[**deleteCardsStickersByIdCardByIdSticker**](CardApi.md#deleteCardsStickersByIdCardByIdSticker) | **DELETE** cards/{idCard}/stickers/{idSticker} | deleteCardsStickersByIdCardByIdSticker()
[**getCardsActionsByIdCard**](CardApi.md#getCardsActionsByIdCard) | **GET** cards/{idCard}/actions | getCardsActionsByIdCard()
[**getCardsAttachmentsByIdCard**](CardApi.md#getCardsAttachmentsByIdCard) | **GET** cards/{idCard}/attachments | getCardsAttachmentsByIdCard()
[**getCardsAttachmentsByIdCardByIdAttachment**](CardApi.md#getCardsAttachmentsByIdCardByIdAttachment) | **GET** cards/{idCard}/attachments/{idAttachment} | getCardsAttachmentsByIdCardByIdAttachment()
[**getCardsBoardByIdCard**](CardApi.md#getCardsBoardByIdCard) | **GET** cards/{idCard}/board | getCardsBoardByIdCard()
[**getCardsBoardByIdCardByField**](CardApi.md#getCardsBoardByIdCardByField) | **GET** cards/{idCard}/board/{field} | getCardsBoardByIdCardByField()
[**getCardsByIdCard**](CardApi.md#getCardsByIdCard) | **GET** cards/{idCard} | getCardsByIdCard()
[**getCardsByIdCardByField**](CardApi.md#getCardsByIdCardByField) | **GET** cards/{idCard}/{field} | getCardsByIdCardByField()
[**getCardsCheckItemStatesByIdCard**](CardApi.md#getCardsCheckItemStatesByIdCard) | **GET** cards/{idCard}/checkItemStates | getCardsCheckItemStatesByIdCard()
[**getCardsChecklistsByIdCard**](CardApi.md#getCardsChecklistsByIdCard) | **GET** cards/{idCard}/checklists | getCardsChecklistsByIdCard()
[**getCardsListByIdCard**](CardApi.md#getCardsListByIdCard) | **GET** cards/{idCard}/list | getCardsListByIdCard()
[**getCardsListByIdCardByField**](CardApi.md#getCardsListByIdCardByField) | **GET** cards/{idCard}/list/{field} | getCardsListByIdCardByField()
[**getCardsMembersByIdCard**](CardApi.md#getCardsMembersByIdCard) | **GET** cards/{idCard}/members | getCardsMembersByIdCard()
[**getCardsMembersVotedByIdCard**](CardApi.md#getCardsMembersVotedByIdCard) | **GET** cards/{idCard}/membersVoted | getCardsMembersVotedByIdCard()
[**getCardsStickersByIdCard**](CardApi.md#getCardsStickersByIdCard) | **GET** cards/{idCard}/stickers | getCardsStickersByIdCard()
[**getCardsStickersByIdCardByIdSticker**](CardApi.md#getCardsStickersByIdCardByIdSticker) | **GET** cards/{idCard}/stickers/{idSticker} | getCardsStickersByIdCardByIdSticker()
[**updateCardsActionsCommentsByIdCardByIdAction**](CardApi.md#updateCardsActionsCommentsByIdCardByIdAction) | **PUT** cards/{idCard}/actions/{idAction}/comments | updateCardsActionsCommentsByIdCardByIdAction()
[**updateCardsByIdCard**](CardApi.md#updateCardsByIdCard) | **PUT** cards/{idCard} | updateCardsByIdCard()
[**updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem**](CardApi.md#updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem) | **PUT** cards/{idCard}/checklist/{idChecklistCurrent}/checkItem/{idCheckItem} | updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem()
[**updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem**](CardApi.md#updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem) | **PUT** cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/name | updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem()
[**updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem**](CardApi.md#updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem) | **PUT** cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/pos | updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem()
[**updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem**](CardApi.md#updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem) | **PUT** cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/state | updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem()
[**updateCardsClosedByIdCard**](CardApi.md#updateCardsClosedByIdCard) | **PUT** cards/{idCard}/closed | updateCardsClosedByIdCard()
[**updateCardsDescByIdCard**](CardApi.md#updateCardsDescByIdCard) | **PUT** cards/{idCard}/desc | updateCardsDescByIdCard()
[**updateCardsDueByIdCard**](CardApi.md#updateCardsDueByIdCard) | **PUT** cards/{idCard}/due | updateCardsDueByIdCard()
[**updateCardsIdAttachmentCoverByIdCard**](CardApi.md#updateCardsIdAttachmentCoverByIdCard) | **PUT** cards/{idCard}/idAttachmentCover | updateCardsIdAttachmentCoverByIdCard()
[**updateCardsIdBoardByIdCard**](CardApi.md#updateCardsIdBoardByIdCard) | **PUT** cards/{idCard}/idBoard | updateCardsIdBoardByIdCard()
[**updateCardsIdListByIdCard**](CardApi.md#updateCardsIdListByIdCard) | **PUT** cards/{idCard}/idList | updateCardsIdListByIdCard()
[**updateCardsIdMembersByIdCard**](CardApi.md#updateCardsIdMembersByIdCard) | **PUT** cards/{idCard}/idMembers | updateCardsIdMembersByIdCard()
[**updateCardsLabelsByIdCard**](CardApi.md#updateCardsLabelsByIdCard) | **PUT** cards/{idCard}/labels | updateCardsLabelsByIdCard()
[**updateCardsNameByIdCard**](CardApi.md#updateCardsNameByIdCard) | **PUT** cards/{idCard}/name | updateCardsNameByIdCard()
[**updateCardsPosByIdCard**](CardApi.md#updateCardsPosByIdCard) | **PUT** cards/{idCard}/pos | updateCardsPosByIdCard()
[**updateCardsStickersByIdCardByIdSticker**](CardApi.md#updateCardsStickersByIdCardByIdSticker) | **PUT** cards/{idCard}/stickers/{idSticker} | updateCardsStickersByIdCardByIdSticker()
[**updateCardsSubscribedByIdCard**](CardApi.md#updateCardsSubscribedByIdCard) | **PUT** cards/{idCard}/subscribed | updateCardsSubscribedByIdCard()

<a name="addCards"></a>
# **addCards**
> Void addCards(body, key, token)

addCards()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Cards body = new Cards(); // Cards | Attributes of "Cards" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addCards(body, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Cards**](Cards.md)| Attributes of &quot;Cards&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsActionsCommentsByIdCard"></a>
# **addCardsActionsCommentsByIdCard**
> Void addCardsActionsCommentsByIdCard(body, key, token, idCard)

addCardsActionsCommentsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
ActionsComments body = new ActionsComments(); // ActionsComments | Attributes of "Actions Comments" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsActionsCommentsByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsActionsCommentsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActionsComments**](ActionsComments.md)| Attributes of &quot;Actions Comments&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsAttachmentsByIdCard"></a>
# **addCardsAttachmentsByIdCard**
> Void addCardsAttachmentsByIdCard(body, key, token, idCard)

addCardsAttachmentsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsAttachments body = new CardsAttachments(); // CardsAttachments | Attributes of "Cards Attachments" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsAttachmentsByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsAttachmentsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsAttachments**](CardsAttachments.md)| Attributes of &quot;Cards Attachments&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsChecklistCheckItemByIdCardByIdChecklist"></a>
# **addCardsChecklistCheckItemByIdCardByIdChecklist**
> Void addCardsChecklistCheckItemByIdCardByIdChecklist(body, key, token, idCard, idChecklist)

addCardsChecklistCheckItemByIdCardByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsChecklistCheckItem body = new CardsChecklistCheckItem(); // CardsChecklistCheckItem | Attributes of "Cards Checklist Check Item" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklist = "idChecklist_example"; // String | idChecklist
try {
    Void result = apiInstance.addCardsChecklistCheckItemByIdCardByIdChecklist(body, key, token, idCard, idChecklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsChecklistCheckItemByIdCardByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsChecklistCheckItem**](CardsChecklistCheckItem.md)| Attributes of &quot;Cards Checklist Check Item&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |
 **idChecklist** | **String**| idChecklist |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem"></a>
# **addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem**
> Void addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem(idCard, idChecklist, idCheckItem, key, token)

addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklist = "idChecklist_example"; // String | idChecklist
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem(idCard, idChecklist, idCheckItem, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idChecklist** | **String**| idChecklist |
 **idCheckItem** | **String**| idCheckItem |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addCardsChecklistsByIdCard"></a>
# **addCardsChecklistsByIdCard**
> Void addCardsChecklistsByIdCard(body, key, token, idCard)

addCardsChecklistsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsChecklists body = new CardsChecklists(); // CardsChecklists | Attributes of "Cards Checklists" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsChecklistsByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsChecklistsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsChecklists**](CardsChecklists.md)| Attributes of &quot;Cards Checklists&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsIdLabelsByIdCard"></a>
# **addCardsIdLabelsByIdCard**
> Void addCardsIdLabelsByIdCard(body, key, token, idCard)

addCardsIdLabelsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsIdLabels body = new CardsIdLabels(); // CardsIdLabels | Attributes of "Cards Id Labels" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsIdLabelsByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsIdLabelsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsIdLabels**](CardsIdLabels.md)| Attributes of &quot;Cards Id Labels&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsIdMembersByIdCard"></a>
# **addCardsIdMembersByIdCard**
> Void addCardsIdMembersByIdCard(body, key, token, idCard)

addCardsIdMembersByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsIdMembers body = new CardsIdMembers(); // CardsIdMembers | Attributes of "Cards Id Members" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsIdMembersByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsIdMembersByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsIdMembers**](CardsIdMembers.md)| Attributes of &quot;Cards Id Members&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsLabelsByIdCard"></a>
# **addCardsLabelsByIdCard**
> Void addCardsLabelsByIdCard(body, key, token, idCard)

addCardsLabelsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsLabels body = new CardsLabels(); // CardsLabels | Attributes of "Cards Labels" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsLabelsByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsLabelsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsLabels**](CardsLabels.md)| Attributes of &quot;Cards Labels&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsMarkAssociatedNotificationsReadByIdCard"></a>
# **addCardsMarkAssociatedNotificationsReadByIdCard**
> Void addCardsMarkAssociatedNotificationsReadByIdCard(idCard, key, token)

addCardsMarkAssociatedNotificationsReadByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addCardsMarkAssociatedNotificationsReadByIdCard(idCard, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsMarkAssociatedNotificationsReadByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addCardsMembersVotedByIdCard"></a>
# **addCardsMembersVotedByIdCard**
> Void addCardsMembersVotedByIdCard(body, key, token, idCard)

addCardsMembersVotedByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsMembersVoted body = new CardsMembersVoted(); // CardsMembersVoted | Attributes of "Cards Members Voted" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsMembersVotedByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsMembersVotedByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsMembersVoted**](CardsMembersVoted.md)| Attributes of &quot;Cards Members Voted&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addCardsStickersByIdCard"></a>
# **addCardsStickersByIdCard**
> Void addCardsStickersByIdCard(body, key, token, idCard)

addCardsStickersByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsStickers body = new CardsStickers(); // CardsStickers | Attributes of "Cards Stickers" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.addCardsStickersByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#addCardsStickersByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsStickers**](CardsStickers.md)| Attributes of &quot;Cards Stickers&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="deleteCardsActionsCommentsByIdCardByIdAction"></a>
# **deleteCardsActionsCommentsByIdCardByIdAction**
> Void deleteCardsActionsCommentsByIdCardByIdAction(idCard, idAction, key, token)

deleteCardsActionsCommentsByIdCardByIdAction()

This can only be done by the original author of the comment, or someone with higher permissions than the original author.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idAction = "idAction_example"; // String | idAction
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsActionsCommentsByIdCardByIdAction(idCard, idAction, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsActionsCommentsByIdCardByIdAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idAction** | **String**| idAction |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsAttachmentsByIdCardByIdAttachment"></a>
# **deleteCardsAttachmentsByIdCardByIdAttachment**
> Void deleteCardsAttachmentsByIdCardByIdAttachment(idCard, idAttachment, key, token)

deleteCardsAttachmentsByIdCardByIdAttachment()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idAttachment = "idAttachment_example"; // String | idAttachment
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsAttachmentsByIdCardByIdAttachment(idCard, idAttachment, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsAttachmentsByIdCardByIdAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idAttachment** | **String**| idAttachment |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsByIdCard"></a>
# **deleteCardsByIdCard**
> Void deleteCardsByIdCard(idCard, key, token)

deleteCardsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsByIdCard(idCard, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem"></a>
# **deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem**
> Void deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem(idCard, idChecklist, idCheckItem, key, token)

deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklist = "idChecklist_example"; // String | idChecklist
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem(idCard, idChecklist, idCheckItem, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idChecklist** | **String**| idChecklist |
 **idCheckItem** | **String**| idCheckItem |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsChecklistsByIdCardByIdChecklist"></a>
# **deleteCardsChecklistsByIdCardByIdChecklist**
> Void deleteCardsChecklistsByIdCardByIdChecklist(idCard, idChecklist, key, token)

deleteCardsChecklistsByIdCardByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklist = "idChecklist_example"; // String | idChecklist
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsChecklistsByIdCardByIdChecklist(idCard, idChecklist, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsChecklistsByIdCardByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idChecklist** | **String**| idChecklist |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsIdLabelsByIdCardByIdLabel"></a>
# **deleteCardsIdLabelsByIdCardByIdLabel**
> Void deleteCardsIdLabelsByIdCardByIdLabel(idCard, idLabel, key, token)

deleteCardsIdLabelsByIdCardByIdLabel()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idLabel = "idLabel_example"; // String | idLabel
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsIdLabelsByIdCardByIdLabel(idCard, idLabel, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsIdLabelsByIdCardByIdLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idLabel** | **String**| idLabel |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsIdMembersByIdCardByIdMember"></a>
# **deleteCardsIdMembersByIdCardByIdMember**
> Void deleteCardsIdMembersByIdCardByIdMember(idCard, idMember, key, token)

deleteCardsIdMembersByIdCardByIdMember()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idMember = "idMember_example"; // String | idMember
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsIdMembersByIdCardByIdMember(idCard, idMember, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsIdMembersByIdCardByIdMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idMember** | **String**| idMember |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsLabelsByIdCardByColor"></a>
# **deleteCardsLabelsByIdCardByColor**
> Void deleteCardsLabelsByIdCardByColor(idCard, color, key, token)

deleteCardsLabelsByIdCardByColor()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String color = "color_example"; // String | color
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsLabelsByIdCardByColor(idCard, color, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsLabelsByIdCardByColor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **color** | **String**| color |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsMembersVotedByIdCardByIdMember"></a>
# **deleteCardsMembersVotedByIdCardByIdMember**
> Void deleteCardsMembersVotedByIdCardByIdMember(idCard, idMember, key, token)

deleteCardsMembersVotedByIdCardByIdMember()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idMember = "idMember_example"; // String | idMember
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsMembersVotedByIdCardByIdMember(idCard, idMember, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsMembersVotedByIdCardByIdMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idMember** | **String**| idMember |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCardsStickersByIdCardByIdSticker"></a>
# **deleteCardsStickersByIdCardByIdSticker**
> Void deleteCardsStickersByIdCardByIdSticker(idCard, idSticker, key, token)

deleteCardsStickersByIdCardByIdSticker()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idSticker = "idSticker_example"; // String | idSticker
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteCardsStickersByIdCardByIdSticker(idCard, idSticker, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardsStickersByIdCardByIdSticker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idSticker** | **String**| idSticker |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsActionsByIdCard"></a>
# **getCardsActionsByIdCard**
> Void getCardsActionsByIdCard(idCard, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields)

getCardsActionsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String entities = "entities_example"; // String |  true or false
String display = "display_example"; // String |  true or false
String filter = "commentCard and updateCard:idList"; // String | all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
String fields = "all"; // String | all or a comma-separated list of: data, date, idMemberCreator or type
String limit = "50"; // String | a number from 0 to 1000
String format = "list"; // String | One of: count, list or minimal
String since = "since_example"; // String | A date, null or lastView
String before = "before_example"; // String | A date, or null
String page = "0"; // String | Page * limit must be less than 1000
String idModels = "idModels_example"; // String | Only return actions related to these model ids
String member = "member_example"; // String |  true or false
String memberFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String memberCreator = "memberCreator_example"; // String |  true or false
String memberCreatorFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
try {
    Void result = apiInstance.getCardsActionsByIdCard(idCard, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsActionsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **entities** | **String**|  true or false | [optional]
 **display** | **String**|  true or false | [optional]
 **filter** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] [default to commentCard and updateCard:idList]
 **fields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all]
 **limit** | **String**| a number from 0 to 1000 | [optional] [default to 50]
 **format** | **String**| One of: count, list or minimal | [optional] [default to list]
 **since** | **String**| A date, null or lastView | [optional]
 **before** | **String**| A date, or null | [optional]
 **page** | **String**| Page * limit must be less than 1000 | [optional] [default to 0]
 **idModels** | **String**| Only return actions related to these model ids | [optional]
 **member** | **String**|  true or false | [optional]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **memberCreator** | **String**|  true or false | [optional]
 **memberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsAttachmentsByIdCard"></a>
# **getCardsAttachmentsByIdCard**
> Void getCardsAttachmentsByIdCard(idCard, key, token, fields, filter)

getCardsAttachmentsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
String filter = "filter_example"; // String | A boolean value or &quot;cover&quot; for only card cover attachments
try {
    Void result = apiInstance.getCardsAttachmentsByIdCard(idCard, key, token, fields, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsAttachmentsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all]
 **filter** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsAttachmentsByIdCardByIdAttachment"></a>
# **getCardsAttachmentsByIdCardByIdAttachment**
> Void getCardsAttachmentsByIdCardByIdAttachment(idCard, idAttachment, key, token, fields)

getCardsAttachmentsByIdCardByIdAttachment()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idAttachment = "idAttachment_example"; // String | idAttachment
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
try {
    Void result = apiInstance.getCardsAttachmentsByIdCardByIdAttachment(idCard, idAttachment, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsAttachmentsByIdCardByIdAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idAttachment** | **String**| idAttachment |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsBoardByIdCard"></a>
# **getCardsBoardByIdCard**
> Void getCardsBoardByIdCard(idCard, key, token, fields)

getCardsBoardByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
try {
    Void result = apiInstance.getCardsBoardByIdCard(idCard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsBoardByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsBoardByIdCardByField"></a>
# **getCardsBoardByIdCardByField**
> Void getCardsBoardByIdCardByField(idCard, field, key, token)

getCardsBoardByIdCardByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getCardsBoardByIdCardByField(idCard, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsBoardByIdCardByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **field** | **String**| field |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsByIdCard"></a>
# **getCardsByIdCard**
> Void getCardsByIdCard(idCard, key, token, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, actionMemberCreatorFields, attachments, attachmentFields, members, memberFields, membersVoted, memberVotedFields, checkItemStates, checkItemStateFields, checklists, checklistFields, board, boardFields, list, listFields, stickers, stickerFields, fields)

getCardsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String actions = "actions_example"; // String | all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
String actionsEntities = "actionsEntities_example"; // String |  true or false
String actionsDisplay = "actionsDisplay_example"; // String |  true or false
String actionsLimit = "50"; // String | a number from 0 to 1000
String actionFields = "all"; // String | all or a comma-separated list of: data, date, idMemberCreator or type
String actionMemberCreatorFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String attachments = "attachments_example"; // String | A boolean value or &quot;cover&quot; for only card cover attachments
String attachmentFields = "all"; // String | all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
String members = "members_example"; // String |  true or false
String memberFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String membersVoted = "membersVoted_example"; // String |  true or false
String memberVotedFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String checkItemStates = "checkItemStates_example"; // String |  true or false
String checkItemStateFields = "all"; // String | all or a comma-separated list of: idCheckItem or state
String checklists = "none"; // String | One of: all or none
String checklistFields = "all"; // String | all or a comma-separated list of: idBoard, idCard, name or pos
String board = "board_example"; // String |  true or false
String boardFields = "name, desc, descData, closed, idOrganization, pinned, url and prefs"; // String | all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
String list = "list_example"; // String |  true or false
String listFields = "all"; // String | all or a comma-separated list of: closed, idBoard, name, pos or subscribed
String stickers = "stickers_example"; // String |  true or false
String stickerFields = "all"; // String | all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex
String fields = "badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idBoard, idChecklists, idLabels, idList, idMembers, idShort, idAttachmentCover, manualCoverAttachment, labels, name, pos, shortUrl and url"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
try {
    Void result = apiInstance.getCardsByIdCard(idCard, key, token, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, actionMemberCreatorFields, attachments, attachmentFields, members, memberFields, membersVoted, memberVotedFields, checkItemStates, checkItemStateFields, checklists, checklistFields, board, boardFields, list, listFields, stickers, stickerFields, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional]
 **actionsEntities** | **String**|  true or false | [optional]
 **actionsDisplay** | **String**|  true or false | [optional]
 **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50]
 **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all]
 **actionMemberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional]
 **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all]
 **members** | **String**|  true or false | [optional]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **membersVoted** | **String**|  true or false | [optional]
 **memberVotedFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **checkItemStates** | **String**|  true or false | [optional]
 **checkItemStateFields** | **String**| all or a comma-separated list of: idCheckItem or state | [optional] [default to all]
 **checklists** | **String**| One of: all or none | [optional] [default to none]
 **checklistFields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all]
 **board** | **String**|  true or false | [optional]
 **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, desc, descData, closed, idOrganization, pinned, url and prefs]
 **list** | **String**|  true or false | [optional]
 **listFields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all]
 **stickers** | **String**|  true or false | [optional]
 **stickerFields** | **String**| all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex | [optional] [default to all]
 **fields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idBoard, idChecklists, idLabels, idList, idMembers, idShort, idAttachmentCover, manualCoverAttachment, labels, name, pos, shortUrl and url]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsByIdCardByField"></a>
# **getCardsByIdCardByField**
> Void getCardsByIdCardByField(idCard, field, key, token)

getCardsByIdCardByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardApi;


CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getCardsByIdCardByField(idCard, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsByIdCardByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **field** | **String**| field |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsCheckItemStatesByIdCard"></a>
# **getCardsCheckItemStatesByIdCard**
> Void getCardsCheckItemStatesByIdCard(idCard, key, token, fields)

getCardsCheckItemStatesByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: idCheckItem or state
try {
    Void result = apiInstance.getCardsCheckItemStatesByIdCard(idCard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsCheckItemStatesByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: idCheckItem or state | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsChecklistsByIdCard"></a>
# **getCardsChecklistsByIdCard**
> Void getCardsChecklistsByIdCard(idCard, key, token, cards, cardFields, checkItems, checkItemFields, filter, fields)

getCardsChecklistsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String cards = "none"; // String | One of: all, closed, none, open or visible
String cardFields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
String checkItems = "all"; // String | One of: all or none
String checkItemFields = "name, nameData, pos and state"; // String | all or a comma-separated list of: name, nameData, pos, state or type
String filter = "all"; // String | One of: all or none
String fields = "all"; // String | all or a comma-separated list of: idBoard, idCard, name or pos
try {
    Void result = apiInstance.getCardsChecklistsByIdCard(idCard, key, token, cards, cardFields, checkItems, checkItemFields, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsChecklistsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none]
 **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]
 **checkItems** | **String**| One of: all or none | [optional] [default to all]
 **checkItemFields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state]
 **filter** | **String**| One of: all or none | [optional] [default to all]
 **fields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsListByIdCard"></a>
# **getCardsListByIdCard**
> Void getCardsListByIdCard(idCard, key, token, fields)

getCardsListByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: closed, idBoard, name, pos or subscribed
try {
    Void result = apiInstance.getCardsListByIdCard(idCard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsListByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsListByIdCardByField"></a>
# **getCardsListByIdCardByField**
> Void getCardsListByIdCardByField(idCard, field, key, token)

getCardsListByIdCardByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getCardsListByIdCardByField(idCard, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsListByIdCardByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **field** | **String**| field |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsMembersByIdCard"></a>
# **getCardsMembersByIdCard**
> Void getCardsMembersByIdCard(idCard, key, token, fields)

getCardsMembersByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
try {
    Void result = apiInstance.getCardsMembersByIdCard(idCard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsMembersByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsMembersVotedByIdCard"></a>
# **getCardsMembersVotedByIdCard**
> Void getCardsMembersVotedByIdCard(idCard, key, token, fields)

getCardsMembersVotedByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
try {
    Void result = apiInstance.getCardsMembersVotedByIdCard(idCard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsMembersVotedByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsStickersByIdCard"></a>
# **getCardsStickersByIdCard**
> Void getCardsStickersByIdCard(idCard, key, token, fields)

getCardsStickersByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex
try {
    Void result = apiInstance.getCardsStickersByIdCard(idCard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsStickersByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCardsStickersByIdCardByIdSticker"></a>
# **getCardsStickersByIdCardByIdSticker**
> Void getCardsStickersByIdCardByIdSticker(idCard, idSticker, key, token, fields)

getCardsStickersByIdCardByIdSticker()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
String idCard = "idCard_example"; // String | card id or shortlink
String idSticker = "idSticker_example"; // String | idSticker
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex
try {
    Void result = apiInstance.getCardsStickersByIdCardByIdSticker(idCard, idSticker, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardsStickersByIdCardByIdSticker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCard** | **String**| card id or shortlink |
 **idSticker** | **String**| idSticker |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCardsActionsCommentsByIdCardByIdAction"></a>
# **updateCardsActionsCommentsByIdCardByIdAction**
> Void updateCardsActionsCommentsByIdCardByIdAction(body, key, token, idCard, idAction)

updateCardsActionsCommentsByIdCardByIdAction()

This can only be done by the original author of the comment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsActionsComments body = new CardsActionsComments(); // CardsActionsComments | Attributes of "Cards Actions Comments" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
String idAction = "idAction_example"; // String | idAction
try {
    Void result = apiInstance.updateCardsActionsCommentsByIdCardByIdAction(body, key, token, idCard, idAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsActionsCommentsByIdCardByIdAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsActionsComments**](CardsActionsComments.md)| Attributes of &quot;Cards Actions Comments&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |
 **idAction** | **String**| idAction |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsByIdCard"></a>
# **updateCardsByIdCard**
> Void updateCardsByIdCard(body, key, token, idCard)

updateCardsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
Cards body = new Cards(); // Cards | Attributes of "Cards" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Cards**](Cards.md)| Attributes of &quot;Cards&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem"></a>
# **updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem**
> Void updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem(body, key, token, idCard, idChecklistCurrent, idCheckItem)

updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsChecklistIdChecklistCurrentCheckItem body = new CardsChecklistIdChecklistCurrentCheckItem(); // CardsChecklistIdChecklistCurrentCheckItem | Attributes of "Cards Checklist Id Checklist Current Check Item" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklistCurrent = "idChecklistCurrent_example"; // String | idChecklistCurrent
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
try {
    Void result = apiInstance.updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem(body, key, token, idCard, idChecklistCurrent, idCheckItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsChecklistIdChecklistCurrentCheckItem**](CardsChecklistIdChecklistCurrentCheckItem.md)| Attributes of &quot;Cards Checklist Id Checklist Current Check Item&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |
 **idChecklistCurrent** | **String**| idChecklistCurrent |
 **idCheckItem** | **String**| idCheckItem |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem"></a>
# **updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem**
> Void updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem)

updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsChecklistCheckItemName body = new CardsChecklistCheckItemName(); // CardsChecklistCheckItemName | Attributes of "Cards Checklist Check Item Name" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklist = "idChecklist_example"; // String | idChecklist
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
try {
    Void result = apiInstance.updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsChecklistCheckItemName**](CardsChecklistCheckItemName.md)| Attributes of &quot;Cards Checklist Check Item Name&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |
 **idChecklist** | **String**| idChecklist |
 **idCheckItem** | **String**| idCheckItem |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem"></a>
# **updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem**
> Void updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem)

updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsChecklistCheckItemPos body = new CardsChecklistCheckItemPos(); // CardsChecklistCheckItemPos | Attributes of "Cards Checklist Check Item Pos" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklist = "idChecklist_example"; // String | idChecklist
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
try {
    Void result = apiInstance.updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsChecklistCheckItemPos**](CardsChecklistCheckItemPos.md)| Attributes of &quot;Cards Checklist Check Item Pos&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |
 **idChecklist** | **String**| idChecklist |
 **idCheckItem** | **String**| idCheckItem |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem"></a>
# **updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem**
> Void updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem)

updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsChecklistCheckItemState body = new CardsChecklistCheckItemState(); // CardsChecklistCheckItemState | Attributes of "Cards Checklist Check Item State" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
String idChecklist = "idChecklist_example"; // String | idChecklist
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
try {
    Void result = apiInstance.updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem(body, key, token, idCard, idChecklist, idCheckItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsChecklistCheckItemState**](CardsChecklistCheckItemState.md)| Attributes of &quot;Cards Checklist Check Item State&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |
 **idChecklist** | **String**| idChecklist |
 **idCheckItem** | **String**| idCheckItem |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsClosedByIdCard"></a>
# **updateCardsClosedByIdCard**
> Void updateCardsClosedByIdCard(body, key, token, idCard)

updateCardsClosedByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsClosed body = new CardsClosed(); // CardsClosed | Attributes of "Cards Closed" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsClosedByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsClosedByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsClosed**](CardsClosed.md)| Attributes of &quot;Cards Closed&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsDescByIdCard"></a>
# **updateCardsDescByIdCard**
> Void updateCardsDescByIdCard(body, key, token, idCard)

updateCardsDescByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsDesc body = new CardsDesc(); // CardsDesc | Attributes of "Cards Desc" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsDescByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsDescByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsDesc**](CardsDesc.md)| Attributes of &quot;Cards Desc&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsDueByIdCard"></a>
# **updateCardsDueByIdCard**
> Void updateCardsDueByIdCard(body, key, token, idCard)

updateCardsDueByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsDue body = new CardsDue(); // CardsDue | Attributes of "Cards Due" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsDueByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsDueByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsDue**](CardsDue.md)| Attributes of &quot;Cards Due&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsIdAttachmentCoverByIdCard"></a>
# **updateCardsIdAttachmentCoverByIdCard**
> Void updateCardsIdAttachmentCoverByIdCard(body, key, token, idCard)

updateCardsIdAttachmentCoverByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsIdAttachmentCover body = new CardsIdAttachmentCover(); // CardsIdAttachmentCover | Attributes of "Cards Id Attachment Cover" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsIdAttachmentCoverByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsIdAttachmentCoverByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsIdAttachmentCover**](CardsIdAttachmentCover.md)| Attributes of &quot;Cards Id Attachment Cover&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsIdBoardByIdCard"></a>
# **updateCardsIdBoardByIdCard**
> Void updateCardsIdBoardByIdCard(body, key, token, idCard)

updateCardsIdBoardByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsIdBoard body = new CardsIdBoard(); // CardsIdBoard | Attributes of "Cards Id Board" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsIdBoardByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsIdBoardByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsIdBoard**](CardsIdBoard.md)| Attributes of &quot;Cards Id Board&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsIdListByIdCard"></a>
# **updateCardsIdListByIdCard**
> Void updateCardsIdListByIdCard(body, key, token, idCard)

updateCardsIdListByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsIdList body = new CardsIdList(); // CardsIdList | Attributes of "Cards Id List" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsIdListByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsIdListByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsIdList**](CardsIdList.md)| Attributes of &quot;Cards Id List&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsIdMembersByIdCard"></a>
# **updateCardsIdMembersByIdCard**
> Void updateCardsIdMembersByIdCard(body, key, token, idCard)

updateCardsIdMembersByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsIdMembers body = new CardsIdMembers(); // CardsIdMembers | Attributes of "Cards Id Members" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsIdMembersByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsIdMembersByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsIdMembers**](CardsIdMembers.md)| Attributes of &quot;Cards Id Members&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsLabelsByIdCard"></a>
# **updateCardsLabelsByIdCard**
> Void updateCardsLabelsByIdCard(body, key, token, idCard)

updateCardsLabelsByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsLabels body = new CardsLabels(); // CardsLabels | Attributes of "Cards Labels" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsLabelsByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsLabelsByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsLabels**](CardsLabels.md)| Attributes of &quot;Cards Labels&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsNameByIdCard"></a>
# **updateCardsNameByIdCard**
> Void updateCardsNameByIdCard(body, key, token, idCard)

updateCardsNameByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsName body = new CardsName(); // CardsName | Attributes of "Cards Name" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsNameByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsNameByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsName**](CardsName.md)| Attributes of &quot;Cards Name&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsPosByIdCard"></a>
# **updateCardsPosByIdCard**
> Void updateCardsPosByIdCard(body, key, token, idCard)

updateCardsPosByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsPos body = new CardsPos(); // CardsPos | Attributes of "Cards Pos" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsPosByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsPosByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsPos**](CardsPos.md)| Attributes of &quot;Cards Pos&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsStickersByIdCardByIdSticker"></a>
# **updateCardsStickersByIdCardByIdSticker**
> Void updateCardsStickersByIdCardByIdSticker(body, key, token, idCard, idSticker)

updateCardsStickersByIdCardByIdSticker()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsStickers body = new CardsStickers(); // CardsStickers | Attributes of "Cards Stickers" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
String idSticker = "idSticker_example"; // String | idSticker
try {
    Void result = apiInstance.updateCardsStickersByIdCardByIdSticker(body, key, token, idCard, idSticker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsStickersByIdCardByIdSticker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsStickers**](CardsStickers.md)| Attributes of &quot;Cards Stickers&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |
 **idSticker** | **String**| idSticker |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateCardsSubscribedByIdCard"></a>
# **updateCardsSubscribedByIdCard**
> Void updateCardsSubscribedByIdCard(body, key, token, idCard)

updateCardsSubscribedByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure API key authorization: api_token
ApiKeyAuth api_token = (ApiKeyAuth) defaultClient.getAuthentication("api_token");
api_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_token.setApiKeyPrefix("Token");

CardApi apiInstance = new CardApi();
CardsSubscribed body = new CardsSubscribed(); // CardsSubscribed | Attributes of "Cards Subscribed" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idCard = "idCard_example"; // String | card id or shortlink
try {
    Void result = apiInstance.updateCardsSubscribedByIdCard(body, key, token, idCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardsSubscribedByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardsSubscribed**](CardsSubscribed.md)| Attributes of &quot;Cards Subscribed&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idCard** | **String**| card id or shortlink |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

