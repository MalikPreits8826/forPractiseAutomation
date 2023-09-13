package StepDefination;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import helper.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageSteps  {
	
	
	LoginPage login=new LoginPage();
	
	
	@When("user enter with valid login details")
	public void user_enter_username_and_password() {
		login.user_enter_username_and_password();
	}

	@Then("validate successfull login")
	public void validate_successfull_login() {
		 assertTrue(login.validate_successfull_login());
	}

	




}
