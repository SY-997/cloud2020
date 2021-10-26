package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: OrderZK80
 * @Author SY
 * @Date: 2021/10/24 16:49
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
public class OrderZK80 {
    public static void main(String[] args)
    {
        SpringApplication.run(OrderZK80.class,args);
    }
}
