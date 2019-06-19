package com.zempty;

import com.zempty.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FallBackDemo implements FallbackFactory<FeignInterface> {

    @Override
    public FeignInterface create(Throwable throwable) {
        return new FeignInterface() {
            @Override
            public List<Dept> getDepts() {
                Dept dept = new Dept();
                dept.setDb_name("2 号数据库，出现了异常！");
                dept.setName("请检查一下出现了什么情况");
                return Arrays.asList(dept);
            }
        };
    }
}
