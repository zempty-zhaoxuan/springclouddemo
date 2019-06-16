package com.zempty.controller;

import com.zempty.entity.Dept;
import com.zempty.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zempty
 * @create 2019-06-14 12:22 PM
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/add")
    public Dept addDept(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/list")
    public List<Dept> getDepts() {
        return deptService.list();
    }

    @DeleteMapping("/delete/{id}")
    public Dept deleteDept(@PathVariable("id") long id) {
        return deptService.delete(id);
    }

    @GetMapping("/discovery")
    public String findService() {
        List<String> services = client.getServices();
        services.forEach(System.out::println);
        List<ServiceInstance> serviceInstances = client.getInstances("provider6");
        serviceInstances.forEach(o -> System.out.println(o.getHost() + " " + o.getUri() + " " + o.getPort()));
        return "success";
    }
}
