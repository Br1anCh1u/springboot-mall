package com.br1anch1u.springbootmall.service;

import com.br1anch1u.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
