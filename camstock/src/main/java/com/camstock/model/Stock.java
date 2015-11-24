package com.camstock.model;

import java.math.BigDecimal;
import java.util.List;

public class Stock {
	
	private String name;
	private String symbol;
	private BigDecimal latestPrice;
	private List<HistoricalQuote> historicalQuotes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Object getSymbol() {
		return symbol;
	}

	public BigDecimal getLatestPrice() {
		return  latestPrice;
	}

	public void setLatestPrice(BigDecimal latestPrice) {
		this. latestPrice = latestPrice;
	}

	public void setHistoricalQuotes(List<HistoricalQuote> historicalQuotes) {
		this.historicalQuotes = historicalQuotes;
	}

	public List<HistoricalQuote> getHistoricalQuotes() {
		return historicalQuotes;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", symbol=" + symbol + ", latestPrice="
				+ latestPrice + ", historicalQuotes=" + historicalQuotes + "]";
	}

}
