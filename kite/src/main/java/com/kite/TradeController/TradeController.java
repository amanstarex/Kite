package com.kite.TradeController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kite.Entity.Trade;
import com.kite.Service.TradeServiceImpl;

@RestController
public class TradeController {
	
	@Autowired
	TradeServiceImpl impl;
	
	@PutMapping("/createTrade")
	public String saveTrade() {
		Trade t= new Trade();
		t.setBuy((long) 12.0);
		t.setSell((long) 25.3);
		t.setPrice((long) 13);
		Integer id= impl.saveTrade(t);
		 return "Trade Save with Id"+id;
	}
	
	@GetMapping("/getTrade")
	public ArrayList<Trade> getTradeList() {
		 return (ArrayList<Trade>) impl.fetchTradeList();
	}
}
