package com.example.api.impl;

import java.util.List;

import com.example.api.MatrixApiService;
import com.example.api.NotFoundException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

public class MatrixApiServiceImpl extends MatrixApiService {

    @Override
    public Response getMatrix(SecurityContext securityContext) throws NotFoundException {
        List<List<Long>> matrix = List.of(
            List.of(1L, 2L, 3L),
            List.of(4L, 5L, 6L)
        );
        return Response.ok(matrix).build();
    }
}
