package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	// private Locators
	
	@FindBy(id = "login2")
	private WebElement linkForLogin;
	
	@FindBy(id = "loginusername")
	private WebElement userNameInput;

	@FindBy(id = "loginpassword")
	private WebElement passwordInput;
	
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
		return new HomePage();
	}
	
	
	public String VerifyAboutUsText() {
		
		return this.aboutText.getText();
		
	}
	
	
}
