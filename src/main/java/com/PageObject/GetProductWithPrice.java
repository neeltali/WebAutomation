package com.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utility.Library;

import Service.product;

public class GetProductWithPrice {

	public void ProPriceList(WebDriver driver) {

		List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='productinfo text-center']//h2"));
		List<WebElement> productElements = driver.findElements(By.xpath("//div[@class='productinfo text-center']//p"));

		List<product> productList = new ArrayList<>();

		for (int i = 0; i < priceElements.size(); i++) {
			if (!priceElements.get(i).getText().isEmpty()) {
				String priceText = priceElements.get(i).getText().replaceAll("[^0-9]", "");
				int price = Integer.parseInt(priceText);
				String productName = productElements.get(i).getText();
				productList.add(new product(productName, price));
			}
		}

		Library.sort(productList);

		System.out.println("Sorted List: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		for (product product : productList) {
			System.out.println(product.getName() + " : " + product.getPrice());
		}

	}

}
