<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for managing objects in studio experience

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=ObjectConfiguration&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-object-configuration-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-object-configuration-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-object-configuration-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ObjectConfigurationApi* | [**getCalculationConcept**](docs/ObjectConfigurationApi.md#getCalculationConcept) | **GET** /v1/admin/calculation-concepts/{conceptId} | Retrieve the configuration of a calculation concept
*ObjectConfigurationApi* | [**getCalculationConcepts**](docs/ObjectConfigurationApi.md#getCalculationConcepts) | **GET** /v1/admin/calculation-concepts | Retrieve all calculation concepts
*ObjectConfigurationApi* | [**getSelectionConcept**](docs/ObjectConfigurationApi.md#getSelectionConcept) | **GET** /v1/admin/selection-concepts/{conceptId} | Retrieve the configuration of a selection concept
*ObjectConfigurationApi* | [**getSelectionConcepts**](docs/ObjectConfigurationApi.md#getSelectionConcepts) | **GET** /v1/admin/selection-concepts | Retrieve all selection concepts
*ObjectConfigurationApi* | [**mapCalculationConcept**](docs/ObjectConfigurationApi.md#mapCalculationConcept) | **PUT** /v1/admin/calculation-concepts/{conceptId}/configure | Map dimension members to nodes in a calculation concept
*ObjectConfigurationApi* | [**mapSelectionConcept**](docs/ObjectConfigurationApi.md#mapSelectionConcept) | **PUT** /v1/admin/selection-concepts/{conceptId}/configure | Map dimension members to a selection concept


## Documentation for Models

 - [AnalyticObjectFilterDTO](docs/AnalyticObjectFilterDTO.md)
 - [CalculationConceptConfigurationDTO](docs/CalculationConceptConfigurationDTO.md)
 - [CalculationConceptConfigurationMapDTO](docs/CalculationConceptConfigurationMapDTO.md)
 - [CalculationConceptDTO](docs/CalculationConceptDTO.md)
 - [CalculationConceptListDTO](docs/CalculationConceptListDTO.md)
 - [ConceptConfigurationResultDTO](docs/ConceptConfigurationResultDTO.md)
 - [DimensionFilterDTO](docs/DimensionFilterDTO.md)
 - [DimensionMemberDTO](docs/DimensionMemberDTO.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [PerspectiveConfigurationDTO](docs/PerspectiveConfigurationDTO.md)
 - [PerspectiveNodeDTO](docs/PerspectiveNodeDTO.md)
 - [SelectionConceptConfigurationDTO](docs/SelectionConceptConfigurationDTO.md)
 - [SelectionConceptConfigurationMapDTO](docs/SelectionConceptConfigurationMapDTO.md)
 - [SelectionConceptDTO](docs/SelectionConceptDTO.md)
 - [SelectionConceptListDTO](docs/SelectionConceptListDTO.md)
 - [Status](docs/Status.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
