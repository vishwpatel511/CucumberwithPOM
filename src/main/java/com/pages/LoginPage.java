package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driverfactory.driverfactory;

public class LoginPage {

	private WebDriver driver;
	
	// private Locators
	
	@FindBy(xpath = "//a[@id='login2']")
	private WebElement linkForLogin;
	
	@FindBy(id = "loginusername")
	private WebElement userNameInput;

	@FindBy(id = "loginpassword")
	private WebElement passwordInput;
	
	@FindBy(id = "nameofuser")
	private WebElement welcomeMsg;
	
	@FindBy(xpath = "(//div[@class = 'caption']/p)[2]")
	private WebElement address;
	

	@FindBy(xpath = "(//div[@class = 'caption']/p)[3]")
	private WebElement phone;

	@FindBy(xpath = "(//div[@class = 'caption']/p)[4]")
	private WebElement email;
	
	@FindBy(xpath = "//div[@class = 'list-group']/a[2]")
	private WebElement phones;
	
	@FindBy(xpath = "//div[@class = 'list-group']/a[3]")
	private WebElement laptops;
	
	@FindBy(xpath = "//div[@class = 'list-group']/a[4]")
	private WebElement monitors;
	
	
	
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;
	
	private List<WebElement> links;

	public List<WebElement> getSelects() {
	      links = driver.findElements(By.xpath("//div[@id='navbarExample']/ul/li/a"));
	      return links;
	    } 
	
	@FindBy(xpath = "(//div[@id='fotcont']/div/div/div/p[1])[1]")
	private WebElement aboutText;
	
	// Constructor
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	// Page action
	public String pageTitleVerify() {
		return driver.getTitle();
	}
	
	public void VerifyLoginLinkPresent() throws InterruptedException {
		
		Thread.sleep(2000);
		linkForLogin.click();
		Thread.sleep(1000);
		
	}
	
	public void VerifyUserNameTextBox(String uname) throws InterruptedException {
		
		userNameInput.sendKeys(uname);
		Thread.sleep(1000);
	
	}
	
	public void VerifyPasswordTextBox(String pass) throws InterruptedException {
		
		passwordInput.sendKeys(pass);
		Thread.sleep(1000);
	}
	
	public HomePage VerifyLoginFunctionality() {
		this.loginButton.click();
		return new HomePage(driver);
	}

	public String VerifyAddress() {
		
		return this.address.getText();
		
	}
	
	public String Verifyphone() {
		
		return this.phone.getText();
		
	}
	
	public String Verifyemail() {
		
		return this.email.getText();
		
	}
	
	
	public String VerifyHomePage() throws InterruptedException {
		
		Thread.sleep(2000);
		return this.welcomeMsg.getText();
		
	}
	
	public String VerifyAboutusText() {
		
		return this.aboutText.getText();
		
	}
	
	public String VerifyphonesText() {
		
		return this.phones.getText();
	}
	
	public String VerifylaptopsText() {
	
	return this.laptops.getText();
	
	}

	public String VerifymonitorsText() {
	
	return this.monitors.getText();
	
	}

	// This function created beacuse we need to login before any action is made on the homepage. 
	public HomePage performLogin(String un, String pass) {
		
		try {
			VerifyLoginLinkPresent();
			VerifyUserNameTextBox(un);
			VerifyPasswordTextBox(pass);
			VerifyLoginFunctionality();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Something is wrong with the login implementation: " + e.getMessage());
		}
		
		return new HomePage(driver);
	}
	
	
	
}
