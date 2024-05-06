package com.donatien.orderservice.controller;

import com.donatien.orderservice.model.OrderRequest;
import com.donatien.orderservice.model.OrderResponse;
import com.donatien.orderservice.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Eric Donatien
 * User macosmonterey
 * Date 09 Apr, 2024
 */
@RestController
@Log4j2
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public ResponseEntity<Long> placeOrder(@RequestBody OrderRequest orderRequest){
        Long orderId = orderService.placeOrder(orderRequest);
        log.info("Order Id: {}", orderId);
        return new ResponseEntity<>(orderId, HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderResponse> getOrderDetails(@PathVariable Long orderId){
        OrderResponse orderResponse
                = orderService.getOrderDetails(orderId);

        return new ResponseEntity<>(orderResponse, HttpStatus.OK);
    }
}
