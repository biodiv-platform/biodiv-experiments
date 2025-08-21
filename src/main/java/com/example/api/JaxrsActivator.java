package com.example.api;

import org.glassfish.jersey.server.ResourceConfig;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class JaxrsActivator extends ResourceConfig {
    public JaxrsActivator() {
        // Ensure packages are scanned for resources
        packages("com.example.api");
    }
}
