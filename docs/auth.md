# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [entity.proto](#entity-proto)
    - [AuthResponse](#-AuthResponse)
    - [CreateUserRequest](#-CreateUserRequest)
    - [CreateUserResponse](#-CreateUserResponse)
    - [ErrorResponse](#-ErrorResponse)
    - [ResetPasswordRequest](#-ResetPasswordRequest)
    - [ResetResponse](#-ResetResponse)
    - [ResetUsernameRequest](#-ResetUsernameRequest)
    - [TokenIssueRequest](#-TokenIssueRequest)
    - [TokenIssueRequest.AuthenticatedUserRequest](#-TokenIssueRequest-AuthenticatedUserRequest)
    - [TokenIssueResponse](#-TokenIssueResponse)
    - [TokenRevokeRequest](#-TokenRevokeRequest)
    - [TokenRevokeResponse](#-TokenRevokeResponse)
    - [UnauthenticatedUserRequest](#-UnauthenticatedUserRequest)
    - [UserValidityCheckRequest](#-UserValidityCheckRequest)
  
    - [Error](#-Error)
    - [Provider](#-Provider)
    - [Success](#-Success)
  
- [service.proto](#service-proto)
    - [Auth](#-Auth)
  
- [Scalar Value Types](#scalar-value-types)



<a name="entity-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## entity.proto



<a name="-AuthResponse"></a>

### AuthResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [Success](#Success) |  |  |
| message | [string](#string) |  |  |
| accessToken | [string](#string) | optional |  |






<a name="-CreateUserRequest"></a>

### CreateUserRequest
Request objects


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |
| password | [string](#string) |  |  |






<a name="-CreateUserResponse"></a>

### CreateUserResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [Success](#Success) |  |  |
| message | [string](#string) |  |  |
| accessToken | [string](#string) |  |  |
| refreshToken | [string](#string) |  |  |






<a name="-ErrorResponse"></a>

### ErrorResponse
Response Objects


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| error | [Error](#Error) |  |  |
| message | [string](#string) |  |  |






<a name="-ResetPasswordRequest"></a>

### ResetPasswordRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |
| password | [string](#string) |  |  |






<a name="-ResetResponse"></a>

### ResetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [Success](#Success) |  |  |
| message | [string](#string) |  |  |






<a name="-ResetUsernameRequest"></a>

### ResetUsernameRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |
| newUsername | [string](#string) |  |  |






<a name="-TokenIssueRequest"></a>

### TokenIssueRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| unauthenticated | [UnauthenticatedUserRequest](#UnauthenticatedUserRequest) |  |  |
| authenticated | [TokenIssueRequest.AuthenticatedUserRequest](#TokenIssueRequest-AuthenticatedUserRequest) |  |  |






<a name="-TokenIssueRequest-AuthenticatedUserRequest"></a>

### TokenIssueRequest.AuthenticatedUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| refreshToken | [string](#string) |  |  |






<a name="-TokenIssueResponse"></a>

### TokenIssueResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [Success](#Success) |  |  |
| message | [string](#string) |  |  |
| accessToken | [string](#string) |  |  |
| refreshToken | [string](#string) | optional |  |






<a name="-TokenRevokeRequest"></a>

### TokenRevokeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |






<a name="-TokenRevokeResponse"></a>

### TokenRevokeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [Success](#Success) |  |  |
| message | [string](#string) |  |  |






<a name="-UnauthenticatedUserRequest"></a>

### UnauthenticatedUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |
| password | [string](#string) |  |  |






<a name="-UserValidityCheckRequest"></a>

### UserValidityCheckRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| accessToken | [string](#string) |  |  |
| provider | [Provider](#Provider) | optional |  |





 


<a name="-Error"></a>

### Error
Error and success message types

| Name | Number | Description |
| ---- | ------ | ----------- |
| USER_ALREADY_EXISTS | 0 |  |
| WRONG_USERNAME_OR_PASSWORD | 1 |  |
| PASSWORD_EXPIRED | 2 |  |
| PASSWORD_IDENTICAL_TO_PREVIOUS_SET | 3 |  |
| RESET_REQUEST_BEFORE_BUFFER_TIME | 4 |  |
| ACCESS_TOKEN_EXPIRED | 5 |  |
| INVALID_ACCESS_TOKEN | 6 |  |
| REFRESH_TOKEN_EXPIRED | 7 |  |
| INVALID_REFRESH_TOKEN | 8 |  |
| INVALID_REFRESH_TOKEN_ISSUE_POLICY | 9 |  |
| TOO_MANY_LOGIN_ATTEMPTS | 10 |  |
| INTERNAL_SERVER_ERROR | 11 |  |



<a name="-Provider"></a>

### Provider


| Name | Number | Description |
| ---- | ------ | ----------- |
| GOOGLE | 0 |  |



<a name="-Success"></a>

### Success


| Name | Number | Description |
| ---- | ------ | ----------- |
| NEW_USER_CREATED | 0 |  |
| USERNAME_CHANGED_SUCCESSFULLY | 1 |  |
| PASSWORD_RESET_SUCCESSFULLY | 2 |  |
| AUTHENTICATED_USER | 3 |  |
| TOKEN_ISSUED_SUCCESSFULLY | 4 |  |
| TOKEN_REVOKED_SUCCESSFULLY | 5 |  |


 

 

 



<a name="service-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## service.proto


 

 

 


<a name="-Auth"></a>

### Auth


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| createUser | [.CreateUserRequest](#CreateUserRequest) | [.CreateUserResponse](#CreateUserResponse) |  |
| resetUsername | [.ResetUsernameRequest](#ResetUsernameRequest) | [.ResetResponse](#ResetResponse) |  |
| resetPassword | [.ResetPasswordRequest](#ResetPasswordRequest) | [.ResetResponse](#ResetResponse) |  |
| authenticateUser | [.UserValidityCheckRequest](#UserValidityCheckRequest) | [.AuthResponse](#AuthResponse) |  |
| issueToken | [.TokenIssueRequest](#TokenIssueRequest) | [.TokenIssueResponse](#TokenIssueResponse) |  |
| revokeToken | [.TokenRevokeRequest](#TokenRevokeRequest) | [.TokenRevokeResponse](#TokenRevokeResponse) |  |

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

