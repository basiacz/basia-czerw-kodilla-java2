package com.crud.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class TasksApplication {
	//dla zewnetrznego tomcata
//public class TasksApplication extends SpringBootServletInitializer {
	//dla intellij i heroku
	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	//dla zewnetrznego tomcata
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(TasksApplication.class);
//	}
}