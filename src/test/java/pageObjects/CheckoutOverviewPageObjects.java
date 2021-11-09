package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPageObjects {

	private WebDriver driver;

	@CacheLookup
	@FindBy(name = "finish")
	private WebElement buttonFinalizarCompra;

	@CacheLookup
	@FindBy(name = "cancel")
	private WebElement buttonCancelarFinalizarCompra;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getButtonFinalizarCompra() {
		return buttonFinalizarCompra;
	}

	public WebElement getButtonCancelarFinalizarCompra() {
		return buttonCancelarFinalizarCompra;
	}

	public CheckoutOverviewPageObjects(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
