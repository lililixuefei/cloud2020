package com.xuefei.springcloud.service.impl;

import com.xuefei.springcloud.dao.PaymentDao;
import com.xuefei.springcloud.entities.Payment;
import com.xuefei.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: xuefei
 * @date: 2020/09/03 00:26
 */
@Service
public class PaymentServiceIpml implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
