package com.camstock.mapper;

import java.math.BigDecimal;

import com.camstock.model.Stock;

public class StockMapper {

	public static Stock map(String string) {
		Stock stock = new Stock();
		String[] stringArray = string.split(",");
		stock.setName(stringArray[0].substring(1, stringArray[0].length() - 1));
		stock.setSymbol(stringArray[1].substring(1, stringArray[1].length() - 1));
		stock.setLatestPrice(new BigDecimal(stringArray[2]));
		return stock;
	}

}
