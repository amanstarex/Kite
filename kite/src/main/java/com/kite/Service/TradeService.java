package com.kite.Service;

import java.util.List;

import com.kite.Entity.Trade;

public interface TradeService {
	// Save operation
    Integer saveTrade(Trade trade);
  
    // Read operation
    List<Trade> fetchTradeList();
  
    // Update operation
    void updateDepartment(Trade trade,Integer TradeId);
  
    // Delete operation
    void deleteTradeById(Integer TradeId);
}
