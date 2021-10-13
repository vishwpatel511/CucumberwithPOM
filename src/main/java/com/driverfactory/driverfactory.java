package com.driverfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverfactory {

	public WebDriver driver;
	
	// ThreadLocal class is used for the synchronization and to prevent the deadlock
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("Browser is: " + browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		
		else if(browser.equalsIgnoreCase("safari")){
			
			tlDriver.set(new SafariDriver());
		}
		else {
			System.out.println("Please enter the correct browser you want to initialize");
		}
	
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().fullscreen();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return getDriver();
	}
	
	/*
	 *  used to get the driver with ThreadLocal
	 */
	
	public static synchronized WebDriver getDriver() {
		
		return tlDriver.get();
	}
	
}
