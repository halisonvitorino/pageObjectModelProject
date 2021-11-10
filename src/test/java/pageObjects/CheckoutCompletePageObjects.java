package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import utils.BrowserAndPageManager;

public class CheckoutCompletePageObjects extends BrowserAndPageManager{
		
	@CacheLookup
	@FindBy(name="back-to-products")
	private WebElement backHomeButton;

	public WebElement getBackHomeButton() {
		return backHomeButton;
	}

}
