package com.cg.ProjectLoginValidation.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.ProjectLoginValidation.bean.LoginBean;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
	private WebDriver driver;
	private LoginBean login;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	}
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("D:\\LoginFile\\LoginPage.html");
		
		login = new LoginBean();
		PageFactory.initElements(driver, login);
	    
	}
	
	@When("^User clicks on Login without entering username$")
	public void user_clicks_on_Login_without_entering_username() throws Throwable {
		login.setName("");
		login.clickLogin();
	}

	
	@Then("^Browser must display 'Username cannot be blank'$")
	public void browser_must_display_Username_cannot_be_blank() throws Throwable {
		String expected="Username cannot be blank";
		//String actual=driver.switchTo().alert().getText();
		TargetLocator locator = driver.switchTo();
		Alert alert=locator.alert();
		String actual=alert.getText();
		
		assertEquals(expected, actual);
		//driver.close();
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
	}
	
	@When("^User clicks on Login without entering password$")
	public void user_clicks_on_Login_without_entering_password() throws Throwable {
		
		login.setName("sgdtgd");
		login.setPassword("");
		login.clickLogin();
	    
	}
	
	@Then("^Browser must display 'Password cannot be blank'$")
	public void browser_must_display_Password_cannot_be_blank() throws Throwable {
		String expected="Password cannot be blank";
		//String actual=driver.switchTo().alert().getText();
		TargetLocator locator = driver.switchTo();
		Alert alert=locator.alert();
		String actual=alert.getText();
		
		assertEquals(expected, actual);
		//driver.close();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	   login.setName("admin");
	   login.setPassword("admin");
	   login.clickLogin();
	}

	@Then("^Browser must display 'Login Successful'$")
	public void browser_must_display_Login_Successful() throws Throwable {
		String expected="Login Successful";
		//String actual=driver.switchTo().alert().getText();
		TargetLocator locator = driver.switchTo();
		Alert alert=locator.alert();
		String actual=alert.getText();
		
		assertEquals(expected, actual);
		//driver.close();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	  
	}

	@When("^User enters invalid username and password$")
	public void user_enters_invalid_username_and_password() throws Throwable {
		 login.setName("deepraj");
		 login.setPassword("deepraj");
		 login.clickLogin();
	}

	@Then("^Browser must display 'Login Failed!!!'$")
	public void browser_must_display_Login_Failed() throws Throwable {
		String expected="Login Failed";
		//String actual=driver.switchTo().alert().getText();
		TargetLocator locator = driver.switchTo();
		Alert alert=locator.alert();
		String actual=alert.getText();
		
		assertEquals(expected, actual);
		//driver.close();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}

}
