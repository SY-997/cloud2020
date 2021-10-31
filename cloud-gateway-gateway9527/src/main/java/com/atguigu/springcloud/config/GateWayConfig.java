package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title: GateWayConfig
 * @Author SY
 * @Date: 2021/10/30 15:27
 * @Version 1.0
 * @Description:
 */
@Configuration
public class GateWayConfig {

    //@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("t1",r ->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return  routes.build();
    }
}
