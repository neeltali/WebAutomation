package com.PageObject;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class LoginPom {
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_emailID;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement LoginBtn;

	
	public WebElement getTxt_emailID() {
		return txt_emailID;
	}

	
	
	public WebElement getTxt_Password() {
		return txt_Password;
	}

	
	

	
	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	
}
