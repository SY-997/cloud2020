package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: PaymentMain8004
 * @Author SY
 * @Date: 2021/10/24 16:42
 * @Version 1.0
 * @Description: 主启动
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
