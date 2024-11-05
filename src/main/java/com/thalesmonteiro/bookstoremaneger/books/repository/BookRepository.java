package com.thalesmonteiro.bookstoremaneger.books.repository;

import com.thalesmonteiro.bookstoremaneger.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
