package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description: PaymentFallbackService
 * @Author: SY
 * @Date: 2021/10/29 14:37
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用成功，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
