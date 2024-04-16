package com.Utility;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Service.product;

public class Library {
	public static ExtentTest test;
	static Logger logger = LogManager.getLogger(Library.class);

	public static void custom_sendKeys(WebElement element, String value, String fieldname) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname + "Value Successfully Send ");
			logger.info("Value Successfully Send " + fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			logger.info(e.getMessage());
			element.sendKeys(value);

		}

	}

	public static void custom_click(WebElement element, String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, "Clicked Successfully " + fieldname);
			logger.info("Clicked Successfully " + fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			logger.info(e.getMessage());
			element.click();

		}
	}

	public static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void Custom_Explicitwait(WebDriver driver, int time, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void sort(List<product> list) {
		Collections.sort(list, new Comparator<product>() {
			public int compare(product p1, product p2) {
				return Integer.compare(p1.getPrice(), p2.getPrice());
			}
		});
	}

	public static void scrollByPixel(WebDriver driver, int x, int y, String fieldname) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
			test.log(Status.PASS, "Srolled Successfully " + fieldname);
			logger.info("Srolled Successfully " + fieldname);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			test.log(Status.FAIL, e.getMessage());
			logger.info(e.getMessage());
		}

	}
}
