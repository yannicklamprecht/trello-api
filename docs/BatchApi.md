# BatchApi

All URIs are relative to *https://trello.com/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatch**](BatchApi.md#getBatch) | **GET** batch | getBatch()

<a name="getBatch"></a>
# **getBatch**
> Void getBatch(urls, key, token)

getBatch()

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BatchApi;


BatchApi apiInstance = new BatchApi();
String urls = "urls_example"; // String | list of API v1 GET routes, not including the version prefix
String key = "key_example"; // String | <a href=\"https://trello.com/1/appKey/generate\"  target=\"_blank\">Generate your application key</a>
String token = "token_example"; // String | <a href=\"https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\"  target=\"_blank\">Getting a token from a user</a>
try {
    Void result = apiInstance.getBatch(urls, key, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#getBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **urls** | **String**| list of API v1 GET routes, not including the version prefix |
 **key** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/1/appKey/generate\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Generate your application key&lt;/a&gt; |
 **token** | **String**| &lt;a href&#x3D;\&quot;https://trello.com/docs/gettingstarted/index.html#getting-a-token-from-a-user\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;Getting a token from a user&lt;/a&gt; |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

