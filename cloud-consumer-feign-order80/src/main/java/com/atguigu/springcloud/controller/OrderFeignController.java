package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: OrderFeignController
 * @Author: SY
 * @Date: 2021/10/28 10:46
 * @Version 1.0
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService feignService;

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        return  feignService.paymentFeignTimeOut();
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

       return feignService.getPaymentById(id);

    }
}
