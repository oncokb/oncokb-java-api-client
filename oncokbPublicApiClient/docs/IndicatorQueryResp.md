

# IndicatorQueryResp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alleleExist** | **Boolean** | Indicates whether the alternate allele has been curated. See SOP Protocol 9.1 |  [optional] |
|**dataVersion** | **String** | OncoKB data version. See www.oncokb.org/news |  [optional] |
|**diagnosticImplications** | [**List&lt;Implication&gt;**](Implication.md) | List of diagnostic implications. Defaulted to empty list |  [optional] |
|**diagnosticSummary** | **String** | Diagnostic summary. Defaulted to \&quot;\&quot; |  [optional] |
|**geneExist** | **Boolean** | Indicates whether the gene is curated by OncoKB |  [optional] |
|**geneSummary** | **String** | Gene summary. Defaulted to \&quot;\&quot; |  [optional] |
|**highestDiagnosticImplicationLevel** | [**HighestDiagnosticImplicationLevelEnum**](#HighestDiagnosticImplicationLevelEnum) | (Nullable) The highest diagnostic level from a list of diagnostic evidences. |  [optional] |
|**highestFdaLevel** | [**HighestFdaLevelEnum**](#HighestFdaLevelEnum) | (Nullable) The highest FDA level from a list of therapeutic evidences. |  [optional] |
|**highestPrognosticImplicationLevel** | [**HighestPrognosticImplicationLevelEnum**](#HighestPrognosticImplicationLevelEnum) | (Nullable) The highest prognostic level from a list of prognostic evidences. |  [optional] |
|**highestResistanceLevel** | [**HighestResistanceLevelEnum**](#HighestResistanceLevelEnum) | (Nullable) The highest resistance level from a list of therapeutic evidences. |  [optional] |
|**highestSensitiveLevel** | [**HighestSensitiveLevelEnum**](#HighestSensitiveLevelEnum) | (Nullable) The highest sensitivity level from a list of therapeutic evidences. |  [optional] |
|**hotspot** | **Boolean** | Whether variant is recurrently found in cancer with statistical significance, as defined in Chang et al. (2017). See SOP Protocol 9.2 |  [optional] |
|**lastUpdate** | **String** | OncoKB data release date. Formatted as MM/DD/YYYY |  [optional] |
|**mutationEffect** | [**MutationEffectResp**](MutationEffectResp.md) |  |  [optional] |
|**oncogenic** | [**OncogenicEnum**](#OncogenicEnum) | The oncogenicity status of the variant. Defaulted to \&quot;Unknown\&quot;. |  [optional] |
|**otherSignificantResistanceLevels** | [**List&lt;OtherSignificantResistanceLevelsEnum&gt;**](#List&lt;OtherSignificantResistanceLevelsEnum&gt;) | DEPRECATED |  [optional] |
|**otherSignificantSensitiveLevels** | [**List&lt;OtherSignificantSensitiveLevelsEnum&gt;**](#List&lt;OtherSignificantSensitiveLevelsEnum&gt;) | DEPRECATED |  [optional] |
|**prognosticImplications** | [**List&lt;Implication&gt;**](Implication.md) | List of prognostic implications. Defaulted to empty list |  [optional] |
|**prognosticSummary** | **String** | Prognostic summary. Defaulted to \&quot;\&quot; |  [optional] |
|**query** | [**Query**](Query.md) |  |  [optional] |
|**treatments** | [**List&lt;IndicatorQueryTreatment&gt;**](IndicatorQueryTreatment.md) | List of therapeutic implications implications. Defaulted to empty list |  [optional] |
|**tumorTypeSummary** | **String** | Tumor type summary. Defaulted to \&quot;\&quot; |  [optional] |
|**variantExist** | **Boolean** | Indicates whether an exact match for the queried variant is curated |  [optional] |
|**variantSummary** | **String** | Variant summary. Defaulted to \&quot;\&quot; |  [optional] |
|**vus** | **Boolean** |  |  [optional] |



## Enum: HighestDiagnosticImplicationLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_DX1 | &quot;LEVEL_Dx1&quot; |
| LEVEL_DX2 | &quot;LEVEL_Dx2&quot; |
| LEVEL_DX3_ | &quot;LEVEL_Dx3.&quot; |



## Enum: HighestFdaLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_FDA1 | &quot;LEVEL_Fda1&quot; |
| LEVEL_FDA2 | &quot;LEVEL_Fda2&quot; |
| LEVEL_FDA3 | &quot;LEVEL_Fda3&quot; |



## Enum: HighestPrognosticImplicationLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_PX1 | &quot;LEVEL_Px1&quot; |
| LEVEL_PX2 | &quot;LEVEL_Px2&quot; |
| LEVEL_PX3 | &quot;LEVEL_Px3&quot; |



## Enum: HighestResistanceLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_R1 | &quot;LEVEL_R1&quot; |
| LEVEL_R2 | &quot;LEVEL_R2&quot; |



## Enum: HighestSensitiveLevelEnum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| LEVEL_3_A | &quot;LEVEL_3A&quot; |
| LEVEL_3_B | &quot;LEVEL_3B&quot; |
| LEVEL_4 | &quot;LEVEL_4&quot; |



## Enum: OncogenicEnum

| Name | Value |
|---- | -----|
| ONCOGENIC | &quot;Oncogenic&quot; |
| LIKELY_ONCOGENIC | &quot;Likely Oncogenic&quot; |
| LIKELY_NEUTRAL | &quot;Likely Neutral&quot; |
| INCONCLUSIVE | &quot;Inconclusive&quot; |
| RESISTANCE | &quot;Resistance&quot; |
| UNKNOWN | &quot;Unknown&quot; |



## Enum: List&lt;OtherSignificantResistanceLevelsEnum&gt;

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



## Enum: List&lt;OtherSignificantSensitiveLevelsEnum&gt;

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



