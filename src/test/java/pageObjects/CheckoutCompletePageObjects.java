package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePageObjects {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(name="back-to-products")
	private WebElement backHomeButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBackHomeButton() {
		return backHomeButton;
	}

	public CheckoutCompletePageObjects(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
