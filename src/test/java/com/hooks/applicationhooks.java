package com.hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.util.ConfigReader;

import io.cucumber.java.Before;

public class applicationhooks {

	private com.driverfactory.driverfactory driverfactory;
	private WebDriver driver;
	private ConfigReader configReader;
	private Properties prop;
	
	@Before(order = 1)
	public void getProperty() throws IOException {
		
		configReader = new ConfigReader();
		prop = configReader.getproperties();
		
	}
	
	@Before(order = 2)
	public void launchBrowser() {
		
		String browserName = prop.getProperty("browser");
		driverfactory = new com.driverfactory.driverfactory();
		driverfactory.init_driver(browserName);
	}
	
	
}
