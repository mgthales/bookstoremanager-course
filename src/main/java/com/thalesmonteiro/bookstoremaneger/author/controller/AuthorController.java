package com.thalesmonteiro.bookstoremaneger.author.controller;

import com.thalesmonteiro.bookstoremaneger.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController implements AuthorControllerDocs {

    private AuthorService authorService;

    @Autowired

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
}
