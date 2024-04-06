package com.donatien.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 Apr, 2024
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private String productName;
    private Long price;
    private Long quantity;
    private Long productId;
}
