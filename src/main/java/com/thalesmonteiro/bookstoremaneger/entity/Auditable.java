package com.thalesmonteiro.bookstoremaneger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

// Lombok para gerar automaticamente os métodos getter e setter
@Getter
@Setter
@MappedSuperclass // Define que esta classe é uma superclasse mapeada, usada como base para outras entidades
@EntityListeners(AuditingEntityListener.class) // Habilita auditoria, preenchendo automaticamente as datas
public abstract class Auditable {

    // Armazena a data de criação da entidade
    @CreatedDate // Indica que o campo será automaticamente preenchido com a data de criação
    @Column(nullable = false) // Define que este campo não pode ser nulo no banco de dados
    protected LocalDateTime createdDate;

    // Armazena a data da última modificação da entidade
    @LastModifiedDate // Indica que o campo será preenchido automaticamente com a data da última atualização
    @Column // Define como uma coluna no banco, permitindo valor nulo (opção padrão)
    protected LocalDateTime lastModifiedDate;

}
