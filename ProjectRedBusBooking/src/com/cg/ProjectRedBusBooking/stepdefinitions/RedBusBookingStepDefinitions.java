package com.cg.ProjectRedBusBooking.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusBookingStepDefinitions {
	
	WebDriver driver;
	
	@Given("^User is on the home page of RedBus$")
	public void user_is_on_the_home_page_of_RedBus() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	 
	}

	@When("^User enters valid source and destination locations$")
	public void user_enters_valid_source_and_destination_locations() throws Throwable {
		
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Hyderabad");
		Thread.sleep(2000);
		
		from =driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")); 
		from.click();
				
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		Thread.sleep(2000);
		
		to =driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")); 
		to.click();
		
		WebElement dateOn = driver.findElement(By.id("onward_cal"));
		dateOn.sendKeys("16-Aug-2018");
		Thread.sleep(2000);
		
		dateOn = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[4]"));
		dateOn.click();
		
		WebElement dateTo = driver.findElement(By.id("return_cal"));
		dateTo.sendKeys("22-Aug-2018");
		Thread.sleep(2000);
		
		dateTo = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[6]/td[3]"));
		dateTo.click();
		
		WebElement btn = driver.findElement(By.id("search_btn"));
		btn.click();
			  
	}

	@Then("^Browser displays the available buses$")
	public void browser_displays_the_available_buses() throws Throwable {
	   
		String actual = driver.getTitle();
		String expected = "Search Bus Tickets";
		
		assertEquals(expected, actual);
		
	}

}
