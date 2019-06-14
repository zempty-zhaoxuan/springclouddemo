package com.zempty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zempty
 * @create 2019-06-14 3:12 PM
 **/
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class);
    }
}
