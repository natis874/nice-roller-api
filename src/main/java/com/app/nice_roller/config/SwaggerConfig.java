package com.app.nice_roller.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI niceRollerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Nice Roller API")
                        .description("API de gestion de location de rollers")
                        .version("1.0")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentation complète")
                        .url("https://github.com/natis874/nice-roller-api"));
    }
}
