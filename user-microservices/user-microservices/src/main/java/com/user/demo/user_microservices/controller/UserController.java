package com.user.demo.user_microservices.controller;

import com.user.demo.user_microservices.config.accounts.endspoint.AccountsEndPoints;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    private static final String USER_SERVICE = "user-microservices";
    @Autowired
    private Environment env;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    AccountsEndPoints accountsEndPoints;

    @GetMapping("/user")
    public String getUser(){
        return "This is user controller running on port "+env.getProperty("local.server.port");
    }
    @GetMapping("/callAccount")
    @CircuitBreaker(name=USER_SERVICE, fallbackMethod = "fallbackResponse")
    public String userAccount(){
        String url = "http://localhost:8082/wish";
        return restTemplate.getForObject(url,String.class);
    }
    public String fallbackResponse(Exception ex) {
        return "Fallback response: " + ex.getMessage();
    }

    @GetMapping("/wishUser")
    public String userAccountByFeign(){
        return accountsEndPoints.getAccountNumber();
    }
}
