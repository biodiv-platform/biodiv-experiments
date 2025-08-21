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

## Run (WildFly example)
- Start: bin/standalone.sh
- Deploy: copy target/jakartaee-openapi-server.war to standalone/deployments/
- Test:
  - GET  http://localhost:8080/jakartaee-openapi-server/hello
  - POST http://localhost:8080/jakartaee-openapi-server/greet  (JSON: {"name":"Alice"})

Notes:
- Swagger v3 annotations are on impl classes:
  - com.example.impl.HelloApiImpl
  - com.example.impl.GreetApiImpl
- Dependency io.swagger.core.v3:swagger-annotations-jakarta is added (provided).
- If you use a runtime that can serve Swagger UI, add it separately (server-specific).
