package com.donatien.orderservice.exception;

import lombok.Data;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 27 Apr, 2024
 */
@Data
public class CustomException extends RuntimeException{

    private String errorCode;
    private int status;

    public CustomException(String message, String errorCode, int status) {
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }
}
