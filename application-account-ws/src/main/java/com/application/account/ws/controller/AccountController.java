package com.application.account.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/accounts")
public class AccountController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;


    @Autowired
    private Environment environment;

    @GetMapping("/status/check")
    public String status(){
        return "Application: " +applicationName +" with instance id: " +instanceId+ " is running on port: " +environment.getProperty("local.server.port");
    }
}
