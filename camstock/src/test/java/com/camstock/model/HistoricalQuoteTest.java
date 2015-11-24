package com.camstock.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.camstock.model.HistoricalQuote;

public class HistoricalQuoteTest {
	
	@Test
	public void testHistoricalQuote() {
		HistoricalQuote quote = new HistoricalQuote();
		quote.setDate(new Date());
		quote.setClose(BigDecimal.TEN);
		
		assertNotNull(quote.getDate());
		assertEquals(BigDecimal.TEN, quote.getClose());
	}

}
