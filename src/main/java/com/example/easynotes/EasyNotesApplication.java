package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@Configuration
@EnableAutoConfiguration
@ComponentScan({ "com.example.easynotes.controller"})
public class EasyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}
}
