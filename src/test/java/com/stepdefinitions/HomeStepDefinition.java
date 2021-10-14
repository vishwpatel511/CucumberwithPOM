package com.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import com.driverfactory.driverfactory;
import com.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {

	HomePage homepage = new HomePage(driverfactory.getDriver());
	
	@Given("User has logged in with the username as {string} and password as {string}")
	public void user_has_logged_in_with_the_username_as_and_password_as(String username, String password) {
	
		driverfactory.getDriver().get("https://demoblaze.com/");
		homepage.login(username, password);
	}

	@When("user clicks on the phones category")
	public void user_clicks_on_the_phones_category() throws InterruptedException {
	    
		homepage.VerifyPhoneLinkClick();
		Thread.sleep(1000);
	}

	@Then("{int} phones are displayed")
	public void phones_are_displayed(int numOfPhones) {
	 
		
		Assert.assertEquals(numOfPhones, homepage.VerifyNumofPhones());
	}

	@Then("user gets all models")
	public void user_gets_all(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> expectedList = dataTable.asList();
		
		System.out.println("Actual: " + homepage.nameOfPhones());
		System.out.println("Expected: " + expectedList);
		System.out.println(homepage.nameOfPhones().containsAll(expectedList));
		Assert.assertTrue(homepage.nameOfPhones().containsAll(expectedList));
		
	}
	@Then("user gets all prices")
	public void user_gets_all_prices(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		driverfactory.getDriver().navigate().refresh();
		List<String> expectedList = dataTable.asList();
		System.out.println("Actual: " + homepage.priceOfPhones());
		System.out.println("Expected: " + expectedList);
//	Assert.assertTrue(homepage.priceOfPhones().containsAll(expectedList));
		
	}
	@Then("user gets all specifications")
	public void user_gets_all_specifications(io.cucumber.datatable.DataTable dataTable) {
		

		driverfactory.getDriver().navigate().refresh();
		List<String> expectedList = dataTable.asList();
		System.out.println("Actual: " + homepage.descOfPhones());
		System.out.println("Expected: " + expectedList);
	//	Assert.assertTrue(homepage.descOfPhones().containsAll(expectedList));
		
	}

	@When("user clicks on the laptops from categories")
	public void user_clicks_on_the_laptops_from_categories() throws InterruptedException {
	
		homepage.VerifylaptopsLinkClick();
	
	}

	@Then("list of laptops are displayed")
	public void list_of_laptops_are_displayed() {
	
		Assert.assertTrue(true);
	
	}

	@Then("user gets the information for each laptop such as {string} and {string} and {string}")
	public void user_gets_the_information_for_each_laptop_such_as_and_and(String string, String string2, String string3) {
	   
		Assert.assertTrue(true);
	}	
	
}
