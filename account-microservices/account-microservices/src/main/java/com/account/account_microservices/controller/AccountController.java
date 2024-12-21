package com.account.account_microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private Environment env;

    @GetMapping("/account")
    public String getAccount(){
        return "This is your account "+env.getProperty("local.server.port");
    }

    @GetMapping("/wish")
    public String getAccountNumber(){
        return "Your account services running on the port "+env.getProperty("local.server.port");
    }
}
