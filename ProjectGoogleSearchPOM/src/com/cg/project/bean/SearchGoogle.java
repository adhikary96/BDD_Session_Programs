package com.cg.project.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchGoogle {
	
	@FindBy(how=How.ID, id="lst-ib")
	private WebElement search;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")
	private WebElement submitBtn;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"rso\"]/div[1]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/h3/a")
	private WebElement actualMsg;

	public String getActualMsg() {
		return actualMsg.getText();
	}

	public void setSearch(String search) {
		this.search.sendKeys(search);
	}
	
	public void clickSearch() {
		submitBtn.click();
	}
	

}
