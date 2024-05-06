package com.donatien.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 May, 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {

    private Long orderId;
    private Instant orderDate;
    private String orderStatus;
    private Long amount;
}
