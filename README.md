Sample ofREST application

REST application that provides REST API.

Run CustomerService locally

Databse configuration

1. Create database customerdemo
spring.datasource.password=123
spring.datasource.username=user
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database=postgresql
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect


2. git clone https://github.com/WoldemarK/rest_api_data.git
3. cd customerdemo
4. mvn spring-boot:run

5. Access CustomerService using next REST requests:

GET: localhost:8081/api/v1/customer - get all customers
GET: localhost:8081/api/v1/customer/1 - get customer with ID 1

POST: localhost:9966/api/v1/customer/
Request body:
{
	"firstName": "Test",
	"lastName": "Testing",
	"address": "Test address",
	"budget": "100500"
}

PUT: localhost:9966/api/v1/customers/
Request body:
{
    "id": 2,
	"firstName": "Tset",
	"lastName": "Testing",
	"address": "Test address",
	"budget": "200800"
}


DELETE: localhost:8081/api/v1/customers/2 - delete customer with ID 2