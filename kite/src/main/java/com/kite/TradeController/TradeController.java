package com.kite.TradeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kite.Entity.Trade;
import com.kite.Service.TradeServiceImpl;

@RestController
public class TradeController {
	
	@Autowired
	TradeServiceImpl impl;
	
	@GetMapping("/trade")
	public String saveTrade() {
		Trade t= new Trade();
		t.setBuy((long) 12.0);
		t.setSell((long) 25.3);
		t.setPrice((long) 13);
		Integer id= impl.saveTrade(t);
		 return "Trade Save with Id"+id;
	}
}
