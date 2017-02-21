/** 
 *  Utility class to download a webpage, display it, and save to file
 *  Based on code from UtkarshBhavsar (see link below) post in StackOverflow
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0 	Initial revision
 * @version 1.0.1	Output save file location
 * @version 1.0.2	Validate and Create directory if necessary, handle Exceptions otherwise
 * @dependencies None
 *  
 */
package com.alancowap.net.crawler;

/**
 * @author UtkarshBhavsar {@lin khttp://stackoverflow.com/questions/26454916/download-the-entire-webpage}
 *
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HttpDownloadUtility {
	private static final int BUFFER_SIZE = 4096;

	/**
	 * Downloads a file from a URL
	 * @param fileURL HTTP URL of the file to be downloaded
	 * @param saveDir path of the directory to save the file
	 * @throws IOException
	 */
	public static void downloadFile(String fileURL, String saveDir) throws IOException{
		try {
			Path path = Paths.get(saveDir);		
			Files.createDirectory(path);
			System.out.println("Successfully created directory " + path.toString());
		} catch (InvalidPathException e) {
			System.err.println("Sorry I can't convert that path into a useful directory, so I have to stop :(");
			e.printStackTrace();
			return;			
		} catch(FileAlreadyExistsException faee){
			System.out.println("Directory already exits, proceeding.");
		}
		
		URL url = new URL(fileURL); 
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection(); 
		int responseCode = httpConn.getResponseCode();

		// always check HTTP response code first
		if (responseCode == HttpURLConnection.HTTP_OK) {
			String fileName = "";
			String disposition = httpConn.getHeaderField("Content-Disposition");
			String contentType = httpConn.getContentType();
			int contentLength = httpConn.getContentLength();

			if (disposition != null) {
				// extracts file name from header field
				int index = disposition.indexOf("filename=");
				if (index > 0) {
					fileName = disposition.substring(index + 10,
							disposition.length() - 1);
				}
			} else {
				// extracts file name from URL
				fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1,
						fileURL.length());
			}

			System.out.println("Content-Type = " + contentType);
			System.out.println("Content-Disposition = " + disposition);
			System.out.println("Content-Length = " + contentLength);
			System.out.println("fileName = " + fileName);

			// opens input stream from the HTTP connection
			InputStream inputStream = httpConn.getInputStream();
			String saveFilePath = saveDir + File.separator + fileName;

			System.out.println("Save File Path: " + saveFilePath);
			// opens an output stream to save into file
			FileOutputStream outputStream = new FileOutputStream(saveFilePath);			

			int bytesRead = -1;
			byte[] buffer = new byte[BUFFER_SIZE];
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}

			outputStream.close();
			inputStream.close();

			System.out.printf("File downloaded to %s%s\n", saveDir, fileName);
		} else {
			System.out.println("No file to download. Server replied HTTP code: " + responseCode);
		}
		httpConn.disconnect();
	}
}

