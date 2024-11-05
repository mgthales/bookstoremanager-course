package com.thalesmonteiro.bookstoremaneger.controller;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.thalesmonteiro.bookstoremanager";
    private static final String API_TITLE = "Bookstore Manager Course";
    private static final String API_DESCRIPTION = "Bookstore Manager API  Professional";
    private static final String API_VERSION = "1.0.0";
    private static final String CONTACT_NAME = "Thales Monteiro Gerhardt";
    private static final String CONTACT_GITHUB = "https://github.com/mgthales";
    private static final String CONTACT_EMAIL = "thalesmg3@gmail.com";

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("Bookstore API")
                .packagesToScan(BASE_PACKAGE)
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public Info apiInfo() {
        return new Info()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version(API_VERSION)
                .contact(new Contact()
                        .name(CONTACT_NAME)
                        .url(CONTACT_GITHUB)
                        .email(CONTACT_EMAIL))
                .license(new License()
                        .name("Apache License Version 2.0")
                        .url("https://www.apache.org/licenses/LICENSE-2.0"));
    }
}