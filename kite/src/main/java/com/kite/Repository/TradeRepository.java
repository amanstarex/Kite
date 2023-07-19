package com.kite.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kite.Entity.Trade;

public interface TradeRepository extends JpaRepository<Trade, Integer> {

}
