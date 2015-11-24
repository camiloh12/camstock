package com.camstock.file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class CamFileReader {
	
	protected CamFileReader(){
		/**
		 * Hide utility constructor
		 */
	}

	public static String read(String fileLocation) throws IOException {
		FileInputStream inputStream = new FileInputStream(fileLocation);
		String fileContent = IOUtils.toString(inputStream);
		return StringUtils.trim(fileContent);
	}

}
