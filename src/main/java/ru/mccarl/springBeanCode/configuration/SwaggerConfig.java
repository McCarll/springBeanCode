package ru.mccarl.springBeanCode.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Created by vrudometkin on 24/11/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private Environment environment;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("ru.mccarl.springBeanCode.web"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .pathMapping(environment.getProperty("SERVICE_NAME"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Just simple service",
                null,
                "1.0.0",
                null,
//                new Contact("Игорь Щемелев", null, "ischemelev@alfabank.ru"),
                null, null, null);
    }

}
