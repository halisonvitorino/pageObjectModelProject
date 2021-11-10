package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import utils.BrowserAndPageManager;

public class CheckoutInformationPageObjects extends BrowserAndPageManager{
	
	@CacheLookup
	@FindBy(id="first-name")
	private WebElement firstNameField;
	
	@CacheLookup
	@FindBy(id="last-name")
	private WebElement lastNameField;
	
	@CacheLookup
	@FindBy(name="postalCode")
	private WebElement postalCodeField;
	
	@CacheLookup
	@FindBy(name="cancel")
	private WebElement buttonCancel;
	
	@CacheLookup
	@FindBy(id="continue")
	private WebElement buttonContinue;

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getPostalCodeField() {
		return postalCodeField;
	}

	public WebElement getButtonCancel() {
		return buttonCancel;
	}

	public WebElement getButtonContinue() {
		return buttonContinue;
	}

}
