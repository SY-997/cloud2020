package com.atguigu.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title: MySelfRule
 * @Author SY
 * @Date: 2021/10/26 19:27
 * @Version 1.0
 * @Description:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        //定义为随机
        return new RandomRule();
    }
}
