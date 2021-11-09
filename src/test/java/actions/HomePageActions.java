package actions;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObjects;

public class HomePageActions {
	
	static HomePageObjects homePageObjects;

	public HomePageActions (WebDriver driver) {
		homePageObjects = new HomePageObjects(driver);
	}
	
	public void login(String usuario, String senha) {
		homePageObjects.getInputUserName().sendKeys(usuario);
		homePageObjects.getInputPassWord().sendKeys(senha);
		homePageObjects.getButtonLogin().click();
	}	
}
