package com.thalesmonteiro.bookstoremaneger.author.repository;

import com.thalesmonteiro.bookstoremaneger.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
