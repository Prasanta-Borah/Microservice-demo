package com.user.demo.user_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMicroservicesApplication.class, args);
	}

}
