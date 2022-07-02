package com.br1anch1u.springbootmall.service;

import com.br1anch1u.springbootmall.dto.CreateOrderRequest;
import com.br1anch1u.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
