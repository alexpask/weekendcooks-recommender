package org.weekendcooks.recipes.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"org.weekendcooks.recipes"})
@ComponentScan(basePackages = {"org.weekendcooks.recipes"})
public class MongoTestConfig {
}
