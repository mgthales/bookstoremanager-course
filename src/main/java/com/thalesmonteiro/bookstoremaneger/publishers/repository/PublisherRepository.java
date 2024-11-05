package com.thalesmonteiro.bookstoremaneger.publishers.repository;

import com.thalesmonteiro.bookstoremaneger.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
