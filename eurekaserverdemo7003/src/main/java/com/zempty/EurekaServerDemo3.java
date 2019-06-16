package com.zempty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerDemo3 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerDemo3.class);
    }
}
