package com.donatien.productservice.repository;

import com.donatien.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 Apr, 2024
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
