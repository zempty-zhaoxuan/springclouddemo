package com.zempty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author zempty
 * @create 2019-06-14 2:07 PM
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumeApplication.class);
    }
}
