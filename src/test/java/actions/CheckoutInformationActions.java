package actions;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutInformationPageObjects;

public class CheckoutInformationActions {
	
	static CheckoutInformationPageObjects checkOutInformationPageObjects;
	
	public CheckoutInformationActions(WebDriver driver) {
		checkOutInformationPageObjects = new CheckoutInformationPageObjects(driver);
	}
	
	public void preencherInformações(String firstName, String lastName, String postalCode ) {
		checkOutInformationPageObjects.getFirstNameField().sendKeys(firstName);
		checkOutInformationPageObjects.getLastNameField().sendKeys(lastName);
		checkOutInformationPageObjects.getPostalCodeField().sendKeys(postalCode);
	}
	
	static void continuarCompra() {
		checkOutInformationPageObjects.getButtonContinue().click();
	}
	
	static void cancelarPreencherInformacoes() {
		checkOutInformationPageObjects.getButtonCancel().click();
	}

}
