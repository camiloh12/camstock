package com.camstock.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.camstock.mapper.StockMapper;
import com.camstock.model.Stock;

public class StockMapperTest {
	
	@Test
	public void testMap() {
		Stock stock = StockMapper.map("\"Google Inc.\",\"GOOG\",537.50,542.14,534.83");
		System.out.println(stock);
		assertEquals("Google Inc.", stock.getName());
	}

}
