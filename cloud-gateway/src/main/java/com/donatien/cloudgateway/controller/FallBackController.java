package com.donatien.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 11 May, 2024
 */
@RestController
public class FallBackController {

    @GetMapping("/orderServiceFallBack")
     public String orderServiceFallBack(){
         return "Order Service is down !";
     }

    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallBack(){
        return "Payment Service is down !";
    }

    @GetMapping("/productServiceFallBack")
    public String productServiceFallBack(){
        return "Product Service is down !";
    }
}
