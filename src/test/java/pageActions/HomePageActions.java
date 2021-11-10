package pageActions;

import pageObjects.HomePageObjects;
import utils.BrowserAndPageManager;

public class HomePageActions extends BrowserAndPageManager{
	
	HomePageObjects homePageObjects = new HomePageObjects();

	public void login(String usuario, String senha) {
		homePageObjects.getInputUserName().sendKeys(usuario);
		homePageObjects.getInputPassWord().sendKeys(senha);
		homePageObjects.getButtonLogin().click();
	}	
}
