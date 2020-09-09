package com.xuefei.springcloud.dao;

import com.xuefei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description: 接口
 * @author: xuefei
 * @date: 2020/09/03 00:20
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
