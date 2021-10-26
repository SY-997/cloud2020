package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title: MainApp80
 * @Author SY
 * @Date: 2021/10/23 15:33
 * @Version 1.0
 * @Description: 主启动
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApp80 {
    public static void main(String[] args)
    {
        SpringApplication.run(MainApp80.class,args);
    }
}
