package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPom {
	@FindBy(how = How.XPATH, using = "(//a[@href='/view_cart'])[2]")
	private WebElement txt_ViewCartBtn;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default check_out']")
	private WebElement txt_ProceedToCheckOut;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success close-checkout-modal btn-block']")
	private WebElement txt_ContinueToCartBtn;

	@FindBy(how = How.XPATH, using = "//textarea[@name='message']")
	private WebElement txt_CommentBox;

	@FindBy(how = How.XPATH, using = "//a[text()='Place Order']")
	private WebElement txt_PlaceOrderBtn;

	@FindBy(how = How.XPATH, using = "//input[@name='name_on_card']")
	private WebElement txt_NameOnCart;

	@FindBy(how = How.XPATH, using = "//input[@name='card_number']")
	private WebElement txt_CartNo;

	@FindBy(how = How.XPATH, using = "//input[@name='cvc']")
	private WebElement txt_CVC;

	@FindBy(how = How.XPATH, using = "//input[@name='expiry_month']")
	private WebElement txt_ExpiryMonth;

	@FindBy(how = How.XPATH, using = "//input[@name='expiry_year']")
	private WebElement txt_ExpiryYear;

	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	private WebElement PlacedAndConfirmbtn;

	public WebElement getTxt_ViewCartBtn() {
		return txt_ViewCartBtn;
	}

	public WebElement getTxt_ProceedToCheckOut() {
		return txt_ProceedToCheckOut;
	}

	public WebElement getTxt_ContinueToCartBtn() {
		return txt_ContinueToCartBtn;
	}

	public WebElement getTxt_CommentBox() {
		return txt_CommentBox;
	}

	public WebElement getTxt_PlaceOrderBtn() {
		return txt_PlaceOrderBtn;
	}

	public WebElement getTxt_NameOnCart() {
		return txt_NameOnCart;
	}

	public WebElement getTxt_CartNo() {
		return txt_CartNo;
	}

	public WebElement getTxt_CVC() {
		return txt_CVC;
	}

	public WebElement getTxt_ExpiryMonth() {
		return txt_ExpiryMonth;
	}

	public WebElement getTxt_ExpiryYear() {
		return txt_ExpiryYear;
	}

	public WebElement getPlacedAndConfirmbtn() {
		return PlacedAndConfirmbtn;
	}

}
