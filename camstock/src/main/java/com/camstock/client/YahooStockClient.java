package com.camstock.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;

import com.camstock.file.CamFileReader;
import com.camstock.file.FileDownloader;
import com.camstock.mapper.StockMapper;
import com.camstock.model.Stock;

public class YahooStockClient {
	
	private final static String BASE_URL = "http://download.finance.yahoo.com/d/quotes.csv";
	private final static String FILE_LOCATION = "/apps/camstock/files/quotes.csv";
	
	FileDownloader downloader = new FileDownloader();

	public Stock getStockDetails(String stockSymbol) {
		Stock stock = new Stock();
		URI uri;
		try {
			uri = new URIBuilder(BASE_URL).addParameter("s", "%40%5EDJI," + stockSymbol)
					.addParameter("f", "nsl1op")
					.addParameter("e", ".csv").build();
			downloader.download(uri.toString(), FILE_LOCATION);
			String stockDetails = CamFileReader.read(FILE_LOCATION);
			stock = StockMapper.map(stockDetails);
			
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stock;
	}

}
