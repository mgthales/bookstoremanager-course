package com.thalesmonteiro.bookstoremaneger.author.service;

import com.thalesmonteiro.bookstoremaneger.author.mapper.AuthorMapper;
import com.thalesmonteiro.bookstoremaneger.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final static AuthorMapper authormapper = AuthorMapper.INSTANCE;

    private AuthorRepository authorRepository;


    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
