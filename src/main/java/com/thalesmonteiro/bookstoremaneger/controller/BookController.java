package com.thalesmonteiro.bookstoremaneger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Operation(summary = "Return an example hello world")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success method return"),
            @ApiResponse(responseCode = "402", description = "Erro ao carregar a pagina")
    })
    @GetMapping
    public String hello() {
        return "Hello Worldssss";
    }
}
