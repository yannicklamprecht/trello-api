# TokenApi

All URIs are relative to *https://trello.com/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTokensWebhooksByToken**](TokenApi.md#addTokensWebhooksByToken) | **POST** tokens/{token}/webhooks | addTokensWebhooksByToken()
[**deleteTokensByToken**](TokenApi.md#deleteTokensByToken) | **DELETE** tokens/{token} | deleteTokensByToken()
[**deleteTokensWebhooksByTokenByIdWebhook**](TokenApi.md#deleteTokensWebhooksByTokenByIdWebhook) | **DELETE** tokens/{token}/webhooks/{idWebhook} | deleteTokensWebhooksByTokenByIdWebhook()
[**getTokensByToken**](TokenApi.md#getTokensByToken) | **GET** tokens/{token} | getTokensByToken()
[**getTokensByTokenByField**](TokenApi.md#getTokensByTokenByField) | **GET** tokens/{token}/{field} | getTokensByTokenByField()
[**getTokensMemberByToken**](TokenApi.md#getTokensMemberByToken) | **GET** tokens/{token}/member | getTokensMemberByToken()
[**getTokensMemberByTokenByField**](TokenApi.md#getTokensMemberByTokenByField) | **GET** tokens/{token}/member/{field} | getTokensMemberByTokenByField()
[**getTokensWebhooksByToken**](TokenApi.md#getTokensWebhooksByToken) | **GET** tokens/{token}/webhooks | getTokensWebhooksByToken()
[**getTokensWebhooksByTokenByIdWebhook**](TokenApi.md#getTokensWebhooksByTokenByIdWebhook) | **GET** tokens/{token}/webhooks/{idWebhook} | getTokensWebhooksByTokenByIdWebhook()
[**updateTokensWebhooksByToken**](TokenApi.md#updateTokensWebhooksByToken) | **PUT** tokens/{token}/webhooks | updateTokensWebhooksByToken()

<a name="addTokensWebhooksByToken"></a>
# **addTokensWebhooksByToken**
> Void addTokensWebhooksByToken(body, key, token2, token)

addTokensWebhooksByToken()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
TokensWebhooks body = new TokensWebhooks(); // TokensWebhooks | Attributes of "Tokens Webhooks" to be added.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token2 = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String token = "token_example"; // String | token
try {
    Void result = apiInstance.addTokensWebhooksByToken(body, key, token2, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#addTokensWebhooksByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokensWebhooks**](TokensWebhooks.md)| Attributes of &quot;Tokens Webhooks&quot; to be added. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token2** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **token** | **String**| token |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="deleteTokensByToken"></a>
# **deleteTokensByToken**
> Void deleteTokensByToken(token, key, token)

deleteTokensByToken()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteTokensByToken(token, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#deleteTokensByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTokensWebhooksByTokenByIdWebhook"></a>
# **deleteTokensWebhooksByTokenByIdWebhook**
> Void deleteTokensWebhooksByTokenByIdWebhook(token, idWebhook, key, token)

deleteTokensWebhooksByTokenByIdWebhook()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String idWebhook = "idWebhook_example"; // String | idWebhook
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.deleteTokensWebhooksByTokenByIdWebhook(token, idWebhook, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#deleteTokensWebhooksByTokenByIdWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **idWebhook** | **String**| idWebhook |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTokensByToken"></a>
# **getTokensByToken**
> Void getTokensByToken(token, key, token, fields, webhooks)

getTokensByToken()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: dateCreated, dateExpires, idMember, identifier or permissions
String webhooks = "webhooks_example"; // String |  true or false
try {
    Void result = apiInstance.getTokensByToken(token, key, token, fields, webhooks);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokensByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **fields** | **String**| all or a comma-separated list of: dateCreated, dateExpires, idMember, identifier or permissions | [optional] [default to all]
 **webhooks** | **String**|  true or false | [optional]

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTokensByTokenByField"></a>
# **getTokensByTokenByField**
> Void getTokensByTokenByField(token, field, key, token)

getTokensByTokenByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getTokensByTokenByField(token, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokensByTokenByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
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

<a name="getTokensMemberByToken"></a>
# **getTokensMemberByToken**
> Void getTokensMemberByToken(token, key, token, fields)

getTokensMemberByToken()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String fields = "all"; // String | all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username
try {
    Void result = apiInstance.getTokensMemberByToken(token, key, token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokensMemberByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
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

<a name="getTokensMemberByTokenByField"></a>
# **getTokensMemberByTokenByField**
> Void getTokensMemberByTokenByField(token, field, key, token)

getTokensMemberByTokenByField()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String field = "field_example"; // String | field
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getTokensMemberByTokenByField(token, field, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokensMemberByTokenByField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
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

<a name="getTokensWebhooksByToken"></a>
# **getTokensWebhooksByToken**
> Void getTokensWebhooksByToken(token, key, token)

getTokensWebhooksByToken()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getTokensWebhooksByToken(token, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokensWebhooksByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTokensWebhooksByTokenByIdWebhook"></a>
# **getTokensWebhooksByTokenByIdWebhook**
> Void getTokensWebhooksByTokenByIdWebhook(token, idWebhook, key, token)

getTokensWebhooksByTokenByIdWebhook()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
String token = "token_example"; // String | token
String idWebhook = "idWebhook_example"; // String | idWebhook
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getTokensWebhooksByTokenByIdWebhook(token, idWebhook, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokensWebhooksByTokenByIdWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |
 **idWebhook** | **String**| idWebhook |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateTokensWebhooksByToken"></a>
# **updateTokensWebhooksByToken**
> Void updateTokensWebhooksByToken(body, key, token2, token)

updateTokensWebhooksByToken()

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

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

TokenApi apiInstance = new TokenApi();
TokensWebhooks body = new TokensWebhooks(); // TokensWebhooks | Attributes of "Tokens Webhooks" to be updated.
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token2 = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
String token = "token_example"; // String | token
try {
    Void result = apiInstance.updateTokensWebhooksByToken(body, key, token2, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#updateTokensWebhooksByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokensWebhooks**](TokensWebhooks.md)| Attributes of &quot;Tokens Webhooks&quot; to be updated. |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token2** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |
 **token** | **String**| token |

### Return type

[**Void**](.md)

### Authorization

[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

