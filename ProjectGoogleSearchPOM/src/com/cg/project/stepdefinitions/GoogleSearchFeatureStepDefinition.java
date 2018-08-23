package com.cg.project.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.bean.SearchGoogle;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchFeatureStepDefinition {
	
	private WebDriver driver;
	private SearchGoogle google;
	
	public void setupSearch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	}
	
	@Given("^User is on Google home page$")
	public void user_is_on_Google_home_page() throws Throwable {
	    
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		google = new SearchGoogle();
		PageFactory.initElements(driver, google);
				
	}

	@When("^User searches for 'Agile Methodology' term$")
	public void user_searches_for_Agile_Methodology_term() throws Throwable {
	    
		google.setSearch("Agile Methodology");
		google.clickSearch();
		
	}

	@Then("^All page links should be displayed for 'Agile Methodology'$")
	public void all_page_links_should_be_displayed_for_Agile_Methodology() throws Throwable {
		
		String expectedTitle = "Agile software development - Wikipedia";
		assertEquals(expectedTitle,google.getActualMsg() );
		
	}
}
