package com.kite.TradeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {
	
	@GetMapping("/trade")
	public String getTrade() {
		return "this is my first trade";
	}
}
