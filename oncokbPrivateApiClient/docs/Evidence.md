

# Evidence


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalInfo** | **String** |  |  [optional]
**alterations** | [**List&lt;Alteration&gt;**](Alteration.md) |  |  [optional]
**articles** | [**List&lt;Article&gt;**](Article.md) |  |  [optional]
**cancerTypes** | [**List&lt;TumorType&gt;**](TumorType.md) |  |  [optional]
**description** | **String** |  |  [optional]
**evidenceType** | [**EvidenceTypeEnum**](#EvidenceTypeEnum) |  |  [optional]
**excludedCancerTypes** | [**List&lt;TumorType&gt;**](TumorType.md) |  |  [optional]
**fdaLevel** | [**FdaLevelEnum**](#FdaLevelEnum) |  |  [optional]
**gene** | [**Gene**](Gene.md) |  |  [optional]
**id** | **Integer** |  |  [optional]
**knownEffect** | **String** |  |  [optional]
**lastEdit** | **OffsetDateTime** |  |  [optional]
**lastReview** | **OffsetDateTime** |  |  [optional]
**levelOfEvidence** | [**LevelOfEvidenceEnum**](#LevelOfEvidenceEnum) |  |  [optional]
**liquidPropagationLevel** | [**LiquidPropagationLevelEnum**](#LiquidPropagationLevelEnum) |  |  [optional]
**relevantCancerTypes** | [**List&lt;TumorType&gt;**](TumorType.md) |  |  [optional]
**solidPropagationLevel** | [**SolidPropagationLevelEnum**](#SolidPropagationLevelEnum) |  |  [optional]
**treatments** | [**List&lt;Treatment&gt;**](Treatment.md) |  |  [optional]
**uuid** | **String** |  |  [optional]



## Enum: EvidenceTypeEnum

Name | Value
---- | -----
GENE_SUMMARY | &quot;GENE_SUMMARY&quot;
MUTATION_SUMMARY | &quot;MUTATION_SUMMARY&quot;
TUMOR_TYPE_SUMMARY | &quot;TUMOR_TYPE_SUMMARY&quot;
GENE_TUMOR_TYPE_SUMMARY | &quot;GENE_TUMOR_TYPE_SUMMARY&quot;
PROGNOSTIC_SUMMARY | &quot;PROGNOSTIC_SUMMARY&quot;
DIAGNOSTIC_SUMMARY | &quot;DIAGNOSTIC_SUMMARY&quot;
GENE_BACKGROUND | &quot;GENE_BACKGROUND&quot;
ONCOGENIC | &quot;ONCOGENIC&quot;
MUTATION_EFFECT | &quot;MUTATION_EFFECT&quot;
VUS | &quot;VUS&quot;
PROGNOSTIC_IMPLICATION | &quot;PROGNOSTIC_IMPLICATION&quot;
DIAGNOSTIC_IMPLICATION | &quot;DIAGNOSTIC_IMPLICATION&quot;
STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY | &quot;STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY&quot;
STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE | &quot;STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE&quot;
INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY | &quot;INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY&quot;
INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE | &quot;INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE&quot;



## Enum: FdaLevelEnum

Name | Value
---- | -----
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
LEVEL_FDA1 | &quot;LEVEL_Fda1&quot;
LEVEL_FDA2 | &quot;LEVEL_Fda2&quot;
LEVEL_FDA3 | &quot;LEVEL_Fda3&quot;
NO | &quot;NO&quot;



## Enum: LevelOfEvidenceEnum

Name | Value
---- | -----
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
LEVEL_FDA1 | &quot;LEVEL_Fda1&quot;
LEVEL_FDA2 | &quot;LEVEL_Fda2&quot;
LEVEL_FDA3 | &quot;LEVEL_Fda3&quot;
NO | &quot;NO&quot;



## Enum: LiquidPropagationLevelEnum

Name | Value
---- | -----
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
LEVEL_FDA1 | &quot;LEVEL_Fda1&quot;
LEVEL_FDA2 | &quot;LEVEL_Fda2&quot;
LEVEL_FDA3 | &quot;LEVEL_Fda3&quot;
NO | &quot;NO&quot;



## Enum: SolidPropagationLevelEnum

Name | Value
---- | -----
LEVEL_1 | &quot;LEVEL_1&quot;
LEVEL_2 | &quot;LEVEL_2&quot;
LEVEL_3A | &quot;LEVEL_3A&quot;
LEVEL_3B | &quot;LEVEL_3B&quot;
LEVEL_4 | &quot;LEVEL_4&quot;
LEVEL_R1 | &quot;LEVEL_R1&quot;
LEVEL_R2 | &quot;LEVEL_R2&quot;
LEVEL_PX1 | &quot;LEVEL_Px1&quot;
LEVEL_PX2 | &quot;LEVEL_Px2&quot;
LEVEL_PX3 | &quot;LEVEL_Px3&quot;
LEVEL_DX1 | &quot;LEVEL_Dx1&quot;
LEVEL_DX2 | &quot;LEVEL_Dx2&quot;
LEVEL_DX3 | &quot;LEVEL_Dx3&quot;
LEVEL_FDA1 | &quot;LEVEL_Fda1&quot;
LEVEL_FDA2 | &quot;LEVEL_Fda2&quot;
LEVEL_FDA3 | &quot;LEVEL_Fda3&quot;
NO | &quot;NO&quot;



