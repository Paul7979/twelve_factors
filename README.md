# Twelve Factors

## How to Start

Starting this microservice and the required postgres database is as simple as running
```console
'docker compose up -d'
```
in the root directory of the project.
## Provided Service
The sample spring boot microservice provides storing and retrieving student objects via HTTP endpoints in a json format.

## Example
To get all Students run
```console
curl --request GET --url http://localhost:8080/students
```

To store a student run
```console
curl --request POST \
  --url http://localhost:8080/student \
  --header 'Content-Type: application/json' \
  --data '{
	"firstName": "Paul",
	"lastName": "Kaufmann",
	"email": "paul.kaufmann@mail.com"
}'
```

To retrieve a student by id run
```console
curl --request GET --url http://localhost:8080/student/3
```

