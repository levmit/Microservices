package com.application.user.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;


    @Autowired
    private Environment environment;

    @RequestMapping(path = "/status/check")
    public String status(){
        return "Application: " +applicationName +" with instance id: " +instanceId+ " is running on port: " +environment.getProperty("local.server.port");
    }

}
