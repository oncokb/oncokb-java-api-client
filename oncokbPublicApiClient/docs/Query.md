

# Query

Enriched user annotation query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alteration** | **String** | (Nullable) Alteration from original query or the resolved alteration from HGVS variant |  [optional] |
|**alterationType** | [**AlterationTypeEnum**](#AlterationTypeEnum) | (Nullable) Alteration type |  [optional] |
|**canonicalTranscript** | **String** | (Nullable) The OncoKB canonical transcript. See https://www.oncokb.org/cancer-genes |  [optional] |
|**consequence** | **String** | (Nullable) Variant consequence term from Ensembl. See https://useast.ensembl.org/info/genome/variation/prediction/predicted_data.html |  [optional] |
|**entrezGeneId** | **Integer** | (Nullable) Unique gene identifiers from NCBI. May be null if omitted from original query, otherwise filled in by OncoKB |  [optional] |
|**hgvs** | **String** | (Nullable) The hgvsg or genomic location from original query |  [optional] |
|**hgvsInfo** | **String** | (Nullable) Additional message for \&quot;hgvs\&quot; field. May indicate reason for failed hgvs annotation. |  [optional] |
|**hugoSymbol** | **String** | (Nullable) The gene symbol used in Human Genome Organisation |  [optional] |
|**id** | **String** | (Nullable) The id passed in request for the user to distinguish the query. |  [optional] |
|**proteinEnd** | **Integer** | (Nullable) Protein end position |  [optional] |
|**proteinStart** | **Integer** | (Nullable) Protein start position |  [optional] |
|**referenceGenome** | [**ReferenceGenomeEnum**](#ReferenceGenomeEnum) | Reference genome build version. Defaulted to GRCh37 |  [optional] |
|**svType** | [**SvTypeEnum**](#SvTypeEnum) | (Nullable) Structural variant type |  [optional] |
|**tumorType** | **String** | (Nullable) Oncotree tumor type name, code, or main type. |  [optional] |



## Enum: AlterationTypeEnum

| Name | Value |
|---- | -----|
| MUTATION | &quot;MUTATION&quot; |
| COPY_NUMBER_ALTERATION | &quot;COPY_NUMBER_ALTERATION&quot; |
| STRUCTURAL_VARIANT | &quot;STRUCTURAL_VARIANT&quot; |



## Enum: ReferenceGenomeEnum

| Name | Value |
|---- | -----|
| GRCH37 | &quot;GRCh37&quot; |
| GRCH38 | &quot;GRCh38&quot; |



## Enum: SvTypeEnum

| Name | Value |
|---- | -----|
| DELETION | &quot;DELETION&quot; |
| TRANSLOCATION | &quot;TRANSLOCATION&quot; |
| DUPLICATION | &quot;DUPLICATION&quot; |
| INSERTION | &quot;INSERTION&quot; |
| INVERSION | &quot;INVERSION&quot; |
| FUSION | &quot;FUSION&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



