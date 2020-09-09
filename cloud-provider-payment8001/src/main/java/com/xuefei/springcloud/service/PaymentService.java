package com.xuefei.springcloud.service;

import com.xuefei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: xuefei
 * @date: 2020/09/03 00:25
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}