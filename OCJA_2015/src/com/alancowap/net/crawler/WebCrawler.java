/** 
 *  Application to download, save, and display contents of a web page.
 *  
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0		Initial revision
 * @version 1.0.1   Add command-line parameter option
 * @dependencies None
 *  
 */
package com.alancowap.net.crawler;

import java.io.IOException;

public class WebCrawler {

	/**
	 * @param args command line parameters - not used.
	 */
	public static void main(String[] args) {
		String fileUrl, saveDir;
		if (2 == args.length){
			fileUrl = args[0]; //don't use a trailing / 
			saveDir = args[1];
		}else{
			System.err.println("Commandline Usage: WebCrawler <URL> <Directory> \ne.g. WebCrawler http://www.alancowap.com c:\\temp");
			fileUrl = "http://www.alancowap.com/2015/05/23/maths-puzzles-are-fun"; //don't use a trailing / 
			saveDir = "c:\\code\\temp\\";
		}
		System.out.printf("\nSaving to %s from URL %s\n", saveDir, fileUrl);

		try {
			HttpDownloadUtility.downloadFile(fileUrl, saveDir);
		} catch (IOException e) {
			System.err.println("An unexpected error occured with Input Output");
			e.printStackTrace();
		}

	}

}
