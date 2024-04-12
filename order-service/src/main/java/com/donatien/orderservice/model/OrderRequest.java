package com.donatien.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 10 Apr, 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private Long productId;
    private Long totalAmount;
    private Long quantity;
    private PaymentMode paymentMode;
}
