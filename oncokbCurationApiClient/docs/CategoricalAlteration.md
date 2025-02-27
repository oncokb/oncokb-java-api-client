

# CategoricalAlteration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**alterationType** | [**AlterationTypeEnum**](#AlterationTypeEnum) |  | 



## Enum: TypeEnum

Name | Value
---- | -----
ONCOGENIC_MUTATIONS | &quot;ONCOGENIC_MUTATIONS&quot;
GAIN_OF_FUNCTION_MUTATIONS | &quot;GAIN_OF_FUNCTION_MUTATIONS&quot;
LOSS_OF_FUNCTION_MUTATIONS | &quot;LOSS_OF_FUNCTION_MUTATIONS&quot;
SWITCH_OF_FUNCTION_MUTATIONS | &quot;SWITCH_OF_FUNCTION_MUTATIONS&quot;
VUS | &quot;VUS&quot;
TRUNCATING_MUTATIONS | &quot;TRUNCATING_MUTATIONS&quot;
FUSIONS | &quot;FUSIONS&quot;
AMPLIFICATION | &quot;AMPLIFICATION&quot;
DELETION | &quot;DELETION&quot;
PROMOTER | &quot;PROMOTER&quot;
WILDTYPE | &quot;WILDTYPE&quot;



## Enum: AlterationTypeEnum

Name | Value
---- | -----
MUTATION | &quot;MUTATION&quot;
COPY_NUMBER_ALTERATION | &quot;COPY_NUMBER_ALTERATION&quot;
STRUCTURAL_VARIANT | &quot;STRUCTURAL_VARIANT&quot;
UNKNOWN | &quot;UNKNOWN&quot;
NA | &quot;NA&quot;


## Implemented Interfaces

* Serializable


