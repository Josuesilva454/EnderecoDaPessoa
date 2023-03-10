package com.gerenciador.pessoa.config;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gerenciador.pessoa"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo() {

        Contact contact = new Contact("Lojavirtual- GiModas", "https://github.com/Josuesilva454/Loja-virtual/tree/main/Backend", "josuerosasilva49@gmail.com");

        return new ApiInfoBuilder()
                .title("Endereço de pessoa")
                .description("Documentation Endereço de api")
                .version("1.0.0")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .contact(contact)
                .build();
    }
}