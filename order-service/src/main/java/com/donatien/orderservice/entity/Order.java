package com.donatien.orderservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.Instant;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 09 Apr, 2024
 */
@Entity
@Table(name = "ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "ORDER_DATE")
    private Instant orderDate;
    @Column(name = "ORDER_STATUS")
    private String orderStatus;
    @Column(name = "TOTAL_AMOUNT")
    private Long amount;
}
