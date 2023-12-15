# USer Api Spec

## Register User

Endpoint : POST /api/users


Request Body : 
```json
{
  "username": "anggytriputra",
  "password": "rahasiadong",
  "name": "Anggy Tri Anugrah Saputra"
}
```

Response  Body (Succes) :
```json
{
  "data": "Register Success"
}
```

Response Body (Failed) :
```json
{
  "errors": "username must is not blank, ???"
}
```
## Login User

Endpoint : POST /api/auth/login

Request Body :
```json
{
  "username": "anggytriputra",
  "password": "rahasiadong"
}
```

Response  Body (Succes) :
```json
{
  "data": {
    "token" : "TOKEN",
    "expireAt": 21862812 // miliseconds
  }
  }
```

Response Body (Failed) :
```json
{
  "errors": "username or password wrong"
}
```

## Get User

Endpoint : GET /api/users/current

Request Header : 
- X-API-TOKEN : (Mandatory)


Response  Body (Succes) :
```json
{
  "data": {
  "username": "anggytriputra",
    "name": "Angy Tri Anugrah Saputra"
  }
  }
```

Response Body (Failed, 401) :

```json
{
  "errors": "Unauthorized"
}
```



## Update User

Endpoint : PATCH /api/users/current

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body : 

```json
{
  "name" : "Anggy Tri Anugrah Saputra", // put if only went to update name
  "password" : "new password" // put if only went to update password
}
```


Response  Body (Succes) :
```json
{
  "data": {
  "username": "anggytriputra",
    "name": "Angy Tri Anugrah Saputra"
  }
}
```

Response Body (Failed, 401) :

```json
{
  "errors": "Unauthorized"
}
```


## Logout User

Endpoint : DELETE /api/auth/logout

Request Header :
- X-API-TOKEN : (Mandatory)


Response  Body (Succes) :
```json
{
  "data": "OK"
}
```
