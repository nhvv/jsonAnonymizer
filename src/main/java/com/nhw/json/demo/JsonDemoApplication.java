package com.nhw.json.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
@Configuration
public class JsonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDemoApplication.class, args);
	}

}
