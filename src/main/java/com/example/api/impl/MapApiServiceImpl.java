package com.example.api.impl;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

import java.util.HashMap;
import java.util.Map;

import com.example.api.MapApiService;

public class MapApiServiceImpl extends MapApiService {

    @Override
    public Response getMap(SecurityContext securityContext) {
        // Sample map object
        Map<String, String> result = new HashMap<>();
        result.put("key1", "value1");
        result.put("key2", "value2");
        result.put("hello", "world");

        // Return as JSON
        return Response.ok(result).build();
    }
}
