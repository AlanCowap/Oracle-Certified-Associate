/** 
 *  Application to download, save, and display contents of a web page.
 *  
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.net.crawler;

import java.io.IOException;

/**
 * @author Alan Cowap
 *
 */
public class WebCrawler {

	/**
	 * @param args command line parameters - not used.
	 */
	public static void main(String[] args) {
		String fileURL = "http://www.weather.ie";
		String saveDir = "c:\\code\\temp\\";
		try {
			HttpDownloadUtility.downloadFile(fileURL, saveDir);
		} catch (IOException e) {
			System.err.println("An unexpected error occured with Input Output");
			e.printStackTrace();
		}

	}

}
