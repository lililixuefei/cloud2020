package com.xuefei.springcloud.controller;

import cn.hutool.core.lang.UUID;
import com.xuefei.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: xuefei
 * @date: 2020/09/03 00:29
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String create() {
        return "springcloud with zookeeper:" + serverPort + " \t " + UUID.randomUUID().toString();
    }
}
