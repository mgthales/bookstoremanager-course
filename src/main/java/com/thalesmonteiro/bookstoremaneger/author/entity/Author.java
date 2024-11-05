package com.thalesmonteiro.bookstoremaneger.author.entity;

import com.thalesmonteiro.bookstoremaneger.books.entity.Book;
import com.thalesmonteiro.bookstoremaneger.entity.Auditable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Author extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0" )
    private  int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> Books;
}
