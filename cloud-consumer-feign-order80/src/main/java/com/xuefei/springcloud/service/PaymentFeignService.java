package com.xuefei.springcloud.service;

import com.xuefei.springcloud.entities.CommonResult;
import com.xuefei.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: xuefei
 * @date: 2020/09/15 23:20
 */
@Component
@FeignClient
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
