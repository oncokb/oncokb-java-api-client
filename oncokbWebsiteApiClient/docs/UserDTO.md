# UserDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activated** | **Boolean** |  |  [optional]
**activationKey** | **String** |  |  [optional]
**additionalInfo** | [**AdditionalInfoDTO**](AdditionalInfoDTO.md) |  |  [optional]
**authorities** | **List&lt;String&gt;** |  |  [optional]
**city** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**email** | **String** |  |  [optional]
**emailVerified** | **Boolean** |  |  [optional]
**firstName** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**imageUrl** | **String** |  |  [optional]
**jobTitle** | **String** |  |  [optional]
**langKey** | **String** |  |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastName** | **String** |  |  [optional]
**licenseType** | [**LicenseTypeEnum**](#LicenseTypeEnum) |  |  [optional]
**login** | **String** |  |  [optional]
**resetDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**resetKey** | **String** |  |  [optional]

<a name="LicenseTypeEnum"></a>
## Enum: LicenseTypeEnum
Name | Value
---- | -----
ACADEMIC | &quot;ACADEMIC&quot;
COMMERCIAL | &quot;COMMERCIAL&quot;
RESEARCH_IN_COMMERCIAL | &quot;RESEARCH_IN_COMMERCIAL&quot;
HOSPITAL | &quot;HOSPITAL&quot;
