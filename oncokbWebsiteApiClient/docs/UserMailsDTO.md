# UserMailsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**mailType** | [**MailTypeEnum**](#MailTypeEnum) |  |  [optional]
**sentBy** | **String** |  |  [optional]
**sentDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sentFrom** | **String** |  |  [optional]
**userId** | **Long** |  |  [optional]
**userLogin** | **String** |  |  [optional]

<a name="MailTypeEnum"></a>
## Enum: MailTypeEnum
Name | Value
---- | -----
ACTIVATION | &quot;ACTIVATION&quot;
APPROVAL | &quot;APPROVAL&quot;
CREATION | &quot;CREATION&quot;
PASSWORD_RESET | &quot;PASSWORD_RESET&quot;
LICENSE_REVIEW_COMMERCIAL | &quot;LICENSE_REVIEW_COMMERCIAL&quot;
LICENSE_REVIEW_RESEARCH_COMMERCIAL | &quot;LICENSE_REVIEW_RESEARCH_COMMERCIAL&quot;
LICENSE_REVIEW_HOSPITAL | &quot;LICENSE_REVIEW_HOSPITAL&quot;
CLARIFY_ACADEMIC_FOR_PROFIT | &quot;CLARIFY_ACADEMIC_FOR_PROFIT&quot;
CLARIFY_ACADEMIC_NON_INSTITUTE_EMAIL | &quot;CLARIFY_ACADEMIC_NON_INSTITUTE_EMAIL&quot;
VERIFY_EMAIL_BEFORE_ACCOUNT_EXPIRES | &quot;VERIFY_EMAIL_BEFORE_ACCOUNT_EXPIRES&quot;
APPROVAL_MSK_IN_COMMERCIAL | &quot;APPROVAL_MSK_IN_COMMERCIAL&quot;
TRIAL_ACCOUNT_IS_ABOUT_TO_EXPIRE | &quot;TRIAL_ACCOUNT_IS_ABOUT_TO_EXPIRE&quot;
TRIAL_ACCOUNT_IS_ACTIVATED | &quot;TRIAL_ACCOUNT_IS_ACTIVATED&quot;
ACTIVATE_FREE_TRIAL | &quot;ACTIVATE_FREE_TRIAL&quot;
TOKEN_HAS_BEEN_EXPOSED | &quot;TOKEN_HAS_BEEN_EXPOSED&quot;
TOKEN_HAS_BEEN_EXPOSED_USER | &quot;TOKEN_HAS_BEEN_EXPOSED_USER&quot;
SEARCHING_RESPONSE_STRUCTURE_HAS_CHANGED | &quot;SEARCHING_RESPONSE_STRUCTURE_HAS_CHANGED&quot;
LIST_OF_UNAPPROVED_USERS | &quot;LIST_OF_UNAPPROVED_USERS&quot;
TEST | &quot;TEST&quot;
