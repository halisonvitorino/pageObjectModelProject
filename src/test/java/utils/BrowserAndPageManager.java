package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAndPageManager {
	
	static WebDriver driver;
	
	public void setupChromeDriver() {
		WebDriverManager.chromedriver().setup();
	}

	public void iniciarDriver() {
		driver = new ChromeDriver();
	}
	
	public void finalizarDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
	
	public void acessarURL() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void maximizarJanela() {
		driver.manage().window().maximize();
	}
}
