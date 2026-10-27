package com.example.csit321g3.masbate_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages= "com.example.csit321g3")
@EnableJpaRepositories(basePackages = "com.example.csit321g3.repository")
@EntityScan(basePackages = "com.example.csit321g3.entity")
@SpringBootApplication
public class MasbateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasbateCrudApplication.class, args);
	}

}