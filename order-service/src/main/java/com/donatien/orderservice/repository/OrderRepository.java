package com.donatien.orderservice.repository;

import com.donatien.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 09 Apr, 2024
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
