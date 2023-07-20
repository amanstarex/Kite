package com.order.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ResponseEntity<ArrayList> getOderDetails() {
		System.out.println("Aman=============");
		return restTemplate.getForEntity("http://localhost:8081/getTrade", ArrayList.class);
	}

	
	
}
