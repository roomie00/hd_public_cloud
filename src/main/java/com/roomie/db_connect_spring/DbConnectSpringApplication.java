package com.roomie.db_connect_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DbConnectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConnectSpringApplication.class, args);
	}

}
