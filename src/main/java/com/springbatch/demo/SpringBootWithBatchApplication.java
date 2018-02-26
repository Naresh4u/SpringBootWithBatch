package com.springbatch.demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBootWithBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithBatchApplication.class, args);
	}
}
