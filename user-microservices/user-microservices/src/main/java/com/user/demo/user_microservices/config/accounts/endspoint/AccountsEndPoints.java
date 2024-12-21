package com.user.demo.user_microservices.config.accounts.endspoint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="http://localhost:8082/", name="AccountsFeign")
public interface AccountsEndPoints {

    @GetMapping("/wish")
    public String getAccountNumber();

}
