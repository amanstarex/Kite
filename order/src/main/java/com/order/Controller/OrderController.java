package com.order.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.Service.OrderServiceImpl;

@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceImpl impl;

	@GetMapping("/order")
	public ResponseEntity<ArrayList> getOrderDetails() {
		return impl.getOderDetails();
	}
}
