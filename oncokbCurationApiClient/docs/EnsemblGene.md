

# EnsemblGene


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**referenceGenome** | [**ReferenceGenomeEnum**](#ReferenceGenomeEnum) |  |  [optional]
**ensemblGeneId** | **String** |  | 
**canonical** | **Boolean** |  | 
**chromosome** | **String** |  | 
**start** | **Integer** |  | 
**end** | **Integer** |  | 
**strand** | **Integer** |  | 
**transcripts** | [**Set&lt;Transcript&gt;**](Transcript.md) |  |  [optional]
**gene** | [**Gene**](Gene.md) |  |  [optional]



## Enum: ReferenceGenomeEnum

Name | Value
---- | -----
GRCH37 | &quot;GRCh37&quot;
GRCH38 | &quot;GRCh38&quot;


## Implemented Interfaces

* Serializable


