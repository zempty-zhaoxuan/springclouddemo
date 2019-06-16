package com.zempty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zempty
 * @create 2019-06-14 2:07 PM
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class ConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumeApplication.class);
    }
}
