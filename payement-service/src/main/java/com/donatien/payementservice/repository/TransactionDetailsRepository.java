package com.donatien.payementservice.repository;

import com.donatien.payementservice.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 03 May, 2024
 */
@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long> {

    TransactionDetails findByOrderId(Long orderId);
}
