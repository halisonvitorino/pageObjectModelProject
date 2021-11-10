package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAndPageManager {
	
	private static WebDriver driver;
	
	public BrowserAndPageManager() {
		PageFactory.initElements(driver, this);
	}	

	public void setupChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public void finalizarDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
