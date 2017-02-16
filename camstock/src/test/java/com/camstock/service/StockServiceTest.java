package com.camstock.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.camstock.model.Stock;

public class StockServiceTest {
	
	@Test
	public void testGetStockDetails() {
		StockService service = new StockService();
		Stock stock = service.getStockDetails("GOOG");
		
		assertEquals("GOOG", stock.getSymbol());
	}
}
