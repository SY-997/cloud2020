package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @title: CommonResult
 * @Author SY
 * @Date: 2021/10/22 21:54
 * @Version 1.0
 * @Description: 封装实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>
{
    private Integer code;
    private String  message;
    private T data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
