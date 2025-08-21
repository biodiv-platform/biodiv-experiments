package com.example.api.impl;

import com.example.api.HelloApiService;
import com.example.api.NotFoundException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

public class HelloApiServiceImpl extends HelloApiService {

    @Override
    public Response getHello(SecurityContext securityContext) throws NotFoundException {
        // Simple text/plain response body
        return Response.ok("Hello from Jakarta EE!").build();
    }
}
