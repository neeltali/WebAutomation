package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.AutomationExLoginPom;
import com.PageObject.CartPom;
import com.PageObject.CategoryPom;
import com.PageObject.GetProductWithPrice;
import com.Utility.BaseClass;
import com.Utility.Library;

public class AutomationExercisePlacedOrder_001 extends BaseClass {
	@Test(priority = 0)
	public void Verify_PlacedOrder() {
		AutomationExLoginPom login = PageFactory.initElements(driver, AutomationExLoginPom.class);
		Library.custom_click(login.getTxt_LoginInBtn(), "Login Button");

		Library.custom_sendKeys(login.getTxt_EmailAddress(), excel.getStringData("Sheet1", 0, 0), "Email Address");

		Library.custom_sendKeys(login.getPasswordBtn(), excel.getStringData("Sheet1", 0, 1), "Password");

		Library.custom_click(login.getTxt_SubmitBtn(), "Submit Button");
		String title = driver.getTitle();
		System.out.println(title);

		// }

		// @Test(priority = 1)

		// public void VerifyProductWithPrice() {
		GetProductWithPrice obj = new GetProductWithPrice();
		obj.ProPriceList(driver);
		Library.sleep(3000);

		Library.scrollByPixel(driver, 0, 500, "BIBA");

		// }

		// @Test(priority = 2)

		// public void VerifyAddToCartProduct() {
		CategoryPom Category = PageFactory.initElements(driver, CategoryPom.class);
		CartPom Cart = PageFactory.initElements(driver, CartPom.class);

		Library.scrollByPixel(driver, 0, 400, "Women");
		Library.sleep(3000);
		Library.custom_click(Category.getTxt_WomenCategory(), "Women Category");
		Library.sleep(3000);
		Library.custom_click(Category.getTxt_Dress(), "Dress");
		Library.sleep(3000);
		Library.custom_click(Category.getTxt_WomenCategory(), "Women Category");
		Library.sleep(3000);
		Library.custom_click(Category.getTxt_Top(), "Tops");
		Library.sleep(3000);
		Library.scrollByPixel(driver, 0, 500, "Green Fancy Top");
		Library.sleep(3000);
		Library.custom_click(Category.getTxt_AddtoCardFancyGreenTop(), "Green Fancy Top");
		Library.sleep(3000);
		Library.custom_click(Category.getTxt_ContinueShoppingBtn(), "Continue Shoppping");
		Library.sleep(3000);
		Library.custom_click(Category.getTxt_AddToCardSummerWhiteTop(), "Summer White Top");
		Library.sleep(2000);
		Library.custom_click(Cart.getTxt_ViewCartBtn(), "View Cart Button");
		Library.sleep(2000);

		Library.custom_click(Cart.getTxt_ProceedToCheckOut(), "Proceed To Checkout");
		Library.scrollByPixel(driver, 0, 500, "Comment Box");
		Library.custom_sendKeys(Cart.getTxt_CommentBox(), excel.getStringData("Sheet1", 0, 2), "Comment Box");
		Library.sleep(2000);
		Library.custom_click(Cart.getTxt_PlaceOrderBtn(), "Place Order Button");

		// }

		// @Test(priority = 3)

		// public void VerifyPayment_OrderPlaced() {
		// CartPom Cart = PageFactory.initElements(driver, CartPom.class);
		Library.custom_sendKeys(Cart.getTxt_NameOnCart(), excel.getStringData("Sheet1", 0, 3), "Name On Cart");
		Library.custom_sendKeys(Cart.getTxt_CartNo(), excel.getStringData("Sheet1", 0, 4), "Card No");
		Library.custom_sendKeys(Cart.getTxt_CVC(), excel.getStringData("Sheet1", 0, 5), "CVC");
		Library.custom_sendKeys(Cart.getTxt_ExpiryMonth(), excel.getStringData("Sheet1", 0, 6), "Expiry Month");
		Library.custom_sendKeys(Cart.getTxt_ExpiryYear(), excel.getStringData("Sheet1", 0, 7), "Expiry Year");
		Library.custom_click(Cart.getPlacedAndConfirmbtn(), "Pay and Confirm Order ");

	}
}
