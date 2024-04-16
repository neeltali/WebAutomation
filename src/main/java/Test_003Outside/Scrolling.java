package Test_003Outside;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	@Test
	public void verify_001() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       Thread.sleep(3000);
       
       JavascriptExecutor js=(JavascriptExecutor) driver;
       //Scroll By Pixel
       js.executeScript("window.scrollBy(0,500)", "");
       Thread.sleep(3000);
       js.executeScript("window.scrollBy(0,-500)", "");
       Thread.sleep(3000);
       //Scroll By Element
       WebElement englsh= driver.findElement(By.xpath("//a[@title='Review our terms and policies.']"));
       js.executeScript("arguments[0].scrollIntoView()", englsh);
	}

}
