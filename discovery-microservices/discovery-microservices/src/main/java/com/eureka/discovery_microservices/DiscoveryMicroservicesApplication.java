package com.eureka.discovery_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMicroservicesApplication.class, args);
	}

}
