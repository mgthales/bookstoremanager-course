package com.thalesmonteiro.bookstoremaneger.username.repository;

import com.thalesmonteiro.bookstoremaneger.username.entity.Username;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsernameRepository extends JpaRepository<Username, Long> {
}
