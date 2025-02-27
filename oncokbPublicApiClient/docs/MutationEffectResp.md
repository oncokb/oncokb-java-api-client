

# MutationEffectResp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**citations** | [**Citations**](Citations.md) |  |  [optional] |
|**description** | **String** | A brief overview of the biological and oncogenic effect of the variant. Defaulted to \&quot;\&quot; |  [optional] |
|**knownEffect** | [**KnownEffectEnum**](#KnownEffectEnum) | Indicates the effect of the mutation on the gene. Defaulted to \&quot;\&quot; |  [optional] |



## Enum: KnownEffectEnum

| Name | Value |
|---- | -----|
| GAIN_OF_FUNCTION | &quot;Gain-of-function&quot; |
| INCONCLUSIVE | &quot;Inconclusive&quot; |
| LOSS_OF_FUNCTION | &quot;Loss-of-function&quot; |
| LIKELY_LOSS_OF_FUNCTION | &quot;Likely Loss-of-function&quot; |
| LIKELY_GAIN_OF_FUNCTION | &quot;Likely Gain-of-function&quot; |
| NEUTRAL | &quot;Neutral&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| LIKELY_SWITCH_OF_FUNCTION | &quot;Likely Switch-of-function&quot; |
| SWITCH_OF_FUNCTION | &quot;Switch-of-function&quot; |
| LIKELY_NEUTRAL | &quot;Likely Neutral&quot; |



