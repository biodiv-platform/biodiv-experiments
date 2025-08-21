package com.example.api.impl;

import com.example.api.GreetApiService;
import com.example.api.NotFoundException;
import com.example.model.GreetRequest;
import com.example.model.GreetResponse;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

public class GreetApiServiceImpl extends GreetApiService {

    @Override
    public Response greetPost(GreetRequest greetRequest, SecurityContext securityContext) throws NotFoundException {
        // Basic null safety; generator already marks greetRequest as @NotNull, but guard anyway
        String name = (greetRequest != null && greetRequest.getName() != null)
                ? greetRequest.getName()
                : "World";

        GreetResponse payload = new GreetResponse();
        payload.setMessage("Hello, " + name + "!");

        return Response.ok(payload).build();
    }
}
