package com.donatien.productservice.service.impl;

import com.donatien.productservice.entity.Product;
import com.donatien.productservice.exception.ProductServiceCustomException;
import com.donatien.productservice.model.ProductRequest;
import com.donatien.productservice.model.ProductResponse;
import com.donatien.productservice.repository.ProductRepository;
import com.donatien.productservice.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.beans.BeanUtils.*;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 Apr, 2024
 */
@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Long addProduct(ProductRequest productRequest) {
        log.info("Adding Product...");

        Product product
                = Product.builder()
                .productName(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product Created");

        return product.getProductId();
    }

    @Override
    public ProductResponse findProductById(Long productId) {
        log.info("Get the product for productId: {}", productId);

        Product product
                = productRepository.findById(productId)
                .orElseThrow(
                        () -> new ProductServiceCustomException("Product with given id not found",  "PRODUCT_NOT_FOUND"));
        ProductResponse productResponse
                = new ProductResponse();
        copyProperties(product, productResponse);

        return productResponse;
    }
}
