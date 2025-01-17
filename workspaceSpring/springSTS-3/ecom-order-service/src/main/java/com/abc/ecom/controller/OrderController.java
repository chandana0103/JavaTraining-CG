package com.abc.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ecom.entity.OrderEntity;
import com.abc.ecom.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/create")
	public ResponseEntity<OrderEntity> placeOrder(@RequestBody OrderEntity order) {
			
		OrderEntity newOrder = orderService.saveOrder(order);
		
		return new ResponseEntity<>(newOrder,HttpStatus.CREATED);
		
		}
}

