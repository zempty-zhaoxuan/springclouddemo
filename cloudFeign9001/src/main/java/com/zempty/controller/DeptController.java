package com.zempty.controller;

import com.zempty.FeignInterface;
import com.zempty.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    private FeignInterface feignInterface;

    @Autowired
    public DeptController(FeignInterface feignInterface) {
        this.feignInterface = feignInterface;
    }

    @GetMapping("/getAll")
    public List<Dept> getDepts() {
        return feignInterface.getDepts();
    }
}
