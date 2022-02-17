package com.apipothi.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication

 //@Configuration
@ComponentScan
@EnableAutoConfiguration

public class DemoApplication {

	public static void main(String[] args) {
		
		System.out.println("***-Before RUN-***");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("***-After RUN-***");
		System.out.println("***-HELLO API POTHI-***");
	}

}
