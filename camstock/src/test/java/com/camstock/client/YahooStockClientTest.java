package com.camstock.client;

import com.camstock.model.Stock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YahooStockClientTest {
	
	@Test
	public void testGetStockDetails() {
		YahooStockClient client = new YahooStockClient();
		Stock stock = client.getStockDetails("GOOG");
		
		assertEquals("GOOG", stock.getSymbol());
	}

}
