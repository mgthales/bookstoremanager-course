package com.thalesmonteiro.bookstoremaneger.username.entity;

import com.thalesmonteiro.bookstoremaneger.books.entity.Book;
import com.thalesmonteiro.bookstoremaneger.entity.Auditable;
import com.thalesmonteiro.bookstoremaneger.username.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Username extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String age;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Gender gender;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false , unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "username", fetch = FetchType.LAZY)
    private List<Book> books;
}
