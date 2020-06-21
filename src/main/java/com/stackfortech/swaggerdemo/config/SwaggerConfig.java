package com.stackfortech.swaggerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
       return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.stackfortech.swaggerdemo.controller"))
               .build()
               .apiInfo(metaData());
    }

    public ApiInfo metaData(){
        ApiInfo apiInfo = new ApiInfo(
                "Stackfortech Application",
                "Demo application for swagger",
                "1.0",
                "Terms Of Service",
                new Contact("Stackfortech","https://www.youtube.com/channel/UC3i33lUKCiABi3cXJj3052g","stackfortech@abc.com"),
                "Null",
                "Null",
                new ArrayList<VendorExtension>());
        return apiInfo;
    }
}
