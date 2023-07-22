package com.kite.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.Entity.Trade;
import com.kite.Repository.TradeRepository;

@Service
public class TradeServiceImpl implements TradeService{
	
	@Autowired
	TradeRepository tradeRepository;
	
	@Override
	public Integer saveTrade(Trade trade) {
		Trade tradeobj=tradeRepository.save(trade);	
		return tradeobj.getTradeId();
	}

	@Override
	public List<Trade> fetchTradeList() {
		return tradeRepository.findAll();
	}

	@Override
	public void updateDepartment(Trade trade, Integer tradeId) {
		
		Trade tradeobj = tradeRepository.findById(tradeId).get();

    if (Objects.nonNull(tradeobj.getBuy())) {
    	tradeobj.setBuy(tradeobj.getBuy());
    }

    if (Objects.nonNull(tradeobj.getSell())) {
    	tradeobj.setSell(tradeobj.getSell());
    }
    
    if (Objects.nonNull(tradeobj.getPrice())) {
    	tradeobj.setPrice(tradeobj.getPrice());
    }
		tradeRepository.save(tradeobj);
	}

	@Override
	public void deleteTradeById(Integer tradeId) {
		tradeRepository.deleteById(tradeId);
	}
	
	

}
