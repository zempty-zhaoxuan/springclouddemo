package com.zempty.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zempty
 * @create 2019-06-18 6:34 PM
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new ZemptyRule();
    }
}
