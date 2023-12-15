# Contact API Spec

## Create Contact

Endpoint : POST /api/contacts

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body :

```json
{
  "firstName" : "Anggy",
  "lastName" : "Triputra",
  "email" : "anggytriasaputra@gmail.com",
  "phone" : "087771134426"
}
```

Response Body (Succes) :

```json
{
  "data":{
    "id" : "random-string",
    "firstName" : "Anggy",
    "lastName" : "Triputra",
    "email" : "anggytriasaputra@gmail.com",
    "phone" : "087771134426"
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Email format, phone format invalid, ..."
}
```

## Update contact

Endpoint : PUT /api/cpntacts/idcontacts

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body :


```json
{
  "firstName" : "Anggy",
  "lastName" : "Triputra",
  "email" : "anggytriasaputra@gmail.com",
  "phone" : "087771134426"
}
```

Response Body (Succes) :


```json
{
  "data":{
    "id" : "random-string",
    "firstName" : "Anggy",
    "lastName" : "Triputra",
    "email" : "anggytriasaputra@gmail.com",
    "phone" : "087771134426"
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Email format, phone format invalid, ..."
}
```

## Get Contact

Endpoint : GET /api/contacts/idcontacts

Request Header :
- X-API-TOKEN : (Mandatory)


Response Body (Succes) :
```json
{
  "data":{
    "id" : "random-string",
    "firstName" : "Anggy",
    "lastName" : "Triputra",
    "email" : "anggytriasaputra@gmail.com",
    "phone" : "087771134426"
  }
}
```


Response Body (Failed, 404) :

```json
{
  "error" : "Contact is not found"
}
```


## Search Contact
Endpoint : GET /api/contacts

Query Param :

- name : String, contact first name or last name , using like query
- phone : String, contact phone, using like query, optional
- email : String, contact email, using like query, optional
- page: : integer, start from 0, default 0
- size : Integer, default 10

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body :

Response Body (Succes) :

```json
{
  "data": [
    "id" : "random-string",
    "firstName" : "Anggy",
    "lastName" : "Triputra",
    "email" : "anggytriasaputra@gmail.com",
    "phone" : "087771134426"
  ],
  "paging" : {
    "currentPage" : 0,
    "totalPage" : 10,
    "size" : 10
  }
}
```

Response Body (Failed) :

```json
{
  "error" : "Unauthorized"
}
```

## Remove Contact

Endpoint : DELETE /api/contacts/idcontacts

Request Header :
- X-API-TOKEN : (Mandatory)



Response Body (Succes) :

```json
{
  "data" : "OK"
}
```

Response Body (Failed) :

```json
{
  "error" : "Contact is not found"
}
```