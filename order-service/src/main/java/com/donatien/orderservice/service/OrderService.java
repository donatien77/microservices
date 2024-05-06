package com.donatien.orderservice.service;

import com.donatien.orderservice.model.OrderRequest;
import com.donatien.orderservice.model.OrderResponse;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 09 Apr, 2024
 */
public interface OrderService {
    Long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(Long orderId);
}
