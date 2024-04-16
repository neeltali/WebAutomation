package com.PageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PriceLablesPom {
	 // Other @FindBy annotations

    // Find elements matching multiple criteria using a single XPath expression
    @FindBy(how = How.XPATH, using = "//div[@class='example'] | //input[@type='text']")
    private List<WebElement> exampleElements;

    // Other methods

    // Method to return the list of elements matching the criteria
    public List<WebElement> getExampleElements() {
        return exampleElements;
    }

    public void printExampleElementTexts() {
        List<Double> prices = new ArrayList<>();

        for (WebElement element : exampleElements) {
            String priceText = element.getText().trim(); // Assuming the price is represented as text
            // Convert the price text to a numerical value and add it to the list
            double priceValue = Double.parseDouble(priceText.replace("$", "").replace(",", ""));
            prices.add(priceValue);
        }

        // Sort the prices in ascending order
        Collections.sort(prices);

        // Print the sorted prices
        System.out.println("Prices in low to high order:");
        for (double price : prices) {
            System.out.println("$" + price);
        }
    }

}
