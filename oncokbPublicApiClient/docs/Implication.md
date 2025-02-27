

# Implication


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**abstracts** | [**List&lt;ArticleAbstract&gt;**](ArticleAbstract.md) | List of abstracts cited to support the level of evidence. Defaulted to empty list |  [optional] |
|**alterations** | **List&lt;String&gt;** | List of alterations associated with implication |  [optional] |
|**description** | **String** | DEPRECATED |  [optional] |
|**levelOfEvidence** | [**LevelOfEvidenceEnum**](#LevelOfEvidenceEnum) | Level associated with implication |  [optional] |
|**pmids** | **List&lt;String&gt;** | List of PubMed IDs cited to support the level of evidence. Defaulted to empty list |  [optional] |
|**tumorType** | [**TumorType**](TumorType.md) |  |  [optional] |



## Enum: LevelOfEvidenceEnum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3_A | &quot;LEVEL_3A&quot; |
| LEVEL_3_B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3 | &quot;LEVEL_Dx3&quot; |
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |
| NO | &quot;NO&quot; |



