package com.apigateway.springCloudAPIgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApIgatewayApplication.class, args);
	}

}
