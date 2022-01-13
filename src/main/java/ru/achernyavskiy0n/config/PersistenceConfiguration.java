package ru.achernyavskiy0n.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"ru.achernyavskiy0n.model"})
@EnableJpaRepositories(basePackages = "ru.achernyavskiy0n.repository")
public class PersistenceConfiguration {
}
