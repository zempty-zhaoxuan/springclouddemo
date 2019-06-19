package com.zempty;

import com.zempty.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
//使用 fegin 进行面向接口的编程，同时处理负责具横
@RibbonClient(name="PROVIDER6",configuration = {MySelfRule.class})
//可以搭配 ribbon 一起使用
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class);
    }
}
