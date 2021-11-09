package actions;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutOverviewPageObjects;

public class CheckoutOverviewActions {
	
	static CheckoutOverviewPageObjects checkoutOverviewPageObjects;
	
	public CheckoutOverviewActions(WebDriver driver) {
		checkoutOverviewPageObjects = new CheckoutOverviewPageObjects(driver);
	}
	
	public void finalizarCheckout() {
		checkoutOverviewPageObjects.getButtonFinalizarCompra().click();
	}
	
	static void cancelarFinalizarCompra() {
		checkoutOverviewPageObjects.getButtonCancelarFinalizarCompra().click();
	}
}
