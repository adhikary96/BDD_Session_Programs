package com.cg.ProjectRedBusBooking.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.ProjectRedBusBooking.bean.SearchData;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusBookingStepDefinitions {
	
	private WebDriver driver;
	private SearchData search;
	
	@Before(order=1)
	public void setUpSearchBus() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	}
	
	@Given("^User is on the home page of RedBus$")
	public void user_is_on_the_home_page_of_RedBus() throws Throwable {
		
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		search = new SearchData();
		PageFactory.initElements(driver, search);
	 
	}

	@When("^User enters valid source and destination locations$")
	public void user_enters_valid_source_and_destination_locations() throws Throwable {
		
		search.setFromSrc("Hyderabad");
		Thread.sleep(2000);
		search.clickSrc();
		
		search.setToDest("Bangalore");
		Thread.sleep(2000);
		search.clickDest();
		
		
		search.setDateOn("16-Aug-2018");
		Thread.sleep(2000);
		search.clickDateOn();
		
		search.setDateTo("22-Aug-2018");
		Thread.sleep(2000);
		search.clickDateTo();
		
		search.clickSearch();
			  
	}

	@Then("^Browser displays the available buses$")
	public void browser_displays_the_available_buses() throws Throwable {
	   
		String expected = "ONWARD JOURNEY";
		
		assertEquals(expected, search.getActualMsg());
		
	}

}
