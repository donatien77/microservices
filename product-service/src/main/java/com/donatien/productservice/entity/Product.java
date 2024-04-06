package com.donatien.productservice.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 Apr, 2024
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRICE")
    private long price;
    @Column(name = "QUANTITY")
    private long quantity;
}
