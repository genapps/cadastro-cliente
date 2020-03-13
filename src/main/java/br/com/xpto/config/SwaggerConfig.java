package br.com.xpto.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.estagioremoto"))
                .paths(regex("/estagiario.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {        
        @SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo(
                "Estagios API REST",
                "API REST de cadastro de estagios.",
                "1.0",
                "Terms of Service",
                "Emerson",
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html"
        		);

        return apiInfo;
    }	
	

}
