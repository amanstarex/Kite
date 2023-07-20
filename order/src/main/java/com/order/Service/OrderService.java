package com.order.Service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;

public interface OrderService {
	public ResponseEntity<ArrayList> getOderDetails();

}
