package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationExLoginPom {

	@FindBy(how = How.XPATH, using = "//a[@href='/login']")
	private WebElement txt_LoginInBtn;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private WebElement txt_EmailAddress;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-password']")
	private WebElement PasswordBtn;

	@FindBy(how = How.XPATH, using = "//button[@data-qa='login-button']")
	private WebElement txt_SubmitBtn;

	public WebElement getTxt_LoginInBtn() {
		return txt_LoginInBtn;
	}

	public WebElement getTxt_EmailAddress() {
		return txt_EmailAddress;
	}

	public WebElement getPasswordBtn() {
		return PasswordBtn;
	}

	public WebElement getTxt_SubmitBtn() {
		return txt_SubmitBtn;
	}

}
