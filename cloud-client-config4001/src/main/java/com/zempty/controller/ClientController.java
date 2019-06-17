package com.zempty.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zempty
 * @create 2019-06-17 5:20 PM
 **/
@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @GetMapping("/info")
    public void getInfo() {
        System.out.println("port :--------->"+this.port);
        System.out.println("applicationName :-------------->"+this.applicationName);
        System.out.println("eurekaServer :---------------------"+this.eurekaServer);
    }

}
