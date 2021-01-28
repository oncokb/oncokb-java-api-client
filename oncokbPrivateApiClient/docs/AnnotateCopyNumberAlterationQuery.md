
# AnnotateCopyNumberAlterationQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copyNameAlterationType** | [**CopyNameAlterationTypeEnum**](#CopyNameAlterationTypeEnum) |  |  [optional]
**evidenceTypes** | [**List&lt;EvidenceTypesEnum&gt;**](#List&lt;EvidenceTypesEnum&gt;) |  |  [optional]
**gene** | [**QueryGene**](QueryGene.md) |  |  [optional]
**id** | **String** |  |  [optional]
**referenceGenome** | [**ReferenceGenomeEnum**](#ReferenceGenomeEnum) |  |  [optional]
**tumorType** | **String** |  |  [optional]


<a name="CopyNameAlterationTypeEnum"></a>
## Enum: CopyNameAlterationTypeEnum
Name | Value
---- | -----
AMPLIFICATION | &quot;AMPLIFICATION&quot;
DELETION | &quot;DELETION&quot;
GAIN | &quot;GAIN&quot;
LOSS | &quot;LOSS&quot;


<a name="List<EvidenceTypesEnum>"></a>
## Enum: List&lt;EvidenceTypesEnum&gt;
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


<a name="ReferenceGenomeEnum"></a>
## Enum: ReferenceGenomeEnum
Name | Value
---- | -----
GRCH37 | &quot;GRCh37&quot;
GRCH38 | &quot;GRCh38&quot;



