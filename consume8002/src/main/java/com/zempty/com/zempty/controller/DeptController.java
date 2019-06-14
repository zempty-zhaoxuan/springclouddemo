package com.zempty.com.zempty.controller;

import com.zempty.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author zempty
 * @create 2019-06-14 2:08 PM
 **/
@RestController
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${provider.url}")
    private String URL;

    @PostMapping("/add")
    public Dept add(Dept dept) {
        return restTemplate.postForObject(URL + "/add", dept, Dept.class);
    }

    @GetMapping("/list")
    public List<Dept> getDepts() {
        return restTemplate.getForObject(URL + "/list", List.class);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        restTemplate.delete(URL+"/delete/"+id);
    }

}
