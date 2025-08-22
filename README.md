# biodiv-experiments
# jakartaee-openapi-server

Jakarta EE (Java 21) JAX-RS server generated from OpenAPI (JSON) using OpenAPI Generator,
with Swagger v3 (io.swagger.v3) annotations on implementation classes.

## Requirements
- Java 21
- Maven 3.8+
- Jakarta EE 10 server (WildFly 30+, Payara 6.x, Open Liberty EE10)

## Generate interfaces/models
mvn clean generate-sources

## Build WAR
mvn package

## deploy_api.sh
modify paths in this file, this will cleanup/remove deployed api and logs in tomcat server
you can update it not remove old api data

## swagger-ui
http://localhost:8080/jakartaee-openapi-server/swagger-ui
