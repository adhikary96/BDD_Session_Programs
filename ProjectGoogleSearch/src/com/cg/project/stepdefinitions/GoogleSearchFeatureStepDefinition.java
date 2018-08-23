package com.cg.project.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchFeatureStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is on Google home page$")
	public void user_is_on_Google_home_page() throws Throwable {
	    
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
				
	}

	@When("^User searches for 'Agile Methodology' term$")
	public void user_searches_for_Agile_Methodology_term() throws Throwable {
	    
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.sendKeys("Agile Methodology");
		search.submit();
		
	}

	@Then("^All page links should be displayed for 'Agile Methodology'$")
	public void all_page_links_should_be_displayed_for_Agile_Methodology() throws Throwable {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Agile Methodology - Google Search";
		
		assertEquals(actualTitle, expectedTitle);
		
	}
}
