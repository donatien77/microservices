package com.donatien.productservice.model;

import lombok.Data;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 Apr, 2024
 */
@Data
public class ProductRequest {
    private String name;
    private Long price;
    private Long quantity;
}
