# Transcript

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  |  [optional]
**ensemblProteinId** | **String** |  |  [optional]
**ensemblTranscriptId** | **String** |  |  [optional]
**entrezGeneId** | **Integer** |  | 
**hugoSymbol** | **String** |  | 
**id** | **Long** |  |  [optional]
**referenceGenome** | [**ReferenceGenomeEnum**](#ReferenceGenomeEnum) |  | 
**referenceSequenceId** | **String** |  |  [optional]
**sequences** | [**List&lt;Sequence&gt;**](Sequence.md) |  |  [optional]
**transcriptUsages** | [**List&lt;TranscriptUsage&gt;**](TranscriptUsage.md) |  |  [optional]

<a name="ReferenceGenomeEnum"></a>
## Enum: ReferenceGenomeEnum
Name | Value
---- | -----
GRCH37 | &quot;GRCh37&quot;
GRCH38 | &quot;GRCh38&quot;
