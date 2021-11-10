package actions;

import pageObjects.CheckoutOverviewPageObjects;
import utils.BrowserAndPageManager;

public class CheckoutOverviewActions extends BrowserAndPageManager{
	
	CheckoutOverviewPageObjects checkoutOverviewPageObjects = new CheckoutOverviewPageObjects();
	
	public void finalizarCheckout() {
		checkoutOverviewPageObjects.getButtonFinalizarCompra().click();
	}
	
	public void cancelarFinalizarCompra() {
		checkoutOverviewPageObjects.getButtonCancelarFinalizarCompra().click();
	}
}
