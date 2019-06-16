package com.zempty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zempty
 * @create 2019-06-14 12:08 PM
 **/
@SpringBootApplication
@EnableEurekaClient
public class Provider8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class);
    }
}
