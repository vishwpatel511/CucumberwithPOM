package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	private WebDriver driver;
	LoginPage loginpage;

	// constructor
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	/*
	 * try^1
	 * If doesnot work then remove that method and use the performlogin() in the LoginPage class. 
	 */
	
	// Locators
	
	@FindBy(xpath = "//a[@id='itemc'][1]")
	private WebElement phonesLink;
	
	
	@FindBy(xpath = "//a[@id='itemc'][2]")
	private WebElement laptopsLink;
	
	@FindBy(xpath = "//a[@id='itemc'][3]")
	private WebElement monitorsLink;
	
	
	private List<WebElement> phonenames;

	public List<WebElement> getPhoneNames() {
		phonenames = driver.findElements(By.xpath("//div[@class='card-block']/h4/a"));
	      return phonenames;
	    } 
	
	private List<WebElement> phoneprices;

	public List<WebElement> getPhoneprices() {
		phoneprices = driver.findElements(By.xpath("//div[@class='card-block']/h5"));
	      return phoneprices;
	    }
	
	private List<WebElement> phonedesc;

	public List<WebElement> getPhonedesc() {
			phonedesc = driver.findElements(By.xpath("//p[@id='article']"));
	      return phonedesc;
	    }
	
	
	
	// Action methods
	public void login(String userID, String password) {
		
		loginpage = new LoginPage(driver);
		loginpage.performLogin(userID, password);
	}

	public void VerifyPhoneLinkClick() throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(1000);
		phonesLink.click();
	
		
	}
	
	public void VerifylaptopsLinkClick() throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(1000);
		laptopsLink.click();
		driver.navigate().refresh();
	
		
	}
	
	public void VerifyMonitorsLinkClick() throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(1000);
		monitorsLink.click();
		driver.navigate().refresh();

		
	}
	
	
	
	public int VerifyNumofPhones(){
		
		return getPhoneNames().size();
	}
	
	public List<String> nameOfPhones() {
		
		List<String> namesofPhones = new ArrayList<String>();
		
		for(WebElement m : phonenames) {
			
			namesofPhones.add(m.getText());
			
		}
		
		return namesofPhones;
		
	}
	
	
	public List<String> priceOfPhones() throws InterruptedException {
		
		Thread.sleep(2000);
		List<String> pricesofPhones = new ArrayList<String>();
		
		for(WebElement m : phoneprices) {
			
			pricesofPhones.add(m.getAttribute("innerHTML"));
			
		}
		
		return pricesofPhones;
	}
	
	public List<String> descOfPhones() {
		
		List<String> descofPhones = new ArrayList<String>();
		
		for(WebElement m : phonedesc) {
			
			descofPhones.add(m.getAttribute("innerHTML"));
		}
		
		return descofPhones;
		
		}
	
	}
	

