package com.example.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.InputStream;

@Path("/openapi.json")
public class OpenApiResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public InputStream getOpenApiJson() {
        // Serve the static OpenAPI file bundled in resources
        return Thread.currentThread()
                     .getContextClassLoader()
                     .getResourceAsStream("openapi.json");
    }
}
