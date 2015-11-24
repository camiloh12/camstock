package com.camstock.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.camstock.model.Stock;

public class YahooStockClientTest {
	
	@Test
	public void testGetStockDetails() {
		YahooStockClient client = new YahooStockClient();
		Stock stock = client.getStockDetails("GOOG");
		
		System.out.println(stock);
		
		assertEquals("GOOG", stock.getSymbol());
	}

}
