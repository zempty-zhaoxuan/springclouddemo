package com.zempty.service;

import com.zempty.entity.Dept;
import com.zempty.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zempty
 * @create 2019-06-14 12:14 PM
 **/
@Service
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    public Dept add(Dept dept) {
        return deptRepository.save(dept);
    }

    public Dept delete(long id) {
        Optional<Dept> optional = deptRepository.findById(id);
        Dept dept = optional.get();
        deptRepository.delete(dept);
        return dept;
    }

    public List<Dept> list() {
        return deptRepository.findAll();
    }

}
