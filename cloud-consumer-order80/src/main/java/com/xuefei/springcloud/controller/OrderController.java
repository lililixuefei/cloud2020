package com.xuefei.springcloud.controller;

import com.xuefei.springcloud.entities.CommonResult;
import com.xuefei.springcloud.entities.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: xuefei
 * @date: 2020/09/07 23:27
 */
@RestController
public class OrderController {

//    private static final String PAYMENT_URL = "http://localhost:8001";

    private static final String PAYMENT_SRV = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> createPayment(Payment payment) {
        return restTemplate.postForObject(PAYMENT_SRV + "payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id) {
        return restTemplate.getForObject(PAYMENT_SRV + "payment/get/" + id, CommonResult.class);
    }
}
