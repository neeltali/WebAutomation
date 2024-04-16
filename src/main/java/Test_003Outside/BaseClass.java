package Test_003Outside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver();
		//driver= new FirefoxDriver();
		 driver = new ChromeDriver();
		 }
		else if (BrowserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
	}
@AfterMethod
public void TearDown() {
	driver.close();
	
}

}
