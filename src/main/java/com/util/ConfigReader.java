package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	
	/*
	 * implementing the encapsulation concept to prevent the unauthorized sources to contamine the prop.
	 */
	public Properties getproperties() throws IOException {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream(".\\src\\test\\java\\config\\config.properties");
		prop.load(ip);
		
		return prop;
	}
	
	
}
