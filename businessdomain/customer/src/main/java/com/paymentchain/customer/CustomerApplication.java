package com.paymentchain.customer;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableSwagger2
@EnableEurekaClient
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }


    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
        .group("springshop-public")
          .packagesToScan("com.paymentchain")
          .build();
    }

//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("com.paymentchain")).build();
//    }
      
}
