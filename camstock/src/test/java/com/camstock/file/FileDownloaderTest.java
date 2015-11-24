package com.camstock.file;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.camstock.file.FileDownloader;

public class FileDownloaderTest {
	
	private String fileLocation = "/apps/camstock/files/quotes.csv";
	
	@Test
	public void testDownload() throws IOException {
		FileDownloader downloader = new FileDownloader();
		downloader.download(
				"http://download.finance.yahoo.com/d/quotes.csv?s=%40%5EDJI,GOOG&f=nsl1op&e=.csv", 
				fileLocation);
		
		File file = new File(fileLocation);
		assertTrue(file.exists());
		file.delete();
	}
	

}
