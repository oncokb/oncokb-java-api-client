# oncokbTranscriptApiClient

oncokb-transcript API
- API version: 0.0.1

oncokb-transcript API documentation


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.oncokb.oncokb-transcript.client</groupId>
  <artifactId>oncokbTranscriptApiClient</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'oncokbTranscriptApiClient' jar has been published to maven central.
    mavenLocal()       // Needed if the 'oncokbTranscriptApiClient' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.oncokb.oncokb-transcript.client:oncokbTranscriptApiClient:0.0.1-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/oncokbTranscriptApiClient-0.0.1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.oncokb.oncokb_transcript.ApiClient;
import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.Configuration;
import org.oncokb.oncokb_transcript.auth.*;
import org.oncokb.oncokb_transcript.models.*;
import org.oncokb.oncokb_transcript.client.AccountResourceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://transcript.oncokb.org:443");
    
    // Configure HTTP bearer authorization: Authorization
    HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setBearerToken("BEARER TOKEN");

    AccountResourceApi apiInstance = new AccountResourceApi(defaultClient);
    try {
      UserVM result = apiInstance.getAccountUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountResourceApi#getAccountUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://transcript.oncokb.org:443*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountResourceApi* | [**getAccountUsingGET**](docs/AccountResourceApi.md#getAccountUsingGET) | **GET** /api/account | getAccount
*AccountResourceApi* | [**isAuthenticatedUsingGET**](docs/AccountResourceApi.md#isAuthenticatedUsingGET) | **GET** /api/authenticate | isAuthenticated
*DrugControllerApi* | [**findDrugByCodeUsingGET**](docs/DrugControllerApi.md#findDrugByCodeUsingGET) | **GET** /api/drugs/search-by-code/{code} | findDrugByCode
*DrugControllerApi* | [**findDrugsUsingGET**](docs/DrugControllerApi.md#findDrugsUsingGET) | **GET** /api/drugs/search | findDrugs
*EnsemblGeneControllerApi* | [**addEnsemblGeneUsingPOST**](docs/EnsemblGeneControllerApi.md#addEnsemblGeneUsingPOST) | **POST** /api/add-ensembl-gene | addEnsemblGene
*GeneControllerApi* | [**findGeneBySymbolUsingGET**](docs/GeneControllerApi.md#findGeneBySymbolUsingGET) | **GET** /api/find-genes | findGeneBySymbol
*GeneControllerApi* | [**findGenesBySymbolsUsingPOST**](docs/GeneControllerApi.md#findGenesBySymbolsUsingPOST) | **POST** /api/find-genes | findGenesBySymbols
*GeneResourceApi* | [**getAllGenesUsingGET**](docs/GeneResourceApi.md#getAllGenesUsingGET) | **GET** /api/genes | getAllGenes
*PipelineControllerApi* | [**updateNcitUsingPOST**](docs/PipelineControllerApi.md#updateNcitUsingPOST) | **POST** /api/pipeline/update-ncit | updateNcit
*PipelineControllerApi* | [**updatePortalGeneUsingPOST**](docs/PipelineControllerApi.md#updatePortalGeneUsingPOST) | **POST** /api/pipeline/update-gene | updatePortalGene
*SequenceControllerApi* | [**findCanonicalSequenceUsingGET**](docs/SequenceControllerApi.md#findCanonicalSequenceUsingGET) | **GET** /api/find-canonical-sequences | findCanonicalSequence
*SequenceControllerApi* | [**findCanonicalSequencesUsingPOST**](docs/SequenceControllerApi.md#findCanonicalSequencesUsingPOST) | **POST** /api/find-canonical-sequences | findCanonicalSequences
*TranscriptControllerApi* | [**addTranscriptUsingPOST**](docs/TranscriptControllerApi.md#addTranscriptUsingPOST) | **POST** /api/add-transcript | addTranscript
*TranscriptControllerApi* | [**compareTranscriptUsingPOST**](docs/TranscriptControllerApi.md#compareTranscriptUsingPOST) | **POST** /api/compare-transcript/{hugoSymbol} | compareTranscript
*TranscriptControllerApi* | [**findTranscriptsByEnsemblIdsUsingPOST**](docs/TranscriptControllerApi.md#findTranscriptsByEnsemblIdsUsingPOST) | **POST** /api/find-transcripts-by-ensembl-ids | findTranscriptsByEnsemblIds
*TranscriptControllerApi* | [**matchTranscriptUsingPOST**](docs/TranscriptControllerApi.md#matchTranscriptUsingPOST) | **POST** /api/match-transcript/{hugoSymbol} | matchTranscript
*TranscriptControllerApi* | [**suggestVariantUsingGET**](docs/TranscriptControllerApi.md#suggestVariantUsingGET) | **GET** /api/suggest-variant/{hugoSymbol} | suggestVariant


## Documentation for Models

 - [AddEnsemblGeneBody](docs/AddEnsemblGeneBody.md)
 - [AddTranscriptBody](docs/AddTranscriptBody.md)
 - [AllReferenceTranscriptSuggestionVM](docs/AllReferenceTranscriptSuggestionVM.md)
 - [Drug](docs/Drug.md)
 - [DrugSynonym](docs/DrugSynonym.md)
 - [EnsemblGene](docs/EnsemblGene.md)
 - [EnsemblTranscript](docs/EnsemblTranscript.md)
 - [Exon](docs/Exon.md)
 - [Gene](docs/Gene.md)
 - [GeneAlias](docs/GeneAlias.md)
 - [GenomeFragment](docs/GenomeFragment.md)
 - [MatchTranscriptVM](docs/MatchTranscriptVM.md)
 - [PfamDomainRange](docs/PfamDomainRange.md)
 - [Sequence](docs/Sequence.md)
 - [Transcript](docs/Transcript.md)
 - [TranscriptComparisonResultVM](docs/TranscriptComparisonResultVM.md)
 - [TranscriptComparisonVM](docs/TranscriptComparisonVM.md)
 - [TranscriptDTO](docs/TranscriptDTO.md)
 - [TranscriptMatchResultVM](docs/TranscriptMatchResultVM.md)
 - [TranscriptPairVM](docs/TranscriptPairVM.md)
 - [TranscriptSuggestionVM](docs/TranscriptSuggestionVM.md)
 - [UntranslatedRegion](docs/UntranslatedRegion.md)
 - [UserVM](docs/UserVM.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



