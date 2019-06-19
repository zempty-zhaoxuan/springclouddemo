package com.zempty.repository;

import com.zempty.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author zempty
 * @create 2019-06-14 12:10 PM
 **/
public interface DeptRepository extends JpaRepository<Dept,Long>, JpaSpecificationExecutor {

}
