package com.xuefei.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description:
 * @author: xuefei
 * @date: 2020/09/13 11:47
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("server.port")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentConsul() {
        return "spring with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
