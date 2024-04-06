package com.donatien.productservice.service;

import com.donatien.productservice.model.ProductRequest;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 Apr, 2024
 */
public interface ProductService {
    Long addProduct(ProductRequest productRequest);
}
