package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author NANDITHA Entry point to the Spring boot Application
 */

// Packages that SpringBoot has to search for Components
@ComponentScan({ "com.controller", "com.service" })
@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ExampleApplication.class, args);

		// get all beans configured by Spring Boot are returned
		String[] beans = ctx.getBeanDefinitionNames();

		Arrays.sort(beans);

		for (String bean : beans) {
			System.out.println(bean);
		}

	}
}
