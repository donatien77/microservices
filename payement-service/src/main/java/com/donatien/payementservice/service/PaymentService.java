package com.donatien.payementservice.service;

import com.donatien.payementservice.model.PaymentRequest;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 03 May, 2024
 */
public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);
}
