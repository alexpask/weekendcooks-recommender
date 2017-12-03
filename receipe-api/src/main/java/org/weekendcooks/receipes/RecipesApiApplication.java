package org.weekendcooks.receipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.weekendcooks.receipes.config.ApiConfig;

@SpringBootApplication
@Configuration
@Import({ApiConfig.class})
public class RecipesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipesApiApplication.class, args);
	}
}
