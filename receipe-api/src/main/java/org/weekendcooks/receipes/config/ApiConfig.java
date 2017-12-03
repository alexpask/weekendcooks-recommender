package org.weekendcooks.receipes.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@EnableAutoConfiguration
@ComponentScan(basePackages = {"org.weekendcooks.recipes.*"})
@EnableTransactionManagement
@EnableMongoRepositories(basePackages = {"org.weekendcooks.recipes.repositories"})
public class ApiConfig {
}
