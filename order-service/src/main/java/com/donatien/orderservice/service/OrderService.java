package com.donatien.orderservice.service;

import com.donatien.orderservice.model.OrderRequest;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 09 Apr, 2024
 */
public interface OrderService {
    Long placeOrder(OrderRequest orderRequest);
}
