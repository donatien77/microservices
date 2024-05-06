package com.donatien.orderservice.external.client;

import com.donatien.orderservice.external.request.PaymentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 05 May, 2024
 */
@FeignClient(name = "PAYMENT-SERVICE/payment")
public interface PaymentService {

    @PostMapping("/doPayment")
    public ResponseEntity<Long> doPayment (@RequestBody PaymentRequest paymentRequest);
}
