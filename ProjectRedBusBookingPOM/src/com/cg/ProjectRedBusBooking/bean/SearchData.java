package com.cg.ProjectRedBusBooking.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchData {
	
	@FindBy(how=How.ID, id="src")
	private WebElement fromSrc;
	@FindBy(how=How.XPATH, xpath="//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	private WebElement fromXp;
	
	@FindBy(how=How.ID, id="dest")
	private WebElement toDest;
	@FindBy(how=How.XPATH, xpath="//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	private WebElement toXp;
	
	@FindBy(how=How.ID, id="onward_cal")
	private WebElement dateOn;
	@FindBy(how=How.XPATH, xpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[4]")
	private WebElement dateOnXp;
	
	@FindBy(how=How.ID, id="return_cal")
	private WebElement dateTo;
	@FindBy(how=How.XPATH, xpath="//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[6]/td[3]")
	private WebElement dateToXp;
	
	@FindBy(how=How.ID, id="search_btn")
	private WebElement button;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"fixer\"]/div/div[1]/div[1]/span[1]")
	private WebElement actualMsg;

	public String getActualMsg() {
		return actualMsg.getText();
	}

	public void setFromSrc(String fromSrc) {
		this.fromSrc.sendKeys(fromSrc);
	}

	public void setToDest(String toDest) {
		this.toDest.sendKeys(toDest);
	}

	public void setDateOn(String dateOn) {
		this.dateOn.sendKeys(dateOn);
	}

	public void setDateTo(String dateTo) {
		this.dateTo.sendKeys(dateTo);
	}
	
	public void clickSrc() {
		fromXp.click();
	}
	
	public void clickDest() {
		toXp.click();
	}
	
	public void clickDateOn() {
		dateOnXp.click();
	}
	
	public void clickDateTo() {
		dateToXp.click();
	}
	
	public void clickSearch() {
		button.click();
	}
	
}
