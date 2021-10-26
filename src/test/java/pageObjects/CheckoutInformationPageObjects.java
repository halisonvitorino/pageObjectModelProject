package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPageObjects {
	
	private WebDriver driver;
	
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

	public WebDriver getDriver() {
		return driver;
	}

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

	public CheckoutInformationPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		}		
}
