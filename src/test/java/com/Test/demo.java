package com.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/#google_vignette");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// get list of all price element
		List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='productinfo text-center']//h2"));
		List<String> priceList = new ArrayList<String>();

		// get all price list and put in a list
		for (int i = 0; i < priceElements.size(); i++) {
			if (!(priceElements.get(i).getText().isEmpty())) {
				String text = priceElements.get(i).getText().replaceAll("[^0-9]", "");
				priceList.add(text);
			}

		}

		// print the priceList
		System.out.println(priceList);

		// sort the price list lower to higher
		Collections.sort(priceList, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
			}
		});

		// print sorted list
		System.out.println(priceList);

//		//print price
//		for (String price : priceList) {
//			System.out.println(price);
//		}

		driver.quit();

	}

}
