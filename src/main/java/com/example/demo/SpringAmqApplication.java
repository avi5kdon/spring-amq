package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication(scanBasePackages = {"com.example","org.example"})
@EnableJms
public class SpringAmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAmqApplication.class, args);
	}

}
