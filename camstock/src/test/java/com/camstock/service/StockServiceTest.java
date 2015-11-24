package com.camstock.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.camstock.model.Stock;

public class StockServiceTest {
	
	@Test
	public void testGetStockDetails() {
		StockService service = new StockService();
		Stock stock = service.getStockDetails("GOOG");
		
		System.out.println(stock);
		
		assertEquals("GOOG", stock.getSymbol());
	}
	
	@Test
	public void testGetStockDetailsOther() {
		StockService service = new StockService();
		Stock stock = service.getStockDetails("JPM");
		
		System.out.println(stock);
		
		assertEquals("GOOG", stock.getSymbol());
	}

}
