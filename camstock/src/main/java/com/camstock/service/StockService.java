package com.camstock.service;

import com.camstock.client.YahooStockClient;
import com.camstock.model.Stock;

public class StockService {
	
	private YahooStockClient client = new YahooStockClient();

	public Stock getStockDetails(String stockSymbol) {
		return client.getStockDetails(stockSymbol);
	}

}
