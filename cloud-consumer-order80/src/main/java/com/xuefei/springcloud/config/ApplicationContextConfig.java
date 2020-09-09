package com.xuefei.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: xuefei
 * @date: 2020/09/07 23:29
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced       // 使用@LoadBalance注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
