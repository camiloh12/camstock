package com.camstock.file;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;

public class CamFileReader {
	
	private CamFileReader(){}

	public static String read(String fileLocation) throws IOException {
		FileInputStream inputStream = new FileInputStream(fileLocation);
		String fileContent = IOUtils.toString(inputStream);
		return StringUtils.trim(fileContent);
	}

}
