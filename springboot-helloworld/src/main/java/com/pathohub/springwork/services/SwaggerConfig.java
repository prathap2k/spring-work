package com.pathohub.springwork.services;

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
public class SwaggerConfig 
{
	@Bean
	public Docket api() { 
		return new Docket(DocumentationType.SWAGGER_2)          
	     .select()
	     .apis(RequestHandlerSelectors.basePackage("com.pathohub.springwork.services.controller"))
	     .paths(PathSelectors.ant("/hello-world/*"))
	     .build()
	     .apiInfo(apiInfo());
	}

private ApiInfo apiInfo() {
   @SuppressWarnings("deprecation")
ApiInfo apiInfo = new ApiInfo(
     "My REST API",
     "Some custom description of API.",
     "API TOS",
     "Terms of service",
     "prathap2k@gmail.com",
     "License of API",
     "API license URL");
   return apiInfo;
}
}
