package com.hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mongodb.MapReduceCommand.OutputType;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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

	@After(order = 1)
	public void quit() {
		driver.quit();
	}
	
	@After(order = 0)
	public void tearDown(Scenario sc) {
		
		if(sc.isFailed() == true) {
			
			String scname = sc.getName().replaceAll(" ", "-");
			byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
			sc.attach(sourcePath, "image/png", scname);
		}
		
	}
}
