package com.donatien.productservice.exception;

import lombok.Data;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 06 Apr, 2024
 */
@Data
public class ProductServiceCustomException extends RuntimeException{
    private String errorCode;

    public ProductServiceCustomException(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
