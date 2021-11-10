package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import utils.BrowserAndPageManager;

public class SelectProductPageObject extends BrowserAndPageManager{

	@CacheLookup
	@FindBy(id="react-burger-menu-btn")
	private WebElement menuHamburguer;
	
	@CacheLookup
	@FindBy(css="div.shopping_cart_badge")
	private WebElement qtdNoCarrinho;
	
	@CacheLookup
	@FindBy(css="shopping_cart_link")
	private WebElement carrinho;
	
	@CacheLookup
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement productSauceLabsBackpackButton;
	
	public WebElement getMenuHamburguer() {
		return menuHamburguer;
	}

	public WebElement getQtdNoCarrinho() {
		return qtdNoCarrinho;
	}

	public WebElement getCarrinho() {
		return carrinho;
	}

	public WebElement getProductSauceLabsBackpackButton() {
		return productSauceLabsBackpackButton;
	}		
}
