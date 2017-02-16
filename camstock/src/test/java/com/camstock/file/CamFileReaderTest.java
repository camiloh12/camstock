package com.camstock.file;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.camstock.file.CamFileReader;

public class CamFileReaderTest {
	
	private String fileLocation = "/apps/git/camstock/camstock/src/test/resources/quotes.csv";
	
	@Test
	public void testRead() throws IOException {
		String string = CamFileReader.read(fileLocation);
		
		assertEquals("\"Google Inc.\",\"GOOG\",537.50,542.14,534.83", string);
	}

}
