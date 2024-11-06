package com.thalesmonteiro.bookstoremaneger.author.mapper;


import com.thalesmonteiro.bookstoremaneger.author.dto.AuthorDTO;
import com.thalesmonteiro.bookstoremaneger.author.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
