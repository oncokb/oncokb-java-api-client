

# TumorType

OncoTree Detailed Cancer Type. See https://oncotree.mskcc.org/?version=oncotree_2019_12_01

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**children** | [**Map&lt;String, TumorType&gt;**](TumorType.md) | Map from parent tumor type to children tumor types |  [optional] |
|**code** | **String** | Oncotree code |  [optional] |
|**color** | **String** | (Nullable) Color of tumor |  [optional] |
|**id** | **Integer** | Database TumorType ID |  [optional] |
|**level** | **Integer** | Oncotree tumor type level. -1 indicates special tumor types (See SpecialTumorTypes.java) |  [optional] |
|**mainType** | [**MainType**](MainType.md) |  |  [optional] |
|**name** | **String** | (Nullable) Oncotree sub type |  [optional] |
|**parent** | **String** | (Nullable) Parent tumor name |  [optional] |
|**tissue** | **String** | (Nullable) Oncotree tumor tissue |  [optional] |
|**tumorForm** | [**TumorFormEnum**](#TumorFormEnum) | Tumor form |  [optional] |



## Enum: TumorFormEnum

| Name | Value |
|---- | -----|
| SOLID | &quot;SOLID&quot; |
| LIQUID | &quot;LIQUID&quot; |
| MIXED | &quot;MIXED&quot; |



