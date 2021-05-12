# ChecklistApi

All URIs are relative to *https://trello.com/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChecklists**](ChecklistApi.md#addChecklists) | **POST** checklists | addChecklists()
[**addChecklistsCheckItemsByIdChecklist**](ChecklistApi.md#addChecklistsCheckItemsByIdChecklist) | **POST** checklists/{idChecklist}/checkItems | addChecklistsCheckItemsByIdChecklist()
[**deleteChecklistsByIdChecklist**](ChecklistApi.md#deleteChecklistsByIdChecklist) | **DELETE** checklists/{idChecklist} | deleteChecklistsByIdChecklist()
[**deleteChecklistsCheckItemsByIdChecklistByIdCheckItem**](ChecklistApi.md#deleteChecklistsCheckItemsByIdChecklistByIdCheckItem) | **DELETE** checklists/{idChecklist}/checkItems/{idCheckItem} | deleteChecklistsCheckItemsByIdChecklistByIdCheckItem()
[**getChecklistsBoardByIdChecklist**](ChecklistApi.md#getChecklistsBoardByIdChecklist) | **GET** checklists/{idChecklist}/board | getChecklistsBoardByIdChecklist()
[**getChecklistsBoardByIdChecklistByField**](ChecklistApi.md#getChecklistsBoardByIdChecklistByField) | **GET** checklists/{idChecklist}/board/{field} | getChecklistsBoardByIdChecklistByField()
[**getChecklistsByIdChecklist**](ChecklistApi.md#getChecklistsByIdChecklist) | **GET** checklists/{idChecklist} | getChecklistsByIdChecklist()
[**getChecklistsByIdChecklistByField**](ChecklistApi.md#getChecklistsByIdChecklistByField) | **GET** checklists/{idChecklist}/{field} | getChecklistsByIdChecklistByField()
[**getChecklistsCardsByIdChecklist**](ChecklistApi.md#getChecklistsCardsByIdChecklist) | **GET** checklists/{idChecklist}/cards | getChecklistsCardsByIdChecklist()
[**getChecklistsCardsByIdChecklistByFilter**](ChecklistApi.md#getChecklistsCardsByIdChecklistByFilter) | **GET** checklists/{idChecklist}/cards/{filter} | getChecklistsCardsByIdChecklistByFilter()
[**getChecklistsCheckItemsByIdChecklist**](ChecklistApi.md#getChecklistsCheckItemsByIdChecklist) | **GET** checklists/{idChecklist}/checkItems | getChecklistsCheckItemsByIdChecklist()
[**getChecklistsCheckItemsByIdChecklistByIdCheckItem**](ChecklistApi.md#getChecklistsCheckItemsByIdChecklistByIdCheckItem) | **GET** checklists/{idChecklist}/checkItems/{idCheckItem} | getChecklistsCheckItemsByIdChecklistByIdCheckItem()
[**updateChecklistsByIdChecklist**](ChecklistApi.md#updateChecklistsByIdChecklist) | **PUT** checklists/{idChecklist} | updateChecklistsByIdChecklist()
[**updateChecklistsIdCardByIdChecklist**](ChecklistApi.md#updateChecklistsIdCardByIdChecklist) | **PUT** checklists/{idChecklist}/idCard | updateChecklistsIdCardByIdChecklist()
[**updateChecklistsNameByIdChecklist**](ChecklistApi.md#updateChecklistsNameByIdChecklist) | **PUT** checklists/{idChecklist}/name | updateChecklistsNameByIdChecklist()
[**updateChecklistsPosByIdChecklist**](ChecklistApi.md#updateChecklistsPosByIdChecklist) | **PUT** checklists/{idChecklist}/pos | updateChecklistsPosByIdChecklist()

<a name="addChecklists"></a>
# **addChecklists**
> Void addChecklists(body, key, token)

addChecklists()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
Checklists body = new Checklists(); // Checklists | Attributes of "Checklists" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.addChecklists(body, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#addChecklists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Checklists**](Checklists.md)| Attributes of &quot;Checklists&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="addChecklistsCheckItemsByIdChecklist"></a>
# **addChecklistsCheckItemsByIdChecklist**
> Void addChecklistsCheckItemsByIdChecklist(body, key, token, idChecklist)

addChecklistsCheckItemsByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
ChecklistsCheckItems body = new ChecklistsCheckItems(); // ChecklistsCheckItems | Attributes of "Checklists Check Items" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idChecklist = "idChecklist_example"; // String | idChecklist
try {
    Void result = apiInstance.addChecklistsCheckItemsByIdChecklist(body, key, token, idChecklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#addChecklistsCheckItemsByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChecklistsCheckItems**](ChecklistsCheckItems.md)| Attributes of &quot;Checklists Check Items&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idChecklist** | **String**| idChecklist |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="deleteChecklistsByIdChecklist"></a>
# **deleteChecklistsByIdChecklist**
> Void deleteChecklistsByIdChecklist(idChecklist, key, token)

deleteChecklistsByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteChecklistsByIdChecklist(idChecklist, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#deleteChecklistsByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="deleteChecklistsCheckItemsByIdChecklistByIdCheckItem"></a>
# **deleteChecklistsCheckItemsByIdChecklistByIdCheckItem**
> Void deleteChecklistsCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem, key, token)

deleteChecklistsCheckItemsByIdChecklistByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteChecklistsCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#deleteChecklistsCheckItemsByIdChecklistByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="getChecklistsBoardByIdChecklist"></a>
# **getChecklistsBoardByIdChecklist**
> Void getChecklistsBoardByIdChecklist(idChecklist, key, token, fields)

getChecklistsBoardByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
try {
    Void result = apiInstance.getChecklistsBoardByIdChecklist(idChecklist, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsBoardByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
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

<a name="getChecklistsBoardByIdChecklistByField"></a>
# **getChecklistsBoardByIdChecklistByField**
> Void getChecklistsBoardByIdChecklistByField(idChecklist, field, key, token)

getChecklistsBoardByIdChecklistByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getChecklistsBoardByIdChecklistByField(idChecklist, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsBoardByIdChecklistByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
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

<a name="getChecklistsByIdChecklist"></a>
# **getChecklistsByIdChecklist**
> Void getChecklistsByIdChecklist(idChecklist, key, token, cards, cardFields, checkItems, checkItemFields, fields)

getChecklistsByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String cards = "none"; // String | One of: all, closed, none, open or visible
String cardFields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
String checkItems = "all"; // String | One of: all or none
String checkItemFields = "name, nameData, pos and state"; // String | all or a comma-separated list of: name, nameData, pos, state or type
String fields = "all"; // String | all or a comma-separated list of: idBoard, idCard, name or pos
try {
    Void result = apiInstance.getChecklistsByIdChecklist(idChecklist, key, token, cards, cardFields, checkItems, checkItemFields, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none]
 **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]
 **checkItems** | **String**| One of: all or none | [optional] [default to all]
 **checkItemFields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state]
 **fields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChecklistsByIdChecklistByField"></a>
# **getChecklistsByIdChecklistByField**
> Void getChecklistsByIdChecklistByField(idChecklist, field, key, token)

getChecklistsByIdChecklistByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChecklistApi;


ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getChecklistsByIdChecklistByField(idChecklist, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsByIdChecklistByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
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

<a name="getChecklistsCardsByIdChecklist"></a>
# **getChecklistsCardsByIdChecklist**
> Void getChecklistsCardsByIdChecklist(idChecklist, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields)

getChecklistsCardsByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
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
String filter = "open"; // String | One of: all, closed, none or open
String fields = "all"; // String | all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
try {
    Void result = apiInstance.getChecklistsCardsByIdChecklist(idChecklist, key, token, actions, attachments, attachmentFields, stickers, members, memberFields, checkItemStates, checklists, limit, since, before, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsCardsByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
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
 **filter** | **String**| One of: all, closed, none or open | [optional] [default to open]
 **fields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChecklistsCardsByIdChecklistByFilter"></a>
# **getChecklistsCardsByIdChecklistByFilter**
> Void getChecklistsCardsByIdChecklistByFilter(idChecklist, filter, key, token)

getChecklistsCardsByIdChecklistByFilter()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChecklistApi;


ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String filter = "filter_example"; // String | filter
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getChecklistsCardsByIdChecklistByFilter(idChecklist, filter, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsCardsByIdChecklistByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
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

<a name="getChecklistsCheckItemsByIdChecklist"></a>
# **getChecklistsCheckItemsByIdChecklist**
> Void getChecklistsCheckItemsByIdChecklist(idChecklist, key, token, filter, fields)

getChecklistsCheckItemsByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String filter = "all"; // String | One of: all or none
String fields = "name, nameData, pos and state"; // String | all or a comma-separated list of: name, nameData, pos, state or type
try {
    Void result = apiInstance.getChecklistsCheckItemsByIdChecklist(idChecklist, key, token, filter, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsCheckItemsByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **filter** | **String**| One of: all or none | [optional] [default to all]
 **fields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChecklistsCheckItemsByIdChecklistByIdCheckItem"></a>
# **getChecklistsCheckItemsByIdChecklistByIdCheckItem**
> Void getChecklistsCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem, key, token, fields)

getChecklistsCheckItemsByIdChecklistByIdCheckItem()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
String idChecklist = "idChecklist_example"; // String | idChecklist
String idCheckItem = "idCheckItem_example"; // String | idCheckItem
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "name, nameData, pos and state"; // String | all or a comma-separated list of: name, nameData, pos, state or type
try {
    Void result = apiInstance.getChecklistsCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#getChecklistsCheckItemsByIdChecklistByIdCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idChecklist** | **String**| idChecklist |
 **idCheckItem** | **String**| idCheckItem |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateChecklistsByIdChecklist"></a>
# **updateChecklistsByIdChecklist**
> Void updateChecklistsByIdChecklist(body, key, token, idChecklist)

updateChecklistsByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
Checklists body = new Checklists(); // Checklists | Attributes of "Checklists" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idChecklist = "idChecklist_example"; // String | idChecklist
try {
    Void result = apiInstance.updateChecklistsByIdChecklist(body, key, token, idChecklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#updateChecklistsByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Checklists**](Checklists.md)| Attributes of &quot;Checklists&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idChecklist** | **String**| idChecklist |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateChecklistsIdCardByIdChecklist"></a>
# **updateChecklistsIdCardByIdChecklist**
> Void updateChecklistsIdCardByIdChecklist(body, key, token, idChecklist)

updateChecklistsIdCardByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
ChecklistsIdCard body = new ChecklistsIdCard(); // ChecklistsIdCard | Attributes of "Checklists Id Card" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idChecklist = "idChecklist_example"; // String | idChecklist
try {
    Void result = apiInstance.updateChecklistsIdCardByIdChecklist(body, key, token, idChecklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#updateChecklistsIdCardByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChecklistsIdCard**](ChecklistsIdCard.md)| Attributes of &quot;Checklists Id Card&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idChecklist** | **String**| idChecklist |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateChecklistsNameByIdChecklist"></a>
# **updateChecklistsNameByIdChecklist**
> Void updateChecklistsNameByIdChecklist(body, key, token, idChecklist)

updateChecklistsNameByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
ChecklistsName body = new ChecklistsName(); // ChecklistsName | Attributes of "Checklists Name" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idChecklist = "idChecklist_example"; // String | idChecklist
try {
    Void result = apiInstance.updateChecklistsNameByIdChecklist(body, key, token, idChecklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#updateChecklistsNameByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChecklistsName**](ChecklistsName.md)| Attributes of &quot;Checklists Name&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idChecklist** | **String**| idChecklist |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateChecklistsPosByIdChecklist"></a>
# **updateChecklistsPosByIdChecklist**
> Void updateChecklistsPosByIdChecklist(body, key, token, idChecklist)

updateChecklistsPosByIdChecklist()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChecklistApi;

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

ChecklistApi apiInstance = new ChecklistApi();
ChecklistsPos body = new ChecklistsPos(); // ChecklistsPos | Attributes of "Checklists Pos" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String idChecklist = "idChecklist_example"; // String | idChecklist
try {
    Void result = apiInstance.updateChecklistsPosByIdChecklist(body, key, token, idChecklist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistApi#updateChecklistsPosByIdChecklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChecklistsPos**](ChecklistsPos.md)| Attributes of &quot;Checklists Pos&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **idChecklist** | **String**| idChecklist |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

