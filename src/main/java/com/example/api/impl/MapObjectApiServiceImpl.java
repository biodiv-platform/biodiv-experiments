package com.example.api.impl;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

import java.util.HashMap;
import java.util.Map;

import com.example.api.MapObjectApiService;

public class MapObjectApiServiceImpl extends MapObjectApiService {

    @Override
    public Response getMapObject(SecurityContext securityContext) {
        // Build a Map<String, Object>
        Map<String, Object> result = new HashMap<>();

        // Example entry: value is a string
        result.put("name", "Alice");

        // Example entry: value is a number
        result.put("age", 30);

        // Example entry: value is a nested object (another map)
        Map<String, Object> address = new HashMap<>();
        address.put("city", "Pune");
        address.put("zip", "411001");
        result.put("address", address);

        // Example entry: value is a list
        result.put("hobbies", java.util.Arrays.asList("reading", "cycling", "coding"));

        // Return as JSON
        return Response.ok(result).build();
    }
}
