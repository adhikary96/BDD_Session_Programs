package com.cg.ProjectLoginValidation.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBean {
	
	@FindBy(how=How.ID, id="username")
	private WebElement name;
	
	@FindBy(how=How.ID, id="password")
	private WebElement password;
	
	@FindBy(how=How.ID, id="login")
	private WebElement button;
	
	
	public void setName(String name) {
		this.name.sendKeys(name);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickLogin() {
		button.click();
	}

}
