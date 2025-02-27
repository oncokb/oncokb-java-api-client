

# IndicatorQueryTreatment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**abstracts** | [**List&lt;ArticleAbstract&gt;**](ArticleAbstract.md) | List of abstracts cited in the treatment description. Defaulted to empty list |  [optional] |
|**alterations** | **List&lt;String&gt;** | List of alterations associated with therapeutic implication |  [optional] |
|**approvedIndications** | **List&lt;String&gt;** | DEPRECATED |  [optional] |
|**description** | **String** | Treatment description. Defaulted to \&quot;\&quot; |  [optional] |
|**drugs** | [**List&lt;Drug&gt;**](Drug.md) | List of drugs associated with therapeutic implication |  [optional] |
|**fdaLevel** | [**FdaLevelEnum**](#FdaLevelEnum) | FDA level associated with implication |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | Therapeutic level associated with implication |  [optional] |
|**levelAssociatedCancerType** | [**TumorType**](TumorType.md) |  |  [optional] |
|**levelExcludedCancerTypes** | [**List&lt;TumorType&gt;**](TumorType.md) | Excluded cancer types. Defaulted to empty list |  [optional] |
|**pmids** | **List&lt;String&gt;** | List of PubMed IDs cited in the treatment description. Defaulted to empty list |  [optional] |



## Enum: FdaLevelEnum

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



## Enum: LevelEnum

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



