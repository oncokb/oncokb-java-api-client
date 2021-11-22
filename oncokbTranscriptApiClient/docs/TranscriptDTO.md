# TranscriptDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chromosome** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**end** | **Integer** |  |  [optional]
**ensemblProteinId** | **String** |  |  [optional]
**ensemblTranscriptId** | **String** |  |  [optional]
**entrezGeneId** | **Integer** |  | 
**exons** | [**List&lt;GenomeFragment&gt;**](GenomeFragment.md) |  |  [optional]
**hugoSymbol** | **String** |  | 
**id** | **Long** |  |  [optional]
**referenceGenome** | [**ReferenceGenomeEnum**](#ReferenceGenomeEnum) |  | 
**referenceSequenceId** | **String** |  |  [optional]
**start** | **Integer** |  |  [optional]
**strand** | **Integer** |  |  [optional]
**utrs** | [**List&lt;GenomeFragment&gt;**](GenomeFragment.md) |  |  [optional]

<a name="ReferenceGenomeEnum"></a>
## Enum: ReferenceGenomeEnum
Name | Value
---- | -----
GRCH37 | &quot;GRCh37&quot;
GRCH38 | &quot;GRCh38&quot;
