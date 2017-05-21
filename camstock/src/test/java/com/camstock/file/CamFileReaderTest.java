package com.camstock.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CamFileReaderTest {
	
	@Test
	public void testRead() throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("quotes.csv").getFile());
		String string = CamFileReader.read(file.getAbsolutePath());
		
		assertEquals("\"Google Inc.\",\"GOOG\",537.50,542.14,534.83", string);
	}
}