package pageActions;

import pageObjects.CheckoutInformationPageObjects;
import utils.BrowserAndPageManager;

public class CheckoutInformationActions extends BrowserAndPageManager{
	
	CheckoutInformationPageObjects checkOutInformationPageObjects = new CheckoutInformationPageObjects();
	
	public void preencherInformações(String firstName, String lastName, String postalCode ) {
		checkOutInformationPageObjects.getFirstNameField().sendKeys(firstName);
		checkOutInformationPageObjects.getLastNameField().sendKeys(lastName);
		checkOutInformationPageObjects.getPostalCodeField().sendKeys(postalCode);
	}
	
	public void continuarCompra() {
		checkOutInformationPageObjects.getButtonContinue().click();
	}
	
	public void cancelarPreencherInformacoes() {
		checkOutInformationPageObjects.getButtonCancel().click();
	}

}
