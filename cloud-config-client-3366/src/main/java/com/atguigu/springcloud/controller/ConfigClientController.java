package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: ConfigClientController
 * @Author SY
 * @Date: 2021/10/30 19:50
 * @Version 1.0
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${tese}")
    private String configInfo;

    @Value("${mysql.info}")
    private String mysql_info;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }
    @GetMapping("/mysql")
    public String getmysql()
    {
        return mysql_info;
    }
}
