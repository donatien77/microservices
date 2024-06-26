package com.donatien.productservice.controller;

import com.donatien.productservice.model.ProductRequest;
import com.donatien.productservice.model.ProductResponse;
import com.donatien.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by macosmonterey on 06 Apr, 2024
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest){
        Long productId = productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") Long productId){
        ProductResponse productResponse
                = productService.findProductById(productId);

        return new ResponseEntity<>(productResponse, HttpStatus.OK);

    }

    @PutMapping("/reduceQuantity/{id}")
    public ResponseEntity<Void> reduceQuantity(@PathVariable("id") Long productId, @RequestParam Long quantity){
        productService.reduceQuantity(productId, quantity);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
