

# GenomeFragment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**chromosome** | **String** |  |  [optional]
**start** | **Integer** |  |  [optional]
**end** | **Integer** |  |  [optional]
**strand** | **Integer** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**transcript** | [**Transcript**](Transcript.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
GENE | &quot;GENE&quot;
EXON | &quot;EXON&quot;
FIVE_PRIME_UTR | &quot;FIVE_PRIME_UTR&quot;
THREE_PRIME_UTR | &quot;THREE_PRIME_UTR&quot;


## Implemented Interfaces

* Serializable


