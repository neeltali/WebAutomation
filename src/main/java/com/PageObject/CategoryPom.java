package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CategoryPom {
	@FindBy(how = How.XPATH, using = "//a[@href='#Women']")
	private WebElement txt_WomenCategory;

	@FindBy(how = How.XPATH, using = "//a[@href='/category_products/1']")
	private WebElement txt_Dress;

	@FindBy(how = How.XPATH, using = "//a[@href='/category_products/2']")
	private WebElement txt_Top;

	@FindBy(how = How.XPATH, using = "(//a[@data-product-id='8'])[1]")
	private WebElement txt_AddtoCardFancyGreenTop;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success close-modal btn-block']")
	private WebElement txt_ContinueShoppingBtn;

	@FindBy(how = How.XPATH, using = "(//a[@data-product-id='6'])[1]")
	private WebElement txt_AddToCardSummerWhiteTop;

	@FindBy(how = How.XPATH, using = "//div[@id='ad_position_box']")
	private WebElement Btn_Skip;

	public WebElement getTxt_WomenCategory() {
		return txt_WomenCategory;
	}

	public WebElement getTxt_Dress() {
		return txt_Dress;
	}

	public WebElement getTxt_Top() {
		return txt_Top;
	}

	public WebElement getTxt_AddtoCardFancyGreenTop() {
		return txt_AddtoCardFancyGreenTop;
	}

	public WebElement getTxt_ContinueShoppingBtn() {
		return txt_ContinueShoppingBtn;
	}

	public WebElement getTxt_AddToCardSummerWhiteTop() {
		return txt_AddToCardSummerWhiteTop;
	}

	public WebElement getBtn_Skip() {
		return Btn_Skip;
	}

}
