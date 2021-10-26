package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @title: Payment
 * @Author SY
 * @Date: 2021/10/22 21:48
 * @Version 1.0
 * @Description: 支付
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 6007383464404201565L;
    private Long id;
    private String serial;

}
