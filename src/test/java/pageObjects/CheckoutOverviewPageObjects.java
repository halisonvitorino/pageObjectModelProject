package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import utils.BrowserAndPageManager;

public class CheckoutOverviewPageObjects extends BrowserAndPageManager{

	@CacheLookup
	@FindBy(name = "finish")
	private WebElement buttonFinalizarCompra;

	@CacheLookup
	@FindBy(name = "cancel")
	private WebElement buttonCancelarFinalizarCompra;

	public WebElement getButtonFinalizarCompra() {
		return buttonFinalizarCompra;
	}

	public WebElement getButtonCancelarFinalizarCompra() {
		return buttonCancelarFinalizarCompra;
	}

}
