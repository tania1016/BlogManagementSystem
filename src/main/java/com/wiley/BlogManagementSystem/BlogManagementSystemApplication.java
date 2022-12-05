package com.wiley.BlogManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication


public class BlogManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(BlogManagementSystemApplication.class, args);
	}

}
