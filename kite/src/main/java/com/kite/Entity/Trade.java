package com.kite.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Trade {

	private Long buy;
	private Long sell;
	private Long price;
	
	
}
