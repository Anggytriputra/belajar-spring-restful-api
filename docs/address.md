# Address API Spec

## Create Address

Endpoint : POST /api/contacts/{idcontact}/address

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body :

```json
{
  "street" : "Jalan",
  "city" : "kota",
  "privince" : "provinsi",
  "country" : "negara",
  "psotalCode" : "12132"
}
```

Response Body (Success) :
```json
{
  "data" : {
    "id" : "randomstring",
    "street" : "Jalan",
    "city" : "kota",
    "privince" : "provinsi",
    "country" : "negara",
    "psotalCode" : "12132"
  }
}
```

Response Body (Failde) :
```json
{
  "error" : "Contact is not found"
}
```


## Update Address


Endpoint : PUT /api/contacts/{idContact}/address/{idAddress}

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body :

```json
{
  "street" : "Jalan",
  "city" : "kota",
  "privince" : "provinsi",
  "country" : "negara",
  "psotalCode" : "12132"
}
```

Response Body (Success) :
```json
{
  "data" : {
    "id" : "randomstring",
    "street" : "Jalan",
    "city" : "kota",
    "privince" : "provinsi",
    "country" : "negara",
    "psotalCode" : "12132"
  }
}
```

Response Body (Failde) :
```json
{
  "error" : "Address is not found"
}
```



## Get Address

Endpoint : GET /api/contacts/{idContact}/address/{idAddress}

Request Header :
- X-API-TOKEN : (Mandatory)



Response Body (Success) :
```json
{
  "data" : {
    "id" : "randomstring",
    "street" : "Jalan",
    "city" : "kota",
    "privince" : "provinsi",
    "country" : "negara",
    "psotalCode" : "12132"
  }
}
```

Response Body (Failde) :
```json
{
  "error" : "adderss is not found"
}
```



## Remove Address

Endpoint : DELETE /api/contacts/{idContact}/address/{idAddress}

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body :

Response Body (Success) :
```json
{
  "data" : "OKE"
}
```

Response Body (Failde) :
```json
{
  "error" : "adderss is not found"
}
```



## List Address


Endpoint : GET /api/contacts/{idContact}/address

Request Header :
- X-API-TOKEN : (Mandatory)

Request Body :

Response Body (Success) :
```json
{
  "data" : [
    {
      "id" : "randomstring",
      "street" : "Jalan",
      "city" : "kota",
      "privince" : "provinsi",
      "country" : "negara",
      "psotalCode" : "12132"
    }
  ]
}
```

Response Body (Failde) :
```json
{
  "error" : "address is not found"
}
```

