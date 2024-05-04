package com.donatien.payementservice.service.impl;

import com.donatien.payementservice.entity.TransactionDetails;
import com.donatien.payementservice.model.PaymentRequest;
import com.donatien.payementservice.repository.TransactionDetailsRepository;
import com.donatien.payementservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 03 May, 2024
 */
@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private TransactionDetailsRepository transactionDetailsRepository;

    @Override
    public Long doPayment(PaymentRequest paymentRequest) {
        log.info("Recording Payment Details: {}", paymentRequest);

        TransactionDetails transactionDetails
                =TransactionDetails.builder()
                .paymentDate(Instant.now())
                .paymentMode(paymentRequest.getPaymentMode().name())
                .paymentStatus("SUCCESS")
                .orderId(paymentRequest.getOrderId())
                .referenceNumber(paymentRequest.getReferenceNumber())
                .amount(paymentRequest.getAmount())
                .build();

        transactionDetailsRepository.save(transactionDetails);

        log.info("Transaction Completed with ID: {}", transactionDetails.getId());

        return transactionDetails.getId();
    }
}
