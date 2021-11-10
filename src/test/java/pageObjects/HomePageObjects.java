package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import utils.BrowserAndPageManager;

public class HomePageObjects extends BrowserAndPageManager{	
	
	@FindBy(id="user-name")
	@CacheLookup
	private WebElement inputUserName;	
	
	@FindBy(id="password")
	@CacheLookup
	private WebElement inputPassWord;
		
	@FindBy(id="login-button")
	@CacheLookup
	private WebElement buttonLogin;	

	
	public WebElement getInputUserName() {
		return inputUserName;
	}

	public WebElement getInputPassWord() {
		return inputPassWord;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}
}
