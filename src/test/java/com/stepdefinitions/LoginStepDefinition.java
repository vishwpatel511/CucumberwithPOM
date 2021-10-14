package com.stepdefinitions;

import com.driverfactory.driverfactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	private LoginPage loginpage = new LoginPage(driverfactory.getDriver());

@Given("User is on the log-in page")
public void user_is_on_the_log_in_page() {
    // Write code here that turns the phrase above into concrete actions
   
	driverfactory.getDriver().get("https://demoblaze.com/");
	
}

@Then("User gets the {string} as a title")
public void user_gets_the_as_a_title(String expectedTitle) {
	expectedTitle = "STORE";
	Assert.assertEquals(expectedTitle, loginpage.pageTitleVerify());
}

@When("User clicks on the login link")
public void user_clicks_on_the_login_link() throws InterruptedException {
 
	loginpage.VerifyLoginLinkPresent();
}

@When("a dialogue box is displayed.")
public void a_dialogue_box_is_displayed() {
    
	
}

@Then("User enters the {string} as an email ID")
public void user_enters_the_as_an_email_id_and_enters_the_as_a_password(String userID) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	loginpage.VerifyUserNameTextBox(userID);
}

@Then("enters the {string} as a password")
public void and_enters_the_as_a_password(String password) throws InterruptedException {
	
	loginpage.VerifyPasswordTextBox(password);
	
}

@Then("User clicks on the login Button")
public void User_clicks_on_the_login_Button() {
	
	loginpage.VerifyLoginFunctionality();
}


@Then("User is on the home Page")
public void user_is_on_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("after scrolling down, user can get the {string} as about us information")
public void after_scrolling_down_user_can_get_the_as_about_us_information(String string) {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(false, true);
	
	
}

@Then("user get the contact information such as {string} and {string} and {string} of the company.")
public void user_get_the_contact_information_such_as_and_and_of_the_company(String string, String string2, String string3) {
    // Write code here that turns the phrase above into concrete actions
  
}

@Then("user has options like {string} and {string} and {string} to select")
public void user_has_options_like_and_and_to_select(String string, String string2, String string3) {
    // Write code here that turns the phrase above into concrete actions

}
}
