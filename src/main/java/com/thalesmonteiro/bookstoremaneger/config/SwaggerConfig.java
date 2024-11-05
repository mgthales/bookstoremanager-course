// Pacote onde está localizada a configuração
package com.thalesmonteiro.bookstoremaneger.config;

// Importação das classes do Springdoc OpenAPI e do Spring
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Importação das classes do OpenAPI para configurar a documentação da API
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

// Anotação para indicar que esta é uma classe de configuração Spring
@Configuration
public class SwaggerConfig {

    // Definindo constantes para o uso na documentação da API
    private static final String BASE_PACKAGE = "com.thalesmonteiro.bookstoremanager";
    private static final String API_TITLE = "Bookstore Manager Course";
    private static final String API_DESCRIPTION = "Bookstore Manager API Professional";
    private static final String API_VERSION = "1.0.0";
    private static final String CONTACT_NAME = "Thales Monteiro Gerhardt";
    private static final String CONTACT_GITHUB = "https://github.com/mgthales";
    private static final String CONTACT_EMAIL = "thalesmg3@gmail.com";

    // Criação de um bean para configurar o GroupedOpenApi, agrupando e definindo
    // o escopo da documentação da API para todos os endpoints no pacote especificado
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("Bookstore API")           // Nome do grupo de API no Swagger UI
                .packagesToScan(BASE_PACKAGE)      // Pacote base a ser escaneado para APIs
                .pathsToMatch("/**")               // Padrão de caminho para incluir todos os endpoints
                .build();
    }

    // Criação de um bean para configurar o OpenAPI e adicionar informações adicionais sobre a API
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)           // Título da API que aparece no Swagger UI
                        .description(API_DESCRIPTION) // Descrição da API
                        .version(API_VERSION)         // Versão da API
                        .contact(new Contact()        // Informações de contato
                                .name(CONTACT_NAME)
                                .url(CONTACT_GITHUB)
                                .email(CONTACT_EMAIL))
                        .license(new License()        // Licença da API
                                .name("Apache License Version 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}
