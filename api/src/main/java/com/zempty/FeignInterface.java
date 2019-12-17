package com.zempty;

import com.zempty.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//这里对 fegin 进行了处理，表明了 fallbackFactory
@FeignClient(value="PROVIDER6",fallbackFactory = FallBackDemo.class)
public interface FeignInterface {

    @GetMapping("/list")
    public List<Dept> getDepts();
}
