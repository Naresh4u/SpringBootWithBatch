package com.springbatch.demo.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author nareshd
 *
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.springbatch.demo")
public class SwaggerConfig {
	
	@Bean
	public Docket restfulApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("springbatch-api").select().paths(paths()).build()
				.apiInfo(apiInfo());
	}

	private Predicate<String> paths() {
		return regex("/employee/.*");
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfo("Spring Boot With Batch Job Service", "A Batch Job sample service details ", "1.0",
				"http://nareshportfolio.weebly.com/", "Naresh Dasari", "My Page", "http://nareshportfolio.weebly.com/");

	}
}
