package com.camstock.file;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class FileDownloader {

	public void download(String urlString, String fileLocation) throws IOException {
		URL url = new URL(urlString);
		File file = new File(fileLocation);
		FileUtils.copyURLToFile(url, file);
	}

}
