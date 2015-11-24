package com.camstock.model;

import java.math.BigDecimal;
import java.util.Date;

public class HistoricalQuote {
	
	private Date date;
	private BigDecimal open;
	private BigDecimal close;

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}


}
