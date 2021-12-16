package com.escolacrud.escolacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.escolacrud.escolacrud"})
@EnableJpaRepositories("com.escolacrud.repository")
@EnableAutoConfiguration
@EntityScan("com.escolacrud.escolacrud.models")
public class EscolacrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolacrudApplication.class, args);
	}

}
