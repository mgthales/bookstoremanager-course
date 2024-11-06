package com.thalesmonteiro.bookstoremaneger.author.builder;

import com.thalesmonteiro.bookstoremaneger.author.dto.AuthorDTO;
import lombok.Builder;

@Builder
public class AuthorDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Thales Monteiro";

    @Builder.Default
    private final int age = 18;

    public AuthorDTO buildAuthorDTO() {
        return new AuthorDTO(id, name, age);
    }
}
