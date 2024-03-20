# ObjectConfigurationApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCalculationConcept**](ObjectConfigurationApi.md#getCalculationConcept) | **GET** /v1/admin/calculation-concepts/{conceptId} | Retrieve the configuration of a calculation concept |
| [**getCalculationConcepts**](ObjectConfigurationApi.md#getCalculationConcepts) | **GET** /v1/admin/calculation-concepts | Retrieve all calculation concepts |
| [**getSelectionConcept**](ObjectConfigurationApi.md#getSelectionConcept) | **GET** /v1/admin/selection-concepts/{conceptId} | Retrieve the configuration of a selection concept |
| [**getSelectionConcepts**](ObjectConfigurationApi.md#getSelectionConcepts) | **GET** /v1/admin/selection-concepts | Retrieve all selection concepts |
| [**mapCalculationConcept**](ObjectConfigurationApi.md#mapCalculationConcept) | **PUT** /v1/admin/calculation-concepts/{conceptId}/configure | Map dimension members to nodes in a calculation concept |
| [**mapSelectionConcept**](ObjectConfigurationApi.md#mapSelectionConcept) | **PUT** /v1/admin/selection-concepts/{conceptId}/configure | Map dimension members to a selection concept |


<a name="getCalculationConcept"></a>
# **getCalculationConcept**
> CalculationConceptDTO getCalculationConcept(conceptId).execute();

Retrieve the configuration of a calculation concept

This API allows you to retrieve the configuration details of a calculation concept in production.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierObjectConfiguration;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectConfigurationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierObjectConfiguration client = new VisierObjectConfiguration(configuration);
    String conceptId = "conceptId_example"; // The ID of the concept to retrieve the configuration for.
    try {
      CalculationConceptDTO result = client
              .objectConfiguration
              .getCalculationConcept(conceptId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getName());
      System.out.println(result.getConfiguration());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getCalculationConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CalculationConceptDTO> response = client
              .objectConfiguration
              .getCalculationConcept(conceptId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getCalculationConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conceptId** | **String**| The ID of the concept to retrieve the configuration for. | |

### Return type

[**CalculationConceptDTO**](CalculationConceptDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getCalculationConcepts"></a>
# **getCalculationConcepts**
> CalculationConceptListDTO getCalculationConcepts().execute();

Retrieve all calculation concepts

This API allows you to retrieve the calculation concepts available in production.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierObjectConfiguration;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectConfigurationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierObjectConfiguration client = new VisierObjectConfiguration(configuration);
    try {
      CalculationConceptListDTO result = client
              .objectConfiguration
              .getCalculationConcepts()
              .execute();
      System.out.println(result);
      System.out.println(result.getConcepts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getCalculationConcepts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CalculationConceptListDTO> response = client
              .objectConfiguration
              .getCalculationConcepts()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getCalculationConcepts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CalculationConceptListDTO**](CalculationConceptListDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getSelectionConcept"></a>
# **getSelectionConcept**
> SelectionConceptDTO getSelectionConcept(conceptId).execute();

Retrieve the configuration of a selection concept

This API allows you to retrieve the configuration details of a selection concept in production.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierObjectConfiguration;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectConfigurationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierObjectConfiguration client = new VisierObjectConfiguration(configuration);
    String conceptId = "conceptId_example"; // The ID of the concept to retrieve the configuration for.
    try {
      SelectionConceptDTO result = client
              .objectConfiguration
              .getSelectionConcept(conceptId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getName());
      System.out.println(result.getConfiguration());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getSelectionConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SelectionConceptDTO> response = client
              .objectConfiguration
              .getSelectionConcept(conceptId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getSelectionConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conceptId** | **String**| The ID of the concept to retrieve the configuration for. | |

### Return type

[**SelectionConceptDTO**](SelectionConceptDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getSelectionConcepts"></a>
# **getSelectionConcepts**
> SelectionConceptListDTO getSelectionConcepts().execute();

Retrieve all selection concepts

This API allows you to retrieve the selection concepts available in production.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierObjectConfiguration;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectConfigurationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierObjectConfiguration client = new VisierObjectConfiguration(configuration);
    try {
      SelectionConceptListDTO result = client
              .objectConfiguration
              .getSelectionConcepts()
              .execute();
      System.out.println(result);
      System.out.println(result.getConcepts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getSelectionConcepts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SelectionConceptListDTO> response = client
              .objectConfiguration
              .getSelectionConcepts()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#getSelectionConcepts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SelectionConceptListDTO**](SelectionConceptListDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="mapCalculationConcept"></a>
# **mapCalculationConcept**
> ConceptConfigurationResultDTO mapCalculationConcept(conceptId, calculationConceptConfigurationMapDTO).execute();

Map dimension members to nodes in a calculation concept

This API allows you to map dimension members to nodes in a calculation concept.  The changes are applied in a new project and published to production.   The body of this API is the source of truth for dimension members mapped to the concept. For example, if a node in  the body does not have any dimension members, all existing dimension members mapped to that node will be removed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierObjectConfiguration;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectConfigurationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierObjectConfiguration client = new VisierObjectConfiguration(configuration);
    String conceptId = "conceptId_example"; // The UUID of the concept to configure.
    List<PerspectiveConfigurationDTO> perspectivesToMap = Arrays.asList(); // A list of objects representing the list of perspectives in the calculation concept.
    try {
      ConceptConfigurationResultDTO result = client
              .objectConfiguration
              .mapCalculationConcept(conceptId)
              .perspectivesToMap(perspectivesToMap)
              .execute();
      System.out.println(result);
      System.out.println(result.getConceptId());
      System.out.println(result.getProjectId());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#mapCalculationConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConceptConfigurationResultDTO> response = client
              .objectConfiguration
              .mapCalculationConcept(conceptId)
              .perspectivesToMap(perspectivesToMap)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#mapCalculationConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conceptId** | **String**| The UUID of the concept to configure. | |
| **calculationConceptConfigurationMapDTO** | [**CalculationConceptConfigurationMapDTO**](CalculationConceptConfigurationMapDTO.md)|  | |

### Return type

[**ConceptConfigurationResultDTO**](ConceptConfigurationResultDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="mapSelectionConcept"></a>
# **mapSelectionConcept**
> ConceptConfigurationResultDTO mapSelectionConcept(conceptId, selectionConceptConfigurationMapDTO).execute();

Map dimension members to a selection concept

This API allows you to map dimension members to a selection concept.  The changes are applied to a new project and published to production.   The body of this API is the source of truth for dimension members mapped to the concept. For example, if a node in  the body does not have any dimension members, all existing dimension members mapped to that node will be removed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierObjectConfiguration;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectConfigurationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierObjectConfiguration client = new VisierObjectConfiguration(configuration);
    String conceptId = "conceptId_example"; // The UUID of the concept to configure.
    List<AnalyticObjectFilterDTO> analyticObjectFiltersToMap = Arrays.asList(); // A list of analytic object filters indicating the analytic object and dimension members used  for the selection concept.   Note: If this array is empty, all filters will be removed for the concept.
    try {
      ConceptConfigurationResultDTO result = client
              .objectConfiguration
              .mapSelectionConcept(conceptId)
              .analyticObjectFiltersToMap(analyticObjectFiltersToMap)
              .execute();
      System.out.println(result);
      System.out.println(result.getConceptId());
      System.out.println(result.getProjectId());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#mapSelectionConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConceptConfigurationResultDTO> response = client
              .objectConfiguration
              .mapSelectionConcept(conceptId)
              .analyticObjectFiltersToMap(analyticObjectFiltersToMap)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectConfigurationApi#mapSelectionConcept");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conceptId** | **String**| The UUID of the concept to configure. | |
| **selectionConceptConfigurationMapDTO** | [**SelectionConceptConfigurationMapDTO**](SelectionConceptConfigurationMapDTO.md)|  | |

### Return type

[**ConceptConfigurationResultDTO**](ConceptConfigurationResultDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

