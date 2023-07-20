package com.pp.netflixdemo.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsersNetfixApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersNetfixApplication.class, args);
	}

}
