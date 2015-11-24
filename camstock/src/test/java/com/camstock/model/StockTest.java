package com.camstock.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.camstock.model.HistoricalQuote;
import com.camstock.model.Stock;

public class StockTest {
	
	@Test
	public void testSymbol() {
		Stock stock = new Stock();
		stock.setSymbol("GOOG");
		
		assertEquals("GOOG", stock.getSymbol());
	}
	
	@Test
	public void testQuoteList() {
		Stock stock = new Stock();
		List<HistoricalQuote> quotes = new ArrayList<>();
		stock.setHistoricalQuotes(quotes);
		
		assertNotNull(stock.getHistoricalQuotes());
	}

}
