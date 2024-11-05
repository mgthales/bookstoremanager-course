package com.thalesmonteiro.bookstoremaneger.books.entity;

import com.thalesmonteiro.bookstoremaneger.author.entity.Author;
import com.thalesmonteiro.bookstoremaneger.entity.Auditable;
import com.thalesmonteiro.bookstoremaneger.publishers.entity.Publisher;
import com.thalesmonteiro.bookstoremaneger.username.entity.Username;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Username username;
}
