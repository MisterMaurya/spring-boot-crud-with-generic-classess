package org.crud.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.crud")
public class CrudWithGenericApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudWithGenericApplication.class, args);
	}

}
