package com.application.user.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationUserWs {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationUserWs.class, args);
    }

}
