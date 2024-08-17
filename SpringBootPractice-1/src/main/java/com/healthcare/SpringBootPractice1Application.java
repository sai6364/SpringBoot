package com.healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootPractice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPractice1Application.class, args);
	}

}
