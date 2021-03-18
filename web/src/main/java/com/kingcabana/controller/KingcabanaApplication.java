package com.kingcabana.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.kingcabana.*"})
@ComponentScan(basePackages = {"com.kingcabana.*"})
@EntityScan(basePackages = {"com.kingcabana.*"})
@EnableJpaRepositories(basePackages = {"com.kingcabana.*"})
public class KingcabanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KingcabanaApplication.class);
	}

}
