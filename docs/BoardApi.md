# BoardApi

All URIs are relative to *https://trello.com/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBoards**](BoardApi.md#addBoards) | **POST** boards | addBoards()
[**addBoardsCalendarKeyGenerateByIdBoard**](BoardApi.md#addBoardsCalendarKeyGenerateByIdBoard) | **POST** boards/{idBoard}/calendarKey/generate | addBoardsCalendarKeyGenerateByIdBoard()
[**addBoardsChecklistsByIdBoard**](BoardApi.md#addBoardsChecklistsByIdBoard) | **POST** boards/{idBoard}/checklists | addBoardsChecklistsByIdBoard()
[**addBoardsEmailKeyGenerateByIdBoard**](BoardApi.md#addBoardsEmailKeyGenerateByIdBoard) | **POST** boards/{idBoard}/emailKey/generate | addBoardsEmailKeyGenerateByIdBoard()
[**addBoardsLabelsByIdBoard**](BoardApi.md#addBoardsLabelsByIdBoard) | **POST** boards/{idBoard}/labels | addBoardsLabelsByIdBoard()
[**addBoardsListsByIdBoard**](BoardApi.md#addBoardsListsByIdBoard) | **POST** boards/{idBoard}/lists | addBoardsListsByIdBoard()
[**addBoardsMarkAsViewedByIdBoard**](BoardApi.md#addBoardsMarkAsViewedByIdBoard) | **POST** boards/{idBoard}/markAsViewed | addBoardsMarkAsViewedByIdBoard()
[**addBoardsPowerUpsByIdBoard**](BoardApi.md#addBoardsPowerUpsByIdBoard) | **POST** boards/{idBoard}/powerUps | addBoardsPowerUpsByIdBoard()
[**deleteBoardsMembersByIdBoardByIdMember**](BoardApi.md#deleteBoardsMembersByIdBoardByIdMember) | **DELETE** boards/{idBoard}/members/{idMember} | deleteBoardsMembersByIdBoardByIdMember()
[**deleteBoardsPowerUpsByIdBoardByPowerUp**](BoardApi.md#deleteBoardsPowerUpsByIdBoardByPowerUp) | **DELETE** boards/{idBoard}/powerUps/{powerUp} | deleteBoardsPowerUpsByIdBoardByPowerUp()
[**getBoardsActionsByIdBoard**](BoardApi.md#getBoardsActionsByIdBoard) | **GET** boards/{idBoard}/actions | getBoardsActionsByIdBoard()
[**getBoardsBoardStarsByIdBoard**](BoardApi.md#getBoardsBoardStarsByIdBoard) | **GET** boards/{idBoard}/boardStars | getBoardsBoardStarsByIdBoard()
[**getBoardsByIdBoard**](BoardApi.md#getBoardsByIdBoard) | **GET** boards/{idBoard} | getBoardsByIdBoard()
[**getBoardsByIdBoardByField**](BoardApi.md#getBoardsByIdBoardByField) | **GET** boards/{idBoard}/{field} | getBoardsByIdBoardByField()
[**getBoardsCardsByIdBoard**](BoardApi.md#getBoardsCardsByIdBoard) | **GET** boards/{idBoard}/cards | getBoardsCardsByIdBoard()
[**getBoardsCardsByIdBoardByFilter**](BoardApi.md#getBoardsCardsByIdBoardByFilter) | **GET** boards/{idBoard}/cards/{filter} | getBoardsCardsByIdBoardByFilter()
[**getBoardsCardsByIdBoardByIdCard**](BoardApi.md#getBoardsCardsByIdBoardByIdCard) | **GET** boards/{idBoard}/cards/{idCard} | getBoardsCardsByIdBoardByIdCard()
[**getBoardsChecklistsByIdBoard**](BoardApi.md#getBoardsChecklistsByIdBoard) | **GET** boards/{idBoard}/checklists | getBoardsChecklistsByIdBoard()
[**getBoardsDeltasByIdBoard**](BoardApi.md#getBoardsDeltasByIdBoard) | **GET** boards/{idBoard}/deltas | getBoardsDeltasByIdBoard()
[**getBoardsLabelsByIdBoard**](BoardApi.md#getBoardsLabelsByIdBoard) | **GET** boards/{idBoard}/labels | getBoardsLabelsByIdBoard()
[**getBoardsLabelsByIdBoardByIdLabel**](BoardApi.md#getBoardsLabelsByIdBoardByIdLabel) | **GET** boards/{idBoard}/labels/{idLabel} | getBoardsLabelsByIdBoardByIdLabel()
[**getBoardsListsByIdBoard**](BoardApi.md#getBoardsListsByIdBoard) | **GET** boards/{idBoard}/lists | getBoardsListsByIdBoard()
[**getBoardsListsByIdBoardByFilter**](BoardApi.md#getBoardsListsByIdBoardByFilter) | **GET** boards/{idBoard}/lists/{filter} | getBoardsListsByIdBoardByFilter()
[**getBoardsMembersByIdBoard**](BoardApi.md#getBoardsMembersByIdBoard) | **GET** boards/{idBoard}/members | getBoardsMembersByIdBoard()
[**getBoardsMembersByIdBoardByFilter**](BoardApi.md#getBoardsMembersByIdBoardByFilter) | **GET** boards/{idBoard}/members/{filter} | getBoardsMembersByIdBoardByFilter()
[**getBoardsMembersCardsByIdBoardByIdMember**](BoardApi.md#getBoardsMembersCardsByIdBoardByIdMember) | **GET** boards/{idBoard}/members/{idMember}/cards | getBoardsMembersCardsByIdBoardByIdMember()
[**getBoardsMembersInvitedByIdBoard**](BoardApi.md#getBoardsMembersInvitedByIdBoard) | **GET** boards/{idBoard}/membersInvited | getBoardsMembersInvitedByIdBoard()
[**getBoardsMembersInvitedByIdBoardByField**](BoardApi.md#getBoardsMembersInvitedByIdBoardByField) | **GET** boards/{idBoard}/membersInvited/{field} | getBoardsMembersInvitedByIdBoardByField()
[**getBoardsMembershipsByIdBoard**](BoardApi.md#getBoardsMembershipsByIdBoard) | **GET** boards/{idBoard}/memberships | getBoardsMembershipsByIdBoard()
[**getBoardsMembershipsByIdBoardByIdMembership**](BoardApi.md#getBoardsMembershipsByIdBoardByIdMembership) | **GET** boards/{idBoard}/memberships/{idMembership} | getBoardsMembershipsByIdBoardByIdMembership()
[**getBoardsMyPrefsByIdBoard**](BoardApi.md#getBoardsMyPrefsByIdBoard) | **GET** boards/{idBoard}/myPrefs | getBoardsMyPrefsByIdBoard()
[**getBoardsOrganizationByIdBoard**](BoardApi.md#getBoardsOrganizationByIdBoard) | **GET** boards/{idBoard}/organization | getBoardsOrganizationByIdBoard()
[**getBoardsOrganizationByIdBoardByField**](BoardApi.md#getBoardsOrganizationByIdBoardByField) | **GET** boards/{idBoard}/organization/{field} | getBoardsOrganizationByIdBoardByField()
[**updateBoardsByIdBoard**](BoardApi.md#updateBoardsByIdBoard) | **PUT** boards/{idBoard} | updateBoardsByIdBoard()
[**updateBoardsClosedByIdBoard**](BoardApi.md#updateBoardsClosedByIdBoard) | **PUT** boards/{idBoard}/closed | updateBoardsClosedByIdBoard()
[**updateBoardsDescByIdBoard**](BoardApi.md#updateBoardsDescByIdBoard) | **PUT** boards/{idBoard}/desc | updateBoardsDescByIdBoard()
[**updateBoardsIdOrganizationByIdBoard**](BoardApi.md#updateBoardsIdOrganizationByIdBoard) | **PUT** boards/{idBoard}/idOrganization | updateBoardsIdOrganizationByIdBoard()
[**updateBoardsLabelNamesBlueByIdBoard**](BoardApi.md#updateBoardsLabelNamesBlueByIdBoard) | **PUT** boards/{idBoard}/labelNames/blue | updateBoardsLabelNamesBlueByIdBoard()
[**updateBoardsLabelNamesGreenByIdBoard**](BoardApi.md#updateBoardsLabelNamesGreenByIdBoard) | **PUT** boards/{idBoard}/labelNames/green | updateBoardsLabelNamesGreenByIdBoard()
[**updateBoardsLabelNamesOrangeByIdBoard**](BoardApi.md#updateBoardsLabelNamesOrangeByIdBoard) | **PUT** boards/{idBoard}/labelNames/orange | updateBoardsLabelNamesOrangeByIdBoard()
[**updateBoardsLabelNamesPurpleByIdBoard**](BoardApi.md#updateBoardsLabelNamesPurpleByIdBoard) | **PUT** boards/{idBoard}/labelNames/purple | updateBoardsLabelNamesPurpleByIdBoard()
[**updateBoardsLabelNamesRedByIdBoard**](BoardApi.md#updateBoardsLabelNamesRedByIdBoard) | **PUT** boards/{idBoard}/labelNames/red | updateBoardsLabelNamesRedByIdBoard()
[**updateBoardsLabelNamesYellowByIdBoard**](BoardApi.md#updateBoardsLabelNamesYellowByIdBoard) | **PUT** boards/{idBoard}/labelNames/yellow | updateBoardsLabelNamesYellowByIdBoard()
[**updateBoardsMembersByIdBoard**](BoardApi.md#updateBoardsMembersByIdBoard) | **PUT** boards/{idBoard}/members | updateBoardsMembersByIdBoard()
[**updateBoardsMembersByIdBoardByIdMember**](BoardApi.md#updateBoardsMembersByIdBoardByIdMember) | **PUT** boards/{idBoard}/members/{idMember} | updateBoardsMembersByIdBoardByIdMember()
[**updateBoardsMembershipsByIdBoardByIdMembership**](BoardApi.md#updateBoardsMembershipsByIdBoardByIdMembership) | **PUT** boards/{idBoard}/memberships/{idMembership} | updateBoardsMembershipsByIdBoardByIdMembership()
[**updateBoardsMyPrefsEmailPositionByIdBoard**](BoardApi.md#updateBoardsMyPrefsEmailPositionByIdBoard) | **PUT** boards/{idBoard}/myPrefs/emailPosition | updateBoardsMyPrefsEmailPositionByIdBoard()
[**updateBoardsMyPrefsIdEmailListByIdBoard**](BoardApi.md#updateBoardsMyPrefsIdEmailListByIdBoard) | **PUT** boards/{idBoard}/myPrefs/idEmailList | updateBoardsMyPrefsIdEmailListByIdBoard()
[**updateBoardsMyPrefsShowListGuideByIdBoard**](BoardApi.md#updateBoardsMyPrefsShowListGuideByIdBoard) | **PUT** boards/{idBoard}/myPrefs/showListGuide | updateBoardsMyPrefsShowListGuideByIdBoard()
[**updateBoardsMyPrefsShowSidebarActivityByIdBoard**](BoardApi.md#updateBoardsMyPrefsShowSidebarActivityByIdBoard) | **PUT** boards/{idBoard}/myPrefs/showSidebarActivity | updateBoardsMyPrefsShowSidebarActivityByIdBoard()
[**updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard**](BoardApi.md#updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard) | **PUT** boards/{idBoard}/myPrefs/showSidebarBoardActions | updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard()
[**updateBoardsMyPrefsShowSidebarByIdBoard**](BoardApi.md#updateBoardsMyPrefsShowSidebarByIdBoard) | **PUT** boards/{idBoard}/myPrefs/showSidebar | updateBoardsMyPrefsShowSidebarByIdBoard()
[**updateBoardsMyPrefsShowSidebarMembersByIdBoard**](BoardApi.md#updateBoardsMyPrefsShowSidebarMembersByIdBoard) | **PUT** boards/{idBoard}/myPrefs/showSidebarMembers | updateBoardsMyPrefsShowSidebarMembersByIdBoard()
[**updateBoardsNameByIdBoard**](BoardApi.md#updateBoardsNameByIdBoard) | **PUT** boards/{idBoard}/name | updateBoardsNameByIdBoard()
[**updateBoardsPrefsBackgroundByIdBoard**](BoardApi.md#updateBoardsPrefsBackgroundByIdBoard) | **PUT** boards/{idBoard}/prefs/background | updateBoardsPrefsBackgroundByIdBoard()
[**updateBoardsPrefsCalendarFeedEnabledByIdBoard**](BoardApi.md#updateBoardsPrefsCalendarFeedEnabledByIdBoard) | **PUT** boards/{idBoard}/prefs/calendarFeedEnabled | updateBoardsPrefsCalendarFeedEnabledByIdBoard()
[**updateBoardsPrefsCardAgingByIdBoard**](BoardApi.md#updateBoardsPrefsCardAgingByIdBoard) | **PUT** boards/{idBoard}/prefs/cardAging | updateBoardsPrefsCardAgingByIdBoard()
[**updateBoardsPrefsCardCoversByIdBoard**](BoardApi.md#updateBoardsPrefsCardCoversByIdBoard) | **PUT** boards/{idBoard}/prefs/cardCovers | updateBoardsPrefsCardCoversByIdBoard()
[**updateBoardsPrefsCommentsByIdBoard**](BoardApi.md#updateBoardsPrefsCommentsByIdBoard) | **PUT** boards/{idBoard}/prefs/comments | updateBoardsPrefsCommentsByIdBoard()
[**updateBoardsPrefsInvitationsByIdBoard**](BoardApi.md#updateBoardsPrefsInvitationsByIdBoard) | **PUT** boards/{idBoard}/prefs/invitations | updateBoardsPrefsInvitationsByIdBoard()
[**updateBoardsPrefsPermissionLevelByIdBoard**](BoardApi.md#updateBoardsPrefsPermissionLevelByIdBoard) | **PUT** boards/{idBoard}/prefs/permissionLevel | updateBoardsPrefsPermissionLevelByIdBoard()
[**updateBoardsPrefsSelfJoinByIdBoard**](BoardApi.md#updateBoardsPrefsSelfJoinByIdBoard) | **PUT** boards/{idBoard}/prefs/selfJoin | updateBoardsPrefsSelfJoinByIdBoard()
[**updateBoardsPrefsVotingByIdBoard**](BoardApi.md#updateBoardsPrefsVotingByIdBoard) | **PUT** boards/{idBoard}/prefs/voting | updateBoardsPrefsVotingByIdBoard()
[**updateBoardsSubscribedByIdBoard**](BoardApi.md#updateBoardsSubscribedByIdBoard) | **PUT** boards/{idBoard}/subscribed | updateBoardsSubscribedByIdBoard()

<a name="addBoards"></a>
# **addBoards**
> Void addBoards(body, key, token)

addBoards()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
Boards body = new Boards(); // Boards | Attributes of "Boards" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addBoards(body, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Boards**](Boards.md)| Attributes of &quot;Boards&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addBoardsCalendarKeyGenerateByIdBoard"></a>
# **addBoardsCalendarKeyGenerateByIdBoard**
> Void addBoardsCalendarKeyGenerateByIdBoard(idBoard, key, token)

addBoardsCalendarKeyGenerateByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addBoardsCalendarKeyGenerateByIdBoard(idBoard, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoardsCalendarKeyGenerateByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addBoardsChecklistsByIdBoard"></a>
# **addBoardsChecklistsByIdBoard**
> Void addBoardsChecklistsByIdBoard(body, key, token, idBoard)

addBoardsChecklistsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsChecklists body = new BoardsChecklists(); // BoardsChecklists | Attributes of "Boards Checklists" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.addBoardsChecklistsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoardsChecklistsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsChecklists**](BoardsChecklists.md)| Attributes of &quot;Boards Checklists&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addBoardsEmailKeyGenerateByIdBoard"></a>
# **addBoardsEmailKeyGenerateByIdBoard**
> Void addBoardsEmailKeyGenerateByIdBoard(idBoard, key, token)

addBoardsEmailKeyGenerateByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addBoardsEmailKeyGenerateByIdBoard(idBoard, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoardsEmailKeyGenerateByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addBoardsLabelsByIdBoard"></a>
# **addBoardsLabelsByIdBoard**
> Void addBoardsLabelsByIdBoard(body, key, token, idBoard)

addBoardsLabelsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsLabels body = new BoardsLabels(); // BoardsLabels | Attributes of "Boards Labels" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.addBoardsLabelsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoardsLabelsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsLabels**](BoardsLabels.md)| Attributes of &quot;Boards Labels&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addBoardsListsByIdBoard"></a>
# **addBoardsListsByIdBoard**
> Void addBoardsListsByIdBoard(body, key, token, idBoard)

addBoardsListsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsLists body = new BoardsLists(); // BoardsLists | Attributes of "Boards Lists" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.addBoardsListsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoardsListsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsLists**](BoardsLists.md)| Attributes of &quot;Boards Lists&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addBoardsMarkAsViewedByIdBoard"></a>
# **addBoardsMarkAsViewedByIdBoard**
> Void addBoardsMarkAsViewedByIdBoard(idBoard, key, token)

addBoardsMarkAsViewedByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addBoardsMarkAsViewedByIdBoard(idBoard, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoardsMarkAsViewedByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addBoardsPowerUpsByIdBoard"></a>
# **addBoardsPowerUpsByIdBoard**
> Void addBoardsPowerUpsByIdBoard(body, key, token, idBoard)

addBoardsPowerUpsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsPowerUps body = new BoardsPowerUps(); // BoardsPowerUps | Attributes of "Boards Power Ups" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.addBoardsPowerUpsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#addBoardsPowerUpsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsPowerUps**](BoardsPowerUps.md)| Attributes of &quot;Boards Power Ups&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="deleteBoardsMembersByIdBoardByIdMember"></a>
# **deleteBoardsMembersByIdBoardByIdMember**
> Void deleteBoardsMembersByIdBoardByIdMember(idBoard, idMember, key, token)

deleteBoardsMembersByIdBoardByIdMember()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String idMember = "idMember_example"; // String | idMember
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteBoardsMembersByIdBoardByIdMember(idBoard, idMember, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#deleteBoardsMembersByIdBoardByIdMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
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

<a name="deleteBoardsPowerUpsByIdBoardByPowerUp"></a>
# **deleteBoardsPowerUpsByIdBoardByPowerUp**
> Void deleteBoardsPowerUpsByIdBoardByPowerUp(idBoard, powerUp, key, token)

deleteBoardsPowerUpsByIdBoardByPowerUp()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String powerUp = "powerUp_example"; // String | powerUp
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteBoardsPowerUpsByIdBoardByPowerUp(idBoard, powerUp, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#deleteBoardsPowerUpsByIdBoardByPowerUp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **powerUp** | **String**| powerUp |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsActionsByIdBoard"></a>
# **getBoardsActionsByIdBoard**
> Void getBoardsActionsByIdBoard(idBoard, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields)

getBoardsActionsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String entities = "entities_example"; // String |  true or false
String display = "display_example"; // String |  true or false
String filter = "all"; // String | all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
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
    Void result = apiInstance.getBoardsActionsByIdBoard(idBoard, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsActionsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **entities** | **String**|  true or false | [optional]
 **display** | **String**|  true or false | [optional]
 **filter** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] [default to all]
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

<a name="getBoardsBoardStarsByIdBoard"></a>
# **getBoardsBoardStarsByIdBoard**
> Void getBoardsBoardStarsByIdBoard(idBoard, key, token, filter)

getBoardsBoardStarsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String filter = "mine"; // String | One of: mine or none
try {
    Void result = apiInstance.getBoardsBoardStarsByIdBoard(idBoard, key, token, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsBoardStarsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **filter** | **String**| One of: mine or none | [optional] [default to mine]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsByIdBoard"></a>
# **getBoardsByIdBoard**
> Void getBoardsByIdBoard(idBoard, key, token, actions, actionsEntities, actionsDisplay, actionsFormat, actionsSince, actionsLimit, actionFields, actionMember, actionMemberFields, actionMemberCreator, actionMemberCreatorFields, cards, cardFields, cardAttachments, cardAttachmentFields, cardChecklists, cardStickers, boardStars, labels, labelFields, labelsLimit, lists, listFields, memberships, membershipsMember, membershipsMemberFields, members, memberFields, membersInvited, membersInvitedFields, checklists, checklistFields, organization, organizationFields, organizationMemberships, myPrefs, fields)

getBoardsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String actions = "actions_example"; // String | all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
String actionsEntities = "actionsEntities_example"; // String |  true or false
String actionsDisplay = "actionsDisplay_example"; // String |  true or false
String actionsFormat = "list"; // String | One of: count, list or minimal
String actionsSince = "actionsSince_example"; // String | A date, null or lastView
String actionsLimit = "50"; // String | a number from 0 to 1000
String actionFields = "all"; // String | all or a comma-separated list of: data, date, idMemberCreator or type
String actionMember = "actionMember_example"; // String |  true or false
String actionMemberFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String actionMemberCreator = "actionMemberCreator_example"; // String |  true or false
String actionMemberCreatorFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String cards = "none"; // String | One of: all, closed, none, open or visible
String cardFields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
String cardAttachments = "cardAttachments_example"; // String | A boolean value or &quot;cover&quot; for only card cover attachments
String cardAttachmentFields = "all"; // String | all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
String cardChecklists = "none"; // String | One of: all or none
String cardStickers = "cardStickers_example"; // String |  true or false
String boardStars = "none"; // String | One of: mine or none
String labels = "none"; // String | One of: all or none
String labelFields = "all"; // String | all or a comma-separated list of: color, idBoard, name or uses
String labelsLimit = "50"; // String | a number from 0 to 1000
String lists = "none"; // String | One of: all, closed, none or open
String listFields = "all"; // String | all or a comma-separated list of: closed, idBoard, name, pos or subscribed
String memberships = "none"; // String | all or a comma-separated list of: active, admin, deactivated, me or normal
String membershipsMember = "membershipsMember_example"; // String |  true or false
String membershipsMemberFields = "fullName and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String members = "none"; // String | One of: admins, all, none, normal or owners
String memberFields = "avatarHash, initials, fullName, username and confirmed"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String membersInvited = "none"; // String | One of: admins, all, none, normal or owners
String membersInvitedFields = "avatarHash, initials, fullName and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String checklists = "none"; // String | One of: all or none
String checklistFields = "all"; // String | all or a comma-separated list of: idBoard, idCard, name or pos
String organization = "organization_example"; // String |  true or false
String organizationFields = "name and displayName"; // String | all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
String organizationMemberships = "none"; // String | all or a comma-separated list of: active, admin, deactivated, me or normal
String myPrefs = "myPrefs_example"; // String |  true or false
String fields = "name, desc, descData, closed, idOrganization, pinned, url, shortUrl, prefs and labelNames"; // String | all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
try {
    Void result = apiInstance.getBoardsByIdBoard(idBoard, key, token, actions, actionsEntities, actionsDisplay, actionsFormat, actionsSince, actionsLimit, actionFields, actionMember, actionMemberFields, actionMemberCreator, actionMemberCreatorFields, cards, cardFields, cardAttachments, cardAttachmentFields, cardChecklists, cardStickers, boardStars, labels, labelFields, labelsLimit, lists, listFields, memberships, membershipsMember, membershipsMemberFields, members, memberFields, membersInvited, membersInvitedFields, checklists, checklistFields, organization, organizationFields, organizationMemberships, myPrefs, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional]
 **actionsEntities** | **String**|  true or false | [optional]
 **actionsDisplay** | **String**|  true or false | [optional]
 **actionsFormat** | **String**| One of: count, list or minimal | [optional] [default to list]
 **actionsSince** | **String**| A date, null or lastView | [optional]
 **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50]
 **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all]
 **actionMember** | **String**|  true or false | [optional]
 **actionMemberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **actionMemberCreator** | **String**|  true or false | [optional]
 **actionMemberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none]
 **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]
 **cardAttachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional]
 **cardAttachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all]
 **cardChecklists** | **String**| One of: all or none | [optional] [default to none]
 **cardStickers** | **String**|  true or false | [optional]
 **boardStars** | **String**| One of: mine or none | [optional] [default to none]
 **labels** | **String**| One of: all or none | [optional] [default to none]
 **labelFields** | **String**| all or a comma-separated list of: color, idBoard, name or uses | [optional] [default to all]
 **labelsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50]
 **lists** | **String**| One of: all, closed, none or open | [optional] [default to none]
 **listFields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all]
 **memberships** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to none]
 **membershipsMember** | **String**|  true or false | [optional]
 **membershipsMemberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username]
 **members** | **String**| One of: admins, all, none, normal or owners | [optional] [default to none]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, initials, fullName, username and confirmed]
 **membersInvited** | **String**| One of: admins, all, none, normal or owners | [optional] [default to none]
 **membersInvitedFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, initials, fullName and username]
 **checklists** | **String**| One of: all or none | [optional] [default to none]
 **checklistFields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all]
 **organization** | **String**|  true or false | [optional]
 **organizationFields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to name and displayName]
 **organizationMemberships** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to none]
 **myPrefs** | **String**|  true or false | [optional]
 **fields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, desc, descData, closed, idOrganization, pinned, url, shortUrl, prefs and labelNames]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsByIdBoardByField"></a>
# **getBoardsByIdBoardByField**
> Void getBoardsByIdBoardByField(idBoard, field, key, token)

getBoardsByIdBoardByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardApi;


BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsByIdBoardByField(idBoard, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsByIdBoardByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
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

<a name="getBoardsCardsByIdBoard"></a>
# **getBoardsCardsByIdBoard**
> Void getBoardsCardsByIdBoard(idBoard, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields)

getBoardsCardsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String actions = "actions_example"; // String | all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
String attachments = "attachments_example"; // String | A boolean value or &quot;cover&quot; for only card cover attachments
String attachmentFields = "all"; // String | all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
String stickers = "stickers_example"; // String |  true or false
String members = "members_example"; // String |  true or false
String memberFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String checkItemStates = "checkItemStates_example"; // String |  true or false
String checklists = "none"; // String | One of: all or none
String limit = "limit_example"; // String | a number from 1 to 1000
String since = "since_example"; // String | A date, or null
String before = "before_example"; // String | A date, or null
String filter = "visible"; // String | One of: all, closed, none, open or visible
String fields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
try {
    Void result = apiInstance.getBoardsCardsByIdBoard(idBoard, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsCardsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional]
 **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional]
 **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all]
 **stickers** | **String**|  true or false | [optional]
 **members** | **String**|  true or false | [optional]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **checkItemStates** | **String**|  true or false | [optional]
 **checklists** | **String**| One of: all or none | [optional] [default to none]
 **limit** | **String**| a number from 1 to 1000 | [optional]
 **since** | **String**| A date, or null | [optional]
 **before** | **String**| A date, or null | [optional]
 **filter** | **String**| One of: all, closed, none, open or visible | [optional] [default to visible]
 **fields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsCardsByIdBoardByFilter"></a>
# **getBoardsCardsByIdBoardByFilter**
> Void getBoardsCardsByIdBoardByFilter(idBoard, filter, key, token)

getBoardsCardsByIdBoardByFilter()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardApi;


BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String filter = "filter_example"; // String | filter
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsCardsByIdBoardByFilter(idBoard, filter, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsCardsByIdBoardByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **filter** | **String**| filter |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsCardsByIdBoardByIdCard"></a>
# **getBoardsCardsByIdBoardByIdCard**
> Void getBoardsCardsByIdBoardByIdCard(idBoard, idCard, key, token, attachments, attachmentFields, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, actionMemberCreatorFields, members, memberFields, checkItemStates, checkItemStateFields, labels, checklists, checklistFields, fields)

getBoardsCardsByIdBoardByIdCard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String idCard = "idCard_example"; // String | idCard
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String attachments = "attachments_example"; // String | A boolean value or &quot;cover&quot; for only card cover attachments
String attachmentFields = "all"; // String | all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
String actions = "actions_example"; // String | all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
String actionsEntities = "actionsEntities_example"; // String |  true or false
String actionsDisplay = "actionsDisplay_example"; // String |  true or false
String actionsLimit = "50"; // String | a number from 0 to 1000
String actionFields = "all"; // String | all or a comma-separated list of: data, date, idMemberCreator or type
String actionMemberCreatorFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String members = "members_example"; // String |  true or false
String memberFields = "avatarHash, initials, fullName and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String checkItemStates = "checkItemStates_example"; // String |  true or false
String checkItemStateFields = "all"; // String | all or a comma-separated list of: idCheckItem or state
String labels = "labels_example"; // String |  true or false
String checklists = "none"; // String | One of: all or none
String checklistFields = "all"; // String | all or a comma-separated list of: idBoard, idCard, name or pos
String fields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
try {
    Void result = apiInstance.getBoardsCardsByIdBoardByIdCard(idBoard, idCard, key, token, attachments, attachmentFields, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, actionMemberCreatorFields, members, memberFields, checkItemStates, checkItemStateFields, labels, checklists, checklistFields, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsCardsByIdBoardByIdCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **idCard** | **String**| idCard |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional]
 **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all]
 **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional]
 **actionsEntities** | **String**|  true or false | [optional]
 **actionsDisplay** | **String**|  true or false | [optional]
 **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50]
 **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all]
 **actionMemberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **members** | **String**|  true or false | [optional]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, initials, fullName and username]
 **checkItemStates** | **String**|  true or false | [optional]
 **checkItemStateFields** | **String**| all or a comma-separated list of: idCheckItem or state | [optional] [default to all]
 **labels** | **String**|  true or false | [optional]
 **checklists** | **String**| One of: all or none | [optional] [default to none]
 **checklistFields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all]
 **fields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsChecklistsByIdBoard"></a>
# **getBoardsChecklistsByIdBoard**
> Void getBoardsChecklistsByIdBoard(idBoard, key, token, cards, cardFields, checkItems, checkItemFields, filter, fields)

getBoardsChecklistsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String cards = "none"; // String | One of: all, closed, none, open or visible
String cardFields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
String checkItems = "all"; // String | One of: all or none
String checkItemFields = "name, nameData, pos and state"; // String | all or a comma-separated list of: name, nameData, pos, state or type
String filter = "all"; // String | One of: all or none
String fields = "all"; // String | all or a comma-separated list of: idBoard, idCard, name or pos
try {
    Void result = apiInstance.getBoardsChecklistsByIdBoard(idBoard, key, token, cards, cardFields, checkItems, checkItemFields, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsChecklistsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
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

<a name="getBoardsDeltasByIdBoard"></a>
# **getBoardsDeltasByIdBoard**
> Void getBoardsDeltasByIdBoard(idBoard, tags, ixLastUpdate, key, token)

getBoardsDeltasByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String tags = "tags_example"; // String | A valid tag for subscribing
String ixLastUpdate = "ixLastUpdate_example"; // String | a number from -1 to Infinity
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsDeltasByIdBoard(idBoard, tags, ixLastUpdate, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsDeltasByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **tags** | **String**| A valid tag for subscribing |
 **ixLastUpdate** | **String**| a number from -1 to Infinity |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsLabelsByIdBoard"></a>
# **getBoardsLabelsByIdBoard**
> Void getBoardsLabelsByIdBoard(idBoard, key, token, fields, limit)

getBoardsLabelsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: color, idBoard, name or uses
String limit = "50"; // String | a number from 0 to 1000
try {
    Void result = apiInstance.getBoardsLabelsByIdBoard(idBoard, key, token, fields, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsLabelsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: color, idBoard, name or uses | [optional] [default to all]
 **limit** | **String**| a number from 0 to 1000 | [optional] [default to 50]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsLabelsByIdBoardByIdLabel"></a>
# **getBoardsLabelsByIdBoardByIdLabel**
> Void getBoardsLabelsByIdBoardByIdLabel(idBoard, idLabel, key, token, fields)

getBoardsLabelsByIdBoardByIdLabel()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String idLabel = "idLabel_example"; // String | idLabel
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: color, idBoard, name or uses
try {
    Void result = apiInstance.getBoardsLabelsByIdBoardByIdLabel(idBoard, idLabel, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsLabelsByIdBoardByIdLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **idLabel** | **String**| idLabel |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: color, idBoard, name or uses | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsListsByIdBoard"></a>
# **getBoardsListsByIdBoard**
> Void getBoardsListsByIdBoard(idBoard, key, token, cards, cardFields, filter, fields)

getBoardsListsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String cards = "none"; // String | One of: all, closed, none, open or visible
String cardFields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
String filter = "open"; // String | One of: all, closed, none or open
String fields = "all"; // String | all or a comma-separated list of: closed, idBoard, name, pos or subscribed
try {
    Void result = apiInstance.getBoardsListsByIdBoard(idBoard, key, token, cards, cardFields, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsListsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none]
 **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]
 **filter** | **String**| One of: all, closed, none or open | [optional] [default to open]
 **fields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsListsByIdBoardByFilter"></a>
# **getBoardsListsByIdBoardByFilter**
> Void getBoardsListsByIdBoardByFilter(idBoard, filter, key, token)

getBoardsListsByIdBoardByFilter()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardApi;


BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String filter = "filter_example"; // String | filter
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsListsByIdBoardByFilter(idBoard, filter, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsListsByIdBoardByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **filter** | **String**| filter |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsMembersByIdBoard"></a>
# **getBoardsMembersByIdBoard**
> Void getBoardsMembersByIdBoard(idBoard, key, token, filter, fields, activity)

getBoardsMembersByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String filter = "all"; // String | One of: admins, all, none, normal or owners
String fields = "fullName and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String activity = "activity_example"; // String | true or false ; works for premium organizations only.
try {
    Void result = apiInstance.getBoardsMembersByIdBoard(idBoard, key, token, filter, fields, activity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMembersByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **filter** | **String**| One of: admins, all, none, normal or owners | [optional] [default to all]
 **fields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username]
 **activity** | **String**| true or false ; works for premium organizations only. | [optional]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsMembersByIdBoardByFilter"></a>
# **getBoardsMembersByIdBoardByFilter**
> Void getBoardsMembersByIdBoardByFilter(idBoard, filter, key, token)

getBoardsMembersByIdBoardByFilter()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardApi;


BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String filter = "filter_example"; // String | filter
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsMembersByIdBoardByFilter(idBoard, filter, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMembersByIdBoardByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **filter** | **String**| filter |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsMembersCardsByIdBoardByIdMember"></a>
# **getBoardsMembersCardsByIdBoardByIdMember**
> Void getBoardsMembersCardsByIdBoardByIdMember(idBoard, idMember, key, token, actions, attachments, attachmentFields, members, memberFields, checkItemStates, checklists, board, boardFields, list, listFields, filter, fields)

getBoardsMembersCardsByIdBoardByIdMember()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String idMember = "idMember_example"; // String | idMember
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String actions = "actions_example"; // String | all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
String attachments = "attachments_example"; // String | A boolean value or &quot;cover&quot; for only card cover attachments
String attachmentFields = "all"; // String | all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
String members = "members_example"; // String |  true or false
String memberFields = "avatarHash, fullName, initials and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
String checkItemStates = "checkItemStates_example"; // String |  true or false
String checklists = "none"; // String | One of: all or none
String board = "board_example"; // String |  true or false
String boardFields = "name, desc, closed, idOrganization, pinned, url and prefs"; // String | all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
String list = "list_example"; // String |  true or false
String listFields = "all"; // String | all or a comma-separated list of: closed, idBoard, name, pos or subscribed
String filter = "visible"; // String | One of: all, closed, none, open or visible
String fields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
try {
    Void result = apiInstance.getBoardsMembersCardsByIdBoardByIdMember(idBoard, idMember, key, token, actions, attachments, attachmentFields, members, memberFields, checkItemStates, checklists, board, boardFields, list, listFields, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMembersCardsByIdBoardByIdMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **idMember** | **String**| idMember |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional]
 **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional]
 **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all]
 **members** | **String**|  true or false | [optional]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username]
 **checkItemStates** | **String**|  true or false | [optional]
 **checklists** | **String**| One of: all or none | [optional] [default to none]
 **board** | **String**|  true or false | [optional]
 **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, desc, closed, idOrganization, pinned, url and prefs]
 **list** | **String**|  true or false | [optional]
 **listFields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all]
 **filter** | **String**| One of: all, closed, none, open or visible | [optional] [default to visible]
 **fields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsMembersInvitedByIdBoard"></a>
# **getBoardsMembersInvitedByIdBoard**
> Void getBoardsMembersInvitedByIdBoard(idBoard, key, token, fields)

getBoardsMembersInvitedByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username
try {
    Void result = apiInstance.getBoardsMembersInvitedByIdBoard(idBoard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMembersInvitedByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsMembersInvitedByIdBoardByField"></a>
# **getBoardsMembersInvitedByIdBoardByField**
> Void getBoardsMembersInvitedByIdBoardByField(idBoard, field, key, token)

getBoardsMembersInvitedByIdBoardByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsMembersInvitedByIdBoardByField(idBoard, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMembersInvitedByIdBoardByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
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

<a name="getBoardsMembershipsByIdBoard"></a>
# **getBoardsMembershipsByIdBoard**
> Void getBoardsMembershipsByIdBoard(idBoard, key, token, filter, member, memberFields)

getBoardsMembershipsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String filter = "all"; // String | all or a comma-separated list of: active, admin, deactivated, me or normal
String member = "member_example"; // String |  true or false
String memberFields = "fullName and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
try {
    Void result = apiInstance.getBoardsMembershipsByIdBoard(idBoard, key, token, filter, member, memberFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMembershipsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **filter** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to all]
 **member** | **String**|  true or false | [optional]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsMembershipsByIdBoardByIdMembership"></a>
# **getBoardsMembershipsByIdBoardByIdMembership**
> Void getBoardsMembershipsByIdBoardByIdMembership(idBoard, idMembership, key, token, member, memberFields)

getBoardsMembershipsByIdBoardByIdMembership()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String idMembership = "idMembership_example"; // String | idMembership
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String member = "member_example"; // String |  true or false
String memberFields = "fullName and username"; // String | all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
try {
    Void result = apiInstance.getBoardsMembershipsByIdBoardByIdMembership(idBoard, idMembership, key, token, member, memberFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMembershipsByIdBoardByIdMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **idMembership** | **String**| idMembership |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **member** | **String**|  true or false | [optional]
 **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsMyPrefsByIdBoard"></a>
# **getBoardsMyPrefsByIdBoard**
> Void getBoardsMyPrefsByIdBoard(idBoard, key, token)

getBoardsMyPrefsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsMyPrefsByIdBoard(idBoard, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsMyPrefsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsOrganizationByIdBoard"></a>
# **getBoardsOrganizationByIdBoard**
> Void getBoardsOrganizationByIdBoard(idBoard, key, token, fields)

getBoardsOrganizationByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
try {
    Void result = apiInstance.getBoardsOrganizationByIdBoard(idBoard, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsOrganizationByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoardsOrganizationByIdBoardByField"></a>
# **getBoardsOrganizationByIdBoardByField**
> Void getBoardsOrganizationByIdBoardByField(idBoard, field, key, token)

getBoardsOrganizationByIdBoardByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
String idBoard = "idBoard_example"; // String | board_id
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBoardsOrganizationByIdBoardByField(idBoard, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#getBoardsOrganizationByIdBoardByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idBoard** | **String**| board_id |
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

<a name="updateBoardsByIdBoard"></a>
# **updateBoardsByIdBoard**
> Void updateBoardsByIdBoard(body, key, token, idBoard)

updateBoardsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
Boards body = new Boards(); // Boards | Attributes of "Boards" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Boards**](Boards.md)| Attributes of &quot;Boards&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsClosedByIdBoard"></a>
# **updateBoardsClosedByIdBoard**
> Void updateBoardsClosedByIdBoard(body, key, token, idBoard)

updateBoardsClosedByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsClosed body = new BoardsClosed(); // BoardsClosed | Attributes of "Boards Closed" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsClosedByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsClosedByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsClosed**](BoardsClosed.md)| Attributes of &quot;Boards Closed&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsDescByIdBoard"></a>
# **updateBoardsDescByIdBoard**
> Void updateBoardsDescByIdBoard(body, key, token, idBoard)

updateBoardsDescByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsDesc body = new BoardsDesc(); // BoardsDesc | Attributes of "Boards Desc" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsDescByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsDescByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsDesc**](BoardsDesc.md)| Attributes of &quot;Boards Desc&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsIdOrganizationByIdBoard"></a>
# **updateBoardsIdOrganizationByIdBoard**
> Void updateBoardsIdOrganizationByIdBoard(body, key, token, idBoard)

updateBoardsIdOrganizationByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsIdOrganization body = new BoardsIdOrganization(); // BoardsIdOrganization | Attributes of "Boards Id Organization" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsIdOrganizationByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsIdOrganizationByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsIdOrganization**](BoardsIdOrganization.md)| Attributes of &quot;Boards Id Organization&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsLabelNamesBlueByIdBoard"></a>
# **updateBoardsLabelNamesBlueByIdBoard**
> Void updateBoardsLabelNamesBlueByIdBoard(body, key, token, idBoard)

updateBoardsLabelNamesBlueByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
LabelNamesBlue body = new LabelNamesBlue(); // LabelNamesBlue | Attributes of "Label Names Blue" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsLabelNamesBlueByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsLabelNamesBlueByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelNamesBlue**](LabelNamesBlue.md)| Attributes of &quot;Label Names Blue&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsLabelNamesGreenByIdBoard"></a>
# **updateBoardsLabelNamesGreenByIdBoard**
> Void updateBoardsLabelNamesGreenByIdBoard(body, key, token, idBoard)

updateBoardsLabelNamesGreenByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
LabelNamesGreen body = new LabelNamesGreen(); // LabelNamesGreen | Attributes of "Label Names Green" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsLabelNamesGreenByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsLabelNamesGreenByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelNamesGreen**](LabelNamesGreen.md)| Attributes of &quot;Label Names Green&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsLabelNamesOrangeByIdBoard"></a>
# **updateBoardsLabelNamesOrangeByIdBoard**
> Void updateBoardsLabelNamesOrangeByIdBoard(body, key, token, idBoard)

updateBoardsLabelNamesOrangeByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
LabelNamesOrange body = new LabelNamesOrange(); // LabelNamesOrange | Attributes of "Label Names Orange" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsLabelNamesOrangeByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsLabelNamesOrangeByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelNamesOrange**](LabelNamesOrange.md)| Attributes of &quot;Label Names Orange&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsLabelNamesPurpleByIdBoard"></a>
# **updateBoardsLabelNamesPurpleByIdBoard**
> Void updateBoardsLabelNamesPurpleByIdBoard(body, key, token, idBoard)

updateBoardsLabelNamesPurpleByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
LabelNamesPurple body = new LabelNamesPurple(); // LabelNamesPurple | Attributes of "Label Names Purple" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsLabelNamesPurpleByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsLabelNamesPurpleByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelNamesPurple**](LabelNamesPurple.md)| Attributes of &quot;Label Names Purple&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsLabelNamesRedByIdBoard"></a>
# **updateBoardsLabelNamesRedByIdBoard**
> Void updateBoardsLabelNamesRedByIdBoard(body, key, token, idBoard)

updateBoardsLabelNamesRedByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
LabelNamesRed body = new LabelNamesRed(); // LabelNamesRed | Attributes of "Label Names Red" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsLabelNamesRedByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsLabelNamesRedByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelNamesRed**](LabelNamesRed.md)| Attributes of &quot;Label Names Red&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsLabelNamesYellowByIdBoard"></a>
# **updateBoardsLabelNamesYellowByIdBoard**
> Void updateBoardsLabelNamesYellowByIdBoard(body, key, token, idBoard)

updateBoardsLabelNamesYellowByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
LabelNamesYellow body = new LabelNamesYellow(); // LabelNamesYellow | Attributes of "Label Names Yellow" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsLabelNamesYellowByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsLabelNamesYellowByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelNamesYellow**](LabelNamesYellow.md)| Attributes of &quot;Label Names Yellow&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMembersByIdBoard"></a>
# **updateBoardsMembersByIdBoard**
> Void updateBoardsMembersByIdBoard(body, key, token, idBoard)

updateBoardsMembersByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsMembers body = new BoardsMembers(); // BoardsMembers | Attributes of "Boards Members" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMembersByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMembersByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsMembers**](BoardsMembers.md)| Attributes of &quot;Boards Members&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMembersByIdBoardByIdMember"></a>
# **updateBoardsMembersByIdBoardByIdMember**
> Void updateBoardsMembersByIdBoardByIdMember(body, key, token, idBoard, idMember)

updateBoardsMembersByIdBoardByIdMember()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsMembers body = new BoardsMembers(); // BoardsMembers | Attributes of "Boards Members" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
String idMember = "idMember_example"; // String | idMember
try {
    Void result = apiInstance.updateBoardsMembersByIdBoardByIdMember(body, key, token, idBoard, idMember);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMembersByIdBoardByIdMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsMembers**](BoardsMembers.md)| Attributes of &quot;Boards Members&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |
 **idMember** | **String**| idMember |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMembershipsByIdBoardByIdMembership"></a>
# **updateBoardsMembershipsByIdBoardByIdMembership**
> Void updateBoardsMembershipsByIdBoardByIdMembership(body, key, token, idBoard, idMembership)

updateBoardsMembershipsByIdBoardByIdMembership()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsMemberships body = new BoardsMemberships(); // BoardsMemberships | Attributes of "Boards Memberships" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
String idMembership = "idMembership_example"; // String | idMembership
try {
    Void result = apiInstance.updateBoardsMembershipsByIdBoardByIdMembership(body, key, token, idBoard, idMembership);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMembershipsByIdBoardByIdMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsMemberships**](BoardsMemberships.md)| Attributes of &quot;Boards Memberships&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |
 **idMembership** | **String**| idMembership |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMyPrefsEmailPositionByIdBoard"></a>
# **updateBoardsMyPrefsEmailPositionByIdBoard**
> Void updateBoardsMyPrefsEmailPositionByIdBoard(body, key, token, idBoard)

updateBoardsMyPrefsEmailPositionByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
MyPrefsEmailPosition body = new MyPrefsEmailPosition(); // MyPrefsEmailPosition | Attributes of "My Prefs Email Position" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMyPrefsEmailPositionByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMyPrefsEmailPositionByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MyPrefsEmailPosition**](MyPrefsEmailPosition.md)| Attributes of &quot;My Prefs Email Position&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMyPrefsIdEmailListByIdBoard"></a>
# **updateBoardsMyPrefsIdEmailListByIdBoard**
> Void updateBoardsMyPrefsIdEmailListByIdBoard(body, key, token, idBoard)

updateBoardsMyPrefsIdEmailListByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
MyPrefsIdEmailList body = new MyPrefsIdEmailList(); // MyPrefsIdEmailList | Attributes of "My Prefs Id Email List" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMyPrefsIdEmailListByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMyPrefsIdEmailListByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MyPrefsIdEmailList**](MyPrefsIdEmailList.md)| Attributes of &quot;My Prefs Id Email List&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMyPrefsShowListGuideByIdBoard"></a>
# **updateBoardsMyPrefsShowListGuideByIdBoard**
> Void updateBoardsMyPrefsShowListGuideByIdBoard(body, key, token, idBoard)

updateBoardsMyPrefsShowListGuideByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
MyPrefsShowListGuide body = new MyPrefsShowListGuide(); // MyPrefsShowListGuide | Attributes of "My Prefs Show List Guide" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMyPrefsShowListGuideByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMyPrefsShowListGuideByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MyPrefsShowListGuide**](MyPrefsShowListGuide.md)| Attributes of &quot;My Prefs Show List Guide&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMyPrefsShowSidebarActivityByIdBoard"></a>
# **updateBoardsMyPrefsShowSidebarActivityByIdBoard**
> Void updateBoardsMyPrefsShowSidebarActivityByIdBoard(body, key, token, idBoard)

updateBoardsMyPrefsShowSidebarActivityByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
MyPrefsShowSidebarActivity body = new MyPrefsShowSidebarActivity(); // MyPrefsShowSidebarActivity | Attributes of "My Prefs Show Sidebar Activity" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMyPrefsShowSidebarActivityByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMyPrefsShowSidebarActivityByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MyPrefsShowSidebarActivity**](MyPrefsShowSidebarActivity.md)| Attributes of &quot;My Prefs Show Sidebar Activity&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard"></a>
# **updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard**
> Void updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard(body, key, token, idBoard)

updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
MyPrefsShowSidebarBoardActions body = new MyPrefsShowSidebarBoardActions(); // MyPrefsShowSidebarBoardActions | Attributes of "My Prefs Show Sidebar Board Actions" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MyPrefsShowSidebarBoardActions**](MyPrefsShowSidebarBoardActions.md)| Attributes of &quot;My Prefs Show Sidebar Board Actions&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMyPrefsShowSidebarByIdBoard"></a>
# **updateBoardsMyPrefsShowSidebarByIdBoard**
> Void updateBoardsMyPrefsShowSidebarByIdBoard(body, key, token, idBoard)

updateBoardsMyPrefsShowSidebarByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
MyPrefsShowSidebar body = new MyPrefsShowSidebar(); // MyPrefsShowSidebar | Attributes of "My Prefs Show Sidebar" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMyPrefsShowSidebarByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMyPrefsShowSidebarByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MyPrefsShowSidebar**](MyPrefsShowSidebar.md)| Attributes of &quot;My Prefs Show Sidebar&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsMyPrefsShowSidebarMembersByIdBoard"></a>
# **updateBoardsMyPrefsShowSidebarMembersByIdBoard**
> Void updateBoardsMyPrefsShowSidebarMembersByIdBoard(body, key, token, idBoard)

updateBoardsMyPrefsShowSidebarMembersByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
MyPrefsShowSidebarMembers body = new MyPrefsShowSidebarMembers(); // MyPrefsShowSidebarMembers | Attributes of "My Prefs Show Sidebar Members" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsMyPrefsShowSidebarMembersByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsMyPrefsShowSidebarMembersByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MyPrefsShowSidebarMembers**](MyPrefsShowSidebarMembers.md)| Attributes of &quot;My Prefs Show Sidebar Members&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsNameByIdBoard"></a>
# **updateBoardsNameByIdBoard**
> Void updateBoardsNameByIdBoard(body, key, token, idBoard)

updateBoardsNameByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsName body = new BoardsName(); // BoardsName | Attributes of "Boards Name" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsNameByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsNameByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsName**](BoardsName.md)| Attributes of &quot;Boards Name&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsBackgroundByIdBoard"></a>
# **updateBoardsPrefsBackgroundByIdBoard**
> Void updateBoardsPrefsBackgroundByIdBoard(body, key, token, idBoard)

updateBoardsPrefsBackgroundByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsBackground body = new PrefsBackground(); // PrefsBackground | Attributes of "Prefs Background" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsBackgroundByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsBackgroundByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsBackground**](PrefsBackground.md)| Attributes of &quot;Prefs Background&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsCalendarFeedEnabledByIdBoard"></a>
# **updateBoardsPrefsCalendarFeedEnabledByIdBoard**
> Void updateBoardsPrefsCalendarFeedEnabledByIdBoard(body, key, token, idBoard)

updateBoardsPrefsCalendarFeedEnabledByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsCalendarFeedEnabled body = new PrefsCalendarFeedEnabled(); // PrefsCalendarFeedEnabled | Attributes of "Prefs Calendar Feed Enabled" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsCalendarFeedEnabledByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsCalendarFeedEnabledByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsCalendarFeedEnabled**](PrefsCalendarFeedEnabled.md)| Attributes of &quot;Prefs Calendar Feed Enabled&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsCardAgingByIdBoard"></a>
# **updateBoardsPrefsCardAgingByIdBoard**
> Void updateBoardsPrefsCardAgingByIdBoard(body, key, token, idBoard)

updateBoardsPrefsCardAgingByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsCardAging body = new PrefsCardAging(); // PrefsCardAging | Attributes of "Prefs Card Aging" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsCardAgingByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsCardAgingByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsCardAging**](PrefsCardAging.md)| Attributes of &quot;Prefs Card Aging&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsCardCoversByIdBoard"></a>
# **updateBoardsPrefsCardCoversByIdBoard**
> Void updateBoardsPrefsCardCoversByIdBoard(body, key, token, idBoard)

updateBoardsPrefsCardCoversByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsCardCovers body = new PrefsCardCovers(); // PrefsCardCovers | Attributes of "Prefs Card Covers" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsCardCoversByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsCardCoversByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsCardCovers**](PrefsCardCovers.md)| Attributes of &quot;Prefs Card Covers&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsCommentsByIdBoard"></a>
# **updateBoardsPrefsCommentsByIdBoard**
> Void updateBoardsPrefsCommentsByIdBoard(body, key, token, idBoard)

updateBoardsPrefsCommentsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsComments body = new PrefsComments(); // PrefsComments | Attributes of "Prefs Comments" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsCommentsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsCommentsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsComments**](PrefsComments.md)| Attributes of &quot;Prefs Comments&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsInvitationsByIdBoard"></a>
# **updateBoardsPrefsInvitationsByIdBoard**
> Void updateBoardsPrefsInvitationsByIdBoard(body, key, token, idBoard)

updateBoardsPrefsInvitationsByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsInvitations body = new PrefsInvitations(); // PrefsInvitations | Attributes of "Prefs Invitations" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsInvitationsByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsInvitationsByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsInvitations**](PrefsInvitations.md)| Attributes of &quot;Prefs Invitations&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsPermissionLevelByIdBoard"></a>
# **updateBoardsPrefsPermissionLevelByIdBoard**
> Void updateBoardsPrefsPermissionLevelByIdBoard(body, key, token, idBoard)

updateBoardsPrefsPermissionLevelByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsPermissionLevel body = new PrefsPermissionLevel(); // PrefsPermissionLevel | Attributes of "Prefs Permission Level" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsPermissionLevelByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsPermissionLevelByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsPermissionLevel**](PrefsPermissionLevel.md)| Attributes of &quot;Prefs Permission Level&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsSelfJoinByIdBoard"></a>
# **updateBoardsPrefsSelfJoinByIdBoard**
> Void updateBoardsPrefsSelfJoinByIdBoard(body, key, token, idBoard)

updateBoardsPrefsSelfJoinByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsSelfJoin body = new PrefsSelfJoin(); // PrefsSelfJoin | Attributes of "Prefs Self Join" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsSelfJoinByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsSelfJoinByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsSelfJoin**](PrefsSelfJoin.md)| Attributes of &quot;Prefs Self Join&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsPrefsVotingByIdBoard"></a>
# **updateBoardsPrefsVotingByIdBoard**
> Void updateBoardsPrefsVotingByIdBoard(body, key, token, idBoard)

updateBoardsPrefsVotingByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
PrefsVoting body = new PrefsVoting(); // PrefsVoting | Attributes of "Prefs Voting" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsPrefsVotingByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsPrefsVotingByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefsVoting**](PrefsVoting.md)| Attributes of &quot;Prefs Voting&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateBoardsSubscribedByIdBoard"></a>
# **updateBoardsSubscribedByIdBoard**
> Void updateBoardsSubscribedByIdBoard(body, key, token, idBoard)

updateBoardsSubscribedByIdBoard()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BoardApi;

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

BoardApi apiInstance = new BoardApi();
BoardsSubscribed body = new BoardsSubscribed(); // BoardsSubscribed | Attributes of "Boards Subscribed" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idBoard = "idBoard_example"; // String | board_id
try {
    Void result = apiInstance.updateBoardsSubscribedByIdBoard(body, key, token, idBoard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardApi#updateBoardsSubscribedByIdBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BoardsSubscribed**](BoardsSubscribed.md)| Attributes of &quot;Boards Subscribed&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idBoard** | **String**| board_id |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

