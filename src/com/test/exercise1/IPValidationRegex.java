package com.test.exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate IP Address A.B.C.D
 * A,B,C and D may range from 0 to 255. Leading zeros are allowed.
 * Length of A,B,C, or D can't be greater than 3.
 * @author nglek
 *
 */
public class IPValidationRegex {
	// added comment by feature1...................
	////feature1 added more feature after feature2 merge to master
	////feature1 added more feature after feature2 merge to master...2nd commit
	public static final String IPADDRESS_REGEX_PATTERN = "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\." +
														"([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\." +
														"([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\." +
														"([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(IPADDRESS_REGEX_PATTERN);
		
		//Read the data file
		String currentPath = Paths.get("").toAbsolutePath().toString();
		BufferedReader bfReader = null;
		
		try {
			
			File dataFile = new File(currentPath + "/data/ipaddress.txt");
			bfReader = new BufferedReader(new FileReader(dataFile));
			String readLine = "";
	
			//Read each line from data file
			while((readLine = bfReader.readLine()) != null) {
				
				Matcher matcher = pattern.matcher(readLine);
				if (matcher.matches()) {
					System.out.println(readLine + " is a valid IP Address");
					
				} else {
					System.out.println(readLine + " is an INVALID IP Address");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				bfReader.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
