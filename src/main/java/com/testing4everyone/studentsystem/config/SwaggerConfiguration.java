package com.testing4everyone.studentsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    private ApiInfo apiInfo() {
        return new ApiInfo("Student Service API Document", "List out all API documents for Student Svc.", "1.1", "Terms of service",
                new Contact("General UserName", "https://doaitran-testing4everyone.blogspot.com/", "josdoaitran@gmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.testing4everyone.studentsystem.controller"))
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(regex("/student/.*"))
                .build();
    }

}